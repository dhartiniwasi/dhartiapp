package p179z3;

import com.google.android.gms.internal.ads.ag0;

/* renamed from: z3.c0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C6326c0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6342l f30506a;

    public /* synthetic */ C6326c0(C6342l lVar) {
        this.f30506a = lVar;
    }

    public final void run() {
        C6342l lVar = this.f30506a;
        try {
            lVar.f30542a.mo18158q();
        } catch (IllegalStateException e) {
            ag0.m9704c(lVar.getContext()).mo8326b(e, "BaseAdView.pause");
        }
    }
}
