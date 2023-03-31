package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.od */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7111od implements C7095nd {

    /* renamed from: a */
    public static final C6908c7 f31931a;

    /* renamed from: b */
    public static final C6908c7 f31932b;

    /* renamed from: c */
    public static final C6908c7 f31933c;

    /* renamed from: d */
    public static final C6908c7 f31934d;

    /* renamed from: e */
    public static final C6908c7 f31935e;

    static {
        C7264y6 a = new C7264y6(C7136q6.m40654a("com.google.android.gms.measurement")).mo24016b().mo24015a();
        f31931a = a.mo24020f("measurement.client.global_params", true);
        f31932b = a.mo24020f("measurement.service.global_params_in_payload", true);
        f31933c = a.mo24020f("measurement.service.clear_global_params_on_uninstall", true);
        f31934d = a.mo24020f("measurement.service.global_params", true);
        f31935e = a.mo24018d("measurement.id.service.global_params", 0);
    }

    /* renamed from: d */
    public final boolean mo23701d() {
        return ((Boolean) f31933c.mo23250b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
