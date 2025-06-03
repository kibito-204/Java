package Annotation;

import Annotation.MyCustomAnnotation;
import Annotation.MyParamAnnotation;
import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void process(Object obj) {
        Class<?> clazz = obj.getClass();
        if (clazz.isAnnotationPresent(MyCustomAnnotation.class)) {
            MyCustomAnnotation classAnnotation = clazz.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Class Annotation - Description: " + classAnnotation.description() +
                    ", Priority: " + classAnnotation.priority());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
                MyCustomAnnotation methodAnnotation = method.getAnnotation(MyCustomAnnotation.class);
                System.out.println("Method: " + method.getName());
                System.out.println("  Description: " + methodAnnotation.description() +
                        ", Priority: " + methodAnnotation.priority());
            }

            java.lang.annotation.Annotation[][] paramAnnotations = method.getParameterAnnotations();
            for (int i = 0; i < paramAnnotations.length; i++) {
                for (java.lang.annotation.Annotation paramAnnotation : paramAnnotations[i]) {
                    if (paramAnnotation instanceof MyParamAnnotation) {
                        MyParamAnnotation myParam = (MyParamAnnotation) paramAnnotation;
                        System.out.println("  Parameter " + i + " Annotation: " + myParam.value());
                    }
                }
            }
        }
    }
}