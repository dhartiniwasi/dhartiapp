package p311o7;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import p276k8.C11600b;

/* renamed from: o7.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12018c implements C11600b {

    /* renamed from: a */
    public static final /* synthetic */ C12018c f44986a = new C12018c();

    private /* synthetic */ C12018c() {
    }

    public final Object get() {
        return ExecutorsRegistrar.m43595u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.m43585k("Firebase Lite", 0, ExecutorsRegistrar.m43594t())));
    }
}
