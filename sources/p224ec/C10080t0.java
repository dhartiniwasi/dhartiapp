package p224ec;

import android.app.Activity;
import android.net.Uri;
import com.google.firebase.auth.C7777a;
import com.google.firebase.auth.C7781b;
import com.google.firebase.auth.C7782b0;
import com.google.firebase.auth.C7789d;
import com.google.firebase.auth.C7790d0;
import com.google.firebase.auth.C7793e;
import com.google.firebase.auth.C7799f0;
import com.google.firebase.auth.C7802g;
import com.google.firebase.auth.C7803g0;
import com.google.firebase.auth.C7806h;
import com.google.firebase.auth.C7810i;
import com.google.firebase.auth.C7811i0;
import com.google.firebase.auth.C7815j0;
import com.google.firebase.auth.C7818k;
import com.google.firebase.auth.C7819k0;
import com.google.firebase.auth.C7822l0;
import com.google.firebase.auth.C7824m;
import com.google.firebase.auth.C7825m0;
import com.google.firebase.auth.C7830n0;
import com.google.firebase.auth.C7837p0;
import com.google.firebase.auth.C7841q;
import com.google.firebase.auth.C7845r0;
import com.google.firebase.auth.C7848s0;
import com.google.firebase.auth.C7850t;
import com.google.firebase.auth.C7854u0;
import com.google.firebase.auth.C7860w0;
import com.google.firebase.auth.C7863x0;
import com.google.firebase.auth.C7866y0;
import com.google.firebase.auth.C7869z;
import com.google.firebase.auth.FirebaseAuth;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import p186ac.C6539c;
import p186ac.C6544d;
import p186ac.C6555j;
import p186ac.C6556k;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p224ec.C10085v0;
import p246h7.C10409c;
import p246h7.C10412f;
import p246h7.C10422m;
import p246h7.C10426o;
import p264io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import p264io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import p339r8.C12258a;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: ec.t0 */
/* compiled from: FlutterFirebaseAuthPlugin */
public class C10080t0 implements FlutterFirebasePlugin, C6556k.C6560c, C12502a, C12588a, C10085v0.C10089d, C10085v0.C10087b {

    /* renamed from: h */
    static final HashMap<Integer, C7806h> f40122h = new HashMap<>();

    /* renamed from: a */
    private C6539c f40123a;

    /* renamed from: b */
    private C6556k f40124b;

    /* renamed from: c */
    private Activity f40125c;

    /* renamed from: d */
    private final Map<C6544d, C6544d.C6549d> f40126d = new HashMap();

    /* renamed from: e */
    private final Map<String, Map<String, C7803g0>> f40127e = new HashMap();

    /* renamed from: f */
    private final Map<String, C7819k0> f40128f = new HashMap();

    /* renamed from: g */
    private final Map<String, C7815j0> f40129g = new HashMap();

    /* renamed from: ec.t0$a */
    /* compiled from: FlutterFirebaseAuthPlugin */
    class C10081a extends HashMap<String, Object> {

        /* renamed from: a */
        final /* synthetic */ FirebaseAuth f40130a;

        C10081a(FirebaseAuth firebaseAuth) {
            this.f40130a = firebaseAuth;
            put("languageCode", firebaseAuth.mo26033o());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void m51221A0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            C7806h g0 = m51304g0(map);
            if (i0 == null) {
                jVar.mo32543b(C10083u0.m51371f());
            } else if (g0 == null) {
                jVar.mo32543b(C10083u0.m51369d());
            } else {
                jVar.mo32544c(m51317k1((C7810i) C9980l.m51027a(i0.mo26231Q1(g0))));
            }
        } catch (Exception e) {
            if (e.getCause() instanceof C7850t) {
                m51319l0(map, jVar, e);
            } else {
                jVar.mo32543b(e);
            }
        }
    }

    /* renamed from: A1 */
    private C9975i<Void> m51222A1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10049f0(map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public /* synthetic */ void m51224B0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            Object obj = map.get("signInProvider");
            Objects.requireNonNull(obj);
            List list = (List) map.get("scopes");
            Map map2 = (Map) map.get("customParameters");
            C7825m0.C7826a d = C7825m0.m43432d((String) obj);
            if (list != null) {
                d.mo26140c(list);
            }
            if (map2 != null) {
                d.mo26138a(map2);
            }
            jVar.mo32544c(m51317k1((C7810i) C9980l.m51027a(i0.mo26236V1(this.f40125c, d.mo26139b()))));
        } catch (Exception e) {
            if (e.getCause() instanceof C7850t) {
                m51319l0(map, jVar, e);
            } else {
                jVar.mo32543b(e);
            }
        }
    }

    /* renamed from: B1 */
    private C9975i<Map<String, Object>> m51225B1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10059j(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public /* synthetic */ void m51227C0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            C10032b bVar = new C10032b(f0);
            String str = "plugins.flutter.io/firebase_auth/auth-state/" + f0.mo26030l().mo33470q();
            C6544d dVar = new C6544d(this.f40123a, str);
            dVar.mo22141d(bVar);
            this.f40126d.put(dVar, bVar);
            jVar.mo32544c(str);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: C1 */
    private C9975i<Map<String, Object>> m51228C1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10065m(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public /* synthetic */ void m51230D0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            C10047e1 e1Var = new C10047e1(f0);
            String str = "plugins.flutter.io/firebase_auth/id-token/" + f0.mo26030l().mo33470q();
            C6544d dVar = new C6544d(this.f40123a, str);
            dVar.mo22141d(e1Var);
            this.f40126d.put(dVar, e1Var);
            jVar.mo32544c(str);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: D1 */
    private C9975i<Map<String, Object>> m51231D1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10043d0(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public /* synthetic */ void m51233E0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            if (i0 == null) {
                jVar.mo32543b(C10083u0.m51371f());
                return;
            }
            C9980l.m51027a(i0.mo26232R1());
            jVar.mo32544c(m51320l1(m51310i0(map)));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: E1 */
    private C9975i<Map<String, Object>> m51234E1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10084v(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public /* synthetic */ void m51236F0(C10085v0.C10096i iVar, C9975i iVar2) {
        if (iVar2.mo26362q()) {
            iVar.success(m51317k1((C7810i) iVar2.mo26358m()));
        } else {
            iVar.mo32652a(iVar2.mo26357l());
        }
    }

    /* renamed from: F1 */
    private C9975i<Map<String, Object>> m51237F1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10079t(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public /* synthetic */ void m51239G0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            if (i0 == null) {
                jVar.mo32543b(C10083u0.m51371f());
                return;
            }
            Object obj = map.get("actionCodeSettings");
            if (obj == null) {
                C9980l.m51027a(i0.mo26233S1());
                jVar.mo32544c(null);
                return;
            }
            C9980l.m51027a(i0.mo26234T1(m51294c0((Map) obj)));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: G1 */
    private C9975i<Map<String, Object>> m51240G1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10082u(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public /* synthetic */ void m51242H0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            Object obj2 = map.get("actionCodeSettings");
            if (obj2 == null) {
                C9980l.m51027a(f0.mo26039s(str));
                jVar.mo32544c(null);
                return;
            }
            C9980l.m51027a(f0.mo26040t(str, m51294c0((Map) obj2)));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: H1 */
    private C9975i<Void> m51243H1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10064l0(map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public /* synthetic */ void m51245I0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("actionCodeSettings");
            Objects.requireNonNull(obj2);
            C9980l.m51027a(f0.mo26041u((String) obj, m51294c0((Map) obj2)));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: I1 */
    private C9975i<Map<String, Object>> m51246I1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10030a0(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public /* synthetic */ void m51248J0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            String str = (String) map.get("languageCode");
            if (str == null) {
                f0.mo25994E();
            } else {
                f0.mo26042v(str);
            }
            jVar.mo32544c(new C10081a(f0));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: J1 */
    private C9975i<Map<String, Object>> m51249J1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10045e(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public static /* synthetic */ void m51251K0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Boolean bool = (Boolean) map.get("appVerificationDisabledForTesting");
            Boolean bool2 = (Boolean) map.get("forceRecaptchaFlow");
            String str = (String) map.get("phoneNumber");
            String str2 = (String) map.get("smsCode");
            if (bool != null) {
                f0.mo26032n().mo26195b(bool.booleanValue());
            }
            if (bool2 != null) {
                f0.mo26032n().mo26194a(bool2.booleanValue());
            }
            if (!(str == null || str2 == null)) {
                f0.mo26032n().mo26196c(str, str2);
            }
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: K1 */
    private C9975i<Map<String, Object>> m51252K1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10073q(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public /* synthetic */ void m51254L0(Map map, C9977j jVar) {
        try {
            jVar.mo32544c(m51317k1((C7810i) C9980l.m51027a(m51301f0(map).mo26044x())));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: L1 */
    private C9975i<Map<String, Object>> m51255L1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10077s(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public /* synthetic */ void m51257M0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            C7806h g0 = m51304g0(map);
            if (g0 != null) {
                jVar.mo32544c(m51317k1((C7810i) C9980l.m51027a(f0.mo26045y(g0))));
                return;
            }
            throw C10083u0.m51369d();
        } catch (Exception e) {
            if (e.getCause() instanceof C7850t) {
                m51319l0(map, jVar, e);
            } else {
                jVar.mo32543b(e);
            }
        }
    }

    /* renamed from: M1 */
    private C9975i<Map<String, Object>> m51258M1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10036c0(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public /* synthetic */ void m51260N0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Object obj = map.get("token");
            Objects.requireNonNull(obj);
            jVar.mo32544c(m51317k1((C7810i) C9980l.m51027a(f0.mo26046z((String) obj))));
        } catch (Exception e) {
            if (e.getCause() instanceof C7850t) {
                m51319l0(map, jVar, e);
            } else {
                jVar.mo32543b(e);
            }
        }
    }

    /* renamed from: N1 */
    private C9975i<Map<String, Object>> m51261N1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10053g(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public /* synthetic */ void m51263O0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            Object obj2 = map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD);
            Objects.requireNonNull(obj2);
            jVar.mo32544c(m51317k1((C7810i) C9980l.m51027a(f0.mo25990A((String) obj, (String) obj2))));
        } catch (Exception e) {
            if (e.getCause() instanceof C7850t) {
                m51319l0(map, jVar, e);
            } else {
                jVar.mo32543b(e);
            }
        }
    }

    /* renamed from: O1 */
    private C9975i<Void> m51264O1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10054g0(map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public /* synthetic */ void m51266P0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("emailLink");
            Objects.requireNonNull(obj2);
            jVar.mo32544c(m51317k1((C7810i) C9980l.m51027a(f0.mo25991B((String) obj, (String) obj2))));
        } catch (Exception e) {
            if (e.getCause() instanceof C7850t) {
                m51319l0(map, jVar, e);
            } else {
                jVar.mo32543b(e);
            }
        }
    }

    /* renamed from: P1 */
    private C9975i<Void> m51267P1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10057i(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public /* synthetic */ void m51269Q0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Object obj = map.get("signInProvider");
            Objects.requireNonNull(obj);
            List list = (List) map.get("scopes");
            Map map2 = (Map) map.get("customParameters");
            C7825m0.C7826a d = C7825m0.m43432d((String) obj);
            if (list != null) {
                d.mo26140c(list);
            }
            if (map2 != null) {
                d.mo26138a(map2);
            }
            jVar.mo32544c(m51317k1((C7810i) C9980l.m51027a(f0.mo25993D(this.f40125c, d.mo26139b()))));
        } catch (Exception e) {
            if (e.getCause() instanceof C7850t) {
                m51319l0(map, jVar, e);
            } else {
                jVar.mo32543b(e);
            }
        }
    }

    /* renamed from: Q1 */
    private C9975i<Map<String, Object>> m51270Q1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10062k0(map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public static /* synthetic */ void m51272R0(Map map, C9977j jVar) {
        try {
            m51301f0(map).mo25992C();
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: R1 */
    private C9975i<String> m51273R1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10048f(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public /* synthetic */ void m51275S0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            Object obj = map.get("signInProvider");
            Objects.requireNonNull(obj);
            List list = (List) map.get("scopes");
            Map map2 = (Map) map.get("customParameters");
            C7825m0.C7826a d = C7825m0.m43432d((String) obj);
            if (list != null) {
                d.mo26140c(list);
            }
            if (map2 != null) {
                d.mo26138a(map2);
            }
            jVar.mo32544c(m51317k1((C7810i) C9980l.m51027a(i0.mo26235U1(this.f40125c, d.mo26139b()))));
        } catch (Exception e) {
            if (e.getCause() instanceof C7850t) {
                m51319l0(map, jVar, e);
            } else {
                jVar.mo32543b(e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public static /* synthetic */ void m51277T0(C10085v0.C10096i iVar, C9975i iVar2) {
        if (iVar2.mo26362q()) {
            iVar.success(null);
        } else {
            iVar.mo32652a(iVar2.mo26357l());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public /* synthetic */ void m51279U0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            if (i0 == null) {
                jVar.mo32543b(C10083u0.m51371f());
                return;
            }
            Object obj = map.get("providerId");
            Objects.requireNonNull(obj);
            jVar.mo32544c(m51317k1((C7810i) C9980l.m51027a(i0.mo26237W1((String) obj))));
        } catch (ExecutionException unused) {
            jVar.mo32543b(C10083u0.m51370e());
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ void m51281V0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            if (i0 == null) {
                jVar.mo32543b(C10083u0.m51371f());
                return;
            }
            Object obj = map.get("newEmail");
            Objects.requireNonNull(obj);
            C9980l.m51027a(i0.mo26238X1((String) obj));
            C9980l.m51027a(i0.mo26232R1());
            jVar.mo32544c(m51320l1(i0));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: W */
    private C9975i<Void> m51282W(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10058i0(map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ void m51283W0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            if (i0 == null) {
                jVar.mo32543b(C10083u0.m51371f());
                return;
            }
            Object obj = map.get("newPassword");
            Objects.requireNonNull(obj);
            C9980l.m51027a(i0.mo26239Y1((String) obj));
            C9980l.m51027a(i0.mo26232R1());
            jVar.mo32544c(m51320l1(i0));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: X */
    private C9975i<Map<String, Object>> m51284X(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10063l(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public /* synthetic */ void m51285X0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            if (i0 == null) {
                jVar.mo32543b(C10083u0.m51371f());
                return;
            }
            C7830n0 n0Var = (C7830n0) m51304g0(map);
            if (n0Var == null) {
                jVar.mo32543b(C10083u0.m51369d());
                return;
            }
            C9980l.m51027a(i0.mo26240Z1(n0Var));
            C9980l.m51027a(i0.mo26232R1());
            jVar.mo32544c(m51320l1(i0));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: Y */
    private C9975i<Void> m51286Y(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10066m0(map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public /* synthetic */ void m51287Y0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            if (i0 == null) {
                jVar.mo32543b(C10083u0.m51371f());
                return;
            }
            Object obj = map.get("profile");
            Objects.requireNonNull(obj);
            Map map2 = (Map) obj;
            C7866y0.C7867a aVar = new C7866y0.C7867a();
            if (map2.containsKey("displayName")) {
                aVar.mo26221b((String) map2.get("displayName"));
            }
            if (map2.containsKey("photoURL")) {
                String str = (String) map2.get("photoURL");
                if (str != null) {
                    aVar.mo26222c(Uri.parse(str));
                } else {
                    aVar.mo26222c((Uri) null);
                }
            }
            C9980l.m51027a(i0.mo26241a2(aVar.mo26220a()));
            C9980l.m51027a(i0.mo26232R1());
            jVar.mo32544c(m51320l1(i0));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: Z */
    private C9975i<Map<String, Object>> m51288Z(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10099x(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z0 */
    public static /* synthetic */ void m51289Z0(Map map, C9977j jVar) {
        try {
            m51301f0(map).mo25995F((String) map.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), ((Integer) map.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT)).intValue());
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: a0 */
    private C9975i<Void> m51290a0(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10033b0(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public /* synthetic */ void m51291a1(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            if (i0 == null) {
                jVar.mo32543b(C10083u0.m51371f());
            }
            Object obj = map.get("newEmail");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            Object obj2 = map.get("actionCodeSettings");
            if (obj2 == null) {
                C9980l.m51027a(i0.mo26242b2(str));
                jVar.mo32544c(null);
                return;
            }
            C9980l.m51027a(i0.mo26243c2(str, m51294c0((Map) obj2)));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: b0 */
    private C9975i<Map<String, Object>> m51292b0(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10056h0(map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public static /* synthetic */ void m51293b1(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Object obj = map.get("code");
            Objects.requireNonNull(obj);
            HashMap hashMap = new HashMap();
            hashMap.put("email", C9980l.m51027a(f0.mo25996G((String) obj)));
            jVar.mo32544c(hashMap);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: c0 */
    private C7793e m51294c0(Map<String, Object> map) {
        C7793e.C7794a O1 = C7793e.m43334O1();
        Object obj = map.get("url");
        Objects.requireNonNull(obj);
        O1.mo26089f((String) obj);
        if (map.get("dynamicLinkDomain") != null) {
            Object obj2 = map.get("dynamicLinkDomain");
            Objects.requireNonNull(obj2);
            O1.mo26086c((String) obj2);
        }
        if (map.get("handleCodeInApp") != null) {
            Object obj3 = map.get("handleCodeInApp");
            Objects.requireNonNull(obj3);
            O1.mo26087d(((Boolean) obj3).booleanValue());
        }
        if (map.get(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID) != null) {
            Object obj4 = map.get(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            Objects.requireNonNull(obj4);
            Map map2 = (Map) obj4;
            boolean z = false;
            if (map2.get("installApp") != null) {
                Object obj5 = map2.get("installApp");
                Objects.requireNonNull(obj5);
                z = ((Boolean) obj5).booleanValue();
            }
            String str = null;
            if (map2.get("minimumVersion") != null) {
                str = (String) map2.get("minimumVersion");
            }
            Object obj6 = map2.get("packageName");
            Objects.requireNonNull(obj6);
            O1.mo26085b((String) obj6, z, str);
        }
        if (map.get("iOS") != null) {
            Object obj7 = map.get("iOS");
            Objects.requireNonNull(obj7);
            Object obj8 = ((Map) obj7).get("bundleId");
            Objects.requireNonNull(obj8);
            O1.mo26088e((String) obj8);
        }
        return O1.mo26084a();
    }

    /* renamed from: d0 */
    private Activity m51296d0() {
        return this.f40125c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.google.firebase.auth.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.google.firebase.auth.s0} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m51297d1(java.util.Map r10, p218e6.C9977j r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009e }
            r0.<init>()     // Catch:{ Exception -> 0x009e }
            java.lang.String r1 = "plugins.flutter.io/firebase_auth/phone/"
            r0.append(r1)     // Catch:{ Exception -> 0x009e }
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x009e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x009e }
            r0.append(r1)     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x009e }
            ac.d r1 = new ac.d     // Catch:{ Exception -> 0x009e }
            ac.c r2 = r9.f40123a     // Catch:{ Exception -> 0x009e }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x009e }
            java.lang.String r2 = "multiFactorSessionId"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x009e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x009e }
            r3 = 0
            if (r2 == 0) goto L_0x0035
            java.util.Map<java.lang.String, com.google.firebase.auth.k0> r4 = r9.f40128f     // Catch:{ Exception -> 0x009e }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ Exception -> 0x009e }
            com.google.firebase.auth.k0 r2 = (com.google.firebase.auth.C7819k0) r2     // Catch:{ Exception -> 0x009e }
            r5 = r2
            goto L_0x0036
        L_0x0035:
            r5 = r3
        L_0x0036:
            java.lang.String r2 = "multiFactorInfo"
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x009e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x009e }
            if (r2 == 0) goto L_0x0084
            java.util.Map<java.lang.String, com.google.firebase.auth.j0> r4 = r9.f40129g     // Catch:{ Exception -> 0x009e }
            java.util.Set r4 = r4.keySet()     // Catch:{ Exception -> 0x009e }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x009e }
        L_0x004a:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x009e }
            if (r6 == 0) goto L_0x0084
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x009e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x009e }
            java.util.Map<java.lang.String, com.google.firebase.auth.j0> r7 = r9.f40129g     // Catch:{ Exception -> 0x009e }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ Exception -> 0x009e }
            com.google.firebase.auth.j0 r6 = (com.google.firebase.auth.C7815j0) r6     // Catch:{ Exception -> 0x009e }
            java.util.List r6 = r6.mo26124I1()     // Catch:{ Exception -> 0x009e }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x009e }
        L_0x0066:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x009e }
            if (r7 == 0) goto L_0x004a
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x009e }
            com.google.firebase.auth.i0 r7 = (com.google.firebase.auth.C7811i0) r7     // Catch:{ Exception -> 0x009e }
            java.lang.String r8 = r7.mo26111b()     // Catch:{ Exception -> 0x009e }
            boolean r8 = r8.equals(r2)     // Catch:{ Exception -> 0x009e }
            if (r8 == 0) goto L_0x0066
            boolean r8 = r7 instanceof com.google.firebase.auth.C7848s0     // Catch:{ Exception -> 0x009e }
            if (r8 == 0) goto L_0x0066
            r3 = r7
            com.google.firebase.auth.s0 r3 = (com.google.firebase.auth.C7848s0) r3     // Catch:{ Exception -> 0x009e }
            goto L_0x004a
        L_0x0084:
            r6 = r3
            ec.f1 r8 = new ec.f1     // Catch:{ Exception -> 0x009e }
            android.app.Activity r3 = r9.m51296d0()     // Catch:{ Exception -> 0x009e }
            ec.o0 r7 = p224ec.C10070o0.f40095a     // Catch:{ Exception -> 0x009e }
            r2 = r8
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x009e }
            r1.mo22141d(r8)     // Catch:{ Exception -> 0x009e }
            java.util.Map<ac.d, ac.d$d> r10 = r9.f40126d     // Catch:{ Exception -> 0x009e }
            r10.put(r1, r8)     // Catch:{ Exception -> 0x009e }
            r11.mo32544c(r0)     // Catch:{ Exception -> 0x009e }
            goto L_0x00a2
        L_0x009e:
            r10 = move-exception
            r11.mo32543b(r10)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p224ec.C10080t0.m51297d1(java.util.Map, e6.j):void");
    }

    /* renamed from: e0 */
    private C7803g0 m51298e0(String str) throws C12258a {
        C7869z h0 = m51307h0(str);
        if (h0 != null) {
            if (this.f40127e.get(str) == null) {
                this.f40127e.put(str, new HashMap());
            }
            Map map = this.f40127e.get(str);
            if (map.get(h0.mo26209b()) == null) {
                map.put(h0.mo26209b(), h0.mo26226L1());
            }
            return (C7803g0) map.get(h0.mo26209b());
        }
        throw new C12258a("No user is signed in");
    }

    /* renamed from: e1 */
    private C9975i<Map<String, Object>> m51299e1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10071p(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: f0 */
    static FirebaseAuth m51301f0(Map<String, Object> map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        FirebaseAuth instance = FirebaseAuth.getInstance(C10412f.m52583p((String) obj));
        String str = (String) map.get("tenantId");
        if (str != null) {
            instance.mo26043w(str);
        }
        return instance;
    }

    /* renamed from: f1 */
    private List<Map<String, Object>> m51302f1(List<C7811i0> list) {
        ArrayList arrayList = new ArrayList();
        for (C10085v0.C10091f g : m51305g1(list)) {
            arrayList.add(g.mo32703g());
        }
        return arrayList;
    }

    /* renamed from: g0 */
    private C7806h m51304g0(Map<String, Object> map) throws C10083u0 {
        Object obj = map.get(URLCredentialContract.FeedEntry.TABLE_NAME);
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        if (map2.get("token") != null) {
            C7806h hVar = f40122h.get(Integer.valueOf(((Integer) map2.get("token")).intValue()));
            if (hVar != null) {
                return hVar;
            }
            throw C10083u0.m51369d();
        }
        Object obj2 = map2.get("signInMethod");
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        String str2 = (String) map2.get("secret");
        String str3 = (String) map2.get("idToken");
        String str4 = (String) map2.get("accessToken");
        String str5 = (String) map2.get("rawNonce");
        char c = 65535;
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals("twitter.com")) {
                    c = 0;
                    break;
                }
                break;
            case -1536293812:
                if (str.equals("google.com")) {
                    c = 1;
                    break;
                }
                break;
            case -364826023:
                if (str.equals("facebook.com")) {
                    c = 2;
                    break;
                }
                break;
            case 105516695:
                if (str.equals("oauth")) {
                    c = 3;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c = 4;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD)) {
                    c = 5;
                    break;
                }
                break;
            case 1985010934:
                if (str.equals("github.com")) {
                    c = 6;
                    break;
                }
                break;
            case 2120171958:
                if (str.equals("emailLink")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Objects.requireNonNull(str4);
                Objects.requireNonNull(str2);
                return C7860w0.m43521a(str4, str2);
            case 1:
                return C7799f0.m43372a(str3, str4);
            case 2:
                Objects.requireNonNull(str4);
                return C7824m.m43431a(str4);
            case 3:
                Object obj3 = map2.get("providerId");
                Objects.requireNonNull(obj3);
                C7825m0.C7827b f = C7825m0.m43434f((String) obj3);
                Objects.requireNonNull(str4);
                f.mo26142b(str4);
                if (str5 == null) {
                    Objects.requireNonNull(str3);
                    f.mo26143c(str3);
                } else {
                    Objects.requireNonNull(str3);
                    f.mo26144d(str3, str5);
                }
                return f.mo26141a();
            case 4:
                Object obj4 = map2.get("verificationId");
                Objects.requireNonNull(obj4);
                Object obj5 = map2.get("smsCode");
                Objects.requireNonNull(obj5);
                return C7837p0.m43479a((String) obj4, (String) obj5);
            case 5:
                Object obj6 = map2.get("email");
                Objects.requireNonNull(obj6);
                Objects.requireNonNull(str2);
                return C7818k.m43424a((String) obj6, str2);
            case 6:
                Objects.requireNonNull(str4);
                return C7790d0.m43332a(str4);
            case 7:
                Object obj7 = map2.get("email");
                Objects.requireNonNull(obj7);
                Object obj8 = map2.get("emailLink");
                Objects.requireNonNull(obj8);
                return C7818k.m43425b((String) obj7, (String) obj8);
            default:
                return null;
        }
    }

    /* renamed from: g1 */
    private List<C10085v0.C10091f> m51305g1(List<C7811i0> list) {
        ArrayList arrayList = new ArrayList();
        for (C7811i0 next : list) {
            if (next instanceof C7848s0) {
                arrayList.add(new C10085v0.C10091f.C10092a().mo32708e(((C7848s0) next).mo26185Y()).mo32705b(next.mo26112u0()).mo32706c(Double.valueOf((double) next.mo26108I1())).mo32709f(next.mo26111b()).mo32707d(next.mo26109J1()).mo32704a());
            } else {
                arrayList.add(new C10085v0.C10091f.C10092a().mo32705b(next.mo26112u0()).mo32706c(Double.valueOf((double) next.mo26108I1())).mo32709f(next.mo26111b()).mo32707d(next.mo26109J1()).mo32704a());
            }
        }
        return arrayList;
    }

    /* renamed from: h0 */
    private C7869z m51307h0(String str) {
        return FirebaseAuth.getInstance(C10412f.m52583p(str)).mo26031m();
    }

    /* renamed from: h1 */
    private Map<String, Object> m51308h1(C7789d dVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int a = dVar.mo26068a();
        if (a == 0) {
            hashMap.put("operation", 1);
        } else if (a == 1) {
            hashMap.put("operation", 2);
        } else if (a == 2) {
            hashMap.put("operation", 3);
        } else if (a == 4) {
            hashMap.put("operation", 4);
        } else if (a == 5) {
            hashMap.put("operation", 5);
        } else if (a != 6) {
            hashMap.put("operation", 0);
        } else {
            hashMap.put("operation", 6);
        }
        C7781b b = dVar.mo26069b();
        if ((b != null && a == 1) || a == 0) {
            hashMap2.put("email", b.mo26049a());
            hashMap2.put("previousEmail", (Object) null);
        } else if (a == 6) {
            hashMap2.put("email", (Object) null);
            hashMap2.put("previousEmail", (Object) null);
        } else if (a == 2 || a == 5) {
            Objects.requireNonNull(b);
            C7777a aVar = (C7777a) b;
            hashMap2.put("email", aVar.mo26049a());
            hashMap2.put("previousEmail", aVar.mo26050b());
        }
        hashMap.put(JsonStorageKeyNames.DATA_KEY, hashMap2);
        return hashMap;
    }

    /* renamed from: i0 */
    private C7869z m51310i0(Map<String, Object> map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        return FirebaseAuth.getInstance(C10412f.m52583p((String) obj)).mo26031m();
    }

    /* renamed from: i1 */
    private Map<String, Object> m51311i1(C7802g gVar) {
        if (gVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isNewUser", Boolean.valueOf(gVar.mo26098p1()));
        hashMap.put("profile", gVar.mo26096I0());
        hashMap.put("providerId", gVar.mo26095D());
        hashMap.put(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, gVar.mo26097k0());
        return hashMap;
    }

    /* renamed from: j0 */
    static Map<String, Object> m51313j0(Exception exc) {
        Throwable th;
        HashMap hashMap = new HashMap();
        if (exc == null) {
            return hashMap;
        }
        C10083u0 u0Var = null;
        if (exc instanceof C7841q) {
            u0Var = new C10083u0(exc, exc.getCause());
        } else if (exc.getCause() != null && (exc.getCause() instanceof C7841q)) {
            C7841q qVar = (C7841q) exc.getCause();
            if (exc.getCause().getCause() != null) {
                th = exc.getCause().getCause();
            } else {
                th = exc.getCause();
            }
            u0Var = new C10083u0((Exception) qVar, th);
        } else if (exc instanceof C10083u0) {
            u0Var = (C10083u0) exc;
        }
        if (u0Var != null) {
            hashMap.put("code", u0Var.mo32695c());
            hashMap.put("message", u0Var.getMessage());
            hashMap.put("additionalData", u0Var.mo32694b());
            return hashMap;
        } else if ((exc instanceof C10422m) || (exc.getCause() != null && (exc.getCause() instanceof C10422m))) {
            hashMap.put("code", "network-request-failed");
            hashMap.put("message", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.");
            hashMap.put("additionalData", new HashMap());
            return hashMap;
        } else if ((exc instanceof C10409c) || (exc.getCause() != null && (exc.getCause() instanceof C10409c))) {
            hashMap.put("code", "api-not-available");
            hashMap.put("message", "The requested API is not available.");
            hashMap.put("additionalData", new HashMap());
            return hashMap;
        } else if ((exc instanceof C10426o) || (exc.getCause() != null && (exc.getCause() instanceof C10426o))) {
            hashMap.put("code", "too-many-requests");
            hashMap.put("message", "We have blocked all requests from this device due to unusual activity. Try again later.");
            hashMap.put("additionalData", new HashMap());
            return hashMap;
        } else {
            if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
                hashMap.put("code", "invalid-verification-id");
                hashMap.put("message", "The verification ID used to create the phone auth credential is invalid.");
                hashMap.put("additionalData", new HashMap());
            }
            return hashMap;
        }
    }

    /* renamed from: j1 */
    static Map<String, Object> m51314j1(C7806h hVar) {
        if (hVar == null) {
            return null;
        }
        int hashCode = hVar.hashCode();
        f40122h.put(Integer.valueOf(hashCode), hVar);
        HashMap hashMap = new HashMap();
        hashMap.put("providerId", hVar.mo26062I1());
        hashMap.put("signInMethod", hVar.mo26063J1());
        hashMap.put("token", Integer.valueOf(hashCode));
        if (hVar instanceof C7822l0) {
            hashMap.put("accessToken", ((C7822l0) hVar).mo26132L1());
        }
        return hashMap;
    }

    /* renamed from: k0 */
    private C9975i<Map<String, Object>> m51316k0(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10097w(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: k1 */
    private Map<String, Object> m51317k1(C7810i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("additionalUserInfo", m51311i1(iVar.mo26105B0()));
        hashMap.put("authCredential", m51314j1(iVar.mo26106H0()));
        hashMap.put("user", m51320l1(iVar.mo26107g1()));
        return hashMap;
    }

    /* renamed from: l0 */
    private void m51319l0(Map<String, Object> map, C9977j<Map<String, Object>> jVar, Exception exc) {
        C7850t tVar = (C7850t) exc.getCause();
        HashMap hashMap = new HashMap();
        C7815j0 b = tVar.mo26189b();
        List<C7811i0> I1 = b.mo26124I1();
        C7819k0 J1 = b.mo26125J1();
        String uuid = UUID.randomUUID().toString();
        this.f40128f.put(uuid, J1);
        String uuid2 = UUID.randomUUID().toString();
        this.f40129g.put(uuid2, b);
        List<Map<String, Object>> f1 = m51302f1(I1);
        hashMap.put("appName", m51301f0(map).mo26030l().mo33470q());
        hashMap.put("multiFactorHints", f1);
        hashMap.put("multiFactorSessionId", uuid);
        hashMap.put("multiFactorResolverId", uuid2);
        jVar.mo32543b(new C10083u0(tVar.mo26179a(), tVar.getLocalizedMessage(), hashMap));
    }

    /* renamed from: l1 */
    static Map<String, Object> m51320l1(C7869z zVar) {
        if (zVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("displayName", zVar.mo26211u0());
        hashMap.put("email", zVar.mo26210j1());
        hashMap.put("emailVerified", Boolean.valueOf(zVar.mo26207K()));
        hashMap.put("isAnonymous", Boolean.valueOf(zVar.mo26229O1()));
        if (zVar.mo26225K1() != null) {
            hashMap2.put("creationTime", Long.valueOf(zVar.mo26225K1().mo26051d0()));
            hashMap2.put("lastSignInTime", Long.valueOf(zVar.mo26225K1().mo26052v0()));
        }
        hashMap.put("metadata", hashMap2);
        hashMap.put("phoneNumber", zVar.mo26208Y());
        hashMap.put("photoURL", m51323m1(zVar.mo26212x()));
        hashMap.put("providerData", m51332p1(zVar.mo26227M1()));
        hashMap.put("refreshToken", "");
        hashMap.put("uid", zVar.mo26209b());
        hashMap.put("tenantId", zVar.mo26228N1());
        return hashMap;
    }

    /* renamed from: m0 */
    private void m51322m0(C6539c cVar) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
        C6556k kVar = new C6556k(cVar, "plugins.flutter.io/firebase_auth");
        this.f40124b = kVar;
        kVar.mo22161e(this);
        C10037c1.m51193j(cVar, this);
        C10100x0.m51414d(cVar, this);
        this.f40123a = cVar;
    }

    /* renamed from: m1 */
    private static String m51323m1(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        if ("".equals(uri2)) {
            return null;
        }
        return uri2;
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static /* synthetic */ void m51325n0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Object obj = map.get("code");
            Objects.requireNonNull(obj);
            C9980l.m51027a(f0.mo26020g((String) obj));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: n1 */
    private Map<String, Object> m51326n1(C7782b0 b0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("authTimestamp", Long.valueOf(b0Var.mo26053a() * 1000));
        hashMap.put("claims", b0Var.mo26054b());
        hashMap.put("expirationTimestamp", Long.valueOf(b0Var.mo26055c() * 1000));
        hashMap.put("issuedAtTimestamp", Long.valueOf(b0Var.mo26056d() * 1000));
        hashMap.put("signInProvider", b0Var.mo26057e());
        hashMap.put("signInSecondFactor", b0Var.mo26058f());
        hashMap.put("token", b0Var.mo26059g());
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ void m51328o0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Object obj = map.get("code");
            Objects.requireNonNull(obj);
            jVar.mo32544c(m51308h1((C7789d) C9980l.m51027a(f0.mo26022h((String) obj))));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: o1 */
    private static Map<String, Object> m51329o1(C7863x0 x0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("displayName", x0Var.mo26211u0());
        hashMap.put("email", x0Var.mo26210j1());
        hashMap.put("phoneNumber", x0Var.mo26208Y());
        hashMap.put("photoURL", m51323m1(x0Var.mo26212x()));
        hashMap.put("providerId", x0Var.mo26206D());
        hashMap.put("uid", x0Var.mo26209b());
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public static /* synthetic */ void m51331p0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Object obj = map.get("code");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("newPassword");
            Objects.requireNonNull(obj2);
            C9980l.m51027a(f0.mo26024i((String) obj, (String) obj2));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: p1 */
    private static List<Map<String, Object>> m51332p1(List<? extends C7863x0> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            C7863x0 x0Var = (C7863x0) it.next();
            if (x0Var != null && !"firebase".equals(x0Var.mo26206D())) {
                arrayList.add(m51329o1(x0Var));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ void m51334q0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            Object obj2 = map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD);
            Objects.requireNonNull(obj2);
            jVar.mo32544c(m51317k1((C7810i) C9980l.m51027a(f0.mo26026j((String) obj, (String) obj2))));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: q1 */
    private C9975i<Map<String, Object>> m51335q1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10074q0(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public /* synthetic */ void m51337r0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            if (i0 == null) {
                jVar.mo32543b(C10083u0.m51371f());
                return;
            }
            C9980l.m51027a(i0.mo26223I1());
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: r1 */
    private C9975i<Map<String, Object>> m51338r1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10076r0(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m51340s0(C9977j jVar) {
        try {
            m51350v1();
            f40122h.clear();
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: s1 */
    private C9975i<String> m51341s1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10042d(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public static /* synthetic */ void m51343t0(C10085v0.C10096i iVar, C9975i iVar2) {
        if (iVar2.mo26362q()) {
            iVar.success(null);
        } else {
            iVar.mo32652a(iVar2.mo26357l());
        }
    }

    /* renamed from: t1 */
    private C9975i<String> m51344t1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10055h(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public static /* synthetic */ void m51346u0(Map map, C9977j jVar) {
        try {
            FirebaseAuth f0 = m51301f0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            HashMap hashMap = new HashMap();
            hashMap.put("providers", ((C7854u0) C9980l.m51027a(f0.mo26028k((String) obj))).mo26192a());
            jVar.mo32544c(hashMap);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: u1 */
    private C9975i<Map<String, Object>> m51347u1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10075r(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public /* synthetic */ void m51349v0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            Object obj = map.get("forceRefresh");
            Objects.requireNonNull(obj);
            Boolean bool = (Boolean) obj;
            Object obj2 = map.get("tokenOnly");
            Objects.requireNonNull(obj2);
            Boolean bool2 = (Boolean) obj2;
            if (i0 == null) {
                jVar.mo32543b(C10083u0.m51371f());
                return;
            }
            C7782b0 b0Var = (C7782b0) C9980l.m51027a(i0.mo26224J1(bool.booleanValue()));
            if (bool2.booleanValue()) {
                HashMap hashMap = new HashMap();
                hashMap.put("token", b0Var.mo26059g());
                jVar.mo32544c(hashMap);
                return;
            }
            jVar.mo32544c(m51326n1(b0Var));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: v1 */
    private void m51350v1() {
        for (C6544d next : this.f40126d.keySet()) {
            C6544d.C6549d dVar = this.f40126d.get(next);
            if (dVar != null) {
                dVar.mo22146i((Object) null);
            }
            next.mo22141d((C6544d.C6549d) null);
        }
        this.f40126d.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public static /* synthetic */ void m51352w0(C10412f fVar, C9977j jVar) {
        Map<String, Object> map;
        try {
            HashMap hashMap = new HashMap();
            FirebaseAuth instance = FirebaseAuth.getInstance(fVar);
            C7869z m = instance.mo26031m();
            String o = instance.mo26033o();
            if (m == null) {
                map = null;
            } else {
                map = m51320l1(m);
            }
            if (o != null) {
                hashMap.put("APP_LANGUAGE_CODE", o);
            }
            if (map != null) {
                hashMap.put("APP_CURRENT_USER", map);
            }
            jVar.mo32544c(hashMap);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: w1 */
    private C9975i<Void> m51353w1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10104z(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ void m51355x0(C10085v0.C10096i iVar, C9975i iVar2) {
        if (iVar2.mo26362q()) {
            String uuid = UUID.randomUUID().toString();
            this.f40128f.put(uuid, (C7819k0) iVar2.mo26358m());
            iVar.success(new C10085v0.C10093g.C10094a().mo32713b(uuid).mo32712a());
            return;
        }
        iVar.mo32652a(iVar2.mo26357l());
    }

    /* renamed from: x1 */
    private C9975i<Void> m51356x1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10061k(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ void m51358y0(Map map, C9977j jVar) {
        try {
            C7869z i0 = m51310i0(map);
            C7806h g0 = m51304g0(map);
            if (i0 == null) {
                jVar.mo32543b(C10083u0.m51371f());
            } else if (g0 == null) {
                jVar.mo32543b(C10083u0.m51369d());
            } else {
                jVar.mo32544c(m51317k1((C7810i) C9980l.m51027a(i0.mo26230P1(g0))));
            }
        } catch (Exception e) {
            if (e.getCause() instanceof C7850t) {
                m51319l0(map, jVar, e);
                return;
            }
            String message = e.getMessage();
            if (message == null || !message.contains("User has already been linked to the given provider.")) {
                jVar.mo32543b(e);
            } else {
                jVar.mo32543b(C10083u0.m51368a());
            }
        }
    }

    /* renamed from: y1 */
    private C9975i<Void> m51359y1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10078s0(this, map, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public static /* synthetic */ void m51361z0(C6556k.C6561d dVar, C9975i iVar) {
        if (iVar.mo26362q()) {
            dVar.success(iVar.mo26358m());
            return;
        }
        Exception l = iVar.mo26357l();
        dVar.error("firebase_auth", l != null ? l.getMessage() : null, m51313j0(l));
    }

    /* renamed from: z1 */
    private C9975i<Map<String, Object>> m51362z1(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10069o(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: a */
    public void mo32688a(String str, C10085v0.C10095h hVar, C10085v0.C10096i<Map<String, Object>> iVar) {
        this.f40129g.get(str).mo26126K1(C7845r0.m43495a(C7837p0.m43479a(hVar.mo32715c(), hVar.mo32714b()))).mo26347b(new C10067n(this, iVar));
    }

    /* renamed from: b */
    public void mo32689b(String str, C10085v0.C10095h hVar, String str2, C10085v0.C10096i<Void> iVar) {
        try {
            m51298e0(str).mo26099a(C7845r0.m43495a(C7837p0.m43479a(hVar.mo32715c(), hVar.mo32714b())), str2).mo26347b(new C10068n0(iVar));
        } catch (C12258a e) {
            iVar.mo32652a(e);
        }
    }

    /* renamed from: c */
    public void mo32690c(String str, C10085v0.C10096i<List<C10085v0.C10091f>> iVar) {
        try {
            iVar.success(m51305g1(m51298e0(str).mo26100b()));
        } catch (C12258a e) {
            iVar.mo32652a(e);
        }
    }

    /* renamed from: d */
    public void mo32691d(String str, String str2, C10085v0.C10096i<Void> iVar) {
        try {
            m51298e0(str).mo26102d(str2).mo26347b(new C10060j0(iVar));
        } catch (C12258a e) {
            iVar.mo32652a(e);
        }
    }

    public C9975i<Void> didReinitializeFirebaseCore() {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10072p0(this, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: e */
    public void mo32692e(String str, C10085v0.C10096i<C10085v0.C10093g> iVar) {
        try {
            m51298e0(str).mo26101c().mo26347b(new C10102y(this, iVar));
        } catch (C12258a e) {
            iVar.mo32652a(e);
        }
    }

    public C9975i<Map<String, Object>> getPluginConstantsForFirebaseApp(C10412f fVar) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10046e0(fVar, jVar));
        return jVar.mo32542a();
    }

    public void onAttachedToActivity(C12590c cVar) {
        this.f40125c = cVar.getActivity();
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m51322m0(bVar.mo37293b());
    }

    public void onDetachedFromActivity() {
        this.f40125c = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f40125c = null;
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        this.f40124b.mo22161e((C6556k.C6560c) null);
        this.f40124b = null;
        this.f40123a = null;
        C10037c1.m51193j(bVar.mo37293b(), (C10085v0.C10089d) null);
        C10100x0.m51414d(bVar.mo37293b(), (C10085v0.C10087b) null);
        m51350v1();
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C9975i iVar;
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2057012413:
                if (str.equals("User#verifyBeforeUpdateEmail")) {
                    c = 0;
                    break;
                }
                break;
            case -1780708429:
                if (str.equals("Auth#signInWithEmailLink")) {
                    c = 1;
                    break;
                }
                break;
            case -1752633812:
                if (str.equals("Auth#setLanguageCode")) {
                    c = 2;
                    break;
                }
                break;
            case -1684941144:
                if (str.equals("User#reauthenticateUserWithCredential")) {
                    c = 3;
                    break;
                }
                break;
            case -1644801898:
                if (str.equals("Auth#signOut")) {
                    c = 4;
                    break;
                }
                break;
            case -1598142666:
                if (str.equals("User#updatePhoneNumber")) {
                    c = 5;
                    break;
                }
                break;
            case -1568968164:
                if (str.equals("User#updatePassword")) {
                    c = 6;
                    break;
                }
                break;
            case -1529680830:
                if (str.equals("Auth#sendSignInLinkToEmail")) {
                    c = 7;
                    break;
                }
                break;
            case -1451942929:
                if (str.equals("User#linkWithCredential")) {
                    c = 8;
                    break;
                }
                break;
            case -1351623174:
                if (str.equals("Auth#signInWithCredential")) {
                    c = 9;
                    break;
                }
                break;
            case -1292431612:
                if (str.equals("Auth#fetchSignInMethodsForEmail")) {
                    c = 10;
                    break;
                }
                break;
            case -1230437447:
                if (str.equals("Auth#signInWithEmailAndPassword")) {
                    c = 11;
                    break;
                }
                break;
            case -1027441723:
                if (str.equals("Auth#signInWithCustomToken")) {
                    c = 12;
                    break;
                }
                break;
            case -834572032:
                if (str.equals("User#getIdToken")) {
                    c = 13;
                    break;
                }
                break;
            case -695049397:
                if (str.equals("Auth#sendPasswordResetEmail")) {
                    c = 14;
                    break;
                }
                break;
            case -684675433:
                if (str.equals("User#sendEmailVerification")) {
                    c = 15;
                    break;
                }
                break;
            case -636251837:
                if (str.equals("User#delete")) {
                    c = 16;
                    break;
                }
                break;
            case -396665309:
                if (str.equals("Auth#verifyPhoneNumber")) {
                    c = 17;
                    break;
                }
                break;
            case -290623266:
                if (str.equals("Auth#createUserWithEmailAndPassword")) {
                    c = 18;
                    break;
                }
                break;
            case -235434703:
                if (str.equals("User#reload")) {
                    c = 19;
                    break;
                }
                break;
            case -141240917:
                if (str.equals("User#unlink")) {
                    c = 20;
                    break;
                }
                break;
            case -122200568:
                if (str.equals("User#updateProfile")) {
                    c = 21;
                    break;
                }
                break;
            case 116859805:
                if (str.equals("Auth#signInAnonymously")) {
                    c = 22;
                    break;
                }
                break;
            case 281593967:
                if (str.equals("Auth#confirmPasswordReset")) {
                    c = 23;
                    break;
                }
                break;
            case 415055753:
                if (str.equals("User#linkWithProvider")) {
                    c = 24;
                    break;
                }
                break;
            case 422677783:
                if (str.equals("User#reauthenticateWithProvider")) {
                    c = 25;
                    break;
                }
                break;
            case 506585151:
                if (str.equals("Auth#registerAuthStateListener")) {
                    c = 26;
                    break;
                }
                break;
            case 857654192:
                if (str.equals("Auth#checkActionCode")) {
                    c = 27;
                    break;
                }
                break;
            case 934812310:
                if (str.equals("Auth#applyActionCode")) {
                    c = 28;
                    break;
                }
                break;
            case 1045882753:
                if (str.equals("Auth#useEmulator")) {
                    c = 29;
                    break;
                }
                break;
            case 1241974868:
                if (str.equals("Auth#signInWithProvider")) {
                    c = 30;
                    break;
                }
                break;
            case 1511616916:
                if (str.equals("Auth#registerIdTokenListener")) {
                    c = 31;
                    break;
                }
                break;
            case 1852431466:
                if (str.equals("Auth#setSettings")) {
                    c = ' ';
                    break;
                }
                break;
            case 1953611341:
                if (str.equals("Auth#verifyPasswordResetCode")) {
                    c = '!';
                    break;
                }
                break;
            case 2139270075:
                if (str.equals("User#updateEmail")) {
                    c = '\"';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                iVar = m51267P1((Map) jVar.mo22157b());
                break;
            case 1:
                iVar = m51237F1((Map) jVar.mo22157b());
                break;
            case 2:
                iVar = m51362z1((Map) jVar.mo22157b());
                break;
            case 3:
                iVar = m51335q1((Map) jVar.mo22157b());
                break;
            case 4:
                iVar = m51243H1((Map) jVar.mo22157b());
                break;
            case 5:
                iVar = m51258M1((Map) jVar.mo22157b());
                break;
            case 6:
                iVar = m51255L1((Map) jVar.mo22157b());
                break;
            case 7:
                iVar = m51359y1((Map) jVar.mo22157b());
                break;
            case 8:
                iVar = m51299e1((Map) jVar.mo22157b());
                break;
            case 9:
                iVar = m51228C1((Map) jVar.mo22157b());
                break;
            case 10:
                iVar = m51292b0((Map) jVar.mo22157b());
                break;
            case 11:
                iVar = m51234E1((Map) jVar.mo22157b());
                break;
            case 12:
                iVar = m51231D1((Map) jVar.mo22157b());
                break;
            case 13:
                iVar = m51316k0((Map) jVar.mo22157b());
                break;
            case 14:
                iVar = m51356x1((Map) jVar.mo22157b());
                break;
            case 15:
                iVar = m51353w1((Map) jVar.mo22157b());
                break;
            case 16:
                iVar = m51290a0((Map) jVar.mo22157b());
                break;
            case 17:
                iVar = m51273R1((Map) jVar.mo22157b());
                break;
            case 18:
                iVar = m51288Z((Map) jVar.mo22157b());
                break;
            case 19:
                iVar = m51347u1((Map) jVar.mo22157b());
                break;
            case 20:
                iVar = m51249J1((Map) jVar.mo22157b());
                break;
            case 21:
                iVar = m51261N1((Map) jVar.mo22157b());
                break;
            case 22:
                iVar = m51225B1((Map) jVar.mo22157b());
                break;
            case 23:
                iVar = m51286Y((Map) jVar.mo22157b());
                break;
            case 24:
                iVar = m51246I1((Map) jVar.mo22157b());
                break;
            case 25:
                iVar = m51338r1((Map) jVar.mo22157b());
                break;
            case 26:
                iVar = m51341s1((Map) jVar.mo22157b());
                break;
            case 27:
                iVar = m51284X((Map) jVar.mo22157b());
                break;
            case 28:
                iVar = m51282W((Map) jVar.mo22157b());
                break;
            case 29:
                iVar = m51264O1((Map) jVar.mo22157b());
                break;
            case 30:
                iVar = m51240G1((Map) jVar.mo22157b());
                break;
            case 31:
                iVar = m51344t1((Map) jVar.mo22157b());
                break;
            case ' ':
                iVar = m51222A1((Map) jVar.mo22157b());
                break;
            case '!':
                iVar = m51270Q1((Map) jVar.mo22157b());
                break;
            case '\"':
                iVar = m51252K1((Map) jVar.mo22157b());
                break;
            default:
                dVar.notImplemented();
                return;
        }
        iVar.mo26347b(new C10035c(dVar));
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        this.f40125c = cVar.getActivity();
    }
}
