package p298mc;

import android.content.Context;
import p186ac.C6539c;
import p186ac.C6556k;
import p351sb.C12502a;

/* renamed from: mc.b */
/* compiled from: SharedPreferencesPlugin */
public class C11885b implements C12502a {

    /* renamed from: a */
    private C6556k f44629a;

    /* renamed from: b */
    private C11882a f44630b;

    /* renamed from: a */
    private void m57398a(C6539c cVar, Context context) {
        this.f44629a = new C6556k(cVar, "plugins.flutter.io/shared_preferences_android");
        C11882a aVar = new C11882a(context);
        this.f44630b = aVar;
        this.f44629a.mo22161e(aVar);
    }

    /* renamed from: b */
    private void m57399b() {
        this.f44630b.mo36138f();
        this.f44630b = null;
        this.f44629a.mo22161e((C6556k.C6560c) null);
        this.f44629a = null;
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m57398a(bVar.mo37293b(), bVar.mo37292a());
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        m57399b();
    }
}
