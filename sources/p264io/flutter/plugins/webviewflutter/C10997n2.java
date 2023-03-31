package p264io.flutter.plugins.webviewflutter;

import p186ac.C6539c;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.n2 */
/* compiled from: JavaScriptChannelFlutterApiImpl */
public class C10997n2 extends C10940k.C10957j {

    /* renamed from: b */
    private final C10932i2 f42566b;

    public C10997n2(C6539c cVar, C10932i2 i2Var) {
        super(cVar);
        this.f42566b = i2Var;
    }

    /* renamed from: i */
    private long m54586i(C10991m2 m2Var) {
        Long g = this.f42566b.mo34670g(m2Var);
        if (g != null) {
            return g.longValue();
        }
        throw new IllegalStateException("Could not find identifier for JavaScriptChannel.");
    }

    /* renamed from: h */
    public void mo34764h(C10991m2 m2Var, C10940k.C10957j.C10958a<Void> aVar) {
        if (this.f42566b.mo34669f(m2Var)) {
            mo34711c(Long.valueOf(m54586i(m2Var)), aVar);
        } else {
            aVar.mo34674a(null);
        }
    }

    /* renamed from: j */
    public void mo34765j(C10991m2 m2Var, String str, C10940k.C10957j.C10958a<Void> aVar) {
        super.mo34712g(Long.valueOf(m54586i(m2Var)), str, aVar);
    }
}
