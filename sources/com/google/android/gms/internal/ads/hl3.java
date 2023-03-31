package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class hl3 implements wk3 {

    /* renamed from: a */
    private final rk3 f10381a;

    /* renamed from: b */
    private final int f10382b;

    private hl3(rk3 rk3, int i) {
        this.f10381a = rk3;
        this.f10382b = i;
    }

    /* renamed from: b */
    static hl3 m13913b(int i) throws GeneralSecurityException {
        int i2 = i - 1;
        if (i2 == 0) {
            return new hl3(new rk3("HmacSha256"), 1);
        }
        if (i2 != 1) {
            return new hl3(new rk3("HmacSha512"), 3);
        }
        return new hl3(new rk3("HmacSha384"), 2);
    }

    /* renamed from: a */
    public final xk3 mo10834a(byte[] bArr) throws GeneralSecurityException {
        KeyPair c = qu3.m19359c(qu3.m19367k(this.f10382b));
        byte[] g = qu3.m19363g((ECPrivateKey) c.getPrivate(), qu3.m19366j(qu3.m19367k(this.f10382b), 1, bArr));
        int i = this.f10382b;
        byte[] l = qu3.m19368l(qu3.m19367k(i).getCurve(), 1, ((ECPublicKey) c.getPublic()).getW());
        byte[] c2 = gu3.m13540c(l, bArr);
        byte[] d = gl3.m13382d(mo10835d());
        rk3 rk3 = this.f10381a;
        return new xk3(rk3.mo13832b((byte[]) null, g, "eae_prk", c2, "shared_secret", d, rk3.mo13831a()), l);
    }

    /* renamed from: d */
    public final byte[] mo10835d() throws GeneralSecurityException {
        int i = this.f10382b - 1;
        if (i == 0) {
            return gl3.f9953c;
        }
        if (i != 1) {
            return gl3.f9955e;
        }
        return gl3.f9954d;
    }
}
