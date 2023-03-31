package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class us3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final us3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private by3 zzf = sx3.m20713x();

    static {
        us3 us3 = new us3();
        zzb = us3;
        sx3.m20701B(us3.class, us3);
    }

    private us3() {
    }

    /* renamed from: I */
    public static rs3 m21841I() {
        return (rs3) zzb.mo14160D();
    }

    /* renamed from: K */
    public static us3 m21843K(InputStream inputStream, ex3 ex3) throws IOException {
        return (us3) sx3.m20708r(zzb, inputStream, ex3);
    }

    /* renamed from: L */
    public static us3 m21844L(byte[] bArr, ex3 ex3) throws ey3 {
        return (us3) sx3.m20709s(zzb, bArr, ex3);
    }

    /* renamed from: O */
    static /* synthetic */ void m21846O(us3 us3, ts3 ts3) {
        ts3.getClass();
        by3 by3 = us3.zzf;
        if (!by3.mo8988e()) {
            us3.zzf = sx3.m20714y(by3);
        }
        us3.zzf.add(ts3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", ts3.class});
        } else if (i2 == 3) {
            return new us3();
        } else {
            if (i2 == 4) {
                return new rs3((qs3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo14620G() {
        return this.zzf.size();
    }

    /* renamed from: H */
    public final int mo14621H() {
        return this.zze;
    }

    /* renamed from: M */
    public final List mo14622M() {
        return this.zzf;
    }
}
