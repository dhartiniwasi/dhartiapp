package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rs3 extends px3 implements dz3 {
    private rs3() {
        super(us3.zzb);
    }

    /* renamed from: p */
    public final rs3 mo13877p(ts3 ts3) {
        if (this.f16077c) {
            mo13425o();
            this.f16077c = false;
        }
        us3.m21846O((us3) this.f16076b, ts3);
        return this;
    }

    /* renamed from: r */
    public final rs3 mo13878r(int i) {
        if (this.f16077c) {
            mo13425o();
            this.f16077c = false;
        }
        ((us3) this.f16076b).zze = i;
        return this;
    }

    /* renamed from: s */
    public final List mo13879s() {
        return Collections.unmodifiableList(((us3) this.f16076b).mo14622M());
    }

    /* synthetic */ rs3(qs3 qs3) {
        super(us3.zzb);
    }
}
