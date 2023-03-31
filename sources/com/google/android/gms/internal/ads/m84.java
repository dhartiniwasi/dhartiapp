package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class m84 {

    /* renamed from: a */
    public final long f13269a;

    /* renamed from: b */
    public final gt0 f13270b;

    /* renamed from: c */
    public final int f13271c;

    /* renamed from: d */
    public final mg4 f13272d;

    /* renamed from: e */
    public final long f13273e;

    /* renamed from: f */
    public final gt0 f13274f;

    /* renamed from: g */
    public final int f13275g;

    /* renamed from: h */
    public final mg4 f13276h;

    /* renamed from: i */
    public final long f13277i;

    /* renamed from: j */
    public final long f13278j;

    public m84(long j, gt0 gt0, int i, mg4 mg4, long j2, gt0 gt02, int i2, mg4 mg42, long j3, long j4) {
        this.f13269a = j;
        this.f13270b = gt0;
        this.f13271c = i;
        this.f13272d = mg4;
        this.f13273e = j2;
        this.f13274f = gt02;
        this.f13275g = i2;
        this.f13276h = mg42;
        this.f13277i = j3;
        this.f13278j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m84.class == obj.getClass()) {
            m84 m84 = (m84) obj;
            return this.f13269a == m84.f13269a && this.f13271c == m84.f13271c && this.f13273e == m84.f13273e && this.f13275g == m84.f13275g && this.f13277i == m84.f13277i && this.f13278j == m84.f13278j && w73.m22614a(this.f13270b, m84.f13270b) && w73.m22614a(this.f13272d, m84.f13272d) && w73.m22614a(this.f13274f, m84.f13274f) && w73.m22614a(this.f13276h, m84.f13276h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f13269a), this.f13270b, Integer.valueOf(this.f13271c), this.f13272d, Long.valueOf(this.f13273e), this.f13274f, Integer.valueOf(this.f13275g), this.f13276h, Long.valueOf(this.f13277i), Long.valueOf(this.f13278j)});
    }
}
