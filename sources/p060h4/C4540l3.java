package p060h4;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.pm0;

/* renamed from: h4.l3 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4540l3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4552n3 f24882a;

    C4540l3(C4552n3 n3Var) {
        this.f24882a = n3Var;
    }

    public final void run() {
        C4558o3 o3Var = this.f24882a.f24922a;
        if (o3Var.f24924a != null) {
            try {
                o3Var.f24924a.mo14157n(1);
            } catch (RemoteException e) {
                pm0.m18668h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
