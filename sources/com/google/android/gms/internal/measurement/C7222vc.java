package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.vc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7222vc implements C7206uc {

    /* renamed from: a */
    public static final C6908c7 f32153a;

    /* renamed from: b */
    public static final C6908c7 f32154b;

    /* renamed from: c */
    public static final C6908c7 f32155c;

    /* renamed from: d */
    public static final C6908c7 f32156d;

    static {
        C7264y6 a = new C7264y6(C7136q6.m40654a("com.google.android.gms.measurement")).mo24015a();
        f32153a = a.mo24020f("measurement.client.consent_state_v1", true);
        f32154b = a.mo24020f("measurement.client.3p_consent_state_v1", true);
        f32155c = a.mo24020f("measurement.service.consent_state_v1_W36", true);
        f32156d = a.mo24018d("measurement.service.storage_consent_support_version", 203600);
    }

    public final long zza() {
        return ((Long) f32156d.mo23250b()).longValue();
    }
}
