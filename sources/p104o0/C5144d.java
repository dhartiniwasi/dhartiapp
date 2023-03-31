package p104o0;

import android.os.Bundle;
import androidx.lifecycle.C1208j;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;

/* renamed from: o0.d */
/* compiled from: SavedStateRegistryController.kt */
public final class C5144d {

    /* renamed from: d */
    public static final C5145a f26667d = new C5145a((C11665g) null);

    /* renamed from: a */
    private final C5146e f26668a;

    /* renamed from: b */
    private final C5140c f26669b;

    /* renamed from: c */
    private boolean f26670c;

    /* renamed from: o0.d$a */
    /* compiled from: SavedStateRegistryController.kt */
    public static final class C5145a {
        private C5145a() {
        }

        public /* synthetic */ C5145a(C11665g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5144d mo19117a(C5146e eVar) {
            C11669k.m56787e(eVar, "owner");
            return new C5144d(eVar, (C11665g) null);
        }
    }

    private C5144d(C5146e eVar) {
        this.f26668a = eVar;
        this.f26669b = new C5140c();
    }

    public /* synthetic */ C5144d(C5146e eVar, C11665g gVar) {
        this(eVar);
    }

    /* renamed from: a */
    public static final C5144d m32043a(C5146e eVar) {
        return f26667d.mo19117a(eVar);
    }

    /* renamed from: b */
    public final C5140c mo19113b() {
        return this.f26669b;
    }

    /* renamed from: c */
    public final void mo19114c() {
        C1208j lifecycle = this.f26668a.getLifecycle();
        C11669k.m56786d(lifecycle, "owner.lifecycle");
        if (lifecycle.mo4400b() == C1208j.C1211c.INITIALIZED) {
            lifecycle.mo4399a(new Recreator(this.f26668a));
            this.f26669b.mo19108e(lifecycle);
            this.f26670c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    /* renamed from: d */
    public final void mo19115d(Bundle bundle) {
        if (!this.f26670c) {
            mo19114c();
        }
        C1208j lifecycle = this.f26668a.getLifecycle();
        C11669k.m56786d(lifecycle, "owner.lifecycle");
        if (!lifecycle.mo4400b().mo4403a(C1208j.C1211c.STARTED)) {
            this.f26669b.mo19109f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo4400b()).toString());
    }

    /* renamed from: e */
    public final void mo19116e(Bundle bundle) {
        C11669k.m56787e(bundle, "outBundle");
        this.f26669b.mo19110g(bundle);
    }
}
