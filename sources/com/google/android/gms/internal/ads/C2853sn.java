package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sn */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2853sn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2964vn f17594a;

    /* renamed from: b */
    final /* synthetic */ C3038xn f17595b;

    C2853sn(C3038xn xnVar, C2964vn vnVar) {
        this.f17595b = xnVar;
        this.f17594a = vnVar;
    }

    public final void run() {
        this.f17594a.mo14794a();
        int size = this.f17595b.f20252v.size();
        for (int i = 0; i < size; i++) {
            ((C2668no) this.f17595b.f20252v.valueAt(i)).mo12674i();
        }
    }
}
