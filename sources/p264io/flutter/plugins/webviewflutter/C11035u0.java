package p264io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.u0 */
/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class C11035u0 {
    /* renamed from: c */
    public static C6554i<Object> m54707c() {
        return C10940k.C10975x.f42542d;
    }

    /* renamed from: d */
    public static /* synthetic */ void m54708d(C10940k.C10974w wVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                wVar.mo34752a(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m54709e(C10940k.C10974w wVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                wVar.mo34753b(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: f */
    public static void m54710f(C6539c cVar, C10940k.C10974w wVar) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.WebStorageHostApi.create", m54707c());
        if (wVar != null) {
            aVar.mo22129e(new C11031t0(wVar));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar2 = new C6531a(cVar, "dev.flutter.pigeon.WebStorageHostApi.deleteAllData", m54707c());
        if (wVar != null) {
            aVar2.mo22129e(new C11024s0(wVar));
        } else {
            aVar2.mo22129e((C6531a.C6536d) null);
        }
    }
}
