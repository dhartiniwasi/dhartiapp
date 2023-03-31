package p179z3;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.pm0;
import p060h4.C4571q4;
import p060h4.C4584t;

/* renamed from: z3.h */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C6337h {

    /* renamed from: i */
    public static final C6337h f30518i = new C6337h(320, 50, "320x50_mb");

    /* renamed from: j */
    public static final C6337h f30519j = new C6337h(468, 60, "468x60_as");

    /* renamed from: k */
    public static final C6337h f30520k = new C6337h(320, 100, "320x100_as");

    /* renamed from: l */
    public static final C6337h f30521l = new C6337h(728, 90, "728x90_as");

    /* renamed from: m */
    public static final C6337h f30522m = new C6337h(300, 250, "300x250_as");

    /* renamed from: n */
    public static final C6337h f30523n = new C6337h(160, 600, "160x600_as");
    @Deprecated

    /* renamed from: o */
    public static final C6337h f30524o = new C6337h(-1, -2, "smart_banner");

    /* renamed from: p */
    public static final C6337h f30525p = new C6337h(-3, -4, "fluid");

    /* renamed from: q */
    public static final C6337h f30526q = new C6337h(0, 0, "invalid");

    /* renamed from: r */
    public static final C6337h f30527r = new C6337h(-3, 0, "search_v2");

    /* renamed from: s */
    public static final C6337h f30528s = new C6337h(50, 50, "50x50_mb");

    /* renamed from: a */
    private final int f30529a;

    /* renamed from: b */
    private final int f30530b;

    /* renamed from: c */
    private final String f30531c;

    /* renamed from: d */
    private boolean f30532d;

    /* renamed from: e */
    private boolean f30533e;

    /* renamed from: f */
    private int f30534f;

    /* renamed from: g */
    private boolean f30535g;

    /* renamed from: h */
    private int f30536h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6337h(int r4, int r5) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L_0x0006
            java.lang.String r0 = "FULL"
            goto L_0x000a
        L_0x0006:
            java.lang.String r0 = java.lang.String.valueOf(r4)
        L_0x000a:
            r1 = -2
            if (r5 != r1) goto L_0x0010
            java.lang.String r1 = "AUTO"
            goto L_0x0014
        L_0x0010:
            java.lang.String r1 = java.lang.String.valueOf(r5)
        L_0x0014:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "_as"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p179z3.C6337h.<init>(int, int):void");
    }

    /* renamed from: a */
    public static C6337h m37301a(Context context, int i) {
        C6337h e = im0.m14405e(context, i, 50, 0);
        e.f30532d = true;
        return e;
    }

    /* renamed from: b */
    public static C6337h m37302b(Context context, int i) {
        int c = im0.m14404c(context, 0);
        if (c == -1) {
            return f30526q;
        }
        C6337h hVar = new C6337h(i, 0);
        hVar.f30534f = c;
        hVar.f30533e = true;
        return hVar;
    }

    /* renamed from: e */
    public static C6337h m37303e(int i, int i2) {
        C6337h hVar = new C6337h(i, 0);
        hVar.f30534f = i2;
        hVar.f30533e = true;
        if (i2 < 32) {
            pm0.m18667g("The maximum height set for the inline adaptive ad size was " + i2 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return hVar;
    }

    /* renamed from: f */
    public static C6337h m37304f(Context context, int i) {
        C6337h e = im0.m14405e(context, i, 50, 2);
        e.f30532d = true;
        return e;
    }

    /* renamed from: g */
    public static C6337h m37305g(Context context, int i) {
        int c = im0.m14404c(context, 2);
        C6337h hVar = new C6337h(i, 0);
        if (c == -1) {
            return f30526q;
        }
        hVar.f30534f = c;
        hVar.f30533e = true;
        return hVar;
    }

    /* renamed from: h */
    public static C6337h m37306h(Context context, int i) {
        C6337h e = im0.m14405e(context, i, 50, 1);
        e.f30532d = true;
        return e;
    }

    /* renamed from: i */
    public static C6337h m37307i(Context context, int i) {
        int c = im0.m14404c(context, 1);
        C6337h hVar = new C6337h(i, 0);
        if (c == -1) {
            return f30526q;
        }
        hVar.f30534f = c;
        hVar.f30533e = true;
        return hVar;
    }

    /* renamed from: c */
    public int mo21664c() {
        return this.f30530b;
    }

    /* renamed from: d */
    public int mo21665d(Context context) {
        int i = this.f30530b;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return C4571q4.m29981I1(context.getResources().getDisplayMetrics());
        }
        C4584t.m30036b();
        return im0.m14418y(context, this.f30530b);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6337h)) {
            return false;
        }
        C6337h hVar = (C6337h) obj;
        return this.f30529a == hVar.f30529a && this.f30530b == hVar.f30530b && this.f30531c.equals(hVar.f30531c);
    }

    public int hashCode() {
        return this.f30531c.hashCode();
    }

    /* renamed from: j */
    public int mo21668j() {
        return this.f30529a;
    }

    /* renamed from: k */
    public int mo21669k(Context context) {
        int i = this.f30529a;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            C4584t.m30036b();
            return im0.m14418y(context, this.f30529a);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<C4571q4> creator = C4571q4.CREATOR;
        return displayMetrics.widthPixels;
    }

    /* renamed from: l */
    public boolean mo21670l() {
        return this.f30529a == -3 && this.f30530b == -4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final int mo21671m() {
        return this.f30536h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final int mo21672n() {
        return this.f30534f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo21673o(int i) {
        this.f30534f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo21674p(int i) {
        this.f30536h = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo21675q(boolean z) {
        this.f30533e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo21676r(boolean z) {
        this.f30535g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo21677s() {
        return this.f30532d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo21678t() {
        return this.f30533e;
    }

    public String toString() {
        return this.f30531c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo21680u() {
        return this.f30535g;
    }

    C6337h(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f30529a = i;
            this.f30530b = i2;
            this.f30531c = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }
}
