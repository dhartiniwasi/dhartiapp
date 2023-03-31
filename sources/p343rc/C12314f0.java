package p343rc;

import p182a7.C6431n;
import p343rc.C12271a;
import p343rc.C12376r0;

/* renamed from: rc.f0 */
/* compiled from: InternalConfigSelector */
public abstract class C12314f0 {

    /* renamed from: a */
    public static final C12271a.C12274c<C12314f0> f45586a = C12271a.C12274c.m58939a("internal:io.grpc.config-selector");

    /* renamed from: rc.f0$b */
    /* compiled from: InternalConfigSelector */
    public static final class C12316b {

        /* renamed from: a */
        private final C12335j1 f45587a;

        /* renamed from: b */
        private final Object f45588b;

        /* renamed from: c */
        public C12323h f45589c;

        /* renamed from: rc.f0$b$a */
        /* compiled from: InternalConfigSelector */
        public static final class C12317a {

            /* renamed from: a */
            private Object f45590a;

            /* renamed from: b */
            private C12323h f45591b;

            /* renamed from: a */
            public C12316b mo37013a() {
                C6431n.m37568u(this.f45590a != null, "config is not set");
                return new C12316b(C12335j1.f45606f, this.f45590a, this.f45591b);
            }

            /* renamed from: b */
            public C12317a mo37014b(Object obj) {
                this.f45590a = C6431n.m37562o(obj, "config");
                return this;
            }

            private C12317a() {
            }
        }

        /* renamed from: d */
        public static C12317a m59058d() {
            return new C12317a();
        }

        /* renamed from: a */
        public Object mo37010a() {
            return this.f45588b;
        }

        /* renamed from: b */
        public C12323h mo37011b() {
            return this.f45589c;
        }

        /* renamed from: c */
        public C12335j1 mo37012c() {
            return this.f45587a;
        }

        private C12316b(C12335j1 j1Var, Object obj, C12323h hVar) {
            this.f45587a = (C12335j1) C6431n.m37562o(j1Var, "status");
            this.f45588b = obj;
            this.f45589c = hVar;
        }
    }

    /* renamed from: a */
    public abstract C12316b mo35089a(C12376r0.C12383f fVar);
}
