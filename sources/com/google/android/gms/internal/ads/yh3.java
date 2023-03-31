package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class yh3 {

    /* renamed from: a */
    public static final Charset f20622a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static zs3 m24007a(us3 us3) {
        ws3 G = zs3.m24777G();
        G.mo14990r(us3.mo14621H());
        for (ts3 ts3 : us3.mo14622M()) {
            xs3 G2 = ys3.m24187G();
            G2.mo15240r(ts3.mo14378H().mo10635K());
            G2.mo15242u(ts3.mo14380N());
            G2.mo15241s(ts3.mo14381O());
            G2.mo15239p(ts3.mo14377G());
            G.mo14989p((ys3) G2.mo13423m());
        }
        return (zs3) G.mo13423m();
    }

    /* renamed from: b */
    public static void m24008b(us3 us3) throws GeneralSecurityException {
        int H = us3.mo14621H();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (ts3 ts3 : us3.mo14622M()) {
            if (ts3.mo14380N() == 3) {
                if (!ts3.mo14379M()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(ts3.mo14377G())}));
                } else if (ts3.mo14381O() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(ts3.mo14377G())}));
                } else if (ts3.mo14380N() != 2) {
                    if (ts3.mo14377G() == H) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= ts3.mo14378H().mo10636N() == 5;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(ts3.mo14377G())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
