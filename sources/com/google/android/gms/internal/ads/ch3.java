package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ch3 {

    /* renamed from: a */
    private final ms3 f7752a;

    private ch3(ms3 ms3) {
        this.f7752a = ms3;
    }

    /* renamed from: e */
    public static ch3 m10939e(String str, byte[] bArr, int i) {
        ls3 G = ms3.m16683G();
        G.mo12077p(str);
        G.mo12078r(jw3.m15086K(bArr));
        int i2 = i - 1;
        G.mo12079s(i2 != 0 ? i2 != 1 ? 5 : 4 : 3);
        return new ch3((ms3) G.mo13423m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ms3 mo9167a() {
        return this.f7752a;
    }

    /* renamed from: b */
    public final String mo9168b() {
        return this.f7752a.mo12433K();
    }

    /* renamed from: c */
    public final byte[] mo9169c() {
        return this.f7752a.mo12432J().mo11531j();
    }

    /* renamed from: d */
    public final int mo9170d() {
        int N = this.f7752a.mo12434N() - 2;
        int i = 1;
        if (N != 1) {
            i = 2;
            if (N != 2) {
                i = 3;
                if (N != 3) {
                    if (N == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
