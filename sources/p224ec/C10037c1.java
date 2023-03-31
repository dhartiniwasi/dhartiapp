package p224ec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p224ec.C10085v0;

/* renamed from: ec.c1 */
/* compiled from: GeneratedAndroidFirebaseAuth */
public final /* synthetic */ class C10037c1 {

    /* renamed from: ec.c1$a */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    class C10038a implements C10085v0.C10096i<Void> {

        /* renamed from: a */
        final /* synthetic */ Map f40014a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f40015b;

        C10038a(Map map, C6531a.C6537e eVar) {
            this.f40014a = map;
            this.f40015b = eVar;
        }

        /* renamed from: a */
        public void mo32652a(Throwable th) {
            this.f40014a.put("error", C10085v0.m51375b(th));
            this.f40015b.mo22131a(this.f40014a);
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f40014a.put("result", (Object) null);
            this.f40015b.mo22131a(this.f40014a);
        }
    }

    /* renamed from: ec.c1$b */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    class C10039b implements C10085v0.C10096i<C10085v0.C10093g> {

        /* renamed from: a */
        final /* synthetic */ Map f40016a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f40017b;

        C10039b(Map map, C6531a.C6537e eVar) {
            this.f40016a = map;
            this.f40017b = eVar;
        }

        /* renamed from: a */
        public void mo32652a(Throwable th) {
            this.f40016a.put("error", C10085v0.m51375b(th));
            this.f40017b.mo22131a(this.f40016a);
        }

        /* renamed from: b */
        public void success(C10085v0.C10093g gVar) {
            this.f40016a.put("result", gVar);
            this.f40017b.mo22131a(this.f40016a);
        }
    }

    /* renamed from: ec.c1$c */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    class C10040c implements C10085v0.C10096i<Void> {

        /* renamed from: a */
        final /* synthetic */ Map f40018a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f40019b;

        C10040c(Map map, C6531a.C6537e eVar) {
            this.f40018a = map;
            this.f40019b = eVar;
        }

        /* renamed from: a */
        public void mo32652a(Throwable th) {
            this.f40018a.put("error", C10085v0.m51375b(th));
            this.f40019b.mo22131a(this.f40018a);
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f40018a.put("result", (Object) null);
            this.f40019b.mo22131a(this.f40018a);
        }
    }

    /* renamed from: ec.c1$d */
    /* compiled from: GeneratedAndroidFirebaseAuth */
    class C10041d implements C10085v0.C10096i<List<C10085v0.C10091f>> {

        /* renamed from: a */
        final /* synthetic */ Map f40020a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f40021b;

        C10041d(Map map, C6531a.C6537e eVar) {
            this.f40020a = map;
            this.f40021b = eVar;
        }

        /* renamed from: a */
        public void mo32652a(Throwable th) {
            this.f40020a.put("error", C10085v0.m51375b(th));
            this.f40021b.mo22131a(this.f40020a);
        }

        /* renamed from: b */
        public void success(List<C10085v0.C10091f> list) {
            this.f40020a.put("result", list);
            this.f40021b.mo22131a(this.f40020a);
        }
    }

    /* renamed from: e */
    public static C6554i<Object> m51188e() {
        return C10085v0.C10090e.f40142d;
    }

    /* renamed from: f */
    public static /* synthetic */ void m51189f(C10085v0.C10089d dVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                C10085v0.C10095h hVar = (C10085v0.C10095h) arrayList.get(1);
                if (hVar != null) {
                    dVar.mo32689b(str, hVar, (String) arrayList.get(2), new C10038a(hashMap, eVar));
                    return;
                }
                throw new NullPointerException("assertionArg unexpectedly null.");
            }
            throw new NullPointerException("appNameArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10085v0.m51375b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m51190g(C10085v0.C10089d dVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str != null) {
                dVar.mo32692e(str, new C10039b(hashMap, eVar));
                return;
            }
            throw new NullPointerException("appNameArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10085v0.m51375b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m51191h(C10085v0.C10089d dVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                dVar.mo32691d(str, (String) arrayList.get(1), new C10040c(hashMap, eVar));
                return;
            }
            throw new NullPointerException("appNameArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10085v0.m51375b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m51192i(C10085v0.C10089d dVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str != null) {
                dVar.mo32690c(str, new C10041d(hashMap, eVar));
                return;
            }
            throw new NullPointerException("appNameArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10085v0.m51375b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: j */
    public static void m51193j(C6539c cVar, C10085v0.C10089d dVar) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.MultiFactorUserHostApi.enrollPhone", m51188e());
        if (dVar != null) {
            aVar.mo22129e(new C10034b1(dVar));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar2 = new C6531a(cVar, "dev.flutter.pigeon.MultiFactorUserHostApi.getSession", m51188e());
        if (dVar != null) {
            aVar2.mo22129e(new C10105z0(dVar));
        } else {
            aVar2.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar3 = new C6531a(cVar, "dev.flutter.pigeon.MultiFactorUserHostApi.unenroll", m51188e());
        if (dVar != null) {
            aVar3.mo22129e(new C10031a1(dVar));
        } else {
            aVar3.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar4 = new C6531a(cVar, "dev.flutter.pigeon.MultiFactorUserHostApi.getEnrolledFactors", m51188e());
        if (dVar != null) {
            aVar4.mo22129e(new C10103y0(dVar));
        } else {
            aVar4.mo22129e((C6531a.C6536d) null);
        }
    }
}
