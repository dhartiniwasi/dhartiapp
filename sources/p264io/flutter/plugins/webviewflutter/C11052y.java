package p264io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.y */
/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class C11052y {
    /* renamed from: b */
    public static C6554i<Object> m54753b() {
        return C10940k.C10961m.f42521d;
    }

    /* renamed from: c */
    public static /* synthetic */ void m54754c(C10940k.C10960l lVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    lVar.mo34713a(Long.valueOf(number.longValue()), str);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("channelNameArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: d */
    public static void m54755d(C6539c cVar, C10940k.C10960l lVar) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.JavaScriptChannelHostApi.create", m54753b());
        if (lVar != null) {
            aVar.mo22129e(new C11048x(lVar));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
    }
}
