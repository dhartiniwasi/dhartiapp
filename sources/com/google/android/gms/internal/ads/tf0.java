package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tf0 {

    /* renamed from: h */
    public static final za4 f17975h = C2187aq.f6722a;

    /* renamed from: a */
    public final long f17976a;

    /* renamed from: b */
    public final int f17977b;

    /* renamed from: c */
    public final Uri[] f17978c;

    /* renamed from: d */
    public final int[] f17979d;

    /* renamed from: e */
    public final long[] f17980e;

    /* renamed from: f */
    public final long f17981f;

    /* renamed from: g */
    public final boolean f17982g;

    public tf0(long j) {
        this(0, -1, new int[0], new Uri[0], new long[0], 0, false);
    }

    /* renamed from: a */
    public final int mo14293a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f17979d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    /* renamed from: b */
    public final tf0 mo14294b(int i) {
        int[] iArr = this.f17979d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f17980e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new tf0(0, 0, copyOf, (Uri[]) Arrays.copyOf(this.f17978c, 0), copyOf2, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tf0.class == obj.getClass()) {
            tf0 tf0 = (tf0) obj;
            return this.f17977b == tf0.f17977b && Arrays.equals(this.f17978c, tf0.f17978c) && Arrays.equals(this.f17979d, tf0.f17979d) && Arrays.equals(this.f17980e, tf0.f17980e);
        }
    }

    public final int hashCode() {
        return ((((((this.f17977b * 961) + Arrays.hashCode(this.f17978c)) * 31) + Arrays.hashCode(this.f17979d)) * 31) + Arrays.hashCode(this.f17980e)) * 961;
    }

    private tf0(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        v91.m22050d(iArr.length == uriArr.length);
        this.f17976a = 0;
        this.f17977b = i;
        this.f17979d = iArr;
        this.f17978c = uriArr;
        this.f17980e = jArr;
        this.f17981f = 0;
        this.f17982g = false;
    }
}
