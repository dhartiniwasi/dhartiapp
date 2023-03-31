package p279kb;

import android.content.Context;
import android.net.ConnectivityManager;
import p186ac.C6539c;
import p186ac.C6544d;
import p186ac.C6556k;
import p351sb.C12502a;

/* renamed from: kb.f */
/* compiled from: ConnectivityPlugin */
public class C11613f implements C12502a {

    /* renamed from: a */
    private C6556k f44161a;

    /* renamed from: b */
    private C6544d f44162b;

    /* renamed from: c */
    private C11610d f44163c;

    /* renamed from: a */
    private void m56661a(C6539c cVar, Context context) {
        this.f44161a = new C6556k(cVar, "dev.fluttercommunity.plus/connectivity");
        this.f44162b = new C6544d(cVar, "dev.fluttercommunity.plus/connectivity_status");
        C11607a aVar = new C11607a((ConnectivityManager) context.getSystemService("connectivity"));
        C11612e eVar = new C11612e(aVar);
        this.f44163c = new C11610d(context, aVar);
        this.f44161a.mo22161e(eVar);
        this.f44162b.mo22141d(this.f44163c);
    }

    /* renamed from: b */
    private void m56662b() {
        this.f44161a.mo22161e((C6556k.C6560c) null);
        this.f44162b.mo22141d((C6544d.C6549d) null);
        this.f44163c.mo22146i((Object) null);
        this.f44161a = null;
        this.f44162b = null;
        this.f44163c = null;
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m56661a(bVar.mo37293b(), bVar.mo37292a());
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        m56662b();
    }
}
