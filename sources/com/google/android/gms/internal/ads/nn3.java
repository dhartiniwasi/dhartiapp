package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class nn3 implements ih3 {

    /* renamed from: a */
    private final th3 f14129a;

    /* renamed from: b */
    private final sn3 f14130b;

    /* renamed from: c */
    private final sn3 f14131c;

    /* synthetic */ nn3(th3 th3, mn3 mn3) {
        sn3 sn3;
        this.f14129a = th3;
        if (th3.mo14311f()) {
            tn3 b = am3.m9855a().mo8437b();
            yn3 a = xl3.m23367a(th3);
            this.f14130b = b.mo14331a(a, "mac", "compute");
            sn3 = b.mo14331a(a, "mac", "verify");
        } else {
            sn3 = xl3.f20195a;
            this.f14130b = sn3;
        }
        this.f14131c = sn3;
    }

    /* renamed from: a */
    public final void mo10953a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (nh3 nh3 : this.f14129a.mo14310e(copyOf)) {
                if (nh3.mo12628f() == 4) {
                    bArr3 = gu3.m13540c(bArr2, on3.f15277b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((ih3) nh3.mo12625c()).mo10953a(copyOfRange, bArr3);
                    nh3.mo12623a();
                    return;
                } catch (GeneralSecurityException e) {
                    on3.f15276a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
                }
            }
            for (nh3 nh32 : this.f14129a.mo14310e(ng3.f14013a)) {
                try {
                    ((ih3) nh32.mo12625c()).mo10953a(bArr, bArr2);
                    nh32.mo12623a();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    /* renamed from: b */
    public final byte[] mo10954b(byte[] bArr) throws GeneralSecurityException {
        if (this.f14129a.mo14306a().mo12628f() == 4) {
            bArr = gu3.m13540c(bArr, on3.f15277b);
        }
        try {
            byte[] c = gu3.m13540c(this.f14129a.mo14306a().mo12626d(), ((ih3) this.f14129a.mo14306a().mo12625c()).mo10954b(bArr));
            this.f14129a.mo14306a().mo12623a();
            return c;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
