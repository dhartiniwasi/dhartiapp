package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ek3 extends km3 {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final byte[] f8833e = new byte[0];

    ek3() {
        super(vq3.class, yq3.class, new ck3(pg3.class));
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ sl3 m12157l(int i, int i2, int i3, ch3 ch3, byte[] bArr, int i4) {
        oq3 G = pq3.m18725G();
        ar3 G2 = br3.m10548G();
        int i5 = 4;
        G2.mo8518r(4);
        G2.mo8519s(5);
        G2.mo8517p(jw3.m15086K(bArr));
        br3 br3 = (br3) G2.mo13423m();
        ls3 G3 = ms3.m16683G();
        G3.mo12077p(ch3.mo9168b());
        G3.mo12078r(jw3.m15086K(ch3.mo9169c()));
        int d = ch3.mo9170d() - 1;
        if (d == 0) {
            i5 = 3;
        } else if (d != 1) {
            i5 = d != 2 ? 6 : 5;
        }
        G3.mo12079s(i5);
        lq3 G4 = mq3.m16646G();
        G4.mo12065p((ms3) G3.mo13423m());
        rq3 H = sq3.m20558H();
        H.mo13871r(br3);
        H.mo13870p((mq3) G4.mo13423m());
        H.mo13872s(i3);
        G.mo13022p((sq3) H.mo13423m());
        return new sl3((pq3) G.mo13423m(), i4);
    }

    /* renamed from: a */
    public final tl3 mo9607a() {
        return new dk3(this, pq3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo9608b(jw3 jw3) throws ey3 {
        return vq3.m22350J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final String mo9609c() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9610d(cz3 cz3) throws GeneralSecurityException {
        vq3 vq3 = (vq3) cz3;
        if (!vq3.mo14809L().mo11529i()) {
            lv3.m16239b(vq3.mo14807G(), 0);
            nk3.m17162a(vq3.mo14808K().mo15501H());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    /* renamed from: f */
    public final int mo9611f() {
        return 4;
    }
}
