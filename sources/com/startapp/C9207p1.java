package com.startapp;

import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.cache.C9419h;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.FailuresHandler;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.p1 */
/* compiled from: Sta */
public class C9207p1 extends C9235q1 {

    /* renamed from: e */
    public final FailuresHandler f38041e = CacheMetaData.m49872b().mo30676a().mo30665c();

    /* renamed from: f */
    public int f38042f = 0;

    /* renamed from: g */
    public boolean f38043g = false;

    public C9207p1(C9419h hVar) {
        super(hVar);
    }

    /* renamed from: a */
    public boolean mo29804a() {
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
        if (!(startAppSDKInternal.f38669c && !startAppSDKInternal.f38670d && !startAppSDKInternal.f38672f)) {
            return false;
        }
        FailuresHandler failuresHandler = this.f38041e;
        if (!((failuresHandler == null || failuresHandler.mo30691a() == null) ? false : true)) {
            return false;
        }
        if (this.f38043g) {
            return this.f38041e.mo30692b();
        }
        return true;
    }

    /* renamed from: b */
    public long mo29805b() {
        Long l;
        if (this.f38042f >= this.f38041e.mo30691a().size() || (l = this.f38109c) == null) {
            return -1;
        }
        long millis = TimeUnit.SECONDS.toMillis((long) this.f38041e.mo30691a().get(this.f38042f).intValue()) - (System.currentTimeMillis() - l.longValue());
        if (millis >= 0) {
            return millis;
        }
        return 0;
    }

    /* renamed from: c */
    public void mo29806c() {
        if (this.f38042f == this.f38041e.mo30691a().size() - 1) {
            this.f38043g = true;
        } else {
            this.f38042f++;
        }
        super.mo29806c();
    }

    /* renamed from: f */
    public void mo29807f() {
        mo29850e();
        this.f38042f = 0;
        this.f38043g = false;
    }
}
