package p091m1;

import p091m1.C4989k;

/* renamed from: m1.e */
/* compiled from: AutoValue_ClientInfo */
final class C4975e extends C4989k {

    /* renamed from: a */
    private final C4989k.C4991b f26104a;

    /* renamed from: b */
    private final C4962a f26105b;

    /* renamed from: m1.e$b */
    /* compiled from: AutoValue_ClientInfo */
    static final class C4977b extends C4989k.C4990a {

        /* renamed from: a */
        private C4989k.C4991b f26106a;

        /* renamed from: b */
        private C4962a f26107b;

        C4977b() {
        }

        /* renamed from: a */
        public C4989k mo18874a() {
            return new C4975e(this.f26106a, this.f26107b);
        }

        /* renamed from: b */
        public C4989k.C4990a mo18875b(C4962a aVar) {
            this.f26107b = aVar;
            return this;
        }

        /* renamed from: c */
        public C4989k.C4990a mo18876c(C4989k.C4991b bVar) {
            this.f26106a = bVar;
            return this;
        }
    }

    /* renamed from: b */
    public C4962a mo18869b() {
        return this.f26105b;
    }

    /* renamed from: c */
    public C4989k.C4991b mo18870c() {
        return this.f26104a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4989k)) {
            return false;
        }
        C4989k kVar = (C4989k) obj;
        C4989k.C4991b bVar = this.f26104a;
        if (bVar != null ? bVar.equals(kVar.mo18870c()) : kVar.mo18870c() == null) {
            C4962a aVar = this.f26105b;
            if (aVar == null) {
                if (kVar.mo18869b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.mo18869b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C4989k.C4991b bVar = this.f26104a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        C4962a aVar = this.f26105b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f26104a + ", androidClientInfo=" + this.f26105b + "}";
    }

    private C4975e(C4989k.C4991b bVar, C4962a aVar) {
        this.f26104a = bVar;
        this.f26105b = aVar;
    }
}
