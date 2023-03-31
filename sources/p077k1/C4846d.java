package p077k1;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.C1969Ad;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import java.util.HashMap;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: k1.d */
/* compiled from: FacebookInterstitialAdPlugin */
class C4846d implements C6556k.C6560c, InterstitialAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public InterstitialAd f25610a = null;

    /* renamed from: b */
    private Context f25611b;

    /* renamed from: c */
    private C6556k f25612c;

    /* renamed from: d */
    private Handler f25613d;

    /* renamed from: k1.d$a */
    /* compiled from: FacebookInterstitialAdPlugin */
    class C4847a implements Runnable {
        C4847a() {
        }

        public void run() {
            if (C4846d.this.f25610a != null && C4846d.this.f25610a.isAdLoaded() && !C4846d.this.f25610a.isAdInvalidated()) {
                C4846d.this.f25610a.show(C4846d.this.f25610a.buildShowAdConfig().build());
            }
        }
    }

    C4846d(Context context, C6556k kVar) {
        this.f25611b = context;
        this.f25612c = kVar;
        this.f25613d = new Handler();
    }

    /* renamed from: b */
    private boolean m30874b() {
        InterstitialAd interstitialAd = this.f25610a;
        if (interstitialAd == null) {
            return false;
        }
        interstitialAd.destroy();
        this.f25610a = null;
        return true;
    }

    /* renamed from: c */
    private boolean m30875c(HashMap hashMap) {
        String str = (String) hashMap.get("id");
        if (this.f25610a == null) {
            this.f25610a = new InterstitialAd(this.f25611b, str);
        }
        try {
            if (this.f25610a.isAdLoaded()) {
                return true;
            }
            this.f25610a.loadAd(this.f25610a.buildLoadAdConfig().withAdListener(this).withCacheFlags(CacheFlag.ALL).build());
            return true;
        } catch (Exception e) {
            Log.e("InterstitialLoadAdError", e.getCause().getMessage());
            return false;
        }
    }

    /* renamed from: d */
    private boolean m30876d(HashMap hashMap) {
        int intValue = ((Integer) hashMap.get("delay")).intValue();
        InterstitialAd interstitialAd = this.f25610a;
        if (interstitialAd == null || !interstitialAd.isAdLoaded() || this.f25610a.isAdInvalidated()) {
            return false;
        }
        if (intValue <= 0) {
            this.f25610a.show(this.f25610a.buildShowAdConfig().build());
            return true;
        }
        this.f25613d.postDelayed(new C4847a(), (long) intValue);
        return true;
    }

    public void onAdClicked(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25612c.mo22159c("clicked", hashMap);
    }

    public void onAdLoaded(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25612c.mo22159c("loaded", hashMap);
    }

    public void onError(C1969Ad ad, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        hashMap.put("error_code", Integer.valueOf(adError.getErrorCode()));
        hashMap.put("error_message", adError.getErrorMessage());
        this.f25612c.mo22159c("error", hashMap);
    }

    public void onInterstitialDismissed(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25612c.mo22159c("dismissed", hashMap);
    }

    public void onInterstitialDisplayed(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25612c.mo22159c("displayed", hashMap);
    }

    public void onLoggingImpression(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25612c.mo22159c("logging_impression", hashMap);
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1941808395:
                if (str.equals("loadInterstitialAd")) {
                    c = 0;
                    break;
                }
                break;
            case -1193444148:
                if (str.equals("showInterstitialAd")) {
                    c = 1;
                    break;
                }
                break;
            case 166478601:
                if (str.equals("destroyInterstitialAd")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                dVar.success(Boolean.valueOf(m30875c((HashMap) jVar.f31000b)));
                return;
            case 1:
                dVar.success(Boolean.valueOf(m30876d((HashMap) jVar.f31000b)));
                return;
            case 2:
                dVar.success(Boolean.valueOf(m30874b()));
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
