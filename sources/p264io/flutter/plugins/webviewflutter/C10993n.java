package p264io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.n */
/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class C10993n {

    /* renamed from: io.flutter.plugins.webviewflutter.n$a */
    /* compiled from: GeneratedAndroidWebView */
    class C10994a implements C10940k.C10962n<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Map f42562a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f42563b;

        C10994a(Map map, C6531a.C6537e eVar) {
            this.f42562a = map;
            this.f42563b = eVar;
        }

        /* renamed from: a */
        public void success(Boolean bool) {
            this.f42562a.put("result", bool);
            this.f42563b.mo22131a(this.f42562a);
        }
    }

    /* renamed from: c */
    public static C6554i<Object> m54579c() {
        return C10940k.C10945c.f42509d;
    }

    /* renamed from: d */
    public static /* synthetic */ void m54580d(C10940k.C10943b bVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            bVar.mo34638b(new C10994a(hashMap, eVar));
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m54581e(C10940k.C10943b bVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                String str2 = (String) arrayList.get(1);
                if (str2 != null) {
                    bVar.mo34637a(str, str2);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("valueArg unexpectedly null.");
            }
            throw new NullPointerException("urlArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: f */
    public static void m54582f(C6539c cVar, C10940k.C10943b bVar) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.CookieManagerHostApi.clearCookies", m54579c());
        if (bVar != null) {
            aVar.mo22129e(new C10983l(bVar));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar2 = new C6531a(cVar, "dev.flutter.pigeon.CookieManagerHostApi.setCookie", m54579c());
        if (bVar != null) {
            aVar2.mo22129e(new C10988m(bVar));
        } else {
            aVar2.mo22129e((C6531a.C6536d) null);
        }
    }
}
