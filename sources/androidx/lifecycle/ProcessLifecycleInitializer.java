package androidx.lifecycle;

import android.content.Context;
import androidx.startup.C1464a;
import java.util.Collections;
import java.util.List;
import p125r0.C5428a;

public final class ProcessLifecycleInitializer implements C5428a<C1220n> {
    /* renamed from: a */
    public List<Class<? extends C5428a<?>>> mo3604a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public C1220n mo3605b(Context context) {
        if (C1464a.m6835e(context).mo5652g(ProcessLifecycleInitializer.class)) {
            C1213k.m5430a(context);
            C1231w.m5466i(context);
            return C1231w.m5465h();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
