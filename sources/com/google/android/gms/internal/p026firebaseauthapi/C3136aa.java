package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.aa */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3136aa {

    /* renamed from: a */
    private final String f21752a;

    C3136aa(String str) {
        this.f21752a = str;
    }

    /* renamed from: f */
    private final byte[] m25008f(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        Mac mac = (Mac) C3741sl.f22688f.mo16763a(this.f21752a);
        if (i <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i];
            mac.init(new SecretKeySpec(bArr, this.f21752a));
            byte[] bArr4 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i2);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i4 = i3 + length;
                if (i4 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i3, length);
                    i2++;
                    i3 = i4;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    /* renamed from: g */
    private final byte[] m25009g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac mac = (Mac) C3741sl.f22688f.mo16763a(this.f21752a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.f21752a));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.f21752a));
        }
        return mac.doFinal(bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo15725a() throws GeneralSecurityException {
        return Mac.getInstance(this.f21752a).getMacLength();
    }

    /* renamed from: b */
    public final byte[] mo15726b(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i) throws GeneralSecurityException {
        return m25008f(m25009g(C3598oa.m26365e("eae_prk", bArr2, bArr4), (byte[]) null), C3598oa.m26366f("shared_secret", bArr3, bArr4, i), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo15727c() throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            java.lang.String r0 = r5.f21752a
            int r1 = r0.hashCode()
            r2 = 984523022(0x3aaea10e, float:0.0013323145)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = 984524074(0x3aaea52a, float:0.0013324369)
            if (r1 == r2) goto L_0x0022
            r2 = 984525777(0x3aaeabd1, float:0.0013326352)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "HmacSha512"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "HmacSha384"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "HmacSha256"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x004b
            if (r0 == r4) goto L_0x0048
            if (r0 != r3) goto L_0x0040
            byte[] r0 = com.google.android.gms.internal.p026firebaseauthapi.C3598oa.f22452h
            return r0
        L_0x0040:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KDF ID"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            byte[] r0 = com.google.android.gms.internal.p026firebaseauthapi.C3598oa.f22451g
            return r0
        L_0x004b:
            byte[] r0 = com.google.android.gms.internal.p026firebaseauthapi.C3598oa.f22450f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p026firebaseauthapi.C3136aa.mo15727c():byte[]");
    }

    /* renamed from: d */
    public final byte[] mo15728d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i) throws GeneralSecurityException {
        return m25008f(bArr, C3598oa.m26366f(str, bArr2, bArr3, i), i);
    }

    /* renamed from: e */
    public final byte[] mo15729e(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return m25009g(C3598oa.m26365e(str, bArr2, bArr3), bArr);
    }
}
