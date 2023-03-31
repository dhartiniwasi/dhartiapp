package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ad3 extends bd3 {
    /* renamed from: a */
    public static int m9691a(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        throw new IllegalArgumentException(r83.m19613b("Out of range: %s", Long.valueOf(j)));
    }

    /* renamed from: b */
    public static int m9692b(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), 1073741823);
    }

    /* renamed from: c */
    public static int m9693c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
    }
}
