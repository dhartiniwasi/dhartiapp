package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class il4 {

    /* renamed from: a */
    private long f10849a;

    /* renamed from: b */
    private long f10850b;

    /* renamed from: c */
    private long f10851c;

    /* renamed from: d */
    private long f10852d;

    /* renamed from: e */
    private long f10853e;

    /* renamed from: f */
    private long f10854f;

    /* renamed from: g */
    private final boolean[] f10855g = new boolean[15];

    /* renamed from: h */
    private int f10856h;

    /* renamed from: a */
    public final long mo11151a() {
        long j = this.f10853e;
        if (j == 0) {
            return 0;
        }
        return this.f10854f / j;
    }

    /* renamed from: b */
    public final long mo11152b() {
        return this.f10854f;
    }

    /* renamed from: c */
    public final void mo11153c(long j) {
        long j2 = this.f10852d;
        if (j2 == 0) {
            this.f10849a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f10849a;
            this.f10850b = j3;
            this.f10854f = j3;
            this.f10853e = 1;
        } else {
            long j4 = j - this.f10851c;
            int i = (int) (j2 % 15);
            if (Math.abs(j4 - this.f10850b) <= 1000000) {
                this.f10853e++;
                this.f10854f += j4;
                boolean[] zArr = this.f10855g;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f10856h--;
                }
            } else {
                boolean[] zArr2 = this.f10855g;
                if (!zArr2[i]) {
                    zArr2[i] = true;
                    this.f10856h++;
                }
            }
        }
        this.f10852d++;
        this.f10851c = j;
    }

    /* renamed from: d */
    public final void mo11154d() {
        this.f10852d = 0;
        this.f10853e = 0;
        this.f10854f = 0;
        this.f10856h = 0;
        Arrays.fill(this.f10855g, false);
    }

    /* renamed from: e */
    public final boolean mo11155e() {
        long j = this.f10852d;
        if (j == 0) {
            return false;
        }
        return this.f10855g[(int) ((j - 1) % 15)];
    }

    /* renamed from: f */
    public final boolean mo11156f() {
        return this.f10852d > 15 && this.f10856h == 0;
    }
}
