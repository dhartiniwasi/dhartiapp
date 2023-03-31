package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class q14 {

    /* renamed from: a */
    private final long f16132a;

    /* renamed from: b */
    private final long f16133b;

    /* renamed from: c */
    private long f16134c = -9223372036854775807L;

    /* renamed from: d */
    private long f16135d = -9223372036854775807L;

    /* renamed from: e */
    private long f16136e = -9223372036854775807L;

    /* renamed from: f */
    private long f16137f = -9223372036854775807L;

    /* renamed from: g */
    private long f16138g = -9223372036854775807L;

    /* renamed from: h */
    private long f16139h = -9223372036854775807L;

    /* renamed from: i */
    private float f16140i = 1.03f;

    /* renamed from: j */
    private float f16141j = 0.97f;

    /* renamed from: k */
    private float f16142k = 1.0f;

    /* renamed from: l */
    private long f16143l = -9223372036854775807L;

    /* renamed from: m */
    private long f16144m = -9223372036854775807L;

    /* renamed from: n */
    private long f16145n = -9223372036854775807L;

    /* synthetic */ q14(float f, float f2, long j, float f3, long j2, long j3, float f4, p04 p04) {
        this.f16132a = j2;
        this.f16133b = j3;
    }

    /* renamed from: f */
    private static long m19024f(long j, long j2, float f) {
        return (long) ((((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f));
    }

    /* renamed from: g */
    private final void m19025g() {
        long j = this.f16134c;
        if (j != -9223372036854775807L) {
            long j2 = this.f16135d;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f16137f;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f16138g;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f16136e != j) {
            this.f16136e = j;
            this.f16139h = j;
            this.f16144m = -9223372036854775807L;
            this.f16145n = -9223372036854775807L;
            this.f16143l = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public final float mo13453a(long j, long j2) {
        long j3;
        if (this.f16134c == -9223372036854775807L) {
            return 1.0f;
        }
        long j4 = j - j2;
        long j5 = this.f16144m;
        if (j5 == -9223372036854775807L) {
            this.f16144m = j4;
            this.f16145n = 0;
        } else {
            long max = Math.max(j4, m19024f(j5, j4, 0.999f));
            this.f16144m = max;
            this.f16145n = m19024f(this.f16145n, Math.abs(j4 - max), 0.999f);
        }
        if (this.f16143l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f16143l < 1000) {
            return this.f16142k;
        }
        this.f16143l = SystemClock.elapsedRealtime();
        long j6 = this.f16144m + (this.f16145n * 3);
        if (this.f16139h > j6) {
            long f0 = gb2.m13168f0(1000);
            float f = (float) f0;
            long[] jArr = {j6, this.f16136e, this.f16139h - (((long) ((this.f16142k - 4.0f) * f)) + ((long) ((this.f16140i - 4.0f) * f)))};
            j3 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j3) {
                    j3 = j7;
                }
            }
            this.f16139h = j3;
        } else {
            j3 = gb2.m13160b0(j - ((long) (Math.max(0.0f, this.f16142k - 4.0f) / 1.0E-7f)), this.f16139h, j6);
            this.f16139h = j3;
            long j8 = this.f16138g;
            if (j8 != -9223372036854775807L && j3 > j8) {
                this.f16139h = j8;
                j3 = j8;
            }
        }
        long j9 = j - j3;
        if (Math.abs(j9) < this.f16132a) {
            this.f16142k = 1.0f;
            return 1.0f;
        }
        float A = gb2.m13131A((((float) j9) * 1.0E-7f) + 1.0f, this.f16141j, this.f16140i);
        this.f16142k = A;
        return A;
    }

    /* renamed from: b */
    public final long mo13454b() {
        return this.f16139h;
    }

    /* renamed from: c */
    public final void mo13455c() {
        long j = this.f16139h;
        if (j != -9223372036854775807L) {
            long j2 = j + this.f16133b;
            this.f16139h = j2;
            long j3 = this.f16138g;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.f16139h = j3;
            }
            this.f16143l = -9223372036854775807L;
        }
    }

    /* renamed from: d */
    public final void mo13456d(C3036xl xlVar) {
        long j = xlVar.f20153a;
        this.f16134c = gb2.m13168f0(-9223372036854775807L);
        this.f16137f = gb2.m13168f0(-9223372036854775807L);
        this.f16138g = gb2.m13168f0(-9223372036854775807L);
        this.f16141j = 0.97f;
        this.f16140i = 1.03f;
        m19025g();
    }

    /* renamed from: e */
    public final void mo13457e(long j) {
        this.f16135d = j;
        m19025g();
    }
}
