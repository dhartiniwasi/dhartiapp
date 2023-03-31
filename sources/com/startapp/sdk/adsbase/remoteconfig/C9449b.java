package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;

/* renamed from: com.startapp.sdk.adsbase.remoteconfig.b */
/* compiled from: Sta */
public class C9449b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9450c f39001a;

    /* renamed from: b */
    public final /* synthetic */ MetaDataRequest.RequestReason f39002b;

    /* renamed from: c */
    public final /* synthetic */ boolean f39003c;

    public C9449b(C9450c cVar, MetaDataRequest.RequestReason requestReason, boolean z) {
        this.f39001a = cVar;
        this.f39002b = requestReason;
        this.f39003c = z;
    }

    public void run() {
        this.f39001a.mo29320a(this.f39002b, this.f39003c);
    }
}
