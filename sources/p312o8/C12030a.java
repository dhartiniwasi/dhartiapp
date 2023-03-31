package p312o8;

import p312o8.C12037d;

/* renamed from: o8.a */
/* compiled from: AutoValue_InstallationResponse */
final class C12030a extends C12037d {

    /* renamed from: a */
    private final String f45010a;

    /* renamed from: b */
    private final String f45011b;

    /* renamed from: c */
    private final String f45012c;

    /* renamed from: d */
    private final C12041f f45013d;

    /* renamed from: e */
    private final C12037d.C12039b f45014e;

    /* renamed from: o8.a$b */
    /* compiled from: AutoValue_InstallationResponse */
    static final class C12032b extends C12037d.C12038a {

        /* renamed from: a */
        private String f45015a;

        /* renamed from: b */
        private String f45016b;

        /* renamed from: c */
        private String f45017c;

        /* renamed from: d */
        private C12041f f45018d;

        /* renamed from: e */
        private C12037d.C12039b f45019e;

        C12032b() {
        }

        /* renamed from: a */
        public C12037d mo36396a() {
            return new C12030a(this.f45015a, this.f45016b, this.f45017c, this.f45018d, this.f45019e);
        }

        /* renamed from: b */
        public C12037d.C12038a mo36397b(C12041f fVar) {
            this.f45018d = fVar;
            return this;
        }

        /* renamed from: c */
        public C12037d.C12038a mo36398c(String str) {
            this.f45016b = str;
            return this;
        }

        /* renamed from: d */
        public C12037d.C12038a mo36399d(String str) {
            this.f45017c = str;
            return this;
        }

        /* renamed from: e */
        public C12037d.C12038a mo36400e(C12037d.C12039b bVar) {
            this.f45019e = bVar;
            return this;
        }

        /* renamed from: f */
        public C12037d.C12038a mo36401f(String str) {
            this.f45015a = str;
            return this;
        }
    }

    /* renamed from: b */
    public C12041f mo36388b() {
        return this.f45013d;
    }

    /* renamed from: c */
    public String mo36389c() {
        return this.f45011b;
    }

    /* renamed from: d */
    public String mo36390d() {
        return this.f45012c;
    }

    /* renamed from: e */
    public C12037d.C12039b mo36391e() {
        return this.f45014e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12037d)) {
            return false;
        }
        C12037d dVar = (C12037d) obj;
        String str = this.f45010a;
        if (str != null ? str.equals(dVar.mo36393f()) : dVar.mo36393f() == null) {
            String str2 = this.f45011b;
            if (str2 != null ? str2.equals(dVar.mo36389c()) : dVar.mo36389c() == null) {
                String str3 = this.f45012c;
                if (str3 != null ? str3.equals(dVar.mo36390d()) : dVar.mo36390d() == null) {
                    C12041f fVar = this.f45013d;
                    if (fVar != null ? fVar.equals(dVar.mo36388b()) : dVar.mo36388b() == null) {
                        C12037d.C12039b bVar = this.f45014e;
                        if (bVar == null) {
                            if (dVar.mo36391e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.mo36391e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo36393f() {
        return this.f45010a;
    }

    public int hashCode() {
        String str = this.f45010a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f45011b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f45012c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C12041f fVar = this.f45013d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        C12037d.C12039b bVar = this.f45014e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f45010a + ", fid=" + this.f45011b + ", refreshToken=" + this.f45012c + ", authToken=" + this.f45013d + ", responseCode=" + this.f45014e + "}";
    }

    private C12030a(String str, String str2, String str3, C12041f fVar, C12037d.C12039b bVar) {
        this.f45010a = str;
        this.f45011b = str2;
        this.f45012c = str3;
        this.f45013d = fVar;
        this.f45014e = bVar;
    }
}
