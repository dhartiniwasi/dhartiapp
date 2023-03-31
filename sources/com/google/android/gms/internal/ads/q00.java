package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class q00 {

    /* renamed from: a */
    private final String f16106a;

    /* renamed from: b */
    private final Object f16107b;

    /* renamed from: c */
    private final int f16108c;

    protected q00(String str, Object obj, int i) {
        this.f16106a = str;
        this.f16107b = obj;
        this.f16108c = i;
    }

    /* renamed from: a */
    public static q00 m18990a(String str, double d) {
        return new q00(str, Double.valueOf(d), 3);
    }

    /* renamed from: b */
    public static q00 m18991b(String str, long j) {
        return new q00(str, Long.valueOf(j), 2);
    }

    /* renamed from: c */
    public static q00 m18992c(String str, String str2) {
        return new q00(str, str2, 4);
    }

    /* renamed from: d */
    public static q00 m18993d(String str, boolean z) {
        return new q00(str, Boolean.valueOf(z), 1);
    }

    /* renamed from: e */
    public final Object mo13438e() {
        u10 a = w10.m22532a();
        if (a == null) {
            if (w10.m22533b() != null) {
                w10.m22533b().zza();
            }
            return this.f16107b;
        }
        int i = this.f16108c - 1;
        if (i == 0) {
            return a.mo11543d(this.f16106a, ((Boolean) this.f16107b).booleanValue());
        }
        if (i == 1) {
            return a.mo11542c(this.f16106a, ((Long) this.f16107b).longValue());
        }
        if (i != 2) {
            return a.mo11540a(this.f16106a, (String) this.f16107b);
        }
        return a.mo11541b(this.f16106a, ((Double) this.f16107b).doubleValue());
    }
}
