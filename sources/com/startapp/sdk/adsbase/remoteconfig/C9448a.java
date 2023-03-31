package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import com.startapp.C8842b3;
import com.startapp.C8870c1;
import com.startapp.C9023i4;
import com.startapp.C9219p7;
import com.startapp.C9654y3;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.splash.SplashMetaData;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Collections;
import java.util.List;

/* renamed from: com.startapp.sdk.adsbase.remoteconfig.a */
/* compiled from: Sta */
public class C9448a {

    /* renamed from: a */
    public final Context f38990a;

    /* renamed from: b */
    public final AdPreferences f38991b;

    /* renamed from: c */
    public final MetaDataRequest.RequestReason f38992c;

    /* renamed from: d */
    public MetaData f38993d = null;

    /* renamed from: e */
    public BannerMetaData f38994e = null;

    /* renamed from: f */
    public SplashMetaData f38995f;

    /* renamed from: g */
    public CacheMetaData f38996g = null;

    /* renamed from: h */
    public AdInformationMetaData f38997h = null;

    /* renamed from: i */
    public AdsCommonMetaData f38998i = null;

    /* renamed from: j */
    public boolean f38999j = false;

    /* renamed from: k */
    public boolean f39000k = false;

    public C9448a(Context context, AdPreferences adPreferences, MetaDataRequest.RequestReason requestReason) {
        this.f38990a = context;
        this.f38991b = adPreferences;
        this.f38992c = requestReason;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:31|32|(24:38|39|40|(1:42)|46|47|48|(1:50)|54|55|56|(1:58)|59|(1:61)|65|66|67|(1:69)|73|74|75|(1:77)|81|82)|83|84) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0153 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean mo31150a() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f38990a     // Catch:{ all -> 0x015a }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r0)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.e r0 = r0.mo31168d()     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest r1 = new com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest     // Catch:{ all -> 0x015a }
            android.content.Context r2 = r5.f38990a     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason r3 = r5.f38992c     // Catch:{ all -> 0x015a }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x015a }
            android.content.Context r0 = r5.f38990a     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.model.AdPreferences r2 = r5.f38991b     // Catch:{ all -> 0x015a }
            r1.mo31505a(r0, r2)     // Catch:{ all -> 0x015a }
            android.content.Context r0 = r5.f38990a     // Catch:{ all -> 0x015a }
            com.startapp.p7$a r0 = m50231a(r0, r1)     // Catch:{ all -> 0x015a }
            if (r0 != 0) goto L_0x0025
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015a }
            return r0
        L_0x0025:
            java.lang.String r0 = r0.f38066b     // Catch:{ all -> 0x015a }
            if (r0 != 0) goto L_0x002c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015a }
            return r0
        L_0x002c:
            java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.MetaData> r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.class
            java.lang.Object r1 = com.startapp.C9065k5.m48755a(r0, r1)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = (com.startapp.sdk.adsbase.remoteconfig.MetaData) r1     // Catch:{ all -> 0x015a }
            r5.f38993d = r1     // Catch:{ all -> 0x015a }
            if (r1 != 0) goto L_0x003b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015a }
            return r0
        L_0x003b:
            java.lang.String r1 = r1.mo31028i()     // Catch:{ all -> 0x015a }
            if (r1 == 0) goto L_0x006e
            android.content.Context r1 = r5.f38990a     // Catch:{ all -> 0x015a }
            com.startapp.sdk.components.ComponentLocator r1 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r1)     // Catch:{ all -> 0x015a }
            com.startapp.d0 r1 = r1.mo31167c()     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = r5.f38993d     // Catch:{ all -> 0x015a }
            java.lang.String r2 = r2.mo31028i()     // Catch:{ all -> 0x015a }
            if (r2 == 0) goto L_0x0057
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x015a }
        L_0x0057:
            java.lang.Object r3 = r1.f36662a     // Catch:{ all -> 0x015a }
            monitor-enter(r3)     // Catch:{ all -> 0x015a }
            android.content.SharedPreferences r1 = r1.f36663b     // Catch:{ all -> 0x006b }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "31721150b470a3b9"
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r2)     // Catch:{ all -> 0x006b }
            r1.commit()     // Catch:{ all -> 0x006b }
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            goto L_0x006e
        L_0x006b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x015a }
        L_0x006e:
            java.util.Map<android.app.Activity, java.lang.Integer> r1 = com.startapp.C9605vb.f39316a     // Catch:{ all -> 0x015a }
            java.lang.Class<com.startapp.sdk.adsbase.AdsCommonMetaData> r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.class
            java.lang.Object r1 = com.startapp.C9065k5.m48755a(r0, r1)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = (com.startapp.sdk.adsbase.AdsCommonMetaData) r1     // Catch:{ all -> 0x015a }
            r5.f38998i = r1     // Catch:{ all -> 0x015a }
            java.lang.Class<com.startapp.sdk.ads.banner.BannerMetaData> r1 = com.startapp.sdk.ads.banner.BannerMetaData.class
            java.lang.Object r1 = com.startapp.C9065k5.m48755a(r0, r1)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.ads.banner.BannerMetaData r1 = (com.startapp.sdk.ads.banner.BannerMetaData) r1     // Catch:{ all -> 0x015a }
            r5.f38994e = r1     // Catch:{ all -> 0x015a }
            java.lang.Class<com.startapp.sdk.ads.splash.SplashMetaData> r1 = com.startapp.sdk.ads.splash.SplashMetaData.class
            java.lang.Object r1 = com.startapp.C9065k5.m48755a(r0, r1)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.ads.splash.SplashMetaData r1 = (com.startapp.sdk.ads.splash.SplashMetaData) r1     // Catch:{ all -> 0x015a }
            r5.f38995f = r1     // Catch:{ all -> 0x015a }
            java.lang.Class<com.startapp.sdk.adsbase.cache.CacheMetaData> r1 = com.startapp.sdk.adsbase.cache.CacheMetaData.class
            java.lang.Object r1 = com.startapp.C9065k5.m48755a(r0, r1)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.cache.CacheMetaData r1 = (com.startapp.sdk.adsbase.cache.CacheMetaData) r1     // Catch:{ all -> 0x015a }
            r5.f38996g = r1     // Catch:{ all -> 0x015a }
            java.lang.Class<com.startapp.sdk.adsbase.adinformation.AdInformationMetaData> r1 = com.startapp.sdk.adsbase.adinformation.AdInformationMetaData.class
            java.lang.Object r0 = com.startapp.C9065k5.m48755a(r0, r1)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r0 = (com.startapp.sdk.adsbase.adinformation.AdInformationMetaData) r0     // Catch:{ all -> 0x015a }
            r5.f38997h = r0     // Catch:{ all -> 0x015a }
            java.lang.Object r0 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38945d
            monitor-enter(r0)
            boolean r1 = r5.f38999j     // Catch:{ all -> 0x0157 }
            if (r1 != 0) goto L_0x0153
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = r5.f38993d     // Catch:{ all -> 0x0157 }
            if (r1 == 0) goto L_0x0153
            android.content.Context r1 = r5.f38990a     // Catch:{ all -> 0x0157 }
            if (r1 == 0) goto L_0x0153
            r1 = 1
            com.startapp.sdk.adsbase.AdsCommonMetaData r2 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x00c6 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r3 = r5.f38998i     // Catch:{ all -> 0x00c6 }
            boolean r2 = com.startapp.C9605vb.m50465a(r2, r3)     // Catch:{ all -> 0x00c6 }
            if (r2 != 0) goto L_0x00ca
            r5.f39000k = r1     // Catch:{ all -> 0x00c6 }
            android.content.Context r2 = r5.f38990a     // Catch:{ all -> 0x00c6 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r3 = r5.f38998i     // Catch:{ all -> 0x00c6 }
            com.startapp.sdk.adsbase.AdsCommonMetaData.m49635a(r2, r3)     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r2 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0157 }
        L_0x00ca:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.C9605vb.f39316a     // Catch:{ all -> 0x0157 }
            com.startapp.sdk.ads.banner.BannerMetaData r2 = com.startapp.sdk.ads.banner.BannerMetaData.f38219b     // Catch:{ all -> 0x00e0 }
            com.startapp.sdk.ads.banner.BannerMetaData r3 = r5.f38994e     // Catch:{ all -> 0x00e0 }
            boolean r2 = com.startapp.C9605vb.m50465a(r2, r3)     // Catch:{ all -> 0x00e0 }
            if (r2 != 0) goto L_0x00e4
            r5.f39000k = r1     // Catch:{ all -> 0x00e0 }
            android.content.Context r2 = r5.f38990a     // Catch:{ all -> 0x00e0 }
            com.startapp.sdk.ads.banner.BannerMetaData r3 = r5.f38994e     // Catch:{ all -> 0x00e0 }
            com.startapp.sdk.ads.banner.BannerMetaData.m49280a(r2, r3)     // Catch:{ all -> 0x00e0 }
            goto L_0x00e4
        L_0x00e0:
            r2 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0157 }
        L_0x00e4:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.C9605vb.f39316a     // Catch:{ all -> 0x0157 }
            com.startapp.sdk.ads.splash.SplashMetaData r2 = r5.f38995f     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x00f1
            com.startapp.sdk.ads.splash.SplashMetaData r2 = new com.startapp.sdk.ads.splash.SplashMetaData     // Catch:{ all -> 0x0110 }
            r2.<init>()     // Catch:{ all -> 0x0110 }
            r5.f38995f = r2     // Catch:{ all -> 0x0110 }
        L_0x00f1:
            com.startapp.sdk.ads.splash.SplashMetaData r2 = r5.f38995f     // Catch:{ all -> 0x0110 }
            com.startapp.sdk.ads.splash.SplashConfig r2 = r2.mo30255a()     // Catch:{ all -> 0x0110 }
            android.content.Context r3 = r5.f38990a     // Catch:{ all -> 0x0110 }
            r2.setDefaults(r3)     // Catch:{ all -> 0x0110 }
            com.startapp.sdk.ads.splash.SplashMetaData r2 = com.startapp.sdk.ads.splash.SplashMetaData.f38416a     // Catch:{ all -> 0x0110 }
            com.startapp.sdk.ads.splash.SplashMetaData r3 = r5.f38995f     // Catch:{ all -> 0x0110 }
            boolean r2 = com.startapp.C9605vb.m50465a(r2, r3)     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x0114
            r5.f39000k = r1     // Catch:{ all -> 0x0110 }
            android.content.Context r2 = r5.f38990a     // Catch:{ all -> 0x0110 }
            com.startapp.sdk.ads.splash.SplashMetaData r3 = r5.f38995f     // Catch:{ all -> 0x0110 }
            com.startapp.sdk.ads.splash.SplashMetaData.m49439a(r2, r3)     // Catch:{ all -> 0x0110 }
            goto L_0x0114
        L_0x0110:
            r2 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0157 }
        L_0x0114:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.C9605vb.f39316a     // Catch:{ all -> 0x0157 }
            com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f38782a     // Catch:{ all -> 0x012a }
            com.startapp.sdk.adsbase.cache.CacheMetaData r3 = r5.f38996g     // Catch:{ all -> 0x012a }
            boolean r2 = com.startapp.C9605vb.m50465a(r2, r3)     // Catch:{ all -> 0x012a }
            if (r2 != 0) goto L_0x012e
            r5.f39000k = r1     // Catch:{ all -> 0x012a }
            android.content.Context r2 = r5.f38990a     // Catch:{ all -> 0x012a }
            com.startapp.sdk.adsbase.cache.CacheMetaData r3 = r5.f38996g     // Catch:{ all -> 0x012a }
            com.startapp.sdk.adsbase.cache.CacheMetaData.m49871a(r2, r3)     // Catch:{ all -> 0x012a }
            goto L_0x012e
        L_0x012a:
            r2 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0157 }
        L_0x012e:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.C9605vb.f39316a     // Catch:{ all -> 0x0157 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r2 = com.startapp.sdk.adsbase.adinformation.AdInformationMetaData.f38717a     // Catch:{ all -> 0x0144 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r3 = r5.f38997h     // Catch:{ all -> 0x0144 }
            boolean r2 = com.startapp.C9605vb.m50465a(r2, r3)     // Catch:{ all -> 0x0144 }
            if (r2 != 0) goto L_0x0148
            r5.f39000k = r1     // Catch:{ all -> 0x0144 }
            android.content.Context r1 = r5.f38990a     // Catch:{ all -> 0x0144 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r2 = r5.f38997h     // Catch:{ all -> 0x0144 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData.m49809a(r1, r2)     // Catch:{ all -> 0x0144 }
            goto L_0x0148
        L_0x0144:
            r1 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r1)     // Catch:{ all -> 0x0157 }
        L_0x0148:
            android.content.Context r1 = r5.f38990a     // Catch:{ Exception -> 0x0153 }
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = r5.f38993d     // Catch:{ Exception -> 0x0153 }
            java.lang.String r2 = r2.mo31025g()     // Catch:{ Exception -> 0x0153 }
            com.startapp.sdk.adsbase.remoteconfig.MetaData.m50086a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0153 }
        L_0x0153:
            monitor-exit(r0)     // Catch:{ all -> 0x0157 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0157:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0157 }
            throw r1
        L_0x015a:
            r0 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.remoteconfig.C9448a.mo31150a():java.lang.Boolean");
    }

    /* renamed from: a */
    public void mo31151a(Boolean bool) {
        MetaData metaData;
        Context context;
        synchronized (MetaData.f38945d) {
            if (!this.f38999j) {
                if (!bool.booleanValue() || (metaData = this.f38993d) == null || (context = this.f38990a) == null) {
                    MetaData.m50088a(this.f38992c);
                } else {
                    try {
                        MetaData.m50085a(context, metaData, this.f38992c, this.f39000k);
                    } catch (Throwable th) {
                        C9023i4.m48681a(th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C9219p7.C9220a m50231a(Context context, MetaDataRequest metaDataRequest) {
        C9219p7.C9220a aVar;
        List<String> list = MetaData.f38952k.metaDataHosts;
        if (list == null || list.size() < 1) {
            list = MetaData.f38948g;
        }
        for (T a : Collections.unmodifiableList(list)) {
            C9654y3 l = ComponentLocator.m50248a(context).mo31176l();
            StringBuilder a2 = C8870c1.m48422a(a);
            a2.append(AdsConstants.f38629d);
            try {
                aVar = l.mo31383a(a2.toString(), metaDataRequest, (C8842b3<Throwable, Void>) null);
            } catch (Throwable th) {
                if (l.mo31386a(1)) {
                    C9023i4.m48681a(th);
                }
                aVar = null;
            }
            if (aVar == null) {
                if (!ComponentLocator.m50248a(context).mo31169e().mo29241a()) {
                    break;
                }
            } else {
                return aVar;
            }
        }
        return null;
    }
}
