package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.C9696c;
import com.unity3d.scar.adapter.common.C9698e;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.misc.IEventListener;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import p389wa.C12939c;

public abstract class ScarAdHandlerBase implements C9698e {
    protected final EventSubject<C9696c> _eventSubject;
    protected final GMAEventSender _gmaEventSender = new GMAEventSender();
    protected final C12939c _scarAdMetadata;

    public ScarAdHandlerBase(C12939c cVar, EventSubject<C9696c> eventSubject) {
        this._scarAdMetadata = cVar;
        this._eventSubject = eventSubject;
    }

    public void onAdClosed() {
        this._gmaEventSender.send(C9696c.AD_CLOSED, new Object[0]);
        this._eventSubject.unsubscribe();
    }

    public void onAdFailedToLoad(int i, String str) {
        this._gmaEventSender.send(C9696c.LOAD_ERROR, this._scarAdMetadata.mo37980c(), this._scarAdMetadata.mo37981d(), str, Integer.valueOf(i));
    }

    public void onAdLoaded() {
        this._gmaEventSender.send(C9696c.AD_LOADED, this._scarAdMetadata.mo37980c(), this._scarAdMetadata.mo37981d());
    }

    public void onAdOpened() {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, C9696c.AD_STARTED, new Object[0]);
        this._eventSubject.subscribe(new IEventListener<C9696c>() {
            public void onNextEvent(C9696c cVar) {
                ScarAdHandlerBase.this._gmaEventSender.send(cVar, new Object[0]);
            }
        });
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(C9696c.AD_SKIPPED, new Object[0]);
    }
}
