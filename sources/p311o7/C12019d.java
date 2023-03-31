package p311o7;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import p276k8.C11600b;

/* renamed from: o7.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12019d implements C11600b {

    /* renamed from: a */
    public static final /* synthetic */ C12019d f44987a = new C12019d();

    private /* synthetic */ C12019d() {
    }

    public final Object get() {
        return ExecutorsRegistrar.m43595u(Executors.newFixedThreadPool(4, ExecutorsRegistrar.m43585k("Firebase Background", 10, ExecutorsRegistrar.m43583i())));
    }
}
