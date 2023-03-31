package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class rc3 extends za3 {

    /* renamed from: c */
    final transient Object f16913c;

    rc3(Object obj) {
        Objects.requireNonNull(obj);
        this.f16913c = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo9535b(Object[] objArr, int i) {
        objArr[i] = this.f16913c;
        return i + 1;
    }

    public final boolean contains(Object obj) {
        return this.f16913c.equals(obj);
    }

    public final int hashCode() {
        return this.f16913c.hashCode();
    }

    /* renamed from: i */
    public final ua3 mo10475i() {
        return ua3.m21509x(this.f16913c);
    }

    public final /* synthetic */ Iterator iterator() {
        return new cb3(this.f16913c);
    }

    /* renamed from: j */
    public final uc3 mo10124j() {
        return new cb3(this.f16913c);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return '[' + this.f16913c.toString() + ']';
    }
}
