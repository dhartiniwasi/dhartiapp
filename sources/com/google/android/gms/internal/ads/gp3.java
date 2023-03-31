package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class gp3 extends gt0 {

    /* renamed from: c */
    private final int f10032c;

    /* renamed from: d */
    private final gi4 f10033d;

    public gp3(boolean z, gi4 gi4, byte[] bArr) {
        this.f10033d = gi4;
        this.f10032c = gi4.mo10549c();
    }

    /* renamed from: w */
    private final int m13452w(int i, boolean z) {
        if (z) {
            return this.f10033d.mo10550d(i);
        }
        if (i >= this.f10032c - 1) {
            return -1;
        }
        return i + 1;
    }

    /* renamed from: x */
    private final int m13453x(int i, boolean z) {
        if (z) {
            return this.f10033d.mo10551e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: a */
    public final int mo8899a(Object obj) {
        int a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = mo10609p(obj2);
        if (p == -1 || (a = mo10614u(p).mo8899a(obj3)) == -1) {
            return -1;
        }
        return mo10612s(p) + a;
    }

    /* renamed from: d */
    public final dq0 mo8902d(int i, dq0 dq0, boolean z) {
        int q = mo10610q(i);
        int t = mo10613t(q);
        mo10614u(q).mo8902d(i - mo10612s(q), dq0, z);
        dq0.f8361c += t;
        if (z) {
            Object v = mo10615v(q);
            Object obj = dq0.f8360b;
            Objects.requireNonNull(obj);
            dq0.f8360b = Pair.create(v, obj);
        }
        return dq0;
    }

    /* renamed from: e */
    public final fs0 mo8903e(int i, fs0 fs0, long j) {
        int r = mo10611r(i);
        int t = mo10613t(r);
        int s = mo10612s(r);
        mo10614u(r).mo8903e(i - t, fs0, j);
        Object v = mo10615v(r);
        if (!fs0.f9422o.equals(fs0.f9426a)) {
            v = Pair.create(v, fs0.f9426a);
        }
        fs0.f9426a = v;
        fs0.f9438m += s;
        fs0.f9439n += s;
        return fs0;
    }

    /* renamed from: f */
    public final Object mo8904f(int i) {
        int q = mo10610q(i);
        return Pair.create(mo10615v(q), mo10614u(q).mo8904f(i - mo10612s(q)));
    }

    /* renamed from: g */
    public final int mo10604g(boolean z) {
        if (this.f10032c == 0) {
            return -1;
        }
        int a = z ? this.f10033d.mo10547a() : 0;
        while (mo10614u(a).mo10643o()) {
            a = m13452w(a, z);
            if (a == -1) {
                return -1;
            }
        }
        return mo10613t(a) + mo10614u(a).mo10604g(z);
    }

    /* renamed from: h */
    public final int mo10605h(boolean z) {
        int i = this.f10032c;
        if (i == 0) {
            return -1;
        }
        int b = z ? this.f10033d.mo10548b() : i - 1;
        while (mo10614u(b).mo10643o()) {
            b = m13453x(b, z);
            if (b == -1) {
                return -1;
            }
        }
        return mo10613t(b) + mo10614u(b).mo10605h(z);
    }

    /* renamed from: j */
    public final int mo10606j(int i, int i2, boolean z) {
        int r = mo10611r(i);
        int t = mo10613t(r);
        int j = mo10614u(r).mo10606j(i - t, i2 == 2 ? 0 : i2, z);
        if (j != -1) {
            return t + j;
        }
        int w = m13452w(r, z);
        while (w != -1 && mo10614u(w).mo10643o()) {
            w = m13452w(w, z);
        }
        if (w != -1) {
            return mo10613t(w) + mo10614u(w).mo10604g(z);
        }
        if (i2 == 2) {
            return mo10604g(z);
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo10607k(int i, int i2, boolean z) {
        int r = mo10611r(i);
        int t = mo10613t(r);
        int k = mo10614u(r).mo10607k(i - t, 0, false);
        if (k != -1) {
            return t + k;
        }
        int x = m13453x(r, false);
        while (x != -1 && mo10614u(x).mo10643o()) {
            x = m13453x(x, false);
        }
        if (x != -1) {
            return mo10613t(x) + mo10614u(x).mo10605h(false);
        }
        return -1;
    }

    /* renamed from: n */
    public final dq0 mo10608n(Object obj, dq0 dq0) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = mo10609p(obj2);
        int t = mo10613t(p);
        mo10614u(p).mo10608n(obj3, dq0);
        dq0.f8361c += t;
        dq0.f8360b = obj;
        return dq0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo10609p(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract int mo10610q(int i);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract int mo10611r(int i);

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract int mo10612s(int i);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo10613t(int i);

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract gt0 mo10614u(int i);

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract Object mo10615v(int i);
}
