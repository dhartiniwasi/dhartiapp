package com.startapp.sdk.ads.video;

import android.app.Activity;
import android.content.Context;
import com.startapp.C9152n8;
import com.startapp.C9605vb;
import com.startapp.sdk.ads.video.VideoUtil;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import java.util.Map;

/* renamed from: com.startapp.sdk.ads.video.a */
/* compiled from: Sta */
public class C9351a extends GetAdRequest {

    /* renamed from: U0 */
    public GetAdRequest.VideoRequestType f38504U0;

    /* renamed from: V0 */
    public GetAdRequest.VideoRequestMode f38505V0 = GetAdRequest.VideoRequestMode.INTERSTITIAL;

    /* renamed from: a */
    public void mo30338a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair<String, String> pair) {
        super.mo30338a(context, adPreferences, placement, pair);
        C9381Ad.AdType adType = this.f38909T0;
        if (adType != null) {
            if (adType == C9381Ad.AdType.NON_VIDEO) {
                this.f38504U0 = GetAdRequest.VideoRequestType.DISABLED;
            } else if (adType == C9381Ad.AdType.VIDEO_NO_VAST) {
                this.f38504U0 = GetAdRequest.VideoRequestType.FORCED_NONVAST;
            } else if (mo30903b()) {
                this.f38504U0 = GetAdRequest.VideoRequestType.FORCED;
            }
        } else if (VideoUtil.m49533a(context) == VideoUtil.VideoEligibility.ELIGIBLE) {
            Map<Activity, Integer> map = C9605vb.f39316a;
            this.f38504U0 = GetAdRequest.VideoRequestType.ENABLED;
        } else {
            this.f38504U0 = GetAdRequest.VideoRequestType.DISABLED;
        }
        C9381Ad.AdType adType2 = this.f38909T0;
        if (adType2 == C9381Ad.AdType.REWARDED_VIDEO) {
            this.f38505V0 = GetAdRequest.VideoRequestMode.REWARDED;
        }
        if (adType2 == C9381Ad.AdType.VIDEO) {
            this.f38505V0 = GetAdRequest.VideoRequestMode.INTERSTITIAL;
        }
    }

    /* renamed from: a */
    public void mo29314a(C9152n8 n8Var) throws SDKException {
        super.mo29314a(n8Var);
        n8Var.mo29310a("video", (Object) this.f38504U0, false, true);
        n8Var.mo29310a("videoMode", (Object) this.f38505V0, false, true);
    }
}
