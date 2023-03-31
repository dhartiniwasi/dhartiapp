package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.startapp.C8870c1;
import com.startapp.C9023i4;
import com.startapp.C9055k;
import com.startapp.C9058k0;
import com.startapp.C9207p1;
import com.startapp.C9254r1;
import com.startapp.C9605vb;
import com.startapp.sdk.ads.interstitials.OverlayAd;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.ads.offerWall.offerWallHtml.OfferWallAd;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.ads.video.VideoEnabledAd;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9440d;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.startapp.sdk.adsbase.cache.h */
/* compiled from: Sta */
public class C9419h {

    /* renamed from: a */
    public final AdPreferences.Placement f38811a;

    /* renamed from: b */
    public Context f38812b;

    /* renamed from: c */
    public ActivityExtra f38813c;

    /* renamed from: d */
    public AdPreferences f38814d;

    /* renamed from: e */
    public C9440d f38815e = null;

    /* renamed from: f */
    public AtomicBoolean f38816f = new AtomicBoolean(false);

    /* renamed from: g */
    public long f38817g;

    /* renamed from: h */
    public String f38818h = null;

    /* renamed from: i */
    public boolean f38819i = false;

    /* renamed from: j */
    public C9254r1 f38820j = null;

    /* renamed from: k */
    public C9207p1 f38821k = null;

    /* renamed from: l */
    public final Map<AdEventListener, List<StartAppAd>> f38822l = new ConcurrentHashMap();

    /* renamed from: m */
    public int f38823m;

    /* renamed from: n */
    public boolean f38824n = true;

    /* renamed from: o */
    public Long f38825o;

    /* renamed from: p */
    public C9421b f38826p;

    /* renamed from: com.startapp.sdk.adsbase.cache.h$a */
    /* compiled from: Sta */
    public class C9420a implements AdEventListener {

        /* renamed from: a */
        public boolean f38827a = false;

        /* renamed from: b */
        public boolean f38828b = false;

        public C9420a() {
        }

        public void onFailedToReceiveAd(C9381Ad ad) {
            List<StartAppAd> a;
            ConcurrentHashMap concurrentHashMap;
            ConcurrentHashMap concurrentHashMap2 = null;
            if (!this.f38828b) {
                synchronized (C9419h.this.f38822l) {
                    concurrentHashMap = new ConcurrentHashMap(C9419h.this.f38822l);
                    C9419h hVar = C9419h.this;
                    hVar.f38815e = null;
                    hVar.f38822l.clear();
                }
                concurrentHashMap2 = concurrentHashMap;
            }
            if (concurrentHashMap2 != null) {
                for (AdEventListener adEventListener : concurrentHashMap2.keySet()) {
                    if (!(adEventListener == null || (a = C9419h.this.mo30706a(concurrentHashMap2, adEventListener)) == null)) {
                        for (StartAppAd next : a) {
                            if (ad != null) {
                                next.setErrorMessage(ad.getErrorMessage());
                            }
                            C9055k.m48716a(C9419h.this.f38812b, adEventListener, next, true);
                        }
                    }
                }
            }
            this.f38828b = true;
            C9419h.this.f38821k.mo29849d();
            C9419h.this.f38820j.mo29850e();
            C9419h.this.f38816f.set(false);
        }

        public void onReceiveAd(C9381Ad ad) {
            C9440d dVar = C9419h.this.f38815e;
            boolean z = dVar != null && dVar.mo30087a();
            if (!this.f38827a && !z) {
                this.f38827a = true;
                synchronized (C9419h.this.f38822l) {
                    for (AdEventListener next : C9419h.this.f38822l.keySet()) {
                        if (next != null) {
                            C9419h hVar = C9419h.this;
                            List<StartAppAd> a = hVar.mo30706a(hVar.f38822l, next);
                            if (a != null) {
                                for (StartAppAd errorMessage : a) {
                                    errorMessage.setErrorMessage(ad.getErrorMessage());
                                    C9055k.m48717b(C9419h.this.f38812b, next, ad, true);
                                }
                            }
                        }
                    }
                    C9419h.this.f38822l.clear();
                }
            }
            C9419h.this.f38820j.mo29849d();
            C9419h.this.f38821k.mo29807f();
            C9419h.this.f38816f.set(false);
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.h$b */
    /* compiled from: Sta */
    public interface C9421b {
    }

    public C9419h(Context context, AdPreferences.Placement placement, AdPreferences adPreferences) {
        this.f38811a = placement;
        this.f38814d = adPreferences;
        mo30708a(context);
        mo30707a();
    }

    /* renamed from: a */
    public final void mo30710a(boolean z) {
        C9440d dVar;
        boolean z2;
        boolean z3 = false;
        if (z) {
            Long h = AdsCommonMetaData.f38625h.mo30463h();
            if (h == null || this.f38825o == null || SystemClock.elapsedRealtime() - this.f38825o.longValue() >= h.longValue()) {
                this.f38825o = Long.valueOf(SystemClock.elapsedRealtime());
                z2 = false;
            } else {
                C9055k.m48716a(this.f38812b, new C9420a(), new CachedAd$3(this, this.f38812b, this.f38811a), true);
                Context context = this.f38812b;
                StringBuilder a = C8870c1.m48422a("Failed to load ");
                a.append(this.f38811a.name());
                a.append(" ad: NO FILL");
                C9605vb.m50457a(context, 6, a.toString(), true);
                z2 = true;
            }
            if (z2) {
                return;
            }
        }
        int ordinal = this.f38811a.ordinal();
        if (ordinal == 0) {
            dVar = new OverlayAd(this.f38812b);
        } else if (ordinal == 7) {
            dVar = new ReturnAd(this.f38812b);
        } else if (ordinal == 2) {
            if (new Random().nextInt(100) < AdsCommonMetaData.f38625h.mo30478w()) {
                z3 = true;
            }
            boolean isForceOfferWall3D = this.f38814d.isForceOfferWall3D();
            boolean isForceOfferWall2D = true ^ this.f38814d.isForceOfferWall2D();
            Map<Activity, Integer> map = C9605vb.f39316a;
            if ((z3 || isForceOfferWall3D) && isForceOfferWall2D) {
                dVar = new OfferWall3DAd(this.f38812b);
            } else {
                dVar = new OfferWallAd(this.f38812b);
            }
        } else if (ordinal == 3) {
            dVar = new SplashAd(this.f38812b);
        } else if (ordinal != 4) {
            dVar = new OverlayAd(this.f38812b);
        } else {
            Map<Activity, Integer> map2 = C9605vb.f39316a;
            dVar = new VideoEnabledAd(this.f38812b, AdPreferences.Placement.INAPP_OVERLAY);
        }
        this.f38815e = dVar;
        dVar.setActivityExtra(this.f38813c);
        this.f38814d.setAutoLoadAmount(this.f38823m);
        this.f38815e.load(this.f38814d, new C9420a());
        this.f38817g = System.currentTimeMillis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30711b() {
        /*
            r6 = this;
            boolean r0 = r6.mo30713c()
            if (r0 == 0) goto L_0x006c
            android.content.Context r0 = r6.f38812b
            com.startapp.sdk.adsbase.d r1 = r6.f38815e
            com.startapp.sdk.adsbase.Ad r1 = (com.startapp.sdk.adsbase.C9381Ad) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0049
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            boolean r5 = r1 instanceof com.startapp.sdk.adsbase.HtmlAd
            if (r5 == 0) goto L_0x0031
            com.startapp.sdk.adsbase.HtmlAd r1 = (com.startapp.sdk.adsbase.HtmlAd) r1
            java.lang.String r1 = r1.mo30499j()
            java.util.List r1 = com.startapp.C8959g0.m48603a(r1, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Boolean r0 = com.startapp.C8959g0.m48601a((android.content.Context) r0, (java.util.List<com.startapp.sdk.adsbase.apppresence.AppPresenceDetails>) r1, (int) r3, (java.util.Set<java.lang.String>) r4, (java.util.List<com.startapp.sdk.adsbase.apppresence.AppPresenceDetails>) r5)
            boolean r0 = r0.booleanValue()
            goto L_0x004a
        L_0x0031:
            boolean r5 = r1 instanceof com.startapp.sdk.adsbase.JsonAd
            if (r5 == 0) goto L_0x0049
            com.startapp.sdk.adsbase.JsonAd r1 = (com.startapp.sdk.adsbase.JsonAd) r1
            java.util.List r1 = r1.mo30512g()
            java.util.List r0 = com.startapp.C8959g0.m48602a((android.content.Context) r0, (java.util.List<com.startapp.sdk.adsbase.model.AdDetails>) r1, (int) r3, (java.util.Set<java.lang.String>) r4, (boolean) r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 != 0) goto L_0x0067
            com.startapp.sdk.adsbase.d r0 = r6.f38815e
            if (r0 != 0) goto L_0x0052
            r0 = 0
            goto L_0x0056
        L_0x0052:
            boolean r0 = r0.mo30091d()
        L_0x0056:
            if (r0 == 0) goto L_0x0059
            goto L_0x0067
        L_0x0059:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f38816f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0079
            com.startapp.r1 r0 = r6.f38820j
            r0.mo29849d()
            goto L_0x0079
        L_0x0067:
            r0 = 0
            r6.mo30709a(r0, r0, r2, r3)
            goto L_0x0079
        L_0x006c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f38816f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0079
            com.startapp.p1 r0 = r6.f38821k
            r0.mo29849d()
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.C9419h.mo30711b():void");
    }

    /* renamed from: c */
    public boolean mo30713c() {
        C9440d dVar = this.f38815e;
        return dVar != null && dVar.isReady();
    }

    /* renamed from: b */
    public final void mo30712b(boolean z) {
        C9440d dVar = this.f38815e;
        if (dVar != null) {
            dVar.mo30086a(false);
        }
        if (this.f38819i && this.f38818h != null) {
            this.f38819i = false;
            C9417f fVar = new C9417f(this, new C9420a(), z);
            Context context = this.f38812b;
            ComponentLocator.m50248a(context).mo31173i().execute(new C9426k(context, this.f38818h, fVar, new C9418g(this)));
            return;
        }
        mo30710a(z);
    }

    /* renamed from: a */
    public final void mo30708a(Context context) {
        if (context instanceof Activity) {
            Context a = C9058k0.m48718a(context);
            if (a == null) {
                a = context;
            }
            this.f38812b = a;
            this.f38813c = new ActivityExtra((Activity) context);
            return;
        }
        this.f38812b = context;
        this.f38813c = null;
    }

    /* renamed from: a */
    public final void mo30707a() {
        this.f38820j = new C9254r1(this);
        this.f38821k = new C9207p1(this);
    }

    /* renamed from: a */
    public List<StartAppAd> mo30706a(Map<AdEventListener, List<StartAppAd>> map, AdEventListener adEventListener) {
        try {
            return map.get(adEventListener);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f A[ADDED_TO_REGION, Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A[ADDED_TO_REGION, Catch:{ all -> 0x0036 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30709a(com.startapp.sdk.adsbase.StartAppAd r5, com.startapp.sdk.adsbase.adlisteners.AdEventListener r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            java.util.Map<com.startapp.sdk.adsbase.adlisteners.AdEventListener, java.util.List<com.startapp.sdk.adsbase.StartAppAd>> r0 = r4.f38822l
            monitor-enter(r0)
            boolean r1 = r4.mo30713c()     // Catch:{ all -> 0x005e }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001c
            com.startapp.sdk.adsbase.d r1 = r4.f38815e     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0015
        L_0x0011:
            boolean r1 = r1.mo30091d()     // Catch:{ all -> 0x005e }
        L_0x0015:
            if (r1 != 0) goto L_0x001c
            if (r7 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r7 = 0
            goto L_0x001d
        L_0x001c:
            r7 = 1
        L_0x001d:
            if (r7 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x003d
            if (r6 == 0) goto L_0x003d
            java.util.Map<com.startapp.sdk.adsbase.adlisteners.AdEventListener, java.util.List<com.startapp.sdk.adsbase.StartAppAd>> r7 = r4.f38822l     // Catch:{ all -> 0x005e }
            java.util.List r7 = r4.mo30706a(r7, r6)     // Catch:{ all -> 0x005e }
            if (r7 != 0) goto L_0x003a
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x005e }
            r7.<init>()     // Catch:{ all -> 0x005e }
            java.util.Map<com.startapp.sdk.adsbase.adlisteners.AdEventListener, java.util.List<com.startapp.sdk.adsbase.StartAppAd>> r1 = r4.f38822l     // Catch:{ all -> 0x005e }
            r1.put(r6, r7)     // Catch:{ all -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r6 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r6)     // Catch:{ all -> 0x005e }
        L_0x003a:
            r7.add(r5)     // Catch:{ all -> 0x005e }
        L_0x003d:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f38816f     // Catch:{ all -> 0x005e }
            boolean r5 = r5.compareAndSet(r2, r3)     // Catch:{ all -> 0x005e }
            if (r5 == 0) goto L_0x005c
            com.startapp.r1 r5 = r4.f38820j     // Catch:{ all -> 0x005e }
            r5.mo29850e()     // Catch:{ all -> 0x005e }
            com.startapp.p1 r5 = r4.f38821k     // Catch:{ all -> 0x005e }
            r5.mo29850e()     // Catch:{ all -> 0x005e }
            r4.mo30712b(r8)     // Catch:{ all -> 0x005e }
            goto L_0x005c
        L_0x0053:
            if (r5 == 0) goto L_0x005c
            if (r6 == 0) goto L_0x005c
            android.content.Context r7 = r4.f38812b     // Catch:{ all -> 0x005e }
            com.startapp.C9055k.m48717b(r7, r6, r5, r3)     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.C9419h.mo30709a(com.startapp.sdk.adsbase.StartAppAd, com.startapp.sdk.adsbase.adlisteners.AdEventListener, boolean, boolean):void");
    }
}
