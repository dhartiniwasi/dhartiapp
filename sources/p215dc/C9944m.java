package p215dc;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p246h7.C10412f;
import p264io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import p264io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import p351sb.C12502a;

/* renamed from: dc.m */
/* compiled from: FlutterFirebaseAnalyticsPlugin */
public class C9944m implements FlutterFirebasePlugin, C6556k.C6560c, C12502a {

    /* renamed from: a */
    private FirebaseAnalytics f39875a;

    /* renamed from: b */
    private C6556k f39876b;

    /* renamed from: dc.m$a */
    /* compiled from: FlutterFirebaseAnalyticsPlugin */
    class C9945a extends HashMap<String, Object> {
        C9945a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m50896A(Map map, C9977j jVar) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            this.f39875a.mo25980d(((Boolean) obj).booleanValue());
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m50897B(Map map, C9977j jVar) {
        try {
            Object obj = map.get("milliseconds");
            Objects.requireNonNull(obj);
            this.f39875a.mo25983g((long) ((Integer) obj).intValue());
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m50898C(Map map, C9977j jVar) {
        try {
            this.f39875a.mo25985h((String) map.get("userId"));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m50899D(Map map, C9977j jVar) {
        try {
            Object obj = map.get(MediationMetaData.KEY_NAME);
            Objects.requireNonNull(obj);
            this.f39875a.mo25986i((String) obj, (String) map.get("value"));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ void m50900E(C6556k.C6561d dVar, C9975i iVar) {
        if (iVar.mo26362q()) {
            dVar.success(iVar.mo26358m());
            return;
        }
        Exception l = iVar.mo26357l();
        dVar.error("firebase_analytics", l != null ? l.getMessage() : "An unknown error occurred", (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m50901F(Map map, C9977j jVar) {
        FirebaseAnalytics.C7768a aVar;
        FirebaseAnalytics.C7768a aVar2;
        try {
            Boolean bool = (Boolean) map.get("adStorageConsentGranted");
            Boolean bool2 = (Boolean) map.get("analyticsStorageConsentGranted");
            HashMap hashMap = new HashMap();
            if (bool != null) {
                FirebaseAnalytics.C7769b bVar = FirebaseAnalytics.C7769b.AD_STORAGE;
                if (bool.booleanValue()) {
                    aVar2 = FirebaseAnalytics.C7768a.GRANTED;
                } else {
                    aVar2 = FirebaseAnalytics.C7768a.DENIED;
                }
                hashMap.put(bVar, aVar2);
            }
            if (bool2 != null) {
                FirebaseAnalytics.C7769b bVar2 = FirebaseAnalytics.C7769b.ANALYTICS_STORAGE;
                if (bool2.booleanValue()) {
                    aVar = FirebaseAnalytics.C7768a.GRANTED;
                } else {
                    aVar = FirebaseAnalytics.C7768a.DENIED;
                }
                hashMap.put(bVar2, aVar);
            }
            this.f39875a.mo25981e(hashMap);
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m50902G(Map map, C9977j jVar) {
        try {
            this.f39875a.mo25982f(m50917m(map));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: H */
    private C9975i<Void> m50903H(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C9938g(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: I */
    private C9975i<Void> m50904I(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C9939h(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: m */
    private static Bundle m50917m(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            String str = (String) next.getKey();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putLong(str, (long) ((Integer) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Double) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value == null) {
                bundle.putString(str, (String) null);
            } else if (value instanceof Iterable) {
                ArrayList arrayList = new ArrayList();
                for (Object next2 : (Iterable) value) {
                    if (next2 instanceof Map) {
                        arrayList.add(m50917m((Map) next2));
                    } else {
                        throw new IllegalArgumentException("Unsupported value type: " + next2.getClass().getCanonicalName() + " in list at key " + str);
                    }
                }
                bundle.putParcelableArrayList(str, arrayList);
            } else if (value instanceof Map) {
                bundle.putParcelable(str, m50917m((Map) value));
            } else {
                throw new IllegalArgumentException("Unsupported value type: " + value.getClass().getCanonicalName());
            }
        }
        return bundle;
    }

    /* renamed from: n */
    private C9975i<String> m50918n() {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C9935d(this, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: o */
    private C9975i<Void> m50919o(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C9941j(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: p */
    private C9975i<Void> m50920p() {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C9937f(this, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: q */
    private C9975i<Void> m50921q(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C9940i(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: r */
    private C9975i<Void> m50922r(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C9943l(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: s */
    private C9975i<Void> m50923s(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C9933b(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: t */
    private C9975i<Void> m50924t(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C9942k(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: u */
    private void m50925u(C6539c cVar, Context context) {
        this.f39875a = FirebaseAnalytics.getInstance(context);
        C6556k kVar = new C6556k(cVar, "plugins.flutter.io/firebase_analytics");
        this.f39876b = kVar;
        kVar.mo22161e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m50926v(C9977j jVar) {
        try {
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m50927w(C9977j jVar) {
        try {
            jVar.mo32544c(new C9945a());
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m50928x(C9977j jVar) {
        try {
            jVar.mo32544c((String) C9980l.m51027a(this.f39875a.mo25977a()));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m50929y(Map map, C9977j jVar) {
        try {
            Object obj = map.get("eventName");
            Objects.requireNonNull(obj);
            Bundle m = m50917m((Map) map.get("parameters"));
            this.f39875a.mo25978b((String) obj, m);
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m50930z(C9977j jVar) {
        try {
            this.f39875a.mo25979c();
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    public C9975i<Void> didReinitializeFirebaseCore() {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C9934c(jVar));
        return jVar.mo32542a();
    }

    public C9975i<Map<String, Object>> getPluginConstantsForFirebaseApp(C10412f fVar) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C9936e(this, jVar));
        return jVar.mo32542a();
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m50925u(bVar.mo37293b(), bVar.mo37292a());
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        C6556k kVar = this.f39876b;
        if (kVar != null) {
            kVar.mo22161e((C6556k.C6560c) null);
            this.f39876b = null;
        }
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C9975i iVar;
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2090892968:
                if (str.equals("Analytics#getAppInstanceId")) {
                    c = 0;
                    break;
                }
                break;
            case -1931910274:
                if (str.equals("Analytics#resetAnalyticsData")) {
                    c = 1;
                    break;
                }
                break;
            case -1572470123:
                if (str.equals("Analytics#setConsent")) {
                    c = 2;
                    break;
                }
                break;
            case -273201790:
                if (str.equals("Analytics#setAnalyticsCollectionEnabled")) {
                    c = 3;
                    break;
                }
                break;
            case -99047480:
                if (str.equals("Analytics#setDefaultEventParameters")) {
                    c = 4;
                    break;
                }
                break;
            case -45011405:
                if (str.equals("Analytics#logEvent")) {
                    c = 5;
                    break;
                }
                break;
            case 1083589925:
                if (str.equals("Analytics#setUserProperty")) {
                    c = 6;
                    break;
                }
                break;
            case 1751063748:
                if (str.equals("Analytics#setSessionTimeoutDuration")) {
                    c = 7;
                    break;
                }
                break;
            case 1992044651:
                if (str.equals("Analytics#setUserId")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                iVar = m50918n();
                break;
            case 1:
                iVar = m50920p();
                break;
            case 2:
                iVar = m50903H((Map) jVar.mo22157b());
                break;
            case 3:
                iVar = m50921q((Map) jVar.mo22157b());
                break;
            case 4:
                iVar = m50904I((Map) jVar.mo22157b());
                break;
            case 5:
                iVar = m50919o((Map) jVar.mo22157b());
                break;
            case 6:
                iVar = m50924t((Map) jVar.mo22157b());
                break;
            case 7:
                iVar = m50922r((Map) jVar.mo22157b());
                break;
            case 8:
                iVar = m50923s((Map) jVar.mo22157b());
                break;
            default:
                dVar.notImplemented();
                return;
        }
        iVar.mo26347b(new C9932a(dVar));
    }
}
