package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class jl3 implements wk3 {

    /* renamed from: a */
    private final rk3 f11693a;

    jl3(rk3 rk3) {
        this.f11693a = rk3;
    }

    /* renamed from: a */
    public final xk3 mo10834a(byte[] bArr) throws GeneralSecurityException {
        byte[] b = nv3.m17294b();
        byte[] a = nv3.m17293a(b, bArr);
        byte[] c = nv3.m17295c(b);
        byte[] c2 = gu3.m13540c(c, bArr);
        byte[] d = gl3.m13382d(gl3.f9952b);
        rk3 rk3 = this.f11693a;
        return new xk3(rk3.mo13832b((byte[]) null, a, "eae_prk", c2, "shared_secret", d, rk3.mo13831a()), c);
    }

    /* renamed from: d */
    public final byte[] mo10835d() throws GeneralSecurityException {
        if (Arrays.equals(this.f11693a.mo13833c(), gl3.f9956f)) {
            return gl3.f9952b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
