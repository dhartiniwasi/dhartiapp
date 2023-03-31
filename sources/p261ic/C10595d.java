package p261ic;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import p264io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;

/* renamed from: ic.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10595d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f41659a;

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f41660b;

    public /* synthetic */ C10595d(Intent intent, CountDownLatch countDownLatch) {
        this.f41659a = intent;
        this.f41660b = countDownLatch;
    }

    public final void run() {
        FlutterFirebaseMessagingBackgroundService.f42187s.mo34411d(this.f41659a, this.f41660b);
    }
}
