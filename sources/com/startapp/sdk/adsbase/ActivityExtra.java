package com.startapp.sdk.adsbase;

import android.app.Activity;
import java.io.Serializable;

/* compiled from: Sta */
public class ActivityExtra implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean isActivityFullScreen;

    public ActivityExtra(Activity activity) {
        mo30413a(C9396a.m49787a(activity));
    }

    /* renamed from: a */
    public boolean mo30414a() {
        return this.isActivityFullScreen;
    }

    /* renamed from: a */
    public final void mo30413a(boolean z) {
        this.isActivityFullScreen = z;
    }
}
