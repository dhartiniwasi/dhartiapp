package p147u1;

import java.util.Objects;
import java.util.Set;
import p147u1.C5699g;

/* renamed from: u1.d */
/* compiled from: AutoValue_SchedulerConfig_ConfigValue */
final class C5695d extends C5699g.C5701b {

    /* renamed from: a */
    private final long f28455a;

    /* renamed from: b */
    private final long f28456b;

    /* renamed from: c */
    private final Set<C5699g.C5703c> f28457c;

    /* renamed from: u1.d$b */
    /* compiled from: AutoValue_SchedulerConfig_ConfigValue */
    static final class C5697b extends C5699g.C5701b.C5702a {

        /* renamed from: a */
        private Long f28458a;

        /* renamed from: b */
        private Long f28459b;

        /* renamed from: c */
        private Set<C5699g.C5703c> f28460c;

        C5697b() {
        }

        /* renamed from: a */
        public C5699g.C5701b mo20087a() {
            String str = "";
            if (this.f28458a == null) {
                str = str + " delta";
            }
            if (this.f28459b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f28460c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C5695d(this.f28458a.longValue(), this.f28459b.longValue(), this.f28460c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C5699g.C5701b.C5702a mo20088b(long j) {
            this.f28458a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C5699g.C5701b.C5702a mo20089c(Set<C5699g.C5703c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f28460c = set;
            return this;
        }

        /* renamed from: d */
        public C5699g.C5701b.C5702a mo20090d(long j) {
            this.f28459b = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo20081b() {
        return this.f28455a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<C5699g.C5703c> mo20082c() {
        return this.f28457c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo20083d() {
        return this.f28456b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5699g.C5701b)) {
            return false;
        }
        C5699g.C5701b bVar = (C5699g.C5701b) obj;
        if (this.f28455a == bVar.mo20081b() && this.f28456b == bVar.mo20083d() && this.f28457c.equals(bVar.mo20082c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f28455a;
        long j2 = this.f28456b;
        return this.f28457c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f28455a + ", maxAllowedDelay=" + this.f28456b + ", flags=" + this.f28457c + "}";
    }

    private C5695d(long j, long j2, Set<C5699g.C5703c> set) {
        this.f28455a = j;
        this.f28456b = j2;
        this.f28457c = set;
    }
}
