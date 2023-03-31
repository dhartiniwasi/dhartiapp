package p264io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.messaging.C8059o0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p261ic.C10592a;
import p261ic.C10593b;
import p261ic.C10594c;
import p264io.flutter.embedding.engine.C10685a;
import p264io.flutter.embedding.engine.C10697e;
import p264io.flutter.view.FlutterCallbackInformation;
import p315ob.C12051a;
import p333qb.C12212f;

/* renamed from: io.flutter.plugins.firebase.messaging.b */
/* compiled from: FlutterFirebaseMessagingBackgroundExecutor */
public class C10789b implements C6556k.C6560c {

    /* renamed from: a */
    private final AtomicBoolean f42189a = new AtomicBoolean(false);

    /* renamed from: b */
    private C6556k f42190b;

    /* renamed from: c */
    private C10685a f42191c;

    /* renamed from: io.flutter.plugins.firebase.messaging.b$a */
    /* compiled from: FlutterFirebaseMessagingBackgroundExecutor */
    class C10790a implements C6556k.C6561d {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f42192a;

        C10790a(CountDownLatch countDownLatch) {
            this.f42192a = countDownLatch;
        }

        public void error(String str, String str2, Object obj) {
            this.f42192a.countDown();
        }

        public void notImplemented() {
            this.f42192a.countDown();
        }

        public void success(Object obj) {
            this.f42192a.countDown();
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.b$b */
    /* compiled from: FlutterFirebaseMessagingBackgroundExecutor */
    class C10791b extends HashMap<String, Object> {

        /* renamed from: a */
        final /* synthetic */ Map f42194a;

        C10791b(Map map) {
            this.f42194a = map;
            put("userCallbackHandle", Long.valueOf(C10789b.this.m53947f()));
            put("message", map);
        }
    }

    /* renamed from: e */
    private long m53946e() {
        return C10592a.m53190a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public long m53947f() {
        return C10592a.m53190a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0);
    }

    /* renamed from: g */
    private void m53948g(C6539c cVar) {
        C6556k kVar = new C6556k(cVar, "plugins.flutter.io/firebase_messaging_background");
        this.f42190b = kVar;
        kVar.mo22161e(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m53949j(C12212f fVar, C10697e eVar, long j) {
        String i = fVar.mo36742i();
        AssetManager assets = C10592a.m53190a().getAssets();
        if (mo34413i()) {
            if (eVar != null) {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance, with args: " + Arrays.toString(eVar.mo34125b()));
                this.f42191c = new C10685a(C10592a.m53190a(), eVar.mo34125b());
            } else {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance.");
                this.f42191c = new C10685a(C10592a.m53190a());
            }
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j);
            C12051a i2 = this.f42191c.mo34072i();
            m53948g(i2);
            i2.mo36419i(new C12051a.C12053b(assets, i, lookupCallbackInformation));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m53950k(C12212f fVar, Handler handler, C10697e eVar, long j) {
        fVar.mo36746r(C10592a.m53190a());
        fVar.mo36741h(C10592a.m53190a(), (String[]) null, handler, new C10594c(this, fVar, eVar, j));
    }

    /* renamed from: l */
    private void m53951l() {
        this.f42189a.set(true);
        FlutterFirebaseMessagingBackgroundService.m53935m();
    }

    /* renamed from: m */
    public static void m53952m(long j) {
        C10592a.m53190a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", j).apply();
    }

    /* renamed from: n */
    public static void m53953n(long j) {
        C10592a.m53190a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", j).apply();
    }

    /* renamed from: d */
    public void mo34411d(Intent intent, CountDownLatch countDownLatch) {
        if (this.f42191c == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        C10790a aVar = null;
        if (countDownLatch != null) {
            aVar = new C10790a(countDownLatch);
        }
        C8059o0 o0Var = (C8059o0) intent.getParcelableExtra("notification");
        if (o0Var != null) {
            this.f42190b.mo22160d("MessagingBackground#onMessage", new C10791b(C10798g.m54018f(o0Var)), aVar);
            return;
        }
        Log.e("FLTFireBGExecutor", "RemoteMessage instance not found in Intent.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo34412h() {
        return m53946e() != 0;
    }

    /* renamed from: i */
    public boolean mo34413i() {
        return !this.f42189a.get();
    }

    /* renamed from: o */
    public void mo34414o() {
        if (mo34413i()) {
            long e = m53946e();
            if (e != 0) {
                mo34415p(e, (C10697e) null);
            }
        }
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        try {
            if (jVar.f30999a.equals("MessagingBackground#initialized")) {
                m53951l();
                dVar.success(Boolean.TRUE);
                return;
            }
            dVar.notImplemented();
        } catch (C10812j unused) {
            new StringBuilder().append("Flutter FCM error: ");
            throw null;
        }
    }

    /* renamed from: p */
    public void mo34415p(long j, C10697e eVar) {
        if (this.f42191c != null) {
            Log.e("FLTFireBGExecutor", "Background isolate already started.");
            return;
        }
        C12212f fVar = new C12212f();
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new C10593b(this, fVar, handler, eVar, j));
    }
}
