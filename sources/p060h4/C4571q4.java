package p060h4;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import p040e5.C4240a;
import p040e5.C4243c;
import p179z3.C6337h;

/* renamed from: h4.q4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4571q4 extends C4240a {
    public static final Parcelable.Creator<C4571q4> CREATOR = new C4577r4();

    /* renamed from: a */
    public final String f24972a;

    /* renamed from: b */
    public final int f24973b;

    /* renamed from: c */
    public final int f24974c;

    /* renamed from: d */
    public final boolean f24975d;

    /* renamed from: e */
    public final int f24976e;

    /* renamed from: f */
    public final int f24977f;

    /* renamed from: g */
    public final C4571q4[] f24978g;

    /* renamed from: h */
    public final boolean f24979h;

    /* renamed from: i */
    public final boolean f24980i;

    /* renamed from: r */
    public boolean f24981r;

    /* renamed from: s */
    public boolean f24982s;

    /* renamed from: t */
    public boolean f24983t;

    /* renamed from: u */
    public boolean f24984u;

    /* renamed from: v */
    public boolean f24985v;

    /* renamed from: w */
    public boolean f24986w;

    public C4571q4() {
        this("interstitial_mb", 0, 0, true, 0, 0, (C4571q4[]) null, false, false, false, false, false, false, false, false);
    }

    /* renamed from: I1 */
    public static int m29981I1(DisplayMetrics displayMetrics) {
        return (int) (((float) m29986N1(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: J1 */
    public static C4571q4 m29982J1() {
        return new C4571q4("interstitial_mb", 0, 0, false, 0, 0, (C4571q4[]) null, false, false, false, false, true, false, false, false);
    }

    /* renamed from: K1 */
    public static C4571q4 m29983K1() {
        return new C4571q4("320x50_mb", 0, 0, false, 0, 0, (C4571q4[]) null, true, false, false, false, false, false, false, false);
    }

    /* renamed from: L1 */
    public static C4571q4 m29984L1() {
        return new C4571q4("reward_mb", 0, 0, true, 0, 0, (C4571q4[]) null, false, false, false, false, false, false, false, false);
    }

    /* renamed from: M1 */
    public static C4571q4 m29985M1() {
        return new C4571q4("invalid", 0, 0, false, 0, 0, (C4571q4[]) null, false, false, false, true, false, false, false, false);
    }

    /* renamed from: N1 */
    private static int m29986N1(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f24972a, false);
        C4243c.m28614k(parcel, 3, this.f24973b);
        C4243c.m28614k(parcel, 4, this.f24974c);
        C4243c.m28606c(parcel, 5, this.f24975d);
        C4243c.m28614k(parcel, 6, this.f24976e);
        C4243c.m28614k(parcel, 7, this.f24977f);
        C4243c.m28623t(parcel, 8, this.f24978g, i, false);
        C4243c.m28606c(parcel, 9, this.f24979h);
        C4243c.m28606c(parcel, 10, this.f24980i);
        C4243c.m28606c(parcel, 11, this.f24981r);
        C4243c.m28606c(parcel, 12, this.f24982s);
        C4243c.m28606c(parcel, 13, this.f24983t);
        C4243c.m28606c(parcel, 14, this.f24984u);
        C4243c.m28606c(parcel, 15, this.f24985v);
        C4243c.m28606c(parcel, 16, this.f24986w);
        C4243c.m28605b(parcel, a);
    }

    public C4571q4(Context context, C6337h hVar) {
        this(context, new C6337h[]{hVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4571q4(android.content.Context r14, p179z3.C6337h[] r15) {
        /*
            r13 = this;
            r13.<init>()
            r0 = 0
            r1 = r15[r0]
            r13.f24975d = r0
            boolean r2 = r1.mo21670l()
            r13.f24980i = r2
            boolean r3 = p179z3.C6322a0.m37265f(r1)
            r13.f24984u = r3
            boolean r3 = p179z3.C6322a0.m37266g(r1)
            r13.f24985v = r3
            boolean r3 = p179z3.C6322a0.m37267h(r1)
            r13.f24986w = r3
            if (r2 == 0) goto L_0x0031
            z3.h r3 = p179z3.C6337h.f30518i
            int r4 = r3.mo21668j()
            r13.f24976e = r4
            int r3 = r3.mo21664c()
            r13.f24973b = r3
            goto L_0x005d
        L_0x0031:
            boolean r4 = r13.f24985v
            if (r4 == 0) goto L_0x0042
            int r3 = r1.mo21668j()
            r13.f24976e = r3
            int r3 = p179z3.C6322a0.m37260a(r1)
            r13.f24973b = r3
            goto L_0x005d
        L_0x0042:
            if (r3 == 0) goto L_0x0051
            int r3 = r1.mo21668j()
            r13.f24976e = r3
            int r3 = p179z3.C6322a0.m37261b(r1)
            r13.f24973b = r3
            goto L_0x005d
        L_0x0051:
            int r3 = r1.mo21668j()
            r13.f24976e = r3
            int r3 = r1.mo21664c()
            r13.f24973b = r3
        L_0x005d:
            int r4 = r13.f24976e
            android.content.res.Resources r5 = r14.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r6 = -1
            if (r4 != r6) goto L_0x00f4
            p060h4.C4584t.m30036b()
            android.content.res.Resources r7 = r14.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r8 = 2
            if (r7 == r8) goto L_0x007b
            goto L_0x00dc
        L_0x007b:
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r8 = r7.heightPixels
            float r8 = (float) r8
            float r7 = r7.density
            float r8 = r8 / r7
            int r7 = (int) r8
            r8 = 600(0x258, float:8.41E-43)
            if (r7 >= r8) goto L_0x00dc
            p060h4.C4584t.m30036b()
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            java.lang.String r8 = "window"
            java.lang.Object r8 = r14.getSystemService(r8)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            if (r8 == 0) goto L_0x00dc
            android.view.Display r8 = r8.getDefaultDisplay()
            r8.getRealMetrics(r7)
            int r9 = r7.heightPixels
            int r10 = r7.widthPixels
            r8.getMetrics(r7)
            int r8 = r7.heightPixels
            int r7 = r7.widthPixels
            if (r8 != r9) goto L_0x00dc
            if (r7 != r10) goto L_0x00dc
            int r7 = r5.widthPixels
            p060h4.C4584t.m30036b()
            android.content.res.Resources r8 = r14.getResources()
            java.lang.String r9 = "navigation_bar_width"
            java.lang.String r10 = "dimen"
            java.lang.String r11 = "android"
            int r8 = r8.getIdentifier(r9, r10, r11)
            if (r8 <= 0) goto L_0x00d7
            android.content.res.Resources r9 = r14.getResources()
            int r8 = r9.getDimensionPixelSize(r8)
            goto L_0x00d8
        L_0x00d7:
            r8 = 0
        L_0x00d8:
            int r7 = r7 - r8
            r13.f24977f = r7
            goto L_0x00e0
        L_0x00dc:
            int r7 = r5.widthPixels
            r13.f24977f = r7
        L_0x00e0:
            float r7 = (float) r7
            float r8 = r5.density
            float r7 = r7 / r8
            double r7 = (double) r7
            int r9 = (int) r7
            double r10 = (double) r9
            double r7 = r7 - r10
            r10 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0101
            int r9 = r9 + 1
            goto L_0x0101
        L_0x00f4:
            int r9 = r13.f24976e
            p060h4.C4584t.m30036b()
            int r7 = r13.f24976e
            int r7 = com.google.android.gms.internal.ads.im0.m14410q(r5, r7)
            r13.f24977f = r7
        L_0x0101:
            r7 = -2
            if (r3 != r7) goto L_0x0109
            int r8 = m29986N1(r5)
            goto L_0x010b
        L_0x0109:
            int r8 = r13.f24973b
        L_0x010b:
            p060h4.C4584t.m30036b()
            int r5 = com.google.android.gms.internal.ads.im0.m14410q(r5, r8)
            r13.f24974c = r5
            java.lang.String r5 = "_as"
            java.lang.String r10 = "x"
            if (r4 == r6) goto L_0x014e
            if (r3 != r7) goto L_0x011d
            goto L_0x014e
        L_0x011d:
            boolean r3 = r13.f24985v
            if (r3 != 0) goto L_0x0132
            boolean r3 = r13.f24986w
            if (r3 == 0) goto L_0x0126
            goto L_0x0132
        L_0x0126:
            if (r2 == 0) goto L_0x012b
            java.lang.String r1 = "320x50_mb"
            goto L_0x014b
        L_0x012b:
            java.lang.String r1 = r1.toString()
            r13.f24972a = r1
            goto L_0x0165
        L_0x0132:
            int r1 = r13.f24976e
            int r2 = r13.f24973b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r10)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
        L_0x014b:
            r13.f24972a = r1
            goto L_0x0165
        L_0x014e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r10)
            r1.append(r8)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r13.f24972a = r1
        L_0x0165:
            int r1 = r15.length
            r2 = 1
            if (r1 <= r2) goto L_0x017f
            h4.q4[] r1 = new p060h4.C4571q4[r1]
            r13.f24978g = r1
            r1 = 0
        L_0x016e:
            int r2 = r15.length
            if (r1 >= r2) goto L_0x0182
            h4.q4[] r2 = r13.f24978g
            h4.q4 r3 = new h4.q4
            r4 = r15[r1]
            r3.<init>((android.content.Context) r14, (p179z3.C6337h) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x016e
        L_0x017f:
            r14 = 0
            r13.f24978g = r14
        L_0x0182:
            r13.f24979h = r0
            r13.f24981r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4571q4.<init>(android.content.Context, z3.h[]):void");
    }

    C4571q4(String str, int i, int i2, boolean z, int i3, int i4, C4571q4[] q4VarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f24972a = str;
        this.f24973b = i;
        this.f24974c = i2;
        this.f24975d = z;
        this.f24976e = i3;
        this.f24977f = i4;
        this.f24978g = q4VarArr;
        this.f24979h = z2;
        this.f24980i = z3;
        this.f24981r = z4;
        this.f24982s = z5;
        this.f24983t = z6;
        this.f24984u = z7;
        this.f24985v = z8;
        this.f24986w = z9;
    }
}
