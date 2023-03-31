package p264io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.c0 */
/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class C10895c0 {
    /* renamed from: b */
    public static C6554i<Object> m54301b() {
        return C10940k.C10967r.f42524d;
    }

    /* renamed from: c */
    public static /* synthetic */ void m54302c(C10940k.C10966q qVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    qVar.mo34717b(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("webViewClientInstanceIdArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: d */
    public static void m54303d(C6539c cVar, C10940k.C10966q qVar) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.WebChromeClientHostApi.create", m54301b());
        if (qVar != null) {
            aVar.mo22129e(new C10889b0(qVar));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
    }
}
