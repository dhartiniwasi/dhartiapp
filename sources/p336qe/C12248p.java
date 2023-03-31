package p336qe;

/* renamed from: qe.p */
/* compiled from: Segment */
final class C12248p {

    /* renamed from: a */
    final byte[] f45411a;

    /* renamed from: b */
    int f45412b;

    /* renamed from: c */
    int f45413c;

    /* renamed from: d */
    boolean f45414d;

    /* renamed from: e */
    boolean f45415e;

    /* renamed from: f */
    C12248p f45416f;

    /* renamed from: g */
    C12248p f45417g;

    C12248p() {
        this.f45411a = new byte[8192];
        this.f45415e = true;
        this.f45414d = false;
    }

    /* renamed from: a */
    public final void mo36876a() {
        C12248p pVar = this.f45417g;
        if (pVar == this) {
            throw new IllegalStateException();
        } else if (pVar.f45415e) {
            int i = this.f45413c - this.f45412b;
            if (i <= (8192 - pVar.f45413c) + (pVar.f45414d ? 0 : pVar.f45412b)) {
                mo36881f(pVar, i);
                mo36877b();
                C12249q.m58859a(this);
            }
        }
    }

    /* renamed from: b */
    public final C12248p mo36877b() {
        C12248p pVar = this.f45416f;
        C12248p pVar2 = pVar != this ? pVar : null;
        C12248p pVar3 = this.f45417g;
        pVar3.f45416f = pVar;
        this.f45416f.f45417g = pVar3;
        this.f45416f = null;
        this.f45417g = null;
        return pVar2;
    }

    /* renamed from: c */
    public final C12248p mo36878c(C12248p pVar) {
        pVar.f45417g = this;
        pVar.f45416f = this.f45416f;
        this.f45416f.f45417g = pVar;
        this.f45416f = pVar;
        return pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C12248p mo36879d() {
        this.f45414d = true;
        return new C12248p(this.f45411a, this.f45412b, this.f45413c, true, false);
    }

    /* renamed from: e */
    public final C12248p mo36880e(int i) {
        C12248p pVar;
        if (i <= 0 || i > this.f45413c - this.f45412b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            pVar = mo36879d();
        } else {
            pVar = C12249q.m58860b();
            System.arraycopy(this.f45411a, this.f45412b, pVar.f45411a, 0, i);
        }
        pVar.f45413c = pVar.f45412b + i;
        this.f45412b += i;
        this.f45417g.mo36878c(pVar);
        return pVar;
    }

    /* renamed from: f */
    public final void mo36881f(C12248p pVar, int i) {
        if (pVar.f45415e) {
            int i2 = pVar.f45413c;
            if (i2 + i > 8192) {
                if (!pVar.f45414d) {
                    int i3 = pVar.f45412b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = pVar.f45411a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        pVar.f45413c -= pVar.f45412b;
                        pVar.f45412b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f45411a, this.f45412b, pVar.f45411a, pVar.f45413c, i);
            pVar.f45413c += i;
            this.f45412b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    C12248p(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f45411a = bArr;
        this.f45412b = i;
        this.f45413c = i2;
        this.f45414d = z;
        this.f45415e = z2;
    }
}
