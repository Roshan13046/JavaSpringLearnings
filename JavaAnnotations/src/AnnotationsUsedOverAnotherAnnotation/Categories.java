package AnnotationsUsedOverAnotherAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Categories {
    //Mandatory to add this
    Category [] value(); //Note the value method name should be declared it's mandatory to add with the same name as "value"
}
