package androidx.lifecycle;

import androidx.lifecycle.C1208j;
import p104o0.C5140c;

final class SavedStateHandleController implements C1216l {

    /* renamed from: a */
    private final String f3277a;

    /* renamed from: b */
    private boolean f3278b = false;

    /* renamed from: c */
    private final C1240z f3279c;

    SavedStateHandleController(String str, C1240z zVar) {
        this.f3277a = str;
        this.f3279c = zVar;
    }

    /* renamed from: c */
    public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
        if (bVar == C1208j.C1210b.ON_DESTROY) {
            this.f3278b = false;
            nVar.getLifecycle().mo4401c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4360e(C5140c cVar, C1208j jVar) {
        if (!this.f3278b) {
            this.f3278b = true;
            jVar.mo4399a(this);
            cVar.mo19111h(this.f3277a, this.f3279c.mo4452d());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1240z mo4361i() {
        return this.f3279c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo4362j() {
        return this.f3278b;
    }
}
