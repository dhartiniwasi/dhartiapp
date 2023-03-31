package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.q */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2755q {

    /* renamed from: a */
    public final int f16101a;

    /* renamed from: b */
    public final byte[] f16102b;

    /* renamed from: c */
    public final int f16103c;

    /* renamed from: d */
    public final int f16104d;

    public C2755q(int i, byte[] bArr, int i2, int i3) {
        this.f16101a = i;
        this.f16102b = bArr;
        this.f16103c = i2;
        this.f16104d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2755q.class == obj.getClass()) {
            C2755q qVar = (C2755q) obj;
            return this.f16101a == qVar.f16101a && this.f16103c == qVar.f16103c && this.f16104d == qVar.f16104d && Arrays.equals(this.f16102b, qVar.f16102b);
        }
    }

    public final int hashCode() {
        return (((((this.f16101a * 31) + Arrays.hashCode(this.f16102b)) * 31) + this.f16103c) * 31) + this.f16104d;
    }
}
