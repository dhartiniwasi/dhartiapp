package p264io.flutter.plugins.firebase.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p246h7.C10412f;
import p246h7.C10423n;
import p264io.flutter.plugins.firebase.core.C10763l;
import p351sb.C12502a;

/* renamed from: io.flutter.plugins.firebase.core.i */
/* compiled from: FlutterFirebaseCorePlugin */
public class C10760i implements C12502a, C10763l.C10767d, C10763l.C10765b {

    /* renamed from: a */
    private Context f42125a;

    /* renamed from: b */
    private boolean f42126b = false;

    /* renamed from: o */
    private C9975i<C10763l.C10771g> m53828o(C10412f fVar) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10755d(this, fVar, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: p */
    private C10763l.C10769f m53829p(C10423n nVar) {
        C10763l.C10769f.C10770a aVar = new C10763l.C10769f.C10770a();
        aVar.mo34371b(nVar.mo33479b());
        aVar.mo34372c(nVar.mo33480c());
        if (nVar.mo33484f() != null) {
            aVar.mo34374e(nVar.mo33484f());
        }
        if (nVar.mo33485g() != null) {
            aVar.mo34375f(nVar.mo33485g());
        }
        aVar.mo34373d(nVar.mo33481d());
        aVar.mo34376g(nVar.mo33486h());
        aVar.mo34377h(nVar.mo33482e());
        return aVar.mo34370a();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ void m53830q(String str, C9977j jVar) {
        try {
            try {
                C10412f.m52583p(str).mo33467j();
            } catch (IllegalStateException unused) {
            }
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m53831r(C10412f fVar, C9977j jVar) {
        try {
            C10763l.C10771g.C10772a aVar = new C10763l.C10771g.C10772a();
            aVar.mo34385c(fVar.mo33470q());
            aVar.mo34386d(m53829p(fVar.mo33471r()));
            aVar.mo34384b(Boolean.valueOf(fVar.mo33474x()));
            aVar.mo34387e((Map) C9980l.m51027a(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(fVar)));
            jVar.mo32544c(aVar.mo34383a());
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0044 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m53832s(p264io.flutter.plugins.firebase.core.C10763l.C10769f r3, java.lang.String r4, p218e6.C9977j r5) {
        /*
            r2 = this;
            h7.n$b r0 = new h7.n$b     // Catch:{ Exception -> 0x0058 }
            r0.<init>()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r3.mo34348b()     // Catch:{ Exception -> 0x0058 }
            h7.n$b r0 = r0.mo33490b(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r3.mo34349c()     // Catch:{ Exception -> 0x0058 }
            h7.n$b r0 = r0.mo33491c(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r3.mo34350d()     // Catch:{ Exception -> 0x0058 }
            h7.n$b r0 = r0.mo33492d(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r3.mo34351e()     // Catch:{ Exception -> 0x0058 }
            h7.n$b r0 = r0.mo33494f(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r3.mo34352f()     // Catch:{ Exception -> 0x0058 }
            h7.n$b r0 = r0.mo33495g(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r3.mo34353g()     // Catch:{ Exception -> 0x0058 }
            h7.n$b r0 = r0.mo33496h(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r3 = r3.mo34354h()     // Catch:{ Exception -> 0x0058 }
            h7.n$b r3 = r0.mo33493e(r3)     // Catch:{ Exception -> 0x0058 }
            h7.n r3 = r3.mo33489a()     // Catch:{ Exception -> 0x0058 }
            android.os.Looper.prepare()     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            android.content.Context r0 = r2.f42125a     // Catch:{ Exception -> 0x0058 }
            h7.f r3 = p246h7.C10412f.m52587w(r0, r3, r4)     // Catch:{ Exception -> 0x0058 }
            e6.i r3 = r2.m53828o(r3)     // Catch:{ Exception -> 0x0058 }
            java.lang.Object r3 = p218e6.C9980l.m51027a(r3)     // Catch:{ Exception -> 0x0058 }
            io.flutter.plugins.firebase.core.l$g r3 = (p264io.flutter.plugins.firebase.core.C10763l.C10771g) r3     // Catch:{ Exception -> 0x0058 }
            r5.mo32544c(r3)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r3 = move-exception
            r5.mo32543b(r3)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.plugins.firebase.core.C10760i.m53832s(io.flutter.plugins.firebase.core.l$f, java.lang.String, e6.j):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m53833t(C9977j jVar) {
        try {
            if (!this.f42126b) {
                this.f42126b = true;
            } else {
                C9980l.m51027a(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            }
            List<C10412f> n = C10412f.m52581n(this.f42125a);
            ArrayList arrayList = new ArrayList(n.size());
            for (C10412f o : n) {
                arrayList.add((C10763l.C10771g) C9980l.m51027a(m53828o(o)));
            }
            jVar.mo32544c(arrayList);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ void m53834u(C10763l.C10773h hVar, C9975i iVar) {
        if (iVar.mo26362q()) {
            hVar.success(iVar.mo26358m());
        } else {
            hVar.mo34388a(iVar.mo26357l());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m53835v(C9977j jVar) {
        try {
            C10423n a = C10423n.m52613a(this.f42125a);
            if (a == null) {
                jVar.mo32544c(null);
            } else {
                jVar.mo32544c(m53829p(a));
            }
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ void m53836w(String str, Boolean bool, C9977j jVar) {
        try {
            C10412f.m52583p(str).mo33462F(bool);
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ void m53837x(String str, Boolean bool, C9977j jVar) {
        try {
            C10412f.m52583p(str).mo33461E(bool.booleanValue());
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: y */
    private <T> void m53838y(C9977j<T> jVar, C10763l.C10773h<T> hVar) {
        jVar.mo32542a().mo26347b(new C10752a(hVar));
    }

    /* renamed from: a */
    public void mo34340a(String str, C10763l.C10769f fVar, C10763l.C10773h<C10763l.C10771g> hVar) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10756e(this, fVar, str, jVar));
        m53838y(jVar, hVar);
    }

    /* renamed from: b */
    public void mo34341b(C10763l.C10773h<List<C10763l.C10771g>> hVar) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10753b(this, jVar));
        m53838y(jVar, hVar);
    }

    /* renamed from: c */
    public void mo34342c(C10763l.C10773h<C10763l.C10769f> hVar) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10754c(this, jVar));
        m53838y(jVar, hVar);
    }

    /* renamed from: d */
    public void mo34343d(String str, Boolean bool, C10763l.C10773h<Void> hVar) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10759h(str, bool, jVar));
        m53838y(jVar, hVar);
    }

    /* renamed from: e */
    public void mo34344e(String str, C10763l.C10773h<Void> hVar) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10757f(str, jVar));
        m53838y(jVar, hVar);
    }

    /* renamed from: f */
    public void mo34345f(String str, Boolean bool, C10763l.C10773h<Void> hVar) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10758g(str, bool, jVar));
        m53838y(jVar, hVar);
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        C10784t.m53925h(bVar.mo37293b(), this);
        C10777p.m53908h(bVar.mo37293b(), this);
        this.f42125a = bVar.mo37292a();
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        this.f42125a = null;
        C10784t.m53925h(bVar.mo37293b(), (C10763l.C10767d) null);
        C10777p.m53908h(bVar.mo37293b(), (C10763l.C10765b) null);
    }
}
