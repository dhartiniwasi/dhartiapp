package p091m1;

import java.util.Arrays;
import p091m1.C4992l;

/* renamed from: m1.f */
/* compiled from: AutoValue_LogEvent */
final class C4978f extends C4992l {

    /* renamed from: a */
    private final long f26108a;

    /* renamed from: b */
    private final Integer f26109b;

    /* renamed from: c */
    private final long f26110c;

    /* renamed from: d */
    private final byte[] f26111d;

    /* renamed from: e */
    private final String f26112e;

    /* renamed from: f */
    private final long f26113f;

    /* renamed from: g */
    private final C4997o f26114g;

    /* renamed from: m1.f$b */
    /* compiled from: AutoValue_LogEvent */
    static final class C4980b extends C4992l.C4993a {

        /* renamed from: a */
        private Long f26115a;

        /* renamed from: b */
        private Integer f26116b;

        /* renamed from: c */
        private Long f26117c;

        /* renamed from: d */
        private byte[] f26118d;

        /* renamed from: e */
        private String f26119e;

        /* renamed from: f */
        private Long f26120f;

        /* renamed from: g */
        private C4997o f26121g;

        C4980b() {
        }

        /* renamed from: a */
        public C4992l mo18887a() {
            String str = "";
            if (this.f26115a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f26117c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f26120f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C4978f(this.f26115a.longValue(), this.f26116b, this.f26117c.longValue(), this.f26118d, this.f26119e, this.f26120f.longValue(), this.f26121g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4992l.C4993a mo18888b(Integer num) {
            this.f26116b = num;
            return this;
        }

        /* renamed from: c */
        public C4992l.C4993a mo18889c(long j) {
            this.f26115a = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C4992l.C4993a mo18890d(long j) {
            this.f26117c = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C4992l.C4993a mo18891e(C4997o oVar) {
            this.f26121g = oVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C4992l.C4993a mo18892f(byte[] bArr) {
            this.f26118d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C4992l.C4993a mo18893g(String str) {
            this.f26119e = str;
            return this;
        }

        /* renamed from: h */
        public C4992l.C4993a mo18894h(long j) {
            this.f26120f = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public Integer mo18877b() {
        return this.f26109b;
    }

    /* renamed from: c */
    public long mo18878c() {
        return this.f26108a;
    }

    /* renamed from: d */
    public long mo18879d() {
        return this.f26110c;
    }

    /* renamed from: e */
    public C4997o mo18880e() {
        return this.f26114g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4992l)) {
            return false;
        }
        C4992l lVar = (C4992l) obj;
        if (this.f26108a == lVar.mo18878c() && ((num = this.f26109b) != null ? num.equals(lVar.mo18877b()) : lVar.mo18877b() == null) && this.f26110c == lVar.mo18879d()) {
            if (Arrays.equals(this.f26111d, lVar instanceof C4978f ? ((C4978f) lVar).f26111d : lVar.mo18882f()) && ((str = this.f26112e) != null ? str.equals(lVar.mo18883g()) : lVar.mo18883g() == null) && this.f26113f == lVar.mo18884h()) {
                C4997o oVar = this.f26114g;
                if (oVar == null) {
                    if (lVar.mo18880e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.mo18880e())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte[] mo18882f() {
        return this.f26111d;
    }

    /* renamed from: g */
    public String mo18883g() {
        return this.f26112e;
    }

    /* renamed from: h */
    public long mo18884h() {
        return this.f26113f;
    }

    public int hashCode() {
        long j = this.f26108a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f26109b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f26110c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f26111d)) * 1000003;
        String str = this.f26112e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f26113f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        C4997o oVar = this.f26114g;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f26108a + ", eventCode=" + this.f26109b + ", eventUptimeMs=" + this.f26110c + ", sourceExtension=" + Arrays.toString(this.f26111d) + ", sourceExtensionJsonProto3=" + this.f26112e + ", timezoneOffsetSeconds=" + this.f26113f + ", networkConnectionInfo=" + this.f26114g + "}";
    }

    private C4978f(long j, Integer num, long j2, byte[] bArr, String str, long j3, C4997o oVar) {
        this.f26108a = j;
        this.f26109b = num;
        this.f26110c = j2;
        this.f26111d = bArr;
        this.f26112e = str;
        this.f26113f = j3;
        this.f26114g = oVar;
    }
}
