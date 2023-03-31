package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3462k6 {

    /* renamed from: a */
    private final C3607oj f22287a;

    private C3462k6(C3607oj ojVar) {
        this.f22287a = ojVar;
    }

    /* renamed from: e */
    public static C3462k6 m25983e(String str, byte[] bArr, int i) {
        C3574nj z = C3607oj.m26382z();
        z.mo16463k(str);
        z.mo16464l(C3325g1.m25613u(bArr));
        int i2 = i - 1;
        z.mo16462j(i2 != 0 ? i2 != 1 ? i2 != 2 ? C3674qk.CRUNCHY : C3674qk.RAW : C3674qk.LEGACY : C3674qk.TINK);
        return new C3462k6((C3607oj) z.mo16062e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3607oj mo16253a() {
        return this.f22287a;
    }

    /* renamed from: b */
    public final String mo16254b() {
        return this.f22287a.mo16512E();
    }

    /* renamed from: c */
    public final byte[] mo16255c() {
        return this.f22287a.mo16511D().mo16051A();
    }

    /* renamed from: d */
    public final int mo16256d() {
        C3674qk C = this.f22287a.mo16510C();
        C3674qk qkVar = C3674qk.UNKNOWN_PREFIX;
        int ordinal = C.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
