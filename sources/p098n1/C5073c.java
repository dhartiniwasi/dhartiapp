package p098n1;

import java.util.Objects;
import p084l1.C4902b;
import p084l1.C4903c;
import p084l1.C4905e;
import p098n1.C5093n;

/* renamed from: n1.c */
/* compiled from: AutoValue_SendRequest */
final class C5073c extends C5093n {

    /* renamed from: a */
    private final C5095o f26506a;

    /* renamed from: b */
    private final String f26507b;

    /* renamed from: c */
    private final C4903c<?> f26508c;

    /* renamed from: d */
    private final C4905e<?, byte[]> f26509d;

    /* renamed from: e */
    private final C4902b f26510e;

    /* renamed from: n1.c$b */
    /* compiled from: AutoValue_SendRequest */
    static final class C5075b extends C5093n.C5094a {

        /* renamed from: a */
        private C5095o f26511a;

        /* renamed from: b */
        private String f26512b;

        /* renamed from: c */
        private C4903c<?> f26513c;

        /* renamed from: d */
        private C4905e<?, byte[]> f26514d;

        /* renamed from: e */
        private C4902b f26515e;

        C5075b() {
        }

        /* renamed from: a */
        public C5093n mo19018a() {
            String str = "";
            if (this.f26511a == null) {
                str = str + " transportContext";
            }
            if (this.f26512b == null) {
                str = str + " transportName";
            }
            if (this.f26513c == null) {
                str = str + " event";
            }
            if (this.f26514d == null) {
                str = str + " transformer";
            }
            if (this.f26515e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C5073c(this.f26511a, this.f26512b, this.f26513c, this.f26514d, this.f26515e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5093n.C5094a mo19019b(C4902b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f26515e = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5093n.C5094a mo19020c(C4903c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f26513c = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C5093n.C5094a mo19021d(C4905e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f26514d = eVar;
            return this;
        }

        /* renamed from: e */
        public C5093n.C5094a mo19022e(C5095o oVar) {
            Objects.requireNonNull(oVar, "Null transportContext");
            this.f26511a = oVar;
            return this;
        }

        /* renamed from: f */
        public C5093n.C5094a mo19023f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f26512b = str;
            return this;
        }
    }

    /* renamed from: b */
    public C4902b mo19010b() {
        return this.f26510e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C4903c<?> mo19011c() {
        return this.f26508c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C4905e<?, byte[]> mo19012e() {
        return this.f26509d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5093n)) {
            return false;
        }
        C5093n nVar = (C5093n) obj;
        if (!this.f26506a.equals(nVar.mo19014f()) || !this.f26507b.equals(nVar.mo19015g()) || !this.f26508c.equals(nVar.mo19011c()) || !this.f26509d.equals(nVar.mo19012e()) || !this.f26510e.equals(nVar.mo19010b())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C5095o mo19014f() {
        return this.f26506a;
    }

    /* renamed from: g */
    public String mo19015g() {
        return this.f26507b;
    }

    public int hashCode() {
        return ((((((((this.f26506a.hashCode() ^ 1000003) * 1000003) ^ this.f26507b.hashCode()) * 1000003) ^ this.f26508c.hashCode()) * 1000003) ^ this.f26509d.hashCode()) * 1000003) ^ this.f26510e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f26506a + ", transportName=" + this.f26507b + ", event=" + this.f26508c + ", transformer=" + this.f26509d + ", encoding=" + this.f26510e + "}";
    }

    private C5073c(C5095o oVar, String str, C4903c<?> cVar, C4905e<?, byte[]> eVar, C4902b bVar) {
        this.f26506a = oVar;
        this.f26507b = str;
        this.f26508c = cVar;
        this.f26509d = eVar;
        this.f26510e = bVar;
    }
}
