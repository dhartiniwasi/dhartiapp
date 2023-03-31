package p060h4;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.sm0;
import com.google.android.gms.internal.ads.tm0;
import com.google.android.gms.internal.ads.u20;
import com.google.android.gms.internal.ads.y20;
import p088l5.C4956b;

/* renamed from: h4.p */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4560p extends C4578s {

    /* renamed from: b */
    final /* synthetic */ FrameLayout f24926b;

    /* renamed from: c */
    final /* synthetic */ FrameLayout f24927c;

    /* renamed from: d */
    final /* synthetic */ Context f24928d;

    /* renamed from: e */
    final /* synthetic */ C4572r f24929e;

    C4560p(C4572r rVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f24929e = rVar;
        this.f24926b = frameLayout;
        this.f24927c = frameLayout2;
        this.f24928d = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo18015a() {
        C4572r.m29994p(this.f24928d, "native_ad_view_delegate");
        return new C4588t3();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo18016b(C4478b1 b1Var) throws RemoteException {
        return b1Var.mo7834j1(C4956b.m31385o3(this.f24926b), C4956b.m31385o3(this.f24927c));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18017c() throws RemoteException {
        C2679nz.m17343c(this.f24928d);
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14686s8)).booleanValue()) {
            return this.f24929e.f24990d.mo13129c(this.f24928d, this.f24926b, this.f24927c);
        }
        try {
            return u20.m21375I6(((y20) tm0.m21079b(this.f24928d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", C4554o.f24923a)).mo14861w4(C4956b.m31385o3(this.f24928d), C4956b.m31385o3(this.f24926b), C4956b.m31385o3(this.f24927c), 223104000));
        } catch (RemoteException | sm0 | NullPointerException e) {
            this.f24929e.f24994h = ag0.m9704c(this.f24928d);
            this.f24929e.f24994h.mo8326b(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
