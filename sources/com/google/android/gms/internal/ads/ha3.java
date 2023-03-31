package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ha3 extends ja3 {
    ha3() {
        super((ha3) null);
    }

    /* renamed from: j */
    static final ja3 m13767j(int i) {
        return i < 0 ? ja3.f11299b : i > 0 ? ja3.f11300c : ja3.f11298a;
    }

    /* renamed from: a */
    public final int mo10775a() {
        return 0;
    }

    /* renamed from: b */
    public final ja3 mo10776b(int i, int i2) {
        return m13767j(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    /* renamed from: c */
    public final ja3 mo10777c(Object obj, Object obj2, Comparator comparator) {
        return m13767j(comparator.compare(obj, obj2));
    }

    /* renamed from: d */
    public final ja3 mo10778d(boolean z, boolean z2) {
        return m13767j(zc3.m24526a(z, z2));
    }

    /* renamed from: e */
    public final ja3 mo10779e(boolean z, boolean z2) {
        return m13767j(zc3.m24526a(false, false));
    }
}
