package p280kc;

import java.util.ArrayList;
import java.util.HashMap;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p280kc.C11621h;

/* renamed from: kc.g */
/* compiled from: Messages */
public final /* synthetic */ class C11620g {
    /* renamed from: g */
    public static C6554i<Object> m56675g() {
        return C11621h.C11623b.f44170d;
    }

    /* renamed from: h */
    public static /* synthetic */ void m56676h(C11621h.C11622a aVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.mo35786d());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C11621h.m56684b(e));
        }
        eVar.mo22131a(hashMap);
    }

    /* renamed from: i */
    public static /* synthetic */ void m56677i(C11621h.C11622a aVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.mo35788f());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C11621h.m56684b(e));
        }
        eVar.mo22131a(hashMap);
    }

    /* renamed from: j */
    public static /* synthetic */ void m56678j(C11621h.C11622a aVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.mo35787e());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C11621h.m56684b(e));
        }
        eVar.mo22131a(hashMap);
    }

    /* renamed from: k */
    public static /* synthetic */ void m56679k(C11621h.C11622a aVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.mo35785c());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C11621h.m56684b(e));
        }
        eVar.mo22131a(hashMap);
    }

    /* renamed from: l */
    public static /* synthetic */ void m56680l(C11621h.C11622a aVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.mo35783a());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C11621h.m56684b(e));
        }
        eVar.mo22131a(hashMap);
    }

    /* renamed from: m */
    public static /* synthetic */ void m56681m(C11621h.C11622a aVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            C11621h.C11624c cVar = arrayList.get(0) == null ? null : C11621h.C11624c.values()[((Integer) arrayList.get(0)).intValue()];
            if (cVar != null) {
                hashMap.put("result", aVar.mo35784b(cVar));
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("directoryArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C11621h.m56684b(e));
        }
    }

    /* renamed from: n */
    public static void m56682n(C6539c cVar, C11621h.C11622a aVar) {
        C6531a aVar2 = new C6531a(cVar, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", m56675g(), cVar.mo22135b());
        if (aVar != null) {
            aVar2.mo22129e(new C11616c(aVar));
        } else {
            aVar2.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar3 = new C6531a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", m56675g(), cVar.mo22135b());
        if (aVar != null) {
            aVar3.mo22129e(new C11619f(aVar));
        } else {
            aVar3.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar4 = new C6531a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", m56675g(), cVar.mo22135b());
        if (aVar != null) {
            aVar4.mo22129e(new C11617d(aVar));
        } else {
            aVar4.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar5 = new C6531a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", m56675g(), cVar.mo22135b());
        if (aVar != null) {
            aVar5.mo22129e(new C11614a(aVar));
        } else {
            aVar5.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar6 = new C6531a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", m56675g(), cVar.mo22135b());
        if (aVar != null) {
            aVar6.mo22129e(new C11618e(aVar));
        } else {
            aVar6.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar7 = new C6531a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", m56675g(), cVar.mo22135b());
        if (aVar != null) {
            aVar7.mo22129e(new C11615b(aVar));
        } else {
            aVar7.mo22129e((C6531a.C6536d) null);
        }
    }
}
