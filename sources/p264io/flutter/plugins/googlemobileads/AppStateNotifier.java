package p264io.flutter.plugins.googlemobileads;

import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1216l;
import androidx.lifecycle.C1220n;
import androidx.lifecycle.C1231w;
import p186ac.C6539c;
import p186ac.C6544d;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: io.flutter.plugins.googlemobileads.AppStateNotifier */
final class AppStateNotifier implements C1216l, C6556k.C6560c, C6544d.C6549d {

    /* renamed from: a */
    private final C6556k f42245a;

    /* renamed from: b */
    private final C6544d f42246b;

    /* renamed from: c */
    private C6544d.C6546b f42247c;

    AppStateNotifier(C6539c cVar) {
        C6556k kVar = new C6556k(cVar, "plugins.flutter.io/google_mobile_ads/app_state_method");
        this.f42245a = kVar;
        kVar.mo22161e(this);
        C6544d dVar = new C6544d(cVar, "plugins.flutter.io/google_mobile_ads/app_state_event");
        this.f42246b = dVar;
        dVar.mo22141d(this);
    }

    /* renamed from: c */
    public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
        C6544d.C6546b bVar2;
        C6544d.C6546b bVar3;
        if (bVar == C1208j.C1210b.ON_START && (bVar3 = this.f42247c) != null) {
            bVar3.success("foreground");
        } else if (bVar == C1208j.C1210b.ON_STOP && (bVar2 = this.f42247c) != null) {
            bVar2.success("background");
        }
    }

    /* renamed from: e */
    public void mo22145e(Object obj, C6544d.C6546b bVar) {
        this.f42247c = bVar;
    }

    /* renamed from: i */
    public void mo22146i(Object obj) {
        this.f42247c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo34446j() {
        C1231w.m5465h().getLifecycle().mo4399a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo34447k() {
        C1231w.m5465h().getLifecycle().mo4401c(this);
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        if (str.equals("stop")) {
            mo34447k();
        } else if (!str.equals("start")) {
            dVar.notImplemented();
        } else {
            mo34446j();
        }
    }
}
