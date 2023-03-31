package p264io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.r */
/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class C11019r {
    /* renamed from: b */
    public static C6554i<Object> m54645b() {
        return C10940k.C10954g.f42517d;
    }

    /* renamed from: c */
    public static /* synthetic */ void m54646c(C10940k.C10953f fVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                fVar.mo34646a(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: d */
    public static void m54647d(C6539c cVar, C10940k.C10953f fVar) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.DownloadListenerHostApi.create", m54645b());
        if (fVar != null) {
            aVar.mo22129e(new C11010q(fVar));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
    }
}
