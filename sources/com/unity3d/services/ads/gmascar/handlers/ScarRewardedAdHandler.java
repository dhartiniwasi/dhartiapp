package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.C9696c;
import com.unity3d.scar.adapter.common.C9701h;
import com.unity3d.services.core.misc.EventSubject;
import p389wa.C12939c;

public class ScarRewardedAdHandler extends ScarAdHandlerBase implements C9701h {
    private boolean _hasEarnedReward = false;

    public ScarRewardedAdHandler(C12939c cVar, EventSubject<C9696c> eventSubject) {
        super(cVar, eventSubject);
    }

    public void onAdClosed() {
        if (!this._hasEarnedReward) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i, String str) {
        this._gmaEventSender.send(C9696c.REWARDED_SHOW_ERROR, this._scarAdMetadata.mo37980c(), this._scarAdMetadata.mo37981d(), str, Integer.valueOf(i));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(C9696c.REWARDED_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onUserEarnedReward() {
        this._hasEarnedReward = true;
        this._gmaEventSender.send(C9696c.AD_EARNED_REWARD, new Object[0]);
    }
}
