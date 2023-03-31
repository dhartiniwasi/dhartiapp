package com.google.android.gms.internal.ads;

import com.startapp.C8843b4;

/* renamed from: com.google.android.gms.internal.ads.v6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2947v6 {

    /* renamed from: a */
    private final C2792r f18942a;

    /* renamed from: b */
    private long f18943b;

    /* renamed from: c */
    private boolean f18944c;

    /* renamed from: d */
    private int f18945d;

    /* renamed from: e */
    private long f18946e;

    /* renamed from: f */
    private boolean f18947f;

    /* renamed from: g */
    private boolean f18948g;

    /* renamed from: h */
    private boolean f18949h;

    /* renamed from: i */
    private boolean f18950i;

    /* renamed from: j */
    private boolean f18951j;

    /* renamed from: k */
    private long f18952k;

    /* renamed from: l */
    private long f18953l;

    /* renamed from: m */
    private boolean f18954m;

    public C2947v6(C2792r rVar) {
        this.f18942a = rVar;
    }

    /* renamed from: e */
    private final void m22003e(int i) {
        long j = this.f18953l;
        if (j != -9223372036854775807L) {
            boolean z = this.f18954m;
            long j2 = this.f18943b;
            long j3 = this.f18952k;
            this.f18942a.mo8824f(j, z ? 1 : 0, (int) (j2 - j3), i, (C2755q) null);
        }
    }

    /* renamed from: a */
    public final void mo14689a(long j, int i, boolean z) {
        if (this.f18951j && this.f18948g) {
            this.f18954m = this.f18944c;
            this.f18951j = false;
        } else if (this.f18949h || this.f18948g) {
            if (z && this.f18950i) {
                m22003e(i + ((int) (j - this.f18943b)));
            }
            this.f18952k = this.f18943b;
            this.f18953l = this.f18946e;
            this.f18954m = this.f18944c;
            this.f18950i = true;
        }
    }

    /* renamed from: b */
    public final void mo14690b(byte[] bArr, int i, int i2) {
        if (this.f18947f) {
            int i3 = this.f18945d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.f18948g = (bArr[i4] & C8843b4.f36445d) != 0;
                this.f18947f = false;
                return;
            }
            this.f18945d = i3 + (i2 - i);
        }
    }

    /* renamed from: c */
    public final void mo14691c() {
        this.f18947f = false;
        this.f18948g = false;
        this.f18949h = false;
        this.f18950i = false;
        this.f18951j = false;
    }

    /* renamed from: d */
    public final void mo14692d(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.f18948g = false;
        this.f18949h = false;
        this.f18946e = j2;
        this.f18945d = 0;
        this.f18943b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f18950i && !this.f18951j) {
                if (z) {
                    m22003e(i);
                }
                this.f18950i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.f18949h = !this.f18951j;
                this.f18951j = true;
            }
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.f18944c = z3;
        if (z3 || i2 <= 9) {
            z2 = true;
        }
        this.f18947f = z2;
    }
}
