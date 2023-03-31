package p153v1;

import p153v1.C5762e;

/* renamed from: v1.a */
/* compiled from: AutoValue_EventStoreConfig */
final class C5756a extends C5762e {

    /* renamed from: b */
    private final long f28723b;

    /* renamed from: c */
    private final int f28724c;

    /* renamed from: d */
    private final int f28725d;

    /* renamed from: e */
    private final long f28726e;

    /* renamed from: f */
    private final int f28727f;

    /* renamed from: v1.a$b */
    /* compiled from: AutoValue_EventStoreConfig */
    static final class C5758b extends C5762e.C5763a {

        /* renamed from: a */
        private Long f28728a;

        /* renamed from: b */
        private Integer f28729b;

        /* renamed from: c */
        private Integer f28730c;

        /* renamed from: d */
        private Long f28731d;

        /* renamed from: e */
        private Integer f28732e;

        C5758b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5762e mo20248a() {
            String str = "";
            if (this.f28728a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f28729b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f28730c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f28731d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f28732e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C5756a(this.f28728a.longValue(), this.f28729b.intValue(), this.f28730c.intValue(), this.f28731d.longValue(), this.f28732e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5762e.C5763a mo20249b(int i) {
            this.f28730c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5762e.C5763a mo20250c(long j) {
            this.f28731d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C5762e.C5763a mo20251d(int i) {
            this.f28729b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C5762e.C5763a mo20252e(int i) {
            this.f28732e = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C5762e.C5763a mo20253f(long j) {
            this.f28728a = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo20240b() {
        return this.f28725d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo20241c() {
        return this.f28726e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo20242d() {
        return this.f28724c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo20243e() {
        return this.f28727f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5762e)) {
            return false;
        }
        C5762e eVar = (C5762e) obj;
        if (this.f28723b == eVar.mo20245f() && this.f28724c == eVar.mo20242d() && this.f28725d == eVar.mo20240b() && this.f28726e == eVar.mo20241c() && this.f28727f == eVar.mo20243e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo20245f() {
        return this.f28723b;
    }

    public int hashCode() {
        long j = this.f28723b;
        long j2 = this.f28726e;
        return this.f28727f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f28724c) * 1000003) ^ this.f28725d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f28723b + ", loadBatchSize=" + this.f28724c + ", criticalSectionEnterTimeoutMs=" + this.f28725d + ", eventCleanUpAge=" + this.f28726e + ", maxBlobByteSizePerRow=" + this.f28727f + "}";
    }

    private C5756a(long j, int i, int i2, long j2, int i3) {
        this.f28723b = j;
        this.f28724c = i;
        this.f28725d = i2;
        this.f28726e = j2;
        this.f28727f = i3;
    }
}
