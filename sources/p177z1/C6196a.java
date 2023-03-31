package p177z1;

import android.util.Pair;
import p015b3.C1757s0;
import p161w3.C5917a;
import p177z1.C6266q3;

/* renamed from: z1.a */
/* compiled from: AbstractConcatenatedTimeline */
public abstract class C6196a extends C6266q3 {

    /* renamed from: c */
    private final int f29752c;

    /* renamed from: d */
    private final C1757s0 f29753d;

    /* renamed from: e */
    private final boolean f29754e;

    public C6196a(boolean z, C1757s0 s0Var) {
        this.f29754e = z;
        this.f29753d = s0Var;
        this.f29752c = s0Var.mo6873b();
    }

    /* renamed from: A */
    public static Object m36062A(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: B */
    public static Object m36063B(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: D */
    public static Object m36064D(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: G */
    private int m36065G(int i, boolean z) {
        if (z) {
            return this.f29753d.mo6877f(i);
        }
        if (i < this.f29752c - 1) {
            return i + 1;
        }
        return -1;
    }

    /* renamed from: H */
    private int m36066H(int i, boolean z) {
        if (z) {
            return this.f29753d.mo6876e(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract Object mo6756C(int i);

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract int mo6757E(int i);

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract int mo6758F(int i);

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract C6266q3 mo6759I(int i);

    /* renamed from: e */
    public int mo6808e(boolean z) {
        if (this.f29752c == 0) {
            return -1;
        }
        int i = 0;
        if (this.f29754e) {
            z = false;
        }
        if (z) {
            i = this.f29753d.mo6875d();
        }
        while (mo6759I(i).mo21451u()) {
            i = m36065G(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo6758F(i) + mo6759I(i).mo6808e(z);
    }

    /* renamed from: f */
    public final int mo6809f(Object obj) {
        int f;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object B = m36063B(obj);
        Object A = m36062A(obj);
        int x = mo6762x(B);
        if (x == -1 || (f = mo6759I(x).mo6809f(A)) == -1) {
            return -1;
        }
        return mo6757E(x) + f;
    }

    /* renamed from: g */
    public int mo6810g(boolean z) {
        int i = this.f29752c;
        if (i == 0) {
            return -1;
        }
        if (this.f29754e) {
            z = false;
        }
        int h = z ? this.f29753d.mo6879h() : i - 1;
        while (mo6759I(h).mo21451u()) {
            h = m36066H(h, z);
            if (h == -1) {
                return -1;
            }
        }
        return mo6758F(h) + mo6759I(h).mo6810g(z);
    }

    /* renamed from: i */
    public int mo6811i(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f29754e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int z2 = mo6764z(i);
        int F = mo6758F(z2);
        C6266q3 I = mo6759I(z2);
        int i4 = i - F;
        if (i2 != 2) {
            i3 = i2;
        }
        int i5 = I.mo6811i(i4, i3, z);
        if (i5 != -1) {
            return F + i5;
        }
        int G = m36065G(z2, z);
        while (G != -1 && mo6759I(G).mo21451u()) {
            G = m36065G(G, z);
        }
        if (G != -1) {
            return mo6758F(G) + mo6759I(G).mo6808e(z);
        }
        if (i2 == 2) {
            return mo6808e(z);
        }
        return -1;
    }

    /* renamed from: k */
    public final C6266q3.C6268b mo6711k(int i, C6266q3.C6268b bVar, boolean z) {
        int y = mo6763y(i);
        int F = mo6758F(y);
        mo6759I(y).mo6711k(i - mo6757E(y), bVar, z);
        bVar.f30186c += F;
        if (z) {
            bVar.f30185b = m36064D(mo6756C(y), C5917a.m34872e(bVar.f30185b));
        }
        return bVar;
    }

    /* renamed from: l */
    public final C6266q3.C6268b mo21149l(Object obj, C6266q3.C6268b bVar) {
        Object B = m36063B(obj);
        Object A = m36062A(obj);
        int x = mo6762x(B);
        int F = mo6758F(x);
        mo6759I(x).mo21149l(A, bVar);
        bVar.f30186c += F;
        bVar.f30185b = obj;
        return bVar;
    }

    /* renamed from: p */
    public int mo6812p(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f29754e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int z2 = mo6764z(i);
        int F = mo6758F(z2);
        C6266q3 I = mo6759I(z2);
        int i4 = i - F;
        if (i2 != 2) {
            i3 = i2;
        }
        int p = I.mo6812p(i4, i3, z);
        if (p != -1) {
            return F + p;
        }
        int H = m36066H(z2, z);
        while (H != -1 && mo6759I(H).mo21451u()) {
            H = m36066H(H, z);
        }
        if (H != -1) {
            return mo6758F(H) + mo6759I(H).mo6810g(z);
        }
        if (i2 == 2) {
            return mo6810g(z);
        }
        return -1;
    }

    /* renamed from: q */
    public final Object mo6813q(int i) {
        int y = mo6763y(i);
        return m36064D(mo6756C(y), mo6759I(y).mo6813q(i - mo6757E(y)));
    }

    /* renamed from: s */
    public final C6266q3.C6270d mo6712s(int i, C6266q3.C6270d dVar, long j) {
        int z = mo6764z(i);
        int F = mo6758F(z);
        int E = mo6757E(z);
        mo6759I(z).mo6712s(i - F, dVar, j);
        Object C = mo6756C(z);
        if (!C6266q3.C6270d.f30198z.equals(dVar.f30199a)) {
            C = m36064D(C, dVar.f30199a);
        }
        dVar.f30199a = C;
        dVar.f30213w += E;
        dVar.f30214x += E;
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract int mo6762x(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract int mo6763y(int i);

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract int mo6764z(int i);
}
