package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.z */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3088z implements qn4 {

    /* renamed from: n */
    public static final xn4 f20868n = C3051y.f20399b;

    /* renamed from: o */
    private static final int[] f20869o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: p */
    private static final int[] f20870p;

    /* renamed from: q */
    private static final byte[] f20871q = gb2.m13132B("#!AMR\n");

    /* renamed from: r */
    private static final byte[] f20872r = gb2.m13132B("#!AMR-WB\n");

    /* renamed from: s */
    private static final int f20873s;

    /* renamed from: a */
    private final byte[] f20874a = new byte[1];

    /* renamed from: b */
    private boolean f20875b;

    /* renamed from: c */
    private long f20876c;

    /* renamed from: d */
    private int f20877d;

    /* renamed from: e */
    private int f20878e;

    /* renamed from: f */
    private boolean f20879f;

    /* renamed from: g */
    private int f20880g = -1;

    /* renamed from: h */
    private int f20881h;

    /* renamed from: i */
    private long f20882i;

    /* renamed from: j */
    private tn4 f20883j;

    /* renamed from: k */
    private C2792r f20884k;

    /* renamed from: l */
    private C2643n f20885l;

    /* renamed from: m */
    private boolean f20886m;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f20870p = iArr;
        f20873s = iArr[8];
    }

    public C3088z(int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ EOFException -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A[Catch:{ EOFException -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m24312a(com.google.android.gms.internal.ads.rn4 r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f20878e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0091
            r12.mo9981W()     // Catch:{ EOFException -> 0x0090 }
            byte[] r0 = r11.f20874a     // Catch:{ EOFException -> 0x0090 }
            r4 = r12
            com.google.android.gms.internal.ads.fn4 r4 = (com.google.android.gms.internal.ads.fn4) r4     // Catch:{ EOFException -> 0x0090 }
            r4.mo9986i(r0, r3, r2, r3)     // Catch:{ EOFException -> 0x0090 }
            byte[] r0 = r11.f20874a     // Catch:{ EOFException -> 0x0090 }
            byte r0 = r0[r3]     // Catch:{ EOFException -> 0x0090 }
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L_0x007a
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r11.f20875b     // Catch:{ EOFException -> 0x0090 }
            if (r4 == 0) goto L_0x002c
            r6 = 10
            if (r0 < r6) goto L_0x0037
            r6 = 13
            if (r0 <= r6) goto L_0x002c
            goto L_0x0037
        L_0x002c:
            if (r4 != 0) goto L_0x0055
            r6 = 12
            if (r0 < r6) goto L_0x0037
            r6 = 14
            if (r0 > r6) goto L_0x0037
            goto L_0x0055
        L_0x0037:
            if (r4 == 0) goto L_0x003e
            int[] r4 = f20870p     // Catch:{ EOFException -> 0x0090 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0090 }
            goto L_0x0042
        L_0x003e:
            int[] r4 = f20869o     // Catch:{ EOFException -> 0x0090 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0090 }
        L_0x0042:
            r11.f20877d = r0     // Catch:{ EOFException -> 0x0090 }
            r11.f20878e = r0
            int r4 = r11.f20880g
            if (r4 != r1) goto L_0x004d
            r11.f20880g = r0
            r4 = r0
        L_0x004d:
            if (r4 != r0) goto L_0x0091
            int r4 = r11.f20881h
            int r4 = r4 + r2
            r11.f20881h = r4
            goto L_0x0091
        L_0x0055:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L_0x005c
            r12 = r3
        L_0x005c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0090 }
            r2.<init>()     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch:{ EOFException -> 0x0090 }
            r2.append(r12)     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch:{ EOFException -> 0x0090 }
            r2.append(r0)     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r12 = r2.toString()     // Catch:{ EOFException -> 0x0090 }
            com.google.android.gms.internal.ads.ea0 r12 = com.google.android.gms.internal.ads.ea0.m11990a(r12, r5)     // Catch:{ EOFException -> 0x0090 }
            throw r12     // Catch:{ EOFException -> 0x0090 }
        L_0x007a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0090 }
            r12.<init>()     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch:{ EOFException -> 0x0090 }
            r12.append(r0)     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r12 = r12.toString()     // Catch:{ EOFException -> 0x0090 }
            com.google.android.gms.internal.ads.ea0 r12 = com.google.android.gms.internal.ads.ea0.m11990a(r12, r5)     // Catch:{ EOFException -> 0x0090 }
            throw r12     // Catch:{ EOFException -> 0x0090 }
        L_0x0090:
            return r1
        L_0x0091:
            com.google.android.gms.internal.ads.r r4 = r11.f20884k
            int r12 = com.google.android.gms.internal.ads.C2717p.m18260a(r4, r12, r0, r2)
            if (r12 != r1) goto L_0x009a
            return r1
        L_0x009a:
            int r0 = r11.f20878e
            int r0 = r0 - r12
            r11.f20878e = r0
            if (r0 <= 0) goto L_0x00a2
            return r3
        L_0x00a2:
            com.google.android.gms.internal.ads.r r4 = r11.f20884k
            long r5 = r11.f20876c
            r7 = 1
            int r8 = r11.f20877d
            r9 = 0
            r10 = 0
            r4.mo8824f(r5, r7, r8, r9, r10)
            long r0 = r11.f20876c
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f20876c = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3088z.m24312a(com.google.android.gms.internal.ads.rn4):int");
    }

    /* renamed from: d */
    private static boolean m24313d(rn4 rn4, byte[] bArr) throws IOException {
        rn4.mo9981W();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((fn4) rn4).mo9986i(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: e */
    private final boolean m24314e(rn4 rn4) throws IOException {
        byte[] bArr = f20871q;
        if (m24313d(rn4, bArr)) {
            this.f20875b = false;
            ((fn4) rn4).mo10218n(bArr.length, false);
            return true;
        }
        byte[] bArr2 = f20872r;
        if (!m24313d(rn4, bArr2)) {
            return false;
        }
        this.f20875b = true;
        ((fn4) rn4).mo10218n(bArr2.length, false);
        return true;
    }

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        return m24314e(rn4);
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f20883j = tn4;
        this.f20884k = tn4.mo10060n(0, 1);
        tn4.mo10058C();
    }

    /* renamed from: f */
    public final int mo9025f(rn4 rn4, C2532k kVar) throws IOException {
        v91.m22048b(this.f20884k);
        int i = gb2.f9812a;
        if (rn4.mo9003T() != 0 || m24314e(rn4)) {
            if (!this.f20886m) {
                this.f20886m = true;
                boolean z = this.f20875b;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : 16000;
                C2792r rVar = this.f20884k;
                C2311e2 e2Var = new C2311e2();
                e2Var.mo9776s(str);
                e2Var.mo9769l(f20873s);
                e2Var.mo9759e0(1);
                e2Var.mo9777t(i2);
                rVar.mo8823e(e2Var.mo9782y());
            }
            int a = m24312a(rn4);
            if (this.f20879f) {
                return a;
            }
            C2606m mVar = new C2606m(-9223372036854775807L, 0);
            this.f20885l = mVar;
            this.f20883j.mo10059j(mVar);
            this.f20879f = true;
            return a;
        }
        throw ea0.m11990a("Could not find AMR header.", (Throwable) null);
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        this.f20876c = 0;
        this.f20877d = 0;
        this.f20878e = 0;
        this.f20882i = 0;
    }
}
