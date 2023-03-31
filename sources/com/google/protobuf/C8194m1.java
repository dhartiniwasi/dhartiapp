package com.google.protobuf;

import com.google.protobuf.C8153i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.m1 */
/* compiled from: RopeByteString */
final class C8194m1 extends C8153i {

    /* renamed from: r */
    static final int[] f35013r = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: e */
    private final int f35014e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C8153i f35015f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C8153i f35016g;

    /* renamed from: h */
    private final int f35017h;

    /* renamed from: i */
    private final int f35018i;

    /* renamed from: com.google.protobuf.m1$a */
    /* compiled from: RopeByteString */
    class C8195a extends C8153i.C8156c {

        /* renamed from: a */
        final C8197c f35019a;

        /* renamed from: b */
        C8153i.C8160g f35020b = m45427c();

        C8195a() {
            this.f35019a = new C8197c(C8194m1.this, (C8195a) null);
        }

        /* renamed from: c */
        private C8153i.C8160g m45427c() {
            if (this.f35019a.hasNext()) {
                return this.f35019a.next().iterator();
            }
            return null;
        }

        /* renamed from: b */
        public byte mo26944b() {
            C8153i.C8160g gVar = this.f35020b;
            if (gVar != null) {
                byte b = gVar.mo26944b();
                if (!this.f35020b.hasNext()) {
                    this.f35020b = m45427c();
                }
                return b;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f35020b != null;
        }
    }

    /* renamed from: com.google.protobuf.m1$c */
    /* compiled from: RopeByteString */
    private static final class C8197c implements Iterator<C8153i.C8162i> {

        /* renamed from: a */
        private final ArrayDeque<C8194m1> f35023a;

        /* renamed from: b */
        private C8153i.C8162i f35024b;

        /* synthetic */ C8197c(C8153i iVar, C8195a aVar) {
            this(iVar);
        }

        /* renamed from: a */
        private C8153i.C8162i m45434a(C8153i iVar) {
            while (iVar instanceof C8194m1) {
                C8194m1 m1Var = (C8194m1) iVar;
                this.f35023a.push(m1Var);
                iVar = m1Var.f35015f;
            }
            return (C8153i.C8162i) iVar;
        }

        /* renamed from: c */
        private C8153i.C8162i m45435c() {
            C8153i.C8162i a;
            do {
                ArrayDeque<C8194m1> arrayDeque = this.f35023a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                a = m45434a(this.f35023a.pop().f35016g);
            } while (a.isEmpty());
            return a;
        }

        /* renamed from: d */
        public C8153i.C8162i next() {
            C8153i.C8162i iVar = this.f35024b;
            if (iVar != null) {
                this.f35024b = m45435c();
                return iVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f35024b != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C8197c(C8153i iVar) {
            if (iVar instanceof C8194m1) {
                C8194m1 m1Var = (C8194m1) iVar;
                ArrayDeque<C8194m1> arrayDeque = new ArrayDeque<>(m1Var.mo26941v());
                this.f35023a = arrayDeque;
                arrayDeque.push(m1Var);
                this.f35024b = m45434a(m1Var.f35015f);
                return;
            }
            this.f35023a = null;
            this.f35024b = (C8153i.C8162i) iVar;
        }
    }

    /* synthetic */ C8194m1(C8153i iVar, C8153i iVar2, C8195a aVar) {
        this(iVar, iVar2);
    }

    /* renamed from: a0 */
    static C8153i m45408a0(C8153i iVar, C8153i iVar2) {
        if (iVar2.size() == 0) {
            return iVar;
        }
        if (iVar.size() == 0) {
            return iVar2;
        }
        int size = iVar.size() + iVar2.size();
        if (size < 128) {
            return m45409b0(iVar, iVar2);
        }
        if (iVar instanceof C8194m1) {
            C8194m1 m1Var = (C8194m1) iVar;
            if (m1Var.f35016g.size() + iVar2.size() < 128) {
                return new C8194m1(m1Var.f35015f, m45409b0(m1Var.f35016g, iVar2));
            } else if (m1Var.f35015f.mo26941v() > m1Var.f35016g.mo26941v() && m1Var.mo26941v() > iVar2.mo26941v()) {
                return new C8194m1(m1Var.f35015f, new C8194m1(m1Var.f35016g, iVar2));
            }
        }
        if (size >= m45411d0(Math.max(iVar.mo26941v(), iVar2.mo26941v()) + 1)) {
            return new C8194m1(iVar, iVar2);
        }
        return new C8196b((C8195a) null).m45430b(iVar, iVar2);
    }

    /* renamed from: b0 */
    private static C8153i m45409b0(C8153i iVar, C8153i iVar2) {
        int size = iVar.size();
        int size2 = iVar2.size();
        byte[] bArr = new byte[(size + size2)];
        iVar.mo26939t(bArr, 0, 0, size);
        iVar2.mo26939t(bArr, 0, size, size2);
        return C8153i.m44770T(bArr);
    }

    /* renamed from: c0 */
    private boolean m45410c0(C8153i iVar) {
        boolean z;
        C8197c cVar = new C8197c(this, (C8195a) null);
        C8153i.C8162i iVar2 = (C8153i.C8162i) cVar.next();
        C8197c cVar2 = new C8197c(iVar, (C8195a) null);
        C8153i.C8162i iVar3 = (C8153i.C8162i) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = iVar2.size() - i;
            int size2 = iVar3.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = iVar2.mo26884X(iVar3, i2, min);
            } else {
                z = iVar3.mo26884X(iVar2, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.f35014e;
            if (i3 < i4) {
                if (min == size) {
                    iVar2 = (C8153i.C8162i) cVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    iVar3 = (C8153i.C8162i) cVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: d0 */
    static int m45411d0(int i) {
        int[] iArr = f35013r;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    /* renamed from: B */
    public C8167j mo26878B() {
        return C8167j.m44843h(mo27172Z(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public int mo26879C(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f35017h;
        if (i4 <= i5) {
            return this.f35015f.mo26879C(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f35016g.mo26879C(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f35016g.mo26879C(this.f35015f.mo26879C(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public int mo26880D(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f35017h;
        if (i4 <= i5) {
            return this.f35015f.mo26880D(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f35016g.mo26880D(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f35016g.mo26880D(this.f35015f.mo26880D(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: J */
    public C8153i mo26881J(int i, int i2) {
        int k = C8153i.m44775k(i, i2, this.f35014e);
        if (k == 0) {
            return C8153i.f34908b;
        }
        if (k == this.f35014e) {
            return this;
        }
        int i3 = this.f35017h;
        if (i2 <= i3) {
            return this.f35015f.mo26881J(i, i2);
        }
        if (i >= i3) {
            return this.f35016g.mo26881J(i - i3, i2 - i3);
        }
        return new C8194m1(this.f35015f.mo26931G(i), this.f35016g.mo26881J(0, i2 - this.f35017h));
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public String mo26882N(Charset charset) {
        return new String(mo26932K(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo26883W(C8147h hVar) throws IOException {
        this.f35015f.mo26883W(hVar);
        this.f35016g.mo26883W(hVar);
    }

    /* renamed from: Z */
    public List<ByteBuffer> mo27172Z() {
        ArrayList arrayList = new ArrayList();
        C8197c cVar = new C8197c(this, (C8195a) null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().mo26885c());
        }
        return arrayList;
    }

    /* renamed from: c */
    public ByteBuffer mo26885c() {
        return ByteBuffer.wrap(mo26932K()).asReadOnlyBuffer();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8153i)) {
            return false;
        }
        C8153i iVar = (C8153i) obj;
        if (this.f35014e != iVar.size()) {
            return false;
        }
        if (this.f35014e == 0) {
            return true;
        }
        int E = mo26930E();
        int E2 = iVar.mo26930E();
        if (E == 0 || E2 == 0 || E == E2) {
            return m45410c0(iVar);
        }
        return false;
    }

    /* renamed from: i */
    public byte mo26887i(int i) {
        C8153i.m44774j(i, this.f35014e);
        return mo26890w(i);
    }

    public int size() {
        return this.f35014e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo26889u(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f35017h;
        if (i4 <= i5) {
            this.f35015f.mo26889u(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f35016g.mo26889u(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.f35015f.mo26889u(bArr, i, i2, i6);
            this.f35016g.mo26889u(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int mo26941v() {
        return this.f35018i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public byte mo26890w(int i) {
        int i2 = this.f35017h;
        if (i < i2) {
            return this.f35015f.mo26890w(i);
        }
        return this.f35016g.mo26890w(i - i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo26942x() {
        return this.f35014e >= m45411d0(this.f35018i);
    }

    /* renamed from: y */
    public boolean mo26891y() {
        int D = this.f35015f.mo26880D(0, 0, this.f35017h);
        C8153i iVar = this.f35016g;
        if (iVar.mo26880D(D, 0, iVar.size()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public C8153i.C8160g iterator() {
        return new C8195a();
    }

    /* renamed from: com.google.protobuf.m1$b */
    /* compiled from: RopeByteString */
    private static class C8196b {

        /* renamed from: a */
        private final ArrayDeque<C8153i> f35022a;

        private C8196b() {
            this.f35022a = new ArrayDeque<>();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C8153i m45430b(C8153i iVar, C8153i iVar2) {
            m45431c(iVar);
            m45431c(iVar2);
            C8153i pop = this.f35022a.pop();
            while (!this.f35022a.isEmpty()) {
                pop = new C8194m1(this.f35022a.pop(), pop, (C8195a) null);
            }
            return pop;
        }

        /* renamed from: c */
        private void m45431c(C8153i iVar) {
            if (iVar.mo26942x()) {
                m45433e(iVar);
            } else if (iVar instanceof C8194m1) {
                C8194m1 m1Var = (C8194m1) iVar;
                m45431c(m1Var.f35015f);
                m45431c(m1Var.f35016g);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + iVar.getClass());
            }
        }

        /* renamed from: d */
        private int m45432d(int i) {
            int binarySearch = Arrays.binarySearch(C8194m1.f35013r, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        private void m45433e(C8153i iVar) {
            int d = m45432d(iVar.size());
            int d0 = C8194m1.m45411d0(d + 1);
            if (this.f35022a.isEmpty() || this.f35022a.peek().size() >= d0) {
                this.f35022a.push(iVar);
                return;
            }
            int d02 = C8194m1.m45411d0(d);
            C8153i pop = this.f35022a.pop();
            while (!this.f35022a.isEmpty() && this.f35022a.peek().size() < d02) {
                pop = new C8194m1(this.f35022a.pop(), pop, (C8195a) null);
            }
            C8194m1 m1Var = new C8194m1(pop, iVar, (C8195a) null);
            while (!this.f35022a.isEmpty() && this.f35022a.peek().size() < C8194m1.m45411d0(m45432d(m1Var.size()) + 1)) {
                m1Var = new C8194m1(this.f35022a.pop(), m1Var, (C8195a) null);
            }
            this.f35022a.push(m1Var);
        }

        /* synthetic */ C8196b(C8195a aVar) {
            this();
        }
    }

    private C8194m1(C8153i iVar, C8153i iVar2) {
        this.f35015f = iVar;
        this.f35016g = iVar2;
        int size = iVar.size();
        this.f35017h = size;
        this.f35014e = size + iVar2.size();
        this.f35018i = Math.max(iVar.mo26941v(), iVar2.mo26941v()) + 1;
    }
}
