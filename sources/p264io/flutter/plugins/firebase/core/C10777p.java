package p264io.flutter.plugins.firebase.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p264io.flutter.plugins.firebase.core.C10763l;

/* renamed from: io.flutter.plugins.firebase.core.p */
/* compiled from: GeneratedAndroidFirebaseCore */
public final /* synthetic */ class C10777p {

    /* renamed from: io.flutter.plugins.firebase.core.p$a */
    /* compiled from: GeneratedAndroidFirebaseCore */
    class C10778a implements C10763l.C10773h<Void> {

        /* renamed from: a */
        final /* synthetic */ Map f42171a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f42172b;

        C10778a(Map map, C6531a.C6537e eVar) {
            this.f42171a = map;
            this.f42172b = eVar;
        }

        /* renamed from: a */
        public void mo34388a(Throwable th) {
            this.f42171a.put("error", C10763l.m53846b(th));
            this.f42172b.mo22131a(this.f42171a);
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f42171a.put("result", (Object) null);
            this.f42172b.mo22131a(this.f42171a);
        }
    }

    /* renamed from: io.flutter.plugins.firebase.core.p$b */
    /* compiled from: GeneratedAndroidFirebaseCore */
    class C10779b implements C10763l.C10773h<Void> {

        /* renamed from: a */
        final /* synthetic */ Map f42173a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f42174b;

        C10779b(Map map, C6531a.C6537e eVar) {
            this.f42173a = map;
            this.f42174b = eVar;
        }

        /* renamed from: a */
        public void mo34388a(Throwable th) {
            this.f42173a.put("error", C10763l.m53846b(th));
            this.f42174b.mo22131a(this.f42173a);
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f42173a.put("result", (Object) null);
            this.f42174b.mo22131a(this.f42173a);
        }
    }

    /* renamed from: io.flutter.plugins.firebase.core.p$c */
    /* compiled from: GeneratedAndroidFirebaseCore */
    class C10780c implements C10763l.C10773h<Void> {

        /* renamed from: a */
        final /* synthetic */ Map f42175a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f42176b;

        C10780c(Map map, C6531a.C6537e eVar) {
            this.f42175a = map;
            this.f42176b = eVar;
        }

        /* renamed from: a */
        public void mo34388a(Throwable th) {
            this.f42175a.put("error", C10763l.m53846b(th));
            this.f42176b.mo22131a(this.f42175a);
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f42175a.put("result", (Object) null);
            this.f42176b.mo22131a(this.f42175a);
        }
    }

    /* renamed from: d */
    public static C6554i<Object> m53904d() {
        return C10763l.C10766c.f42130d;
    }

    /* renamed from: e */
    public static /* synthetic */ void m53905e(C10763l.C10765b bVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    bVar.mo34345f(str, bool, new C10778a(hashMap, eVar));
                    return;
                }
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            throw new NullPointerException("appNameArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10763l.m53846b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m53906f(C10763l.C10765b bVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    bVar.mo34343d(str, bool, new C10779b(hashMap, eVar));
                    return;
                }
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            throw new NullPointerException("appNameArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10763l.m53846b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m53907g(C10763l.C10765b bVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str != null) {
                bVar.mo34344e(str, new C10780c(hashMap, eVar));
                return;
            }
            throw new NullPointerException("appNameArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10763l.m53846b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: h */
    public static void m53908h(C6539c cVar, C10763l.C10765b bVar) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", m53904d());
        if (bVar != null) {
            aVar.mo22129e(new C10774m(bVar));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar2 = new C6531a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", m53904d());
        if (bVar != null) {
            aVar2.mo22129e(new C10775n(bVar));
        } else {
            aVar2.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar3 = new C6531a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", m53904d());
        if (bVar != null) {
            aVar3.mo22129e(new C10776o(bVar));
        } else {
            aVar3.mo22129e((C6531a.C6536d) null);
        }
    }
}
