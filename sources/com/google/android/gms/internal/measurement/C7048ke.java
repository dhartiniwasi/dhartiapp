package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ke */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7048ke implements C7032je {

    /* renamed from: a */
    public static final C6908c7 f31796a;

    /* renamed from: b */
    public static final C6908c7 f31797b;

    /* renamed from: c */
    public static final C6908c7 f31798c;

    /* renamed from: d */
    public static final C6908c7 f31799d;

    /* renamed from: e */
    public static final C6908c7 f31800e;

    static {
        C7264y6 a = new C7264y6(C7136q6.m40654a("com.google.android.gms.measurement")).mo24016b().mo24015a();
        f31796a = a.mo24020f("measurement.collection.enable_session_stitching_token.client.dev", true);
        f31797b = a.mo24020f("measurement.session_stitching_token_enabled", false);
        f31798c = a.mo24020f("measurement.collection.enable_session_stitching_token.service", false);
        f31799d = a.mo24020f("measurement.collection.enable_session_stitching_token.service_new", true);
        f31800e = a.mo24018d("measurement.id.collection.enable_session_stitching_token.client.dev", 0);
    }

    /* renamed from: a */
    public final boolean mo23595a() {
        return ((Boolean) f31799d.mo23250b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo23596b() {
        return ((Boolean) f31798c.mo23250b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo23597d() {
        return ((Boolean) f31796a.mo23250b()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo23598e() {
        return ((Boolean) f31797b.mo23250b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
