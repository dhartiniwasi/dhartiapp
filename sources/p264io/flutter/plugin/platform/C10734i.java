package p264io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.flutter.plugin.platform.i */
/* compiled from: PlatformViewRegistryImpl */
class C10734i implements C10733h {

    /* renamed from: a */
    private final Map<String, C10732g> f42034a = new HashMap();

    C10734i() {
    }

    /* renamed from: a */
    public boolean mo34259a(String str, C10732g gVar) {
        if (this.f42034a.containsKey(str)) {
            return false;
        }
        this.f42034a.put(str, gVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10732g mo34260b(String str) {
        return this.f42034a.get(str);
    }
}
