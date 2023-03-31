package p264io.flutter.plugins.webviewflutter;

import android.os.Handler;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.o2 */
/* compiled from: JavaScriptChannelHostApiImpl */
public class C11002o2 implements C10940k.C10960l {

    /* renamed from: a */
    private final C10932i2 f42571a;

    /* renamed from: b */
    private final C11003a f42572b;

    /* renamed from: c */
    private final C10997n2 f42573c;

    /* renamed from: d */
    private Handler f42574d;

    /* renamed from: io.flutter.plugins.webviewflutter.o2$a */
    /* compiled from: JavaScriptChannelHostApiImpl */
    public static class C11003a {
        /* renamed from: a */
        public C10991m2 mo34767a(C10997n2 n2Var, String str, Handler handler) {
            return new C10991m2(n2Var, str, handler);
        }
    }

    public C11002o2(C10932i2 i2Var, C11003a aVar, C10997n2 n2Var, Handler handler) {
        this.f42571a = i2Var;
        this.f42572b = aVar;
        this.f42573c = n2Var;
        this.f42574d = handler;
    }

    /* renamed from: a */
    public void mo34713a(Long l, String str) {
        this.f42571a.mo34667b(this.f42572b.mo34767a(this.f42573c, str, this.f42574d), l.longValue());
    }

    /* renamed from: b */
    public void mo34766b(Handler handler) {
        this.f42574d = handler;
    }
}
