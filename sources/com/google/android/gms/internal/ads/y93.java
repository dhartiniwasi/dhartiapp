package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class y93 extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ da3 f20537a;

    y93(da3 da3) {
        this.f20537a = da3;
    }

    public final void clear() {
        this.f20537a.clear();
    }

    public final boolean contains(Object obj) {
        Map o = this.f20537a.mo9489o();
        if (o != null) {
            return o.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int f = this.f20537a.m11397y(entry.getKey());
            if (f == -1 || !w73.m22614a(da3.m11390m(this.f20537a, f), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        da3 da3 = this.f20537a;
        Map o = da3.mo9489o();
        if (o != null) {
            return o.entrySet().iterator();
        }
        return new w93(da3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r0 = r0.m11396x();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.da3 r0 = r10.f20537a
            java.util.Map r0 = r0.mo9489o()
            if (r0 == 0) goto L_0x0011
            java.util.Set r0 = r0.entrySet()
            boolean r11 = r0.remove(r11)
            return r11
        L_0x0011:
            boolean r0 = r11 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x005f
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            com.google.android.gms.internal.ads.da3 r0 = r10.f20537a
            boolean r2 = r0.mo9496t()
            if (r2 == 0) goto L_0x0021
            return r1
        L_0x0021:
            int r0 = r0.m11396x()
            java.lang.Object r3 = r11.getKey()
            java.lang.Object r4 = r11.getValue()
            com.google.android.gms.internal.ads.da3 r11 = r10.f20537a
            java.lang.Object r6 = com.google.android.gms.internal.ads.da3.m11391n(r11)
            com.google.android.gms.internal.ads.da3 r11 = r10.f20537a
            int[] r7 = r11.m11380C()
            com.google.android.gms.internal.ads.da3 r11 = r10.f20537a
            java.lang.Object[] r8 = r11.m11381b()
            com.google.android.gms.internal.ads.da3 r11 = r10.f20537a
            java.lang.Object[] r9 = r11.m11382c()
            r5 = r0
            int r11 = com.google.android.gms.internal.ads.ea3.m11996b(r3, r4, r5, r6, r7, r8, r9)
            r2 = -1
            if (r11 != r2) goto L_0x004e
            return r1
        L_0x004e:
            com.google.android.gms.internal.ads.da3 r1 = r10.f20537a
            r1.mo9494s(r11, r0)
            com.google.android.gms.internal.ads.da3 r11 = r10.f20537a
            com.google.android.gms.internal.ads.da3.m11384e(r11)
            com.google.android.gms.internal.ads.da3 r11 = r10.f20537a
            r11.mo9491q()
            r11 = 1
            return r11
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y93.remove(java.lang.Object):boolean");
    }

    public final int size() {
        return this.f20537a.size();
    }
}
