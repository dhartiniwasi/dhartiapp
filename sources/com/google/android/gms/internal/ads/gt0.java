package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class gt0 {

    /* renamed from: a */
    public static final gt0 f10059a = new bo0();

    /* renamed from: b */
    public static final za4 f10060b = an0.f6681a;

    protected gt0() {
    }

    /* renamed from: a */
    public abstract int mo8899a(Object obj);

    /* renamed from: b */
    public abstract int mo8900b();

    /* renamed from: c */
    public abstract int mo8901c();

    /* renamed from: d */
    public abstract dq0 mo8902d(int i, dq0 dq0, boolean z);

    /* renamed from: e */
    public abstract fs0 mo8903e(int i, fs0 fs0, long j);

    public final boolean equals(Object obj) {
        int h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt0)) {
            return false;
        }
        gt0 gt0 = (gt0) obj;
        if (gt0.mo8901c() == mo8901c() && gt0.mo8900b() == mo8900b()) {
            fs0 fs0 = new fs0();
            dq0 dq0 = new dq0();
            fs0 fs02 = new fs0();
            dq0 dq02 = new dq0();
            for (int i = 0; i < mo8901c(); i++) {
                if (!mo8903e(i, fs0, 0).equals(gt0.mo8903e(i, fs02, 0))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo8900b(); i2++) {
                if (!mo8902d(i2, dq0, true).equals(gt0.mo8902d(i2, dq02, true))) {
                    return false;
                }
            }
            int g = mo10604g(true);
            if (g == gt0.mo10604g(true) && (h = mo10605h(true)) == gt0.mo10605h(true)) {
                while (g != h) {
                    int j = mo10606j(g, 0, true);
                    if (j != gt0.mo10606j(g, 0, true)) {
                        return false;
                    }
                    g = j;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public abstract Object mo8904f(int i);

    /* renamed from: g */
    public int mo10604g(boolean z) {
        return mo10643o() ? -1 : 0;
    }

    /* renamed from: h */
    public int mo10605h(boolean z) {
        if (mo10643o()) {
            return -1;
        }
        return mo8901c() - 1;
    }

    public final int hashCode() {
        fs0 fs0 = new fs0();
        dq0 dq0 = new dq0();
        int c = mo8901c() + 217;
        for (int i = 0; i < mo8901c(); i++) {
            c = (c * 31) + mo8903e(i, fs0, 0).hashCode();
        }
        int b = (c * 31) + mo8900b();
        for (int i2 = 0; i2 < mo8900b(); i2++) {
            b = (b * 31) + mo8902d(i2, dq0, true).hashCode();
        }
        int g = mo10604g(true);
        while (g != -1) {
            b = (b * 31) + g;
            g = mo10606j(g, 0, true);
        }
        return b;
    }

    /* renamed from: i */
    public final int mo10640i(int i, dq0 dq0, fs0 fs0, int i2, boolean z) {
        int i3 = mo8902d(i, dq0, false).f8361c;
        if (mo8903e(i3, fs0, 0).f9439n != i) {
            return i + 1;
        }
        int j = mo10606j(i3, i2, z);
        if (j == -1) {
            return -1;
        }
        return mo8903e(j, fs0, 0).f9438m;
    }

    /* renamed from: j */
    public int mo10606j(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo10605h(z) ? mo10604g(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo10605h(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: k */
    public int mo10607k(int i, int i2, boolean z) {
        if (i == mo10604g(false)) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: l */
    public final Pair mo10641l(fs0 fs0, dq0 dq0, int i, long j) {
        Pair m = mo10642m(fs0, dq0, i, j, 0);
        Objects.requireNonNull(m);
        return m;
    }

    /* renamed from: m */
    public final Pair mo10642m(fs0 fs0, dq0 dq0, int i, long j, long j2) {
        v91.m22047a(i, 0, mo8901c());
        mo8903e(i, fs0, j2);
        if (j == -9223372036854775807L) {
            long j3 = fs0.f9436k;
            j = 0;
        }
        int i2 = fs0.f9438m;
        mo8902d(i2, dq0, false);
        while (i2 < fs0.f9439n) {
            long j4 = dq0.f8363e;
            int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i3 == 0) {
                break;
            }
            int i4 = i2 + 1;
            long j5 = mo8902d(i4, dq0, false).f8363e;
            if (i3 < 0) {
                break;
            }
            i2 = i4;
        }
        mo8902d(i2, dq0, true);
        long j6 = dq0.f8363e;
        long j7 = dq0.f8362d;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0, j);
        Object obj = dq0.f8360b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    /* renamed from: n */
    public dq0 mo10608n(Object obj, dq0 dq0) {
        return mo8902d(mo8899a(obj), dq0, true);
    }

    /* renamed from: o */
    public final boolean mo10643o() {
        return mo8901c() == 0;
    }
}
