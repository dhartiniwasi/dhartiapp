package com.google.android.gms.internal.p026firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ca */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3202ca {

    /* renamed from: g */
    private static final byte[] f21872g = new byte[0];

    /* renamed from: a */
    private final C3169ba f21873a;

    /* renamed from: b */
    private final BigInteger f21874b;

    /* renamed from: c */
    private final byte[] f21875c;

    /* renamed from: d */
    private final byte[] f21876d;

    /* renamed from: e */
    private final byte[] f21877e;

    /* renamed from: f */
    private BigInteger f21878f = BigInteger.ZERO;

    private C3202ca(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, C3169ba baVar) {
        this.f21877e = bArr;
        this.f21875c = bArr2;
        this.f21876d = bArr3;
        this.f21874b = bigInteger;
        this.f21873a = baVar;
    }

    /* renamed from: b */
    static C3202ca m25323b(byte[] bArr, byte[] bArr2, C3301fa faVar, C3136aa aaVar, C3169ba baVar, byte[] bArr3) throws GeneralSecurityException {
        C3136aa aaVar2 = aaVar;
        byte[] b = C3598oa.m26362b(faVar.mo16023d(), aaVar.mo15727c(), baVar.mo15794d());
        byte[] bArr4 = C3598oa.f22456l;
        byte[] bArr5 = f21872g;
        byte[] c = C3411il.m25823c(C3598oa.f22445a, aaVar2.mo15729e(bArr4, bArr5, "psk_id_hash", b), aaVar2.mo15729e(bArr4, bArr3, "info_hash", b));
        C3136aa aaVar3 = aaVar;
        byte[] e = aaVar2.mo15729e(bArr2, bArr5, "secret", b);
        byte[] bArr6 = c;
        byte[] bArr7 = b;
        byte[] d = aaVar3.mo15728d(e, bArr6, "key", bArr7, baVar.zza());
        byte[] d2 = aaVar3.mo15728d(e, bArr6, "base_nonce", bArr7, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new C3202ca(bArr, d, d2, bigInteger.shiftLeft(96).subtract(bigInteger), baVar);
    }

    /* renamed from: c */
    private final synchronized byte[] m25324c() throws GeneralSecurityException {
        byte[] d;
        byte[] bArr = this.f21876d;
        byte[] byteArray = this.f21878f.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            } else if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else if (byteArray[0] == 0) {
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            } else {
                throw new GeneralSecurityException("integer too large");
            }
        }
        d = C3411il.m25824d(bArr, byteArray);
        if (this.f21878f.compareTo(this.f21874b) < 0) {
            this.f21878f = this.f21878f.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo15901a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f21873a.mo15793a(this.f21875c, m25324c(), bArr, bArr2);
    }
}
