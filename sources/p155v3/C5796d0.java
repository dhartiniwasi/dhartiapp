package p155v3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: v3.d0 */
/* compiled from: HttpDataSource */
public final class C5796d0 {

    /* renamed from: a */
    private final Map<String, String> f28793a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f28794b;

    /* renamed from: a */
    public synchronized void mo20314a(Map<String, String> map) {
        this.f28794b = null;
        this.f28793a.clear();
        this.f28793a.putAll(map);
    }

    /* renamed from: b */
    public synchronized Map<String, String> mo20315b() {
        if (this.f28794b == null) {
            this.f28794b = Collections.unmodifiableMap(new HashMap(this.f28793a));
        }
        return this.f28794b;
    }
}
