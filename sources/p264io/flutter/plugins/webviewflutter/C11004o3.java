package p264io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import p186ac.C6539c;
import p264io.flutter.plugin.platform.C10733h;
import p264io.flutter.plugins.webviewflutter.C10904e;
import p264io.flutter.plugins.webviewflutter.C10923h;
import p264io.flutter.plugins.webviewflutter.C11002o2;
import p264io.flutter.plugins.webviewflutter.C11014q3;
import p264io.flutter.plugins.webviewflutter.C11026s2;
import p264io.flutter.plugins.webviewflutter.C11041v2;
import p264io.flutter.plugins.webviewflutter.C11046w2;
import p264io.flutter.plugins.webviewflutter.C11055y2;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: io.flutter.plugins.webviewflutter.o3 */
/* compiled from: WebViewFlutterPlugin */
public class C11004o3 implements C12502a, C12588a {

    /* renamed from: a */
    private C10932i2 f42575a;

    /* renamed from: b */
    private C12502a.C12504b f42576b;

    /* renamed from: c */
    private C11014q3 f42577c;

    /* renamed from: d */
    private C11002o2 f42578d;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m54597b(long j) {
    }

    /* renamed from: c */
    private void m54598c(C6539c cVar, C10733h hVar, Context context, View view, C10923h hVar2) {
        C10932i2 i = C10932i2.m54411i(C10998n3.f42567a);
        this.f42575a = i;
        hVar.mo34259a("plugins.flutter.io/webview", new C10935j(i));
        this.f42577c = new C11014q3(this.f42575a, new C11014q3.C11018d(), context, view);
        this.f42578d = new C11002o2(this.f42575a, new C11002o2.C11003a(), new C10997n2(cVar, this.f42575a), new Handler(context.getMainLooper()));
        C10914f2.m54364d0(cVar, this.f42577c);
        C11052y.m54755d(cVar, this.f42578d);
        C10901d1.m54314d(cVar, new C11055y2(this.f42575a, new C11055y2.C11058c(), new C11051x2(cVar, this.f42575a)));
        C10895c0.m54303d(cVar, new C11026s2(this.f42575a, new C11026s2.C11027a(), new C11022r2(cVar, this.f42575a)));
        C11019r.m54647d(cVar, new C10904e(this.f42575a, new C10904e.C10905a(), new C10899d(cVar, this.f42575a)));
        C11020r0.m54651D(cVar, new C11041v2(this.f42575a, new C11041v2.C11042a()));
        C11034u.m54704f(cVar, new C10929i(hVar2));
        C10993n.m54582f(cVar, new C10888b());
        C11035u0.m54710f(cVar, new C11046w2(this.f42575a, new C11046w2.C11047a()));
    }

    /* renamed from: d */
    private void m54599d(Context context) {
        this.f42577c.mo34778B(context);
        this.f42578d.mo34766b(new Handler(context.getMainLooper()));
    }

    public void onAttachedToActivity(C12590c cVar) {
        m54599d(cVar.getActivity());
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        this.f42576b = bVar;
        m54598c(bVar.mo37293b(), bVar.mo37296e(), bVar.mo37292a(), (View) null, new C10923h.C10924a(bVar.mo37292a().getAssets(), bVar.mo37294c()));
    }

    public void onDetachedFromActivity() {
        m54599d(this.f42576b.mo37292a());
    }

    public void onDetachedFromActivityForConfigChanges() {
        m54599d(this.f42576b.mo37292a());
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        this.f42575a.mo34668e();
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        m54599d(cVar.getActivity());
    }
}
