package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* renamed from: com.startapp.sdk.adsbase.d */
/* compiled from: Sta */
public interface C9440d {
    /* renamed from: a */
    void mo30086a(boolean z);

    /* renamed from: a */
    boolean mo30087a();

    @Deprecated
    /* renamed from: a */
    boolean mo30088a(String str);

    /* renamed from: b */
    Long mo30089b();

    /* renamed from: c */
    Long mo30090c();

    /* renamed from: d */
    boolean mo30091d();

    C9381Ad.AdState getState();

    boolean isBelowMinCPM();

    boolean isReady();

    void load(AdPreferences adPreferences, AdEventListener adEventListener);

    void setActivityExtra(ActivityExtra activityExtra);

    void setContext(Context context);
}
