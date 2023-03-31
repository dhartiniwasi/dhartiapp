package p379va;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6556k;

/* renamed from: va.c */
/* compiled from: BatchOperation */
public class C12860c extends C12858a {

    /* renamed from: a */
    final Map<String, Object> f46968a;

    /* renamed from: b */
    final C12861a f46969b = new C12861a();

    /* renamed from: c */
    final boolean f46970c;

    /* renamed from: va.c$a */
    /* compiled from: BatchOperation */
    public class C12861a implements C12865f {

        /* renamed from: a */
        Object f46971a;

        /* renamed from: b */
        String f46972b;

        /* renamed from: c */
        String f46973c;

        /* renamed from: d */
        Object f46974d;

        public C12861a() {
        }

        public void error(String str, String str2, Object obj) {
            this.f46972b = str;
            this.f46973c = str2;
            this.f46974d = obj;
        }

        public void success(Object obj) {
            this.f46971a = obj;
        }
    }

    public C12860c(Map<String, Object> map, boolean z) {
        this.f46968a = map;
        this.f46970c = z;
    }

    /* renamed from: a */
    public <T> T mo37876a(String str) {
        return this.f46968a.get(str);
    }

    /* renamed from: c */
    public boolean mo37870c() {
        return this.f46970c;
    }

    /* renamed from: f */
    public String mo37877f() {
        return (String) this.f46968a.get("method");
    }

    /* renamed from: g */
    public boolean mo37878g(String str) {
        return this.f46968a.containsKey(str);
    }

    /* renamed from: m */
    public C12865f mo37867m() {
        return this.f46969b;
    }

    /* renamed from: n */
    public Map<String, Object> mo37879n() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f46969b.f46972b);
        hashMap2.put("message", this.f46969b.f46973c);
        hashMap2.put(JsonStorageKeyNames.DATA_KEY, this.f46969b.f46974d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    /* renamed from: o */
    public Map<String, Object> mo37880o() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f46969b.f46971a);
        return hashMap;
    }

    /* renamed from: p */
    public void mo37881p(C6556k.C6561d dVar) {
        C12861a aVar = this.f46969b;
        dVar.error(aVar.f46972b, aVar.f46973c, aVar.f46974d);
    }

    /* renamed from: q */
    public void mo37882q(List<Map<String, Object>> list) {
        if (!mo37870c()) {
            list.add(mo37879n());
        }
    }

    /* renamed from: r */
    public void mo37883r(List<Map<String, Object>> list) {
        if (!mo37870c()) {
            list.add(mo37880o());
        }
    }
}
