package p312o8;

import p312o8.C12041f;

/* renamed from: o8.b */
/* compiled from: AutoValue_TokenResult */
final class C12033b extends C12041f {

    /* renamed from: a */
    private final String f45020a;

    /* renamed from: b */
    private final long f45021b;

    /* renamed from: c */
    private final C12041f.C12043b f45022c;

    /* renamed from: o8.b$b */
    /* compiled from: AutoValue_TokenResult */
    static final class C12035b extends C12041f.C12042a {

        /* renamed from: a */
        private String f45023a;

        /* renamed from: b */
        private Long f45024b;

        /* renamed from: c */
        private C12041f.C12043b f45025c;

        C12035b() {
        }

        /* renamed from: a */
        public C12041f mo36408a() {
            String str = "";
            if (this.f45024b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C12033b(this.f45023a, this.f45024b.longValue(), this.f45025c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C12041f.C12042a mo36409b(C12041f.C12043b bVar) {
            this.f45025c = bVar;
            return this;
        }

        /* renamed from: c */
        public C12041f.C12042a mo36410c(String str) {
            this.f45023a = str;
            return this;
        }

        /* renamed from: d */
        public C12041f.C12042a mo36411d(long j) {
            this.f45024b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public C12041f.C12043b mo36402b() {
        return this.f45022c;
    }

    /* renamed from: c */
    public String mo36403c() {
        return this.f45020a;
    }

    /* renamed from: d */
    public long mo36404d() {
        return this.f45021b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12041f)) {
            return false;
        }
        C12041f fVar = (C12041f) obj;
        String str = this.f45020a;
        if (str != null ? str.equals(fVar.mo36403c()) : fVar.mo36403c() == null) {
            if (this.f45021b == fVar.mo36404d()) {
                C12041f.C12043b bVar = this.f45022c;
                if (bVar == null) {
                    if (fVar.mo36402b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.mo36402b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f45020a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f45021b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        C12041f.C12043b bVar = this.f45022c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f45020a + ", tokenExpirationTimestamp=" + this.f45021b + ", responseCode=" + this.f45022c + "}";
    }

    private C12033b(String str, long j, C12041f.C12043b bVar) {
        this.f45020a = str;
        this.f45021b = j;
        this.f45022c = bVar;
    }
}
