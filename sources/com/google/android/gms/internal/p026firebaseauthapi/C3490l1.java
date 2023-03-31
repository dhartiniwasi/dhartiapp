package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3490l1 implements C3950z3 {

    /* renamed from: a */
    private final C3457k1 f22319a;

    /* renamed from: b */
    private int f22320b;

    /* renamed from: c */
    private int f22321c;

    /* renamed from: d */
    private int f22322d = 0;

    private C3490l1(C3457k1 k1Var) {
        C3623p2.m26442f(k1Var, "input");
        this.f22319a = k1Var;
        k1Var.f22266c = this;
    }

    /* renamed from: B */
    private final void m26031B(Object obj, C3130a4 a4Var, C3852w1 w1Var) throws IOException {
        int i = this.f22321c;
        this.f22321c = ((this.f22320b >>> 3) << 3) | 4;
        try {
            a4Var.mo15708j(obj, this, w1Var);
            if (this.f22320b != this.f22321c) {
                throw C3689r2.m26702g();
            }
        } finally {
            this.f22321c = i;
        }
    }

    /* renamed from: C */
    private final void m26032C(Object obj, C3130a4 a4Var, C3852w1 w1Var) throws IOException {
        int q = ((C3391i1) this.f22319a).mo16136q();
        C3457k1 k1Var = this.f22319a;
        if (k1Var.f22264a < k1Var.f22265b) {
            int b = k1Var.mo16124b(q);
            this.f22319a.f22264a++;
            a4Var.mo15708j(obj, this, w1Var);
            this.f22319a.mo16129g(0);
            C3457k1 k1Var2 = this.f22319a;
            k1Var2.f22264a--;
            k1Var2.mo16130h(b);
            return;
        }
        throw new C3689r2("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: D */
    private final void m26033D(int i) throws IOException {
        if (this.f22319a.mo16123a() != i) {
            throw C3689r2.m26703i();
        }
    }

    /* renamed from: E */
    private final void m26034E(int i) throws IOException {
        if ((this.f22320b & 7) != i) {
            throw C3689r2.m26696a();
        }
    }

    /* renamed from: F */
    private static final void m26035F(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C3689r2.m26702g();
        }
    }

    /* renamed from: G */
    private static final void m26036G(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C3689r2.m26702g();
        }
    }

    /* renamed from: H */
    public static C3490l1 m26037H(C3457k1 k1Var) {
        C3490l1 l1Var = k1Var.f22266c;
        return l1Var != null ? l1Var : new C3490l1(k1Var);
    }

    /* renamed from: A */
    public final void mo16282A(List list, boolean z) throws IOException {
        int c;
        int c2;
        if ((this.f22320b & 7) != 2) {
            throw C3689r2.m26696a();
        } else if ((list instanceof C3821v2) && !z) {
            C3821v2 v2Var = (C3821v2) list;
            do {
                v2Var.mo16861v1(mo16293b0());
                C3457k1 k1Var = this.f22319a;
                if (!k1Var.mo16131i()) {
                    c2 = k1Var.mo16125c();
                } else {
                    return;
                }
            } while (c2 == this.f22320b);
            this.f22322d = c2;
        } else {
            do {
                list.add(z ? mo16297d0() : mo16299e0());
                C3457k1 k1Var2 = this.f22319a;
                if (!k1Var2.mo16131i()) {
                    c = k1Var2.mo16125c();
                } else {
                    return;
                }
            } while (c == this.f22320b);
            this.f22322d = c;
        }
    }

    /* renamed from: T */
    public final int mo16283T() throws IOException {
        m26034E(5);
        return ((C3391i1) this.f22319a).mo16135p();
    }

    /* renamed from: U */
    public final int mo16284U() throws IOException {
        m26034E(5);
        return ((C3391i1) this.f22319a).mo16135p();
    }

    /* renamed from: V */
    public final int mo16285V() throws IOException {
        m26034E(0);
        return C3457k1.m25961l(((C3391i1) this.f22319a).mo16136q());
    }

    /* renamed from: W */
    public final int mo16286W() throws IOException {
        m26034E(0);
        return ((C3391i1) this.f22319a).mo16136q();
    }

    /* renamed from: X */
    public final long mo16287X() throws IOException {
        m26034E(1);
        return ((C3391i1) this.f22319a).mo16137r();
    }

    /* renamed from: Y */
    public final long mo16288Y() throws IOException {
        m26034E(0);
        return ((C3391i1) this.f22319a).mo16138s();
    }

    /* renamed from: Z */
    public final long mo16289Z() throws IOException {
        m26034E(0);
        return ((C3391i1) this.f22319a).mo16138s();
    }

    /* renamed from: a */
    public final int mo16290a() throws IOException {
        m26034E(0);
        return ((C3391i1) this.f22319a).mo16136q();
    }

    /* renamed from: a0 */
    public final long mo16291a0() throws IOException {
        m26034E(0);
        return C3457k1.m25962m(((C3391i1) this.f22319a).mo16138s());
    }

    /* renamed from: b */
    public final int mo16292b() {
        return this.f22320b;
    }

    /* renamed from: b0 */
    public final C3325g1 mo16293b0() throws IOException {
        m26034E(2);
        return this.f22319a.mo16126d();
    }

    /* renamed from: c */
    public final int mo16294c() throws IOException {
        m26034E(0);
        return ((C3391i1) this.f22319a).mo16136q();
    }

    /* renamed from: c0 */
    public final long mo16295c0() throws IOException {
        m26034E(1);
        return ((C3391i1) this.f22319a).mo16137r();
    }

    /* renamed from: d */
    public final float mo16296d() throws IOException {
        m26034E(5);
        return Float.intBitsToFloat(((C3391i1) this.f22319a).mo16135p());
    }

    /* renamed from: d0 */
    public final String mo16297d0() throws IOException {
        m26034E(2);
        return this.f22319a.mo16128f();
    }

    /* renamed from: e */
    public final int mo16298e() throws IOException {
        int i = this.f22322d;
        if (i != 0) {
            this.f22320b = i;
            this.f22322d = 0;
        } else {
            i = this.f22319a.mo16125c();
            this.f22320b = i;
        }
        if (i == 0 || i == this.f22321c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    /* renamed from: e0 */
    public final String mo16299e0() throws IOException {
        m26034E(2);
        return this.f22319a.mo16127e();
    }

    /* renamed from: f */
    public final void mo16300f(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3458k2) {
            C3458k2 k2Var = (C3458k2) list;
            int i = this.f22320b & 7;
            if (i == 0) {
                do {
                    k2Var.mo16244f(((C3391i1) this.f22319a).mo16136q());
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else if (i == 2) {
                int a = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    k2Var.mo16244f(((C3391i1) this.f22319a).mo16136q());
                } while (this.f22319a.mo16123a() < a);
                m26033D(a);
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((C3391i1) this.f22319a).mo16136q()));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else if (i2 == 2) {
                int a2 = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    list.add(Integer.valueOf(((C3391i1) this.f22319a).mo16136q()));
                } while (this.f22319a.mo16123a() < a2);
                m26033D(a2);
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    @Deprecated
    /* renamed from: g */
    public final void mo16301g(List list, C3130a4 a4Var, C3852w1 w1Var) throws IOException {
        int c;
        int i = this.f22320b;
        if ((i & 7) == 3) {
            do {
                Object a = a4Var.mo15699a();
                m26031B(a, a4Var, w1Var);
                a4Var.mo15703e(a);
                list.add(a);
                C3457k1 k1Var = this.f22319a;
                if (!k1Var.mo16131i() && this.f22322d == 0) {
                    c = k1Var.mo16125c();
                } else {
                    return;
                }
            } while (c == i);
            this.f22322d = c;
            return;
        }
        throw C3689r2.m26696a();
    }

    /* renamed from: h */
    public final void mo16302h(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3195c3) {
            C3195c3 c3Var = (C3195c3) list;
            int i = this.f22320b & 7;
            if (i == 0) {
                do {
                    c3Var.mo15890f(((C3391i1) this.f22319a).mo16138s());
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else if (i == 2) {
                int a = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    c3Var.mo15890f(((C3391i1) this.f22319a).mo16138s());
                } while (this.f22319a.mo16123a() < a);
                m26033D(a);
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(((C3391i1) this.f22319a).mo16138s()));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else if (i2 == 2) {
                int a2 = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    list.add(Long.valueOf(((C3391i1) this.f22319a).mo16138s()));
                } while (this.f22319a.mo16123a() < a2);
                m26033D(a2);
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: i */
    public final boolean mo16303i() throws IOException {
        int i;
        C3457k1 k1Var = this.f22319a;
        if (k1Var.mo16131i() || (i = this.f22320b) == this.f22321c) {
            return false;
        }
        return k1Var.mo16133k(i);
    }

    /* renamed from: j */
    public final void mo16304j(Object obj, C3130a4 a4Var, C3852w1 w1Var) throws IOException {
        m26034E(2);
        m26032C(obj, a4Var, w1Var);
    }

    /* renamed from: k */
    public final void mo16305k(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3195c3) {
            C3195c3 c3Var = (C3195c3) list;
            int i = this.f22320b & 7;
            if (i == 0) {
                do {
                    c3Var.mo15890f(((C3391i1) this.f22319a).mo16138s());
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else if (i == 2) {
                int a = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    c3Var.mo15890f(((C3391i1) this.f22319a).mo16138s());
                } while (this.f22319a.mo16123a() < a);
                m26033D(a);
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(((C3391i1) this.f22319a).mo16138s()));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else if (i2 == 2) {
                int a2 = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    list.add(Long.valueOf(((C3391i1) this.f22319a).mo16138s()));
                } while (this.f22319a.mo16123a() < a2);
                m26033D(a2);
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: l */
    public final void mo16306l(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3754t1) {
            C3754t1 t1Var = (C3754t1) list;
            int i = this.f22320b & 7;
            if (i == 1) {
                do {
                    t1Var.mo16784c(Double.longBitsToDouble(((C3391i1) this.f22319a).mo16137r()));
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else if (i == 2) {
                int q = ((C3391i1) this.f22319a).mo16136q();
                m26036G(q);
                int a = this.f22319a.mo16123a() + q;
                do {
                    t1Var.mo16784c(Double.longBitsToDouble(((C3391i1) this.f22319a).mo16137r()));
                } while (this.f22319a.mo16123a() < a);
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((C3391i1) this.f22319a).mo16137r())));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else if (i2 == 2) {
                int q2 = ((C3391i1) this.f22319a).mo16136q();
                m26036G(q2);
                int a2 = this.f22319a.mo16123a() + q2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((C3391i1) this.f22319a).mo16137r())));
                } while (this.f22319a.mo16123a() < a2);
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: m */
    public final boolean mo16307m() throws IOException {
        m26034E(0);
        return this.f22319a.mo16132j();
    }

    /* renamed from: n */
    public final void mo16308n(List list) throws IOException {
        int c;
        if ((this.f22320b & 7) == 2) {
            do {
                list.add(mo16293b0());
                C3457k1 k1Var = this.f22319a;
                if (!k1Var.mo16131i()) {
                    c = k1Var.mo16125c();
                } else {
                    return;
                }
            } while (c == this.f22320b);
            this.f22322d = c;
            return;
        }
        throw C3689r2.m26696a();
    }

    /* renamed from: o */
    public final void mo16309o(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3458k2) {
            C3458k2 k2Var = (C3458k2) list;
            int i = this.f22320b & 7;
            if (i == 0) {
                do {
                    k2Var.mo16244f(((C3391i1) this.f22319a).mo16136q());
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else if (i == 2) {
                int a = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    k2Var.mo16244f(((C3391i1) this.f22319a).mo16136q());
                } while (this.f22319a.mo16123a() < a);
                m26033D(a);
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((C3391i1) this.f22319a).mo16136q()));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else if (i2 == 2) {
                int a2 = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    list.add(Integer.valueOf(((C3391i1) this.f22319a).mo16136q()));
                } while (this.f22319a.mo16123a() < a2);
                m26033D(a2);
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: p */
    public final void mo16310p(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3195c3) {
            C3195c3 c3Var = (C3195c3) list;
            int i = this.f22320b & 7;
            if (i == 1) {
                do {
                    c3Var.mo15890f(((C3391i1) this.f22319a).mo16137r());
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else if (i == 2) {
                int q = ((C3391i1) this.f22319a).mo16136q();
                m26036G(q);
                int a = this.f22319a.mo16123a() + q;
                do {
                    c3Var.mo15890f(((C3391i1) this.f22319a).mo16137r());
                } while (this.f22319a.mo16123a() < a);
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(((C3391i1) this.f22319a).mo16137r()));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else if (i2 == 2) {
                int q2 = ((C3391i1) this.f22319a).mo16136q();
                m26036G(q2);
                int a2 = this.f22319a.mo16123a() + q2;
                do {
                    list.add(Long.valueOf(((C3391i1) this.f22319a).mo16137r()));
                } while (this.f22319a.mo16123a() < a2);
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: q */
    public final void mo16311q(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3458k2) {
            C3458k2 k2Var = (C3458k2) list;
            int i = this.f22320b & 7;
            if (i == 2) {
                int q = ((C3391i1) this.f22319a).mo16136q();
                m26035F(q);
                int a = this.f22319a.mo16123a() + q;
                do {
                    k2Var.mo16244f(((C3391i1) this.f22319a).mo16135p());
                } while (this.f22319a.mo16123a() < a);
            } else if (i == 5) {
                do {
                    k2Var.mo16244f(((C3391i1) this.f22319a).mo16135p());
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 2) {
                int q2 = ((C3391i1) this.f22319a).mo16136q();
                m26035F(q2);
                int a2 = this.f22319a.mo16123a() + q2;
                do {
                    list.add(Integer.valueOf(((C3391i1) this.f22319a).mo16135p()));
                } while (this.f22319a.mo16123a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((C3391i1) this.f22319a).mo16135p()));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: r */
    public final void mo16312r(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3458k2) {
            C3458k2 k2Var = (C3458k2) list;
            int i = this.f22320b & 7;
            if (i == 2) {
                int q = ((C3391i1) this.f22319a).mo16136q();
                m26035F(q);
                int a = this.f22319a.mo16123a() + q;
                do {
                    k2Var.mo16244f(((C3391i1) this.f22319a).mo16135p());
                } while (this.f22319a.mo16123a() < a);
            } else if (i == 5) {
                do {
                    k2Var.mo16244f(((C3391i1) this.f22319a).mo16135p());
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 2) {
                int q2 = ((C3391i1) this.f22319a).mo16136q();
                m26035F(q2);
                int a2 = this.f22319a.mo16123a() + q2;
                do {
                    list.add(Integer.valueOf(((C3391i1) this.f22319a).mo16135p()));
                } while (this.f22319a.mo16123a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((C3391i1) this.f22319a).mo16135p()));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: s */
    public final void mo16313s(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3195c3) {
            C3195c3 c3Var = (C3195c3) list;
            int i = this.f22320b & 7;
            if (i == 0) {
                do {
                    c3Var.mo15890f(C3457k1.m25962m(((C3391i1) this.f22319a).mo16138s()));
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else if (i == 2) {
                int a = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    c3Var.mo15890f(C3457k1.m25962m(((C3391i1) this.f22319a).mo16138s()));
                } while (this.f22319a.mo16123a() < a);
                m26033D(a);
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(C3457k1.m25962m(((C3391i1) this.f22319a).mo16138s())));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else if (i2 == 2) {
                int a2 = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    list.add(Long.valueOf(C3457k1.m25962m(((C3391i1) this.f22319a).mo16138s())));
                } while (this.f22319a.mo16123a() < a2);
                m26033D(a2);
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: t */
    public final void mo16314t(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3195c3) {
            C3195c3 c3Var = (C3195c3) list;
            int i = this.f22320b & 7;
            if (i == 1) {
                do {
                    c3Var.mo15890f(((C3391i1) this.f22319a).mo16137r());
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else if (i == 2) {
                int q = ((C3391i1) this.f22319a).mo16136q();
                m26036G(q);
                int a = this.f22319a.mo16123a() + q;
                do {
                    c3Var.mo15890f(((C3391i1) this.f22319a).mo16137r());
                } while (this.f22319a.mo16123a() < a);
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(((C3391i1) this.f22319a).mo16137r()));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else if (i2 == 2) {
                int q2 = ((C3391i1) this.f22319a).mo16136q();
                m26036G(q2);
                int a2 = this.f22319a.mo16123a() + q2;
                do {
                    list.add(Long.valueOf(((C3391i1) this.f22319a).mo16137r()));
                } while (this.f22319a.mo16123a() < a2);
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: u */
    public final void mo16315u(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3458k2) {
            C3458k2 k2Var = (C3458k2) list;
            int i = this.f22320b & 7;
            if (i == 0) {
                do {
                    k2Var.mo16244f(C3457k1.m25961l(((C3391i1) this.f22319a).mo16136q()));
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else if (i == 2) {
                int a = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    k2Var.mo16244f(C3457k1.m25961l(((C3391i1) this.f22319a).mo16136q()));
                } while (this.f22319a.mo16123a() < a);
                m26033D(a);
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(C3457k1.m25961l(((C3391i1) this.f22319a).mo16136q())));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else if (i2 == 2) {
                int a2 = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    list.add(Integer.valueOf(C3457k1.m25961l(((C3391i1) this.f22319a).mo16136q())));
                } while (this.f22319a.mo16123a() < a2);
                m26033D(a2);
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: v */
    public final void mo16316v(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3458k2) {
            C3458k2 k2Var = (C3458k2) list;
            int i = this.f22320b & 7;
            if (i == 0) {
                do {
                    k2Var.mo16244f(((C3391i1) this.f22319a).mo16136q());
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else if (i == 2) {
                int a = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    k2Var.mo16244f(((C3391i1) this.f22319a).mo16136q());
                } while (this.f22319a.mo16123a() < a);
                m26033D(a);
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((C3391i1) this.f22319a).mo16136q()));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else if (i2 == 2) {
                int a2 = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    list.add(Integer.valueOf(((C3391i1) this.f22319a).mo16136q()));
                } while (this.f22319a.mo16123a() < a2);
                m26033D(a2);
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: w */
    public final void mo16317w(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3786u0) {
            C3786u0 u0Var = (C3786u0) list;
            int i = this.f22320b & 7;
            if (i == 0) {
                do {
                    u0Var.mo16846c(this.f22319a.mo16132j());
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else if (i == 2) {
                int a = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    u0Var.mo16846c(this.f22319a.mo16132j());
                } while (this.f22319a.mo16123a() < a);
                m26033D(a);
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f22319a.mo16132j()));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else if (i2 == 2) {
                int a2 = this.f22319a.mo16123a() + ((C3391i1) this.f22319a).mo16136q();
                do {
                    list.add(Boolean.valueOf(this.f22319a.mo16132j()));
                } while (this.f22319a.mo16123a() < a2);
                m26033D(a2);
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: x */
    public final void mo16318x(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof C3227d2) {
            C3227d2 d2Var = (C3227d2) list;
            int i = this.f22320b & 7;
            if (i == 2) {
                int q = ((C3391i1) this.f22319a).mo16136q();
                m26035F(q);
                int a = this.f22319a.mo16123a() + q;
                do {
                    d2Var.mo15941c(Float.intBitsToFloat(((C3391i1) this.f22319a).mo16135p()));
                } while (this.f22319a.mo16123a() < a);
            } else if (i == 5) {
                do {
                    d2Var.mo15941c(Float.intBitsToFloat(((C3391i1) this.f22319a).mo16135p()));
                    C3457k1 k1Var = this.f22319a;
                    if (!k1Var.mo16131i()) {
                        c2 = k1Var.mo16125c();
                    } else {
                        return;
                    }
                } while (c2 == this.f22320b);
                this.f22322d = c2;
            } else {
                throw C3689r2.m26696a();
            }
        } else {
            int i2 = this.f22320b & 7;
            if (i2 == 2) {
                int q2 = ((C3391i1) this.f22319a).mo16136q();
                m26035F(q2);
                int a2 = this.f22319a.mo16123a() + q2;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((C3391i1) this.f22319a).mo16135p())));
                } while (this.f22319a.mo16123a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((C3391i1) this.f22319a).mo16135p())));
                    C3457k1 k1Var2 = this.f22319a;
                    if (!k1Var2.mo16131i()) {
                        c = k1Var2.mo16125c();
                    } else {
                        return;
                    }
                } while (c == this.f22320b);
                this.f22322d = c;
            } else {
                throw C3689r2.m26696a();
            }
        }
    }

    /* renamed from: y */
    public final void mo16319y(Object obj, C3130a4 a4Var, C3852w1 w1Var) throws IOException {
        m26034E(3);
        m26031B(obj, a4Var, w1Var);
    }

    /* renamed from: z */
    public final void mo16320z(List list, C3130a4 a4Var, C3852w1 w1Var) throws IOException {
        int c;
        int i = this.f22320b;
        if ((i & 7) == 2) {
            do {
                Object a = a4Var.mo15699a();
                m26032C(a, a4Var, w1Var);
                a4Var.mo15703e(a);
                list.add(a);
                C3457k1 k1Var = this.f22319a;
                if (!k1Var.mo16131i() && this.f22322d == 0) {
                    c = k1Var.mo16125c();
                } else {
                    return;
                }
            } while (c == i);
            this.f22322d = c;
            return;
        }
        throw C3689r2.m26696a();
    }

    public final double zza() throws IOException {
        m26034E(1);
        return Double.longBitsToDouble(((C3391i1) this.f22319a).mo16137r());
    }
}
