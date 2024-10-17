package AnnotationsUsedOverAnotherAnnotation;

import java.lang.annotation.*;

//using @Inheritance annotation even child class can have the access to the Annotation used in the parent class
//@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotationWithInheritance {
}
