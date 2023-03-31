package p119q1;

import p386w7.C12914d;

/* renamed from: q1.e */
/* compiled from: StorageMetrics */
public final class C5361e {

    /* renamed from: c */
    private static final C5361e f27447c = new C5362a().mo19422a();

    /* renamed from: a */
    private final long f27448a;

    /* renamed from: b */
    private final long f27449b;

    /* renamed from: q1.e$a */
    /* compiled from: StorageMetrics */
    public static final class C5362a {

        /* renamed from: a */
        private long f27450a = 0;

        /* renamed from: b */
        private long f27451b = 0;

        C5362a() {
        }

        /* renamed from: a */
        public C5361e mo19422a() {
            return new C5361e(this.f27450a, this.f27451b);
        }

        /* renamed from: b */
        public C5362a mo19423b(long j) {
            this.f27450a = j;
            return this;
        }

        /* renamed from: c */
        public C5362a mo19424c(long j) {
            this.f27451b = j;
            return this;
        }
    }

    C5361e(long j, long j2) {
        this.f27448a = j;
        this.f27449b = j2;
    }

    /* renamed from: c */
    public static C5362a m32816c() {
        return new C5362a();
    }

    @C12914d(tag = 1)
    /* renamed from: a */
    public long mo19420a() {
        return this.f27448a;
    }

    @C12914d(tag = 2)
    /* renamed from: b */
    public long mo19421b() {
        return this.f27449b;
    }
}
