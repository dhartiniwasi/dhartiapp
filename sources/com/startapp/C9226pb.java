package com.startapp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.startapp.pb */
/* compiled from: Sta */
public @interface C9226pb {
    boolean complex() default false;

    Class innerValue() default String.class;

    Class key() default String.class;

    String name() default "";

    Class<? extends C9248qb> parser() default C9248qb.class;

    Class type() default Object.class;

    Class value() default String.class;
}
