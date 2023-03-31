package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class pp1 implements C2894tr {

    /* renamed from: a */
    public final /* synthetic */ vs0 f15947a;

    public /* synthetic */ pp1(vs0 vs0) {
        this.f15947a = vs0;
    }

    /* renamed from: N */
    public final void mo8416N(C2857sr srVar) {
        vs0 vs0 = this.f15947a;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != srVar.f17627j ? "0" : "1");
        vs0.mo9081R("onAdVisibilityChanged", hashMap);
    }
}
