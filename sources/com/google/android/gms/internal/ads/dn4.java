package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class dn4 implements C2643n {

    /* renamed from: a */
    public final int f8334a;

    /* renamed from: b */
    public final int[] f8335b;

    /* renamed from: c */
    public final long[] f8336c;

    /* renamed from: d */
    public final long[] f8337d;

    /* renamed from: e */
    public final long[] f8338e;

    /* renamed from: f */
    private final long f8339f;

    public dn4(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f8335b = iArr;
        this.f8336c = jArr;
        this.f8337d = jArr2;
        this.f8338e = jArr3;
        int length = iArr.length;
        this.f8334a = length;
        if (length > 0) {
            int i = length - 1;
            this.f8339f = jArr2[i] + jArr3[i];
            return;
        }
        this.f8339f = 0;
    }

    /* renamed from: U */
    public final boolean mo8197U() {
        return true;
    }

    /* renamed from: V */
    public final C2569l mo8198V(long j) {
        int N = gb2.m13144N(this.f8338e, j, true, true);
        C2680o oVar = new C2680o(this.f8338e[N], this.f8336c[N]);
        if (oVar.f14771a >= j || N == this.f8334a - 1) {
            return new C2569l(oVar, oVar);
        }
        int i = N + 1;
        return new C2569l(oVar, new C2680o(this.f8338e[i], this.f8336c[i]));
    }

    /* renamed from: a */
    public final long mo8199a() {
        return this.f8339f;
    }

    public final String toString() {
        int i = this.f8334a;
        String arrays = Arrays.toString(this.f8335b);
        String arrays2 = Arrays.toString(this.f8336c);
        String arrays3 = Arrays.toString(this.f8338e);
        String arrays4 = Arrays.toString(this.f8337d);
        return "ChunkIndex(length=" + i + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + ")";
    }
}
