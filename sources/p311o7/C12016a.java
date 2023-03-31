package p311o7;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import p276k8.C11600b;

/* renamed from: o7.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12016a implements C11600b {

    /* renamed from: a */
    public static final /* synthetic */ C12016a f44984a = new C12016a();

    private /* synthetic */ C12016a() {
    }

    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.m43584j("Firebase Scheduler", 0));
    }
}
