package p354se;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import p383vn.hunghd.flutterdownloader.DownloadWorker;

/* renamed from: se.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12523f implements HostnameVerifier {

    /* renamed from: a */
    public static final /* synthetic */ C12523f f46007a = new C12523f();

    private /* synthetic */ C12523f() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return DownloadWorker.m60981e(str, sSLSession);
    }
}
