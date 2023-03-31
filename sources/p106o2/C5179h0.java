package p106o2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p037e2.C4221r;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p161w3.C5953m0;
import p161w3.C5980z;
import p177z1.C6249m2;

/* renamed from: o2.h0 */
/* compiled from: TsExtractor */
public final class C5179h0 implements C4215l {

    /* renamed from: t */
    public static final C4221r f26786t = C12013g0.f44978b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f26787a;

    /* renamed from: b */
    private final int f26788b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<C5940i0> f26789c;

    /* renamed from: d */
    private final C5918a0 f26790d;

    /* renamed from: e */
    private final SparseIntArray f26791e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5183i0.C5186c f26792f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final SparseArray<C5183i0> f26793g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseBooleanArray f26794h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final SparseBooleanArray f26795i;

    /* renamed from: j */
    private final C5177f0 f26796j;

    /* renamed from: k */
    private C5174e0 f26797k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C4217n f26798l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f26799m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f26800n;

    /* renamed from: o */
    private boolean f26801o;

    /* renamed from: p */
    private boolean f26802p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C5183i0 f26803q;

    /* renamed from: r */
    private int f26804r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f26805s;

    /* renamed from: o2.h0$a */
    /* compiled from: TsExtractor */
    private class C5180a implements C5169b0 {

        /* renamed from: a */
        private final C5980z f26806a = new C5980z(new byte[4]);

        public C5180a() {
        }

        /* renamed from: a */
        public void mo19145a(C5918a0 a0Var) {
            if (a0Var.mo20534C() == 0 && (a0Var.mo20534C() & 128) != 0) {
                a0Var.mo20547P(6);
                int a = a0Var.mo20548a() / 4;
                for (int i = 0; i < a; i++) {
                    a0Var.mo20556i(this.f26806a, 4);
                    int h = this.f26806a.mo20676h(16);
                    this.f26806a.mo20686r(3);
                    if (h == 0) {
                        this.f26806a.mo20686r(13);
                    } else {
                        int h2 = this.f26806a.mo20676h(13);
                        if (C5179h0.this.f26793g.get(h2) == null) {
                            C5179h0.this.f26793g.put(h2, new C5171c0(new C5181b(h2)));
                            C5179h0.m32171l(C5179h0.this);
                        }
                    }
                }
                if (C5179h0.this.f26787a != 2) {
                    C5179h0.this.f26793g.remove(0);
                }
            }
        }

        /* renamed from: c */
        public void mo19146c(C5940i0 i0Var, C4217n nVar, C5183i0.C5187d dVar) {
        }
    }

    /* renamed from: o2.h0$b */
    /* compiled from: TsExtractor */
    private class C5181b implements C5169b0 {

        /* renamed from: a */
        private final C5980z f26808a = new C5980z(new byte[5]);

        /* renamed from: b */
        private final SparseArray<C5183i0> f26809b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f26810c = new SparseIntArray();

        /* renamed from: d */
        private final int f26811d;

        public C5181b(int i) {
            this.f26811d = i;
        }

        /* renamed from: b */
        private C5183i0.C5185b m32193b(C5918a0 a0Var, int i) {
            int e = a0Var.mo20552e();
            int i2 = i + e;
            String str = null;
            ArrayList arrayList = null;
            int i3 = -1;
            while (a0Var.mo20552e() < i2) {
                int C = a0Var.mo20534C();
                int e2 = a0Var.mo20552e() + a0Var.mo20534C();
                if (e2 > i2) {
                    break;
                }
                if (C == 5) {
                    long E = a0Var.mo20536E();
                    if (E != 1094921523) {
                        if (E != 1161904947) {
                            if (E != 1094921524) {
                                if (E == 1212503619) {
                                    i3 = 36;
                                }
                                a0Var.mo20547P(e2 - a0Var.mo20552e());
                            }
                        }
                        i3 = 135;
                        a0Var.mo20547P(e2 - a0Var.mo20552e());
                    }
                    i3 = 129;
                    a0Var.mo20547P(e2 - a0Var.mo20552e());
                } else {
                    if (C != 106) {
                        if (C != 122) {
                            if (C == 127) {
                                if (a0Var.mo20534C() != 21) {
                                }
                            } else if (C == 123) {
                                i3 = 138;
                            } else if (C == 10) {
                                str = a0Var.mo20573z(3).trim();
                            } else if (C == 89) {
                                arrayList = new ArrayList();
                                while (a0Var.mo20552e() < e2) {
                                    String trim = a0Var.mo20573z(3).trim();
                                    int C2 = a0Var.mo20534C();
                                    byte[] bArr = new byte[4];
                                    a0Var.mo20557j(bArr, 0, 4);
                                    arrayList.add(new C5183i0.C5184a(trim, C2, bArr));
                                }
                                i3 = 89;
                            } else if (C == 111) {
                                i3 = 257;
                            }
                            a0Var.mo20547P(e2 - a0Var.mo20552e());
                        }
                        i3 = 135;
                        a0Var.mo20547P(e2 - a0Var.mo20552e());
                    }
                    i3 = 129;
                    a0Var.mo20547P(e2 - a0Var.mo20552e());
                }
                i3 = 172;
                a0Var.mo20547P(e2 - a0Var.mo20552e());
            }
            a0Var.mo20546O(i2);
            return new C5183i0.C5185b(i3, str, arrayList, Arrays.copyOfRange(a0Var.mo20551d(), e, i2));
        }

        /* renamed from: a */
        public void mo19145a(C5918a0 a0Var) {
            C5940i0 i0Var;
            C5183i0 i0Var2;
            C5918a0 a0Var2 = a0Var;
            if (a0Var.mo20534C() == 2) {
                if (C5179h0.this.f26787a == 1 || C5179h0.this.f26787a == 2 || C5179h0.this.f26799m == 1) {
                    i0Var = (C5940i0) C5179h0.this.f26789c.get(0);
                } else {
                    i0Var = new C5940i0(((C5940i0) C5179h0.this.f26789c.get(0)).mo20623c());
                    C5179h0.this.f26789c.add(i0Var);
                }
                if ((a0Var.mo20534C() & 128) != 0) {
                    a0Var2.mo20547P(1);
                    int I = a0Var.mo20540I();
                    int i = 3;
                    a0Var2.mo20547P(3);
                    a0Var2.mo20556i(this.f26808a, 2);
                    this.f26808a.mo20686r(3);
                    int i2 = 13;
                    int unused = C5179h0.this.f26805s = this.f26808a.mo20676h(13);
                    a0Var2.mo20556i(this.f26808a, 2);
                    int i3 = 4;
                    this.f26808a.mo20686r(4);
                    a0Var2.mo20547P(this.f26808a.mo20676h(12));
                    if (C5179h0.this.f26787a == 2 && C5179h0.this.f26803q == null) {
                        C5183i0.C5185b bVar = new C5183i0.C5185b(21, (String) null, (List<C5183i0.C5184a>) null, C5953m0.f29115f);
                        C5179h0 h0Var = C5179h0.this;
                        C5183i0 unused2 = h0Var.f26803q = h0Var.f26792f.mo19162a(21, bVar);
                        if (C5179h0.this.f26803q != null) {
                            C5179h0.this.f26803q.mo19154c(i0Var, C5179h0.this.f26798l, new C5183i0.C5187d(I, 21, 8192));
                        }
                    }
                    this.f26809b.clear();
                    this.f26810c.clear();
                    int a = a0Var.mo20548a();
                    while (a > 0) {
                        a0Var2.mo20556i(this.f26808a, 5);
                        int h = this.f26808a.mo20676h(8);
                        this.f26808a.mo20686r(i);
                        int h2 = this.f26808a.mo20676h(i2);
                        this.f26808a.mo20686r(i3);
                        int h3 = this.f26808a.mo20676h(12);
                        C5183i0.C5185b b = m32193b(a0Var2, h3);
                        if (h == 6 || h == 5) {
                            h = b.f26838a;
                        }
                        a -= h3 + 5;
                        int i4 = C5179h0.this.f26787a == 2 ? h : h2;
                        if (!C5179h0.this.f26794h.get(i4)) {
                            if (C5179h0.this.f26787a == 2 && h == 21) {
                                i0Var2 = C5179h0.this.f26803q;
                            } else {
                                i0Var2 = C5179h0.this.f26792f.mo19162a(h, b);
                            }
                            if (C5179h0.this.f26787a != 2 || h2 < this.f26810c.get(i4, 8192)) {
                                this.f26810c.put(i4, h2);
                                this.f26809b.put(i4, i0Var2);
                            }
                        }
                        i = 3;
                        i3 = 4;
                        i2 = 13;
                    }
                    int size = this.f26810c.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        int keyAt = this.f26810c.keyAt(i5);
                        int valueAt = this.f26810c.valueAt(i5);
                        C5179h0.this.f26794h.put(keyAt, true);
                        C5179h0.this.f26795i.put(valueAt, true);
                        C5183i0 valueAt2 = this.f26809b.valueAt(i5);
                        if (valueAt2 != null) {
                            if (valueAt2 != C5179h0.this.f26803q) {
                                valueAt2.mo19154c(i0Var, C5179h0.this.f26798l, new C5183i0.C5187d(I, keyAt, 8192));
                            }
                            C5179h0.this.f26793g.put(valueAt, valueAt2);
                        }
                    }
                    if (C5179h0.this.f26787a != 2) {
                        C5179h0.this.f26793g.remove(this.f26811d);
                        C5179h0 h0Var2 = C5179h0.this;
                        int unused3 = h0Var2.f26799m = h0Var2.f26787a == 1 ? 0 : C5179h0.this.f26799m - 1;
                        if (C5179h0.this.f26799m == 0) {
                            C5179h0.this.f26798l.mo6782n();
                            boolean unused4 = C5179h0.this.f26800n = true;
                        }
                    } else if (!C5179h0.this.f26800n) {
                        C5179h0.this.f26798l.mo6782n();
                        int unused5 = C5179h0.this.f26799m = 0;
                        boolean unused6 = C5179h0.this.f26800n = true;
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo19146c(C5940i0 i0Var, C4217n nVar, C5183i0.C5187d dVar) {
        }
    }

    public C5179h0() {
        this(0);
    }

    /* renamed from: A */
    private boolean m32164A(int i) {
        if (this.f26787a == 2 || this.f26800n || !this.f26795i.get(i, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    static /* synthetic */ int m32171l(C5179h0 h0Var) {
        int i = h0Var.f26799m;
        h0Var.f26799m = i + 1;
        return i;
    }

    /* renamed from: v */
    private boolean m32181v(C4216m mVar) throws IOException {
        byte[] d = this.f26790d.mo20551d();
        if (9400 - this.f26790d.mo20552e() < 188) {
            int a = this.f26790d.mo20548a();
            if (a > 0) {
                System.arraycopy(d, this.f26790d.mo20552e(), d, 0, a);
            }
            this.f26790d.mo20544M(d, a);
        }
        while (this.f26790d.mo20548a() < 188) {
            int f = this.f26790d.mo20553f();
            int read = mVar.read(d, f, 9400 - f);
            if (read == -1) {
                return false;
            }
            this.f26790d.mo20545N(f + read);
        }
        return true;
    }

    /* renamed from: w */
    private int m32182w() throws C6249m2 {
        int e = this.f26790d.mo20552e();
        int f = this.f26790d.mo20553f();
        int a = C5189j0.m32234a(this.f26790d.mo20551d(), e, f);
        this.f26790d.mo20546O(a);
        int i = a + 188;
        if (i > f) {
            int i2 = this.f26804r + (a - e);
            this.f26804r = i2;
            if (this.f26787a == 2 && i2 > 376) {
                throw C6249m2.m36661a("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
            }
        } else {
            this.f26804r = 0;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ C4215l[] m32183x() {
        return new C4215l[]{new C5179h0()};
    }

    /* renamed from: y */
    private void m32184y(long j) {
        if (!this.f26801o) {
            this.f26801o = true;
            if (this.f26796j.mo19157b() != -9223372036854775807L) {
                C5174e0 e0Var = new C5174e0(this.f26796j.mo19158c(), this.f26796j.mo19157b(), j, this.f26805s, this.f26788b);
                this.f26797k = e0Var;
                this.f26798l.mo6781l(e0Var.mo17526b());
                return;
            }
            this.f26798l.mo6781l(new C4192b0.C4194b(this.f26796j.mo19157b()));
        }
    }

    /* renamed from: z */
    private void m32185z() {
        this.f26794h.clear();
        this.f26793g.clear();
        SparseArray<C5183i0> b = this.f26792f.mo19163b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            this.f26793g.put(b.keyAt(i), b.valueAt(i));
        }
        this.f26793g.put(0, new C5171c0(new C5180a()));
        this.f26803q = null;
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        C5174e0 e0Var;
        C5917a.m34873f(this.f26787a != 2);
        int size = this.f26789c.size();
        for (int i = 0; i < size; i++) {
            C5940i0 i0Var = this.f26789c.get(i);
            boolean z = i0Var.mo20625e() == -9223372036854775807L;
            if (!z) {
                long c = i0Var.mo20623c();
                z = (c == -9223372036854775807L || c == 0 || c == j2) ? false : true;
            }
            if (z) {
                i0Var.mo20626g(j2);
            }
        }
        if (!(j2 == 0 || (e0Var = this.f26797k) == null)) {
            e0Var.mo17532h(j2);
        }
        this.f26790d.mo20542K(0);
        this.f26791e.clear();
        for (int i2 = 0; i2 < this.f26793g.size(); i2++) {
            this.f26793g.valueAt(i2).mo19153b();
        }
        this.f26804r = 0;
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f26798l = nVar;
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        C4216m mVar2 = mVar;
        C4190a0 a0Var2 = a0Var;
        long b = mVar.mo17553b();
        if (this.f26800n) {
            if (((b == -1 || this.f26787a == 2) ? false : true) && !this.f26796j.mo19159d()) {
                return this.f26796j.mo19160e(mVar2, a0Var2, this.f26805s);
            }
            m32184y(b);
            if (this.f26802p) {
                this.f26802p = false;
                mo17580c(0, 0);
                if (mVar.mo17554c() != 0) {
                    a0Var2.f23479a = 0;
                    return 1;
                }
            }
            C5174e0 e0Var = this.f26797k;
            if (e0Var != null && e0Var.mo17528d()) {
                return this.f26797k.mo17527c(mVar2, a0Var2);
            }
        }
        if (!m32181v(mVar)) {
            return -1;
        }
        int w = m32182w();
        int f = this.f26790d.mo20553f();
        if (w > f) {
            return 0;
        }
        int m = this.f26790d.mo20560m();
        if ((8388608 & m) != 0) {
            this.f26790d.mo20546O(w);
            return 0;
        }
        int i = ((4194304 & m) != 0 ? 1 : 0) | 0;
        int i2 = (2096896 & m) >> 8;
        boolean z = (m & 32) != 0;
        C5183i0 i0Var = (m & 16) != 0 ? this.f26793g.get(i2) : null;
        if (i0Var == null) {
            this.f26790d.mo20546O(w);
            return 0;
        }
        if (this.f26787a != 2) {
            int i3 = m & 15;
            int i4 = this.f26791e.get(i2, i3 - 1);
            this.f26791e.put(i2, i3);
            if (i4 == i3) {
                this.f26790d.mo20546O(w);
                return 0;
            } else if (i3 != ((i4 + 1) & 15)) {
                i0Var.mo19153b();
            }
        }
        if (z) {
            int C = this.f26790d.mo20534C();
            i |= (this.f26790d.mo20534C() & 64) != 0 ? 2 : 0;
            this.f26790d.mo20547P(C - 1);
        }
        boolean z2 = this.f26800n;
        if (m32164A(i2)) {
            this.f26790d.mo20545N(w);
            i0Var.mo19152a(this.f26790d, i);
            this.f26790d.mo20545N(f);
        }
        if (this.f26787a != 2 && !z2 && this.f26800n && b != -1) {
            this.f26802p = true;
        }
        this.f26790d.mo20546O(w);
        return 0;
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        boolean z;
        byte[] d = this.f26790d.mo20551d();
        mVar.mo17563p(d, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                } else if (d[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                mVar.mo17561k(i);
                return true;
            }
        }
        return false;
    }

    public C5179h0(int i) {
        this(1, i, 112800);
    }

    public C5179h0(int i, int i2, int i3) {
        this(i, new C5940i0(0), new C5188j(i2), i3);
    }

    public C5179h0(int i, C5940i0 i0Var, C5183i0.C5186c cVar) {
        this(i, i0Var, cVar, 112800);
    }

    public C5179h0(int i, C5940i0 i0Var, C5183i0.C5186c cVar, int i2) {
        this.f26792f = (C5183i0.C5186c) C5917a.m34872e(cVar);
        this.f26788b = i2;
        this.f26787a = i;
        if (i == 1 || i == 2) {
            this.f26789c = Collections.singletonList(i0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f26789c = arrayList;
            arrayList.add(i0Var);
        }
        this.f26790d = new C5918a0(new byte[9400], 0);
        this.f26794h = new SparseBooleanArray();
        this.f26795i = new SparseBooleanArray();
        this.f26793g = new SparseArray<>();
        this.f26791e = new SparseIntArray();
        this.f26796j = new C5177f0(i2);
        this.f26798l = C4217n.f23563W;
        this.f26805s = -1;
        m32185z();
    }
}
