package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.C1195h;
import androidx.lifecycle.C1206i;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1215k0;
import androidx.lifecycle.C1217l0;
import androidx.lifecycle.C1222o;
import p049g0.C4298a;
import p104o0.C5140c;
import p104o0.C5144d;
import p104o0.C5146e;

/* renamed from: androidx.fragment.app.a0 */
/* compiled from: FragmentViewLifecycleOwner */
class C1058a0 implements C1206i, C5146e, C1217l0 {

    /* renamed from: a */
    private final Fragment f2893a;

    /* renamed from: b */
    private final C1215k0 f2894b;

    /* renamed from: c */
    private C1222o f2895c = null;

    /* renamed from: d */
    private C5144d f2896d = null;

    C1058a0(Fragment fragment, C1215k0 k0Var) {
        this.f2893a = fragment;
        this.f2894b = k0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3900a(C1208j.C1210b bVar) {
        this.f2895c.mo4408h(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3901b() {
        if (this.f2895c == null) {
            this.f2895c = new C1222o(this);
            this.f2896d = C5144d.m32043a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3902c() {
        return this.f2895c != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3903d(Bundle bundle) {
        this.f2896d.mo19115d(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3904e(Bundle bundle) {
        this.f2896d.mo19116e(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3905f(C1208j.C1211c cVar) {
        this.f2895c.mo4410o(cVar);
    }

    public /* synthetic */ C4298a getDefaultViewModelCreationExtras() {
        return C1195h.m5402a(this);
    }

    public C1208j getLifecycle() {
        mo3901b();
        return this.f2895c;
    }

    public C5140c getSavedStateRegistry() {
        mo3901b();
        return this.f2896d.mo19113b();
    }

    public C1215k0 getViewModelStore() {
        mo3901b();
        return this.f2894b;
    }
}
