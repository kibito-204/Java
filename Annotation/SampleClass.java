package Annotation;
import Annotation.MyCustomAnnotation;
import Annotation.MyParamAnnotation;
public class SampleClass {
    private String name;

    public SampleClass(@MyParamAnnotation(value = "Class Name") String name) {
        this.name = name;
    }

    @MyCustomAnnotation(description = "This method prints a greeting", priority = 2)
    public void sayHello(@MyParamAnnotation(value = "User Name") String user) {
        System.out.println("Hello, " + user + "! From " + name);
    }

    public void noAnnotationMethod() {
        System.out.println("This method has no annotation.");
    }
}
