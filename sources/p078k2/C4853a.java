package p078k2;

import java.io.IOException;
import java.util.ArrayDeque;
import p037e2.C4216m;
import p161w3.C5917a;
import p177z1.C6249m2;

/* renamed from: k2.a */
/* compiled from: DefaultEbmlReader */
final class C4853a implements C4857c {

    /* renamed from: a */
    private final byte[] f25628a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<C4855b> f25629b = new ArrayDeque<>();

    /* renamed from: c */
    private final C4863g f25630c = new C4863g();

    /* renamed from: d */
    private C4856b f25631d;

    /* renamed from: e */
    private int f25632e;

    /* renamed from: f */
    private int f25633f;

    /* renamed from: g */
    private long f25634g;

    /* renamed from: k2.a$b */
    /* compiled from: DefaultEbmlReader */
    private static final class C4855b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f25635a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f25636b;

        private C4855b(int i, long j) {
            this.f25635a = i;
            this.f25636b = j;
        }
    }

    /* renamed from: c */
    private long m30885c(C4216m mVar) throws IOException {
        mVar.mo17560j();
        while (true) {
            mVar.mo17563p(this.f25628a, 0, 4);
            int c = C4863g.m30968c(this.f25628a[0]);
            if (c != -1 && c <= 4) {
                int a = (int) C4863g.m30967a(this.f25628a, c, false);
                if (this.f25631d.mo18597c(a)) {
                    mVar.mo17561k(c);
                    return (long) a;
                }
            }
            mVar.mo17561k(1);
        }
    }

    /* renamed from: d */
    private double m30886d(C4216m mVar, int i) throws IOException {
        long e = m30887e(mVar, i);
        if (i == 4) {
            return (double) Float.intBitsToFloat((int) e);
        }
        return Double.longBitsToDouble(e);
    }

    /* renamed from: e */
    private long m30887e(C4216m mVar, int i) throws IOException {
        mVar.readFully(this.f25628a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f25628a[i2] & 255));
        }
        return j;
    }

    /* renamed from: f */
    private static String m30888f(C4216m mVar, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        mVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    /* renamed from: a */
    public void mo18592a(C4856b bVar) {
        this.f25631d = bVar;
    }

    /* renamed from: b */
    public boolean mo18593b(C4216m mVar) throws IOException {
        C5917a.m34875h(this.f25631d);
        while (true) {
            C4855b peek = this.f25629b.peek();
            if (peek == null || mVar.mo17554c() < peek.f25636b) {
                if (this.f25632e == 0) {
                    long d = this.f25630c.mo18619d(mVar, true, false, 4);
                    if (d == -2) {
                        d = m30885c(mVar);
                    }
                    if (d == -1) {
                        return false;
                    }
                    this.f25633f = (int) d;
                    this.f25632e = 1;
                }
                if (this.f25632e == 1) {
                    this.f25634g = this.f25630c.mo18619d(mVar, false, true, 8);
                    this.f25632e = 2;
                }
                int b = this.f25631d.mo18596b(this.f25633f);
                if (b == 0) {
                    mVar.mo17561k((int) this.f25634g);
                    this.f25632e = 0;
                } else if (b == 1) {
                    long c = mVar.mo17554c();
                    this.f25629b.push(new C4855b(this.f25633f, this.f25634g + c));
                    this.f25631d.mo18601g(this.f25633f, c, this.f25634g);
                    this.f25632e = 0;
                    return true;
                } else if (b == 2) {
                    long j = this.f25634g;
                    if (j <= 8) {
                        this.f25631d.mo18602h(this.f25633f, m30887e(mVar, (int) j));
                        this.f25632e = 0;
                        return true;
                    }
                    throw C6249m2.m36661a("Invalid integer size: " + this.f25634g, (Throwable) null);
                } else if (b == 3) {
                    long j2 = this.f25634g;
                    if (j2 <= 2147483647L) {
                        this.f25631d.mo18598d(this.f25633f, m30888f(mVar, (int) j2));
                        this.f25632e = 0;
                        return true;
                    }
                    throw C6249m2.m36661a("String element size: " + this.f25634g, (Throwable) null);
                } else if (b == 4) {
                    this.f25631d.mo18600f(this.f25633f, (int) this.f25634g, mVar);
                    this.f25632e = 0;
                    return true;
                } else if (b == 5) {
                    long j3 = this.f25634g;
                    if (j3 == 4 || j3 == 8) {
                        this.f25631d.mo18599e(this.f25633f, m30886d(mVar, (int) j3));
                        this.f25632e = 0;
                        return true;
                    }
                    throw C6249m2.m36661a("Invalid float size: " + this.f25634g, (Throwable) null);
                } else {
                    throw C6249m2.m36661a("Invalid element type " + b, (Throwable) null);
                }
            } else {
                this.f25631d.mo18595a(this.f25629b.pop().f25635a);
                return true;
            }
        }
    }

    public void reset() {
        this.f25632e = 0;
        this.f25629b.clear();
        this.f25630c.mo18620e();
    }
}
