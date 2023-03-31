package p241gb;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gb.d */
/* compiled from: SignalsStorage */
public class C10311d {

    /* renamed from: a */
    private final Map<String, C10308b> f40920a = new ConcurrentHashMap();

    /* renamed from: a */
    public Map<String, C10308b> mo33160a() {
        return this.f40920a;
    }

    /* renamed from: b */
    public C10308b mo33161b(String str) {
        return this.f40920a.get(str);
    }

    /* renamed from: c */
    public void mo33162c(String str, C10308b bVar) {
        this.f40920a.put(str, bVar);
    }
}
