package p264io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.flutter.embedding.engine.b */
/* compiled from: FlutterEngineCache */
public class C10688b {

    /* renamed from: b */
    private static C10688b f41897b;

    /* renamed from: a */
    private final Map<String, C10685a> f41898a = new HashMap();

    C10688b() {
    }

    /* renamed from: b */
    public static C10688b m53506b() {
        if (f41897b == null) {
            f41897b = new C10688b();
        }
        return f41897b;
    }

    /* renamed from: a */
    public C10685a mo34088a(String str) {
        return this.f41898a.get(str);
    }

    /* renamed from: c */
    public void mo34089c(String str, C10685a aVar) {
        if (aVar != null) {
            this.f41898a.put(str, aVar);
        } else {
            this.f41898a.remove(str);
        }
    }

    /* renamed from: d */
    public void mo34090d(String str) {
        mo34089c(str, (C10685a) null);
    }
}
