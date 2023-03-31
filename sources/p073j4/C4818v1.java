package p073j4;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.b53;
import java.util.concurrent.Callable;
import p060h4.C4596v;

/* renamed from: j4.v1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C4818v1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ WebSettings f25543a;

    /* renamed from: b */
    public final /* synthetic */ Context f25544b;

    public /* synthetic */ C4818v1(WebSettings webSettings, Context context) {
        this.f25543a = webSettings;
        this.f25544b = context;
    }

    public final Object call() {
        WebSettings webSettings = this.f25543a;
        Context context = this.f25544b;
        b53 b53 = C4751b2.f25403i;
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14283E0)).booleanValue()) {
            webSettings.setTextZoom(100);
        }
        webSettings.setAllowContentAccess(false);
        return Boolean.TRUE;
    }
}
