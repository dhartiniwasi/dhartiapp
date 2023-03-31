package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import p053g4.C4409t;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class qt2 {
    public qt2() {
        try {
            ai3.m9789a();
        } catch (GeneralSecurityException e) {
            C4794n1.m30693k("Failed to Configure Aead. ".concat(e.toString()));
            C4409t.m29325q().mo15126t(e, "CryptoUtils.registerAead");
        }
    }

    /* renamed from: a */
    public static final String m19347a() {
        gw3 G = jw3.m15084G();
        try {
            mg3.m16527b(eh3.m12110b(dh3.m11501a("AES128_GCM")), kg3.m15410b(G));
        } catch (IOException | GeneralSecurityException e) {
            C4794n1.m30693k("Failed to generate key".concat(e.toString()));
            C4409t.m29325q().mo15126t(e, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(G.mo10658b().mo11531j(), 11);
        G.mo10659f();
        return encodeToString;
    }

    /* renamed from: b */
    public static final String m19348b(byte[] bArr, byte[] bArr2, String str, bv1 bv1) {
        eh3 c = m19349c(str);
        if (c == null) {
            return null;
        }
        try {
            byte[] a = ((ig3) c.mo9916d(ig3.class)).mo9175a(bArr, bArr2);
            bv1.mo8951a().put("ds", "1");
            return new String(a, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            C4794n1.m30693k("Failed to decrypt ".concat(e.toString()));
            C4409t.m29325q().mo15126t(e, "CryptoUtils.decrypt");
            bv1.mo8951a().put("dsf", e.toString());
            return null;
        }
    }

    /* renamed from: c */
    private static final eh3 m19349c(String str) {
        try {
            return mg3.m16526a(jg3.m14855b(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            C4794n1.m30693k("Failed to get keysethandle".concat(e.toString()));
            C4409t.m29325q().mo15126t(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
