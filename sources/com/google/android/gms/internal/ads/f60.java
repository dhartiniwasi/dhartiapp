package com.google.android.gms.internal.ads;

import java.util.Map;
import p033d5.C4141r;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class f60 implements e60 {

    /* renamed from: a */
    private final ey1 f9137a;

    public f60(ey1 ey1) {
        C4141r.m28222l(ey1, "The Inspector Manager must not be null");
        this.f9137a = ey1;
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            long j = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.f9137a.mo10038i((String) map.get("extras"), j);
        }
    }
}
