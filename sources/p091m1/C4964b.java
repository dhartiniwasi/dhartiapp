package p091m1;

import java.io.IOException;
import p356t7.C12541c;
import p356t7.C12544d;
import p356t7.C12545e;
import p366u7.C12698a;
import p366u7.C12699b;

/* renamed from: m1.b */
/* compiled from: AutoBatchedLogRequestEncoder */
public final class C4964b implements C12698a {

    /* renamed from: a */
    public static final C12698a f26041a = new C4964b();

    /* renamed from: m1.b$a */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C4965a implements C12544d<C4962a> {

        /* renamed from: a */
        static final C4965a f26042a = new C4965a();

        /* renamed from: b */
        private static final C12541c f26043b = C12541c.m59732d("sdkVersion");

        /* renamed from: c */
        private static final C12541c f26044c = C12541c.m59732d("model");

        /* renamed from: d */
        private static final C12541c f26045d = C12541c.m59732d("hardware");

        /* renamed from: e */
        private static final C12541c f26046e = C12541c.m59732d("device");

        /* renamed from: f */
        private static final C12541c f26047f = C12541c.m59732d("product");

        /* renamed from: g */
        private static final C12541c f26048g = C12541c.m59732d("osBuild");

        /* renamed from: h */
        private static final C12541c f26049h = C12541c.m59732d("manufacturer");

        /* renamed from: i */
        private static final C12541c f26050i = C12541c.m59732d("fingerprint");

        /* renamed from: j */
        private static final C12541c f26051j = C12541c.m59732d("locale");

        /* renamed from: k */
        private static final C12541c f26052k = C12541c.m59732d("country");

        /* renamed from: l */
        private static final C12541c f26053l = C12541c.m59732d("mccMnc");

        /* renamed from: m */
        private static final C12541c f26054m = C12541c.m59732d("applicationBuild");

        private C4965a() {
        }

        /* renamed from: b */
        public void mo18855a(C4962a aVar, C12545e eVar) throws IOException {
            eVar.mo37369c(f26043b, aVar.mo18840m());
            eVar.mo37369c(f26044c, aVar.mo18837j());
            eVar.mo37369c(f26045d, aVar.mo18833f());
            eVar.mo37369c(f26046e, aVar.mo18831d());
            eVar.mo37369c(f26047f, aVar.mo18839l());
            eVar.mo37369c(f26048g, aVar.mo18838k());
            eVar.mo37369c(f26049h, aVar.mo18835h());
            eVar.mo37369c(f26050i, aVar.mo18832e());
            eVar.mo37369c(f26051j, aVar.mo18834g());
            eVar.mo37369c(f26052k, aVar.mo18830c());
            eVar.mo37369c(f26053l, aVar.mo18836i());
            eVar.mo37369c(f26054m, aVar.mo18829b());
        }
    }

    /* renamed from: m1.b$b */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C4966b implements C12544d<C4988j> {

        /* renamed from: a */
        static final C4966b f26055a = new C4966b();

        /* renamed from: b */
        private static final C12541c f26056b = C12541c.m59732d("logRequest");

        private C4966b() {
        }

        /* renamed from: b */
        public void mo18855a(C4988j jVar, C12545e eVar) throws IOException {
            eVar.mo37369c(f26056b, jVar.mo18865c());
        }
    }

    /* renamed from: m1.b$c */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C4967c implements C12544d<C4989k> {

        /* renamed from: a */
        static final C4967c f26057a = new C4967c();

        /* renamed from: b */
        private static final C12541c f26058b = C12541c.m59732d("clientType");

        /* renamed from: c */
        private static final C12541c f26059c = C12541c.m59732d("androidClientInfo");

        private C4967c() {
        }

        /* renamed from: b */
        public void mo18855a(C4989k kVar, C12545e eVar) throws IOException {
            eVar.mo37369c(f26058b, kVar.mo18870c());
            eVar.mo37369c(f26059c, kVar.mo18869b());
        }
    }

    /* renamed from: m1.b$d */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C4968d implements C12544d<C4992l> {

        /* renamed from: a */
        static final C4968d f26060a = new C4968d();

        /* renamed from: b */
        private static final C12541c f26061b = C12541c.m59732d("eventTimeMs");

        /* renamed from: c */
        private static final C12541c f26062c = C12541c.m59732d("eventCode");

        /* renamed from: d */
        private static final C12541c f26063d = C12541c.m59732d("eventUptimeMs");

        /* renamed from: e */
        private static final C12541c f26064e = C12541c.m59732d("sourceExtension");

        /* renamed from: f */
        private static final C12541c f26065f = C12541c.m59732d("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final C12541c f26066g = C12541c.m59732d("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final C12541c f26067h = C12541c.m59732d("networkConnectionInfo");

        private C4968d() {
        }

        /* renamed from: b */
        public void mo18855a(C4992l lVar, C12545e eVar) throws IOException {
            eVar.mo37367a(f26061b, lVar.mo18878c());
            eVar.mo37369c(f26062c, lVar.mo18877b());
            eVar.mo37367a(f26063d, lVar.mo18879d());
            eVar.mo37369c(f26064e, lVar.mo18882f());
            eVar.mo37369c(f26065f, lVar.mo18883g());
            eVar.mo37367a(f26066g, lVar.mo18884h());
            eVar.mo37369c(f26067h, lVar.mo18880e());
        }
    }

    /* renamed from: m1.b$e */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C4969e implements C12544d<C4994m> {

        /* renamed from: a */
        static final C4969e f26068a = new C4969e();

        /* renamed from: b */
        private static final C12541c f26069b = C12541c.m59732d("requestTimeMs");

        /* renamed from: c */
        private static final C12541c f26070c = C12541c.m59732d("requestUptimeMs");

        /* renamed from: d */
        private static final C12541c f26071d = C12541c.m59732d("clientInfo");

        /* renamed from: e */
        private static final C12541c f26072e = C12541c.m59732d("logSource");

        /* renamed from: f */
        private static final C12541c f26073f = C12541c.m59732d("logSourceName");

        /* renamed from: g */
        private static final C12541c f26074g = C12541c.m59732d("logEvent");

        /* renamed from: h */
        private static final C12541c f26075h = C12541c.m59732d("qosTier");

        private C4969e() {
        }

        /* renamed from: b */
        public void mo18855a(C4994m mVar, C12545e eVar) throws IOException {
            eVar.mo37367a(f26069b, mVar.mo18901g());
            eVar.mo37367a(f26070c, mVar.mo18902h());
            eVar.mo37369c(f26071d, mVar.mo18895b());
            eVar.mo37369c(f26072e, mVar.mo18897d());
            eVar.mo37369c(f26073f, mVar.mo18898e());
            eVar.mo37369c(f26074g, mVar.mo18896c());
            eVar.mo37369c(f26075h, mVar.mo18900f());
        }
    }

    /* renamed from: m1.b$f */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C4970f implements C12544d<C4997o> {

        /* renamed from: a */
        static final C4970f f26076a = new C4970f();

        /* renamed from: b */
        private static final C12541c f26077b = C12541c.m59732d("networkType");

        /* renamed from: c */
        private static final C12541c f26078c = C12541c.m59732d("mobileSubtype");

        private C4970f() {
        }

        /* renamed from: b */
        public void mo18855a(C4997o oVar, C12545e eVar) throws IOException {
            eVar.mo37369c(f26077b, oVar.mo18918c());
            eVar.mo37369c(f26078c, oVar.mo18917b());
        }
    }

    private C4964b() {
    }

    /* renamed from: a */
    public void mo18854a(C12699b<?> bVar) {
        C4966b bVar2 = C4966b.f26055a;
        bVar.mo37572a(C4988j.class, bVar2);
        bVar.mo37572a(C4974d.class, bVar2);
        C4969e eVar = C4969e.f26068a;
        bVar.mo37572a(C4994m.class, eVar);
        bVar.mo37572a(C4981g.class, eVar);
        C4967c cVar = C4967c.f26057a;
        bVar.mo37572a(C4989k.class, cVar);
        bVar.mo37572a(C4975e.class, cVar);
        C4965a aVar = C4965a.f26042a;
        bVar.mo37572a(C4962a.class, aVar);
        bVar.mo37572a(C4971c.class, aVar);
        C4968d dVar = C4968d.f26060a;
        bVar.mo37572a(C4992l.class, dVar);
        bVar.mo37572a(C4978f.class, dVar);
        C4970f fVar = C4970f.f26076a;
        bVar.mo37572a(C4997o.class, fVar);
        bVar.mo37572a(C4985i.class, fVar);
    }
}
