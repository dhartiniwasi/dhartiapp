package p264io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p218e6.C9975i;
import p246h7.C10412f;

@Keep
/* renamed from: io.flutter.plugins.firebase.core.FlutterFirebasePlugin */
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    C9975i<Void> didReinitializeFirebaseCore();

    C9975i<Map<String, Object>> getPluginConstantsForFirebaseApp(C10412f fVar);
}
