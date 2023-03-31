package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class cx2 extends ka3 {

    /* renamed from: a */
    private final Map f7977a;

    public cx2(Map map) {
        this.f7977a = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo9368b() {
        return this.f7977a;
    }

    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return super.mo11629o(obj);
    }

    public final Set entrySet() {
        return qc3.m19168b(this.f7977a.entrySet(), av2.f6780a);
    }

    public final boolean equals(Object obj) {
        return obj != null && super.mo11630p(obj);
    }

    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f7977a.get(obj);
    }

    public final int hashCode() {
        return super.mo11628n();
    }

    public final boolean isEmpty() {
        if (this.f7977a.isEmpty() || (super.size() == 1 && super.containsKey((Object) null))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Map mo9376k() {
        return this.f7977a;
    }

    public final Set keySet() {
        return qc3.m19168b(this.f7977a.keySet(), bw2.f7506a);
    }

    public final int size() {
        return super.size() - (super.containsKey((Object) null) ? 1 : 0);
    }
}
