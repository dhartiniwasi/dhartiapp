package p264io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10883a implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C10940k.C10962n f42441a;

    public /* synthetic */ C10883a(C10940k.C10962n nVar) {
        this.f42441a = nVar;
    }

    public final void onReceiveValue(Object obj) {
        this.f42441a.success((Boolean) obj);
    }
}
