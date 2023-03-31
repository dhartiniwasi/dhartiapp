package p105o1;

import java.util.Arrays;
import java.util.Objects;
import p098n1.C5085i;
import p105o1.C5155f;

/* renamed from: o1.a */
/* compiled from: AutoValue_BackendRequest */
final class C5148a extends C5155f {

    /* renamed from: a */
    private final Iterable<C5085i> f26671a;

    /* renamed from: b */
    private final byte[] f26672b;

    /* renamed from: o1.a$b */
    /* compiled from: AutoValue_BackendRequest */
    static final class C5150b extends C5155f.C5156a {

        /* renamed from: a */
        private Iterable<C5085i> f26673a;

        /* renamed from: b */
        private byte[] f26674b;

        C5150b() {
        }

        /* renamed from: a */
        public C5155f mo19123a() {
            String str = "";
            if (this.f26673a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C5148a(this.f26673a, this.f26674b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C5155f.C5156a mo19124b(Iterable<C5085i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f26673a = iterable;
            return this;
        }

        /* renamed from: c */
        public C5155f.C5156a mo19125c(byte[] bArr) {
            this.f26674b = bArr;
            return this;
        }
    }

    /* renamed from: b */
    public Iterable<C5085i> mo19118b() {
        return this.f26671a;
    }

    /* renamed from: c */
    public byte[] mo19119c() {
        return this.f26672b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5155f)) {
            return false;
        }
        C5155f fVar = (C5155f) obj;
        if (this.f26671a.equals(fVar.mo19118b())) {
            if (Arrays.equals(this.f26672b, fVar instanceof C5148a ? ((C5148a) fVar).f26672b : fVar.mo19119c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f26671a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f26672b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f26671a + ", extras=" + Arrays.toString(this.f26672b) + "}";
    }

    private C5148a(Iterable<C5085i> iterable, byte[] bArr) {
        this.f26671a = iterable;
        this.f26672b = bArr;
    }
}
