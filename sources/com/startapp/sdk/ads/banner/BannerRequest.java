package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class BannerRequest {
    private BannerFormat adFormat = BannerFormat.BANNER;
    private AdPreferences adPreferences;
    private Point adSizeDp;
    private final Context context;

    /* compiled from: Sta */
    public interface Callback {
        void onFinished(BannerCreator bannerCreator, String str);
    }

    /* renamed from: com.startapp.sdk.ads.banner.BannerRequest$a */
    /* compiled from: Sta */
    public class C9288a implements AdEventListener {

        /* renamed from: a */
        public final /* synthetic */ Callback f38220a;

        /* renamed from: b */
        public final /* synthetic */ BannerFormat f38221b;

        /* renamed from: c */
        public final /* synthetic */ AdPreferences f38222c;

        /* renamed from: d */
        public final /* synthetic */ BannerStandardAd f38223d;

        /* renamed from: com.startapp.sdk.ads.banner.BannerRequest$a$a */
        /* compiled from: Sta */
        public class C9289a implements BannerCreator {

            /* renamed from: a */
            public boolean f38224a;

            public C9289a() {
            }

            public View create(Context context, BannerListener bannerListener) {
                BannerStandard bannerStandard;
                if (!this.f38224a) {
                    int i = C9290b.f38226a[C9288a.this.f38221b.ordinal()];
                    if (i == 1) {
                        C9288a aVar = C9288a.this;
                        bannerStandard = new Mrec(context, false, aVar.f38222c, aVar.f38223d);
                    } else if (i != 2) {
                        C9288a aVar2 = C9288a.this;
                        bannerStandard = new Banner(context, false, aVar2.f38222c, aVar2.f38223d);
                    } else {
                        C9288a aVar3 = C9288a.this;
                        bannerStandard = new Cover(context, false, aVar3.f38222c, aVar3.f38223d);
                    }
                    bannerStandard.setBannerListener(bannerListener);
                    bannerStandard.onReceiveAd(C9288a.this.f38223d);
                    this.f38224a = true;
                    return bannerStandard;
                }
                throw new IllegalStateException();
            }
        }

        public C9288a(BannerRequest bannerRequest, Callback callback, BannerFormat bannerFormat, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
            this.f38220a = callback;
            this.f38221b = bannerFormat;
            this.f38222c = adPreferences;
            this.f38223d = bannerStandardAd;
        }

        public void onFailedToReceiveAd(C9381Ad ad) {
            this.f38220a.onFinished((BannerCreator) null, String.valueOf(this.f38223d.getErrorMessage()));
        }

        public void onReceiveAd(C9381Ad ad) {
            this.f38220a.onFinished(new C9289a(), (String) null);
        }
    }

    /* renamed from: com.startapp.sdk.ads.banner.BannerRequest$b */
    /* compiled from: Sta */
    public static /* synthetic */ class C9290b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38226a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.startapp.sdk.ads.banner.BannerFormat[] r0 = com.startapp.sdk.ads.banner.BannerFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38226a = r0
                com.startapp.sdk.ads.banner.BannerFormat r1 = com.startapp.sdk.ads.banner.BannerFormat.MREC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38226a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.banner.BannerFormat r1 = com.startapp.sdk.ads.banner.BannerFormat.COVER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.BannerRequest.C9290b.<clinit>():void");
        }
    }

    public BannerRequest(Context context2) {
        this.context = context2.getApplicationContext();
    }

    public void load(Callback callback) {
        int i;
        int i2;
        AdPreferences adPreferences2 = this.adPreferences;
        if (adPreferences2 == null) {
            adPreferences2 = new AdPreferences();
        }
        BannerStandardAd bannerStandardAd = new BannerStandardAd(this.context, 0);
        BannerFormat bannerFormat = this.adFormat;
        Point point = this.adSizeDp;
        if (point != null) {
            i = point.x;
            i2 = point.y;
        } else {
            i = bannerFormat.widthDp;
            i2 = bannerFormat.heightDp;
        }
        bannerStandardAd.mo30068c(bannerFormat.type);
        bannerStandardAd.mo30490a(i, i2);
        bannerStandardAd.load(adPreferences2, new C9288a(this, callback, bannerFormat, adPreferences2, bannerStandardAd), true);
    }

    public BannerRequest setAdFormat(BannerFormat bannerFormat) {
        this.adFormat = bannerFormat;
        return this;
    }

    public BannerRequest setAdPreferences(AdPreferences adPreferences2) {
        this.adPreferences = adPreferences2;
        return this;
    }

    public BannerRequest setAdSize(int i, int i2) {
        this.adSizeDp = new Point(i, i2);
        return this;
    }
}
