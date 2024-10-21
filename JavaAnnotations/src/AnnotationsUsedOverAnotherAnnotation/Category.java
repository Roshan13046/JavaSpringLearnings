package AnnotationsUsedOverAnotherAnnotation;

import java.lang.annotation.Repeatable;

@Repeatable(Categories.class)
public @interface Category {
    String name(); //not mandatory to add it can be empty field here
}
