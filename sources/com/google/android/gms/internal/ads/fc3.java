package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fc3 extends za3 {

    /* renamed from: c */
    private final transient xa3 f9215c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final transient Object[] f9216d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final transient int f9217e;

    fc3(xa3 xa3, Object[] objArr, int i, int i2) {
        this.f9215c = xa3;
        this.f9216d = objArr;
        this.f9217e = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo9535b(Object[] objArr, int i) {
        return mo10475i().mo9535b(objArr, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f9215c.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo10475i().listIterator(0);
    }

    /* renamed from: j */
    public final uc3 mo10124j() {
        return mo10475i().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final ua3 mo10125q() {
        return new ec3(this);
    }

    public final int size() {
        return this.f9217e;
    }
}
