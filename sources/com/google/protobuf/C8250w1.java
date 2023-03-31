package com.google.protobuf;

import com.google.protobuf.C8116c2;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.protobuf.w1 */
/* compiled from: UnknownFieldSetLite */
public final class C8250w1 {

    /* renamed from: f */
    private static final C8250w1 f35158f = new C8250w1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f35159a;

    /* renamed from: b */
    private int[] f35160b;

    /* renamed from: c */
    private Object[] f35161c;

    /* renamed from: d */
    private int f35162d;

    /* renamed from: e */
    private boolean f35163e;

    private C8250w1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    private void m45717b(int i) {
        int[] iArr = this.f35160b;
        if (i > iArr.length) {
            int i2 = this.f35159a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f35160b = Arrays.copyOf(iArr, i);
            this.f35161c = Arrays.copyOf(this.f35161c, i);
        }
    }

    /* renamed from: c */
    public static C8250w1 m45718c() {
        return f35158f;
    }

    /* renamed from: f */
    private static int m45719f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: g */
    private static int m45720g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: j */
    static C8250w1 m45721j(C8250w1 w1Var, C8250w1 w1Var2) {
        int i = w1Var.f35159a + w1Var2.f35159a;
        int[] copyOf = Arrays.copyOf(w1Var.f35160b, i);
        System.arraycopy(w1Var2.f35160b, 0, copyOf, w1Var.f35159a, w1Var2.f35159a);
        Object[] copyOf2 = Arrays.copyOf(w1Var.f35161c, i);
        System.arraycopy(w1Var2.f35161c, 0, copyOf2, w1Var.f35159a, w1Var2.f35159a);
        return new C8250w1(i, copyOf, copyOf2, true);
    }

    /* renamed from: k */
    static C8250w1 m45722k() {
        return new C8250w1();
    }

    /* renamed from: l */
    private static boolean m45723l(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    private static boolean m45724o(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    private static void m45725q(int i, Object obj, C8116c2 c2Var) throws IOException {
        int a = C8105b2.m44580a(i);
        int b = C8105b2.m44581b(i);
        if (b == 0) {
            c2Var.mo26862q(a, ((Long) obj).longValue());
        } else if (b == 1) {
            c2Var.mo26856k(a, ((Long) obj).longValue());
        } else if (b == 2) {
            c2Var.mo26867v(a, (C8153i) obj);
        } else if (b != 3) {
            if (b == 5) {
                c2Var.mo26851f(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C8135e0.m44686e());
        } else if (c2Var.mo26857l() == C8116c2.C8117a.ASCENDING) {
            c2Var.mo26866u(a);
            ((C8250w1) obj).mo27358r(c2Var);
            c2Var.mo26838H(a);
        } else {
            c2Var.mo26838H(a);
            ((C8250w1) obj).mo27358r(c2Var);
            c2Var.mo26866u(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo27348a() {
        if (!this.f35163e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d */
    public int mo27349d() {
        int i;
        int i2 = this.f35162d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f35159a; i4++) {
            int i5 = this.f35160b[i4];
            int a = C8105b2.m44580a(i5);
            int b = C8105b2.m44581b(i5);
            if (b == 0) {
                i = C8180l.m45141Y(a, ((Long) this.f35161c[i4]).longValue());
            } else if (b == 1) {
                i = C8180l.m45160p(a, ((Long) this.f35161c[i4]).longValue());
            } else if (b == 2) {
                i = C8180l.m45151h(a, (C8153i) this.f35161c[i4]);
            } else if (b == 3) {
                i = (C8180l.m45138V(a) * 2) + ((C8250w1) this.f35161c[i4]).mo27349d();
            } else if (b == 5) {
                i = C8180l.m45158n(a, ((Integer) this.f35161c[i4]).intValue());
            } else {
                throw new IllegalStateException(C8135e0.m44686e());
            }
            i3 += i;
        }
        this.f35162d = i3;
        return i3;
    }

    /* renamed from: e */
    public int mo27350e() {
        int i = this.f35162d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f35159a; i3++) {
            i2 += C8180l.m45127K(C8105b2.m44580a(this.f35160b[i3]), (C8153i) this.f35161c[i3]);
        }
        this.f35162d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8250w1)) {
            return false;
        }
        C8250w1 w1Var = (C8250w1) obj;
        int i = this.f35159a;
        return i == w1Var.f35159a && m45724o(this.f35160b, w1Var.f35160b, i) && m45723l(this.f35161c, w1Var.f35161c, this.f35159a);
    }

    /* renamed from: h */
    public void mo27352h() {
        this.f35163e = false;
    }

    public int hashCode() {
        int i = this.f35159a;
        return ((((527 + i) * 31) + m45719f(this.f35160b, i)) * 31) + m45720g(this.f35161c, this.f35159a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C8250w1 mo27354i(C8250w1 w1Var) {
        if (w1Var.equals(m45718c())) {
            return this;
        }
        mo27348a();
        int i = this.f35159a + w1Var.f35159a;
        m45717b(i);
        System.arraycopy(w1Var.f35160b, 0, this.f35160b, this.f35159a, w1Var.f35159a);
        System.arraycopy(w1Var.f35161c, 0, this.f35161c, this.f35159a, w1Var.f35159a);
        this.f35159a = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo27355m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f35159a; i2++) {
            C8252x0.m45751d(sb, i, String.valueOf(C8105b2.m44580a(this.f35160b[i2])), this.f35161c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo27356n(int i, Object obj) {
        mo27348a();
        m45717b(this.f35159a + 1);
        int[] iArr = this.f35160b;
        int i2 = this.f35159a;
        iArr[i2] = i;
        this.f35161c[i2] = obj;
        this.f35159a = i2 + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo27357p(C8116c2 c2Var) throws IOException {
        if (c2Var.mo26857l() == C8116c2.C8117a.DESCENDING) {
            for (int i = this.f35159a - 1; i >= 0; i--) {
                c2Var.mo26850e(C8105b2.m44580a(this.f35160b[i]), this.f35161c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f35159a; i2++) {
            c2Var.mo26850e(C8105b2.m44580a(this.f35160b[i2]), this.f35161c[i2]);
        }
    }

    /* renamed from: r */
    public void mo27358r(C8116c2 c2Var) throws IOException {
        if (this.f35159a != 0) {
            if (c2Var.mo26857l() == C8116c2.C8117a.ASCENDING) {
                for (int i = 0; i < this.f35159a; i++) {
                    m45725q(this.f35160b[i], this.f35161c[i], c2Var);
                }
                return;
            }
            for (int i2 = this.f35159a - 1; i2 >= 0; i2--) {
                m45725q(this.f35160b[i2], this.f35161c[i2], c2Var);
            }
        }
    }

    private C8250w1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f35162d = -1;
        this.f35159a = i;
        this.f35160b = iArr;
        this.f35161c = objArr;
        this.f35163e = z;
    }
}
