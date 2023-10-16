package org.startsteps.week7.LibraryManagement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
    public @interface ValidateUser {
        int minimumAge() default 0;
        int maximumBooks() default Integer.MAX_VALUE;
    }


