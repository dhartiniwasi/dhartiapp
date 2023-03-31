package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ld */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7063ld implements C7047kd {

    /* renamed from: a */
    public static final C6908c7 f31811a;

    /* renamed from: b */
    public static final C6908c7 f31812b;

    /* renamed from: c */
    public static final C6908c7 f31813c;

    static {
        C7264y6 a = new C7264y6(C7136q6.m40654a("com.google.android.gms.measurement")).mo24015a();
        f31811a = a.mo24020f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f31812b = a.mo24020f("measurement.client.sessions.check_on_startup", true);
        f31813c = a.mo24020f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    /* renamed from: d */
    public final boolean mo23619d() {
        return ((Boolean) f31811a.mo23250b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
