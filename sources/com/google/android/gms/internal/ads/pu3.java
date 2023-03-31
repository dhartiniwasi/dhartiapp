package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pu3 {

    /* renamed from: a */
    private final ECPublicKey f16047a;

    public pu3(ECPublicKey eCPublicKey) {
        this.f16047a = eCPublicKey;
    }

    /* renamed from: a */
    public final ou3 mo13392a(String str, byte[] bArr, byte[] bArr2, int i, int i2) throws GeneralSecurityException {
        KeyPair c = qu3.m19359c(this.f16047a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) c.getPublic();
        byte[] g = qu3.m19363g((ECPrivateKey) c.getPrivate(), this.f16047a);
        byte[] l = qu3.m19368l(eCPublicKey.getParams().getCurve(), i2, eCPublicKey.getW());
        int i3 = 1;
        byte[] c2 = gu3.m13540c(l, g);
        Mac mac = (Mac) su3.f17667f.mo14144a(str);
        if (i <= mac.getMacLength() * 255) {
            if (bArr == null || bArr.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr, str));
            }
            byte[] doFinal = mac.doFinal(c2);
            byte[] bArr3 = new byte[i];
            mac.init(new SecretKeySpec(doFinal, str));
            byte[] bArr4 = new byte[0];
            int i4 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i3);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i5 = i4 + length;
                if (i5 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i4, length);
                    i3++;
                    i4 = i5;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i4, i - i4);
                    return new ou3(l, bArr3);
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
