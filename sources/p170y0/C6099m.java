package p170y0;

/* renamed from: y0.m */
/* compiled from: Operation */
public interface C6099m {

    /* renamed from: a */
    public static final C6101b.C6104c f29493a = new C6101b.C6104c();

    /* renamed from: b */
    public static final C6101b.C6103b f29494b = new C6101b.C6103b();

    /* renamed from: y0.m$b */
    /* compiled from: Operation */
    public static abstract class C6101b {

        /* renamed from: y0.m$b$a */
        /* compiled from: Operation */
        public static final class C6102a extends C6101b {

            /* renamed from: a */
            private final Throwable f29495a;

            public C6102a(Throwable th) {
                this.f29495a = th;
            }

            /* renamed from: a */
            public Throwable mo20930a() {
                return this.f29495a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f29495a.getMessage()});
            }
        }

        /* renamed from: y0.m$b$b */
        /* compiled from: Operation */
        public static final class C6103b extends C6101b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C6103b() {
            }
        }

        /* renamed from: y0.m$b$c */
        /* compiled from: Operation */
        public static final class C6104c extends C6101b {
            public String toString() {
                return "SUCCESS";
            }

            private C6104c() {
            }
        }

        C6101b() {
        }
    }
}
