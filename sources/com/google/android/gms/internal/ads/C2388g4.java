package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.g4 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2388g4 {

    /* renamed from: G */
    private static final C2388g4 f9654G = new C2388g4(new C2311e2());

    /* renamed from: H */
    public static final za4 f9655H = C2235c0.f7539a;

    /* renamed from: A */
    public final int f9656A;

    /* renamed from: B */
    public final int f9657B;

    /* renamed from: C */
    public final int f9658C;

    /* renamed from: D */
    public final int f9659D;

    /* renamed from: E */
    public final int f9660E;

    /* renamed from: F */
    private int f9661F;

    /* renamed from: a */
    public final String f9662a;

    /* renamed from: b */
    public final String f9663b;

    /* renamed from: c */
    public final String f9664c;

    /* renamed from: d */
    public final int f9665d;

    /* renamed from: e */
    public final int f9666e;

    /* renamed from: f */
    public final int f9667f;

    /* renamed from: g */
    public final int f9668g;

    /* renamed from: h */
    public final int f9669h;

    /* renamed from: i */
    public final String f9670i;

    /* renamed from: j */
    public final k60 f9671j;

    /* renamed from: k */
    public final String f9672k;

    /* renamed from: l */
    public final String f9673l;

    /* renamed from: m */
    public final int f9674m;

    /* renamed from: n */
    public final List f9675n;

    /* renamed from: o */
    public final fl4 f9676o;

    /* renamed from: p */
    public final long f9677p;

    /* renamed from: q */
    public final int f9678q;

    /* renamed from: r */
    public final int f9679r;

    /* renamed from: s */
    public final float f9680s;

    /* renamed from: t */
    public final int f9681t;

    /* renamed from: u */
    public final float f9682u;

    /* renamed from: v */
    public final byte[] f9683v;

    /* renamed from: w */
    public final int f9684w;

    /* renamed from: x */
    public final be4 f9685x;

    /* renamed from: y */
    public final int f9686y;

    /* renamed from: z */
    public final int f9687z;

    private C2388g4(C2311e2 e2Var) {
        this.f9662a = e2Var.f8588a;
        this.f9663b = e2Var.f8589b;
        this.f9664c = gb2.m13182p(e2Var.f8590c);
        this.f9665d = e2Var.f8591d;
        int i = 0;
        this.f9666e = 0;
        int L = e2Var.f8592e;
        this.f9667f = L;
        int T = e2Var.f8593f;
        this.f9668g = T;
        this.f9669h = T != -1 ? T : L;
        this.f9670i = e2Var.f8594g;
        this.f9671j = e2Var.f8595h;
        this.f9672k = e2Var.f8596i;
        this.f9673l = e2Var.f8597j;
        this.f9674m = e2Var.f8598k;
        this.f9675n = e2Var.f8599l == null ? Collections.emptyList() : e2Var.f8599l;
        fl4 b0 = e2Var.f8600m;
        this.f9676o = b0;
        this.f9677p = e2Var.f8601n;
        this.f9678q = e2Var.f8602o;
        this.f9679r = e2Var.f8603p;
        this.f9680s = e2Var.f8604q;
        this.f9681t = e2Var.f8605r == -1 ? 0 : e2Var.f8605r;
        this.f9682u = e2Var.f8606s == -1.0f ? 1.0f : e2Var.f8606s;
        this.f9683v = e2Var.f8607t;
        this.f9684w = e2Var.f8608u;
        this.f9685x = e2Var.f8609v;
        this.f9686y = e2Var.f8610w;
        this.f9687z = e2Var.f8611x;
        this.f9656A = e2Var.f8612y;
        this.f9657B = e2Var.f8613z == -1 ? 0 : e2Var.f8613z;
        this.f9658C = e2Var.f8585A != -1 ? e2Var.f8585A : i;
        this.f9659D = e2Var.f8586B;
        this.f9660E = (e2Var.f8587C != 0 || b0 == null) ? e2Var.f8587C : 1;
    }

    /* renamed from: a */
    public final int mo10383a() {
        int i;
        int i2 = this.f9678q;
        if (i2 == -1 || (i = this.f9679r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: b */
    public final C2311e2 mo10384b() {
        return new C2311e2(this, (C2273d1) null);
    }

    /* renamed from: c */
    public final C2388g4 mo10385c(int i) {
        C2311e2 e2Var = new C2311e2(this, (C2273d1) null);
        e2Var.mo9752a(i);
        return new C2388g4(e2Var);
    }

    /* renamed from: d */
    public final boolean mo10386d(C2388g4 g4Var) {
        if (this.f9675n.size() != g4Var.f9675n.size()) {
            return false;
        }
        for (int i = 0; i < this.f9675n.size(); i++) {
            if (!Arrays.equals((byte[]) this.f9675n.get(i), (byte[]) g4Var.f9675n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && C2388g4.class == obj.getClass()) {
            C2388g4 g4Var = (C2388g4) obj;
            int i2 = this.f9661F;
            if ((i2 == 0 || (i = g4Var.f9661F) == 0 || i2 == i) && this.f9665d == g4Var.f9665d && this.f9667f == g4Var.f9667f && this.f9668g == g4Var.f9668g && this.f9674m == g4Var.f9674m && this.f9677p == g4Var.f9677p && this.f9678q == g4Var.f9678q && this.f9679r == g4Var.f9679r && this.f9681t == g4Var.f9681t && this.f9684w == g4Var.f9684w && this.f9686y == g4Var.f9686y && this.f9687z == g4Var.f9687z && this.f9656A == g4Var.f9656A && this.f9657B == g4Var.f9657B && this.f9658C == g4Var.f9658C && this.f9659D == g4Var.f9659D && this.f9660E == g4Var.f9660E && Float.compare(this.f9680s, g4Var.f9680s) == 0 && Float.compare(this.f9682u, g4Var.f9682u) == 0 && gb2.m13186t(this.f9662a, g4Var.f9662a) && gb2.m13186t(this.f9663b, g4Var.f9663b) && gb2.m13186t(this.f9670i, g4Var.f9670i) && gb2.m13186t(this.f9672k, g4Var.f9672k) && gb2.m13186t(this.f9673l, g4Var.f9673l) && gb2.m13186t(this.f9664c, g4Var.f9664c) && Arrays.equals(this.f9683v, g4Var.f9683v) && gb2.m13186t(this.f9671j, g4Var.f9671j) && gb2.m13186t(this.f9685x, g4Var.f9685x) && gb2.m13186t(this.f9676o, g4Var.f9676o) && mo10386d(g4Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.f9661F;
        if (i6 != 0) {
            return i6;
        }
        String str = this.f9662a;
        int i7 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i8 = (i + 527) * 31;
        String str2 = this.f9663b;
        int hashCode = (i8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9664c;
        if (str3 == null) {
            i2 = 0;
        } else {
            i2 = str3.hashCode();
        }
        int i9 = (((((((hashCode + i2) * 31) + this.f9665d) * 961) + this.f9667f) * 31) + this.f9668g) * 31;
        String str4 = this.f9670i;
        if (str4 == null) {
            i3 = 0;
        } else {
            i3 = str4.hashCode();
        }
        int i10 = (i9 + i3) * 31;
        k60 k60 = this.f9671j;
        if (k60 == null) {
            i4 = 0;
        } else {
            i4 = k60.hashCode();
        }
        int i11 = (i10 + i4) * 31;
        String str5 = this.f9672k;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        String str6 = this.f9673l;
        if (str6 != null) {
            i7 = str6.hashCode();
        }
        int floatToIntBits = ((((((((((((((((((((((((((((((i12 + i7) * 31) + this.f9674m) * 31) + ((int) this.f9677p)) * 31) + this.f9678q) * 31) + this.f9679r) * 31) + Float.floatToIntBits(this.f9680s)) * 31) + this.f9681t) * 31) + Float.floatToIntBits(this.f9682u)) * 31) + this.f9684w) * 31) + this.f9686y) * 31) + this.f9687z) * 31) + this.f9656A) * 31) + this.f9657B) * 31) + this.f9658C) * 31) + this.f9659D) * 31) + this.f9660E;
        this.f9661F = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String str = this.f9662a;
        String str2 = this.f9663b;
        String str3 = this.f9672k;
        String str4 = this.f9673l;
        String str5 = this.f9670i;
        int i = this.f9669h;
        String str6 = this.f9664c;
        int i2 = this.f9678q;
        int i3 = this.f9679r;
        float f = this.f9680s;
        int i4 = this.f9686y;
        int i5 = this.f9687z;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5 + ", " + i + ", " + str6 + ", [" + i2 + ", " + i3 + ", " + f + "], [" + i4 + ", " + i5 + "])";
    }
}
