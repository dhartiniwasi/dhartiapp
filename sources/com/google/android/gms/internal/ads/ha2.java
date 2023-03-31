package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ha2 implements d52 {

    /* renamed from: a */
    private final f52 f10261a;

    /* renamed from: b */
    private final k52 f10262b;

    /* renamed from: c */
    private final kx2 f10263c;

    /* renamed from: d */
    private final mf3 f10264d;

    public ha2(kx2 kx2, mf3 mf3, f52 f52, k52 k52) {
        this.f10263c = kx2;
        this.f10264d = mf3;
        this.f10262b = k52;
        this.f10261a = f52;
    }

    /* renamed from: e */
    static final String m13762e(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    /* renamed from: a */
    public final boolean mo9436a(us2 us2, is2 is2) {
        return !is2.f11004u.isEmpty();
    }

    /* renamed from: b */
    public final lf3 mo9437b(us2 us2, is2 is2) {
        g52 g52;
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        Iterator it = is2.f11004u.iterator();
        while (true) {
            if (!it.hasNext()) {
                g52 = null;
                break;
            }
            try {
                g52 = this.f10261a.mo10073a((String) it.next(), is2.f11006w);
                break;
            } catch (jt2 unused) {
            }
        }
        if (g52 == null) {
            return cf3.m10910h(new h82("Unable to instantiate mediation adapter class."));
        }
        in0 in0 = new in0();
        g52.f9706c.mo8249P0(new ga2(this, g52, in0));
        if (is2.f10955N) {
            Bundle bundle = us2.f18722a.f17091a.f8933d.f24901u;
            Bundle bundle2 = bundle.getBundle(cls.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(cls.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        kx2 kx2 = this.f10263c;
        return tw2.m21277d(new da2(this, us2, is2, g52), this.f10264d, ex2.ADAPTER_LOAD_AD_SYN, kx2).mo8578b(ex2.ADAPTER_LOAD_AD_ACK).mo8580d(in0).mo8578b(ex2.ADAPTER_WRAP_ADAPTER).mo8581e(new ea2(this, us2, is2, g52)).mo8577a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo10773c(us2 us2, is2 is2, g52 g52, Void voidR) throws Exception {
        return this.f10262b.mo8260a(us2, is2, g52);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo10774d(us2 us2, is2 is2, g52 g52) throws Exception {
        this.f10262b.mo8261b(us2, is2, g52);
    }
}
