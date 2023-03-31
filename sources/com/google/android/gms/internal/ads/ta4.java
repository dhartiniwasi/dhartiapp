package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ta4 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f17923a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f17924b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f17925c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public mg4 f17926d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f17927e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f17928f;

    /* renamed from: g */
    final /* synthetic */ ua4 f17929g;

    public ta4(ua4 ua4, String str, int i, mg4 mg4) {
        this.f17929g = ua4;
        this.f17923a = str;
        this.f17924b = i;
        this.f17925c = mg4 == null ? -1 : mg4.f12632d;
        if (mg4 != null && mg4.mo11883b()) {
            this.f17926d = mg4;
        }
    }

    /* renamed from: g */
    public final void mo14269g(int i, mg4 mg4) {
        if (this.f17925c == -1 && i == this.f17924b && mg4 != null) {
            this.f17925c = mg4.f12632d;
        }
    }

    /* renamed from: j */
    public final boolean mo14270j(int i, mg4 mg4) {
        if (mg4 == null) {
            return i == this.f17924b;
        }
        mg4 mg42 = this.f17926d;
        return mg42 == null ? !mg4.mo11883b() && mg4.f12632d == this.f17925c : mg4.f12632d == mg42.f12632d && mg4.f12630b == mg42.f12630b && mg4.f12631c == mg42.f12631c;
    }

    /* renamed from: k */
    public final boolean mo14271k(m84 m84) {
        long j = this.f17925c;
        if (j == -1) {
            return false;
        }
        mg4 mg4 = m84.f13272d;
        if (mg4 == null) {
            return this.f17924b != m84.f13271c;
        }
        if (mg4.f12632d > j) {
            return true;
        }
        if (this.f17926d == null) {
            return false;
        }
        int a = m84.f13270b.mo8899a(mg4.f12629a);
        int a2 = m84.f13270b.mo8899a(this.f17926d.f12629a);
        mg4 mg42 = m84.f13272d;
        if (mg42.f12632d < this.f17926d.f12632d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        if (mg42.mo11883b()) {
            mg4 mg43 = m84.f13272d;
            int i = mg43.f12630b;
            int i2 = mg43.f12631c;
            mg4 mg44 = this.f17926d;
            int i3 = mg44.f12630b;
            if (i > i3 || (i == i3 && i2 > mg44.f12631c)) {
                return true;
            }
            return false;
        }
        int i4 = m84.f13272d.f12633e;
        return i4 == -1 || i4 > this.f17926d.f12630b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r8.mo8901c()) goto L_0x004a;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14272l(com.google.android.gms.internal.ads.gt0 r7, com.google.android.gms.internal.ads.gt0 r8) {
        /*
            r6 = this;
            int r0 = r6.f17924b
            int r1 = r7.mo8901c()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0013
            int r7 = r8.mo8901c()
            if (r0 >= r7) goto L_0x0011
            goto L_0x004a
        L_0x0011:
            r0 = -1
            goto L_0x004a
        L_0x0013:
            com.google.android.gms.internal.ads.ua4 r1 = r6.f17929g
            com.google.android.gms.internal.ads.fs0 r1 = r1.f18479a
            r4 = 0
            r7.mo8903e(r0, r1, r4)
            com.google.android.gms.internal.ads.ua4 r0 = r6.f17929g
            com.google.android.gms.internal.ads.fs0 r0 = r0.f18479a
            int r0 = r0.f9438m
        L_0x0026:
            com.google.android.gms.internal.ads.ua4 r1 = r6.f17929g
            com.google.android.gms.internal.ads.fs0 r1 = r1.f18479a
            int r1 = r1.f9439n
            if (r0 > r1) goto L_0x0011
            java.lang.Object r1 = r7.mo8904f(r0)
            int r1 = r8.mo8899a(r1)
            if (r1 == r3) goto L_0x0047
            com.google.android.gms.internal.ads.ua4 r7 = r6.f17929g
            com.google.android.gms.internal.ads.dq0 r7 = r7.f18480b
            com.google.android.gms.internal.ads.dq0 r7 = r8.mo8902d(r1, r7, r2)
            int r0 = r7.f8361c
            goto L_0x004a
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x004a:
            r6.f17924b = r0
            if (r0 != r3) goto L_0x004f
            return r2
        L_0x004f:
            com.google.android.gms.internal.ads.mg4 r7 = r6.f17926d
            r0 = 1
            if (r7 != 0) goto L_0x0055
            return r0
        L_0x0055:
            java.lang.Object r7 = r7.f12629a
            int r7 = r8.mo8899a(r7)
            if (r7 == r3) goto L_0x005e
            return r0
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ta4.mo14272l(com.google.android.gms.internal.ads.gt0, com.google.android.gms.internal.ads.gt0):boolean");
    }
}
