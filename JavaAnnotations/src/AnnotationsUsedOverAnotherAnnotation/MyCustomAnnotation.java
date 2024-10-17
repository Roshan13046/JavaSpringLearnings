package AnnotationsUsedOverAnotherAnnotation;

import java.lang.annotation.*;

//@Documented annotation adds the annotation details in the java docs else it's details won't be added in java docs
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotation {
}
