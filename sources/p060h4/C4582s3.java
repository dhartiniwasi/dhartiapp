package p060h4;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.qb0;
import com.google.android.gms.internal.ads.z70;
import java.util.Collections;
import java.util.List;
import p088l5.C4954a;

/* renamed from: h4.s3 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4582s3 extends C4532k1 {

    /* renamed from: a */
    private z70 f25000a;

    /* renamed from: A4 */
    public final void mo10680A4(qb0 qb0) throws RemoteException {
    }

    /* renamed from: E5 */
    public final void mo10681E5(C4618y3 y3Var) throws RemoteException {
    }

    /* renamed from: M */
    public final void mo10683M(String str) throws RemoteException {
    }

    /* renamed from: Q5 */
    public final void mo10684Q5(boolean z) throws RemoteException {
    }

    /* renamed from: S2 */
    public final void mo10685S2(z70 z70) throws RemoteException {
        this.f25000a = z70;
    }

    /* renamed from: T */
    public final String mo10686T() {
        return "";
    }

    /* renamed from: V */
    public final void mo10687V() {
    }

    /* renamed from: W */
    public final void mo10688W() throws RemoteException {
        pm0.m18664d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        im0.f10857b.post(new C4576r3(this));
    }

    /* renamed from: X5 */
    public final void mo10689X5(float f) throws RemoteException {
    }

    /* renamed from: a */
    public final float mo10690a() throws RemoteException {
        return 1.0f;
    }

    /* renamed from: c */
    public final List mo10692c() throws RemoteException {
        return Collections.emptyList();
    }

    /* renamed from: c6 */
    public final void mo10693c6(String str) throws RemoteException {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo18141d() {
        z70 z70 = this.f25000a;
        if (z70 != null) {
            try {
                z70.mo15060X4(Collections.emptyList());
            } catch (RemoteException e) {
                pm0.m18668h("Could not notify onComplete event.", e);
            }
        }
    }

    /* renamed from: g */
    public final boolean mo10695g() throws RemoteException {
        return false;
    }

    /* renamed from: h5 */
    public final void mo10696h5(C4954a aVar, String str) throws RemoteException {
    }

    /* renamed from: i4 */
    public final void mo10697i4(String str, C4954a aVar) throws RemoteException {
    }

    /* renamed from: t4 */
    public final void mo10699t4(C4604w1 w1Var) {
    }
}
