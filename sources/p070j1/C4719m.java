package p070j1;

import android.app.Activity;
import android.content.Context;
import p186ac.C6539c;
import p186ac.C6556k;
import p186ac.C6565o;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: j1.m */
/* compiled from: PermissionHandlerPlugin */
public final class C4719m implements C12502a, C12588a {

    /* renamed from: a */
    private final C4720n f25300a = new C4720n();

    /* renamed from: b */
    private C6556k f25301b;

    /* renamed from: c */
    private C6565o f25302c;

    /* renamed from: d */
    private C12590c f25303d;

    /* renamed from: e */
    private C4718l f25304e;

    /* renamed from: a */
    private void m30459a() {
        C12590c cVar = this.f25303d;
        if (cVar != null) {
            cVar.mo34116f(this.f25300a);
            this.f25303d.mo34113c(this.f25300a);
        }
    }

    /* renamed from: b */
    private void m30460b() {
        C6565o oVar = this.f25302c;
        if (oVar != null) {
            oVar.mo22166a(this.f25300a);
            this.f25302c.mo22167b(this.f25300a);
            return;
        }
        C12590c cVar = this.f25303d;
        if (cVar != null) {
            cVar.mo34111a(this.f25300a);
            this.f25303d.mo34112b(this.f25300a);
        }
    }

    /* renamed from: c */
    private void m30461c(Context context, C6539c cVar) {
        this.f25301b = new C6556k(cVar, "flutter.baseflow.com/permissions/methods");
        C4718l lVar = new C4718l(context, new C4715a(), this.f25300a, new C4725p());
        this.f25304e = lVar;
        this.f25301b.mo22161e(lVar);
    }

    /* renamed from: d */
    private void m30462d(Activity activity) {
        C4718l lVar = this.f25304e;
        if (lVar != null) {
            lVar.mo18378i(activity);
        }
    }

    /* renamed from: e */
    private void m30463e() {
        this.f25301b.mo22161e((C6556k.C6560c) null);
        this.f25301b = null;
        this.f25304e = null;
    }

    /* renamed from: f */
    private void m30464f() {
        C4718l lVar = this.f25304e;
        if (lVar != null) {
            lVar.mo18378i((Activity) null);
        }
    }

    public void onAttachedToActivity(C12590c cVar) {
        m30462d(cVar.getActivity());
        this.f25303d = cVar;
        m30460b();
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m30461c(bVar.mo37292a(), bVar.mo37293b());
    }

    public void onDetachedFromActivity() {
        m30464f();
        m30459a();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        m30463e();
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        onAttachedToActivity(cVar);
    }
}
