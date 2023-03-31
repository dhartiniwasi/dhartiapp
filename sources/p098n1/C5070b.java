package p098n1;

import java.util.Map;
import java.util.Objects;
import p098n1.C5085i;

/* renamed from: n1.b */
/* compiled from: AutoValue_EventInternal */
final class C5070b extends C5085i {

    /* renamed from: a */
    private final String f26494a;

    /* renamed from: b */
    private final Integer f26495b;

    /* renamed from: c */
    private final C5084h f26496c;

    /* renamed from: d */
    private final long f26497d;

    /* renamed from: e */
    private final long f26498e;

    /* renamed from: f */
    private final Map<String, String> f26499f;

    /* renamed from: n1.b$b */
    /* compiled from: AutoValue_EventInternal */
    static final class C5072b extends C5085i.C5086a {

        /* renamed from: a */
        private String f26500a;

        /* renamed from: b */
        private Integer f26501b;

        /* renamed from: c */
        private C5084h f26502c;

        /* renamed from: d */
        private Long f26503d;

        /* renamed from: e */
        private Long f26504e;

        /* renamed from: f */
        private Map<String, String> f26505f;

        C5072b() {
        }

        /* renamed from: d */
        public C5085i mo19002d() {
            String str = "";
            if (this.f26500a == null) {
                str = str + " transportName";
            }
            if (this.f26502c == null) {
                str = str + " encodedPayload";
            }
            if (this.f26503d == null) {
                str = str + " eventMillis";
            }
            if (this.f26504e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f26505f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C5070b(this.f26500a, this.f26501b, this.f26502c, this.f26503d.longValue(), this.f26504e.longValue(), this.f26505f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Map<String, String> mo19003e() {
            Map<String, String> map = this.f26505f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C5085i.C5086a mo19004f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f26505f = map;
            return this;
        }

        /* renamed from: g */
        public C5085i.C5086a mo19005g(Integer num) {
            this.f26501b = num;
            return this;
        }

        /* renamed from: h */
        public C5085i.C5086a mo19006h(C5084h hVar) {
            Objects.requireNonNull(hVar, "Null encodedPayload");
            this.f26502c = hVar;
            return this;
        }

        /* renamed from: i */
        public C5085i.C5086a mo19007i(long j) {
            this.f26503d = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public C5085i.C5086a mo19008j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f26500a = str;
            return this;
        }

        /* renamed from: k */
        public C5085i.C5086a mo19009k(long j) {
            this.f26504e = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo18993c() {
        return this.f26499f;
    }

    /* renamed from: d */
    public Integer mo18994d() {
        return this.f26495b;
    }

    /* renamed from: e */
    public C5084h mo18995e() {
        return this.f26496c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5085i)) {
            return false;
        }
        C5085i iVar = (C5085i) obj;
        if (!this.f26494a.equals(iVar.mo18999j()) || ((num = this.f26495b) != null ? !num.equals(iVar.mo18994d()) : iVar.mo18994d() != null) || !this.f26496c.equals(iVar.mo18995e()) || this.f26497d != iVar.mo18997f() || this.f26498e != iVar.mo19000k() || !this.f26499f.equals(iVar.mo18993c())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public long mo18997f() {
        return this.f26497d;
    }

    public int hashCode() {
        int hashCode = (this.f26494a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f26495b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f26497d;
        long j2 = this.f26498e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f26496c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f26499f.hashCode();
    }

    /* renamed from: j */
    public String mo18999j() {
        return this.f26494a;
    }

    /* renamed from: k */
    public long mo19000k() {
        return this.f26498e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f26494a + ", code=" + this.f26495b + ", encodedPayload=" + this.f26496c + ", eventMillis=" + this.f26497d + ", uptimeMillis=" + this.f26498e + ", autoMetadata=" + this.f26499f + "}";
    }

    private C5070b(String str, Integer num, C5084h hVar, long j, long j2, Map<String, String> map) {
        this.f26494a = str;
        this.f26495b = num;
        this.f26496c = hVar;
        this.f26497d = j;
        this.f26498e = j2;
        this.f26499f = map;
    }
}
