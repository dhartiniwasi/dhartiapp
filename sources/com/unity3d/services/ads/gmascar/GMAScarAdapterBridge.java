package com.unity3d.services.ads.gmascar;

import com.unity3d.scar.adapter.common.C9695b;
import com.unity3d.scar.adapter.common.C9696c;
import com.unity3d.scar.adapter.common.C9699f;
import com.unity3d.scar.adapter.common.C9706l;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.finder.GMAInitializer;
import com.unity3d.services.ads.gmascar.finder.PresenceDetector;
import com.unity3d.services.ads.gmascar.finder.ScarVersionFinder;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.timer.DefaultIntervalTimerFactory;
import java.util.ArrayDeque;
import java.util.Arrays;
import p389wa.C12939c;

public class GMAScarAdapterBridge {
    private final AdapterStatusBridge _adapterStatusBridge;
    private final GMAEventSender _gmaEventSender;
    private final GMAInitializer _gmaInitializer;
    private final InitializeListenerBridge _initializationListenerBridge;
    private final InitializationStatusBridge _initializationStatusBridge;
    private final MobileAdsBridge _mobileAdsBridge;
    private final PresenceDetector _presenceDetector;
    private C9699f _scarAdapter;
    private final ScarAdapterFactory _scarAdapterFactory = new ScarAdapterFactory();
    private final ScarVersionFinder _scarVersionFinder;
    private final WebViewErrorHandler _webViewErrorHandler = new WebViewErrorHandler();

    public GMAScarAdapterBridge() {
        MobileAdsBridge mobileAdsBridge = new MobileAdsBridge();
        this._mobileAdsBridge = mobileAdsBridge;
        InitializationStatusBridge initializationStatusBridge = new InitializationStatusBridge();
        this._initializationStatusBridge = initializationStatusBridge;
        InitializeListenerBridge initializeListenerBridge = new InitializeListenerBridge();
        this._initializationListenerBridge = initializeListenerBridge;
        AdapterStatusBridge adapterStatusBridge = new AdapterStatusBridge();
        this._adapterStatusBridge = adapterStatusBridge;
        PresenceDetector presenceDetector = new PresenceDetector(mobileAdsBridge, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge);
        this._presenceDetector = presenceDetector;
        GMAInitializer gMAInitializer = new GMAInitializer(mobileAdsBridge, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge);
        this._gmaInitializer = gMAInitializer;
        this._scarVersionFinder = new ScarVersionFinder(mobileAdsBridge, presenceDetector, gMAInitializer);
        this._gmaEventSender = new GMAEventSender();
    }

    private C9699f getScarAdapterObject() {
        if (this._scarAdapter == null) {
            this._scarAdapter = this._scarAdapterFactory.createScarAdapter(this._scarVersionFinder.getGoogleSdkVersionCode(), this._webViewErrorHandler);
        }
        return this._scarAdapter;
    }

    private EventSubject getScarEventSubject(Integer num) {
        return new EventSubject(new ArrayDeque(Arrays.asList(new C9696c[]{C9696c.FIRST_QUARTILE, C9696c.MIDPOINT, C9696c.THIRD_QUARTILE, C9696c.LAST_QUARTILE})), num, new DefaultIntervalTimerFactory());
    }

    private void loadInterstitialAd(C12939c cVar) {
        this._scarAdapter.mo22647b(ClientProperties.getApplicationContext(), cVar, new ScarInterstitialAdHandler(cVar, getScarEventSubject(cVar.mo37982e())));
    }

    private void loadRewardedAd(C12939c cVar) {
        this._scarAdapter.mo22648d(ClientProperties.getApplicationContext(), cVar, new ScarRewardedAdHandler(cVar, getScarEventSubject(cVar.mo37982e())));
    }

    public void getSCARSignals(String[] strArr, String[] strArr2) {
        this._scarAdapter = getScarAdapterObject();
        SignalsHandler signalsHandler = new SignalsHandler();
        C9699f fVar = this._scarAdapter;
        if (fVar != null) {
            fVar.mo31572a(ClientProperties.getApplicationContext(), strArr, strArr2, signalsHandler);
        } else {
            this._webViewErrorHandler.handleError((C9706l) C9695b.m50616e("Could not create SCAR adapter object"));
        }
    }

    public void getVersion() {
        this._scarVersionFinder.getVersion();
    }

    public void initializeScar() {
        if (this._presenceDetector.areGMAClassesPresent()) {
            this._gmaEventSender.send(C9696c.SCAR_PRESENT, new Object[0]);
            this._gmaInitializer.initializeGMA();
            return;
        }
        this._webViewErrorHandler.handleError((C9706l) new C9695b(C9696c.SCAR_NOT_PRESENT, new Object[0]));
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void load(boolean z, String str, String str2, String str3, String str4, int i) {
        C12939c cVar = new C12939c(str, str2, str4, str3, Integer.valueOf(i));
        C9699f scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((C9706l) C9695b.m50614c(cVar, "Scar Adapter object is null"));
        } else if (z) {
            loadInterstitialAd(cVar);
        } else {
            loadRewardedAd(cVar);
        }
    }

    public void show(String str, String str2, boolean z) {
        C12939c cVar = new C12939c(str, str2);
        C9699f scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject != null) {
            scarAdapterObject.mo31573c(ClientProperties.getActivity(), str2, str);
        } else {
            this._webViewErrorHandler.handleError((C9706l) C9695b.m50615d(cVar, "Scar Adapter object is null"));
        }
    }
}
