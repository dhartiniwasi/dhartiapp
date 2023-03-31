package p164x0;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import p158w0.C5882j;
import p345re.C12451a;

/* renamed from: x0.r */
/* compiled from: WebMessageListenerAdapter */
public class C6021r implements WebMessageListenerBoundaryInterface {

    /* renamed from: a */
    private C5882j.C5884b f29237a;

    public C6021r(C5882j.C5884b bVar) {
        this.f29237a = bVar;
    }

    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        this.f29237a.onPostMessage(webView, C6019p.m35426b((WebMessageBoundaryInterface) C12451a.m59406a(WebMessageBoundaryInterface.class, invocationHandler)), uri, z, C6013k.m35406b(invocationHandler2));
    }
}
