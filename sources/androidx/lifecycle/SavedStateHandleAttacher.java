package androidx.lifecycle;

import androidx.lifecycle.C1208j;
import kotlin.jvm.internal.C11669k;

/* compiled from: SavedStateHandleSupport.kt */
public final class SavedStateHandleAttacher implements C1216l {

    /* renamed from: a */
    private final C1182b0 f3276a;

    public SavedStateHandleAttacher(C1182b0 b0Var) {
        C11669k.m56787e(b0Var, "provider");
        this.f3276a = b0Var;
    }

    /* renamed from: c */
    public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
        C11669k.m56787e(nVar, "source");
        C11669k.m56787e(bVar, "event");
        if (bVar == C1208j.C1210b.ON_CREATE) {
            nVar.getLifecycle().mo4401c(this);
            this.f3276a.mo4372d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}
