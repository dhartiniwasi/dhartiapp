package p264io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p246h7.C10412f;

@Keep
/* renamed from: io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry */
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    static C9975i<Void> didReinitializeFirebaseCore() {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10761j(jVar));
        return jVar.mo32542a();
    }

    static C9975i<Map<String, Object>> getPluginConstantsForFirebaseApp(C10412f fVar) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10762k(fVar, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(C9977j jVar) {
        try {
            for (Map.Entry<String, FlutterFirebasePlugin> value : registeredPlugins.entrySet()) {
                C9980l.m51027a(((FlutterFirebasePlugin) value.getValue()).didReinitializeFirebaseCore());
            }
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(C10412f fVar, C9977j jVar) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry next : map.entrySet()) {
                hashMap.put((String) next.getKey(), C9980l.m51027a(((FlutterFirebasePlugin) next.getValue()).getPluginConstantsForFirebaseApp(fVar)));
            }
            jVar.mo32544c(hashMap);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
