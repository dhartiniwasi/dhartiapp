package com.startapp;

import com.startapp.sdk.adsbase.C9440d;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.cache.C9419h;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* renamed from: com.startapp.r1 */
/* compiled from: Sta */
public class C9254r1 extends C9235q1 {
    public C9254r1(C9419h hVar) {
        super(hVar);
    }

    /* renamed from: a */
    public boolean mo29804a() {
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
        return startAppSDKInternal.f38669c && !startAppSDKInternal.f38672f && (!startAppSDKInternal.f38670d || (this.f38107a.f38811a == AdPreferences.Placement.INAPP_RETURN && CacheMetaData.f38782a.mo30676a().mo30670g()));
    }

    /* renamed from: b */
    public long mo29805b() {
        C9440d dVar = this.f38107a.f38815e;
        if (dVar == null) {
            return -1;
        }
        Long c = dVar.mo30090c();
        Long b = dVar.mo30089b();
        if (c == null || b == null) {
            return -1;
        }
        long longValue = c.longValue() - (System.currentTimeMillis() - b.longValue());
        if (longValue >= 0) {
            return longValue;
        }
        return 0;
    }
}
