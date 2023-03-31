package com.google.android.gms.internal.p026firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3430j7 {

    /* renamed from: a */
    public static final C3607oj f22216a = m25890b(16);

    /* renamed from: b */
    public static final C3607oj f22217b = m25890b(32);

    /* renamed from: c */
    public static final C3607oj f22218c = m25889a(16, 16);

    /* renamed from: d */
    public static final C3607oj f22219d = m25889a(32, 16);

    /* renamed from: e */
    public static final C3607oj f22220e = m25891c(16, 16, 32, 16, 5);

    /* renamed from: f */
    public static final C3607oj f22221f = m25891c(32, 16, 32, 32, 5);

    /* renamed from: g */
    public static final C3607oj f22222g;

    /* renamed from: h */
    public static final C3607oj f22223h;

    static {
        C3574nj z = C3607oj.m26382z();
        new C3266e8();
        z.mo16463k("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        C3674qk qkVar = C3674qk.TINK;
        z.mo16462j(qkVar);
        f22222g = (C3607oj) z.mo16062e();
        C3574nj z2 = C3607oj.m26382z();
        new C3629p8();
        z2.mo16463k("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        z2.mo16462j(qkVar);
        f22223h = (C3607oj) z2.mo16062e();
    }

    /* renamed from: a */
    public static C3607oj m25889a(int i, int i2) {
        C3175bg A = C3208cg.m25329A();
        A.mo15799j(i);
        C3274eg A2 = C3307fg.m25571A();
        A2.mo15987j(16);
        A.mo15800k((C3307fg) A2.mo16062e());
        C3574nj z = C3607oj.m26382z();
        z.mo16464l(((C3208cg) A.mo16062e()).mo16477Y());
        new C3826v7();
        z.mo16463k("type.googleapis.com/google.crypto.tink.AesEaxKey");
        z.mo16462j(C3674qk.TINK);
        return (C3607oj) z.mo16062e();
    }

    /* renamed from: b */
    public static C3607oj m25890b(int i) {
        C3472kg A = C3505lg.m26105A();
        A.mo16261j(i);
        C3574nj z = C3607oj.m26382z();
        z.mo16464l(((C3505lg) A.mo16062e()).mo16477Y());
        new C3922y7();
        z.mo16463k("type.googleapis.com/google.crypto.tink.AesGcmKey");
        z.mo16462j(C3674qk.TINK);
        return (C3607oj) z.mo16062e();
    }

    /* renamed from: c */
    public static C3607oj m25891c(int i, int i2, int i3, int i4, int i5) {
        C3735sf A = C3768tf.m27007A();
        C3834vf A2 = C3866wf.m27286A();
        A2.mo16946j(16);
        A.mo16758k((C3866wf) A2.mo16062e());
        A.mo16757j(i);
        C3507li A3 = C3540mi.m26206A();
        C3606oi A4 = C3639pi.m26485A();
        A4.mo16509k(5);
        A4.mo16508j(i4);
        A3.mo16338k((C3639pi) A4.mo16062e());
        A3.mo16337j(32);
        C3504lf z = C3537mf.m26196z();
        z.mo16333j((C3768tf) A.mo16062e());
        z.mo16334k((C3540mi) A3.mo16062e());
        C3574nj z2 = C3607oj.m26382z();
        z2.mo16464l(((C3537mf) z.mo16062e()).mo16477Y());
        new C3628p7();
        z2.mo16463k("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        z2.mo16462j(C3674qk.TINK);
        return (C3607oj) z2.mo16062e();
    }
}
