package p155v3;

import java.util.Arrays;
import p155v3.C5789b;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: v3.q */
/* compiled from: DefaultAllocator */
public final class C5841q implements C5789b {

    /* renamed from: a */
    private final boolean f28902a;

    /* renamed from: b */
    private final int f28903b;

    /* renamed from: c */
    private final byte[] f28904c;

    /* renamed from: d */
    private int f28905d;

    /* renamed from: e */
    private int f28906e;

    /* renamed from: f */
    private int f28907f;

    /* renamed from: g */
    private C5787a[] f28908g;

    public C5841q(boolean z, int i) {
        this(z, i, 0);
    }

    /* renamed from: a */
    public synchronized C5787a mo20309a() {
        C5787a aVar;
        this.f28906e++;
        int i = this.f28907f;
        if (i > 0) {
            C5787a[] aVarArr = this.f28908g;
            int i2 = i - 1;
            this.f28907f = i2;
            aVar = (C5787a) C5917a.m34872e(aVarArr[i2]);
            this.f28908g[this.f28907f] = null;
        } else {
            aVar = new C5787a(new byte[this.f28903b], 0);
            int i3 = this.f28906e;
            C5787a[] aVarArr2 = this.f28908g;
            if (i3 > aVarArr2.length) {
                this.f28908g = (C5787a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
            }
        }
        return aVar;
    }

    /* renamed from: b */
    public synchronized void mo20310b() {
        int i = 0;
        int max = Math.max(0, C5953m0.m35142l(this.f28905d, this.f28903b) - this.f28906e);
        int i2 = this.f28907f;
        if (max < i2) {
            if (this.f28904c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    C5787a aVar = (C5787a) C5917a.m34872e(this.f28908g[i]);
                    if (aVar.f28779a == this.f28904c) {
                        i++;
                    } else {
                        C5787a aVar2 = (C5787a) C5917a.m34872e(this.f28908g[i3]);
                        if (aVar2.f28779a != this.f28904c) {
                            i3--;
                        } else {
                            C5787a[] aVarArr = this.f28908g;
                            aVarArr[i] = aVar2;
                            aVarArr[i3] = aVar;
                            i3--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f28907f) {
                    return;
                }
            }
            Arrays.fill(this.f28908g, max, this.f28907f, (Object) null);
            this.f28907f = max;
        }
    }

    /* renamed from: c */
    public synchronized void mo20311c(C5789b.C5790a aVar) {
        while (aVar != null) {
            C5787a[] aVarArr = this.f28908g;
            int i = this.f28907f;
            this.f28907f = i + 1;
            aVarArr[i] = aVar.mo6802a();
            this.f28906e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    /* renamed from: d */
    public synchronized void mo20312d(C5787a aVar) {
        C5787a[] aVarArr = this.f28908g;
        int i = this.f28907f;
        this.f28907f = i + 1;
        aVarArr[i] = aVar;
        this.f28906e--;
        notifyAll();
    }

    /* renamed from: e */
    public int mo20313e() {
        return this.f28903b;
    }

    /* renamed from: f */
    public synchronized int mo20386f() {
        return this.f28906e * this.f28903b;
    }

    /* renamed from: g */
    public synchronized void mo20387g() {
        if (this.f28902a) {
            mo20388h(0);
        }
    }

    /* renamed from: h */
    public synchronized void mo20388h(int i) {
        boolean z = i < this.f28905d;
        this.f28905d = i;
        if (z) {
            mo20310b();
        }
    }

    public C5841q(boolean z, int i, int i2) {
        boolean z2 = true;
        C5917a.m34868a(i > 0);
        C5917a.m34868a(i2 < 0 ? false : z2);
        this.f28902a = z;
        this.f28903b = i;
        this.f28907f = i2;
        this.f28908g = new C5787a[(i2 + 100)];
        if (i2 > 0) {
            this.f28904c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f28908g[i3] = new C5787a(this.f28904c, i3 * i);
            }
            return;
        }
        this.f28904c = null;
    }
}
