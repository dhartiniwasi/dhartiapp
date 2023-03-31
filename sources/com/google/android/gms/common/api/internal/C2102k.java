package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p007a5.C0104a;
import p007a5.C0111g;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.common.api.internal.k */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2102k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f6229a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C9977j<?>, Boolean> f6230b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m9349h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f6229a) {
            hashMap = new HashMap(this.f6229a);
        }
        synchronized (this.f6230b) {
            hashMap2 = new HashMap(this.f6230b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo7991e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C9977j) entry2.getKey()).mo32545d(new C0104a(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8081c(BasePendingResult<? extends C0111g> basePendingResult, boolean z) {
        this.f6229a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo253a(new C2096i(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final <TResult> void mo8082d(C9977j<TResult> jVar, boolean z) {
        this.f6230b.put(jVar, Boolean.valueOf(z));
        jVar.mo32542a().mo26347b(new C2099j(this, jVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8083e(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        m9349h(true, new Status(20, sb.toString()));
    }

    /* renamed from: f */
    public final void mo8084f() {
        m9349h(false, C2076c.f6120z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo8085g() {
        return !this.f6229a.isEmpty() || !this.f6230b.isEmpty();
    }
}
