package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1216l;
import androidx.lifecycle.C1220n;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p104o0.C5140c;
import p104o0.C5146e;

/* compiled from: Recreator.kt */
public final class Recreator implements C1216l {

    /* renamed from: b */
    public static final C1462a f4186b = new C1462a((C11665g) null);

    /* renamed from: a */
    private final C5146e f4187a;

    /* renamed from: androidx.savedstate.Recreator$a */
    /* compiled from: Recreator.kt */
    public static final class C1462a {
        private C1462a() {
        }

        public /* synthetic */ C1462a(C11665g gVar) {
            this();
        }
    }

    /* renamed from: androidx.savedstate.Recreator$b */
    /* compiled from: Recreator.kt */
    public static final class C1463b implements C5140c.C5143c {

        /* renamed from: a */
        private final Set<String> f4188a = new LinkedHashSet();

        public C1463b(C5140c cVar) {
            C11669k.m56787e(cVar, "registry");
            cVar.mo19111h("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo763a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f4188a));
            return bundle;
        }

        /* renamed from: b */
        public final void mo5641b(String str) {
            C11669k.m56787e(str, "className");
            this.f4188a.add(str);
        }
    }

    public Recreator(C5146e eVar) {
        C11669k.m56787e(eVar, "owner");
        this.f4187a = eVar;
    }

    /* renamed from: e */
    private final void m6830e(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C5140c.C5141a.class);
            C11669k.m56786d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    C11669k.m56786d(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C5140c.C5141a) newInstance).mo4346a(this.f4187a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    /* renamed from: c */
    public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
        C11669k.m56787e(nVar, "source");
        C11669k.m56787e(bVar, "event");
        if (bVar == C1208j.C1210b.ON_CREATE) {
            nVar.getLifecycle().mo4401c(this);
            Bundle b = this.f4187a.getSavedStateRegistry().mo19106b("androidx.savedstate.Restarter");
            if (b != null) {
                ArrayList<String> stringArrayList = b.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String e : stringArrayList) {
                        m6830e(e);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
