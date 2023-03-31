package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.nl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3576nl implements C3952z5 {

    /* renamed from: a */
    private final C3642pl f22417a;

    /* renamed from: b */
    private final String f22418b;

    /* renamed from: c */
    private final byte[] f22419c;

    /* renamed from: d */
    private final C3510ll f22420d;

    public C3576nl(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, C3510ll llVar) throws GeneralSecurityException {
        C3675ql.m26586e(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f22417a = new C3642pl(eCPublicKey);
        this.f22419c = bArr;
        this.f22418b = str;
        this.f22420d = llVar;
    }
}
