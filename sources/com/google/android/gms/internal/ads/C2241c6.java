package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.c6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2241c6 implements qn4 {

    /* renamed from: d */
    public static final xn4 f7613d = C2204b6.f7105b;

    /* renamed from: a */
    private final C2278d6 f7614a = new C2278d6((String) null);

    /* renamed from: b */
    private final y22 f7615b = new y22(16384);

    /* renamed from: c */
    private boolean f7616c;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        r16.mo9981W();
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004f, code lost:
        if ((r5 - r3) >= 8192) goto L_0x0055;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9023b(com.google.android.gms.internal.ads.rn4 r16) throws java.io.IOException {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.y22 r0 = new com.google.android.gms.internal.ads.y22
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo15295h()
            r5 = r16
            com.google.android.gms.internal.ads.fn4 r5 = (com.google.android.gms.internal.ads.fn4) r5
            r5.mo9986i(r4, r2, r1, r2)
            r0.mo15293f(r2)
            int r4 = r0.mo15308u()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L_0x009e
            r16.mo9981W()
            r4 = r16
            com.google.android.gms.internal.ads.fn4 r4 = (com.google.android.gms.internal.ads.fn4) r4
            r4.mo10217m(r3, r2)
            r5 = r3
        L_0x002c:
            r1 = 0
        L_0x002d:
            byte[] r6 = r0.mo15295h()
            r8 = 7
            r4.mo9986i(r6, r2, r8, r2)
            r0.mo15293f(r2)
            int r6 = r0.mo15310w()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L_0x0056
            if (r6 == r10) goto L_0x0056
            r16.mo9981W()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L_0x0055
            r4.mo10217m(r5, r2)
            goto L_0x002c
        L_0x0055:
            return r2
        L_0x0056:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L_0x005c
            return r9
        L_0x005c:
            byte[] r9 = r0.mo15295h()
            int r12 = com.google.android.gms.internal.ads.tm4.f18167b
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L_0x0068
            r12 = -1
            goto L_0x0095
        L_0x0068:
            r12 = 2
            byte r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            byte r14 = r9[r7]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L_0x008f
            byte r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            r12 = 5
            byte r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r11 = r11 | r12
            r12 = 6
            byte r9 = r9[r12]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r12 = r11 | r9
            goto L_0x0090
        L_0x008f:
            r8 = 4
        L_0x0090:
            if (r6 != r10) goto L_0x0094
            int r8 = r8 + 2
        L_0x0094:
            int r12 = r12 + r8
        L_0x0095:
            if (r12 != r13) goto L_0x0098
            return r2
        L_0x0098:
            int r12 = r12 + -7
            r4.mo10217m(r12, r2)
            goto L_0x002d
        L_0x009e:
            r0.mo15294g(r7)
            int r4 = r0.mo15305r()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo10217m(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2241c6.mo9023b(com.google.android.gms.internal.ads.rn4):boolean");
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f7614a.mo8217c(tn4, new C3059y7(RecyclerView.UNDEFINED_DURATION, 0, 1));
        tn4.mo10058C();
        tn4.mo10059j(new C2606m(-9223372036854775807L, 0));
    }

    /* renamed from: f */
    public final int mo9025f(rn4 rn4, C2532k kVar) throws IOException {
        int c = rn4.mo8792c(this.f7615b.mo15295h(), 0, 16384);
        if (c == -1) {
            return -1;
        }
        this.f7615b.mo15293f(0);
        this.f7615b.mo15292e(c);
        if (!this.f7616c) {
            this.f7614a.mo8218d(0, 4);
            this.f7616c = true;
        }
        this.f7614a.mo8216b(this.f7615b);
        return 0;
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        this.f7616c = false;
        this.f7614a.mo8215a();
    }
}
