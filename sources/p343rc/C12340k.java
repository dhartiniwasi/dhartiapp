package p343rc;

import p182a7.C6419h;
import p182a7.C6431n;

/* renamed from: rc.k */
/* compiled from: ClientStreamTracer */
public abstract class C12340k extends C12356m1 {

    /* renamed from: rc.k$a */
    /* compiled from: ClientStreamTracer */
    public static abstract class C12341a {
        /* renamed from: a */
        public C12340k mo35452a(C12342b bVar, C12411y0 y0Var) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* renamed from: rc.k$b */
    /* compiled from: ClientStreamTracer */
    public static final class C12342b {

        /* renamed from: a */
        private final C12292c f45650a;

        /* renamed from: b */
        private final int f45651b;

        /* renamed from: c */
        private final boolean f45652c;

        /* renamed from: rc.k$b$a */
        /* compiled from: ClientStreamTracer */
        public static final class C12343a {

            /* renamed from: a */
            private C12292c f45653a = C12292c.f45527k;

            /* renamed from: b */
            private int f45654b;

            /* renamed from: c */
            private boolean f45655c;

            C12343a() {
            }

            /* renamed from: a */
            public C12342b mo37043a() {
                return new C12342b(this.f45653a, this.f45654b, this.f45655c);
            }

            /* renamed from: b */
            public C12343a mo37044b(C12292c cVar) {
                this.f45653a = (C12292c) C6431n.m37562o(cVar, "callOptions cannot be null");
                return this;
            }

            /* renamed from: c */
            public C12343a mo37045c(boolean z) {
                this.f45655c = z;
                return this;
            }

            /* renamed from: d */
            public C12343a mo37046d(int i) {
                this.f45654b = i;
                return this;
            }
        }

        C12342b(C12292c cVar, int i, boolean z) {
            this.f45650a = (C12292c) C6431n.m37562o(cVar, "callOptions");
            this.f45651b = i;
            this.f45652c = z;
        }

        /* renamed from: a */
        public static C12343a m59135a() {
            return new C12343a();
        }

        public String toString() {
            return C6419h.m37528c(this).mo21842d("callOptions", this.f45650a).mo21840b("previousAttempts", this.f45651b).mo21843e("isTransparentRetry", this.f45652c).toString();
        }
    }

    /* renamed from: j */
    public void mo37038j() {
    }

    /* renamed from: k */
    public void mo37039k(C12411y0 y0Var) {
    }

    /* renamed from: l */
    public void mo37040l() {
    }

    /* renamed from: m */
    public void mo37041m(C12271a aVar, C12411y0 y0Var) {
    }
}
