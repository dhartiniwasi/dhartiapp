package p008a8;

import p211d8.C9888l;

/* renamed from: a8.u0 */
/* compiled from: LimboDocumentChange */
public class C6501u0 {

    /* renamed from: a */
    private final C6502a f30870a;

    /* renamed from: b */
    private final C9888l f30871b;

    /* renamed from: a8.u0$a */
    /* compiled from: LimboDocumentChange */
    public enum C6502a {
        ADDED,
        REMOVED
    }

    public C6501u0(C6502a aVar, C9888l lVar) {
        this.f30870a = aVar;
        this.f30871b = lVar;
    }

    /* renamed from: a */
    public C9888l mo22066a() {
        return this.f30871b;
    }

    /* renamed from: b */
    public C6502a mo22067b() {
        return this.f30870a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6501u0)) {
            return false;
        }
        C6501u0 u0Var = (C6501u0) obj;
        if (!this.f30870a.equals(u0Var.mo22067b()) || !this.f30871b.equals(u0Var.mo22066a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((2077 + this.f30870a.hashCode()) * 31) + this.f30871b.hashCode();
    }
}
