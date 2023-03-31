package p264io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import p186ac.C6539c;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.d */
/* compiled from: DownloadListenerFlutterApiImpl */
public class C10899d extends C10940k.C10947d {

    /* renamed from: b */
    private final C10932i2 f42457b;

    public C10899d(C6539c cVar, C10932i2 i2Var) {
        super(cVar);
        this.f42457b = i2Var;
    }

    /* renamed from: i */
    private long m54307i(DownloadListener downloadListener) {
        Long g = this.f42457b.mo34670g(downloadListener);
        if (g != null) {
            return g.longValue();
        }
        throw new IllegalStateException("Could not find identifier for DownloadListener.");
    }

    /* renamed from: h */
    public void mo34644h(DownloadListener downloadListener, C10940k.C10947d.C10948a<Void> aVar) {
        if (this.f42457b.mo34669f(downloadListener)) {
            mo34703c(Long.valueOf(m54307i(downloadListener)), aVar);
        } else {
            aVar.mo34650a(null);
        }
    }

    /* renamed from: j */
    public void mo34645j(DownloadListener downloadListener, String str, String str2, String str3, String str4, long j, C10940k.C10947d.C10948a<Void> aVar) {
        mo34704g(Long.valueOf(m54307i(downloadListener)), str, str2, str3, str4, Long.valueOf(j), aVar);
    }
}
