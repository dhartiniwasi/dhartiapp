package p202cb;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.C9695b;
import com.unity3d.scar.adapter.common.C9697d;
import com.unity3d.scar.adapter.common.C9700g;
import p179z3.C6334g;
import p214db.C9928b;
import p389wa.C12938b;
import p389wa.C12939c;

/* renamed from: cb.b */
/* compiled from: ScarInterstitialAd */
public class C6844b extends C6843a {

    /* renamed from: e */
    private InterstitialAd f31496e;

    /* renamed from: f */
    private C6845c f31497f;

    public C6844b(Context context, C9928b bVar, C12939c cVar, C9697d dVar, C9700g gVar) {
        super(context, cVar, bVar, dVar);
        InterstitialAd interstitialAd = new InterstitialAd(this.f31492a);
        this.f31496e = interstitialAd;
        interstitialAd.setAdUnitId(this.f31493b.mo37979b());
        this.f31497f = new C6845c(this.f31496e, gVar);
    }

    /* renamed from: a */
    public void mo22952a(Activity activity) {
        if (this.f31496e.isLoaded()) {
            this.f31496e.show();
        } else {
            this.f31495d.handleError(C9695b.m50612a(this.f31493b));
        }
    }

    /* renamed from: c */
    public void mo22951c(C12938b bVar, C6334g gVar) {
        this.f31496e.setAdListener(this.f31497f.mo22953c());
        this.f31497f.mo22954d(bVar);
        this.f31496e.loadAd(gVar);
    }
}
