package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class es0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ap0 f8911a;

    /* renamed from: b */
    public final /* synthetic */ Map f8912b;

    public /* synthetic */ es0(ap0 ap0, Map map) {
        this.f8911a = ap0;
        this.f8912b = map;
    }

    public final void run() {
        ap0 ap0 = this.f8911a;
        Map map = this.f8912b;
        int i = is0.f10921D;
        ap0.mo9081R("onGcacheInfoEvent", map);
    }
}
