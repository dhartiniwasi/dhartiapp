package com.google.android.gms.internal.ads;

import java.util.Map;
import p060h4.C4470a;
import p066i4.C4661c0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class o60 implements C4661c0 {

    /* renamed from: a */
    boolean f14906a = false;

    /* renamed from: b */
    final /* synthetic */ boolean f14907b;

    /* renamed from: c */
    final /* synthetic */ C4470a f14908c;

    /* renamed from: d */
    final /* synthetic */ Map f14909d;

    /* renamed from: e */
    final /* synthetic */ Map f14910e;

    o60(q60 q60, boolean z, C4470a aVar, Map map, Map map2) {
        this.f14907b = z;
        this.f14908c = aVar;
        this.f14909d = map;
        this.f14910e = map2;
    }

    /* renamed from: b */
    public final void mo12531b(boolean z) {
        if (!this.f14906a) {
            if (z && this.f14907b) {
                ((qh1) this.f14908c).mo9272h();
            }
            this.f14906a = true;
            this.f14909d.put((String) this.f14910e.get("event_id"), Boolean.valueOf(z));
            ((q80) this.f14908c).mo9081R("openIntentAsync", this.f14909d);
        }
    }

    /* renamed from: s */
    public final void mo12532s(int i) {
    }
}
