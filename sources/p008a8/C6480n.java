package p008a8;

import p211d8.C9885i;

/* renamed from: a8.n */
/* compiled from: DocumentViewChange */
public class C6480n {

    /* renamed from: a */
    private final C6481a f30801a;

    /* renamed from: b */
    private final C9885i f30802b;

    /* renamed from: a8.n$a */
    /* compiled from: DocumentViewChange */
    public enum C6481a {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    private C6480n(C6481a aVar, C9885i iVar) {
        this.f30801a = aVar;
        this.f30802b = iVar;
    }

    /* renamed from: a */
    public static C6480n m37801a(C6481a aVar, C9885i iVar) {
        return new C6480n(aVar, iVar);
    }

    /* renamed from: b */
    public C9885i mo22007b() {
        return this.f30802b;
    }

    /* renamed from: c */
    public C6481a mo22008c() {
        return this.f30801a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6480n)) {
            return false;
        }
        C6480n nVar = (C6480n) obj;
        if (!this.f30801a.equals(nVar.f30801a) || !this.f30802b.equals(nVar.f30802b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((1891 + this.f30801a.hashCode()) * 31) + this.f30802b.getKey().hashCode()) * 31) + this.f30802b.getData().hashCode();
    }

    public String toString() {
        return "DocumentViewChange(" + this.f30802b + "," + this.f30801a + ")";
    }
}
