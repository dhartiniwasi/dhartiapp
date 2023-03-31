package p307nc;

import android.app.Activity;
import android.util.Log;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: nc.c */
/* compiled from: UrlLauncherPlugin */
public final class C11996c implements C12502a, C12588a {

    /* renamed from: a */
    private C11993a f44944a;

    /* renamed from: b */
    private C11994b f44945b;

    public void onAttachedToActivity(C12590c cVar) {
        if (this.f44944a == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f44945b.mo36354d(cVar.getActivity());
        }
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        C11994b bVar2 = new C11994b(bVar.mo37292a(), (Activity) null);
        this.f44945b = bVar2;
        C11993a aVar = new C11993a(bVar2);
        this.f44944a = aVar;
        aVar.mo36349e(bVar.mo37293b());
    }

    public void onDetachedFromActivity() {
        if (this.f44944a == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f44945b.mo36354d((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        C11993a aVar = this.f44944a;
        if (aVar == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        aVar.mo36350f();
        this.f44944a = null;
        this.f44945b = null;
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        onAttachedToActivity(cVar);
    }
}
