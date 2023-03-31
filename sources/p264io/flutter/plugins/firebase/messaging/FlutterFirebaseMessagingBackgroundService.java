package p264io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.C8059o0;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import p261ic.C10595d;
import p264io.flutter.embedding.engine.C10697e;

/* renamed from: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService */
public class FlutterFirebaseMessagingBackgroundService extends C10801i {

    /* renamed from: r */
    private static final List<Intent> f42186r = Collections.synchronizedList(new LinkedList());

    /* renamed from: s */
    private static C10789b f42187s;

    /* renamed from: k */
    public static void m53933k(Context context, Intent intent) {
        Class<FlutterFirebaseMessagingBackgroundService> cls = FlutterFirebaseMessagingBackgroundService.class;
        boolean z = true;
        if (((C8059o0) intent.getExtras().get("notification")).mo26693P1() != 1) {
            z = false;
        }
        C10801i.m54022d(context, cls, 2020, intent, z);
    }

    /* renamed from: m */
    static void m53935m() {
        Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
        List<Intent> list = f42186r;
        synchronized (list) {
            for (Intent d : list) {
                f42187s.mo34411d(d, (CountDownLatch) null);
            }
            f42186r.clear();
        }
    }

    /* renamed from: n */
    public static void m53936n(long j) {
        C10789b.m53952m(j);
    }

    /* renamed from: o */
    public static void m53937o(long j) {
        C10789b.m53953n(j);
    }

    /* renamed from: p */
    public static void m53938p(long j, C10697e eVar) {
        if (f42187s != null) {
            Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        C10789b bVar = new C10789b();
        f42187s = bVar;
        bVar.mo34415p(j, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo34396g(Intent intent) {
        if (!f42187s.mo34412h()) {
            Log.w("FLTFireMsgService", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List<Intent> list = f42186r;
        synchronized (list) {
            if (f42187s.mo34413i()) {
                Log.i("FLTFireMsgService", "Service has not yet started, messages will be queued.");
                list.add(intent);
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Handler(getMainLooper()).post(new C10595d(intent, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                Log.i("FLTFireMsgService", "Exception waiting to execute Dart callback", e);
            }
        }
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo34397h() {
        return super.mo34397h();
    }

    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        if (f42187s == null) {
            f42187s = new C10789b();
        }
        f42187s.mo34414o();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
