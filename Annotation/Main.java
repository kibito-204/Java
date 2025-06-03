package Annotation;

public class Main {
    public static void main(String[] args) {
        SampleClass sample = new SampleClass("TestClass");
        sample.sayHello("John");

        System.out.println("\nProcessing Annotations:");
        AnnotationProcessor.process(sample);
    }
}
