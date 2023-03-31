package p179z3;

import com.google.android.gms.internal.ads.ag0;

/* renamed from: z3.e0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C6330e0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6342l f30508a;

    public /* synthetic */ C6330e0(C6342l lVar) {
        this.f30508a = lVar;
    }

    public final void run() {
        C6342l lVar = this.f30508a;
        try {
            lVar.f30542a.mo18159r();
        } catch (IllegalStateException e) {
            ag0.m9704c(lVar.getContext()).mo8326b(e, "BaseAdView.resume");
        }
    }
}
