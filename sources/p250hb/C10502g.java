package p250hb;

import android.app.Activity;
import kotlin.jvm.internal.C11669k;
import p250hb.C10492a;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: hb.g */
/* compiled from: WakelockPlugin.kt */
public final class C10502g implements C12502a, C10492a.C10495c, C12588a {

    /* renamed from: a */
    private C10501f f41548a;

    /* renamed from: a */
    public void mo33632a(C10492a.C10494b bVar) {
        C10501f fVar = this.f41548a;
        C11669k.m56784b(fVar);
        C11669k.m56784b(bVar);
        fVar.mo33636d(bVar);
    }

    public C10492a.C10493a isEnabled() {
        C10501f fVar = this.f41548a;
        C11669k.m56784b(fVar);
        return fVar.mo33634b();
    }

    public void onAttachedToActivity(C12590c cVar) {
        C11669k.m56787e(cVar, "binding");
        C10501f fVar = this.f41548a;
        if (fVar != null) {
            fVar.mo33635c(cVar.getActivity());
        }
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "flutterPluginBinding");
        C10499d.m52892f(bVar.mo37293b(), this);
        this.f41548a = new C10501f();
    }

    public void onDetachedFromActivity() {
        C10501f fVar = this.f41548a;
        if (fVar != null) {
            fVar.mo33635c((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "binding");
        C10499d.m52892f(bVar.mo37293b(), (C10492a.C10495c) null);
        this.f41548a = null;
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        C11669k.m56787e(cVar, "binding");
        onAttachedToActivity(cVar);
    }
}
