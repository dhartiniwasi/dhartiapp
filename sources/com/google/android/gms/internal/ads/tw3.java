package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class tw3 implements nz3 {

    /* renamed from: a */
    private final sw3 f18274a;

    /* renamed from: b */
    private int f18275b;

    /* renamed from: c */
    private int f18276c;

    /* renamed from: d */
    private int f18277d = 0;

    private tw3(sw3 sw3) {
        cy3.m11234f(sw3, "input");
        this.f18274a = sw3;
        sw3.f17689c = this;
    }

    /* renamed from: D */
    private final Object m21278D(wz3 wz3, ex3 ex3) throws IOException {
        int i = this.f18276c;
        this.f18276c = ((this.f18275b >>> 3) << 3) | 4;
        try {
            Object a = wz3.mo10359a();
            wz3.mo10366h(a, this, ex3);
            wz3.mo10363e(a);
            if (this.f18275b == this.f18276c) {
                return a;
            }
            throw ey3.m12343g();
        } finally {
            this.f18276c = i;
        }
    }

    /* renamed from: E */
    private final Object m21279E(wz3 wz3, ex3 ex3) throws IOException {
        int s = this.f18274a.mo12199s();
        sw3 sw3 = this.f18274a;
        if (sw3.f17687a < sw3.f17688b) {
            int l = sw3.mo12192l(s);
            Object a = wz3.mo10359a();
            this.f18274a.f17687a++;
            wz3.mo10366h(a, this, ex3);
            wz3.mo10363e(a);
            this.f18274a.mo12177B(0);
            sw3 sw32 = this.f18274a;
            sw32.f17687a--;
            sw32.mo12185a(l);
            return a;
        }
        throw new ey3("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: F */
    private final void m21280F(int i) throws IOException {
        if (this.f18274a.mo12191k() != i) {
            throw ey3.m12345j();
        }
    }

    /* renamed from: G */
    private final void m21281G(int i) throws IOException {
        if ((this.f18275b & 7) != i) {
            throw ey3.m12337a();
        }
    }

    /* renamed from: H */
    private static final void m21282H(int i) throws IOException {
        if ((i & 3) != 0) {
            throw ey3.m12343g();
        }
    }

    /* renamed from: I */
    private static final void m21283I(int i) throws IOException {
        if ((i & 7) != 0) {
            throw ey3.m12343g();
        }
    }

    /* renamed from: J */
    public static tw3 m21284J(sw3 sw3) {
        tw3 tw3 = sw3.f17689c;
        return tw3 != null ? tw3 : new tw3(sw3);
    }

    @Deprecated
    /* renamed from: A */
    public final void mo12734A(List list, wz3 wz3, ex3 ex3) throws IOException {
        int r;
        int i = this.f18275b;
        if ((i & 7) == 3) {
            do {
                list.add(m21278D(wz3, ex3));
                if (!this.f18274a.mo12186b() && this.f18277d == 0) {
                    r = this.f18274a.mo12198r();
                } else {
                    return;
                }
            } while (r == i);
            this.f18277d = r;
            return;
        }
        throw ey3.m12337a();
    }

    /* renamed from: B */
    public final void mo12735B(List list, wz3 wz3, ex3 ex3) throws IOException {
        int r;
        int i = this.f18275b;
        if ((i & 7) == 2) {
            do {
                list.add(m21279E(wz3, ex3));
                if (!this.f18274a.mo12186b() && this.f18277d == 0) {
                    r = this.f18274a.mo12198r();
                } else {
                    return;
                }
            } while (r == i);
            this.f18277d = r;
            return;
        }
        throw ey3.m12337a();
    }

    /* renamed from: C */
    public final void mo14407C(List list, boolean z) throws IOException {
        int r;
        int r2;
        if ((this.f18275b & 7) != 2) {
            throw ey3.m12337a();
        } else if ((list instanceof jy3) && !z) {
            jy3 jy3 = (jy3) list;
            do {
                jy3.mo11254F(mo12746b0());
                if (!this.f18274a.mo12186b()) {
                    r2 = this.f18274a.mo12198r();
                } else {
                    return;
                }
            } while (r2 == this.f18275b);
            this.f18277d = r2;
        } else {
            do {
                list.add(z ? mo12755j() : mo12752g());
                if (!this.f18274a.mo12186b()) {
                    r = this.f18274a.mo12198r();
                } else {
                    return;
                }
            } while (r == this.f18275b);
            this.f18277d = r;
        }
    }

    /* renamed from: T */
    public final int mo12736T() throws IOException {
        m21281G(5);
        return this.f18274a.mo12194n();
    }

    /* renamed from: U */
    public final int mo12737U() throws IOException {
        m21281G(5);
        return this.f18274a.mo12196p();
    }

    /* renamed from: V */
    public final int mo12738V() throws IOException {
        m21281G(0);
        return this.f18274a.mo12197q();
    }

    /* renamed from: W */
    public final int mo12739W() throws IOException {
        m21281G(0);
        return this.f18274a.mo12199s();
    }

    /* renamed from: X */
    public final long mo12740X() throws IOException {
        m21281G(1);
        return this.f18274a.mo12200t();
    }

    /* renamed from: Y */
    public final long mo12741Y() throws IOException {
        m21281G(0);
        return this.f18274a.mo12204x();
    }

    /* renamed from: Z */
    public final long mo12742Z() throws IOException {
        m21281G(0);
        return this.f18274a.mo12201u();
    }

    /* renamed from: a */
    public final int mo12743a() throws IOException {
        m21281G(0);
        return this.f18274a.mo12193m();
    }

    /* renamed from: a0 */
    public final long mo12744a0() throws IOException {
        m21281G(0);
        return this.f18274a.mo12203w();
    }

    /* renamed from: b */
    public final int mo12745b() {
        return this.f18275b;
    }

    /* renamed from: b0 */
    public final jw3 mo12746b0() throws IOException {
        m21281G(2);
        return this.f18274a.mo12205y();
    }

    /* renamed from: c */
    public final int mo12747c() throws IOException {
        m21281G(0);
        return this.f18274a.mo12195o();
    }

    /* renamed from: c0 */
    public final long mo12748c0() throws IOException {
        m21281G(1);
        return this.f18274a.mo12202v();
    }

    /* renamed from: d */
    public final float mo12749d() throws IOException {
        m21281G(5);
        return this.f18274a.mo12190j();
    }

    /* renamed from: e */
    public final int mo12750e() throws IOException {
        int i = this.f18277d;
        if (i != 0) {
            this.f18275b = i;
            this.f18277d = 0;
        } else {
            i = this.f18274a.mo12198r();
            this.f18275b = i;
        }
        if (i == 0 || i == this.f18276c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    /* renamed from: f */
    public final void mo12751f(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof tx3) {
            tx3 tx3 = (tx3) list;
            int i = this.f18275b & 7;
            if (i == 0) {
                do {
                    tx3.mo14422i0(this.f18274a.mo12193m());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else if (i == 2) {
                int k = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    tx3.mo14422i0(this.f18274a.mo12193m());
                } while (this.f18274a.mo12191k() < k);
                m21280F(k);
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f18274a.mo12193m()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else if (i2 == 2) {
                int k2 = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    list.add(Integer.valueOf(this.f18274a.mo12193m()));
                } while (this.f18274a.mo12191k() < k2);
                m21280F(k2);
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: g */
    public final String mo12752g() throws IOException {
        m21281G(2);
        return this.f18274a.mo12206z();
    }

    /* renamed from: h */
    public final void mo12753h(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof ry3) {
            ry3 ry3 = (ry3) list;
            int i = this.f18275b & 7;
            if (i == 0) {
                do {
                    ry3.mo13901i(this.f18274a.mo12201u());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else if (i == 2) {
                int k = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    ry3.mo13901i(this.f18274a.mo12201u());
                } while (this.f18274a.mo12191k() < k);
                m21280F(k);
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f18274a.mo12201u()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else if (i2 == 2) {
                int k2 = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    list.add(Long.valueOf(this.f18274a.mo12201u()));
                } while (this.f18274a.mo12191k() < k2);
                m21280F(k2);
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: i */
    public final boolean mo12754i() throws IOException {
        int i;
        if (this.f18274a.mo12186b() || (i = this.f18275b) == this.f18276c) {
            return false;
        }
        return this.f18274a.mo12188d(i);
    }

    /* renamed from: j */
    public final String mo12755j() throws IOException {
        m21281G(2);
        return this.f18274a.mo12176A();
    }

    /* renamed from: k */
    public final void mo12756k(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof ry3) {
            ry3 ry3 = (ry3) list;
            int i = this.f18275b & 7;
            if (i == 0) {
                do {
                    ry3.mo13901i(this.f18274a.mo12204x());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else if (i == 2) {
                int k = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    ry3.mo13901i(this.f18274a.mo12204x());
                } while (this.f18274a.mo12191k() < k);
                m21280F(k);
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f18274a.mo12204x()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else if (i2 == 2) {
                int k2 = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    list.add(Long.valueOf(this.f18274a.mo12204x()));
                } while (this.f18274a.mo12191k() < k2);
                m21280F(k2);
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: l */
    public final void mo12757l(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof bx3) {
            bx3 bx3 = (bx3) list;
            int i = this.f18275b & 7;
            if (i == 1) {
                do {
                    bx3.mo8971c(this.f18274a.mo12189i());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else if (i == 2) {
                int s = this.f18274a.mo12199s();
                m21283I(s);
                int k = this.f18274a.mo12191k() + s;
                do {
                    bx3.mo8971c(this.f18274a.mo12189i());
                } while (this.f18274a.mo12191k() < k);
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f18274a.mo12189i()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else if (i2 == 2) {
                int s2 = this.f18274a.mo12199s();
                m21283I(s2);
                int k2 = this.f18274a.mo12191k() + s2;
                do {
                    list.add(Double.valueOf(this.f18274a.mo12189i()));
                } while (this.f18274a.mo12191k() < k2);
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: m */
    public final boolean mo12758m() throws IOException {
        m21281G(0);
        return this.f18274a.mo12187c();
    }

    /* renamed from: n */
    public final void mo12759n(List list) throws IOException {
        int r;
        if ((this.f18275b & 7) == 2) {
            do {
                list.add(mo12746b0());
                if (!this.f18274a.mo12186b()) {
                    r = this.f18274a.mo12198r();
                } else {
                    return;
                }
            } while (r == this.f18275b);
            this.f18277d = r;
            return;
        }
        throw ey3.m12337a();
    }

    /* renamed from: o */
    public final void mo12760o(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof tx3) {
            tx3 tx3 = (tx3) list;
            int i = this.f18275b & 7;
            if (i == 0) {
                do {
                    tx3.mo14422i0(this.f18274a.mo12195o());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else if (i == 2) {
                int k = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    tx3.mo14422i0(this.f18274a.mo12195o());
                } while (this.f18274a.mo12191k() < k);
                m21280F(k);
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f18274a.mo12195o()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else if (i2 == 2) {
                int k2 = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    list.add(Integer.valueOf(this.f18274a.mo12195o()));
                } while (this.f18274a.mo12191k() < k2);
                m21280F(k2);
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: p */
    public final void mo12761p(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof ry3) {
            ry3 ry3 = (ry3) list;
            int i = this.f18275b & 7;
            if (i == 1) {
                do {
                    ry3.mo13901i(this.f18274a.mo12202v());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else if (i == 2) {
                int s = this.f18274a.mo12199s();
                m21283I(s);
                int k = this.f18274a.mo12191k() + s;
                do {
                    ry3.mo13901i(this.f18274a.mo12202v());
                } while (this.f18274a.mo12191k() < k);
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f18274a.mo12202v()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else if (i2 == 2) {
                int s2 = this.f18274a.mo12199s();
                m21283I(s2);
                int k2 = this.f18274a.mo12191k() + s2;
                do {
                    list.add(Long.valueOf(this.f18274a.mo12202v()));
                } while (this.f18274a.mo12191k() < k2);
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: q */
    public final void mo12762q(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof tx3) {
            tx3 tx3 = (tx3) list;
            int i = this.f18275b & 7;
            if (i == 2) {
                int s = this.f18274a.mo12199s();
                m21282H(s);
                int k = this.f18274a.mo12191k() + s;
                do {
                    tx3.mo14422i0(this.f18274a.mo12196p());
                } while (this.f18274a.mo12191k() < k);
            } else if (i == 5) {
                do {
                    tx3.mo14422i0(this.f18274a.mo12196p());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 2) {
                int s2 = this.f18274a.mo12199s();
                m21282H(s2);
                int k2 = this.f18274a.mo12191k() + s2;
                do {
                    list.add(Integer.valueOf(this.f18274a.mo12196p()));
                } while (this.f18274a.mo12191k() < k2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f18274a.mo12196p()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: r */
    public final void mo12763r(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof tx3) {
            tx3 tx3 = (tx3) list;
            int i = this.f18275b & 7;
            if (i == 2) {
                int s = this.f18274a.mo12199s();
                m21282H(s);
                int k = this.f18274a.mo12191k() + s;
                do {
                    tx3.mo14422i0(this.f18274a.mo12194n());
                } while (this.f18274a.mo12191k() < k);
            } else if (i == 5) {
                do {
                    tx3.mo14422i0(this.f18274a.mo12194n());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 2) {
                int s2 = this.f18274a.mo12199s();
                m21282H(s2);
                int k2 = this.f18274a.mo12191k() + s2;
                do {
                    list.add(Integer.valueOf(this.f18274a.mo12194n()));
                } while (this.f18274a.mo12191k() < k2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f18274a.mo12194n()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: s */
    public final void mo12764s(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof ry3) {
            ry3 ry3 = (ry3) list;
            int i = this.f18275b & 7;
            if (i == 0) {
                do {
                    ry3.mo13901i(this.f18274a.mo12203w());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else if (i == 2) {
                int k = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    ry3.mo13901i(this.f18274a.mo12203w());
                } while (this.f18274a.mo12191k() < k);
                m21280F(k);
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f18274a.mo12203w()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else if (i2 == 2) {
                int k2 = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    list.add(Long.valueOf(this.f18274a.mo12203w()));
                } while (this.f18274a.mo12191k() < k2);
                m21280F(k2);
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: t */
    public final void mo12765t(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof ry3) {
            ry3 ry3 = (ry3) list;
            int i = this.f18275b & 7;
            if (i == 1) {
                do {
                    ry3.mo13901i(this.f18274a.mo12200t());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else if (i == 2) {
                int s = this.f18274a.mo12199s();
                m21283I(s);
                int k = this.f18274a.mo12191k() + s;
                do {
                    ry3.mo13901i(this.f18274a.mo12200t());
                } while (this.f18274a.mo12191k() < k);
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f18274a.mo12200t()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else if (i2 == 2) {
                int s2 = this.f18274a.mo12199s();
                m21283I(s2);
                int k2 = this.f18274a.mo12191k() + s2;
                do {
                    list.add(Long.valueOf(this.f18274a.mo12200t()));
                } while (this.f18274a.mo12191k() < k2);
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: u */
    public final void mo12766u(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof tx3) {
            tx3 tx3 = (tx3) list;
            int i = this.f18275b & 7;
            if (i == 0) {
                do {
                    tx3.mo14422i0(this.f18274a.mo12197q());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else if (i == 2) {
                int k = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    tx3.mo14422i0(this.f18274a.mo12197q());
                } while (this.f18274a.mo12191k() < k);
                m21280F(k);
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f18274a.mo12197q()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else if (i2 == 2) {
                int k2 = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    list.add(Integer.valueOf(this.f18274a.mo12197q()));
                } while (this.f18274a.mo12191k() < k2);
                m21280F(k2);
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: v */
    public final void mo12767v(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof tx3) {
            tx3 tx3 = (tx3) list;
            int i = this.f18275b & 7;
            if (i == 0) {
                do {
                    tx3.mo14422i0(this.f18274a.mo12199s());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else if (i == 2) {
                int k = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    tx3.mo14422i0(this.f18274a.mo12199s());
                } while (this.f18274a.mo12191k() < k);
                m21280F(k);
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f18274a.mo12199s()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else if (i2 == 2) {
                int k2 = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    list.add(Integer.valueOf(this.f18274a.mo12199s()));
                } while (this.f18274a.mo12191k() < k2);
                m21280F(k2);
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: w */
    public final void mo12768w(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof xv3) {
            xv3 xv3 = (xv3) list;
            int i = this.f18275b & 7;
            if (i == 0) {
                do {
                    xv3.mo15248c(this.f18274a.mo12187c());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else if (i == 2) {
                int k = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    xv3.mo15248c(this.f18274a.mo12187c());
                } while (this.f18274a.mo12191k() < k);
                m21280F(k);
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f18274a.mo12187c()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else if (i2 == 2) {
                int k2 = this.f18274a.mo12191k() + this.f18274a.mo12199s();
                do {
                    list.add(Boolean.valueOf(this.f18274a.mo12187c()));
                } while (this.f18274a.mo12191k() < k2);
                m21280F(k2);
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: x */
    public final void mo12769x(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof lx3) {
            lx3 lx3 = (lx3) list;
            int i = this.f18275b & 7;
            if (i == 2) {
                int s = this.f18274a.mo12199s();
                m21282H(s);
                int k = this.f18274a.mo12191k() + s;
                do {
                    lx3.mo12216c(this.f18274a.mo12190j());
                } while (this.f18274a.mo12191k() < k);
            } else if (i == 5) {
                do {
                    lx3.mo12216c(this.f18274a.mo12190j());
                    if (!this.f18274a.mo12186b()) {
                        r2 = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r2 == this.f18275b);
                this.f18277d = r2;
            } else {
                throw ey3.m12337a();
            }
        } else {
            int i2 = this.f18275b & 7;
            if (i2 == 2) {
                int s2 = this.f18274a.mo12199s();
                m21282H(s2);
                int k2 = this.f18274a.mo12191k() + s2;
                do {
                    list.add(Float.valueOf(this.f18274a.mo12190j()));
                } while (this.f18274a.mo12191k() < k2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f18274a.mo12190j()));
                    if (!this.f18274a.mo12186b()) {
                        r = this.f18274a.mo12198r();
                    } else {
                        return;
                    }
                } while (r == this.f18275b);
                this.f18277d = r;
            } else {
                throw ey3.m12337a();
            }
        }
    }

    /* renamed from: y */
    public final Object mo12770y(wz3 wz3, ex3 ex3) throws IOException {
        m21281G(2);
        return m21279E(wz3, ex3);
    }

    @Deprecated
    /* renamed from: z */
    public final Object mo12771z(wz3 wz3, ex3 ex3) throws IOException {
        m21281G(3);
        return m21278D(wz3, ex3);
    }

    public final double zza() throws IOException {
        m21281G(1);
        return this.f18274a.mo12189i();
    }
}
