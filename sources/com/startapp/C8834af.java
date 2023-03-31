package com.startapp;

/* renamed from: com.startapp.af */
/* compiled from: Sta */
public class C8834af implements C9248qb<Long> {
    public Object parse(Class cls, Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(C9605vb.m50478e((String) obj));
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }
}
