package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import android.content.Context;
import com.startapp.C8870c1;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9058k0;
import com.startapp.C9254r1;
import com.startapp.C9605vb;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9440d;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.C9419h;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.startapp.sdk.adsbase.cache.d */
/* compiled from: Sta */
public class C9410d {

    /* renamed from: h */
    public static C9410d f38788h = new C9410d();

    /* renamed from: a */
    public final Map<CacheKey, C9419h> f38789a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map<String, String> f38790b = new WeakHashMap();

    /* renamed from: c */
    public boolean f38791c = false;

    /* renamed from: d */
    public boolean f38792d = false;

    /* renamed from: e */
    public Queue<C9415e> f38793e = new ConcurrentLinkedQueue();

    /* renamed from: f */
    public C9419h.C9421b f38794f;

    /* renamed from: g */
    public Context f38795g;

    /* renamed from: com.startapp.sdk.adsbase.cache.d$a */
    /* compiled from: Sta */
    public class C9411a implements AdEventListener {

        /* renamed from: a */
        public final /* synthetic */ C9414d f38796a;

        /* renamed from: b */
        public final /* synthetic */ CacheKey f38797b;

        public C9411a(C9410d dVar, C9414d dVar2, CacheKey cacheKey) {
            this.f38796a = dVar2;
            this.f38797b = cacheKey;
        }

        public void onFailedToReceiveAd(C9381Ad ad) {
            C9414d dVar = this.f38796a;
            if (dVar != null) {
                dVar.mo30269a(ad, this.f38797b, false);
            }
        }

        public void onReceiveAd(C9381Ad ad) {
            C9414d dVar = this.f38796a;
            if (dVar != null) {
                dVar.mo30269a(ad, this.f38797b, true);
            }
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.d$b */
    /* compiled from: Sta */
    public class C9412b implements AdEventListener {

        /* renamed from: a */
        public final /* synthetic */ C9414d f38798a;

        /* renamed from: b */
        public final /* synthetic */ CacheKey f38799b;

        public C9412b(C9410d dVar, C9414d dVar2, CacheKey cacheKey) {
            this.f38798a = dVar2;
            this.f38799b = cacheKey;
        }

        public void onFailedToReceiveAd(C9381Ad ad) {
            C9414d dVar = this.f38798a;
            if (dVar != null) {
                dVar.mo30269a(ad, this.f38799b, false);
            }
        }

        public void onReceiveAd(C9381Ad ad) {
            C9414d dVar = this.f38798a;
            if (dVar != null) {
                dVar.mo30269a(ad, this.f38799b, true);
            }
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.d$c */
    /* compiled from: Sta */
    public static /* synthetic */ class C9413c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38800a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f38801b;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|24) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|19|20|21|22|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        static {
            /*
                com.startapp.sdk.adsbase.StartAppAd$AdMode[] r0 = com.startapp.sdk.adsbase.StartAppAd.AdMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38801b = r0
                r1 = 1
                com.startapp.sdk.adsbase.StartAppAd$AdMode r2 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f38801b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r3 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OVERLAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f38801b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r4 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f38801b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r4 = com.startapp.sdk.adsbase.StartAppAd.AdMode.VIDEO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f38801b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r4 = com.startapp.sdk.adsbase.StartAppAd.AdMode.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f38801b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r4 = com.startapp.sdk.adsbase.StartAppAd.AdMode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.startapp.sdk.adsbase.model.AdPreferences$Placement[] r3 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f38800a = r3
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = f38800a     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 7
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.C9410d.C9413c.<clinit>():void");
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.d$d */
    /* compiled from: Sta */
    public interface C9414d {
        /* renamed from: a */
        void mo30269a(C9381Ad ad, CacheKey cacheKey, boolean z);
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.d$e */
    /* compiled from: Sta */
    public class C9415e {

        /* renamed from: a */
        public StartAppAd f38802a;

        /* renamed from: b */
        public AdPreferences.Placement f38803b;

        /* renamed from: c */
        public AdPreferences f38804c;

        /* renamed from: d */
        public AdEventListener f38805d;

        public C9415e(C9410d dVar, StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, AdEventListener adEventListener) {
            this.f38802a = startAppAd;
            this.f38803b = placement;
            this.f38804c = adPreferences;
            this.f38805d = adEventListener;
        }
    }

    /* renamed from: a */
    public void mo30698a(Context context, StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, C9414d dVar, boolean z, int i) {
        C9419h hVar;
        Context a = C9058k0.m48718a(context);
        if (a != null) {
            context = a;
        }
        this.f38795g = context;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        CacheKey cacheKey = new CacheKey(placement, adPreferences2);
        if (!this.f38792d || z) {
            AdPreferences adPreferences3 = new AdPreferences(adPreferences2);
            synchronized (this.f38789a) {
                hVar = this.f38789a.get(cacheKey);
                if (hVar == null) {
                    if (placement.ordinal() != 3) {
                        hVar = new C9419h(this.f38795g, placement, adPreferences3);
                    } else {
                        hVar = new C9419h(this.f38795g, placement, adPreferences3);
                        hVar.f38824n = false;
                    }
                    if (this.f38794f == null) {
                        this.f38794f = new C9416e(this);
                    }
                    hVar.f38826p = this.f38794f;
                    if (z) {
                        hVar.f38818h = mo30702b(cacheKey);
                        hVar.f38819i = true;
                        hVar.f38823m = i;
                    }
                    mo30699a(cacheKey, hVar);
                } else {
                    hVar.f38814d = adPreferences3;
                }
            }
            hVar.mo30709a(startAppAd, new C9412b(this, dVar, cacheKey), false, true);
            return;
        }
        this.f38793e.add(new C9415e(this, startAppAd, placement, adPreferences2, new C9411a(this, dVar, cacheKey)));
    }

    /* renamed from: b */
    public String mo30702b(CacheKey cacheKey) {
        return String.valueOf(cacheKey.hashCode()).replace('-', '_');
    }

    /* renamed from: c */
    public C9440d mo30704c(CacheKey cacheKey) {
        C9419h hVar;
        if (cacheKey == null || (hVar = this.f38789a.get(cacheKey)) == null || !hVar.mo30713c()) {
            return null;
        }
        C9440d dVar = hVar.f38815e;
        hVar.f38823m = 0;
        hVar.f38825o = null;
        if (!AdsConstants.f38631f.booleanValue() && hVar.f38824n && CacheMetaData.m49873d()) {
            hVar.mo30709a((StartAppAd) null, (AdEventListener) null, true, true);
        } else if (!hVar.f38824n) {
            C9419h.C9421b bVar = hVar.f38826p;
            if (bVar != null) {
                ((C9416e) bVar).mo30705a(hVar);
            }
            C9254r1 r1Var = hVar.f38820j;
            if (r1Var != null) {
                r1Var.mo29850e();
            }
        }
        return dVar;
    }

    /* renamed from: b */
    public void mo30703b(AdPreferences.Placement placement) {
        synchronized (this.f38789a) {
            Iterator<Map.Entry<CacheKey, C9419h>> it = this.f38789a.entrySet().iterator();
            while (it.hasNext()) {
                if (((CacheKey) it.next().getKey()).mo30672a() == placement) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public C9440d mo30695a(CacheKey cacheKey) {
        C9419h hVar = cacheKey != null ? this.f38789a.get(cacheKey) : null;
        if (hVar != null) {
            return hVar.f38815e;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30700a(boolean r7) {
        /*
            r6 = this;
            java.util.Map<com.startapp.sdk.adsbase.cache.CacheKey, com.startapp.sdk.adsbase.cache.h> r0 = r6.f38789a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r0.next()
            com.startapp.sdk.adsbase.cache.h r1 = (com.startapp.sdk.adsbase.cache.C9419h) r1
            com.startapp.sdk.adsbase.d r2 = r1.f38815e
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x003c
            java.util.Map<android.app.Activity, java.lang.Integer> r5 = com.startapp.C9605vb.f39316a
            boolean r2 = r2 instanceof com.startapp.sdk.ads.interstitials.ReturnAd
            if (r2 == 0) goto L_0x003c
            if (r7 != 0) goto L_0x003c
            com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f38782a
            com.startapp.sdk.adsbase.cache.ACMConfig r2 = r2.mo30676a()
            boolean r2 = r2.mo30670g()
            if (r2 != 0) goto L_0x0047
            com.startapp.r1 r2 = r1.f38820j
            android.os.Handler r5 = r2.f38108b
            if (r5 == 0) goto L_0x0039
            r5.removeCallbacksAndMessages(r3)
        L_0x0039:
            r2.f38110d = r4
            goto L_0x0047
        L_0x003c:
            com.startapp.r1 r2 = r1.f38820j
            android.os.Handler r5 = r2.f38108b
            if (r5 == 0) goto L_0x0045
            r5.removeCallbacksAndMessages(r3)
        L_0x0045:
            r2.f38110d = r4
        L_0x0047:
            com.startapp.p1 r1 = r1.f38821k
            android.os.Handler r2 = r1.f38108b
            if (r2 == 0) goto L_0x0050
            r2.removeCallbacksAndMessages(r3)
        L_0x0050:
            r1.f38110d = r4
            goto L_0x000a
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.C9410d.mo30700a(boolean):void");
    }

    /* renamed from: a */
    public void mo30697a(Context context, StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, C9414d dVar) {
        mo30698a(context, (StartAppAd) null, placement, adPreferences, dVar, false, 0);
    }

    /* renamed from: a */
    public final void mo30699a(CacheKey cacheKey, C9419h hVar) {
        synchronized (this.f38789a) {
            int d = CacheMetaData.f38782a.mo30676a().mo30666d();
            if (d != 0 && this.f38789a.size() >= d) {
                long j = Long.MAX_VALUE;
                CacheKey cacheKey2 = null;
                for (CacheKey next : this.f38789a.keySet()) {
                    C9419h hVar2 = this.f38789a.get(next);
                    if (hVar2.f38811a == hVar.f38811a) {
                        long j2 = hVar2.f38817g;
                        if (j2 < j) {
                            cacheKey2 = next;
                            j = j2;
                        }
                    }
                }
                if (cacheKey2 != null) {
                    this.f38789a.remove(cacheKey2);
                }
            }
            this.f38789a.put(cacheKey, hVar);
            if (Math.random() * 100.0d < ((double) CacheMetaData.f38782a.mo30677c())) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
                i4Var.f36952d = "Cache Size";
                i4Var.f36953e = String.valueOf(this.f38789a.size());
                i4Var.mo29471a();
            }
        }
    }

    /* renamed from: a */
    public void mo30696a(Context context, StartAppAd startAppAd, StartAppAd.AdMode adMode, AdPreferences adPreferences, C9414d dVar) {
        AdPreferences.Placement placement;
        switch (C9413c.f38801b[adMode.ordinal()]) {
            case 1:
                Map<Activity, Integer> map = C9605vb.f39316a;
                placement = AdPreferences.Placement.INAPP_OFFER_WALL;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                placement = AdPreferences.Placement.INAPP_OVERLAY;
                break;
            case 6:
                Map<Activity, Integer> map2 = C9605vb.f39316a;
                if (new Random().nextInt(100) >= AdsCommonMetaData.f38625h.mo30465i()) {
                    placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                    break;
                } else {
                    if ((new Random().nextInt(100) >= AdsCommonMetaData.f38625h.mo30466j() && !adPreferences.isForceFullpage()) || adPreferences.isForceOverlay()) {
                        placement = AdPreferences.Placement.INAPP_OVERLAY;
                        break;
                    } else {
                        placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                        break;
                    }
                }
                break;
            default:
                placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                break;
        }
        AdPreferences.Placement placement2 = placement;
        if (adMode.equals(StartAppAd.AdMode.REWARDED_VIDEO)) {
            adPreferences.setType(C9381Ad.AdType.REWARDED_VIDEO);
        } else if (adMode.equals(StartAppAd.AdMode.VIDEO)) {
            adPreferences.setType(C9381Ad.AdType.VIDEO);
        }
        mo30698a(context, startAppAd, placement2, adPreferences, dVar, false, 0);
    }

    /* renamed from: a */
    public boolean mo30701a(AdPreferences.Placement placement) {
        int ordinal = placement.ordinal();
        if (ordinal == 3) {
            Object obj = StartAppSDKInternal.f38662D;
            if (!(!StartAppSDKInternal.C9395d.f38707a.f38689w) || AdsCommonMetaData.f38625h.mo30450L()) {
                return false;
            }
            return true;
        } else if (ordinal != 7) {
            return true;
        } else {
            Object obj2 = StartAppSDKInternal.f38662D;
            if (!StartAppSDKInternal.C9395d.f38707a.f38687u || AdsCommonMetaData.f38625h.mo30449K()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static String m49893a(StartAppAd.AdMode adMode) {
        StringBuilder a = C8870c1.m48422a("autoLoadNotShownAdPrefix");
        a.append(adMode.name());
        return a.toString();
    }
}
