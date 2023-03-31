package p220e8;

import p211d8.C9898r;

/* renamed from: e8.e */
/* compiled from: FieldTransform */
public final class C10008e {

    /* renamed from: a */
    private final C9898r f39960a;

    /* renamed from: b */
    private final C10019p f39961b;

    public C10008e(C9898r rVar, C10019p pVar) {
        this.f39960a = rVar;
        this.f39961b = pVar;
    }

    /* renamed from: a */
    public C9898r mo32592a() {
        return this.f39960a;
    }

    /* renamed from: b */
    public C10019p mo32593b() {
        return this.f39961b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10008e.class != obj.getClass()) {
            return false;
        }
        C10008e eVar = (C10008e) obj;
        if (!this.f39960a.equals(eVar.f39960a)) {
            return false;
        }
        return this.f39961b.equals(eVar.f39961b);
    }

    public int hashCode() {
        return (this.f39960a.hashCode() * 31) + this.f39961b.hashCode();
    }
}
