package p060h4;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.pi0;
import com.google.android.gms.internal.ads.pm0;

/* renamed from: h4.u3 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C4594u3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ pi0 f25032a;

    public /* synthetic */ C4594u3(pi0 pi0) {
        this.f25032a = pi0;
    }

    public final void run() {
        pi0 pi0 = this.f25032a;
        if (pi0 != null) {
            try {
                pi0.mo8835n(1);
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        }
    }
}
