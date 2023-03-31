package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C1196h0;
import androidx.lifecycle.C1208j;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11670l;
import kotlin.jvm.internal.C11677s;
import p049g0.C4298a;
import p049g0.C4302c;
import p104o0.C5140c;
import p104o0.C5146e;
import p344rd.C12439l;

/* renamed from: androidx.lifecycle.a0 */
/* compiled from: SavedStateHandleSupport.kt */
public final class C1174a0 {

    /* renamed from: a */
    public static final C4298a.C4300b<C5146e> f3281a = new C1176b();

    /* renamed from: b */
    public static final C4298a.C4300b<C1217l0> f3282b = new C1177c();

    /* renamed from: c */
    public static final C4298a.C4300b<Bundle> f3283c = new C1175a();

    /* renamed from: androidx.lifecycle.a0$a */
    /* compiled from: SavedStateHandleSupport.kt */
    public static final class C1175a implements C4298a.C4300b<Bundle> {
        C1175a() {
        }
    }

    /* renamed from: androidx.lifecycle.a0$b */
    /* compiled from: SavedStateHandleSupport.kt */
    public static final class C1176b implements C4298a.C4300b<C5146e> {
        C1176b() {
        }
    }

    /* renamed from: androidx.lifecycle.a0$c */
    /* compiled from: SavedStateHandleSupport.kt */
    public static final class C1177c implements C4298a.C4300b<C1217l0> {
        C1177c() {
        }
    }

    /* renamed from: androidx.lifecycle.a0$d */
    /* compiled from: SavedStateHandleSupport.kt */
    static final class C1178d extends C11670l implements C12439l<C4298a, C1185c0> {

        /* renamed from: a */
        public static final C1178d f3284a = new C1178d();

        C1178d() {
            super(1);
        }

        /* renamed from: a */
        public final C1185c0 invoke(C4298a aVar) {
            C11669k.m56787e(aVar, "$this$initializer");
            return new C1185c0();
        }
    }

    /* renamed from: a */
    public static final C1240z m5351a(C4298a aVar) {
        C11669k.m56787e(aVar, "<this>");
        C5146e eVar = (C5146e) aVar.mo17710a(f3281a);
        if (eVar != null) {
            C1217l0 l0Var = (C1217l0) aVar.mo17710a(f3282b);
            if (l0Var != null) {
                Bundle bundle = (Bundle) aVar.mo17710a(f3283c);
                String str = (String) aVar.mo17710a(C1196h0.C1202c.f3326d);
                if (str != null) {
                    return m5352b(eVar, l0Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* renamed from: b */
    private static final C1240z m5352b(C5146e eVar, C1217l0 l0Var, String str, Bundle bundle) {
        C1182b0 d = m5354d(eVar);
        C1185c0 e = m5355e(l0Var);
        C1240z zVar = e.mo4375f().get(str);
        if (zVar != null) {
            return zVar;
        }
        C1240z a = C1240z.f3366f.mo4454a(d.mo4371b(str), bundle);
        e.mo4375f().put(str, a);
        return a;
    }

    /* renamed from: c */
    public static final <T extends C5146e & C1217l0> void m5353c(T t) {
        C11669k.m56787e(t, "<this>");
        C1208j.C1211c b = t.getLifecycle().mo4400b();
        C11669k.m56786d(b, "lifecycle.currentState");
        if (!(b == C1208j.C1211c.INITIALIZED || b == C1208j.C1211c.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t.getSavedStateRegistry().mo19107c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C1182b0 b0Var = new C1182b0(t.getSavedStateRegistry(), (C1217l0) t);
            t.getSavedStateRegistry().mo19111h("androidx.lifecycle.internal.SavedStateHandlesProvider", b0Var);
            t.getLifecycle().mo4399a(new SavedStateHandleAttacher(b0Var));
        }
    }

    /* renamed from: d */
    public static final C1182b0 m5354d(C5146e eVar) {
        C11669k.m56787e(eVar, "<this>");
        C5140c.C5143c c = eVar.getSavedStateRegistry().mo19107c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C1182b0 b0Var = c instanceof C1182b0 ? (C1182b0) c : null;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    /* renamed from: e */
    public static final C1185c0 m5355e(C1217l0 l0Var) {
        Class cls = C1185c0.class;
        C11669k.m56787e(l0Var, "<this>");
        C4302c cVar = new C4302c();
        cVar.mo17712a(C11677s.m56801b(cls), C1178d.f3284a);
        return (C1185c0) new C1196h0(l0Var, cVar.mo17713b()).mo4396b("androidx.lifecycle.internal.SavedStateHandlesVM", cls);
    }
}
