package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.rd */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7159rd implements C7143qd {

    /* renamed from: a */
    public static final C6908c7 f32034a;

    /* renamed from: b */
    public static final C6908c7 f32035b;

    /* renamed from: c */
    public static final C6908c7 f32036c;

    /* renamed from: d */
    public static final C6908c7 f32037d;

    static {
        C7264y6 a = new C7264y6(C7136q6.m40654a("com.google.android.gms.measurement")).mo24015a();
        f32034a = a.mo24020f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f32035b = a.mo24020f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f32036c = a.mo24020f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f32037d = a.mo24018d("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean zza() {
        return ((Boolean) f32036c.mo23250b()).booleanValue();
    }
}
