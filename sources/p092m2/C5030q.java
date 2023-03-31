package p092m2;

import java.io.IOException;
import p037e2.C4216m;
import p161w3.C5918a0;

/* renamed from: m2.q */
/* compiled from: TrackFragment */
final class C5030q {

    /* renamed from: a */
    public C5013c f26355a;

    /* renamed from: b */
    public long f26356b;

    /* renamed from: c */
    public long f26357c;

    /* renamed from: d */
    public long f26358d;

    /* renamed from: e */
    public int f26359e;

    /* renamed from: f */
    public int f26360f;

    /* renamed from: g */
    public long[] f26361g = new long[0];

    /* renamed from: h */
    public int[] f26362h = new int[0];

    /* renamed from: i */
    public int[] f26363i = new int[0];

    /* renamed from: j */
    public long[] f26364j = new long[0];

    /* renamed from: k */
    public boolean[] f26365k = new boolean[0];

    /* renamed from: l */
    public boolean f26366l;

    /* renamed from: m */
    public boolean[] f26367m = new boolean[0];

    /* renamed from: n */
    public C5029p f26368n;

    /* renamed from: o */
    public final C5918a0 f26369o = new C5918a0();

    /* renamed from: p */
    public boolean f26370p;

    /* renamed from: q */
    public long f26371q;

    /* renamed from: r */
    public boolean f26372r;

    /* renamed from: a */
    public void mo18955a(C4216m mVar) throws IOException {
        mVar.readFully(this.f26369o.mo20551d(), 0, this.f26369o.mo20553f());
        this.f26369o.mo20546O(0);
        this.f26370p = false;
    }

    /* renamed from: b */
    public void mo18956b(C5918a0 a0Var) {
        a0Var.mo20557j(this.f26369o.mo20551d(), 0, this.f26369o.mo20553f());
        this.f26369o.mo20546O(0);
        this.f26370p = false;
    }

    /* renamed from: c */
    public long mo18957c(int i) {
        return this.f26364j[i];
    }

    /* renamed from: d */
    public void mo18958d(int i) {
        this.f26369o.mo20542K(i);
        this.f26366l = true;
        this.f26370p = true;
    }

    /* renamed from: e */
    public void mo18959e(int i, int i2) {
        this.f26359e = i;
        this.f26360f = i2;
        if (this.f26362h.length < i) {
            this.f26361g = new long[i];
            this.f26362h = new int[i];
        }
        if (this.f26363i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f26363i = new int[i3];
            this.f26364j = new long[i3];
            this.f26365k = new boolean[i3];
            this.f26367m = new boolean[i3];
        }
    }

    /* renamed from: f */
    public void mo18960f() {
        this.f26359e = 0;
        this.f26371q = 0;
        this.f26372r = false;
        this.f26366l = false;
        this.f26370p = false;
        this.f26368n = null;
    }

    /* renamed from: g */
    public boolean mo18961g(int i) {
        return this.f26366l && this.f26367m[i];
    }
}
