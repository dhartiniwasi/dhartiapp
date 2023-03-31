package com.facebook.ads.internal.bridge.gms;

import android.content.Context;
import androidx.annotation.Keep;
import p032d4.C4076a;

@Keep
public class AdvertisingId {
    private final String mId;
    private final boolean mLimitAdTracking;

    public AdvertisingId(String str, boolean z) {
        this.mId = str;
        this.mLimitAdTracking = z;
    }

    public static AdvertisingId getAdvertisingIdInfoDirectly(Context context) {
        try {
            C4076a.C4077a a = C4076a.m28009a(context);
            if (a != null) {
                return new AdvertisingId(a.mo17308a(), a.mo17309b());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getId() {
        return this.mId;
    }

    public boolean isLimitAdTracking() {
        return this.mLimitAdTracking;
    }
}
