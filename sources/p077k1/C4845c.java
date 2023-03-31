package p077k1;

import android.content.Context;
import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.C1969Ad;
import java.util.HashMap;
import p186ac.C6539c;
import p186ac.C6556k;
import p264io.flutter.plugin.platform.C10730e;
import p264io.flutter.plugin.platform.C10731f;

/* renamed from: k1.c */
/* compiled from: FacebookBannerAdPlugin */
class C4845c implements C10731f, AdListener {

    /* renamed from: a */
    private final AdView f25608a;

    /* renamed from: b */
    private final C6556k f25609b;

    C4845c(Context context, int i, HashMap hashMap, C6539c cVar) {
        this.f25609b = new C6556k(cVar, "fb.audience.network.io/bannerAd_" + i);
        AdView adView = new AdView(context, (String) hashMap.get("id"), m30872a(hashMap));
        this.f25608a = adView;
        adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).build());
    }

    /* renamed from: a */
    private AdSize m30872a(HashMap hashMap) {
        int intValue = ((Integer) hashMap.get("height")).intValue();
        if (intValue >= 250) {
            return AdSize.RECTANGLE_HEIGHT_250;
        }
        if (intValue >= 90) {
            return AdSize.BANNER_HEIGHT_90;
        }
        return AdSize.BANNER_HEIGHT_50;
    }

    public void dispose() {
    }

    public View getView() {
        return this.f25608a;
    }

    public void onAdClicked(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25609b.mo22159c("clicked", hashMap);
    }

    public void onAdLoaded(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25609b.mo22159c("loaded", hashMap);
    }

    public void onError(C1969Ad ad, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        hashMap.put("error_code", Integer.valueOf(adError.getErrorCode()));
        hashMap.put("error_message", adError.getErrorMessage());
        this.f25609b.mo22159c("error", hashMap);
    }

    public /* synthetic */ void onFlutterViewAttached(View view) {
        C10730e.m53693a(this, view);
    }

    public /* synthetic */ void onFlutterViewDetached() {
        C10730e.m53694b(this);
    }

    public /* synthetic */ void onInputConnectionLocked() {
        C10730e.m53695c(this);
    }

    public /* synthetic */ void onInputConnectionUnlocked() {
        C10730e.m53696d(this);
    }

    public void onLoggingImpression(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25609b.mo22159c("logging_impression", hashMap);
    }
}
