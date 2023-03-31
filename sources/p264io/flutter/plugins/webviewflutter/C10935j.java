package p264io.flutter.plugins.webviewflutter;

import android.content.Context;
import p186ac.C6568r;
import p264io.flutter.plugin.platform.C10731f;
import p264io.flutter.plugin.platform.C10732g;

/* renamed from: io.flutter.plugins.webviewflutter.j */
/* compiled from: FlutterWebViewFactory */
class C10935j extends C10732g {

    /* renamed from: a */
    private final C10932i2 f42503a;

    C10935j(C10932i2 i2Var) {
        super(C6568r.f31011a);
        this.f42503a = i2Var;
    }

    public C10731f create(Context context, int i, Object obj) {
        C10731f fVar = (C10731f) this.f42503a.mo34671h((long) ((Integer) obj).intValue());
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("Unable to find WebView instance: " + obj);
    }
}
