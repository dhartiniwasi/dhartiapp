package p264io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.d1 */
/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class C10901d1 {
    /* renamed from: b */
    public static C6554i<Object> m54312b() {
        return C10940k.C10944b0.f42508d;
    }

    /* renamed from: c */
    public static /* synthetic */ void m54313c(C10940k.C10942a0 a0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    a0Var.mo34675b(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("shouldOverrideUrlLoadingArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: d */
    public static void m54314d(C6539c cVar, C10940k.C10942a0 a0Var) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.WebViewClientHostApi.create", m54312b());
        if (a0Var != null) {
            aVar.mo22129e(new C10896c1(a0Var));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
    }
}
