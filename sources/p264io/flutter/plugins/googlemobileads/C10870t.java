package p264io.flutter.plugins.googlemobileads;

import java.util.HashMap;
import java.util.Map;
import p046f4.C4279a;
import p046f4.C4281b;

/* renamed from: io.flutter.plugins.googlemobileads.t */
/* compiled from: FlutterInitializationStatus */
class C10870t {

    /* renamed from: a */
    final Map<String, C10862o> f42397a;

    C10870t(Map<String, C10862o> map) {
        this.f42397a = map;
    }

    C10870t(C4281b bVar) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : bVar.mo8693a().entrySet()) {
            hashMap.put((String) next.getKey(), new C10862o((C4279a) next.getValue()));
        }
        this.f42397a = hashMap;
    }
}
