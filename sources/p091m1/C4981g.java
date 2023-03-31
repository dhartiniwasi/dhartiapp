package p091m1;

import java.util.List;
import p091m1.C4994m;

/* renamed from: m1.g */
/* compiled from: AutoValue_LogRequest */
final class C4981g extends C4994m {

    /* renamed from: a */
    private final long f26122a;

    /* renamed from: b */
    private final long f26123b;

    /* renamed from: c */
    private final C4989k f26124c;

    /* renamed from: d */
    private final Integer f26125d;

    /* renamed from: e */
    private final String f26126e;

    /* renamed from: f */
    private final List<C4992l> f26127f;

    /* renamed from: g */
    private final C5001p f26128g;

    /* renamed from: m1.g$b */
    /* compiled from: AutoValue_LogRequest */
    static final class C4983b extends C4994m.C4995a {

        /* renamed from: a */
        private Long f26129a;

        /* renamed from: b */
        private Long f26130b;

        /* renamed from: c */
        private C4989k f26131c;

        /* renamed from: d */
        private Integer f26132d;

        /* renamed from: e */
        private String f26133e;

        /* renamed from: f */
        private List<C4992l> f26134f;

        /* renamed from: g */
        private C5001p f26135g;

        C4983b() {
        }

        /* renamed from: a */
        public C4994m mo18905a() {
            String str = "";
            if (this.f26129a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f26130b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C4981g(this.f26129a.longValue(), this.f26130b.longValue(), this.f26131c, this.f26132d, this.f26133e, this.f26134f, this.f26135g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4994m.C4995a mo18906b(C4989k kVar) {
            this.f26131c = kVar;
            return this;
        }

        /* renamed from: c */
        public C4994m.C4995a mo18907c(List<C4992l> list) {
            this.f26134f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C4994m.C4995a mo18908d(Integer num) {
            this.f26132d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C4994m.C4995a mo18909e(String str) {
            this.f26133e = str;
            return this;
        }

        /* renamed from: f */
        public C4994m.C4995a mo18910f(C5001p pVar) {
            this.f26135g = pVar;
            return this;
        }

        /* renamed from: g */
        public C4994m.C4995a mo18911g(long j) {
            this.f26129a = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public C4994m.C4995a mo18912h(long j) {
            this.f26130b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public C4989k mo18895b() {
        return this.f26124c;
    }

    /* renamed from: c */
    public List<C4992l> mo18896c() {
        return this.f26127f;
    }

    /* renamed from: d */
    public Integer mo18897d() {
        return this.f26125d;
    }

    /* renamed from: e */
    public String mo18898e() {
        return this.f26126e;
    }

    public boolean equals(Object obj) {
        C4989k kVar;
        Integer num;
        String str;
        List<C4992l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4994m)) {
            return false;
        }
        C4994m mVar = (C4994m) obj;
        if (this.f26122a == mVar.mo18901g() && this.f26123b == mVar.mo18902h() && ((kVar = this.f26124c) != null ? kVar.equals(mVar.mo18895b()) : mVar.mo18895b() == null) && ((num = this.f26125d) != null ? num.equals(mVar.mo18897d()) : mVar.mo18897d() == null) && ((str = this.f26126e) != null ? str.equals(mVar.mo18898e()) : mVar.mo18898e() == null) && ((list = this.f26127f) != null ? list.equals(mVar.mo18896c()) : mVar.mo18896c() == null)) {
            C5001p pVar = this.f26128g;
            if (pVar == null) {
                if (mVar.mo18900f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.mo18900f())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public C5001p mo18900f() {
        return this.f26128g;
    }

    /* renamed from: g */
    public long mo18901g() {
        return this.f26122a;
    }

    /* renamed from: h */
    public long mo18902h() {
        return this.f26123b;
    }

    public int hashCode() {
        long j = this.f26122a;
        long j2 = this.f26123b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        C4989k kVar = this.f26124c;
        int i2 = 0;
        int hashCode = (i ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f26125d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f26126e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C4992l> list = this.f26127f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        C5001p pVar = this.f26128g;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f26122a + ", requestUptimeMs=" + this.f26123b + ", clientInfo=" + this.f26124c + ", logSource=" + this.f26125d + ", logSourceName=" + this.f26126e + ", logEvents=" + this.f26127f + ", qosTier=" + this.f26128g + "}";
    }

    private C4981g(long j, long j2, C4989k kVar, Integer num, String str, List<C4992l> list, C5001p pVar) {
        this.f26122a = j;
        this.f26123b = j2;
        this.f26124c = kVar;
        this.f26125d = num;
        this.f26126e = str;
        this.f26127f = list;
        this.f26128g = pVar;
    }
}
