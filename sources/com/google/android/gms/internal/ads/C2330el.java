package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.el */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2330el {

    /* renamed from: a */
    public final int f8839a = 1;

    /* renamed from: b */
    public final byte[] f8840b;

    public C2330el(int i, byte[] bArr) {
        this.f8840b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2330el.class == obj.getClass() && Arrays.equals(this.f8840b, ((C2330el) obj).f8840b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8840b) + 31;
    }
}
