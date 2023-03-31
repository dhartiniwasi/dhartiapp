package p115p4;

import android.util.Pair;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.ye3;
import p053g4.C4409t;

/* renamed from: p4.q0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C5309q0 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ C5280c f27321a;

    C5309q0(C5280c cVar) {
        this.f27321a = cVar;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        C4409t.m29325q().mo15126t(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        C5280c cVar = this.f27321a;
        C5315w.m32640c(cVar.f27256u, cVar.f27248e, "sgf", new Pair("sgf_reason", th.getMessage()));
        pm0.m18665e("Failed to initialize webview for loading SDKCore. ", th);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo8530c(Object obj) {
        C5304o oVar = (C5304o) obj;
        pm0.m18662b("Initialized webview successfully for SDKCore.");
    }
}
