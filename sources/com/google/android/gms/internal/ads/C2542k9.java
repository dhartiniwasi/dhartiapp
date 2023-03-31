package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.k9 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2542k9 {

    /* renamed from: a */
    public final int f11965a;

    /* renamed from: b */
    public final byte[] f11966b;

    /* renamed from: c */
    public final Map f11967c;

    /* renamed from: d */
    public final List f11968d;

    /* renamed from: e */
    public final boolean f11969e;

    private C2542k9(int i, byte[] bArr, Map map, List list, boolean z, long j) {
        this.f11965a = i;
        this.f11966b = bArr;
        this.f11967c = map;
        this.f11968d = list == null ? null : Collections.unmodifiableList(list);
        this.f11969e = z;
    }

    /* renamed from: a */
    private static List m15288a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C2393g9((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public C2542k9(int i, byte[] bArr, Map map, boolean z, long j) {
        this(i, bArr, map, m15288a(map), z, j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2542k9(int r9, byte[] r10, boolean r11, long r12, java.util.List r14) {
        /*
            r8 = this;
            if (r14 != 0) goto L_0x0005
            r0 = 0
        L_0x0003:
            r3 = r0
            goto L_0x0033
        L_0x0005:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L_0x0003
        L_0x0010:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r14.iterator()
        L_0x001b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0003
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.g9 r2 = (com.google.android.gms.internal.ads.C2393g9) r2
            java.lang.String r3 = r2.mo10420a()
            java.lang.String r2 = r2.mo10421b()
            r0.put(r3, r2)
            goto L_0x001b
        L_0x0033:
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2542k9.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    @Deprecated
    public C2542k9(byte[] bArr, Map map) {
        this(200, bArr, map, m15288a(map), false, 0);
    }
}
