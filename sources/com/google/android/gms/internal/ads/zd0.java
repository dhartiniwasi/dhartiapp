package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p053g4.C4409t;
import p066i4.C4679s;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zd0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AdOverlayInfoParcel f21055a;

    /* renamed from: b */
    final /* synthetic */ zzbxu f21056b;

    zd0(zzbxu zzbxu, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f21056b = zzbxu;
        this.f21055a = adOverlayInfoParcel;
    }

    public final void run() {
        C4409t.m29319k();
        C4679s.m30352a(this.f21056b.f21732a, this.f21055a, true);
    }
}
