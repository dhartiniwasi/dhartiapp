package p008a8;

import android.content.Context;
import com.google.firebase.firestore.C7910g0;
import com.google.firebase.firestore.C7926n;
import com.google.firebase.firestore.C7959y;
import com.google.firebase.firestore.C7961y0;
import com.google.firebase.firestore.C7964z;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p008a8.C6474j;
import p008a8.C6484p;
import p025c8.C6778c1;
import p025c8.C6785d4;
import p025c8.C6790f1;
import p025c8.C6795i0;
import p025c8.C6802k;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9893q;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p220e8.C10009f;
import p238g8.C10234f0;
import p238g8.C10250k0;
import p238g8.C10256n;
import p238g8.C10261o0;
import p247h8.C10432b;
import p247h8.C10442g;
import p247h8.C10466t;
import p247h8.C10468v;
import p404y7.C13064a;
import p404y7.C13073j;
import p413z7.C13469f;
import p413z7.C13470g;
import p413z7.C13473j;

/* renamed from: a8.p0 */
/* compiled from: FirestoreClient */
public final class C6487p0 {

    /* renamed from: a */
    private final C6479m f30825a;

    /* renamed from: b */
    private final C13064a<C13073j> f30826b;

    /* renamed from: c */
    private final C13064a<String> f30827c;

    /* renamed from: d */
    private final C10442g f30828d;

    /* renamed from: e */
    private final C13470g f30829e;

    /* renamed from: f */
    private final C10234f0 f30830f;

    /* renamed from: g */
    private C6778c1 f30831g;

    /* renamed from: h */
    private C6795i0 f30832h;

    /* renamed from: i */
    private C10261o0 f30833i;

    /* renamed from: j */
    private C6465f1 f30834j;

    /* renamed from: k */
    private C6484p f30835k;

    /* renamed from: l */
    private C6785d4 f30836l;

    /* renamed from: m */
    private C6785d4 f30837m;

    public C6487p0(Context context, C6479m mVar, C7964z zVar, C13064a<C13073j> aVar, C13064a<String> aVar2, C10442g gVar, C10234f0 f0Var) {
        this.f30825a = mVar;
        this.f30826b = aVar;
        this.f30827c = aVar2;
        this.f30828d = gVar;
        this.f30830f = f0Var;
        this.f30829e = new C13470g(new C10250k0(mVar.mo22002a()));
        C9977j jVar = new C9977j();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        gVar.mo33521l(new C0150x(this, jVar, context, zVar));
        aVar.mo38097d(new C0131i0(this, atomicBoolean, jVar, gVar));
        aVar2.mo38097d(C0133j0.f298a);
    }

    /* renamed from: E */
    private void m37829E(Context context, C13073j jVar, C7964z zVar) {
        C6474j jVar2;
        C10468v.m52767a("FirestoreClient", "Initializing. user=%s", jVar.mo38098a());
        Context context2 = context;
        C6474j.C6475a aVar = new C6474j.C6475a(context2, this.f30828d, this.f30825a, new C10256n(this.f30825a, this.f30828d, this.f30826b, this.f30827c, context, this.f30830f), jVar, 100, zVar);
        if (zVar.mo26479c()) {
            jVar2 = new C6463e1();
        } else {
            jVar2 = new C6509x0();
        }
        jVar2.mo21975q(aVar);
        this.f30831g = jVar2.mo21972n();
        this.f30837m = jVar2.mo21969k();
        this.f30832h = jVar2.mo21971m();
        this.f30833i = jVar2.mo21973o();
        this.f30834j = jVar2.mo21974p();
        this.f30835k = jVar2.mo21968j();
        C6802k l = jVar2.mo21970l();
        C6785d4 d4Var = this.f30837m;
        if (d4Var != null) {
            d4Var.start();
        }
        if (l != null) {
            C6802k.C6803a f = l.mo22851f();
            this.f30836l = f;
            f.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m37830G(C7926n nVar) {
        this.f30835k.mo22016e(nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m37831H(List list) {
        this.f30832h.mo22845z(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m37832I() {
        this.f30833i.mo33022q();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m37833J() {
        this.f30833i.mo33023s();
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ C9885i m37834K(C9975i iVar) throws Exception {
        C9885i iVar2 = (C9885i) iVar.mo26358m();
        if (iVar2.mo32371b()) {
            return iVar2;
        }
        if (iVar2.mo32379h()) {
            return null;
        }
        throw new C7959y("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", C7959y.C7960a.UNAVAILABLE);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ C9885i m37835L(C9888l lVar) throws Exception {
        return this.f30832h.mo22835h0(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ C6514y1 m37836M(C6452b1 b1Var) throws Exception {
        C6790f1 A = this.f30832h.mo22820A(b1Var, true);
        C6506w1 w1Var = new C6506w1(b1Var, A.mo22782b());
        return w1Var.mo22072b(w1Var.mo22075g(A.mo22781a())).mo22082b();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m37837N(String str, C9977j jVar) {
        C13473j H = this.f30832h.mo22826H(str);
        if (H != null) {
            C6469g1 b = H.mo38589a().mo38586b();
            jVar.mo32544c(new C6452b1(b.mo21944n(), b.mo21934d(), b.mo21937h(), b.mo21943m(), b.mo21940j(), H.mo38589a().mo38585a(), b.mo21946p(), b.mo21936f()));
            return;
        }
        jVar.mo32544c(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m37838O(C6455c1 c1Var) {
        this.f30835k.mo22015d(c1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m37839P(C13469f fVar, C7910g0 g0Var) {
        this.f30834j.mo21924o(fVar, g0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m37840Q(C9977j jVar, Context context, C7964z zVar) {
        try {
            m37829E(context, (C13073j) C9980l.m51027a(jVar.mo32542a()), zVar);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m37841R(C13073j jVar) {
        C10432b.m52648d(this.f30834j != null, "SyncEngine not yet initialized", new Object[0]);
        C10468v.m52767a("FirestoreClient", "Credential changed. Current user: %s", jVar.mo38098a());
        this.f30834j.mo21922l(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m37842S(AtomicBoolean atomicBoolean, C9977j jVar, C10442g gVar, C13073j jVar2) {
        if (atomicBoolean.compareAndSet(false, true)) {
            C10432b.m52648d(!jVar.mo32542a().mo26361p(), "Already fulfilled first user task", new Object[0]);
            jVar.mo32544c(jVar2);
            return;
        }
        gVar.mo33521l(new C0122b0(this, jVar2));
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static /* synthetic */ void m37843T(String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m37844U(C7926n nVar) {
        this.f30835k.mo22018h(nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m37847X(C6452b1 b1Var, C9977j jVar) {
        this.f30834j.mo21926w(b1Var).mo26351f(new C0130h0(jVar)).mo26349d(new C0125d0(jVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m37848Y(C6455c1 c1Var) {
        this.f30835k.mo22017g(c1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m37849Z() {
        this.f30833i.mo33015O();
        this.f30831g.mo22751l();
        C6785d4 d4Var = this.f30837m;
        if (d4Var != null) {
            d4Var.stop();
        }
        C6785d4 d4Var2 = this.f30836l;
        if (d4Var2 != null) {
            d4Var2.stop();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ C9975i m37851a0(C7961y0 y0Var, C10466t tVar) throws Exception {
        return this.f30834j.mo21914A(this.f30828d, y0Var, tVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m37853b0(C9977j jVar) {
        this.f30834j.mo21925s(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m37855c0(List list, C9977j jVar) {
        this.f30834j.mo21915C(list, jVar);
    }

    /* renamed from: k0 */
    private void m37864k0() {
        if (mo22023F()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    /* renamed from: A */
    public C9975i<Void> mo22019A() {
        m37864k0();
        return this.f30828d.mo33518i(new C0139m0(this));
    }

    /* renamed from: B */
    public C9975i<C9885i> mo22020B(C9888l lVar) {
        m37864k0();
        return this.f30828d.mo33519j(new C0129g0(this, lVar)).mo26353h(C0144s.f314a);
    }

    /* renamed from: C */
    public C9975i<C6514y1> mo22021C(C6452b1 b1Var) {
        m37864k0();
        return this.f30828d.mo33519j(new C0126e0(this, b1Var));
    }

    /* renamed from: D */
    public C9975i<C6452b1> mo22022D(String str) {
        m37864k0();
        C9977j jVar = new C9977j();
        this.f30828d.mo33521l(new C0151y(this, str, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: F */
    public boolean mo22023F() {
        return this.f30828d.mo33525p();
    }

    /* renamed from: d0 */
    public C6455c1 mo22024d0(C6452b1 b1Var, C6484p.C6485a aVar, C7926n<C6514y1> nVar) {
        m37864k0();
        C6455c1 c1Var = new C6455c1(b1Var, aVar, nVar);
        this.f30828d.mo33521l(new C0145t(this, c1Var));
        return c1Var;
    }

    /* renamed from: e0 */
    public void mo22025e0(InputStream inputStream, C7910g0 g0Var) {
        m37864k0();
        this.f30828d.mo33521l(new C0124c0(this, new C13469f(this.f30829e, inputStream), g0Var));
    }

    /* renamed from: f0 */
    public void mo22026f0(C7926n<Void> nVar) {
        if (!mo22023F()) {
            this.f30828d.mo33521l(new C0147v(this, nVar));
        }
    }

    /* renamed from: g0 */
    public C9975i<Long> mo22027g0(C6452b1 b1Var) {
        m37864k0();
        C9977j jVar = new C9977j();
        this.f30828d.mo33521l(new C0141n0(this, b1Var, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: h0 */
    public void mo22028h0(C6455c1 c1Var) {
        if (!mo22023F()) {
            this.f30828d.mo33521l(new C0143o0(this, c1Var));
        }
    }

    /* renamed from: i0 */
    public C9975i<Void> mo22029i0() {
        this.f30826b.mo38096c();
        this.f30827c.mo38096c();
        return this.f30828d.mo33523n(new C0136k0(this));
    }

    /* renamed from: j0 */
    public <TResult> C9975i<TResult> mo22030j0(C7961y0 y0Var, C10466t<C6476k1, C9975i<TResult>> tVar) {
        m37864k0();
        return C10442g.m52658g(this.f30828d.mo33524o(), new C0127f0(this, y0Var, tVar));
    }

    /* renamed from: l0 */
    public C9975i<Void> mo22031l0() {
        m37864k0();
        C9977j jVar = new C9977j();
        this.f30828d.mo33521l(new C0149w(this, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: m0 */
    public C9975i<Void> mo22032m0(List<C10009f> list) {
        m37864k0();
        C9977j jVar = new C9977j();
        this.f30828d.mo33521l(new C0120a0(this, list, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: x */
    public void mo22033x(C7926n<Void> nVar) {
        m37864k0();
        this.f30828d.mo33521l(new C0146u(this, nVar));
    }

    /* renamed from: y */
    public C9975i<Void> mo22034y(List<C9893q> list) {
        m37864k0();
        return this.f30828d.mo33518i(new C0152z(this, list));
    }

    /* renamed from: z */
    public C9975i<Void> mo22035z() {
        m37864k0();
        return this.f30828d.mo33518i(new C0137l0(this));
    }
}
