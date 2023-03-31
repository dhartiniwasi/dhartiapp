package com.startapp;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* renamed from: com.startapp.l5 */
/* compiled from: Sta */
public class C9112l5 {
    /* renamed from: a */
    public static String m48943a(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations != null && declaredAnnotations.length > 0) {
            Annotation annotation = field.getDeclaredAnnotations()[0];
            if (annotation.annotationType().equals(C9226pb.class)) {
                C9226pb pbVar = (C9226pb) annotation;
                if (!"".equals(pbVar.name())) {
                    return pbVar.name();
                }
            }
        }
        return field.getName();
    }

    /* renamed from: b */
    public static boolean m48944b(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return false;
        }
        Annotation annotation = field.getDeclaredAnnotations()[0];
        if (!annotation.annotationType().equals(C9226pb.class)) {
            return false;
        }
        return ((C9226pb) annotation).complex();
    }
}
