package p077k1;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.ads.AdError;
import com.facebook.ads.C1969Ad;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import java.util.HashMap;
import p186ac.C6539c;
import p186ac.C6556k;
import p264io.flutter.plugin.platform.C10730e;
import p264io.flutter.plugin.platform.C10731f;

/* renamed from: k1.f */
/* compiled from: FacebookNativeAdPlugin */
class C4849f implements C10731f, NativeAdListener {

    /* renamed from: a */
    private LinearLayout f25616a;

    /* renamed from: b */
    private final C6556k f25617b;

    /* renamed from: c */
    private final HashMap f25618c;

    /* renamed from: d */
    private final Context f25619d;

    /* renamed from: e */
    private NativeAd f25620e;

    /* renamed from: f */
    private NativeBannerAd f25621f;

    /* renamed from: k1.f$a */
    /* compiled from: FacebookNativeAdPlugin */
    class C4850a implements Runnable {
        C4850a() {
        }

        public void run() {
            C4849f.this.m30880d();
        }
    }

    C4849f(Context context, int i, HashMap hashMap, C6539c cVar) {
        this.f25616a = new LinearLayout(context);
        this.f25617b = new C6556k(cVar, "fb.audience.network.io/nativeAd_" + i);
        this.f25618c = hashMap;
        this.f25619d = context;
        if (((Boolean) hashMap.get("banner_ad")).booleanValue()) {
            NativeBannerAd nativeBannerAd = new NativeBannerAd(context, (String) hashMap.get("id"));
            this.f25621f = nativeBannerAd;
            this.f25621f.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(this).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).build());
            return;
        }
        NativeAd nativeAd = new NativeAd(context, (String) hashMap.get("id"));
        this.f25620e = nativeAd;
        this.f25620e.loadAd(nativeAd.buildLoadAdConfig().withAdListener(this).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).build());
    }

    /* renamed from: b */
    private NativeBannerAdView.Type m30878b(HashMap hashMap) {
        int intValue = ((Integer) hashMap.get("height")).intValue();
        if (intValue == 50) {
            return NativeBannerAdView.Type.HEIGHT_50;
        }
        if (intValue == 100) {
            return NativeBannerAdView.Type.HEIGHT_100;
        }
        if (intValue != 120) {
            return NativeBannerAdView.Type.HEIGHT_120;
        }
        return NativeBannerAdView.Type.HEIGHT_120;
    }

    /* renamed from: c */
    private NativeAdViewAttributes m30879c(Context context, HashMap hashMap) {
        NativeAdViewAttributes nativeAdViewAttributes = new NativeAdViewAttributes(context);
        if (hashMap.get("bg_color") != null) {
            nativeAdViewAttributes.setBackgroundColor(Color.parseColor((String) hashMap.get("bg_color")));
        }
        if (hashMap.get("title_color") != null) {
            nativeAdViewAttributes.setTitleTextColor(Color.parseColor((String) hashMap.get("title_color")));
        }
        if (hashMap.get("desc_color") != null) {
            nativeAdViewAttributes.setDescriptionTextColor(Color.parseColor((String) hashMap.get("desc_color")));
        }
        if (hashMap.get("button_color") != null) {
            nativeAdViewAttributes.setButtonColor(Color.parseColor((String) hashMap.get("button_color")));
        }
        if (hashMap.get("button_title_color") != null) {
            nativeAdViewAttributes.setButtonTextColor(Color.parseColor((String) hashMap.get("button_title_color")));
        }
        if (hashMap.get("button_border_color") != null) {
            nativeAdViewAttributes.setButtonBorderColor(Color.parseColor((String) hashMap.get("button_border_color")));
        }
        return nativeAdViewAttributes;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m30880d() {
        if (this.f25616a.getChildCount() > 0) {
            this.f25616a.removeAllViews();
        }
        if (((Boolean) this.f25618c.get("banner_ad")).booleanValue()) {
            this.f25616a.addView(NativeBannerAdView.render(this.f25619d, this.f25621f, m30878b(this.f25618c), m30879c(this.f25619d, this.f25618c)));
        } else {
            LinearLayout linearLayout = this.f25616a;
            Context context = this.f25619d;
            linearLayout.addView(NativeAdView.render(context, this.f25620e, m30879c(context, this.f25618c)));
        }
        this.f25617b.mo22159c("loaded", this.f25618c);
    }

    public void dispose() {
    }

    public View getView() {
        return this.f25616a;
    }

    public void onAdClicked(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25617b.mo22159c("clicked", hashMap);
    }

    public void onAdLoaded(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25617b.mo22159c("load_success", hashMap);
        this.f25616a.postDelayed(new C4850a(), 200);
    }

    public void onError(C1969Ad ad, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        hashMap.put("error_code", Integer.valueOf(adError.getErrorCode()));
        hashMap.put("error_message", adError.getErrorMessage());
        this.f25617b.mo22159c("error", hashMap);
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
        this.f25617b.mo22159c("logging_impression", hashMap);
    }

    public void onMediaDownloaded(C1969Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f25617b.mo22159c("media_downloaded", hashMap);
    }
}
