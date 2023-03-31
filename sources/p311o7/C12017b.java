package p311o7;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import p276k8.C11600b;

/* renamed from: o7.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12017b implements C11600b {

    /* renamed from: a */
    public static final /* synthetic */ C12017b f44985a = new C12017b();

    private /* synthetic */ C12017b() {
    }

    public final Object get() {
        return ExecutorsRegistrar.m43595u(Executors.newCachedThreadPool(ExecutorsRegistrar.m43584j("Firebase Blocking", 11)));
    }
}
