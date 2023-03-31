package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class hq0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ap0 f10450a;

    /* renamed from: b */
    public final /* synthetic */ Map f10451b;

    public /* synthetic */ hq0(ap0 ap0, Map map) {
        this.f10450a = ap0;
        this.f10451b = map;
    }

    public final void run() {
        ap0 ap0 = this.f10450a;
        Map map = this.f10451b;
        int i = kq0.f12216E;
        ap0.mo9081R("onGcacheInfoEvent", map);
    }
}
