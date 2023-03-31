package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zk3 {
    /* renamed from: a */
    static sk3 m24646a(xr3 xr3) throws GeneralSecurityException {
        if (xr3.mo15234J() == 3) {
            return new pk3(16);
        }
        if (xr3.mo15234J() == 4) {
            return new pk3(32);
        }
        if (xr3.mo15234J() == 5) {
            return new qk3();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    /* renamed from: b */
    static wk3 m24647b(xr3 xr3) throws GeneralSecurityException {
        if (xr3.mo15236L() == 3) {
            return new jl3(new rk3("HmacSha256"));
        }
        if (xr3.mo15236L() == 4) {
            return hl3.m13913b(1);
        }
        if (xr3.mo15236L() == 5) {
            return hl3.m13913b(2);
        }
        if (xr3.mo15236L() == 6) {
            return hl3.m13913b(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    /* renamed from: c */
    static rk3 m24648c(xr3 xr3) {
        if (xr3.mo15235K() == 3) {
            return new rk3("HmacSha256");
        }
        if (xr3.mo15235K() == 4) {
            return new rk3("HmacSha384");
        }
        if (xr3.mo15235K() == 5) {
            return new rk3("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
