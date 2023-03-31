package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class le3 extends be3 {

    /* renamed from: x */
    private List f12756x;

    le3(pa3 pa3, boolean z) {
        super(pa3, true, true);
        List list;
        if (pa3.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = jb3.m14812a(pa3.size());
        }
        for (int i = 0; i < pa3.size(); i++) {
            list.add((Object) null);
        }
        this.f12756x = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo8752P(int i, Object obj) {
        List list = this.f12756x;
        if (list != null) {
            list.set(i, new ke3(obj));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo8753Q() {
        List list = this.f12756x;
        if (list != null) {
            mo9805g(mo11396V(list));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo8757U(int i) {
        super.mo8757U(i);
        this.f12756x = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public abstract Object mo11396V(List list);
}
