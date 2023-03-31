package p098n1;

import java.util.Arrays;
import java.util.Objects;
import p084l1.C4904d;
import p098n1.C5095o;

/* renamed from: n1.d */
/* compiled from: AutoValue_TransportContext */
final class C5076d extends C5095o {

    /* renamed from: a */
    private final String f26516a;

    /* renamed from: b */
    private final byte[] f26517b;

    /* renamed from: c */
    private final C4904d f26518c;

    /* renamed from: n1.d$b */
    /* compiled from: AutoValue_TransportContext */
    static final class C5078b extends C5095o.C5096a {

        /* renamed from: a */
        private String f26519a;

        /* renamed from: b */
        private byte[] f26520b;

        /* renamed from: c */
        private C4904d f26521c;

        C5078b() {
        }

        /* renamed from: a */
        public C5095o mo19029a() {
            String str = "";
            if (this.f26519a == null) {
                str = str + " backendName";
            }
            if (this.f26521c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C5076d(this.f26519a, this.f26520b, this.f26521c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C5095o.C5096a mo19030b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f26519a = str;
            return this;
        }

        /* renamed from: c */
        public C5095o.C5096a mo19031c(byte[] bArr) {
            this.f26520b = bArr;
            return this;
        }

        /* renamed from: d */
        public C5095o.C5096a mo19032d(C4904d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f26521c = dVar;
            return this;
        }
    }

    /* renamed from: b */
    public String mo19024b() {
        return this.f26516a;
    }

    /* renamed from: c */
    public byte[] mo19025c() {
        return this.f26517b;
    }

    /* renamed from: d */
    public C4904d mo19026d() {
        return this.f26518c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5095o)) {
            return false;
        }
        C5095o oVar = (C5095o) obj;
        if (this.f26516a.equals(oVar.mo19024b())) {
            if (!Arrays.equals(this.f26517b, oVar instanceof C5076d ? ((C5076d) oVar).f26517b : oVar.mo19025c()) || !this.f26518c.equals(oVar.mo19026d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f26516a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f26517b)) * 1000003) ^ this.f26518c.hashCode();
    }

    private C5076d(String str, byte[] bArr, C4904d dVar) {
        this.f26516a = str;
        this.f26517b = bArr;
        this.f26518c = dVar;
    }
}
