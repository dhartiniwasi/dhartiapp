package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p007a5.C0111g;

/* renamed from: com.google.android.gms.common.api.internal.a1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2072a1 {

    /* renamed from: c */
    public static final Status f6110c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a */
    final Set<BasePendingResult<?>> f6111a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    private final C2138z0 f6112b = new C2138z0(this);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8023a(BasePendingResult<? extends C0111g> basePendingResult) {
        this.f6111a.add(basePendingResult);
        basePendingResult.mo7997o(this.f6112b);
    }

    /* renamed from: b */
    public final void mo8024b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f6111a.toArray(new BasePendingResult[0])) {
            basePendingResult.mo7997o((C2138z0) null);
            if (basePendingResult.mo7996n()) {
                this.f6111a.remove(basePendingResult);
            }
        }
    }
}
