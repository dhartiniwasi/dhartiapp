package p238g8;

import android.content.Context;
import com.google.firebase.firestore.C7959y;
import p008a8.C6479m;
import p211d8.C9882f;
import p218e6.C9975i;
import p218e6.C9977j;
import p247h8.C10432b;
import p247h8.C10442g;
import p247h8.C10449g0;
import p343rc.C12319g;
import p343rc.C12335j1;
import p343rc.C12411y0;
import p343rc.C12422z;
import p343rc.C12423z0;
import p404y7.C13064a;
import p404y7.C13073j;

/* renamed from: g8.v */
/* compiled from: FirestoreChannel */
public class C10285v {

    /* renamed from: g */
    private static final C12411y0.C12418g<String> f40858g;

    /* renamed from: h */
    private static final C12411y0.C12418g<String> f40859h;

    /* renamed from: i */
    private static final C12411y0.C12418g<String> f40860i;

    /* renamed from: j */
    private static volatile String f40861j = "gl-java/";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10442g f40862a;

    /* renamed from: b */
    private final C13064a<C13073j> f40863b;

    /* renamed from: c */
    private final C13064a<String> f40864c;

    /* renamed from: d */
    private final C10232e0 f40865d;

    /* renamed from: e */
    private final String f40866e;

    /* renamed from: f */
    private final C10234f0 f40867f;

    /* renamed from: g8.v$a */
    /* compiled from: FirestoreChannel */
    class C10286a extends C12319g.C12320a {

        /* renamed from: a */
        final /* synthetic */ C10236g0 f40868a;

        /* renamed from: b */
        final /* synthetic */ C12319g[] f40869b;

        C10286a(C10236g0 g0Var, C12319g[] gVarArr) {
            this.f40868a = g0Var;
            this.f40869b = gVarArr;
        }

        /* renamed from: a */
        public void mo33078a(C12335j1 j1Var, C12411y0 y0Var) {
            try {
                this.f40868a.mo32928b(j1Var);
            } catch (Throwable th) {
                C10285v.this.f40862a.mo33526u(th);
            }
        }

        /* renamed from: b */
        public void mo33079b(C12411y0 y0Var) {
            try {
                this.f40868a.mo32929c(y0Var);
            } catch (Throwable th) {
                C10285v.this.f40862a.mo33526u(th);
            }
        }

        /* renamed from: c */
        public void mo33080c(Object obj) {
            try {
                this.f40868a.mo32930d(obj);
                this.f40869b[0].mo35101c(1);
            } catch (Throwable th) {
                C10285v.this.f40862a.mo33526u(th);
            }
        }

        /* renamed from: d */
        public void mo33081d() {
        }
    }

    /* renamed from: g8.v$b */
    /* compiled from: FirestoreChannel */
    class C10287b extends C12422z<ReqT, RespT> {

        /* renamed from: a */
        final /* synthetic */ C12319g[] f40871a;

        /* renamed from: b */
        final /* synthetic */ C9975i f40872b;

        C10287b(C12319g[] gVarArr, C9975i iVar) {
            this.f40871a = gVarArr;
            this.f40872b = iVar;
        }

        /* renamed from: b */
        public void mo33082b() {
            if (this.f40871a[0] == null) {
                this.f40872b.mo26352g(C10285v.this.f40862a.mo33524o(), C10293w.f40881a);
            } else {
                super.mo33082b();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C12319g<ReqT, RespT> mo33083f() {
            C10432b.m52648d(this.f40871a[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
            return this.f40871a[0];
        }
    }

    /* renamed from: g8.v$c */
    /* compiled from: FirestoreChannel */
    class C10288c extends C12319g.C12320a {

        /* renamed from: a */
        final /* synthetic */ C10290e f40874a;

        /* renamed from: b */
        final /* synthetic */ C12319g f40875b;

        C10288c(C10290e eVar, C12319g gVar) {
            this.f40874a = eVar;
            this.f40875b = gVar;
        }

        /* renamed from: a */
        public void mo33078a(C12335j1 j1Var, C12411y0 y0Var) {
            this.f40874a.mo33007a(j1Var);
        }

        /* renamed from: c */
        public void mo33080c(Object obj) {
            this.f40874a.mo33008b(obj);
            this.f40875b.mo35101c(1);
        }
    }

    /* renamed from: g8.v$d */
    /* compiled from: FirestoreChannel */
    class C10289d extends C12319g.C12320a {

        /* renamed from: a */
        final /* synthetic */ C9977j f40877a;

        C10289d(C9977j jVar) {
            this.f40877a = jVar;
        }

        /* renamed from: a */
        public void mo33078a(C12335j1 j1Var, C12411y0 y0Var) {
            if (!j1Var.mo37028o()) {
                this.f40877a.mo32543b(C10285v.this.m52031f(j1Var));
            } else if (!this.f40877a.mo32542a().mo26361p()) {
                this.f40877a.mo32543b(new C7959y("Received onClose with status OK, but no message.", C7959y.C7960a.INTERNAL));
            }
        }

        /* renamed from: c */
        public void mo33080c(Object obj) {
            this.f40877a.mo32544c(obj);
        }
    }

    /* renamed from: g8.v$e */
    /* compiled from: FirestoreChannel */
    public static abstract class C10290e<T> {
        /* renamed from: a */
        public abstract void mo33007a(C12335j1 j1Var);

        /* renamed from: b */
        public abstract void mo33008b(T t);
    }

    static {
        C12411y0.C12415d<String> dVar = C12411y0.f45761e;
        f40858g = C12411y0.C12418g.m59361e("x-goog-api-client", dVar);
        f40859h = C12411y0.C12418g.m59361e("google-cloud-resource-prefix", dVar);
        f40860i = C12411y0.C12418g.m59361e("x-goog-request-params", dVar);
    }

    C10285v(C10442g gVar, Context context, C13064a<C13073j> aVar, C13064a<String> aVar2, C6479m mVar, C10234f0 f0Var) {
        this.f40862a = gVar;
        this.f40867f = f0Var;
        this.f40863b = aVar;
        this.f40864c = aVar2;
        this.f40865d = new C10232e0(gVar, context, mVar, new C10269r(aVar, aVar2));
        C9882f a = mVar.mo22002a();
        this.f40866e = String.format("projects/%s/databases/%s", new Object[]{a.mo32367k(), a.mo32366j()});
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C7959y m52031f(C12335j1 j1Var) {
        if (C10256n.m51895i(j1Var)) {
            return new C7959y("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", C7959y.C7960a.m43894b(j1Var.mo37026m().mo37033c()), j1Var.mo37025l());
        }
        return C10449g0.m52720t(j1Var);
    }

    /* renamed from: g */
    private String m52032g() {
        return String.format("%s fire/%s grpc/", new Object[]{f40861j, "24.4.3"});
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m52033i(C12319g[] gVarArr, C10236g0 g0Var, C9975i iVar) {
        gVarArr[0] = (C12319g) iVar.mo26358m();
        gVarArr[0].mo35103e(new C10286a(g0Var, gVarArr), m52036l());
        g0Var.mo32927a();
        gVarArr[0].mo35101c(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m52034j(C9977j jVar, Object obj, C9975i iVar) {
        C12319g gVar = (C12319g) iVar.mo26358m();
        gVar.mo35103e(new C10289d(jVar), m52036l());
        gVar.mo35101c(2);
        gVar.mo35102d(obj);
        gVar.mo33082b();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m52035k(C10290e eVar, Object obj, C9975i iVar) {
        C12319g gVar = (C12319g) iVar.mo26358m();
        gVar.mo35103e(new C10288c(eVar, gVar), m52036l());
        gVar.mo35101c(1);
        gVar.mo35102d(obj);
        gVar.mo33082b();
    }

    /* renamed from: l */
    private C12411y0 m52036l() {
        C12411y0 y0Var = new C12411y0();
        y0Var.mo37170p(f40858g, m52032g());
        y0Var.mo37170p(f40859h, this.f40866e);
        y0Var.mo37170p(f40860i, this.f40866e);
        C10234f0 f0Var = this.f40867f;
        if (f0Var != null) {
            f0Var.mo32938a(y0Var);
        }
        return y0Var;
    }

    /* renamed from: p */
    public static void m52037p(String str) {
        f40861j = str;
    }

    /* renamed from: h */
    public void mo33073h() {
        this.f40863b.mo38095b();
        this.f40864c.mo38095b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public <ReqT, RespT> C12319g<ReqT, RespT> mo33074m(C12423z0<ReqT, RespT> z0Var, C10236g0<RespT> g0Var) {
        C12319g[] gVarArr = {null};
        C9975i<C12319g<ReqT, RespT>> i = this.f40865d.mo32935i(z0Var);
        i.mo26348c(this.f40862a.mo33524o(), new C10281u(this, gVarArr, g0Var));
        return new C10287b(gVarArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public <ReqT, RespT> C9975i<RespT> mo33075n(C12423z0<ReqT, RespT> z0Var, ReqT reqt) {
        C9977j jVar = new C9977j();
        this.f40865d.mo32935i(z0Var).mo26348c(this.f40862a.mo33524o(), new C10271s(this, jVar, reqt));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public <ReqT, RespT> void mo33076o(C12423z0<ReqT, RespT> z0Var, ReqT reqt, C10290e<RespT> eVar) {
        this.f40865d.mo32935i(z0Var).mo26348c(this.f40862a.mo33524o(), new C10274t(this, eVar, reqt));
    }

    /* renamed from: q */
    public void mo33077q() {
        this.f40865d.mo32936u();
    }
}
