package p264io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import java.util.HashSet;
import java.util.Set;
import p195bc.C6736a;
import p264io.flutter.plugin.platform.C10745q;
import p297mb.C11877a;
import p297mb.C11881b;
import p315ob.C12051a;
import p324pb.C12164a;
import p333qb.C12212f;
import p351sb.C12505b;
import p360tb.C12589b;
import p399xb.C12989a;
import p408yb.C13247a;
import p417zb.C13492a;
import p417zb.C13495b;
import p417zb.C13501e;
import p417zb.C13502f;
import p417zb.C13505g;
import p417zb.C13508h;
import p417zb.C13510i;
import p417zb.C13533l;
import p417zb.C13536m;
import p417zb.C13539n;
import p417zb.C13542o;
import p417zb.C13543p;

/* renamed from: io.flutter.embedding.engine.a */
/* compiled from: FlutterEngine */
public class C10685a {

    /* renamed from: a */
    private final FlutterJNI f41876a;

    /* renamed from: b */
    private final C13247a f41877b;

    /* renamed from: c */
    private final C12051a f41878c;

    /* renamed from: d */
    private final C10689c f41879d;

    /* renamed from: e */
    private final C6736a f41880e;

    /* renamed from: f */
    private final C13492a f41881f;

    /* renamed from: g */
    private final C13495b f41882g;

    /* renamed from: h */
    private final C13501e f41883h;

    /* renamed from: i */
    private final C13502f f41884i;

    /* renamed from: j */
    private final C13505g f41885j;

    /* renamed from: k */
    private final C13508h f41886k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C13533l f41887l;

    /* renamed from: m */
    private final C13510i f41888m;

    /* renamed from: n */
    private final C13536m f41889n;

    /* renamed from: o */
    private final C13539n f41890o;

    /* renamed from: p */
    private final C13542o f41891p;

    /* renamed from: q */
    private final C13543p f41892q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C10745q f41893r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Set<C10687b> f41894s;

    /* renamed from: t */
    private final C10687b f41895t;

    /* renamed from: io.flutter.embedding.engine.a$a */
    /* compiled from: FlutterEngine */
    class C10686a implements C10687b {
        C10686a() {
        }

        /* renamed from: a */
        public void mo34086a() {
        }

        /* renamed from: b */
        public void mo34087b() {
            C11881b.m57388f("FlutterEngine", "onPreEngineRestart()");
            for (C10687b b : C10685a.this.f41894s) {
                b.mo34087b();
            }
            C10685a.this.f41893r.mo34308b0();
            C10685a.this.f41887l.mo38644g();
        }
    }

    /* renamed from: io.flutter.embedding.engine.a$b */
    /* compiled from: FlutterEngine */
    public interface C10687b {
        /* renamed from: a */
        void mo34086a();

        /* renamed from: b */
        void mo34087b();
    }

    public C10685a(Context context) {
        this(context, (String[]) null);
    }

    /* renamed from: e */
    private void m53482e() {
        C11881b.m57388f("FlutterEngine", "Attaching to JNI.");
        this.f41876a.attachToNative();
        if (!m53483w()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    /* renamed from: w */
    private boolean m53483w() {
        return this.f41876a.isAttached();
    }

    /* renamed from: d */
    public void mo34068d(C10687b bVar) {
        this.f41894s.add(bVar);
    }

    /* renamed from: f */
    public void mo34069f() {
        C11881b.m57388f("FlutterEngine", "Destroying.");
        for (C10687b a : this.f41894s) {
            a.mo34086a();
        }
        this.f41879d.mo34099j();
        this.f41893r.mo34304X();
        this.f41878c.mo36426q();
        this.f41876a.removeEngineLifecycleListener(this.f41895t);
        this.f41876a.setDeferredComponentManager((C12164a) null);
        this.f41876a.detachFromNativeAndReleaseResources();
        if (C11877a.m57376e().mo36132a() != null) {
            C11877a.m57376e().mo36132a().destroy();
            this.f41882g.mo38627c((C12164a) null);
        }
    }

    /* renamed from: g */
    public C13492a mo34070g() {
        return this.f41881f;
    }

    /* renamed from: h */
    public C12589b mo34071h() {
        return this.f41879d;
    }

    /* renamed from: i */
    public C12051a mo34072i() {
        return this.f41878c;
    }

    /* renamed from: j */
    public C13501e mo34073j() {
        return this.f41883h;
    }

    /* renamed from: k */
    public C6736a mo34074k() {
        return this.f41880e;
    }

    /* renamed from: l */
    public C13505g mo34075l() {
        return this.f41885j;
    }

    /* renamed from: m */
    public C13508h mo34076m() {
        return this.f41886k;
    }

    /* renamed from: n */
    public C13510i mo34077n() {
        return this.f41888m;
    }

    /* renamed from: o */
    public C10745q mo34078o() {
        return this.f41893r;
    }

    /* renamed from: p */
    public C12505b mo34079p() {
        return this.f41879d;
    }

    /* renamed from: q */
    public C13247a mo34080q() {
        return this.f41877b;
    }

    /* renamed from: r */
    public C13533l mo34081r() {
        return this.f41887l;
    }

    /* renamed from: s */
    public C13536m mo34082s() {
        return this.f41889n;
    }

    /* renamed from: t */
    public C13539n mo34083t() {
        return this.f41890o;
    }

    /* renamed from: u */
    public C13542o mo34084u() {
        return this.f41891p;
    }

    /* renamed from: v */
    public C13543p mo34085v() {
        return this.f41892q;
    }

    public C10685a(Context context, String[] strArr) {
        this(context, (C12212f) null, (FlutterJNI) null, strArr, true);
    }

    public C10685a(Context context, String[] strArr, boolean z) {
        this(context, (C12212f) null, (FlutterJNI) null, strArr, z);
    }

    public C10685a(Context context, String[] strArr, boolean z, boolean z2) {
        this(context, (C12212f) null, (FlutterJNI) null, new C10745q(), strArr, z, z2);
    }

    public C10685a(Context context, C12212f fVar, FlutterJNI flutterJNI, String[] strArr, boolean z) {
        this(context, fVar, flutterJNI, new C10745q(), strArr, z);
    }

    public C10685a(Context context, C12212f fVar, FlutterJNI flutterJNI, C10745q qVar, String[] strArr, boolean z) {
        this(context, fVar, flutterJNI, qVar, strArr, z, false);
    }

    public C10685a(Context context, C12212f fVar, FlutterJNI flutterJNI, C10745q qVar, String[] strArr, boolean z, boolean z2) {
        AssetManager assetManager;
        this.f41894s = new HashSet();
        this.f41895t = new C10686a();
        try {
            assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assetManager = context.getAssets();
        }
        C11877a e = C11877a.m57376e();
        flutterJNI = flutterJNI == null ? e.mo36135d().mo34065a() : flutterJNI;
        this.f41876a = flutterJNI;
        C12051a aVar = new C12051a(flutterJNI, assetManager);
        this.f41878c = aVar;
        aVar.mo36425p();
        C12164a a = C11877a.m57376e().mo36132a();
        this.f41881f = new C13492a(aVar, flutterJNI);
        C13495b bVar = new C13495b(aVar);
        this.f41882g = bVar;
        this.f41883h = new C13501e(aVar);
        C13502f fVar2 = new C13502f(aVar);
        this.f41884i = fVar2;
        this.f41885j = new C13505g(aVar);
        this.f41886k = new C13508h(aVar);
        this.f41888m = new C13510i(aVar);
        this.f41887l = new C13533l(aVar, z2);
        this.f41889n = new C13536m(aVar);
        this.f41890o = new C13539n(aVar);
        this.f41891p = new C13542o(aVar);
        this.f41892q = new C13543p(aVar);
        if (a != null) {
            a.mo36689e(bVar);
        }
        C6736a aVar2 = new C6736a(context, fVar2);
        this.f41880e = aVar2;
        fVar = fVar == null ? e.mo36134c() : fVar;
        if (!flutterJNI.isAttached()) {
            fVar.mo36746r(context.getApplicationContext());
            fVar.mo36740g(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f41895t);
        flutterJNI.setPlatformViewsController(qVar);
        flutterJNI.setLocalizationPlugin(aVar2);
        flutterJNI.setDeferredComponentManager(e.mo36132a());
        if (!flutterJNI.isAttached()) {
            m53482e();
        }
        this.f41877b = new C13247a(flutterJNI);
        this.f41893r = qVar;
        qVar.mo34302V();
        this.f41879d = new C10689c(context.getApplicationContext(), this, fVar);
        aVar2.mo22653d(context.getResources().getConfiguration());
        if (z && fVar.mo36739f()) {
            C12989a.m61203a(this);
        }
    }
}
