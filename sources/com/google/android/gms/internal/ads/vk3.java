package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class vk3 implements qg3 {

    /* renamed from: e */
    private static final byte[] f19137e = new byte[0];

    /* renamed from: a */
    private final ds3 f19138a;

    /* renamed from: b */
    private final wk3 f19139b;

    /* renamed from: c */
    private final sk3 f19140c;

    /* renamed from: d */
    private final rk3 f19141d;

    private vk3(ds3 ds3, wk3 wk3, rk3 rk3, sk3 sk3, byte[] bArr) {
        this.f19138a = ds3;
        this.f19139b = wk3;
        this.f19141d = rk3;
        this.f19140c = sk3;
    }

    /* renamed from: b */
    static vk3 m22296b(ds3 ds3) throws GeneralSecurityException {
        if (!ds3.mo9687M().mo11529i()) {
            xr3 H = ds3.mo9686H();
            return new vk3(ds3, zk3.m24647b(H), zk3.m24648c(H), zk3.m24646a(H), (byte[]) null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }

    /* renamed from: a */
    public final byte[] mo12040a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        ds3 ds3 = this.f19138a;
        wk3 wk3 = this.f19139b;
        rk3 rk3 = this.f19141d;
        sk3 sk3 = this.f19140c;
        xk3 a = wk3.mo10834a(ds3.mo9687M().mo11531j());
        tk3 c = tk3.m21059c(a.mo15108a(), a.mo15109b(), wk3, rk3, sk3, bArr3);
        return gu3.m13540c(c.mo14320a(), c.mo14321b(bArr, f19137e));
    }
}
