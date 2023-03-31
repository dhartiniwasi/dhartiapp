package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class tx1 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a */
    private final w02 f18286a;

    public tx1(w02 w02) {
        this.f18286a = w02;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        boolean z = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        w02 w02 = this.f18286a;
        if (true == z) {
            i = 10;
        }
        w02.m22518c(w02, i);
    }
}
