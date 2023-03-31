package p214db;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: db.d */
/* compiled from: SignalsStorage */
public class C9931d {

    /* renamed from: a */
    private final Map<String, C9928b> f39845a = new ConcurrentHashMap();

    /* renamed from: a */
    public Map<String, C9928b> mo32493a() {
        return this.f39845a;
    }

    /* renamed from: b */
    public C9928b mo32494b(String str) {
        return this.f39845a.get(str);
    }

    /* renamed from: c */
    public void mo32495c(String str, C9928b bVar) {
        this.f39845a.put(str, bVar);
    }
}
