package p264io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.app.C0665o;
import com.google.firebase.messaging.C8059o0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p063i0.C4643a;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p186ac.C6564n;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p246h7.C10412f;
import p261ic.C10592a;
import p261ic.C10596e;
import p261ic.C10597f;
import p261ic.C10598g;
import p261ic.C10599h;
import p261ic.C10600i;
import p261ic.C10601j;
import p261ic.C10602k;
import p261ic.C10603l;
import p261ic.C10604m;
import p261ic.C10605n;
import p261ic.C10606o;
import p261ic.C10607p;
import p261ic.C10608q;
import p264io.flutter.embedding.engine.C10697e;
import p264io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import p264io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: io.flutter.plugins.firebase.messaging.e */
/* compiled from: FlutterFirebaseMessagingPlugin */
public class C10794e extends BroadcastReceiver implements FlutterFirebasePlugin, C6556k.C6560c, C6564n, C12502a, C12588a {

    /* renamed from: a */
    private final HashMap<String, Boolean> f42199a = new HashMap<>();

    /* renamed from: b */
    private C6556k f42200b;

    /* renamed from: c */
    private Activity f42201c;

    /* renamed from: d */
    private C8059o0 f42202d;

    /* renamed from: e */
    private Map<String, Object> f42203e;

    /* renamed from: f */
    C10799h f42204f;

    /* renamed from: io.flutter.plugins.firebase.messaging.e$a */
    /* compiled from: FlutterFirebaseMessagingPlugin */
    class C10795a extends HashMap<String, Object> {

        /* renamed from: a */
        final /* synthetic */ String f42205a;

        C10795a(String str) {
            this.f42205a = str;
            put("token", str);
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.e$b */
    /* compiled from: FlutterFirebaseMessagingPlugin */
    class C10796b extends HashMap<String, Object> {

        /* renamed from: a */
        final /* synthetic */ FirebaseMessaging f42207a;

        C10796b(FirebaseMessaging firebaseMessaging) {
            this.f42207a = firebaseMessaging;
            put("isAutoInitEnabled", Boolean.valueOf(firebaseMessaging.mo26588y()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m53960A(C9977j jVar) {
        try {
            HashMap hashMap = new HashMap();
            int i = 1;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!m53993q().booleanValue()) {
                    i = 0;
                }
                hashMap.put("authorizationStatus", Integer.valueOf(i));
            } else {
                if (!C0665o.m3094e(this.f42201c).mo2965a()) {
                    i = 0;
                }
                hashMap.put("authorizationStatus", Integer.valueOf(i));
            }
            jVar.mo32544c(hashMap);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static /* synthetic */ void m53961B(C10412f fVar, C9977j jVar) {
        try {
            HashMap hashMap = new HashMap();
            if (fVar.mo33470q().equals("[DEFAULT]")) {
                hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.m44112r().mo26588y()));
            }
            jVar.mo32544c(hashMap);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m53962C(C9977j jVar) {
        try {
            jVar.mo32544c(new C10795a((String) C9980l.m51027a(FirebaseMessaging.m44112r().mo26586u())));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m53963D(C6556k.C6561d dVar, C9975i iVar) {
        if (iVar.mo26362q()) {
            dVar.success(iVar.mo26358m());
            return;
        }
        Exception l = iVar.mo26357l();
        dVar.error("firebase_messaging", l != null ? l.getMessage() : null, m53995s(l));
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m53964E(C9977j jVar) {
        HashMap hashMap = new HashMap();
        try {
            if (!m53993q().booleanValue()) {
                this.f42204f.mo34424a(this.f42201c, new C10793d(hashMap, jVar), new C10792c(jVar));
                return;
            }
            hashMap.put("authorizationStatus", 1);
            jVar.mo32544c(hashMap);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static /* synthetic */ void m53965F(Map map, C9977j jVar, int i) {
        map.put("authorizationStatus", Integer.valueOf(i));
        jVar.mo32544c(map);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static /* synthetic */ void m53967H(Map map, C9977j jVar) {
        try {
            C10798g.m54013a(map).mo26574L(C10798g.m54014b(map));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m53968I(Map map, C9977j jVar) {
        try {
            FirebaseMessaging a = C10798g.m54013a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            a.mo26575M(((Boolean) obj).booleanValue());
            jVar.mo32544c(new C10796b(a));
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static /* synthetic */ void m53969J(Map map, C9977j jVar) {
        try {
            FirebaseMessaging a = C10798g.m54013a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            a.mo26576N(((Boolean) obj).booleanValue());
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ void m53970K(Map map, C9977j jVar) {
        try {
            FirebaseMessaging a = C10798g.m54013a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            C9980l.m51027a(a.mo26578R((String) obj));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ void m53971L(Map map, C9977j jVar) {
        try {
            FirebaseMessaging a = C10798g.m54013a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            C9980l.m51027a(a.mo26581U((String) obj));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: M */
    private C9975i<Map<String, Integer>> m53972M() {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10604m(this, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: N */
    private C9975i<Void> m53973N(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10608q(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: O */
    private C9975i<Map<String, Object>> m53974O(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10607p(this, map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: P */
    private C9975i<Void> m53975P(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10597f(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: Q */
    private C9975i<Void> m53976Q(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10598g(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: R */
    private C9975i<Void> m53977R(Map<String, Object> map) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10599h(map, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: q */
    private Boolean m53993q() {
        return Boolean.valueOf(C10592a.m53190a().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
    }

    /* renamed from: r */
    private C9975i<Void> m53994r() {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10600i(jVar));
        return jVar.mo32542a();
    }

    /* renamed from: s */
    private Map<String, Object> m53995s(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        if (exc != null) {
            hashMap.put("message", exc.getMessage());
        } else {
            hashMap.put("message", "An unknown error has occurred.");
        }
        return hashMap;
    }

    /* renamed from: t */
    private C9975i<Map<String, Object>> m53996t() {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10605n(this, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: u */
    private C9975i<Map<String, Integer>> m53997u() {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10606o(this, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: v */
    private C9975i<Map<String, Object>> m53998v() {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10603l(this, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: w */
    private void m53999w(C6539c cVar) {
        C6556k kVar = new C6556k(cVar, "plugins.flutter.io/firebase_messaging");
        this.f42200b = kVar;
        kVar.mo22161e(this);
        this.f42204f = new C10799h();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("io.flutter.plugins.firebase.messaging.TOKEN");
        intentFilter.addAction("io.flutter.plugins.firebase.messaging.NOTIFICATION");
        C4643a.m30235b(C10592a.m53190a()).mo18316c(this, intentFilter);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ void m54000x(C9977j jVar) {
        try {
            C9980l.m51027a(FirebaseMessaging.m44112r().mo26583o());
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m54002z(C9977j jVar) {
        Map map;
        try {
            C8059o0 o0Var = this.f42202d;
            if (o0Var != null) {
                Map<String, Object> f = C10798g.m54018f(o0Var);
                Map<String, Object> map2 = this.f42203e;
                if (map2 != null) {
                    f.put("notification", map2);
                }
                jVar.mo32544c(f);
                this.f42202d = null;
                this.f42203e = null;
                return;
            }
            Activity activity = this.f42201c;
            if (activity == null) {
                jVar.mo32544c(null);
                return;
            }
            Intent intent = activity.getIntent();
            if (intent != null) {
                if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("google.message_id");
                    if (string == null) {
                        string = intent.getExtras().getString("message_id");
                    }
                    if (string != null) {
                        if (this.f42199a.get(string) == null) {
                            C8059o0 o0Var2 = FlutterFirebaseMessagingReceiver.f42188a.get(string);
                            if (o0Var2 == null) {
                                Map<String, Object> a = C10797f.m54004b().mo34418a(string);
                                if (a != null) {
                                    o0Var2 = C10798g.m54014b(a);
                                    if (a.get("notification") != null) {
                                        map = (Map) a.get("notification");
                                        C10797f.m54004b().mo34421g(string);
                                    }
                                }
                                map = null;
                                C10797f.m54004b().mo34421g(string);
                            } else {
                                map = null;
                            }
                            if (o0Var2 == null) {
                                jVar.mo32544c(null);
                                return;
                            }
                            this.f42199a.put(string, Boolean.TRUE);
                            Map<String, Object> f2 = C10798g.m54018f(o0Var2);
                            if (o0Var2.mo26692O1() == null && map != null) {
                                f2.put("notification", map);
                            }
                            jVar.mo32544c(f2);
                            return;
                        }
                    }
                    jVar.mo32544c(null);
                    return;
                }
            }
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: d */
    public boolean mo22165d(Intent intent) {
        Map<String, Object> map;
        Map<String, Object> a;
        if (intent == null || intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null) {
            return false;
        }
        C8059o0 o0Var = FlutterFirebaseMessagingReceiver.f42188a.get(string);
        Map<String, Object> map2 = null;
        if (o0Var == null && (a = C10797f.m54004b().mo34418a(string)) != null) {
            o0Var = C10798g.m54014b(a);
            map2 = C10798g.m54015c(a);
        }
        if (o0Var == null) {
            return false;
        }
        this.f42202d = o0Var;
        this.f42203e = map2;
        FlutterFirebaseMessagingReceiver.f42188a.remove(string);
        Map<String, Object> f = C10798g.m54018f(o0Var);
        if (o0Var.mo26692O1() == null && (map = this.f42203e) != null) {
            f.put("notification", map);
        }
        this.f42200b.mo22159c("Messaging#onMessageOpenedApp", f);
        this.f42201c.setIntent(intent);
        return true;
    }

    public C9975i<Void> didReinitializeFirebaseCore() {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10601j(jVar));
        return jVar.mo32542a();
    }

    public C9975i<Map<String, Object>> getPluginConstantsForFirebaseApp(C10412f fVar) {
        C9977j jVar = new C9977j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C10602k(fVar, jVar));
        return jVar.mo32542a();
    }

    public void onAttachedToActivity(C12590c cVar) {
        cVar.mo34114d(this);
        cVar.mo34112b(this.f42204f);
        Activity activity = cVar.getActivity();
        this.f42201c = activity;
        if (activity.getIntent() != null && this.f42201c.getIntent().getExtras() != null && (this.f42201c.getIntent().getFlags() & 1048576) != 1048576) {
            mo22165d(this.f42201c.getIntent());
        }
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m53999w(bVar.mo37293b());
    }

    public void onDetachedFromActivity() {
        this.f42201c = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f42201c = null;
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        C4643a.m30235b(bVar.mo37292a()).mo18318e(this);
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C9975i iVar;
        long j;
        long j2;
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1704007366:
                if (str.equals("Messaging#getInitialMessage")) {
                    c = 0;
                    break;
                }
                break;
            case -1661255137:
                if (str.equals("Messaging#setAutoInitEnabled")) {
                    c = 1;
                    break;
                }
                break;
            case -657665041:
                if (str.equals("Messaging#deleteToken")) {
                    c = 2;
                    break;
                }
                break;
            case 421314579:
                if (str.equals("Messaging#unsubscribeFromTopic")) {
                    c = 3;
                    break;
                }
                break;
            case 506322569:
                if (str.equals("Messaging#subscribeToTopic")) {
                    c = 4;
                    break;
                }
                break;
            case 607887267:
                if (str.equals("Messaging#setDeliveryMetricsExportToBigQuery")) {
                    c = 5;
                    break;
                }
                break;
            case 928431066:
                if (str.equals("Messaging#startBackgroundIsolate")) {
                    c = 6;
                    break;
                }
                break;
            case 1165917248:
                if (str.equals("Messaging#sendMessage")) {
                    c = 7;
                    break;
                }
                break;
            case 1231338975:
                if (str.equals("Messaging#requestPermission")) {
                    c = 8;
                    break;
                }
                break;
            case 1243856389:
                if (str.equals("Messaging#getNotificationSettings")) {
                    c = 9;
                    break;
                }
                break;
            case 1459336962:
                if (str.equals("Messaging#getToken")) {
                    c = 10;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                iVar = m53996t();
                break;
            case 1:
                iVar = m53974O((Map) jVar.mo22157b());
                break;
            case 2:
                iVar = m53994r();
                break;
            case 3:
                iVar = m53977R((Map) jVar.mo22157b());
                break;
            case 4:
                iVar = m53976Q((Map) jVar.mo22157b());
                break;
            case 5:
                iVar = m53975P((Map) jVar.mo22157b());
                break;
            case 6:
                Map map = (Map) jVar.f31000b;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                } else {
                    j = Long.valueOf((long) ((Integer) obj).intValue()).longValue();
                }
                if (obj2 instanceof Long) {
                    j2 = ((Long) obj2).longValue();
                } else {
                    j2 = Long.valueOf((long) ((Integer) obj2).intValue()).longValue();
                }
                Activity activity = this.f42201c;
                C10697e a = activity != null ? C10697e.m53546a(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.m53936n(j);
                FlutterFirebaseMessagingBackgroundService.m53937o(j2);
                FlutterFirebaseMessagingBackgroundService.m53938p(j, a);
                iVar = C9980l.m51031e(null);
                break;
            case 7:
                iVar = m53973N((Map) jVar.mo22157b());
                break;
            case 8:
                if (Build.VERSION.SDK_INT < 33) {
                    iVar = m53997u();
                    break;
                } else {
                    iVar = m53972M();
                    break;
                }
            case 9:
                iVar = m53997u();
                break;
            case 10:
                iVar = m53998v();
                break;
            default:
                dVar.notImplemented();
                return;
        }
        iVar.mo26347b(new C10596e(this, dVar));
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        cVar.mo34114d(this);
        this.f42201c = cVar.getActivity();
    }

    public void onReceive(Context context, Intent intent) {
        C8059o0 o0Var;
        String action = intent.getAction();
        if (action != null) {
            if (action.equals("io.flutter.plugins.firebase.messaging.TOKEN")) {
                this.f42200b.mo22159c("Messaging#onTokenRefresh", intent.getStringExtra("token"));
            } else if (action.equals("io.flutter.plugins.firebase.messaging.NOTIFICATION") && (o0Var = (C8059o0) intent.getParcelableExtra("notification")) != null) {
                this.f42200b.mo22159c("Messaging#onMessage", C10798g.m54018f(o0Var));
            }
        }
    }
}
