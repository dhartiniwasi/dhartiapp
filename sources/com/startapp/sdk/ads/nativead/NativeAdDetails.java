package com.startapp.sdk.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.startapp.C8870c1;
import com.startapp.C8950f7;
import com.startapp.C8960g1;
import com.startapp.C8988gd;
import com.startapp.C9087k9;
import com.startapp.C9260r7;
import com.startapp.C9615w2;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class NativeAdDetails implements NativeAdInterface {

    /* renamed from: a */
    public final AdDetails f38359a;

    /* renamed from: b */
    public Bitmap f38360b;

    /* renamed from: c */
    public Bitmap f38361c;

    /* renamed from: d */
    public boolean f38362d = false;

    /* renamed from: e */
    public boolean f38363e = false;

    /* renamed from: f */
    public String f38364f;

    /* renamed from: g */
    public C8988gd f38365g;

    /* renamed from: h */
    public WeakReference<View> f38366h = new WeakReference<>((Object) null);

    /* renamed from: i */
    public View.OnAttachStateChangeListener f38367i;

    /* renamed from: j */
    public NativeAdDisplayListener f38368j;

    /* renamed from: k */
    public C9260r7 f38369k;

    /* renamed from: l */
    public final C9087k9.C9088a f38370l = new C9318a();

    /* renamed from: com.startapp.sdk.ads.nativead.NativeAdDetails$a */
    /* compiled from: Sta */
    public class C9318a implements C9087k9.C9088a {
        public C9318a() {
        }

        public void onSent(String str) {
            NativeAdDetails nativeAdDetails = NativeAdDetails.this;
            boolean z = true;
            nativeAdDetails.f38362d = true;
            if (nativeAdDetails.f38368j == null) {
                z = false;
            }
            C9615w2.m50488a("onShow", z, str, (String) null);
            NativeAdDisplayListener nativeAdDisplayListener = nativeAdDetails.f38368j;
            if (nativeAdDisplayListener != null) {
                nativeAdDisplayListener.adDisplayed(nativeAdDetails);
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.nativead.NativeAdDetails$b */
    /* compiled from: Sta */
    public class C9319b implements C8960g1.C8963b {

        /* renamed from: a */
        public int f38372a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f38373b;

        public C9319b(Runnable runnable) {
            this.f38373b = runnable;
        }

        /* renamed from: a */
        public void mo29358a(Bitmap bitmap, int i) {
            if (i == 0) {
                NativeAdDetails.this.f38360b = bitmap;
            } else {
                NativeAdDetails.this.f38361c = bitmap;
            }
            int i2 = this.f38372a + 1;
            this.f38372a = i2;
            if (i2 == 2) {
                this.f38373b.run();
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.nativead.NativeAdDetails$c */
    /* compiled from: Sta */
    public class C9320c implements View.OnClickListener {
        public C9320c() {
        }

        public void onClick(View view) {
            NativeAdDetails.m49399a(NativeAdDetails.this, view);
        }
    }

    /* renamed from: com.startapp.sdk.ads.nativead.NativeAdDetails$d */
    /* compiled from: Sta */
    public class C9321d implements View.OnClickListener {
        public C9321d() {
        }

        public void onClick(View view) {
            NativeAdDetails.m49399a(NativeAdDetails.this, view);
        }
    }

    /* renamed from: com.startapp.sdk.ads.nativead.NativeAdDetails$e */
    /* compiled from: Sta */
    public class C9322e implements C8988gd.C8989a {
        public C9322e() {
        }
    }

    /* renamed from: com.startapp.sdk.ads.nativead.NativeAdDetails$f */
    /* compiled from: Sta */
    public static /* synthetic */ class C9323f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38378a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.startapp.sdk.ads.nativead.StartAppNativeAd$CampaignAction[] r0 = com.startapp.sdk.ads.nativead.StartAppNativeAd.CampaignAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38378a = r0
                com.startapp.sdk.ads.nativead.StartAppNativeAd$CampaignAction r1 = com.startapp.sdk.ads.nativead.StartAppNativeAd.CampaignAction.OPEN_MARKET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38378a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.nativead.StartAppNativeAd$CampaignAction r1 = com.startapp.sdk.ads.nativead.StartAppNativeAd.CampaignAction.LAUNCH_APP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.nativead.NativeAdDetails.C9323f.<clinit>():void");
        }
    }

    public NativeAdDetails(AdDetails adDetails) {
        this.f38359a = adDetails;
    }

    /* renamed from: a */
    public static void m49399a(NativeAdDetails nativeAdDetails, View view) {
        nativeAdDetails.getClass();
        Context context = view.getContext();
        int i = C9323f.f38378a[nativeAdDetails.getCampaignAction().ordinal()];
        if (i == 1) {
            boolean a = C9396a.m49790a(context, AdPreferences.Placement.INAPP_NATIVE);
            if (!nativeAdDetails.f38359a.mo30824A() || a) {
                C9396a.m49781a(context, nativeAdDetails.f38359a.mo30834g(), nativeAdDetails.f38359a.mo30849u(), new TrackingParams(nativeAdDetails.f38364f), nativeAdDetails.f38359a.mo30825B() && !a, false);
            } else {
                C9396a.m49782a(context, nativeAdDetails.f38359a.mo30834g(), nativeAdDetails.f38359a.mo30849u(), nativeAdDetails.f38359a.mo30843p(), new TrackingParams(nativeAdDetails.f38364f), AdsCommonMetaData.f38625h.mo30481z(), AdsCommonMetaData.f38625h.mo30480y(), nativeAdDetails.f38359a.mo30825B(), nativeAdDetails.f38359a.mo30826C(), false, (Runnable) null);
            }
        } else if (i == 2) {
            C9396a.m49785a(nativeAdDetails.getPackageName(), nativeAdDetails.f38359a.mo30839l(), nativeAdDetails.f38359a.mo30834g(), context, new TrackingParams(nativeAdDetails.f38364f));
        }
        NativeAdDisplayListener nativeAdDisplayListener = nativeAdDetails.f38368j;
        if (nativeAdDisplayListener != null) {
            nativeAdDisplayListener.adClicked(nativeAdDetails);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        unregisterView();
    }

    public String getCallToAction() {
        String e;
        AdDetails adDetails = this.f38359a;
        if (adDetails == null || (e = adDetails.mo30832e()) == null) {
            return "";
        }
        return e;
    }

    public StartAppNativeAd.CampaignAction getCampaignAction() {
        StartAppNativeAd.CampaignAction campaignAction = StartAppNativeAd.CampaignAction.OPEN_MARKET;
        AdDetails adDetails = this.f38359a;
        return (adDetails == null || !adDetails.mo30855z()) ? campaignAction : StartAppNativeAd.CampaignAction.LAUNCH_APP;
    }

    public String getCategory() {
        String f;
        AdDetails adDetails = this.f38359a;
        if (adDetails == null || (f = adDetails.mo30833f()) == null) {
            return "";
        }
        return f;
    }

    public String getDescription() {
        String i;
        AdDetails adDetails = this.f38359a;
        if (adDetails == null || (i = adDetails.mo30836i()) == null) {
            return "";
        }
        return i;
    }

    public Bitmap getImageBitmap() {
        return this.f38360b;
    }

    public String getImageUrl() {
        AdDetails adDetails = this.f38359a;
        if (adDetails != null) {
            return adDetails.mo30837j();
        }
        return null;
    }

    public String getInstalls() {
        String k;
        AdDetails adDetails = this.f38359a;
        if (adDetails == null || (k = adDetails.mo30838k()) == null) {
            return "";
        }
        return k;
    }

    public String getPackageName() {
        String p;
        AdDetails adDetails = this.f38359a;
        if (adDetails == null || (p = adDetails.mo30843p()) == null) {
            return "";
        }
        return p;
    }

    public float getRating() {
        AdDetails adDetails = this.f38359a;
        if (adDetails != null) {
            return adDetails.mo30844q();
        }
        return 5.0f;
    }

    public Bitmap getSecondaryImageBitmap() {
        return this.f38361c;
    }

    public String getSecondaryImageUrl() {
        AdDetails adDetails = this.f38359a;
        if (adDetails != null) {
            return adDetails.mo30845r();
        }
        return null;
    }

    public String getTitle() {
        String t;
        AdDetails adDetails = this.f38359a;
        if (adDetails == null || (t = adDetails.mo30847t()) == null) {
            return "";
        }
        return t;
    }

    public boolean isApp() {
        AdDetails adDetails = this.f38359a;
        if (adDetails != null) {
            return adDetails.mo30854y();
        }
        return true;
    }

    public boolean isBelowMinCPM() {
        AdDetails adDetails = this.f38359a;
        return adDetails != null && adDetails.mo30841n();
    }

    public void loadImages(Context context, Runnable runnable) {
        C9319b bVar = new C9319b(runnable);
        new C8960g1(context, getImageUrl(), bVar, 0).mo29368a();
        new C8960g1(context, getSecondaryImageUrl(), bVar, 1).mo29368a();
    }

    public void registerViewForInteraction(View view) {
        mo30146a(view);
        ((View) this.f38366h.get()).setOnClickListener(new C9320c());
    }

    public String toString() {
        String description = getDescription();
        if (description != null) {
            description = description.substring(0, Math.min(30, description.length()));
        }
        StringBuilder a = C8870c1.m48422a("         Title: [");
        a.append(getTitle());
        a.append("]\n         Description: [");
        a.append(description);
        a.append("]...\n         Rating: [");
        a.append(getRating());
        a.append("]\n         Installs: [");
        a.append(getInstalls());
        a.append("]\n         Category: [");
        a.append(getCategory());
        a.append("]\n         PackageName: [");
        a.append(getPackageName());
        a.append("]\n         CampaginAction: [");
        a.append(getCampaignAction());
        a.append("]\n");
        return a.toString();
    }

    public void unregisterView() {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        C8988gd gdVar = this.f38365g;
        if (gdVar != null) {
            gdVar.mo29438a();
            this.f38365g = null;
        }
        View view = (View) this.f38366h.get();
        this.f38366h.clear();
        if (view != null && Build.VERSION.SDK_INT >= 12 && (onAttachStateChangeListener = this.f38367i) != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    public void registerViewForInteraction(View view, List<View> list) {
        registerViewForInteraction(view, list, (NativeAdDisplayListener) null);
    }

    public void registerViewForInteraction(View view, List<View> list, NativeAdDisplayListener nativeAdDisplayListener) {
        if (list == null || list.isEmpty() || this.f38366h.get() != null) {
            registerViewForInteraction(view);
        } else {
            C9321d dVar = new C9321d();
            for (View onClickListener : list) {
                onClickListener.setOnClickListener(dVar);
            }
            mo30146a(view);
        }
        this.f38368j = nativeAdDisplayListener;
    }

    /* renamed from: a */
    public final void mo30146a(View view) {
        this.f38366h = new WeakReference<>(view);
        if (view.hasWindowFocus() || Build.VERSION.SDK_INT < 12) {
            mo30145a();
            return;
        }
        if (this.f38367i == null) {
            this.f38367i = new C8950f7(this);
        }
        view.addOnAttachStateChangeListener(this.f38367i);
    }

    /* renamed from: a */
    public final void mo30145a() {
        long j;
        if (this.f38365g == null && !this.f38362d) {
            View view = (View) this.f38366h.get();
            if (view == null) {
                NativeAdDisplayListener nativeAdDisplayListener = this.f38368j;
                if (nativeAdDisplayListener != null) {
                    nativeAdDisplayListener.adNotDisplayed(this);
                    return;
                }
                return;
            }
            Context context = view.getContext();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_NATIVE;
            AdDetails adDetails = this.f38359a;
            String[] w = adDetails != null ? adDetails.mo30851w() : null;
            TrackingParams trackingParams = new TrackingParams(this.f38364f);
            if (this.f38359a.mo30835h() != null) {
                j = TimeUnit.SECONDS.toMillis(this.f38359a.mo30835h().longValue());
            } else {
                j = TimeUnit.SECONDS.toMillis(MetaData.f38952k.mo31037r());
            }
            C9087k9 k9Var = new C9087k9(context, placement, w, trackingParams, j);
            k9Var.mo29607a(this.f38370l);
            C8988gd gdVar = new C8988gd(this.f38366h, k9Var, BannerMetaData.f38219b.mo29957a());
            this.f38365g = gdVar;
            gdVar.f36878c = new C9322e();
            if (gdVar.mo29439b()) {
                gdVar.run();
            }
        }
    }
}
