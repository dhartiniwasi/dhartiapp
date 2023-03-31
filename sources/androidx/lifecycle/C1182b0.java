package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11670l;
import p104o0.C5140c;
import p243gd.C10335g;
import p344rd.C12428a;

/* renamed from: androidx.lifecycle.b0 */
/* compiled from: SavedStateHandleSupport.kt */
public final class C1182b0 implements C5140c.C5143c {

    /* renamed from: a */
    private final C5140c f3292a;

    /* renamed from: b */
    private boolean f3293b;

    /* renamed from: c */
    private Bundle f3294c;

    /* renamed from: d */
    private final C10335g f3295d;

    /* renamed from: androidx.lifecycle.b0$a */
    /* compiled from: SavedStateHandleSupport.kt */
    static final class C1183a extends C11670l implements C12428a<C1185c0> {

        /* renamed from: a */
        final /* synthetic */ C1217l0 f3296a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1183a(C1217l0 l0Var) {
            super(0);
            this.f3296a = l0Var;
        }

        /* renamed from: a */
        public final C1185c0 invoke() {
            return C1174a0.m5355e(this.f3296a);
        }
    }

    public C1182b0(C5140c cVar, C1217l0 l0Var) {
        C11669k.m56787e(cVar, "savedStateRegistry");
        C11669k.m56787e(l0Var, "viewModelStoreOwner");
        this.f3292a = cVar;
        this.f3295d = C10337i.m52235a(new C1183a(l0Var));
    }

    /* renamed from: c */
    private final C1185c0 m5365c() {
        return (C1185c0) this.f3295d.getValue();
    }

    /* renamed from: a */
    public Bundle mo763a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3294c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : m5365c().mo4375f().entrySet()) {
            String str = (String) next.getKey();
            Bundle a = ((C1240z) next.getValue()).mo4452d().mo763a();
            if (!C11669k.m56783a(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.f3293b = false;
        return bundle;
    }

    /* renamed from: b */
    public final Bundle mo4371b(String str) {
        C11669k.m56787e(str, "key");
        mo4372d();
        Bundle bundle = this.f3294c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f3294c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f3294c;
        boolean z = true;
        if (bundle4 == null || !bundle4.isEmpty()) {
            z = false;
        }
        if (z) {
            this.f3294c = null;
        }
        return bundle2;
    }

    /* renamed from: d */
    public final void mo4372d() {
        if (!this.f3293b) {
            this.f3294c = this.f3292a.mo19106b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f3293b = true;
            m5365c();
        }
    }
}
