package p104o0;

import android.os.Bundle;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1220n;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p082l.C4890b;

/* renamed from: o0.c */
/* compiled from: SavedStateRegistry.kt */
public final class C5140c {

    /* renamed from: g */
    private static final C5142b f26660g = new C5142b((C11665g) null);

    /* renamed from: a */
    private final C4890b<String, C5143c> f26661a = new C4890b<>();

    /* renamed from: b */
    private boolean f26662b;

    /* renamed from: c */
    private Bundle f26663c;

    /* renamed from: d */
    private boolean f26664d;

    /* renamed from: e */
    private Recreator.C1463b f26665e;

    /* renamed from: f */
    private boolean f26666f = true;

    /* renamed from: o0.c$a */
    /* compiled from: SavedStateRegistry.kt */
    public interface C5141a {
        /* renamed from: a */
        void mo4346a(C5146e eVar);
    }

    /* renamed from: o0.c$b */
    /* compiled from: SavedStateRegistry.kt */
    private static final class C5142b {
        private C5142b() {
        }

        public /* synthetic */ C5142b(C11665g gVar) {
            this();
        }
    }

    /* renamed from: o0.c$c */
    /* compiled from: SavedStateRegistry.kt */
    public interface C5143c {
        /* renamed from: a */
        Bundle mo763a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m32033d(C5140c cVar, C1220n nVar, C1208j.C1210b bVar) {
        C11669k.m56787e(cVar, "this$0");
        C11669k.m56787e(nVar, "<anonymous parameter 0>");
        C11669k.m56787e(bVar, "event");
        if (bVar == C1208j.C1210b.ON_START) {
            cVar.f26666f = true;
        } else if (bVar == C1208j.C1210b.ON_STOP) {
            cVar.f26666f = false;
        }
    }

    /* renamed from: b */
    public final Bundle mo19106b(String str) {
        C11669k.m56787e(str, "key");
        if (this.f26664d) {
            Bundle bundle = this.f26663c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f26663c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f26663c;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f26663c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* renamed from: c */
    public final C5143c mo19107c(String str) {
        C11669k.m56787e(str, "key");
        Iterator<Map.Entry<String, C5143c>> it = this.f26661a.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            C11669k.m56786d(next, "components");
            C5143c cVar = (C5143c) next.getValue();
            if (C11669k.m56783a((String) next.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo19108e(C1208j jVar) {
        C11669k.m56787e(jVar, "lifecycle");
        if (!this.f26662b) {
            jVar.mo4399a(new C12009b(this));
            this.f26662b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    /* renamed from: f */
    public final void mo19109f(Bundle bundle) {
        if (!this.f26662b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f26664d) {
            this.f26663c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            this.f26664d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    /* renamed from: g */
    public final void mo19110g(Bundle bundle) {
        C11669k.m56787e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f26663c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C4890b<K, V>.d f = this.f26661a.mo18685f();
        C11669k.m56786d(f, "this.components.iteratorWithAdditions()");
        while (f.hasNext()) {
            Map.Entry entry = (Map.Entry) f.next();
            bundle2.putBundle((String) entry.getKey(), ((C5143c) entry.getValue()).mo763a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    /* renamed from: h */
    public final void mo19111h(String str, C5143c cVar) {
        C11669k.m56787e(str, "key");
        C11669k.m56787e(cVar, "provider");
        if (!(this.f26661a.mo18679k(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: i */
    public final void mo19112i(Class<? extends C5141a> cls) {
        C11669k.m56787e(cls, "clazz");
        if (this.f26666f) {
            Recreator.C1463b bVar = this.f26665e;
            if (bVar == null) {
                bVar = new Recreator.C1463b(this);
            }
            this.f26665e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C1463b bVar2 = this.f26665e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    C11669k.m56786d(name, "clazz.name");
                    bVar2.mo5641b(name);
                }
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
