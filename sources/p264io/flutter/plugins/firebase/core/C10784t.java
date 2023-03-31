package p264io.flutter.plugins.firebase.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p264io.flutter.plugins.firebase.core.C10763l;

/* renamed from: io.flutter.plugins.firebase.core.t */
/* compiled from: GeneratedAndroidFirebaseCore */
public final /* synthetic */ class C10784t {

    /* renamed from: io.flutter.plugins.firebase.core.t$a */
    /* compiled from: GeneratedAndroidFirebaseCore */
    class C10785a implements C10763l.C10773h<C10763l.C10771g> {

        /* renamed from: a */
        final /* synthetic */ Map f42180a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f42181b;

        C10785a(Map map, C6531a.C6537e eVar) {
            this.f42180a = map;
            this.f42181b = eVar;
        }

        /* renamed from: a */
        public void mo34388a(Throwable th) {
            this.f42180a.put("error", C10763l.m53846b(th));
            this.f42181b.mo22131a(this.f42180a);
        }

        /* renamed from: b */
        public void success(C10763l.C10771g gVar) {
            this.f42180a.put("result", gVar);
            this.f42181b.mo22131a(this.f42180a);
        }
    }

    /* renamed from: io.flutter.plugins.firebase.core.t$b */
    /* compiled from: GeneratedAndroidFirebaseCore */
    class C10786b implements C10763l.C10773h<List<C10763l.C10771g>> {

        /* renamed from: a */
        final /* synthetic */ Map f42182a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f42183b;

        C10786b(Map map, C6531a.C6537e eVar) {
            this.f42182a = map;
            this.f42183b = eVar;
        }

        /* renamed from: a */
        public void mo34388a(Throwable th) {
            this.f42182a.put("error", C10763l.m53846b(th));
            this.f42183b.mo22131a(this.f42182a);
        }

        /* renamed from: b */
        public void success(List<C10763l.C10771g> list) {
            this.f42182a.put("result", list);
            this.f42183b.mo22131a(this.f42182a);
        }
    }

    /* renamed from: io.flutter.plugins.firebase.core.t$c */
    /* compiled from: GeneratedAndroidFirebaseCore */
    class C10787c implements C10763l.C10773h<C10763l.C10769f> {

        /* renamed from: a */
        final /* synthetic */ Map f42184a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f42185b;

        C10787c(Map map, C6531a.C6537e eVar) {
            this.f42184a = map;
            this.f42185b = eVar;
        }

        /* renamed from: a */
        public void mo34388a(Throwable th) {
            this.f42184a.put("error", C10763l.m53846b(th));
            this.f42185b.mo22131a(this.f42184a);
        }

        /* renamed from: b */
        public void success(C10763l.C10769f fVar) {
            this.f42184a.put("result", fVar);
            this.f42185b.mo22131a(this.f42184a);
        }
    }

    /* renamed from: d */
    public static C6554i<Object> m53921d() {
        return C10763l.C10768e.f42131d;
    }

    /* renamed from: e */
    public static /* synthetic */ void m53922e(C10763l.C10767d dVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                C10763l.C10769f fVar = (C10763l.C10769f) arrayList.get(1);
                if (fVar != null) {
                    dVar.mo34340a(str, fVar, new C10785a(hashMap, eVar));
                    return;
                }
                throw new NullPointerException("initializeAppRequestArg unexpectedly null.");
            }
            throw new NullPointerException("appNameArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10763l.m53846b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m53923f(C10763l.C10767d dVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            dVar.mo34341b(new C10786b(hashMap, eVar));
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10763l.m53846b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m53924g(C10763l.C10767d dVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            dVar.mo34342c(new C10787c(hashMap, eVar));
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10763l.m53846b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: h */
    public static void m53925h(C6539c cVar, C10763l.C10767d dVar) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", m53921d());
        if (dVar != null) {
            aVar.mo22129e(new C10783s(dVar));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar2 = new C6531a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", m53921d());
        if (dVar != null) {
            aVar2.mo22129e(new C10781q(dVar));
        } else {
            aVar2.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar3 = new C6531a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", m53921d());
        if (dVar != null) {
            aVar3.mo22129e(new C10782r(dVar));
        } else {
            aVar3.mo22129e((C6531a.C6536d) null);
        }
    }
}
