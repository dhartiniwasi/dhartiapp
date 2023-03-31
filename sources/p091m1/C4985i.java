package p091m1;

import p091m1.C4997o;

/* renamed from: m1.i */
/* compiled from: AutoValue_NetworkConnectionInfo */
final class C4985i extends C4997o {

    /* renamed from: a */
    private final C4997o.C5000c f26137a;

    /* renamed from: b */
    private final C4997o.C4999b f26138b;

    /* renamed from: m1.i$b */
    /* compiled from: AutoValue_NetworkConnectionInfo */
    static final class C4987b extends C4997o.C4998a {

        /* renamed from: a */
        private C4997o.C5000c f26139a;

        /* renamed from: b */
        private C4997o.C4999b f26140b;

        C4987b() {
        }

        /* renamed from: a */
        public C4997o mo18922a() {
            return new C4985i(this.f26139a, this.f26140b);
        }

        /* renamed from: b */
        public C4997o.C4998a mo18923b(C4997o.C4999b bVar) {
            this.f26140b = bVar;
            return this;
        }

        /* renamed from: c */
        public C4997o.C4998a mo18924c(C4997o.C5000c cVar) {
            this.f26139a = cVar;
            return this;
        }
    }

    /* renamed from: b */
    public C4997o.C4999b mo18917b() {
        return this.f26138b;
    }

    /* renamed from: c */
    public C4997o.C5000c mo18918c() {
        return this.f26137a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4997o)) {
            return false;
        }
        C4997o oVar = (C4997o) obj;
        C4997o.C5000c cVar = this.f26137a;
        if (cVar != null ? cVar.equals(oVar.mo18918c()) : oVar.mo18918c() == null) {
            C4997o.C4999b bVar = this.f26138b;
            if (bVar == null) {
                if (oVar.mo18917b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.mo18917b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C4997o.C5000c cVar = this.f26137a;
        int i = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        C4997o.C4999b bVar = this.f26138b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f26137a + ", mobileSubtype=" + this.f26138b + "}";
    }

    private C4985i(C4997o.C5000c cVar, C4997o.C4999b bVar) {
        this.f26137a = cVar;
        this.f26138b = bVar;
    }
}
