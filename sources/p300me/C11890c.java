package p300me;

import p253he.C10543e;
import p336qe.C12235f;

/* renamed from: me.c */
/* compiled from: Header */
public final class C11890c {

    /* renamed from: d */
    public static final C12235f f44646d = C12235f.m58766o(":");

    /* renamed from: e */
    public static final C12235f f44647e = C12235f.m58766o(":status");

    /* renamed from: f */
    public static final C12235f f44648f = C12235f.m58766o(":method");

    /* renamed from: g */
    public static final C12235f f44649g = C12235f.m58766o(":path");

    /* renamed from: h */
    public static final C12235f f44650h = C12235f.m58766o(":scheme");

    /* renamed from: i */
    public static final C12235f f44651i = C12235f.m58766o(":authority");

    /* renamed from: a */
    public final C12235f f44652a;

    /* renamed from: b */
    public final C12235f f44653b;

    /* renamed from: c */
    final int f44654c;

    public C11890c(String str, String str2) {
        this(C12235f.m58766o(str), C12235f.m58766o(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11890c)) {
            return false;
        }
        C11890c cVar = (C11890c) obj;
        if (!this.f44652a.equals(cVar.f44652a) || !this.f44653b.equals(cVar.f44653b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f44652a.hashCode()) * 31) + this.f44653b.hashCode();
    }

    public String toString() {
        return C10543e.m53055p("%s: %s", this.f44652a.mo36832B(), this.f44653b.mo36832B());
    }

    public C11890c(C12235f fVar, String str) {
        this(fVar, C12235f.m58766o(str));
    }

    public C11890c(C12235f fVar, C12235f fVar2) {
        this.f44652a = fVar;
        this.f44653b = fVar2;
        this.f44654c = fVar.mo36846w() + 32 + fVar2.mo36846w();
    }
}
