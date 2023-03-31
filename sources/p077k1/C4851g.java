package p077k1;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.C1969Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import java.util.HashMap;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: k1.g */
/* compiled from: FacebookRewardedVideoAdPlugin */
class C4851g implements C6556k.C6560c, RewardedVideoAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public RewardedVideoAd f25623a = null;

    /* renamed from: b */
    private Context f25624b;

    /* renamed from: c */
    private C6556k f25625c;

    /* renamed from: d */
    private Handler f25626d;

    /* renamed from: k1.g$a */
    /* compiled from: FacebookRewardedVideoAdPlugin */
    class C4852a implements Runnable {
        C4852a() {
        }

        public void run() {
            if (C4851g.this.f25623a != null && C4851g.this.f25623a.isAdLoaded() && !C4851g.this.f25623a.isAdInvalidated()) {
                C4851g.this.f25623a.show(C4851g.this.f25623a.buildShowAdConfig().build());
            }
        }
    }

    C4851g(Context context, C6556k kVar) {
        this.f25624b = context;
        this.f25625c = kVar;
        this.f25626d = new Handler();
    }

    /* renamed from: b */
    private boolean m30882b() {
        RewardedVideoAd rewardedVideoAd = this.f25623a;
        if (rewardedVideoAd == null) {
            return false;
        }
        rewardedVideoAd.destroy();
        this.f25623a = null;
        return true;
    }

    /* renamed from: c */
    private boolean m30883c(HashMap hashMap) {
        String str = (String) hashMap.get("id");
        if (this.f25623a == null) {
            this.f25623a = new RewardedVideoAd(this.f25624b, str);
        }
        try {
            if (this.f25623a.isAdLoaded()) {
                return true;
            }
            this.f25623a.loadAd(this.f25623a.buildLoadAdConfig().withAdListener(this).build());
            return true;
        } catch (Exception e) {
            Log.e("RewardedVideoAdError", e.getMessage());
            return false;
        }
    }

    /* renamed from: d */
    private boolean m30884d(HashMap hashMap) {
        int intValue = ((Integer) hashMap.get("delay")).intValue();
        RewardedVideoAd rewardedVideoAd = this.f25623a;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded() || this.f25623a.isAdInvalidated()) {
            return false;
        }
        if (intValue <= 0) {
            this.f25623a.show(this.f25623a.buildShowAdConfig().build());
            return true;
        }
        this.f25626d.postDelayed(new C4852a(), (long) intValue);
        return true;
    }

    public void onAdClicked(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25625c.mo22159c("clicked", hashMap);
    }

    public void onAdLoaded(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25625c.mo22159c("loaded", hashMap);
    }

    public void onError(C1969Ad ad, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        hashMap.put("error_code", Integer.valueOf(adError.getErrorCode()));
        hashMap.put("error_message", adError.getErrorMessage());
        this.f25625c.mo22159c("error", hashMap);
    }

    public void onLoggingImpression(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25625c.mo22159c("logging_impression", hashMap);
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1548893609:
                if (str.equals("loadRewardedAd")) {
                    c = 0;
                    break;
                }
                break;
            case -1009162322:
                if (str.equals("showRewardedAd")) {
                    c = 1;
                    break;
                }
                break;
            case -15281045:
                if (str.equals("destroyRewardedAd")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                dVar.success(Boolean.valueOf(m30883c((HashMap) jVar.f31000b)));
                return;
            case 1:
                dVar.success(Boolean.valueOf(m30884d((HashMap) jVar.f31000b)));
                return;
            case 2:
                dVar.success(Boolean.valueOf(m30882b()));
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }

    public void onRewardedVideoClosed() {
        this.f25625c.mo22159c("rewarded_closed", Boolean.TRUE);
    }

    public void onRewardedVideoCompleted() {
        this.f25625c.mo22159c("rewarded_complete", Boolean.TRUE);
    }
}
