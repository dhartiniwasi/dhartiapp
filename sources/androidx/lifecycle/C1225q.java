package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.q */
/* compiled from: LifecycleService */
public class C1225q extends Service implements C1220n {

    /* renamed from: a */
    private final C1191f0 f3349a = new C1191f0(this);

    public C1208j getLifecycle() {
        return this.f3349a.mo4385a();
    }

    public IBinder onBind(Intent intent) {
        this.f3349a.mo4386b();
        return null;
    }

    public void onCreate() {
        this.f3349a.mo4387c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f3349a.mo4388d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.f3349a.mo4389e();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
