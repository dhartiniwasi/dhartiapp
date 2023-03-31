package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1196h0;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.C11669k;
import p049g0.C4298a;
import p104o0.C5140c;
import p104o0.C5146e;

/* renamed from: androidx.lifecycle.d0 */
/* compiled from: SavedStateViewModelFactory.kt */
public final class C1187d0 extends C1196h0.C1205d implements C1196h0.C1200b {

    /* renamed from: b */
    private Application f3298b;

    /* renamed from: c */
    private final C1196h0.C1200b f3299c;

    /* renamed from: d */
    private Bundle f3300d;

    /* renamed from: e */
    private C1208j f3301e;

    /* renamed from: f */
    private C5140c f3302f;

    public C1187d0(Application application, C5146e eVar, Bundle bundle) {
        C1196h0.C1197a aVar;
        C11669k.m56787e(eVar, "owner");
        this.f3302f = eVar.getSavedStateRegistry();
        this.f3301e = eVar.getLifecycle();
        this.f3300d = bundle;
        this.f3298b = application;
        if (application != null) {
            aVar = C1196h0.C1197a.f3317f.mo4397a(application);
        } else {
            aVar = new C1196h0.C1197a();
        }
        this.f3299c = aVar;
    }

    /* renamed from: a */
    public <T extends C1194g0> T mo4232a(Class<T> cls) {
        C11669k.m56787e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo4377d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends C1194g0> T mo4233b(Class<T> cls, C4298a aVar) {
        Constructor<T> constructor;
        C11669k.m56787e(cls, "modelClass");
        C11669k.m56787e(aVar, "extras");
        String str = (String) aVar.mo17710a(C1196h0.C1202c.f3326d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (aVar.mo17710a(C1174a0.f3281a) != null && aVar.mo17710a(C1174a0.f3282b) != null) {
            Application application = (Application) aVar.mo17710a(C1196h0.C1197a.f3319h);
            boolean isAssignableFrom = C1173a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = C1189e0.m5382c(cls, C1189e0.f3304b);
            } else {
                constructor = C1189e0.m5382c(cls, C1189e0.f3303a);
            }
            if (constructor == null) {
                return this.f3299c.mo4233b(cls, aVar);
            }
            if (!isAssignableFrom || application == null) {
                return C1189e0.m5383d(cls, constructor, C1174a0.m5351a(aVar));
            }
            return C1189e0.m5383d(cls, constructor, application, C1174a0.m5351a(aVar));
        } else if (this.f3301e != null) {
            return mo4377d(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    /* renamed from: c */
    public void mo4376c(C1194g0 g0Var) {
        C11669k.m56787e(g0Var, "viewModel");
        C1208j jVar = this.f3301e;
        if (jVar != null) {
            LegacySavedStateHandleController.m5318a(g0Var, this.f3302f, jVar);
        }
    }

    /* renamed from: d */
    public final <T extends C1194g0> T mo4377d(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t;
        Application application;
        C11669k.m56787e(str, "key");
        C11669k.m56787e(cls, "modelClass");
        if (this.f3301e != null) {
            boolean isAssignableFrom = C1173a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f3298b == null) {
                constructor = C1189e0.m5382c(cls, C1189e0.f3304b);
            } else {
                constructor = C1189e0.m5382c(cls, C1189e0.f3303a);
            }
            if (constructor != null) {
                SavedStateHandleController b = LegacySavedStateHandleController.m5319b(this.f3302f, this.f3301e, str, this.f3300d);
                if (!isAssignableFrom || (application = this.f3298b) == null) {
                    C1240z i = b.mo4361i();
                    C11669k.m56786d(i, "controller.handle");
                    t = C1189e0.m5383d(cls, constructor, i);
                } else {
                    C11669k.m56784b(application);
                    C1240z i2 = b.mo4361i();
                    C11669k.m56786d(i2, "controller.handle");
                    t = C1189e0.m5383d(cls, constructor, application, i2);
                }
                t.mo4394e("androidx.lifecycle.savedstate.vm.tag", b);
                return t;
            } else if (this.f3298b != null) {
                return this.f3299c.mo4232a(cls);
            } else {
                return C1196h0.C1202c.f3324b.mo4398a().mo4232a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
