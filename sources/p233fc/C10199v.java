package p233fc;

import android.app.Activity;
import android.content.Context;
import com.google.firebase.firestore.C7898b1;
import com.google.firebase.firestore.C7899c;
import com.google.firebase.firestore.C7901d;
import com.google.firebase.firestore.C7921l;
import com.google.firebase.firestore.C7923m;
import com.google.firebase.firestore.C7929o0;
import com.google.firebase.firestore.C7932p;
import com.google.firebase.firestore.C7940q0;
import com.google.firebase.firestore.C7947s0;
import com.google.firebase.firestore.C7951u0;
import com.google.firebase.firestore.C7957x0;
import com.google.firebase.firestore.FirebaseFirestore;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import p186ac.C6539c;
import p186ac.C6544d;
import p186ac.C6555j;
import p186ac.C6556k;
import p186ac.C6570s;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p242gc.C10313b;
import p242gc.C10316e;
import p242gc.C10317f;
import p242gc.C10319h;
import p242gc.C10321j;
import p242gc.C10326o;
import p246h7.C10412f;
import p251hc.C10503a;
import p251hc.C10504b;
import p264io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import p264io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: fc.v */
/* compiled from: FlutterFirebaseFirestorePlugin */
public class C10199v implements FlutterFirebasePlugin, C6556k.C6560c, C12502a, C12588a {

    /* renamed from: i */
    protected static final HashMap<String, FirebaseFirestore> f40630i = new HashMap<>();

    /* renamed from: r */
    public static final Map<Integer, C7923m.C7924a> f40631r = new HashMap();

    /* renamed from: a */
    final C6570s f40632a = new C6570s(C10178b.f40587d);

    /* renamed from: b */
    private C6539c f40633b;

    /* renamed from: c */
    private C6556k f40634c;

    /* renamed from: d */
    private final AtomicReference<Activity> f40635d = new AtomicReference<>((Object) null);

    /* renamed from: e */
    private final Map<String, C7957x0> f40636e = new HashMap();

    /* renamed from: f */
    private final Map<String, C6544d> f40637f = new HashMap();

    /* renamed from: g */
    private final Map<String, C6544d.C6549d> f40638g = new HashMap();

    /* renamed from: h */
    private final Map<String, C10317f> f40639h = new HashMap();

    /* renamed from: A */
    private C9975i<Void> m51640A(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10184g(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: B */
    private C9975i<C7923m> m51641B(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10193p(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: C */
    private C9975i<Void> m51642C(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10181d(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: D */
    private C9975i<Void> m51643D(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10183f(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: E */
    private C9975i<Void> m51644E(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10182e(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: F */
    protected static FirebaseFirestore m51645F(String str) {
        FirebaseFirestore firebaseFirestore;
        HashMap<String, FirebaseFirestore> hashMap = f40630i;
        synchronized (hashMap) {
            firebaseFirestore = hashMap.get(str);
        }
        return firebaseFirestore;
    }

    /* renamed from: G */
    private C7951u0 m51646G(Map<String, Object> map) {
        Object obj = map.get("source");
        Objects.requireNonNull(obj);
        String str = (String) obj;
        if (str.equals("server")) {
            return C7951u0.SERVER;
        }
        if (!str.equals("cache")) {
            return C7951u0.DEFAULT;
        }
        return C7951u0.CACHE;
    }

    /* renamed from: H */
    private void m51647H(C6539c cVar) {
        this.f40633b = cVar;
        C6556k kVar = new C6556k(cVar, "plugins.flutter.io/firebase_firestore", this.f40632a);
        this.f40634c = kVar;
        kVar.mo22161e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_firestore", this);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static /* synthetic */ void m51648I(Map map, C9977j jVar) {
        try {
            Object obj = map.get("query");
            Objects.requireNonNull(obj);
            HashMap hashMap = new HashMap();
            hashMap.put("count", Long.valueOf(((C7899c) C9980l.m51027a(((C7929o0) obj).mo26420i().mo26314b(C7901d.SERVER))).mo26322a()));
            jVar.mo32544c(hashMap);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static /* synthetic */ void m51649J(Map map, C9977j jVar) {
        try {
            Object obj = map.get("writes");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("firestore");
            Objects.requireNonNull(obj2);
            FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj2;
            C7898b1 j = firebaseFirestore.mo26297j();
            for (Map map2 : (List) obj) {
                Object obj3 = map2.get("type");
                Objects.requireNonNull(obj3);
                String str = (String) obj3;
                Object obj4 = map2.get("path");
                Objects.requireNonNull(obj4);
                Map map3 = (Map) map2.get(JsonStorageKeyNames.DATA_KEY);
                C7921l o = firebaseFirestore.mo26302o((String) obj4);
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -1785516855) {
                    if (hashCode != 81986) {
                        if (hashCode == 2012838315) {
                            if (str.equals("DELETE")) {
                                c = 0;
                            }
                        }
                    } else if (str.equals("SET")) {
                        c = 2;
                    }
                } else if (str.equals("UPDATE")) {
                    c = 1;
                }
                if (c == 0) {
                    j = j.mo26318b(o);
                } else if (c == 1) {
                    Objects.requireNonNull(map3);
                    j = j.mo26321f(o, map3);
                } else if (c == 2) {
                    Object obj5 = map2.get("options");
                    Objects.requireNonNull(obj5);
                    Map map4 = (Map) obj5;
                    if (map4.get("merge") != null && ((Boolean) map4.get("merge")).booleanValue()) {
                        Objects.requireNonNull(map3);
                        j = j.mo26320d(o, map3, C7947s0.m43874c());
                    } else if (map4.get("mergeFields") != null) {
                        Object obj6 = map4.get("mergeFields");
                        Objects.requireNonNull(obj6);
                        Objects.requireNonNull(map3);
                        j = j.mo26320d(o, map3, C7947s0.m43875d((List) obj6));
                    } else {
                        Objects.requireNonNull(map3);
                        j = j.mo26319c(o, map3);
                    }
                }
            }
            C9980l.m51027a(j.mo26317a());
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ void m51650K(Map map, C9977j jVar) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            jVar.mo32544c((Void) C9980l.m51027a(((FirebaseFirestore) obj).mo26298k()));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m51651L(C9977j jVar) {
        try {
            for (C10412f next : C10412f.m52581n((Context) null)) {
                C9980l.m51027a(FirebaseFirestore.m43649u(next).mo26292M());
                m51702x(next.mo33470q());
            }
            m51677f0();
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static /* synthetic */ void m51652M(Map map, C9977j jVar) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            C9980l.m51027a(((FirebaseFirestore) obj).mo26301n());
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static /* synthetic */ void m51653N(Map map, C9977j jVar) {
        try {
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            jVar.mo32544c((Void) C9980l.m51027a(((C7921l) obj).mo26386h()));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m51654O(Map map, C9977j jVar) {
        try {
            C7951u0 G = m51646G(map);
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            C7923m mVar = (C7923m) C9980l.m51027a(((C7921l) obj).mo26388j(G));
            m51679g0(map, mVar.hashCode());
            jVar.mo32544c(mVar);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static /* synthetic */ void m51655P(Map map, C9977j jVar) {
        C9975i iVar;
        try {
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            C7921l lVar = (C7921l) obj;
            Object obj2 = map.get(JsonStorageKeyNames.DATA_KEY);
            Objects.requireNonNull(obj2);
            Map map2 = (Map) obj2;
            Object obj3 = map.get("options");
            Objects.requireNonNull(obj3);
            Map map3 = (Map) obj3;
            if (map3.get("merge") != null && ((Boolean) map3.get("merge")).booleanValue()) {
                iVar = lVar.mo26393t(map2, C7947s0.m43874c());
            } else if (map3.get("mergeFields") != null) {
                Object obj4 = map3.get("mergeFields");
                Objects.requireNonNull(obj4);
                iVar = lVar.mo26393t(map2, C7947s0.m43875d((List) obj4));
            } else {
                iVar = lVar.mo26392s(map2);
            }
            jVar.mo32544c((Void) C9980l.m51027a(iVar));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static /* synthetic */ void m51656Q(Map map, C9977j jVar) {
        try {
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            C7921l lVar = (C7921l) obj;
            Object obj2 = map.get(JsonStorageKeyNames.DATA_KEY);
            Objects.requireNonNull(obj2);
            Map map2 = (Map) obj2;
            C7932p pVar = (C7932p) map2.keySet().iterator().next();
            Object obj3 = map2.get(pVar);
            ArrayList arrayList = new ArrayList();
            for (C7932p pVar2 : map2.keySet()) {
                if (!pVar2.equals(pVar)) {
                    arrayList.add(pVar2);
                    arrayList.add(map2.get(pVar2));
                }
            }
            jVar.mo32544c((Void) C9980l.m51027a(lVar.mo26394v(pVar, obj3, arrayList.toArray())));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static /* synthetic */ void m51657R(Map map, C9977j jVar) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            C9980l.m51027a(((FirebaseFirestore) obj).mo26303p());
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static /* synthetic */ void m51658S(C9977j jVar) {
        try {
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m51659T(Map map, C9977j jVar) {
        try {
            C7951u0 G = m51646G(map);
            Object obj = map.get(MediationMetaData.KEY_NAME);
            Objects.requireNonNull(obj);
            Object obj2 = map.get("firestore");
            Objects.requireNonNull(obj2);
            C7929o0 o0Var = (C7929o0) C9980l.m51027a(((FirebaseFirestore) obj2).mo26307w((String) obj));
            if (o0Var == null) {
                jVar.mo32543b(new NullPointerException("Named query has not been found. Please check it has been loaded properly via loadBundle()."));
                return;
            }
            C7940q0 q0Var = (C7940q0) C9980l.m51027a(o0Var.mo26423m(G));
            m51679g0(map, q0Var.hashCode());
            jVar.mo32544c(q0Var);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m51660U(String str, C7957x0 x0Var) {
        this.f40636e.put(str, x0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static /* synthetic */ void m51661V(C6556k.C6561d dVar, C9975i iVar) {
        if (iVar.mo26362q()) {
            dVar.success(iVar.mo26358m());
            return;
        }
        Exception l = iVar.mo26357l();
        dVar.error("firebase_firestore", l != null ? l.getMessage() : null, C10503a.m52898a(l));
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m51662W(Map map, C9977j jVar) {
        try {
            C7951u0 G = m51646G(map);
            C7929o0 o0Var = (C7929o0) map.get("query");
            if (o0Var == null) {
                jVar.mo32543b(new IllegalArgumentException("An error occurred while parsing query arguments, see native logs for more information. Please report this issue."));
                return;
            }
            C7940q0 q0Var = (C7940q0) C9980l.m51027a(o0Var.mo26423m(G));
            m51679g0(map, q0Var.hashCode());
            jVar.mo32544c(q0Var);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static /* synthetic */ void m51663X(Map map, C9977j jVar) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("indexConfiguration");
            Objects.requireNonNull(obj2);
            C9980l.m51027a(((FirebaseFirestore) obj).mo26291L((String) obj2));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static /* synthetic */ void m51664Y(Map map, C9977j jVar) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
            C9980l.m51027a(firebaseFirestore.mo26292M());
            m51702x(firebaseFirestore.mo26304r().mo33470q());
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m51665Z(Map map, C9977j jVar) {
        try {
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            C7921l lVar = (C7921l) obj;
            Object obj2 = map.get("transactionId");
            Objects.requireNonNull(obj2);
            String str = (String) obj2;
            C7957x0 x0Var = this.f40636e.get(str);
            if (x0Var == null) {
                jVar.mo32543b(new Exception("Transaction.getDocument(): No transaction handler exists for ID: " + str));
                return;
            }
            jVar.mo32544c(x0Var.mo26464c(lVar));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public static /* synthetic */ void m51667a0(Map map, C9977j jVar) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            jVar.mo32544c((Void) C9980l.m51027a(((FirebaseFirestore) obj).mo26294O()));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: b0 */
    private C9975i<C7940q0> m51669b0(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10196s(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: c0 */
    private C9975i<C7940q0> m51671c0(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10194q(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: d0 */
    private String m51673d0(String str, C6544d.C6549d dVar) {
        return m51675e0(str, UUID.randomUUID().toString().toLowerCase(Locale.US), dVar);
    }

    /* renamed from: e0 */
    private String m51675e0(String str, String str2, C6544d.C6549d dVar) {
        C6544d dVar2 = new C6544d(this.f40633b, str + "/" + str2, this.f40632a);
        dVar2.mo22141d(dVar);
        this.f40637f.put(str2, dVar2);
        this.f40638g.put(str2, dVar);
        return str2;
    }

    /* renamed from: f0 */
    private void m51677f0() {
        for (String str : this.f40637f.keySet()) {
            this.f40637f.get(str).mo22141d((C6544d.C6549d) null);
        }
        this.f40637f.clear();
        for (String str2 : this.f40638g.keySet()) {
            this.f40638g.get(str2).mo22146i((Object) null);
        }
        this.f40638g.clear();
        this.f40639h.clear();
    }

    /* renamed from: g0 */
    private void m51679g0(Map<String, Object> map, int i) {
        f40631r.put(Integer.valueOf(i), C10504b.m52899a((String) map.get("serverTimestampBehavior")));
    }

    /* renamed from: h0 */
    protected static void m51681h0(FirebaseFirestore firebaseFirestore, String str) {
        HashMap<String, FirebaseFirestore> hashMap = f40630i;
        synchronized (hashMap) {
            if (hashMap.get(str) == null) {
                hashMap.put(str, firebaseFirestore);
            }
        }
    }

    /* renamed from: i0 */
    private C9975i<Void> m51683i0(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10197t(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: j0 */
    private C9975i<Void> m51685j0(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10186i(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: k0 */
    private C9975i<C7923m> m51687k0(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10195r(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: l0 */
    private void m51689l0(Map<String, Object> map) {
        Object obj = map.get("transactionId");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("result");
        Objects.requireNonNull(obj2);
        this.f40639h.get((String) obj).mo33163a((Map) obj2);
    }

    /* renamed from: m0 */
    private C9975i<Void> m51691m0(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10188k(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: t */
    private C9975i<Map<String, Object>> m51698t(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10187j(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: u */
    private void m51699u(C12590c cVar) {
        this.f40635d.set(cVar.getActivity());
    }

    /* renamed from: v */
    private C9975i<Void> m51700v(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10198u(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: w */
    private C9975i<Void> m51701w(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10189l(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: x */
    private static void m51702x(String str) {
        HashMap<String, FirebaseFirestore> hashMap = f40630i;
        synchronized (hashMap) {
            if (hashMap.get(str) != null) {
                hashMap.remove(str);
            }
        }
    }

    /* renamed from: y */
    private void m51703y() {
        this.f40635d.set((Object) null);
    }

    /* renamed from: z */
    private C9975i<Void> m51704z(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10185h(map, jVar));
        return jVar.mo32542a();
    }

    public C9975i<Void> didReinitializeFirebaseCore() {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10192o(this, jVar));
        return jVar.mo32542a();
    }

    public C9975i<Map<String, Object>> getPluginConstantsForFirebaseApp(C10412f fVar) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10191n(jVar));
        return jVar.mo32542a();
    }

    public void onAttachedToActivity(C12590c cVar) {
        m51699u(cVar);
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m51647H(bVar.mo37293b());
    }

    public void onDetachedFromActivity() {
        m51703y();
    }

    public void onDetachedFromActivityForConfigChanges() {
        m51703y();
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        this.f40634c.mo22161e((C6556k.C6560c) null);
        this.f40634c = null;
        m51677f0();
        this.f40633b = null;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C9975i iVar;
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2105138801:
                if (str.equals("Firestore#namedQueryGet")) {
                    c = 0;
                    break;
                }
                break;
            case -1414526391:
                if (str.equals("SnapshotsInSync#setup")) {
                    c = 1;
                    break;
                }
                break;
            case -1345933986:
                if (str.equals("Firestore#disableNetwork")) {
                    c = 2;
                    break;
                }
                break;
            case -1269951812:
                if (str.equals("DocumentReference#snapshots")) {
                    c = 3;
                    break;
                }
                break;
            case -1237005313:
                if (str.equals("WriteBatch#commit")) {
                    c = 4;
                    break;
                }
                break;
            case -1205229031:
                if (str.equals("Transaction#storeResult")) {
                    c = 5;
                    break;
                }
                break;
            case -787001759:
                if (str.equals("Transaction#create")) {
                    c = 6;
                    break;
                }
                break;
            case -780009068:
                if (str.equals("LoadBundle#snapshots")) {
                    c = 7;
                    break;
                }
                break;
            case -658486978:
                if (str.equals("DocumentReference#delete")) {
                    c = 8;
                    break;
                }
                break;
            case -231135191:
                if (str.equals("Firestore#terminate")) {
                    c = 9;
                    break;
                }
                break;
            case -161874852:
                if (str.equals("DocumentReference#update")) {
                    c = 10;
                    break;
                }
                break;
            case 33139875:
                if (str.equals("DocumentReference#get")) {
                    c = 11;
                    break;
                }
                break;
            case 33151407:
                if (str.equals("DocumentReference#set")) {
                    c = 12;
                    break;
                }
                break;
            case 68800788:
                if (str.equals("Query#snapshots")) {
                    c = 13;
                    break;
                }
                break;
            case 195628283:
                if (str.equals("Query#get")) {
                    c = 14;
                    break;
                }
                break;
            case 264528913:
                if (str.equals("Transaction#get")) {
                    c = 15;
                    break;
                }
                break;
            case 406828874:
                if (str.equals("Firestore#clearPersistence")) {
                    c = 16;
                    break;
                }
                break;
            case 515912559:
                if (str.equals("Firestore#waitForPendingWrites")) {
                    c = 17;
                    break;
                }
                break;
            case 783577717:
                if (str.equals("AggregateQuery#count")) {
                    c = 18;
                    break;
                }
                break;
            case 915784462:
                if (str.equals("Firestore#setIndexConfiguration")) {
                    c = 19;
                    break;
                }
                break;
            case 1562339571:
                if (str.equals("Firestore#enableNetwork")) {
                    c = 20;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                iVar = m51669b0((Map) jVar.mo22157b());
                break;
            case 1:
                dVar.success(m51673d0("plugins.flutter.io/firebase_firestore/snapshotsInSync", new C10321j()));
                return;
            case 2:
                iVar = m51704z((Map) jVar.mo22157b());
                break;
            case 3:
                dVar.success(m51673d0("plugins.flutter.io/firebase_firestore/document", new C10313b()));
                return;
            case 4:
                iVar = m51700v((Map) jVar.mo22157b());
                break;
            case 5:
                m51689l0((Map) jVar.mo22157b());
                dVar.success((Object) null);
                return;
            case 6:
                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                C10326o oVar = new C10326o(new C10190m(this, lowerCase));
                m51675e0("plugins.flutter.io/firebase_firestore/transaction", lowerCase, oVar);
                this.f40639h.put(lowerCase, oVar);
                dVar.success(lowerCase);
                return;
            case 7:
                dVar.success(m51673d0("plugins.flutter.io/firebase_firestore/loadBundle", new C10316e()));
                return;
            case 8:
                iVar = m51640A((Map) jVar.mo22157b());
                break;
            case 9:
                iVar = m51685j0((Map) jVar.mo22157b());
                break;
            case 10:
                iVar = m51643D((Map) jVar.mo22157b());
                break;
            case 11:
                iVar = m51641B((Map) jVar.mo22157b());
                break;
            case 12:
                iVar = m51642C((Map) jVar.mo22157b());
                break;
            case 13:
                dVar.success(m51673d0("plugins.flutter.io/firebase_firestore/query", new C10319h()));
                return;
            case 14:
                iVar = m51671c0((Map) jVar.mo22157b());
                break;
            case 15:
                iVar = m51687k0((Map) jVar.mo22157b());
                break;
            case 16:
                iVar = m51701w((Map) jVar.mo22157b());
                break;
            case 17:
                iVar = m51691m0((Map) jVar.mo22157b());
                break;
            case 18:
                iVar = m51698t((Map) jVar.mo22157b());
                break;
            case 19:
                iVar = m51683i0((Map) jVar.mo22157b());
                break;
            case 20:
                iVar = m51644E((Map) jVar.mo22157b());
                break;
            default:
                dVar.notImplemented();
                return;
        }
        iVar.mo26347b(new C10180c(dVar));
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        m51699u(cVar);
    }
}
