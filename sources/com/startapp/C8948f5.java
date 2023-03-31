package com.startapp;

import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9402c;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* renamed from: com.startapp.f5 */
/* compiled from: Sta */
public class C8948f5 implements AdEventListener {

    /* renamed from: a */
    public final /* synthetic */ C9402c f36778a;

    public C8948f5(C9402c cVar) {
        this.f36778a = cVar;
    }

    public void onFailedToReceiveAd(C9381Ad ad) {
    }

    public void onReceiveAd(C9381Ad ad) {
        if (this.f36778a.f38780e.showAd()) {
            C9402c cVar = this.f36778a;
            cVar.getClass();
            cVar.f38778c = System.currentTimeMillis();
            cVar.f38779d = 0;
        }
    }
}
