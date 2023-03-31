package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.C0823a;
import java.util.concurrent.Executor;

/* compiled from: WindowBackend.kt */
public interface WindowBackend {
    void registerLayoutChangeCallback(Activity activity, Executor executor, C0823a<WindowLayoutInfo> aVar);

    void unregisterLayoutChangeCallback(C0823a<WindowLayoutInfo> aVar);
}
