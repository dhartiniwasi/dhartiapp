package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.xd */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7255xd implements C7239wd {

    /* renamed from: a */
    public static final C6908c7 f32187a;

    /* renamed from: b */
    public static final C6908c7 f32188b;

    /* renamed from: c */
    public static final C6908c7 f32189c;

    /* renamed from: d */
    public static final C6908c7 f32190d;

    /* renamed from: e */
    public static final C6908c7 f32191e;

    static {
        C7264y6 a = new C7264y6(C7136q6.m40654a("com.google.android.gms.measurement")).mo24015a();
        f32187a = a.mo24020f("measurement.test.boolean_flag", false);
        f32188b = a.mo24017c("measurement.test.double_flag", -3.0d);
        f32189c = a.mo24018d("measurement.test.int_flag", -2);
        f32190d = a.mo24018d("measurement.test.long_flag", -1);
        f32191e = a.mo24019e("measurement.test.string_flag", "---");
    }

    /* renamed from: a */
    public final boolean mo23972a() {
        return ((Boolean) f32187a.mo23250b()).booleanValue();
    }

    /* renamed from: b */
    public final String mo23973b() {
        return (String) f32191e.mo23250b();
    }

    /* renamed from: d */
    public final long mo23974d() {
        return ((Long) f32189c.mo23250b()).longValue();
    }

    /* renamed from: e */
    public final long mo23975e() {
        return ((Long) f32190d.mo23250b()).longValue();
    }

    public final double zza() {
        return ((Double) f32188b.mo23250b()).doubleValue();
    }
}
