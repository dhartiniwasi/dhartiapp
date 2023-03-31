package p066i4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.qh1;
import p053g4.C4409t;
import p060h4.C4470a;
import p067i5.C4699m;
import p073j4.C4751b2;

/* renamed from: i4.s */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4679s {
    /* renamed from: a */
    public static final void m30352a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f5968s == 4 && adOverlayInfoParcel.f5960c == null) {
            C4470a aVar = adOverlayInfoParcel.f5959b;
            if (aVar != null) {
                aVar.onAdClicked();
            }
            qh1 qh1 = adOverlayInfoParcel.f5957G;
            if (qh1 != null) {
                qh1.mo9272h();
            }
            Activity X = adOverlayInfoParcel.f5961d.mo8461X();
            C4669i iVar = adOverlayInfoParcel.f5958a;
            if (!(iVar == null || !iVar.f25208r || X == null)) {
                context = X;
            }
            C4409t.m29318j();
            C4669i iVar2 = adOverlayInfoParcel.f5958a;
            C4656a.m30283b(context, iVar2, adOverlayInfoParcel.f5966i, iVar2 != null ? iVar2.f25207i : null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f5970u.f19153d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!C4699m.m30415f()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C4409t.m29326r();
        C4751b2.m30615j(context, intent);
    }
}
