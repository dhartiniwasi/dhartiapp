package p177z1;

import android.content.Context;
import android.net.wifi.WifiManager;
import p161w3.C5961r;

/* renamed from: z1.x3 */
/* compiled from: WifiLockManager */
final class C6296x3 {

    /* renamed from: a */
    private final WifiManager f30370a;

    /* renamed from: b */
    private WifiManager.WifiLock f30371b;

    /* renamed from: c */
    private boolean f30372c;

    /* renamed from: d */
    private boolean f30373d;

    public C6296x3(Context context) {
        this.f30370a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: c */
    private void m37150c() {
        WifiManager.WifiLock wifiLock = this.f30371b;
        if (wifiLock != null) {
            if (!this.f30372c || !this.f30373d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }

    /* renamed from: a */
    public void mo21568a(boolean z) {
        if (z && this.f30371b == null) {
            WifiManager wifiManager = this.f30370a;
            if (wifiManager == null) {
                C5961r.m35215i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f30371b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f30372c = z;
        m37150c();
    }

    /* renamed from: b */
    public void mo21569b(boolean z) {
        this.f30373d = z;
        m37150c();
    }
}
