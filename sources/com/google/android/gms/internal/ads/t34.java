package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class t34 {
    /* renamed from: b */
    public static t34 m20792b(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new n34(cls.getSimpleName());
        }
        return new p34(cls.getSimpleName());
    }

    /* renamed from: a */
    public abstract void mo12523a(String str);
}
