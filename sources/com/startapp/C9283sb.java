package com.startapp;

/* renamed from: com.startapp.sb */
/* compiled from: Sta */
public class C9283sb implements C9248qb<Double> {
    public Object parse(Class cls, Object obj) {
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        double d = 0.0d;
        if (obj instanceof Boolean) {
            if (Boolean.TRUE.equals(obj)) {
                d = 1.0d;
            }
            return Double.valueOf(d);
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (Throwable unused) {
            }
        }
        return Double.valueOf(0.0d);
    }
}
