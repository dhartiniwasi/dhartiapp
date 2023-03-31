package p224ec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p224ec.C10085v0;

/* renamed from: ec.x0 */
/* compiled from: GeneratedAndroidFirebaseAuth */
public final /* synthetic */ class C10100x0 {

    /* renamed from: ec.x0$a */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    class C10101a implements C10085v0.C10096i<Map<String, Object>> {

        /* renamed from: a */
        final /* synthetic */ Map f40164a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f40165b;

        C10101a(Map map, C6531a.C6537e eVar) {
            this.f40164a = map;
            this.f40165b = eVar;
        }

        /* renamed from: a */
        public void mo32652a(Throwable th) {
            this.f40164a.put("error", C10085v0.m51375b(th));
            this.f40165b.mo22131a(this.f40164a);
        }

        /* renamed from: b */
        public void success(Map<String, Object> map) {
            this.f40164a.put("result", map);
            this.f40165b.mo22131a(this.f40164a);
        }
    }

    /* renamed from: b */
    public static C6554i<Object> m51412b() {
        return C10085v0.C10088c.f40141d;
    }

    /* renamed from: c */
    public static /* synthetic */ void m51413c(C10085v0.C10087b bVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                C10085v0.C10095h hVar = (C10085v0.C10095h) arrayList.get(1);
                if (hVar != null) {
                    bVar.mo32688a(str, hVar, new C10101a(hashMap, eVar));
                    return;
                }
                throw new NullPointerException("assertionArg unexpectedly null.");
            }
            throw new NullPointerException("resolverIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10085v0.m51375b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: d */
    public static void m51414d(C6539c cVar, C10085v0.C10087b bVar) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.MultiFactoResolverHostApi.resolveSignIn", m51412b());
        if (bVar != null) {
            aVar.mo22129e(new C10098w0(bVar));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
    }
}
