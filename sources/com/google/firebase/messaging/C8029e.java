package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.C0651l;
import com.google.firebase.messaging.C8020c;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p067i5.C4699m;
import p218e6.C9980l;

/* renamed from: com.google.firebase.messaging.e */
/* compiled from: DisplayNotification */
class C8029e {

    /* renamed from: a */
    private final ExecutorService f34659a;

    /* renamed from: b */
    private final Context f34660b;

    /* renamed from: c */
    private final C8047j0 f34661c;

    public C8029e(Context context, C8047j0 j0Var, ExecutorService executorService) {
        this.f34659a = executorService;
        this.f34660b = context;
        this.f34661c = j0Var;
    }

    /* renamed from: b */
    private boolean m44231b() {
        if (((KeyguardManager) this.f34660b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C4699m.m30415f()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f34660b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                if (next.importance == 100) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m44232c(C8020c.C8021a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f34660b.getSystemService("notification")).notify(aVar.f34638b, aVar.f34639c, aVar.f34637a.mo2932c());
    }

    /* renamed from: d */
    private C8033f0 m44233d() {
        C8033f0 g = C8033f0.m44247g(this.f34661c.mo26663p("gcm.n.image"));
        if (g != null) {
            g.mo26634n(this.f34659a);
        }
        return g;
    }

    /* renamed from: e */
    private void m44234e(C0651l.C0659e eVar, C8033f0 f0Var) {
        if (f0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) C9980l.m51028b(f0Var.mo26633h(), 5, TimeUnit.SECONDS);
                eVar.mo2950x(bitmap);
                eVar.mo2924I(new C0651l.C0653b().mo2912n(bitmap).mo2911m((Bitmap) null));
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                f0Var.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                f0Var.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo26629a() {
        if (this.f34661c.mo26649a("gcm.n.noui")) {
            return true;
        }
        if (m44231b()) {
            return false;
        }
        C8033f0 d = m44233d();
        C8020c.C8021a e = C8020c.m44191e(this.f34660b, this.f34661c);
        m44234e(e.f34637a, d);
        m44232c(e);
        return true;
    }
}
