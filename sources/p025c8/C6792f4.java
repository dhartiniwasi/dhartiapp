package p025c8;

import com.google.protobuf.C8153i;
import p008a8.C6469g1;
import p211d8.C9905w;
import p247h8.C10472x;

/* renamed from: c8.f4 */
/* compiled from: TargetData */
public final class C6792f4 {

    /* renamed from: a */
    private final C6469g1 f31340a;

    /* renamed from: b */
    private final int f31341b;

    /* renamed from: c */
    private final long f31342c;

    /* renamed from: d */
    private final C6787e1 f31343d;

    /* renamed from: e */
    private final C9905w f31344e;

    /* renamed from: f */
    private final C9905w f31345f;

    /* renamed from: g */
    private final C8153i f31346g;

    C6792f4(C6469g1 g1Var, int i, long j, C6787e1 e1Var, C9905w wVar, C9905w wVar2, C8153i iVar) {
        this.f31340a = (C6469g1) C10472x.m52785b(g1Var);
        this.f31341b = i;
        this.f31342c = j;
        this.f31345f = wVar2;
        this.f31343d = e1Var;
        this.f31344e = (C9905w) C10472x.m52785b(wVar);
        this.f31346g = (C8153i) C10472x.m52785b(iVar);
    }

    /* renamed from: a */
    public C9905w mo22800a() {
        return this.f31345f;
    }

    /* renamed from: b */
    public C6787e1 mo22801b() {
        return this.f31343d;
    }

    /* renamed from: c */
    public C8153i mo22802c() {
        return this.f31346g;
    }

    /* renamed from: d */
    public long mo22803d() {
        return this.f31342c;
    }

    /* renamed from: e */
    public C9905w mo22804e() {
        return this.f31344e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6792f4.class != obj.getClass()) {
            return false;
        }
        C6792f4 f4Var = (C6792f4) obj;
        if (!this.f31340a.equals(f4Var.f31340a) || this.f31341b != f4Var.f31341b || this.f31342c != f4Var.f31342c || !this.f31343d.equals(f4Var.f31343d) || !this.f31344e.equals(f4Var.f31344e) || !this.f31345f.equals(f4Var.f31345f) || !this.f31346g.equals(f4Var.f31346g)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C6469g1 mo22806f() {
        return this.f31340a;
    }

    /* renamed from: g */
    public int mo22807g() {
        return this.f31341b;
    }

    /* renamed from: h */
    public C6792f4 mo22808h(C9905w wVar) {
        return new C6792f4(this.f31340a, this.f31341b, this.f31342c, this.f31343d, this.f31344e, wVar, this.f31346g);
    }

    public int hashCode() {
        return (((((((((((this.f31340a.hashCode() * 31) + this.f31341b) * 31) + ((int) this.f31342c)) * 31) + this.f31343d.hashCode()) * 31) + this.f31344e.hashCode()) * 31) + this.f31345f.hashCode()) * 31) + this.f31346g.hashCode();
    }

    /* renamed from: i */
    public C6792f4 mo22810i(C8153i iVar, C9905w wVar) {
        return new C6792f4(this.f31340a, this.f31341b, this.f31342c, this.f31343d, wVar, this.f31345f, iVar);
    }

    /* renamed from: j */
    public C6792f4 mo22811j(long j) {
        return new C6792f4(this.f31340a, this.f31341b, j, this.f31343d, this.f31344e, this.f31345f, this.f31346g);
    }

    public String toString() {
        return "TargetData{target=" + this.f31340a + ", targetId=" + this.f31341b + ", sequenceNumber=" + this.f31342c + ", purpose=" + this.f31343d + ", snapshotVersion=" + this.f31344e + ", lastLimboFreeSnapshotVersion=" + this.f31345f + ", resumeToken=" + this.f31346g + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6792f4(p008a8.C6469g1 r10, int r11, long r12, p025c8.C6787e1 r14) {
        /*
            r9 = this;
            d8.w r7 = p211d8.C9905w.f39751b
            com.google.protobuf.i r8 = p238g8.C10291v0.f40879t
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r14
            r6 = r7
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p025c8.C6792f4.<init>(a8.g1, int, long, c8.e1):void");
    }
}
