package AnnotationsUsedOverAnotherAnnotation;

public @interface CustomAnnotation {
    String name() default "Testing";
    int type() default  0;
}
