package com.startapp.sdk.adsbase;

import com.startapp.C8870c1;
import java.io.Serializable;

/* compiled from: Sta */
public class AutoInterstitialPreferences implements Serializable {
    private static final long serialVersionUID = 1;
    private int activitiesBetweenAds;
    private int secondsBetweenAds;

    public AutoInterstitialPreferences() {
        setActivitiesBetweenAds(AdsCommonMetaData.m49636k().mo30461f());
        setSecondsBetweenAds(AdsCommonMetaData.m49636k().mo30462g());
    }

    public int getActivitiesBetweenAds() {
        return this.activitiesBetweenAds;
    }

    public int getSecondsBetweenAds() {
        return this.secondsBetweenAds;
    }

    public AutoInterstitialPreferences setActivitiesBetweenAds(int i) {
        if (i < 1) {
            i = 1;
        }
        this.activitiesBetweenAds = i;
        return this;
    }

    public AutoInterstitialPreferences setSecondsBetweenAds(int i) {
        if (i < 0) {
            i = 0;
        }
        this.secondsBetweenAds = i;
        return this;
    }

    public String toString() {
        StringBuilder a = C8870c1.m48422a("AutoInterstitialPreferences [activitiesBetweenAds=");
        a.append(this.activitiesBetweenAds);
        a.append(", secondsBetweenAds=");
        a.append(this.secondsBetweenAds);
        a.append("]");
        return a.toString();
    }
}
