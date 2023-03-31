package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.C8870c1;
import com.startapp.C8920e;
import com.startapp.C8938f;
import com.startapp.C9055k;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class StartAppNativeAd extends C9381Ad {
    private static final long serialVersionUID = -5904557568580515558L;
    private boolean belowMinCpm;
    private List<NativeAdDetails> listNativeAds = Collections.emptyList();
    /* access modifiers changed from: private */
    public final AtomicBoolean loading = new AtomicBoolean();
    private NativeAdPreferences preferences;

    /* compiled from: Sta */
    public enum CampaignAction {
        LAUNCH_APP,
        OPEN_MARKET
    }

    /* renamed from: com.startapp.sdk.ads.nativead.StartAppNativeAd$a */
    /* compiled from: Sta */
    public class C9324a implements Runnable {

        /* renamed from: a */
        public int f38379a;

        /* renamed from: b */
        public final /* synthetic */ int f38380b;

        /* renamed from: d */
        public final /* synthetic */ AdEventListener f38382d;

        public C9324a(int i, AdEventListener adEventListener) {
            this.f38380b = i;
            this.f38382d = adEventListener;
        }

        public void run() {
            int i = this.f38379a + 1;
            this.f38379a = i;
            if (i == this.f38380b) {
                StartAppNativeAd.this.mo30192a(this.f38382d);
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.nativead.StartAppNativeAd$c */
    /* compiled from: Sta */
    public class C9325c implements AdEventListener {

        /* renamed from: a */
        public final /* synthetic */ NativeAd f38383a;

        /* renamed from: b */
        public final /* synthetic */ NativeAdPreferences f38384b;

        /* renamed from: c */
        public final /* synthetic */ AdEventListener f38385c;

        public C9325c(NativeAd nativeAd, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
            this.f38383a = nativeAd;
            this.f38384b = nativeAdPreferences;
            this.f38385c = adEventListener;
        }

        public void onFailedToReceiveAd(C9381Ad ad) {
            if (ad != null) {
                StartAppNativeAd.this.setErrorMessage(ad.getErrorMessage());
            }
            StartAppNativeAd startAppNativeAd = StartAppNativeAd.this;
            C9055k.m48716a(startAppNativeAd.f38612a, this.f38385c, startAppNativeAd, false);
            StartAppNativeAd.this.loading.set(false);
        }

        public void onReceiveAd(C9381Ad ad) {
            StartAppNativeAd.this.mo30191a(this.f38383a, this.f38384b, this.f38385c);
        }
    }

    public StartAppNativeAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_NATIVE);
    }

    public static String getPrivacyImageUrl() {
        return AdInformationMetaData.f38717a.mo30605d();
    }

    public static String getPrivacyURL() {
        if (AdInformationMetaData.f38717a.mo30604b() == null) {
            return "";
        }
        String b = AdInformationMetaData.f38717a.mo30604b();
        if (b.contains("http://") || b.contains("https://")) {
            return AdInformationMetaData.f38717a.mo30604b();
        }
        StringBuilder a = C8870c1.m48422a("https://");
        a.append(AdInformationMetaData.f38717a.mo30604b());
        return a.toString();
    }

    /* renamed from: a */
    public void mo30023a(AdPreferences adPreferences, AdEventListener adEventListener) {
    }

    /* renamed from: g */
    public final AdDetails mo30193g() {
        NativeAdDetails nativeAdDetails;
        if (this.listNativeAds.size() <= 0 || (nativeAdDetails = this.listNativeAds.get(0)) == null) {
            return null;
        }
        return nativeAdDetails.f38359a;
    }

    public String getAdId() {
        AdDetails g = mo30193g();
        if (g != null) {
            return g.mo30827a();
        }
        return null;
    }

    public String getBidToken() {
        AdDetails g = mo30193g();
        if (g != null) {
            return g.mo30830d();
        }
        return null;
    }

    public ArrayList<NativeAdDetails> getNativeAds() {
        return getNativeAds((String) null);
    }

    public int getNumberOfAds() {
        return this.listNativeAds.size();
    }

    public boolean isBelowMinCPM() {
        return this.belowMinCpm;
    }

    @Deprecated
    public boolean loadAd(NativeAdPreferences nativeAdPreferences) {
        this.preferences = nativeAdPreferences != null ? new NativeAdPreferences(nativeAdPreferences) : null;
        return loadAd((AdEventListener) null);
    }

    /* renamed from: a */
    public void mo30191a(NativeAd nativeAd, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        int size;
        this.belowMinCpm = nativeAd.isBelowMinCPM();
        List<AdDetails> g = nativeAd.mo30512g();
        if (g == null || (size = g.size()) <= 0) {
            mo30192a(adEventListener);
            return;
        }
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new NativeAdDetails(g.get(i)));
        }
        this.listNativeAds = Collections.unmodifiableList(arrayList);
        if (nativeAdPreferences.isAutoBitmapDownload()) {
            C9324a aVar = new C9324a(size, adEventListener);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((NativeAdDetails) it.next()).loadImages(this.f38612a, aVar);
            }
            return;
        }
        mo30192a(adEventListener);
    }

    public ArrayList<NativeAdDetails> getNativeAds(String str) {
        ArrayList<NativeAdDetails> arrayList = new ArrayList<>();
        AdRulesResult a = AdaptMetaData.f38768a.mo30647a().mo30640a(AdPreferences.Placement.INAPP_NATIVE, str);
        if (a.mo30646b()) {
            for (NativeAdDetails next : this.listNativeAds) {
                next.f38364f = str;
                arrayList.add(next);
            }
            C8938f.f36742d.mo29342a(new C8920e(AdPreferences.Placement.INAPP_NATIVE, str));
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (NativeAdDetails nativeAdDetails : this.listNativeAds) {
                arrayList2.add(nativeAdDetails.f38359a);
            }
            C9396a.m49786a(C9396a.m49792a((List<AdDetails>) arrayList2), str, 0, a.mo30645a());
        }
        return arrayList;
    }

    @Deprecated
    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        this.preferences = nativeAdPreferences != null ? new NativeAdPreferences(nativeAdPreferences) : null;
        return loadAd(adEventListener);
    }

    @Deprecated
    public boolean loadAd() {
        return loadAd((AdEventListener) null);
    }

    public boolean loadAd(AdEventListener adEventListener) {
        if (!this.loading.compareAndSet(false, true)) {
            setErrorMessage("Ad is currently being loaded");
            return false;
        }
        this.belowMinCpm = false;
        this.listNativeAds = Collections.emptyList();
        NativeAdPreferences nativeAdPreferences = this.preferences;
        if (nativeAdPreferences == null) {
            nativeAdPreferences = new NativeAdPreferences();
            this.preferences = nativeAdPreferences;
        }
        if (nativeAdPreferences.getPlacementId() == null) {
            nativeAdPreferences.setPlacementId(C9396a.m49772a(this.f38612a, (Object) this));
        }
        NativeAd nativeAd = new NativeAd(this.f38612a, nativeAdPreferences);
        return nativeAd.load(nativeAdPreferences, new C9325c(nativeAd, nativeAdPreferences, adEventListener), true);
    }

    /* renamed from: a */
    public final void mo30192a(AdEventListener adEventListener) {
        setErrorMessage((String) null);
        C9055k.m48717b(this.f38612a, adEventListener, this, false);
        this.loading.set(false);
    }
}
