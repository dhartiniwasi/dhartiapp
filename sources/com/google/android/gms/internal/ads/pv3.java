package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pv3 {

    /* renamed from: a */
    private final byte[] f16060a;

    private pv3(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f16060a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* renamed from: a */
    public static pv3 m18935a(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new pv3(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public final byte[] mo13410b() {
        byte[] bArr = this.f16060a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pv3)) {
            return false;
        }
        return Arrays.equals(((pv3) obj).f16060a, this.f16060a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16060a);
    }

    public final String toString() {
        String a = cv3.m11208a(this.f16060a);
        return "Bytes(" + a + ")";
    }
}
