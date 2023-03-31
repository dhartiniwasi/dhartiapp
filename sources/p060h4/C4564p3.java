package p060h4;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.pm0;

/* renamed from: h4.p3 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4564p3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4570q3 f24947a;

    C4564p3(C4570q3 q3Var) {
        this.f24947a = q3Var;
    }

    public final void run() {
        C4570q3 q3Var = this.f24947a;
        if (q3Var.f24971a != null) {
            try {
                q3Var.f24971a.mo14157n(1);
            } catch (RemoteException e) {
                pm0.m18668h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
