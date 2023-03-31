package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class p41 {

    /* renamed from: b */
    public static final p41 f15675b = new p41(ua3.m21508w());

    /* renamed from: c */
    public static final za4 f15676c = m11.f13157a;

    /* renamed from: a */
    private final ua3 f15677a;

    public p41(List list) {
        this.f15677a = ua3.m21506u(list);
    }

    /* renamed from: a */
    public final ua3 mo13130a() {
        return this.f15677a;
    }

    /* renamed from: b */
    public final boolean mo13131b(int i) {
        for (int i2 = 0; i2 < this.f15677a.size(); i2++) {
            o31 o31 = (o31) this.f15677a.get(i2);
            if (o31.mo12814c() && o31.mo12812a() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p41.class != obj.getClass()) {
            return false;
        }
        return this.f15677a.equals(((p41) obj).f15677a);
    }

    public final int hashCode() {
        return this.f15677a.hashCode();
    }
}
