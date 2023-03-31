package p025c8;

import java.util.HashMap;
import java.util.Map;
import p413z7.C13468e;
import p413z7.C13473j;

/* renamed from: c8.q0 */
/* compiled from: MemoryBundleCache */
class C6817q0 implements C6773a {

    /* renamed from: a */
    private final Map<String, C13468e> f31416a = new HashMap();

    /* renamed from: b */
    private final Map<String, C13473j> f31417b = new HashMap();

    C6817q0() {
    }

    /* renamed from: a */
    public void mo22713a(C13468e eVar) {
        this.f31416a.put(eVar.mo38564a(), eVar);
    }

    /* renamed from: b */
    public C13468e mo22714b(String str) {
        return this.f31416a.get(str);
    }

    /* renamed from: c */
    public void mo22715c(C13473j jVar) {
        this.f31417b.put(jVar.mo38590b(), jVar);
    }

    /* renamed from: d */
    public C13473j mo22716d(String str) {
        return this.f31417b.get(str);
    }
}
