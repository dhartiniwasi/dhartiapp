package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class dl3 extends km3 {
    public dl3() {
        super(as3.class, ds3.class, new al3(pg3.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ sl3 m11558k(int i, int i2, int i3, int i4) {
        wr3 G = xr3.m23515G();
        G.mo14981s(i);
        G.mo14980r(i2);
        G.mo14979p(i3);
        tr3 G2 = ur3.m21827G();
        G2.mo14367p((xr3) G.mo13423m());
        return new sl3((ur3) G2.mo13423m(), i4);
    }

    /* renamed from: a */
    public final tl3 mo9607a() {
        return new bl3(this, ur3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo9608b(jw3 jw3) throws ey3 {
        return as3.m9963J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final String mo9609c() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9610d(cz3 cz3) throws GeneralSecurityException {
        as3 as3 = (as3) cz3;
        if (as3.mo8526L().mo11529i()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (as3.mo8527P()) {
            lv3.m16239b(as3.mo8524G(), 0);
            gl3.m13379a(as3.mo8525K().mo9686H());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    /* renamed from: f */
    public final int mo9611f() {
        return 4;
    }
}
