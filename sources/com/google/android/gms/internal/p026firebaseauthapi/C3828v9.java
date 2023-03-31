package com.google.android.gms.internal.p026firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3828v9 {

    /* renamed from: a */
    private static final byte[] f22807a;

    /* renamed from: b */
    public static final C3607oj f22808b;

    /* renamed from: c */
    public static final C3607oj f22809c;

    /* renamed from: d */
    public static final C3607oj f22810d;

    static {
        byte[] bArr = new byte[0];
        f22807a = bArr;
        C3607oj ojVar = C3430j7.f22216a;
        C3674qk qkVar = C3674qk.TINK;
        C3607oj ojVar2 = ojVar;
        byte[] bArr2 = bArr;
        f22808b = m27209a(4, 5, 3, ojVar2, qkVar, bArr2);
        f22809c = m27209a(4, 5, 4, ojVar2, C3674qk.RAW, bArr2);
        f22810d = m27209a(4, 5, 3, C3430j7.f22220e, qkVar, bArr2);
    }

    /* renamed from: a */
    public static C3607oj m27209a(int i, int i2, int i3, C3607oj ojVar, C3674qk qkVar, byte[] bArr) {
        C3506lh z = C3539mh.m26203z();
        C3932yh z2 = C3964zh.m27571z();
        z2.mo17077k(4);
        z2.mo17078l(5);
        z2.mo17076j(C3325g1.m25613u(bArr));
        C3407ih z3 = C3440jh.m25911z();
        z3.mo16179j(ojVar);
        C3605oh A = C3671qh.m26571A();
        A.mo16506k((C3964zh) z2.mo16062e());
        A.mo16505j((C3440jh) z3.mo16062e());
        A.mo16507l(i3);
        z.mo16336j((C3671qh) A.mo16062e());
        C3574nj z4 = C3607oj.m26382z();
        new C3564n9();
        z4.mo16463k("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        z4.mo16462j(qkVar);
        z4.mo16464l(((C3539mh) z.mo16062e()).mo16477Y());
        return (C3607oj) z4.mo16062e();
    }
}
