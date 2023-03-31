package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ph3 implements Comparable {

    /* renamed from: a */
    private final byte[] f15863a;

    /* synthetic */ ph3(byte[] bArr, oh3 oh3) {
        this.f15863a = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ph3 ph3 = (ph3) obj;
        int length = this.f15863a.length;
        int length2 = ph3.f15863a.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f15863a;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = ph3.f15863a[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ph3)) {
            return false;
        }
        return Arrays.equals(this.f15863a, ((ph3) obj).f15863a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15863a);
    }

    public final String toString() {
        return cv3.m11208a(this.f15863a);
    }
}
