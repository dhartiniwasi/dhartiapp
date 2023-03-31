package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ku3 implements pg3 {

    /* renamed from: a */
    private final ECPrivateKey f12297a;

    /* renamed from: b */
    private final nu3 f12298b;

    /* renamed from: c */
    private final String f12299c;

    /* renamed from: d */
    private final byte[] f12300d;

    /* renamed from: e */
    private final ju3 f12301e;

    public ku3(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, ju3 ju3) throws GeneralSecurityException {
        this.f12297a = eCPrivateKey;
        this.f12298b = new nu3(eCPrivateKey);
        this.f12300d = bArr;
        this.f12299c = str;
        this.f12301e = ju3;
    }
}
