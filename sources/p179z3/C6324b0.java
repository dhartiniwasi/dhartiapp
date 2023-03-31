package p179z3;

import com.google.android.gms.internal.ads.ag0;

/* renamed from: z3.b0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C6324b0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6342l f30504a;

    /* renamed from: b */
    public final /* synthetic */ C6334g f30505b;

    public /* synthetic */ C6324b0(C6342l lVar, C6334g gVar) {
        this.f30504a = lVar;
        this.f30505b = gVar;
    }

    public final void run() {
        C6342l lVar = this.f30504a;
        try {
            lVar.f30542a.mo18157p(this.f30505b.mo229a());
        } catch (IllegalStateException e) {
            ag0.m9704c(lVar.getContext()).mo8326b(e, "BaseAdView.loadAd");
        }
    }
}
