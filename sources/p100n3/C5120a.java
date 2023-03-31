package p100n3;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p079k3.C4864b;
import p079k3.C4872g;
import p079k3.C4874h;
import p079k3.C4876j;
import p161w3.C5918a0;
import p161w3.C5953m0;

/* renamed from: n3.a */
/* compiled from: PgsDecoder */
public final class C5120a extends C4872g {

    /* renamed from: o */
    private final C5918a0 f26627o = new C5918a0();

    /* renamed from: p */
    private final C5918a0 f26628p = new C5918a0();

    /* renamed from: q */
    private final C5121a f26629q = new C5121a();

    /* renamed from: r */
    private Inflater f26630r;

    /* renamed from: n3.a$a */
    /* compiled from: PgsDecoder */
    private static final class C5121a {

        /* renamed from: a */
        private final C5918a0 f26631a = new C5918a0();

        /* renamed from: b */
        private final int[] f26632b = new int[256];

        /* renamed from: c */
        private boolean f26633c;

        /* renamed from: d */
        private int f26634d;

        /* renamed from: e */
        private int f26635e;

        /* renamed from: f */
        private int f26636f;

        /* renamed from: g */
        private int f26637g;

        /* renamed from: h */
        private int f26638h;

        /* renamed from: i */
        private int f26639i;

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m32001e(C5918a0 a0Var, int i) {
            int F;
            if (i >= 4) {
                a0Var.mo20547P(3);
                int i2 = i - 4;
                if ((a0Var.mo20534C() & 128) != 0) {
                    if (i2 >= 7 && (F = a0Var.mo20537F()) >= 4) {
                        this.f26638h = a0Var.mo20540I();
                        this.f26639i = a0Var.mo20540I();
                        this.f26631a.mo20542K(F - 4);
                        i2 -= 7;
                    } else {
                        return;
                    }
                }
                int e = this.f26631a.mo20552e();
                int f = this.f26631a.mo20553f();
                if (e < f && i2 > 0) {
                    int min = Math.min(i2, f - e);
                    a0Var.mo20557j(this.f26631a.mo20551d(), e, min);
                    this.f26631a.mo20546O(e + min);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m32002f(C5918a0 a0Var, int i) {
            if (i >= 19) {
                this.f26634d = a0Var.mo20540I();
                this.f26635e = a0Var.mo20540I();
                a0Var.mo20547P(11);
                this.f26636f = a0Var.mo20540I();
                this.f26637g = a0Var.mo20540I();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m32003g(C5918a0 a0Var, int i) {
            if (i % 5 == 2) {
                a0Var.mo20547P(2);
                Arrays.fill(this.f26632b, 0);
                int i2 = i / 5;
                int i3 = 0;
                while (i3 < i2) {
                    int C = a0Var.mo20534C();
                    int C2 = a0Var.mo20534C();
                    int C3 = a0Var.mo20534C();
                    int C4 = a0Var.mo20534C();
                    int C5 = a0Var.mo20534C();
                    double d = (double) C2;
                    double d2 = (double) (C3 - 128);
                    int i4 = i3;
                    double d3 = (double) (C4 - 128);
                    int[] iArr = this.f26632b;
                    int q = C5953m0.m35152q((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8;
                    iArr[C] = C5953m0.m35152q((int) (d + (d3 * 1.772d)), 0, 255) | q | (C5 << 24) | (C5953m0.m35152q((int) ((1.402d * d2) + d), 0, 255) << 16);
                    i3 = i4 + 1;
                }
                this.f26633c = true;
            }
        }

        /* renamed from: d */
        public C4864b mo19091d() {
            int i;
            int i2;
            int i3;
            if (this.f26634d == 0 || this.f26635e == 0 || this.f26638h == 0 || this.f26639i == 0 || this.f26631a.mo20553f() == 0 || this.f26631a.mo20552e() != this.f26631a.mo20553f() || !this.f26633c) {
                return null;
            }
            this.f26631a.mo20546O(0);
            int i4 = this.f26638h * this.f26639i;
            int[] iArr = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int C = this.f26631a.mo20534C();
                if (C != 0) {
                    i3 = i5 + 1;
                    iArr[i5] = this.f26632b[C];
                } else {
                    int C2 = this.f26631a.mo20534C();
                    if (C2 != 0) {
                        if ((C2 & 64) == 0) {
                            i = C2 & 63;
                        } else {
                            i = ((C2 & 63) << 8) | this.f26631a.mo20534C();
                        }
                        if ((C2 & 128) == 0) {
                            i2 = 0;
                        } else {
                            i2 = this.f26632b[this.f26631a.mo20534C()];
                        }
                        i3 = i + i5;
                        Arrays.fill(iArr, i5, i3, i2);
                    }
                }
                i5 = i3;
            }
            return new C4864b.C4866b().mo18629f(Bitmap.createBitmap(iArr, this.f26638h, this.f26639i, Bitmap.Config.ARGB_8888)).mo18634k(((float) this.f26636f) / ((float) this.f26634d)).mo18635l(0).mo18631h(((float) this.f26637g) / ((float) this.f26635e), 0).mo18632i(0).mo18637n(((float) this.f26638h) / ((float) this.f26634d)).mo18630g(((float) this.f26639i) / ((float) this.f26635e)).mo18624a();
        }

        /* renamed from: h */
        public void mo19092h() {
            this.f26634d = 0;
            this.f26635e = 0;
            this.f26636f = 0;
            this.f26637g = 0;
            this.f26638h = 0;
            this.f26639i = 0;
            this.f26631a.mo20542K(0);
            this.f26633c = false;
        }
    }

    public C5120a() {
        super("PgsDecoder");
    }

    /* renamed from: C */
    private void m31995C(C5918a0 a0Var) {
        if (a0Var.mo20548a() > 0 && a0Var.mo20555h() == 120) {
            if (this.f26630r == null) {
                this.f26630r = new Inflater();
            }
            if (C5953m0.m35153q0(a0Var, this.f26628p, this.f26630r)) {
                a0Var.mo20544M(this.f26628p.mo20551d(), this.f26628p.mo20553f());
            }
        }
    }

    /* renamed from: D */
    private static C4864b m31996D(C5918a0 a0Var, C5121a aVar) {
        int f = a0Var.mo20553f();
        int C = a0Var.mo20534C();
        int I = a0Var.mo20540I();
        int e = a0Var.mo20552e() + I;
        C4864b bVar = null;
        if (e > f) {
            a0Var.mo20546O(f);
            return null;
        }
        if (C != 128) {
            switch (C) {
                case 20:
                    aVar.m32003g(a0Var, I);
                    break;
                case 21:
                    aVar.m32001e(a0Var, I);
                    break;
                case 22:
                    aVar.m32002f(a0Var, I);
                    break;
            }
        } else {
            bVar = aVar.mo19091d();
            aVar.mo19092h();
        }
        a0Var.mo20546O(e);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C4874h mo18652A(byte[] bArr, int i, boolean z) throws C4876j {
        this.f26627o.mo20544M(bArr, i);
        m31995C(this.f26627o);
        this.f26629q.mo19092h();
        ArrayList arrayList = new ArrayList();
        while (this.f26627o.mo20548a() >= 3) {
            C4864b D = m31996D(this.f26627o, this.f26629q);
            if (D != null) {
                arrayList.add(D);
            }
        }
        return new C5122b(Collections.unmodifiableList(arrayList));
    }
}
