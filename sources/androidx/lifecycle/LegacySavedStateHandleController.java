package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C1208j;
import p104o0.C5140c;
import p104o0.C5146e;

class LegacySavedStateHandleController {

    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    static final class C1169a implements C5140c.C5141a {
        C1169a() {
        }

        /* renamed from: a */
        public void mo4346a(C5146e eVar) {
            if (eVar instanceof C1217l0) {
                C1215k0 viewModelStore = ((C1217l0) eVar).getViewModelStore();
                C5140c savedStateRegistry = eVar.getSavedStateRegistry();
                for (String b : viewModelStore.mo4406c()) {
                    LegacySavedStateHandleController.m5318a(viewModelStore.mo4405b(b), savedStateRegistry, eVar.getLifecycle());
                }
                if (!viewModelStore.mo4406c().isEmpty()) {
                    savedStateRegistry.mo19112i(C1169a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    /* renamed from: a */
    static void m5318a(C1194g0 g0Var, C5140c cVar, C1208j jVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) g0Var.mo4393c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo4362j()) {
            savedStateHandleController.mo4360e(cVar, jVar);
            m5320c(cVar, jVar);
        }
    }

    /* renamed from: b */
    static SavedStateHandleController m5319b(C5140c cVar, C1208j jVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C1240z.m5487c(cVar.mo19106b(str), bundle));
        savedStateHandleController.mo4360e(cVar, jVar);
        m5320c(cVar, jVar);
        return savedStateHandleController;
    }

    /* renamed from: c */
    private static void m5320c(final C5140c cVar, final C1208j jVar) {
        C1208j.C1211c b = jVar.mo4400b();
        if (b == C1208j.C1211c.INITIALIZED || b.mo4403a(C1208j.C1211c.STARTED)) {
            cVar.mo19112i(C1169a.class);
        } else {
            jVar.mo4399a(new C1216l() {
                /* renamed from: c */
                public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
                    if (bVar == C1208j.C1210b.ON_START) {
                        C1208j.this.mo4401c(this);
                        cVar.mo19112i(C1169a.class);
                    }
                }
            });
        }
    }
}
