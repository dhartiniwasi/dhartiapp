package p119q1;

import p386w7.C12914d;

/* renamed from: q1.f */
/* compiled from: TimeWindow */
public final class C5363f {

    /* renamed from: c */
    private static final C5363f f27452c = new C5364a().mo19427a();

    /* renamed from: a */
    private final long f27453a;

    /* renamed from: b */
    private final long f27454b;

    /* renamed from: q1.f$a */
    /* compiled from: TimeWindow */
    public static final class C5364a {

        /* renamed from: a */
        private long f27455a = 0;

        /* renamed from: b */
        private long f27456b = 0;

        C5364a() {
        }

        /* renamed from: a */
        public C5363f mo19427a() {
            return new C5363f(this.f27455a, this.f27456b);
        }

        /* renamed from: b */
        public C5364a mo19428b(long j) {
            this.f27456b = j;
            return this;
        }

        /* renamed from: c */
        public C5364a mo19429c(long j) {
            this.f27455a = j;
            return this;
        }
    }

    C5363f(long j, long j2) {
        this.f27453a = j;
        this.f27454b = j2;
    }

    /* renamed from: c */
    public static C5364a m32822c() {
        return new C5364a();
    }

    @C12914d(tag = 2)
    /* renamed from: a */
    public long mo19425a() {
        return this.f27454b;
    }

    @C12914d(tag = 1)
    /* renamed from: b */
    public long mo19426b() {
        return this.f27453a;
    }
}
