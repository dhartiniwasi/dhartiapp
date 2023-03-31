package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zj3 implements og3 {

    /* renamed from: a */
    private final th3 f21120a;

    /* renamed from: b */
    private final sn3 f21121b;

    /* renamed from: c */
    private final sn3 f21122c;

    public zj3(th3 th3) {
        sn3 sn3;
        this.f21120a = th3;
        if (th3.mo14311f()) {
            tn3 b = am3.m9855a().mo8437b();
            yn3 a = xl3.m23367a(th3);
            this.f21121b = b.mo14331a(a, "daead", "encrypt");
            sn3 = b.mo14331a(a, "daead", "decrypt");
        } else {
            sn3 = xl3.f20195a;
            this.f21121b = sn3;
        }
        this.f21122c = sn3;
    }

    /* renamed from: a */
    public final byte[] mo10016a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] c = gu3.m13540c(this.f21120a.mo14306a().mo12626d(), ((og3) this.f21120a.mo14306a().mo12625c()).mo10016a(bArr, bArr2));
            this.f21120a.mo14306a().mo12623a();
            int length = bArr.length;
            return c;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
