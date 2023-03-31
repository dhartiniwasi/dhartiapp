package com.startapp.sdk.adsbase.model;

import com.startapp.C9226pb;
import com.startapp.sdk.adsbase.BaseResponse;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class GetAdResponse extends BaseResponse {
    private static final long serialVersionUID = 1;
    @C9226pb(complex = true)
    private AdInformationOverrides adInfoOverrides = AdInformationOverrides.m49816a();
    @C9226pb(type = ArrayList.class, value = AdDetails.class)
    private List<AdDetails> adsDetails = new ArrayList();
    private boolean inAppBrowser;
    @C9226pb(type = inAppBrowserPreLoad.class)
    private inAppBrowserPreLoad inAppBrowserPreLoad;
    private String productId;
    private String publisherId;

    /* compiled from: Sta */
    public enum inAppBrowserPreLoad {
    }

    /* renamed from: c */
    public AdInformationOverrides mo30905c() {
        return this.adInfoOverrides;
    }

    /* renamed from: d */
    public List<AdDetails> mo30906d() {
        return this.adsDetails;
    }
}
