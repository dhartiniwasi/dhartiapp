package p305na;

import java.util.HashMap;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6556k;

/* renamed from: na.a */
/* compiled from: PlacementChannelManager */
public class C11984a {

    /* renamed from: a */
    private final Map<String, C6556k> f44921a = new HashMap();

    /* renamed from: b */
    private final C6539c f44922b;

    public C11984a(C6539c cVar) {
        this.f44922b = cVar;
    }

    /* renamed from: a */
    public void mo36346a(String str, String str2) {
        mo36348c(str, str2, new HashMap());
    }

    /* renamed from: b */
    public void mo36347b(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", str3);
        hashMap.put("errorMessage", str4);
        mo36348c(str, str2, hashMap);
    }

    /* renamed from: c */
    public void mo36348c(String str, String str2, Map<String, String> map) {
        map.put("placementId", str2);
        C6556k kVar = this.f44921a.get(str2);
        if (kVar == null) {
            C6539c cVar = this.f44922b;
            kVar = new C6556k(cVar, "com.rebeloid.unity_ads/videoAd_" + str2);
            this.f44921a.put(str2, kVar);
        }
        kVar.mo22159c(str, map);
    }
}
