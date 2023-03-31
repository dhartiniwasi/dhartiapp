package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ml */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3543ml implements C3920y5 {

    /* renamed from: g */
    private static final byte[] f22367g = new byte[0];

    /* renamed from: a */
    private final ECPrivateKey f22368a;

    /* renamed from: b */
    private final C3609ol f22369b;

    /* renamed from: c */
    private final String f22370c;

    /* renamed from: d */
    private final byte[] f22371d;

    /* renamed from: e */
    private final C3510ll f22372e;

    /* renamed from: f */
    private final int f22373f;

    public C3543ml(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, C3510ll llVar) throws GeneralSecurityException {
        this.f22368a = eCPrivateKey;
        this.f22369b = new C3609ol(eCPrivateKey);
        this.f22371d = bArr;
        this.f22370c = str;
        this.f22373f = i;
        this.f22372e = llVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo15949a(byte[] r10, byte[] r11) throws java.security.GeneralSecurityException {
        /*
            r9 = this;
            java.security.interfaces.ECPrivateKey r11 = r9.f22368a
            java.security.spec.ECParameterSpec r11 = r11.getParams()
            java.security.spec.EllipticCurve r11 = r11.getCurve()
            int r0 = r9.f22373f
            int r11 = com.google.android.gms.internal.p026firebaseauthapi.C3675ql.m26582a(r11)
            int r0 = r0 + -1
            if (r0 == 0) goto L_0x001a
            r1 = 2
            if (r0 == r1) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            int r11 = r11 + r11
            goto L_0x001d
        L_0x001a:
            int r11 = r11 + r11
        L_0x001b:
            int r11 = r11 + 1
        L_0x001d:
            int r0 = r10.length
            if (r0 < r11) goto L_0x0049
            r1 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r10, r1, r11)
            com.google.android.gms.internal.firebase-auth-api.ol r2 = r9.f22369b
            java.lang.String r4 = r9.f22370c
            byte[] r5 = r9.f22371d
            com.google.android.gms.internal.firebase-auth-api.ll r1 = r9.f22372e
            int r7 = r1.zza()
            int r8 = r9.f22373f
            r6 = 0
            byte[] r1 = r2.mo16516a(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.firebase-auth-api.ll r2 = r9.f22372e
            com.google.android.gms.internal.firebase-auth-api.ta r1 = r2.mo16341b(r1)
            byte[] r10 = java.util.Arrays.copyOfRange(r10, r11, r0)
            byte[] r11 = f22367g
            byte[] r10 = r1.mo16808a(r10, r11)
            return r10
        L_0x0049:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p026firebaseauthapi.C3543ml.mo15949a(byte[], byte[]):byte[]");
    }
}
