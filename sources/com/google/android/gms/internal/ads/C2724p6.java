package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2724p6 {

    /* renamed from: a */
    private final C2792r f15700a;

    /* renamed from: b */
    private boolean f15701b;

    /* renamed from: c */
    private boolean f15702c;

    /* renamed from: d */
    private boolean f15703d;

    /* renamed from: e */
    private int f15704e;

    /* renamed from: f */
    private int f15705f;

    /* renamed from: g */
    private long f15706g;

    /* renamed from: h */
    private long f15707h;

    public C2724p6(C2792r rVar) {
        this.f15700a = rVar;
    }

    /* renamed from: a */
    public final void mo13142a(byte[] bArr, int i, int i2) {
        if (this.f15702c) {
            int i3 = this.f15705f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.f15703d = ((bArr[i4] & 192) >> 6) == 0;
                this.f15702c = false;
                return;
            }
            this.f15705f = i3 + (i2 - i);
        }
    }

    /* renamed from: b */
    public final void mo13143b(long j, int i, boolean z) {
        if (this.f15704e == 182 && z && this.f15701b) {
            long j2 = this.f15707h;
            if (j2 != -9223372036854775807L) {
                long j3 = this.f15706g;
                int i2 = (int) (j - j3);
                this.f15700a.mo8824f(j2, this.f15703d ? 1 : 0, i2, i, (C2755q) null);
            }
        }
        if (this.f15704e != 179) {
            this.f15706g = j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13144c(int r5, long r6) {
        /*
            r4 = this;
            r4.f15704e = r5
            r0 = 0
            r4.f15703d = r0
            r1 = 179(0xb3, float:2.51E-43)
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 1
            if (r5 == r2) goto L_0x0013
            if (r5 != r1) goto L_0x0011
            r5 = 179(0xb3, float:2.51E-43)
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            r4.f15701b = r1
            if (r5 != r2) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r4.f15702c = r3
            r4.f15705f = r0
            r4.f15707h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2724p6.mo13144c(int, long):void");
    }

    /* renamed from: d */
    public final void mo13145d() {
        this.f15701b = false;
        this.f15702c = false;
        this.f15703d = false;
        this.f15704e = -1;
    }
}
