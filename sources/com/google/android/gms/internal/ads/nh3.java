package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nh3 {

    /* renamed from: a */
    private final Object f14017a;

    /* renamed from: b */
    private final byte[] f14018b;

    /* renamed from: c */
    private final int f14019c;

    /* renamed from: d */
    private final kh3 f14020d;

    /* renamed from: e */
    private final int f14021e;

    /* renamed from: f */
    private final int f14022f;

    nh3(Object obj, byte[] bArr, int i, int i2, int i3, kh3 kh3) {
        this.f14017a = obj;
        this.f14018b = Arrays.copyOf(bArr, bArr.length);
        this.f14021e = i;
        this.f14022f = i2;
        this.f14019c = i3;
        this.f14020d = kh3;
    }

    /* renamed from: a */
    public final int mo12623a() {
        return this.f14019c;
    }

    /* renamed from: b */
    public final kh3 mo12624b() {
        return this.f14020d;
    }

    /* renamed from: c */
    public final Object mo12625c() {
        return this.f14017a;
    }

    /* renamed from: d */
    public final byte[] mo12626d() {
        byte[] bArr = this.f14018b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: e */
    public final int mo12627e() {
        return this.f14021e;
    }

    /* renamed from: f */
    public final int mo12628f() {
        return this.f14022f;
    }
}
