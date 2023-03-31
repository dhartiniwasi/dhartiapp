package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.yc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7270yc implements C7254xc {

    /* renamed from: a */
    public static final C6908c7 f32215a;

    /* renamed from: b */
    public static final C6908c7 f32216b;

    /* renamed from: c */
    public static final C6908c7 f32217c;

    static {
        C7264y6 a = new C7264y6(C7136q6.m40654a("com.google.android.gms.measurement")).mo24016b().mo24015a();
        f32215a = a.mo24020f("measurement.collection.event_safelist", true);
        f32216b = a.mo24020f("measurement.service.store_null_safelist", true);
        f32217c = a.mo24020f("measurement.service.store_safelist", true);
    }

    /* renamed from: d */
    public final boolean mo24001d() {
        return ((Boolean) f32216b.mo23250b()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo24002e() {
        return ((Boolean) f32217c.mo23250b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
