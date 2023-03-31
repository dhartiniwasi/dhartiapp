package com.startapp;

import com.startapp.networkTest.enums.FileTypes;
import com.startapp.networkTest.results.BaseResult;

/* renamed from: com.startapp.r5 */
/* compiled from: Sta */
public class C9258r5 {
    /* renamed from: a */
    public static String m49219a(Object obj) {
        return m49220a(obj, obj.getClass());
    }

    /* renamed from: a */
    public static String m49220a(Object obj, Class<?> cls) {
        return String.valueOf(C9065k5.m48756b(obj));
    }

    /* renamed from: a */
    public static String m49218a(FileTypes fileTypes, BaseResult baseResult) {
        return m49219a(baseResult);
    }

    /* renamed from: a */
    public static <T> T m49216a(String str, Class<T> cls) {
        return m49217a(str, cls, false);
    }

    /* renamed from: a */
    public static <T> T m49217a(String str, Class<T> cls, boolean z) {
        return C9065k5.m48755a(str, cls);
    }
}
