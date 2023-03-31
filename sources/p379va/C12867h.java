package p379va;

import java.util.HashMap;
import java.util.Map;
import p359ta.C12561b0;

/* renamed from: va.h */
/* compiled from: SqlErrorInfo */
public class C12867h {
    /* renamed from: a */
    public static Map<String, Object> m60857a(C12864e eVar) {
        C12561b0 b = eVar.mo37869b();
        if (b == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", b.mo37386c());
        hashMap.put("arguments", b.mo37385b());
        return hashMap;
    }
}
