package p185ab;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ab.d */
/* compiled from: SignalsStorage */
public class C6530d {

    /* renamed from: a */
    private final Map<String, C6527b> f30974a = new ConcurrentHashMap();

    /* renamed from: a */
    public Map<String, C6527b> mo22124a() {
        return this.f30974a;
    }

    /* renamed from: b */
    public C6527b mo22125b(String str) {
        return this.f30974a.get(str);
    }

    /* renamed from: c */
    public void mo22126c(String str, C6527b bVar) {
        this.f30974a.put(str, bVar);
    }
}
