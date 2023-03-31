package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class r61 {

    /* renamed from: d */
    public static final r61 f16847d = new r61((Object) null, new tf0[0], 0, -9223372036854775807L, 0);

    /* renamed from: e */
    private static final tf0 f16848e = new tf0(0).mo14294b(0);

    /* renamed from: f */
    public static final za4 f16849f = C2160a.f6348a;

    /* renamed from: a */
    public final int f16850a = 0;

    /* renamed from: b */
    public final long f16851b = 0;

    /* renamed from: c */
    private final tf0[] f16852c;

    private r61(Object obj, tf0[] tf0Arr, long j, long j2, int i) {
        this.f16852c = tf0Arr;
    }

    /* renamed from: a */
    public final tf0 mo13683a(int i) {
        return i < 0 ? f16848e : this.f16852c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r61.class == obj.getClass()) {
            return gb2.m13186t((Object) null, (Object) null) && Arrays.equals(this.f16852c, ((r61) obj).f16852c);
        }
    }

    public final int hashCode() {
        return (((int) -9223372036854775807L) * 961) + Arrays.hashCode(this.f16852c);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + null + ", adResumePositionUs=0, adGroups=[" + "])";
    }
}
