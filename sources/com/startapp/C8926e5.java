package com.startapp;

import android.app.Activity;
import java.util.Map;

/* renamed from: com.startapp.e5 */
/* compiled from: Sta */
public class C8926e5 implements C9248qb<int[][]> {
    public Object parse(Class cls, Object obj) {
        if (obj instanceof Number) {
            return new int[][]{new int[]{((Number) obj).intValue(), Integer.MAX_VALUE}};
        }
        if (obj instanceof String) {
            String str = (String) obj;
            Map<Activity, Integer> map = C9605vb.f39316a;
            if (str != null) {
                try {
                    return C9605vb.m50481f(str);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }
}
