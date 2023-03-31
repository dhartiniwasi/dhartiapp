package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7122p8 implements C7030jc {

    /* renamed from: a */
    private final C7106o8 f31947a;

    private C7122p8(C7106o8 o8Var) {
        C7107o9.m40533f(o8Var, "output");
        this.f31947a = o8Var;
        o8Var.f31924a = this;
    }

    /* renamed from: b */
    public static C7122p8 m40562b(C7106o8 o8Var) {
        C7122p8 p8Var = o8Var.f31924a;
        return p8Var != null ? p8Var : new C7122p8(o8Var);
    }

    /* renamed from: A */
    public final void mo23558A(int i, int i2) throws IOException {
        this.f31947a.mo23640k(i, i2);
    }

    /* renamed from: B */
    public final void mo23559B(int i, int i2) throws IOException {
        this.f31947a.mo23649t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: C */
    public final void mo23560C(int i, float f) throws IOException {
        this.f31947a.mo23640k(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: D */
    public final void mo23561D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += C7106o8.m40502a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                C7106o8 o8Var = this.f31947a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                o8Var.mo23650u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C7106o8 o8Var2 = this.f31947a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            o8Var2.mo23649t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo23562E(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C7106o8.m40503b(((Long) list.get(i4)).longValue());
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                this.f31947a.mo23652w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23651v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo23563F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C7106o8.m40503b(((Long) list.get(i4)).longValue());
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                this.f31947a.mo23652w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23651v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo23564G(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                this.f31947a.mo23641l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23640k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo23565H(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                this.f31947a.mo23643n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23642m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: I */
    public final void mo23566I(int i, long j) throws IOException {
        this.f31947a.mo23651v(i, j);
    }

    /* renamed from: J */
    public final void mo23567J(int i, int i2) throws IOException {
        this.f31947a.mo23644o(i, i2);
    }

    /* renamed from: K */
    public final void mo23568K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                this.f31947a.mo23641l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23640k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: L */
    public final void mo23569L(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += C7106o8.m40503b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                C7106o8 o8Var = this.f31947a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                o8Var.mo23652w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C7106o8 o8Var2 = this.f31947a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            o8Var2.mo23651v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: M */
    public final void mo23570M(int i, Object obj, C7268ya yaVar) throws IOException {
        C7092na naVar = (C7092na) obj;
        C7058l8 l8Var = (C7058l8) this.f31947a;
        l8Var.mo23650u((i << 3) | 2);
        l8Var.mo23650u(((C7121p7) naVar).mo23491f(yaVar));
        yaVar.mo23789h(naVar, l8Var.f31924a);
    }

    /* renamed from: N */
    public final void mo23571N(int i, long j) throws IOException {
        this.f31947a.mo23651v(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: a */
    public final void mo23572a(int i, long j) throws IOException {
        this.f31947a.mo23642m(i, j);
    }

    @Deprecated
    /* renamed from: g */
    public final void mo23573g(int i) throws IOException {
        this.f31947a.mo23648s(i, 3);
    }

    /* renamed from: h */
    public final void mo23574h(int i, int i2) throws IOException {
        this.f31947a.mo23649t(i, i2);
    }

    /* renamed from: i */
    public final void mo23575i(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                this.f31947a.mo23643n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23642m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Deprecated
    /* renamed from: i0 */
    public final void mo23576i0(int i) throws IOException {
        this.f31947a.mo23648s(i, 4);
    }

    /* renamed from: j */
    public final void mo23577j(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f31947a.mo23639j(i, (C6977g8) list.get(i2));
        }
    }

    /* renamed from: k */
    public final void mo23578k(int i, int i2) throws IOException {
        this.f31947a.mo23640k(i, i2);
    }

    /* renamed from: l */
    public final void mo23579l(int i, boolean z) throws IOException {
        this.f31947a.mo23638i(i, z);
    }

    /* renamed from: m */
    public final void mo23580m(int i, String str) throws IOException {
        this.f31947a.mo23647r(i, str);
    }

    /* renamed from: n */
    public final void mo23581n(int i, long j) throws IOException {
        this.f31947a.mo23651v(i, j);
    }

    /* renamed from: o */
    public final void mo23582o(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                this.f31947a.mo23637h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23638i(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo23583p(int i, long j) throws IOException {
        this.f31947a.mo23642m(i, j);
    }

    /* renamed from: q */
    public final void mo23584q(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C7106o8.m40502a(((Integer) list.get(i4)).intValue());
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                this.f31947a.mo23650u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23649t(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: r */
    public final void mo23585r(int i, Object obj, C7268ya yaVar) throws IOException {
        C7106o8 o8Var = this.f31947a;
        o8Var.mo23648s(i, 3);
        yaVar.mo23789h((C7092na) obj, o8Var.f31924a);
        o8Var.mo23648s(i, 4);
    }

    /* renamed from: s */
    public final void mo23586s(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                this.f31947a.mo23641l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23640k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: t */
    public final void mo23587t(int i, C6977g8 g8Var) throws IOException {
        this.f31947a.mo23639j(i, g8Var);
    }

    /* renamed from: u */
    public final void mo23588u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C7106o8.m40508z(((Integer) list.get(i4)).intValue());
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                this.f31947a.mo23645p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23644o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo23589v(int i, int i2) throws IOException {
        this.f31947a.mo23644o(i, i2);
    }

    /* renamed from: w */
    public final void mo23590w(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C7106o8.m40508z(((Integer) list.get(i4)).intValue());
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                this.f31947a.mo23645p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23644o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo23591x(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof C7203u9) {
            C7203u9 u9Var = (C7203u9) list;
            while (i2 < list.size()) {
                Object p = u9Var.mo23891p(i2);
                if (p instanceof String) {
                    this.f31947a.mo23647r(i, (String) p);
                } else {
                    this.f31947a.mo23639j(i, (C6977g8) p);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23647r(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo23592y(int i, double d) throws IOException {
        this.f31947a.mo23642m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: z */
    public final void mo23593z(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31947a.mo23648s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f31947a.mo23650u(i3);
            while (i2 < list.size()) {
                this.f31947a.mo23643n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31947a.mo23642m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
