package p416za;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.C9695b;
import com.unity3d.scar.adapter.common.C9697d;
import com.unity3d.scar.adapter.common.C9700g;
import p179z3.C6334g;
import p185ab.C6527b;
import p389wa.C12938b;
import p389wa.C12939c;

/* renamed from: za.b */
/* compiled from: ScarInterstitialAd */
public class C13485b extends C13484a {

    /* renamed from: e */
    private InterstitialAd f47870e;

    /* renamed from: f */
    private C13486c f47871f;

    public C13485b(Context context, C6527b bVar, C12939c cVar, C9697d dVar, C9700g gVar) {
        super(context, cVar, bVar, dVar);
        InterstitialAd interstitialAd = new InterstitialAd(this.f47866a);
        this.f47870e = interstitialAd;
        interstitialAd.setAdUnitId(this.f47867b.mo37979b());
        this.f47871f = new C13486c(this.f47870e, gVar);
    }

    /* renamed from: a */
    public void mo22952a(Activity activity) {
        if (this.f47870e.isLoaded()) {
            this.f47870e.show();
        } else {
            this.f47869d.handleError(C9695b.m50612a(this.f47867b));
        }
    }

    /* renamed from: c */
    public void mo38615c(C12938b bVar, C6334g gVar) {
        this.f47870e.setAdListener(this.f47871f.mo38616c());
        this.f47871f.mo38617d(bVar);
        this.f47870e.loadAd(gVar);
    }
}
