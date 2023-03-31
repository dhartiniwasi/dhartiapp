package p334qc;

import android.content.Context;
import kotlin.jvm.internal.C11669k;
import p186ac.C6539c;
import p186ac.C6556k;
import p351sb.C12502a;

/* renamed from: qc.a */
/* compiled from: FlutterToastPlugin.kt */
public final class C12217a implements C12502a {

    /* renamed from: a */
    private C6556k f45358a;

    /* renamed from: a */
    private final void m58660a(C6539c cVar, Context context) {
        this.f45358a = new C6556k(cVar, "PonnamKarthik/fluttertoast");
        C12219c cVar2 = new C12219c(context);
        C6556k kVar = this.f45358a;
        if (kVar != null) {
            kVar.mo22161e(cVar2);
        }
    }

    /* renamed from: b */
    private final void m58661b() {
        C6556k kVar = this.f45358a;
        if (kVar != null) {
            kVar.mo22161e((C6556k.C6560c) null);
        }
        this.f45358a = null;
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "binding");
        C6539c b = bVar.mo37293b();
        C11669k.m56786d(b, "binding.binaryMessenger");
        Context a = bVar.mo37292a();
        C11669k.m56786d(a, "binding.applicationContext");
        m58660a(b, a);
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "p0");
        m58661b();
    }
}
