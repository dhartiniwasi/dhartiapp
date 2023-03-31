package p177z1;

import android.content.Context;
import android.os.PowerManager;
import p161w3.C5961r;

/* renamed from: z1.w3 */
/* compiled from: WakeLockManager */
final class C6294w3 {

    /* renamed from: a */
    private final PowerManager f30366a;

    /* renamed from: b */
    private PowerManager.WakeLock f30367b;

    /* renamed from: c */
    private boolean f30368c;

    /* renamed from: d */
    private boolean f30369d;

    public C6294w3(Context context) {
        this.f30366a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* renamed from: c */
    private void m37139c() {
        PowerManager.WakeLock wakeLock = this.f30367b;
        if (wakeLock != null) {
            if (!this.f30368c || !this.f30369d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }

    /* renamed from: a */
    public void mo21566a(boolean z) {
        if (z && this.f30367b == null) {
            PowerManager powerManager = this.f30366a;
            if (powerManager == null) {
                C5961r.m35215i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f30367b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f30368c = z;
        m37139c();
    }

    /* renamed from: b */
    public void mo21567b(boolean z) {
        this.f30369d = z;
        m37139c();
    }
}
