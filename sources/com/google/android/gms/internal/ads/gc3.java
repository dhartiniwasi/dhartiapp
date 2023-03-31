package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class gc3 extends za3 {

    /* renamed from: c */
    private final transient xa3 f9834c;

    /* renamed from: d */
    private final transient ua3 f9835d;

    gc3(xa3 xa3, ua3 ua3) {
        this.f9834c = xa3;
        this.f9835d = ua3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo9535b(Object[] objArr, int i) {
        return this.f9835d.mo9535b(objArr, i);
    }

    public final boolean contains(Object obj) {
        return this.f9834c.get(obj) != null;
    }

    /* renamed from: i */
    public final ua3 mo10475i() {
        return this.f9835d;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f9835d.listIterator(0);
    }

    /* renamed from: j */
    public final uc3 mo10124j() {
        return this.f9835d.listIterator(0);
    }

    public final int size() {
        return this.f9834c.size();
    }
}
