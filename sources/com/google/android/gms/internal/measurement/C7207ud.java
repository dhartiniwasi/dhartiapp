package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ud */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7207ud implements C7191td {

    /* renamed from: a */
    public static final C6908c7 f32136a;

    /* renamed from: b */
    public static final C6908c7 f32137b;

    /* renamed from: c */
    public static final C6908c7 f32138c;

    /* renamed from: d */
    public static final C6908c7 f32139d;

    static {
        C7264y6 a = new C7264y6(C7136q6.m40654a("com.google.android.gms.measurement")).mo24015a();
        f32136a = a.mo24018d("measurement.id.lifecycle.app_in_background_parameter", 0);
        f32137b = a.mo24020f("measurement.lifecycle.app_backgrounded_tracking", true);
        f32138c = a.mo24020f("measurement.lifecycle.app_in_background_parameter", false);
        f32139d = a.mo24018d("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean zza() {
        return ((Boolean) f32138c.mo23250b()).booleanValue();
    }
}
