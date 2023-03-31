package p381vc;

import p336qe.C12235f;

/* renamed from: vc.d */
/* compiled from: Header */
public final class C12874d {

    /* renamed from: d */
    public static final C12235f f47004d = C12235f.m58766o(":status");

    /* renamed from: e */
    public static final C12235f f47005e = C12235f.m58766o(":method");

    /* renamed from: f */
    public static final C12235f f47006f = C12235f.m58766o(":path");

    /* renamed from: g */
    public static final C12235f f47007g = C12235f.m58766o(":scheme");

    /* renamed from: h */
    public static final C12235f f47008h = C12235f.m58766o(":authority");

    /* renamed from: i */
    public static final C12235f f47009i = C12235f.m58766o(":host");

    /* renamed from: j */
    public static final C12235f f47010j = C12235f.m58766o(":version");

    /* renamed from: a */
    public final C12235f f47011a;

    /* renamed from: b */
    public final C12235f f47012b;

    /* renamed from: c */
    final int f47013c;

    public C12874d(String str, String str2) {
        this(C12235f.m58766o(str), C12235f.m58766o(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12874d)) {
            return false;
        }
        C12874d dVar = (C12874d) obj;
        if (!this.f47011a.equals(dVar.f47011a) || !this.f47012b.equals(dVar.f47012b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f47011a.hashCode()) * 31) + this.f47012b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.f47011a.mo36832B(), this.f47012b.mo36832B()});
    }

    public C12874d(C12235f fVar, String str) {
        this(fVar, C12235f.m58766o(str));
    }

    public C12874d(C12235f fVar, C12235f fVar2) {
        this.f47011a = fVar;
        this.f47012b = fVar2;
        this.f47013c = fVar.mo36846w() + 32 + fVar2.mo36846w();
    }
}
