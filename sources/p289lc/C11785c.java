package p289lc;

import android.app.Activity;
import android.content.Context;
import p186ac.C6539c;
import p186ac.C6556k;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: lc.c */
/* compiled from: SharePlugin */
public class C11785c implements C12502a, C12588a {

    /* renamed from: a */
    private C11783a f44430a;

    /* renamed from: b */
    private C11784b f44431b;

    /* renamed from: c */
    private C6556k f44432c;

    /* renamed from: a */
    private void m57133a(Context context, Activity activity, C6539c cVar) {
        this.f44432c = new C6556k(cVar, "plugins.flutter.io/share");
        C11784b bVar = new C11784b(context, activity);
        this.f44431b = bVar;
        C11783a aVar = new C11783a(bVar);
        this.f44430a = aVar;
        this.f44432c.mo22161e(aVar);
    }

    public void onAttachedToActivity(C12590c cVar) {
        this.f44431b.mo36021j(cVar.getActivity());
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m57133a(bVar.mo37292a(), (Activity) null, bVar.mo37293b());
    }

    public void onDetachedFromActivity() {
        this.f44431b.mo36021j((Activity) null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        this.f44432c.mo22161e((C6556k.C6560c) null);
        this.f44432c = null;
        this.f44431b = null;
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        onAttachedToActivity(cVar);
    }
}
