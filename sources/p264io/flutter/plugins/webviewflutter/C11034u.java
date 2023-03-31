package p264io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.u */
/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class C11034u {
    /* renamed from: c */
    public static C6554i<Object> m54701c() {
        return C10940k.C10956i.f42518d;
    }

    /* renamed from: d */
    public static /* synthetic */ void m54702d(C10940k.C10955h hVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str != null) {
                hashMap.put("result", hVar.mo34666b(str));
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("pathArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m54703e(C10940k.C10955h hVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str != null) {
                hashMap.put("result", hVar.mo34665a(str));
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("nameArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: f */
    public static void m54704f(C6539c cVar, C10940k.C10955h hVar) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.FlutterAssetManagerHostApi.list", m54701c());
        if (hVar != null) {
            aVar.mo22129e(new C11030t(hVar));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar2 = new C6531a(cVar, "dev.flutter.pigeon.FlutterAssetManagerHostApi.getAssetFilePathByName", m54701c());
        if (hVar != null) {
            aVar2.mo22129e(new C11023s(hVar));
        } else {
            aVar2.mo22129e((C6531a.C6536d) null);
        }
    }
}
