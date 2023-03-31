package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1225q;
import androidx.work.impl.foreground.C1565a;
import p170y0.C6094j;

public class SystemForegroundService extends C1225q implements C1565a.C1567b {

    /* renamed from: f */
    private static final String f4497f = C6094j.m35719f("SystemFgService");

    /* renamed from: g */
    private static SystemForegroundService f4498g = null;

    /* renamed from: b */
    private Handler f4499b;

    /* renamed from: c */
    private boolean f4500c;

    /* renamed from: d */
    C1565a f4501d;

    /* renamed from: e */
    NotificationManager f4502e;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    class C1562a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f4503a;

        /* renamed from: b */
        final /* synthetic */ Notification f4504b;

        /* renamed from: c */
        final /* synthetic */ int f4505c;

        C1562a(int i, Notification notification, int i2) {
            this.f4503a = i;
            this.f4504b = notification;
            this.f4505c = i2;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f4503a, this.f4504b, this.f4505c);
            } else {
                SystemForegroundService.this.startForeground(this.f4503a, this.f4504b);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    class C1563b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f4507a;

        /* renamed from: b */
        final /* synthetic */ Notification f4508b;

        C1563b(int i, Notification notification) {
            this.f4507a = i;
            this.f4508b = notification;
        }

        public void run() {
            SystemForegroundService.this.f4502e.notify(this.f4507a, this.f4508b);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    class C1564c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f4510a;

        C1564c(int i) {
            this.f4510a = i;
        }

        public void run() {
            SystemForegroundService.this.f4502e.cancel(this.f4510a);
        }
    }

    /* renamed from: e */
    private void m7244e() {
        this.f4499b = new Handler(Looper.getMainLooper());
        this.f4502e = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1565a aVar = new C1565a(getApplicationContext());
        this.f4501d = aVar;
        aVar.mo6362m(this);
    }

    /* renamed from: b */
    public void mo6352b(int i, int i2, Notification notification) {
        this.f4499b.post(new C1562a(i, notification, i2));
    }

    /* renamed from: c */
    public void mo6353c(int i, Notification notification) {
        this.f4499b.post(new C1563b(i, notification));
    }

    /* renamed from: d */
    public void mo6354d(int i) {
        this.f4499b.post(new C1564c(i));
    }

    public void onCreate() {
        super.onCreate();
        f4498g = this;
        m7244e();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4501d.mo6360k();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f4500c) {
            C6094j.m35717c().mo20923d(f4497f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f4501d.mo6360k();
            m7244e();
            this.f4500c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4501d.mo6361l(intent);
        return 3;
    }

    public void stop() {
        this.f4500c = true;
        C6094j.m35717c().mo20921a(f4497f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f4498g = null;
        stopSelf();
    }
}
