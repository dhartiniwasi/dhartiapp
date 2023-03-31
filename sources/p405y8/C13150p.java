package p405y8;

import p343rc.C12292c;
import p343rc.C12301d;
import p343rc.C12423z0;
import p400xc.C12991b;
import p409yc.C13259a;
import p409yc.C13260b;

/* renamed from: y8.p */
/* compiled from: FirestoreGrpc */
public final class C13150p {

    /* renamed from: a */
    private static volatile C12423z0<C13097d, C13104e> f47392a;

    /* renamed from: b */
    private static volatile C12423z0<C13111f, C13117g> f47393b;

    /* renamed from: c */
    private static volatile C12423z0<C13169u, C13172v> f47394c;

    /* renamed from: d */
    private static volatile C12423z0<C13100d0, C13108e0> f47395d;

    /* renamed from: e */
    private static volatile C12423z0<C13153q, C13157r> f47396e;

    /* renamed from: y8.p$a */
    /* compiled from: FirestoreGrpc */
    class C13151a implements C13260b.C13261a<C13152b> {
        C13151a() {
        }

        /* renamed from: b */
        public C13152b mo38212a(C12301d dVar, C12292c cVar) {
            return new C13152b(dVar, cVar, (C13151a) null);
        }
    }

    /* renamed from: y8.p$b */
    /* compiled from: FirestoreGrpc */
    public static final class C13152b extends C13259a<C13152b> {
        /* synthetic */ C13152b(C12301d dVar, C12292c cVar, C13151a aVar) {
            this(dVar, cVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C13152b mo38214a(C12301d dVar, C12292c cVar) {
            return new C13152b(dVar, cVar);
        }

        private C13152b(C12301d dVar, C12292c cVar) {
            super(dVar, cVar);
        }
    }

    private C13150p() {
    }

    /* renamed from: a */
    public static C12423z0<C13097d, C13104e> m61715a() {
        C12423z0<C13097d, C13104e> z0Var = f47392a;
        if (z0Var == null) {
            synchronized (C13150p.class) {
                z0Var = f47392a;
                if (z0Var == null) {
                    z0Var = C12423z0.m59388g().mo37201f(C12423z0.C12427d.SERVER_STREAMING).mo37197b(C12423z0.m59387b("google.firestore.v1.Firestore", "BatchGetDocuments")).mo37200e(true).mo37198c(C12991b.m61208b(C13097d.m61562f0())).mo37199d(C12991b.m61208b(C13104e.m61583b0())).mo37196a();
                    f47392a = z0Var;
                }
            }
        }
        return z0Var;
    }

    /* renamed from: b */
    public static C12423z0<C13111f, C13117g> m61716b() {
        C12423z0<C13111f, C13117g> z0Var = f47393b;
        if (z0Var == null) {
            synchronized (C13150p.class) {
                z0Var = f47393b;
                if (z0Var == null) {
                    z0Var = C12423z0.m59388g().mo37201f(C12423z0.C12427d.UNARY).mo37197b(C12423z0.m59387b("google.firestore.v1.Firestore", "Commit")).mo37200e(true).mo37198c(C12991b.m61208b(C13111f.m61602f0())).mo37199d(C12991b.m61208b(C13117g.m61614c0())).mo37196a();
                    f47393b = z0Var;
                }
            }
        }
        return z0Var;
    }

    /* renamed from: c */
    public static C12423z0<C13153q, C13157r> m61717c() {
        C12423z0<C13153q, C13157r> z0Var = f47396e;
        if (z0Var == null) {
            synchronized (C13150p.class) {
                z0Var = f47396e;
                if (z0Var == null) {
                    z0Var = C12423z0.m59388g().mo37201f(C12423z0.C12427d.BIDI_STREAMING).mo37197b(C12423z0.m59387b("google.firestore.v1.Firestore", "Listen")).mo37200e(true).mo37198c(C12991b.m61208b(C13153q.m61730f0())).mo37199d(C12991b.m61208b(C13157r.m61743b0())).mo37196a();
                    f47396e = z0Var;
                }
            }
        }
        return z0Var;
    }

    /* renamed from: d */
    public static C12423z0<C13169u, C13172v> m61718d() {
        C12423z0<C13169u, C13172v> z0Var = f47394c;
        if (z0Var == null) {
            synchronized (C13150p.class) {
                z0Var = f47394c;
                if (z0Var == null) {
                    z0Var = C12423z0.m59388g().mo37201f(C12423z0.C12427d.SERVER_STREAMING).mo37197b(C12423z0.m59387b("google.firestore.v1.Firestore", "RunAggregationQuery")).mo37200e(true).mo37198c(C12991b.m61208b(C13169u.m61785d0())).mo37199d(C12991b.m61208b(C13172v.m61793b0())).mo37196a();
                    f47394c = z0Var;
                }
            }
        }
        return z0Var;
    }

    /* renamed from: e */
    public static C12423z0<C13100d0, C13108e0> m61719e() {
        C12423z0<C13100d0, C13108e0> z0Var = f47395d;
        if (z0Var == null) {
            synchronized (C13150p.class) {
                z0Var = f47395d;
                if (z0Var == null) {
                    z0Var = C12423z0.m59388g().mo37201f(C12423z0.C12427d.BIDI_STREAMING).mo37197b(C12423z0.m59387b("google.firestore.v1.Firestore", "Write")).mo37200e(true).mo37198c(C12991b.m61208b(C13100d0.m61574g0())).mo37199d(C12991b.m61208b(C13108e0.m61591c0())).mo37196a();
                    f47395d = z0Var;
                }
            }
        }
        return z0Var;
    }

    /* renamed from: f */
    public static C13152b m61720f(C12301d dVar) {
        return (C13152b) C13259a.m62114e(new C13151a(), dVar);
    }
}
