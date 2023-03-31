package com.google.android.gms.internal.ads;

import android.content.Context;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sv0 implements b44 {

    /* renamed from: a */
    private final o44 f17674a;

    /* renamed from: b */
    private final o44 f17675b;

    public sv0(o44 o44, o44 o442) {
        this.f17674a = o44;
        this.f17675b = o442;
    }

    /* renamed from: a */
    public final jh0 mo8155d() {
        Context a = ((yu0) this.f17674a).mo15509a();
        az2 az2 = (az2) this.f17675b.mo8155d();
        pa0 b = C4409t.m29316h().mo10445b(a, vm0.m22307I1(), az2);
        ja0 ja0 = ma0.f13287b;
        b.mo13200a("google.afma.request.getAdDictionary", ja0, ja0);
        return new ih0(a, C4409t.m29316h().mo10445b(a, vm0.m22307I1(), az2).mo13200a("google.afma.sdkConstants.getSdkConstants", ja0, ja0));
    }
}
