package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class si3 extends ul3 {
    si3() {
        super(rp3.class, new qi3(ig3.class));
    }

    /* renamed from: k */
    public static void m20386k(boolean z) throws GeneralSecurityException {
        if (m20388m()) {
            xh3.m23229n(new si3(), true);
        }
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ sl3 m20387l(int i, int i2) {
        tp3 H = up3.m21775H();
        H.mo14365p(i);
        return new sl3((up3) H.mo13423m(), i2);
    }

    /* renamed from: m */
    private static boolean m20388m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final tl3 mo9607a() {
        return new ri3(this, up3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo9608b(jw3 jw3) throws ey3 {
        return rp3.m19986J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final String mo9609c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9610d(cz3 cz3) throws GeneralSecurityException {
        rp3 rp3 = (rp3) cz3;
        lv3.m16239b(rp3.mo13868G(), 0);
        lv3.m16238a(rp3.mo13869K().mo9361q());
    }

    /* renamed from: f */
    public final int mo9611f() {
        return 3;
    }
}
