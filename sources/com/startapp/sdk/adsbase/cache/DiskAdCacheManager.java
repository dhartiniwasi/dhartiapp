package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import android.content.Context;
import com.startapp.C8823a6;
import com.startapp.C8939f0;
import com.startapp.C8959g0;
import com.startapp.C9055k;
import com.startapp.C9255r2;
import com.startapp.C9605vb;
import com.startapp.C9677z5;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9440d;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class DiskAdCacheManager {

    /* compiled from: Sta */
    public static class DiskCacheKey implements Serializable {
        private static final long serialVersionUID = 1;
        public AdPreferences adPreferences;
        private int numberOfLoadedAd;
        public AdPreferences.Placement placement;

        public DiskCacheKey(AdPreferences.Placement placement2, AdPreferences adPreferences2) {
            this.placement = placement2;
            this.adPreferences = adPreferences2;
        }

        /* renamed from: a */
        public int mo30685a() {
            return this.numberOfLoadedAd;
        }

        /* renamed from: a */
        public void mo30686a(int i) {
            this.numberOfLoadedAd = i;
        }
    }

    /* compiled from: Sta */
    public static class DiskCachedAd implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: ad */
        private C9440d f38783ad;
        private String html;

        public DiskCachedAd(C9440d dVar) {
            mo30688a(dVar);
            mo30690c();
        }

        /* renamed from: a */
        public C9440d mo30687a() {
            return this.f38783ad;
        }

        /* renamed from: b */
        public String mo30689b() {
            return this.html;
        }

        /* renamed from: c */
        public final void mo30690c() {
            C9440d dVar = this.f38783ad;
            if (dVar != null && (dVar instanceof HtmlAd)) {
                this.html = ((HtmlAd) dVar).mo30499j();
            }
        }

        /* renamed from: a */
        public final void mo30688a(C9440d dVar) {
            this.f38783ad = dVar;
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.DiskAdCacheManager$a */
    /* compiled from: Sta */
    public interface C9404a {
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.DiskAdCacheManager$b */
    /* compiled from: Sta */
    public interface C9405b {
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.DiskAdCacheManager$c */
    /* compiled from: Sta */
    public interface C9406c {
    }

    /* renamed from: a */
    public static void m49881a(Context context, AdEventListener adEventListener) {
        C9055k.m48716a(context, adEventListener, (C9381Ad) null, true);
    }

    /* renamed from: b */
    public static String m49883b() {
        return "startapp_ads".concat(File.separator).concat("keys");
    }

    /* renamed from: a */
    public static String m49880a() {
        return "startapp_ads".concat(File.separator).concat("interstitials");
    }

    /* renamed from: a */
    public static void m49882a(Context context, DiskCachedAd diskCachedAd, C9404a aVar, AdEventListener adEventListener) {
        C9440d a = diskCachedAd.mo30687a();
        a.setContext(context);
        Map<Activity, Integer> map = C9605vb.f39316a;
        boolean z = true;
        if (a instanceof InterstitialAd) {
            InterstitialAd interstitialAd = (InterstitialAd) a;
            String b = diskCachedAd.mo30689b();
            if (b == null || b.equals("")) {
                m49881a(context, adEventListener);
                return;
            }
            if (AdsCommonMetaData.f38625h.mo30446H()) {
                List<AppPresenceDetails> a2 = C8959g0.m48603a(b, 0);
                ArrayList arrayList = new ArrayList();
                if (C8959g0.m48601a(context, a2, 0, (Set<String>) new HashSet(), (List<AppPresenceDetails>) arrayList).booleanValue()) {
                    new C8939f0(context, arrayList).mo29345a();
                    z = false;
                }
            }
            if (!z) {
                m49881a(context, adEventListener);
                return;
            }
            C9410d dVar = C9410d.f38788h;
            dVar.f38790b.put(interstitialAd.mo30500k(), b);
            ((C9418g) aVar).f38810a.f38815e = interstitialAd;
            ComponentLocator.m50248a(context).f39034b.mo29904a().mo29624a(b, new C9255r2(context, adEventListener, interstitialAd));
        } else if (a instanceof OfferWall3DAd) {
            OfferWall3DAd offerWall3DAd = (OfferWall3DAd) a;
            List<AdDetails> g = offerWall3DAd.mo30512g();
            if (g == null) {
                m49881a(context, adEventListener);
                return;
            }
            if (AdsCommonMetaData.f38625h.mo30446H()) {
                g = C8959g0.m48602a(context, g, 0, (Set<String>) new HashSet(), true);
            }
            if (g.size() > 0) {
                ((C9418g) aVar).f38810a.f38815e = offerWall3DAd;
                C9677z5 a3 = C8823a6.f36412b.mo29085a(offerWall3DAd.mo30205h());
                a3.getClass();
                a3.f39553b = new ArrayList();
                a3.f39554c = "";
                for (AdDetails a4 : g) {
                    a3.mo31514a(a4);
                }
                C9055k.m48717b(context, adEventListener, offerWall3DAd, true);
                return;
            }
            m49881a(context, adEventListener);
        } else {
            m49881a(context, adEventListener);
        }
    }
}
