package p303n8;

import java.util.Objects;
import p303n8.C11979c;
import p303n8.C11981d;

/* renamed from: n8.a */
/* compiled from: AutoValue_PersistedInstallationEntry */
final class C11975a extends C11981d {

    /* renamed from: b */
    private final String f44893b;

    /* renamed from: c */
    private final C11979c.C11980a f44894c;

    /* renamed from: d */
    private final String f44895d;

    /* renamed from: e */
    private final String f44896e;

    /* renamed from: f */
    private final long f44897f;

    /* renamed from: g */
    private final long f44898g;

    /* renamed from: h */
    private final String f44899h;

    /* renamed from: n8.a$b */
    /* compiled from: AutoValue_PersistedInstallationEntry */
    static final class C11977b extends C11981d.C11982a {

        /* renamed from: a */
        private String f44900a;

        /* renamed from: b */
        private C11979c.C11980a f44901b;

        /* renamed from: c */
        private String f44902c;

        /* renamed from: d */
        private String f44903d;

        /* renamed from: e */
        private Long f44904e;

        /* renamed from: f */
        private Long f44905f;

        /* renamed from: g */
        private String f44906g;

        /* renamed from: a */
        public C11981d mo36323a() {
            String str = "";
            if (this.f44901b == null) {
                str = str + " registrationStatus";
            }
            if (this.f44904e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f44905f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C11975a(this.f44900a, this.f44901b, this.f44902c, this.f44903d, this.f44904e.longValue(), this.f44905f.longValue(), this.f44906g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C11981d.C11982a mo36324b(String str) {
            this.f44902c = str;
            return this;
        }

        /* renamed from: c */
        public C11981d.C11982a mo36325c(long j) {
            this.f44904e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C11981d.C11982a mo36326d(String str) {
            this.f44900a = str;
            return this;
        }

        /* renamed from: e */
        public C11981d.C11982a mo36327e(String str) {
            this.f44906g = str;
            return this;
        }

        /* renamed from: f */
        public C11981d.C11982a mo36328f(String str) {
            this.f44903d = str;
            return this;
        }

        /* renamed from: g */
        public C11981d.C11982a mo36329g(C11979c.C11980a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f44901b = aVar;
            return this;
        }

        /* renamed from: h */
        public C11981d.C11982a mo36330h(long j) {
            this.f44905f = Long.valueOf(j);
            return this;
        }

        C11977b() {
        }

        private C11977b(C11981d dVar) {
            this.f44900a = dVar.mo36314d();
            this.f44901b = dVar.mo36318g();
            this.f44902c = dVar.mo36312b();
            this.f44903d = dVar.mo36317f();
            this.f44904e = Long.valueOf(dVar.mo36313c());
            this.f44905f = Long.valueOf(dVar.mo36319h());
            this.f44906g = dVar.mo36315e();
        }
    }

    /* renamed from: b */
    public String mo36312b() {
        return this.f44895d;
    }

    /* renamed from: c */
    public long mo36313c() {
        return this.f44897f;
    }

    /* renamed from: d */
    public String mo36314d() {
        return this.f44893b;
    }

    /* renamed from: e */
    public String mo36315e() {
        return this.f44899h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11981d)) {
            return false;
        }
        C11981d dVar = (C11981d) obj;
        String str3 = this.f44893b;
        if (str3 != null ? str3.equals(dVar.mo36314d()) : dVar.mo36314d() == null) {
            if (this.f44894c.equals(dVar.mo36318g()) && ((str = this.f44895d) != null ? str.equals(dVar.mo36312b()) : dVar.mo36312b() == null) && ((str2 = this.f44896e) != null ? str2.equals(dVar.mo36317f()) : dVar.mo36317f() == null) && this.f44897f == dVar.mo36313c() && this.f44898g == dVar.mo36319h()) {
                String str4 = this.f44899h;
                if (str4 == null) {
                    if (dVar.mo36315e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.mo36315e())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo36317f() {
        return this.f44896e;
    }

    /* renamed from: g */
    public C11979c.C11980a mo36318g() {
        return this.f44894c;
    }

    /* renamed from: h */
    public long mo36319h() {
        return this.f44898g;
    }

    public int hashCode() {
        String str = this.f44893b;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f44894c.hashCode()) * 1000003;
        String str2 = this.f44895d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f44896e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f44897f;
        long j2 = this.f44898g;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f44899h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: n */
    public C11981d.C11982a mo36321n() {
        return new C11977b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f44893b + ", registrationStatus=" + this.f44894c + ", authToken=" + this.f44895d + ", refreshToken=" + this.f44896e + ", expiresInSecs=" + this.f44897f + ", tokenCreationEpochInSecs=" + this.f44898g + ", fisError=" + this.f44899h + "}";
    }

    private C11975a(String str, C11979c.C11980a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f44893b = str;
        this.f44894c = aVar;
        this.f44895d = str2;
        this.f44896e = str3;
        this.f44897f = j;
        this.f44898g = j2;
        this.f44899h = str4;
    }
}
