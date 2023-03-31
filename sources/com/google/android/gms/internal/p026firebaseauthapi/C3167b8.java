package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3167b8 extends C3533mb {
    C3167b8() {
        super(C3637pg.class, new C3954z7(C3758t5.class));
    }

    /* renamed from: k */
    public static void m25089k(boolean z) throws GeneralSecurityException {
        if (m25091m()) {
            C3265e7.m25483n(new C3167b8(), true);
        }
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ C3467kb m25090l(int i, int i2) {
        C3703rg A = C3736sg.m26914A();
        A.mo16672j(i);
        return new C3467kb((C3736sg) A.mo16062e(), i2);
    }

    /* renamed from: m */
    private static boolean m25091m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final C3500lb mo15786a() {
        return new C3134a8(this, C3736sg.class);
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3637pg.m26479C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        C3637pg pgVar = (C3637pg) o3Var;
        C3544mm.m26218c(pgVar.mo16551z(), 0);
        C3544mm.m26217b(pgVar.mo16550D().mo15875f());
    }
}
