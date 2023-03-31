package com.startapp.sdk.adsbase.adrules;

import com.startapp.C9226pb;
import java.io.Serializable;

/* compiled from: Sta */
public class AdaptMetaData implements Serializable {

    /* renamed from: a */
    public static transient AdaptMetaData f38768a = new AdaptMetaData();
    @C9226pb(complex = true)
    private AdRules adRules = new AdRules();
    private String adaptMetaDataUpdateVersion = "4.10.8";

    private AdaptMetaData() {
    }

    /* renamed from: a */
    public AdRules mo30647a() {
        return this.adRules;
    }
}
