package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.C9696c;
import com.unity3d.scar.adapter.common.C9700g;
import com.unity3d.services.core.misc.EventSubject;
import p389wa.C12939c;

public class ScarInterstitialAdHandler extends ScarAdHandlerBase implements C9700g {
    public ScarInterstitialAdHandler(C12939c cVar, EventSubject<C9696c> eventSubject) {
        super(cVar, eventSubject);
    }

    public void onAdClicked() {
        this._gmaEventSender.send(C9696c.AD_CLICKED, new Object[0]);
    }

    public void onAdClosed() {
        if (!this._eventSubject.eventQueueIsEmpty()) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i, String str) {
        this._gmaEventSender.send(C9696c.INTERSTITIAL_SHOW_ERROR, this._scarAdMetadata.mo37980c(), this._scarAdMetadata.mo37981d(), str, Integer.valueOf(i));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(C9696c.INTERSTITIAL_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onAdLeftApplication() {
        this._gmaEventSender.send(C9696c.AD_LEFT_APPLICATION, new Object[0]);
    }
}
