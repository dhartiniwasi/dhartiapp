package p307nc;

import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p307nc.C11994b;

/* renamed from: nc.a */
/* compiled from: MethodCallHandlerImpl */
final class C11993a implements C6556k.C6560c {

    /* renamed from: a */
    private final C11994b f44936a;

    /* renamed from: b */
    private C6556k f44937b;

    C11993a(C11994b bVar) {
        this.f44936a = bVar;
    }

    /* renamed from: a */
    private static Bundle m57834a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            bundle.putString(next, map.get(next));
        }
        return bundle;
    }

    /* renamed from: b */
    private void m57835b(C6556k.C6561d dVar, String str) {
        dVar.success(Boolean.valueOf(this.f44936a.mo36351a(str)));
    }

    /* renamed from: c */
    private void m57836c(C6556k.C6561d dVar) {
        this.f44936a.mo36352b();
        dVar.success((Object) null);
    }

    /* renamed from: d */
    private void m57837d(C6555j jVar, C6556k.C6561d dVar, String str) {
        boolean booleanValue = ((Boolean) jVar.mo22156a("useWebView")).booleanValue();
        boolean booleanValue2 = ((Boolean) jVar.mo22156a("enableJavaScript")).booleanValue();
        boolean booleanValue3 = ((Boolean) jVar.mo22156a("enableDomStorage")).booleanValue();
        C11994b.C11995a c = this.f44936a.mo36353c(str, m57834a((Map) jVar.mo22156a("headers")), booleanValue, booleanValue2, booleanValue3);
        if (c == C11994b.C11995a.NO_ACTIVITY) {
            dVar.error("NO_ACTIVITY", "Launching a URL requires a foreground activity.", (Object) null);
        } else if (c == C11994b.C11995a.ACTIVITY_NOT_FOUND) {
            dVar.error("ACTIVITY_NOT_FOUND", String.format("No Activity found to handle intent { %s }", new Object[]{str}), (Object) null);
        } else {
            dVar.success(Boolean.TRUE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo36349e(C6539c cVar) {
        if (this.f44937b != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            mo36350f();
        }
        C6556k kVar = new C6556k(cVar, "plugins.flutter.io/url_launcher_android");
        this.f44937b = kVar;
        kVar.mo22161e(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo36350f() {
        C6556k kVar = this.f44937b;
        if (kVar == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        kVar.mo22161e((C6556k.C6560c) null);
        this.f44937b = null;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = (String) jVar.mo22156a("url");
        String str2 = jVar.f30999a;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1109843021:
                if (str2.equals("launch")) {
                    c = 0;
                    break;
                }
                break;
            case -185306205:
                if (str2.equals("canLaunch")) {
                    c = 1;
                    break;
                }
                break;
            case -121617663:
                if (str2.equals("closeWebView")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m57837d(jVar, dVar, str);
                return;
            case 1:
                m57835b(dVar, str);
                return;
            case 2:
                m57836c(dVar);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
