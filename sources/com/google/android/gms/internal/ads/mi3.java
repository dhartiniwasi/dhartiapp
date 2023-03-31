package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mi3 extends ul3 {
    mi3() {
        super(bp3.class, new ki3(ig3.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ sl3 m16537k(int i, int i2, int i3) {
        dp3 H = ep3.m12233H();
        H.mo9646p(i);
        hp3 H2 = ip3.m14474H();
        H2.mo10890p(16);
        H.mo9647r((ip3) H2.mo13423m());
        return new sl3((ep3) H.mo13423m(), i3);
    }

    /* renamed from: a */
    public final tl3 mo9607a() {
        return new li3(this, ep3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo9608b(jw3 jw3) throws ey3 {
        return bp3.m10537J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final String mo9609c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9610d(cz3 cz3) throws GeneralSecurityException {
        bp3 bp3 = (bp3) cz3;
        lv3.m16239b(bp3.mo8918G(), 0);
        lv3.m16238a(bp3.mo8920L().mo9361q());
        if (bp3.mo8919K().mo11187G() != 12 && bp3.mo8919K().mo11187G() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* renamed from: f */
    public final int mo9611f() {
        return 3;
    }
}
