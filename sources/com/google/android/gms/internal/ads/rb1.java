package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rb1 extends kf1 implements y40 {

    /* renamed from: b */
    private final Bundle f16905b = new Bundle();

    public rb1(Set set) {
        super(set);
    }

    /* renamed from: j */
    public final synchronized void mo9273j(String str, Bundle bundle) {
        this.f16905b.putAll(bundle);
        mo11671o0(qb1.f16329a);
    }

    /* renamed from: p0 */
    public final synchronized Bundle mo13730p0() {
        return new Bundle(this.f16905b);
    }
}
