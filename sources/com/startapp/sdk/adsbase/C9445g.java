package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.startapp.C8920e;
import com.startapp.C8938f;
import com.startapp.C8948f5;
import com.startapp.C9109l2;
import com.startapp.C9605vb;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashHideListener;
import com.startapp.sdk.adsbase.C9402c;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adrules.AdRules;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.cache.C9410d;
import com.startapp.sdk.adsbase.cache.C9419h;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Map;

/* renamed from: com.startapp.sdk.adsbase.g */
/* compiled from: Sta */
public class C9445g extends C9109l2 {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
        startAppSDKInternal.getClass();
        boolean z2 = true;
        if (activity.getClass().getName().equals(C9605vb.m50474c((Context) activity))) {
            startAppSDKInternal.f38691y = true;
        }
        startAppSDKInternal.f38684r = bundle;
        Map<Activity, Integer> map = C9605vb.f39316a;
        C9402c cVar = C9402c.C9403a.f38781a;
        boolean equals = activity.getClass().getName().equals(C9605vb.m50474c((Context) activity));
        if (bundle == null) {
            String[] split = C9402c.class.getName().split("\\.");
            if (split.length < 3) {
                z = false;
            } else {
                z = activity.getClass().getName().startsWith(split[0] + "." + split[1] + "." + split[2]);
            }
            if (!z && !equals) {
                cVar.f38779d++;
                if (cVar.f38776a && AdsCommonMetaData.f38625h.mo30447I()) {
                    if (cVar.f38777b == null) {
                        cVar.f38777b = new AutoInterstitialPreferences();
                    }
                    boolean z3 = cVar.f38778c <= 0 || System.currentTimeMillis() >= cVar.f38778c + ((long) (cVar.f38777b.getSecondsBetweenAds() * AdError.NETWORK_ERROR_CODE));
                    int i = cVar.f38779d;
                    boolean z4 = i <= 0 || i >= cVar.f38777b.getActivitiesBetweenAds();
                    if (!z3 || !z4) {
                        z2 = false;
                    }
                    if (z2) {
                        if (cVar.f38780e == null) {
                            cVar.f38780e = new StartAppAd(activity);
                        }
                        cVar.f38780e.loadAd(StartAppAd.AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.TRUE), new C8948f5(cVar));
                    }
                }
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
        if (startAppSDKInternal.mo30558a(activity)) {
            startAppSDKInternal.f38690x = false;
        }
        if (startAppSDKInternal.f38675i.size() == 0) {
            startAppSDKInternal.f38670d = false;
        }
    }

    public void onActivityPaused(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
        startAppSDKInternal.getClass();
        startAppSDKInternal.f38673g = System.currentTimeMillis();
        startAppSDKInternal.f38678l = null;
    }

    public void onActivityResumed(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
        if (startAppSDKInternal.f38668b && startAppSDKInternal.f38671e) {
            startAppSDKInternal.f38671e = false;
            C9410d dVar = C9410d.f38788h;
            if (!dVar.f38792d) {
                synchronized (dVar.f38789a) {
                    for (C9419h b : dVar.f38789a.values()) {
                        b.mo30711b();
                    }
                }
            }
        }
        if (startAppSDKInternal.f38679m) {
            startAppSDKInternal.f38679m = false;
            SimpleTokenUtils.m49715f(activity);
        }
        startAppSDKInternal.f38678l = activity;
    }

    public void onActivityStarted(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
        boolean a = startAppSDKInternal.mo30558a(activity);
        boolean z = !startAppSDKInternal.f38690x && a && startAppSDKInternal.f38684r == null && startAppSDKInternal.f38675i.size() == 0 && StartAppSDKInternal.f38663E == StartAppSDKInternal.InitState.EXPLICIT;
        if (z) {
            ComponentLocator.m50248a((Context) activity).mo31170f().mo29322a(false, (String) null, (String) null, (String) null);
        }
        Map<Activity, Integer> map = C9605vb.f39316a;
        if (!ComponentLocator.m50248a((Context) activity).mo31170f().f36719d && !AdsCommonMetaData.f38625h.mo30450L() && !startAppSDKInternal.f38689w && !startAppSDKInternal.mo30559a("MoPub") && !startAppSDKInternal.mo30559a("AdMob") && !startAppSDKInternal.f38688v && z) {
            StartAppAd.m49720a(activity, startAppSDKInternal.f38684r, new SplashConfig(), new AdPreferences(), (SplashHideListener) null, false);
        }
        if (a) {
            startAppSDKInternal.f38691y = false;
            startAppSDKInternal.f38690x = true;
        }
        if (startAppSDKInternal.f38670d) {
            if (MetaData.f38952k.mo31019b() && startAppSDKInternal.f38687u && !AdsCommonMetaData.f38625h.mo30449K() && !startAppSDKInternal.f38681o) {
                if (System.currentTimeMillis() - startAppSDKInternal.f38673g > AdsCommonMetaData.f38625h.mo30479x()) {
                    C9440d c = C9410d.f38788h.mo30704c(startAppSDKInternal.f38686t);
                    startAppSDKInternal.f38692z = c;
                    if (c != null && c.isReady()) {
                        AdRules b = AdsCommonMetaData.f38625h.mo30456b();
                        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
                        AdRulesResult a2 = b.mo30640a(placement, (String) null);
                        if (!a2.mo30646b()) {
                            C9396a.m49786a(((ReturnAd) startAppSDKInternal.f38692z).trackingUrls, (String) null, 0, a2.mo30645a());
                        } else if (startAppSDKInternal.f38692z.mo30088a((String) null)) {
                            C8938f.f36742d.mo29342a(new C8920e(placement, (String) null));
                        }
                    }
                }
            }
            if (System.currentTimeMillis() - startAppSDKInternal.f38673g > MetaData.f38952k.mo30993I()) {
                startAppSDKInternal.mo30561b(activity, MetaDataRequest.RequestReason.APP_IDLE);
            }
        }
        startAppSDKInternal.f38672f = false;
        startAppSDKInternal.f38670d = false;
        if (startAppSDKInternal.f38675i.get(Integer.valueOf(activity.hashCode())) == null) {
            startAppSDKInternal.f38675i.put(Integer.valueOf(activity.hashCode()), Integer.valueOf(new Integer(0).intValue() + 1));
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.app.Activity, code=android.content.Context, for r7v0, types: [android.content.Context, java.lang.Object, android.app.Activity] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityStopped(android.content.Context r7) {
        /*
            r6 = this;
            com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.C9395d.f38707a
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r0.f38675i
            int r2 = r7.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0091
            int r1 = r1.intValue()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r1.intValue()
            if (r3 != 0) goto L_0x0032
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r0.f38675i
            int r3 = r7.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.remove(r3)
            goto L_0x003f
        L_0x0032:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = r0.f38675i
            int r4 = r7.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r4, r1)
        L_0x003f:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r0.f38675i
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0091
            boolean r1 = r0.f38672f
            if (r1 != 0) goto L_0x0050
            r0.f38670d = r2
            r0.mo30567f(r7)
        L_0x0050:
            boolean r1 = r0.f38668b
            if (r1 == 0) goto L_0x0091
            android.content.Context r1 = com.startapp.C9058k0.m48718a(r7)
            if (r1 == 0) goto L_0x005b
            r7 = r1
        L_0x005b:
            com.startapp.sdk.adsbase.cache.d r1 = com.startapp.sdk.adsbase.cache.C9410d.f38788h
            boolean r3 = r0.f38672f
            r1.getClass()
            boolean r4 = r1.f38791c     // Catch:{ all -> 0x008b }
            if (r4 != 0) goto L_0x0074
            com.startapp.sdk.adsbase.cache.CacheMetaData r4 = com.startapp.sdk.adsbase.cache.CacheMetaData.f38782a     // Catch:{ all -> 0x008b }
            com.startapp.sdk.adsbase.cache.ACMConfig r4 = r4.mo30676a()     // Catch:{ all -> 0x008b }
            boolean r4 = r4.mo30669f()     // Catch:{ all -> 0x008b }
            if (r4 == 0) goto L_0x0074
            r4 = 1
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 == 0) goto L_0x0087
            com.startapp.sdk.components.ComponentLocator r4 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r7)     // Catch:{ all -> 0x008b }
            java.util.concurrent.Executor r4 = r4.mo31173i()     // Catch:{ all -> 0x008b }
            com.startapp.c r5 = new com.startapp.c     // Catch:{ all -> 0x008b }
            r5.<init>(r1, r7)     // Catch:{ all -> 0x008b }
            r4.execute(r5)     // Catch:{ all -> 0x008b }
        L_0x0087:
            r1.mo30700a((boolean) r3)     // Catch:{ all -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r7 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r7)
        L_0x008f:
            r0.f38671e = r2
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.C9445g.onActivityStopped(android.app.Activity):void");
    }
}
