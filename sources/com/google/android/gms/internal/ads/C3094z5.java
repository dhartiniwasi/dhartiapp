package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.z5 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3094z5 implements qn4 {

    /* renamed from: d */
    public static final xn4 f20933d = C3057y5.f20466b;

    /* renamed from: a */
    private final C2167a6 f20934a = new C2167a6((String) null);

    /* renamed from: b */
    private final y22 f20935b = new y22(2786);

    /* renamed from: c */
    private boolean f20936c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r9.mo9981W();
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        if ((r5 - r3) >= 8192) goto L_0x004c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9023b(com.google.android.gms.internal.ads.rn4 r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.y22 r0 = new com.google.android.gms.internal.ads.y22
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo15295h()
            r5 = r9
            com.google.android.gms.internal.ads.fn4 r5 = (com.google.android.gms.internal.ads.fn4) r5
            r5.mo9986i(r4, r2, r1, r2)
            r0.mo15293f(r2)
            int r4 = r0.mo15308u()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L_0x0065
            r9.mo9981W()
            r4 = r9
            com.google.android.gms.internal.ads.fn4 r4 = (com.google.android.gms.internal.ads.fn4) r4
            r4.mo10217m(r3, r2)
            r5 = r3
        L_0x0029:
            r1 = 0
        L_0x002a:
            byte[] r6 = r0.mo15295h()
            r7 = 6
            r4.mo9986i(r6, r2, r7, r2)
            r0.mo15293f(r2)
            int r6 = r0.mo15310w()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L_0x004d
            r9.mo9981W()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L_0x004c
            r4.mo10217m(r5, r2)
            goto L_0x0029
        L_0x004c:
            return r2
        L_0x004d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0053
            return r6
        L_0x0053:
            byte[] r6 = r0.mo15295h()
            int r6 = com.google.android.gms.internal.ads.qm4.m19294b(r6)
            r7 = -1
            if (r6 != r7) goto L_0x005f
            return r2
        L_0x005f:
            int r6 = r6 + -6
            r4.mo10217m(r6, r2)
            goto L_0x002a
        L_0x0065:
            r4 = 3
            r0.mo15294g(r4)
            int r4 = r0.mo15305r()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo10217m(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3094z5.mo9023b(com.google.android.gms.internal.ads.rn4):boolean");
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f20934a.mo8217c(tn4, new C3059y7(RecyclerView.UNDEFINED_DURATION, 0, 1));
        tn4.mo10058C();
        tn4.mo10059j(new C2606m(-9223372036854775807L, 0));
    }

    /* renamed from: f */
    public final int mo9025f(rn4 rn4, C2532k kVar) throws IOException {
        int c = rn4.mo8792c(this.f20935b.mo15295h(), 0, 2786);
        if (c == -1) {
            return -1;
        }
        this.f20935b.mo15293f(0);
        this.f20935b.mo15292e(c);
        if (!this.f20936c) {
            this.f20934a.mo8218d(0, 4);
            this.f20936c = true;
        }
        this.f20934a.mo8216b(this.f20935b);
        return 0;
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        this.f20936c = false;
        this.f20934a.mo8215a();
    }
}
