package p250hb;

import java.util.ArrayList;
import java.util.HashMap;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p250hb.C10492a;

/* renamed from: hb.d */
/* compiled from: Messages */
public final /* synthetic */ class C10499d {
    /* renamed from: c */
    public static C6554i<Object> m52889c() {
        return C10492a.C10496d.f41544d;
    }

    /* renamed from: d */
    public static /* synthetic */ void m52890d(C10492a.C10495c cVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            C10492a.C10494b bVar = (C10492a.C10494b) ((ArrayList) obj).get(0);
            if (bVar != null) {
                cVar.mo33632a(bVar);
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("msgArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10492a.m52875b(e));
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m52891e(C10492a.C10495c cVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", cVar.isEnabled());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10492a.m52875b(e));
        }
        eVar.mo22131a(hashMap);
    }

    /* renamed from: f */
    public static void m52892f(C6539c cVar, C10492a.C10495c cVar2) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.WakelockApi.toggle", m52889c());
        if (cVar2 != null) {
            aVar.mo22129e(new C10498c(cVar2));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar2 = new C6531a(cVar, "dev.flutter.pigeon.WakelockApi.isEnabled", m52889c());
        if (cVar2 != null) {
            aVar2.mo22129e(new C10497b(cVar2));
        } else {
            aVar2.mo22129e((C6531a.C6536d) null);
        }
    }
}
