package p264io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.p3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11009p3 implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C10940k.C10962n f42582a;

    public /* synthetic */ C11009p3(C10940k.C10962n nVar) {
        this.f42582a = nVar;
    }

    public final void onReceiveValue(Object obj) {
        this.f42582a.success((String) obj);
    }
}
