package p343rc;

import java.util.List;
import p182a7.C6431n;
import p343rc.C12319g;

/* renamed from: rc.j */
/* compiled from: ClientInterceptors */
public class C12331j {

    /* renamed from: a */
    private static final C12319g<Object, Object> f45597a = new C12332a();

    /* renamed from: rc.j$a */
    /* compiled from: ClientInterceptors */
    class C12332a extends C12319g<Object, Object> {
        C12332a() {
        }

        /* renamed from: a */
        public void mo35100a(String str, Throwable th) {
        }

        /* renamed from: b */
        public void mo33082b() {
        }

        /* renamed from: c */
        public void mo35101c(int i) {
        }

        /* renamed from: d */
        public void mo35102d(Object obj) {
        }

        /* renamed from: e */
        public void mo35103e(C12319g.C12320a<Object> aVar, C12411y0 y0Var) {
        }
    }

    /* renamed from: rc.j$b */
    /* compiled from: ClientInterceptors */
    private static class C12333b extends C12301d {

        /* renamed from: a */
        private final C12301d f45598a;

        /* renamed from: b */
        private final C12323h f45599b;

        /* synthetic */ C12333b(C12301d dVar, C12323h hVar, C12326i iVar) {
            this(dVar, hVar);
        }

        /* renamed from: a */
        public String mo35080a() {
            return this.f45598a.mo35080a();
        }

        /* renamed from: e */
        public <ReqT, RespT> C12319g<ReqT, RespT> mo35081e(C12423z0<ReqT, RespT> z0Var, C12292c cVar) {
            return this.f45599b.mo37015a(z0Var, cVar, this.f45598a);
        }

        private C12333b(C12301d dVar, C12323h hVar) {
            this.f45598a = dVar;
            this.f45599b = (C12323h) C6431n.m37562o(hVar, "interceptor");
        }
    }

    /* renamed from: a */
    public static C12301d m59084a(C12301d dVar, List<? extends C12323h> list) {
        C6431n.m37562o(dVar, "channel");
        for (C12323h bVar : list) {
            dVar = new C12333b(dVar, bVar, (C12326i) null);
        }
        return dVar;
    }
}
