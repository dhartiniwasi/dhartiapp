package p099n2;

import java.io.IOException;
import java.util.Arrays;
import p037e2.C4216m;
import p037e2.C4219o;
import p161w3.C5917a;
import p161w3.C5918a0;

/* renamed from: n2.e */
/* compiled from: OggPacket */
final class C5110e {

    /* renamed from: a */
    private final C5111f f26583a = new C5111f();

    /* renamed from: b */
    private final C5918a0 f26584b = new C5918a0(new byte[65025], 0);

    /* renamed from: c */
    private int f26585c = -1;

    /* renamed from: d */
    private int f26586d;

    /* renamed from: e */
    private boolean f26587e;

    C5110e() {
    }

    /* renamed from: a */
    private int m31951a(int i) {
        int i2;
        int i3 = 0;
        this.f26586d = 0;
        do {
            int i4 = this.f26586d;
            int i5 = i + i4;
            C5111f fVar = this.f26583a;
            if (i5 >= fVar.f26594g) {
                break;
            }
            int[] iArr = fVar.f26597j;
            this.f26586d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: b */
    public C5111f mo19075b() {
        return this.f26583a;
    }

    /* renamed from: c */
    public C5918a0 mo19076c() {
        return this.f26584b;
    }

    /* renamed from: d */
    public boolean mo19077d(C4216m mVar) throws IOException {
        int i;
        C5917a.m34873f(mVar != null);
        if (this.f26587e) {
            this.f26587e = false;
            this.f26584b.mo20542K(0);
        }
        while (!this.f26587e) {
            if (this.f26585c < 0) {
                if (!this.f26583a.mo19082c(mVar) || !this.f26583a.mo19080a(mVar, true)) {
                    return false;
                }
                C5111f fVar = this.f26583a;
                int i2 = fVar.f26595h;
                if ((fVar.f26589b & 1) == 1 && this.f26584b.mo20553f() == 0) {
                    i2 += m31951a(0);
                    i = this.f26586d + 0;
                } else {
                    i = 0;
                }
                if (!C4219o.m28484e(mVar, i2)) {
                    return false;
                }
                this.f26585c = i;
            }
            int a = m31951a(this.f26585c);
            int i3 = this.f26585c + this.f26586d;
            if (a > 0) {
                C5918a0 a0Var = this.f26584b;
                a0Var.mo20550c(a0Var.mo20553f() + a);
                if (!C4219o.m28483d(mVar, this.f26584b.mo20551d(), this.f26584b.mo20553f(), a)) {
                    return false;
                }
                C5918a0 a0Var2 = this.f26584b;
                a0Var2.mo20545N(a0Var2.mo20553f() + a);
                this.f26587e = this.f26583a.f26597j[i3 + -1] != 255;
            }
            if (i3 == this.f26583a.f26594g) {
                i3 = -1;
            }
            this.f26585c = i3;
        }
        return true;
    }

    /* renamed from: e */
    public void mo19078e() {
        this.f26583a.mo19081b();
        this.f26584b.mo20542K(0);
        this.f26585c = -1;
        this.f26587e = false;
    }

    /* renamed from: f */
    public void mo19079f() {
        if (this.f26584b.mo20551d().length != 65025) {
            C5918a0 a0Var = this.f26584b;
            a0Var.mo20544M(Arrays.copyOf(a0Var.mo20551d(), Math.max(65025, this.f26584b.mo20553f())), this.f26584b.mo20553f());
        }
    }
}
