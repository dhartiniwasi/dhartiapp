package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class xf4 {

    /* renamed from: a */
    private final xn4 f20087a;

    /* renamed from: b */
    private final Map f20088b = new HashMap();

    /* renamed from: c */
    private final Set f20089c = new HashSet();

    /* renamed from: d */
    private final Map f20090d = new HashMap();

    /* renamed from: e */
    private pk2 f20091e;

    public xf4(xn4 xn4) {
        this.f20087a = xn4;
    }

    /* renamed from: a */
    public final void mo15091a(pk2 pk2) {
        if (pk2 != this.f20091e) {
            this.f20091e = pk2;
            this.f20088b.clear();
            this.f20090d.clear();
        }
    }
}
