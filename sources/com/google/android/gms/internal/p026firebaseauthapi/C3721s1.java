package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3721s1 {

    /* renamed from: a */
    private final C3688r1 f22650a;

    private C3721s1(C3688r1 r1Var) {
        C3623p2.m26442f(r1Var, "output");
        this.f22650a = r1Var;
        r1Var.f22601a = this;
    }

    /* renamed from: l */
    public static C3721s1 m26818l(C3688r1 r1Var) {
        C3721s1 s1Var = r1Var.f22601a;
        return s1Var != null ? s1Var : new C3721s1(r1Var);
    }

    /* renamed from: A */
    public final void mo16694A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                this.f22650a.mo16445s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16444r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo16695B(int i, Object obj, C3130a4 a4Var) throws IOException {
        C3688r1 r1Var = this.f22650a;
        r1Var.mo16452z(i, 3);
        a4Var.mo15707i((C3591o3) obj, r1Var.f22601a);
        r1Var.mo16452z(i, 4);
    }

    /* renamed from: C */
    public final void mo16696C(int i, int i2) throws IOException {
        this.f22650a.mo16448v(i, i2);
    }

    /* renamed from: D */
    public final void mo16697D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3688r1.m26664G(((Integer) list.get(i4)).intValue());
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                this.f22650a.mo16449w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16448v(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo16698E(int i, long j) throws IOException {
        this.f22650a.mo16435C(i, j);
    }

    /* renamed from: F */
    public final void mo16699F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3688r1.m26671g(((Long) list.get(i4)).longValue());
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                this.f22650a.mo16436D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16435C(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo16700G(int i, Object obj, C3130a4 a4Var) throws IOException {
        this.f22650a.mo16450x(i, (C3591o3) obj, a4Var);
    }

    /* renamed from: H */
    public final void mo16701H(int i, int i2) throws IOException {
        this.f22650a.mo16444r(i, i2);
    }

    /* renamed from: I */
    public final void mo16702I(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                this.f22650a.mo16445s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16444r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo16703J(int i, long j) throws IOException {
        this.f22650a.mo16446t(i, j);
    }

    /* renamed from: K */
    public final void mo16704K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                this.f22650a.mo16447u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16446t(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo16705a(int i, int i2) throws IOException {
        this.f22650a.mo16433A(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void mo16706b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += C3688r1.m26670f((intValue >> 31) ^ (intValue + intValue));
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                C3688r1 r1Var = this.f22650a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                r1Var.mo16434B((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C3688r1 r1Var2 = this.f22650a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            r1Var2.mo16433A(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo16707c(int i, long j) throws IOException {
        this.f22650a.mo16435C(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void mo16708d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += C3688r1.m26671g((longValue >> 63) ^ (longValue + longValue));
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                C3688r1 r1Var = this.f22650a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                r1Var.mo16436D((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C3688r1 r1Var2 = this.f22650a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            r1Var2.mo16435C(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void mo16709e(int i) throws IOException {
        this.f22650a.mo16452z(i, 3);
    }

    /* renamed from: f */
    public final void mo16710f(int i, String str) throws IOException {
        this.f22650a.mo16451y(i, str);
    }

    /* renamed from: g */
    public final void mo16711g(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof C3821v2) {
            C3821v2 v2Var = (C3821v2) list;
            while (i2 < list.size()) {
                Object p = v2Var.mo16858p(i2);
                if (p instanceof String) {
                    this.f22650a.mo16451y(i, (String) p);
                } else {
                    this.f22650a.mo16443p(i, (C3325g1) p);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16451y(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo16712h(int i, int i2) throws IOException {
        this.f22650a.mo16433A(i, i2);
    }

    /* renamed from: i */
    public final void mo16713i(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3688r1.m26670f(((Integer) list.get(i4)).intValue());
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                this.f22650a.mo16434B(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16433A(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo16714j(int i, long j) throws IOException {
        this.f22650a.mo16435C(i, j);
    }

    /* renamed from: k */
    public final void mo16715k(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3688r1.m26671g(((Long) list.get(i4)).longValue());
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                this.f22650a.mo16436D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16435C(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo16716m(int i, boolean z) throws IOException {
        this.f22650a.mo16442o(i, z);
    }

    /* renamed from: n */
    public final void mo16717n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                this.f22650a.mo16441n(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16442o(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo16718o(int i, C3325g1 g1Var) throws IOException {
        this.f22650a.mo16443p(i, g1Var);
    }

    /* renamed from: p */
    public final void mo16719p(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f22650a.mo16443p(i, (C3325g1) list.get(i2));
        }
    }

    /* renamed from: q */
    public final void mo16720q(int i, double d) throws IOException {
        this.f22650a.mo16446t(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo16721r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                this.f22650a.mo16447u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16446t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: s */
    public final void mo16722s(int i) throws IOException {
        this.f22650a.mo16452z(i, 4);
    }

    /* renamed from: t */
    public final void mo16723t(int i, int i2) throws IOException {
        this.f22650a.mo16448v(i, i2);
    }

    /* renamed from: u */
    public final void mo16724u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3688r1.m26664G(((Integer) list.get(i4)).intValue());
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                this.f22650a.mo16449w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16448v(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo16725v(int i, int i2) throws IOException {
        this.f22650a.mo16444r(i, i2);
    }

    /* renamed from: w */
    public final void mo16726w(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                this.f22650a.mo16445s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16444r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo16727x(int i, long j) throws IOException {
        this.f22650a.mo16446t(i, j);
    }

    /* renamed from: y */
    public final void mo16728y(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f22650a.mo16452z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f22650a.mo16434B(i3);
            while (i2 < list.size()) {
                this.f22650a.mo16447u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22650a.mo16446t(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo16729z(int i, float f) throws IOException {
        this.f22650a.mo16444r(i, Float.floatToRawIntBits(f));
    }
}
