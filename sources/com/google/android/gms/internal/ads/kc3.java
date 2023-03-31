package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class kc3 extends za3 {

    /* renamed from: h */
    private static final Object[] f12016h;

    /* renamed from: i */
    static final kc3 f12017i;

    /* renamed from: c */
    final transient Object[] f12018c;

    /* renamed from: d */
    private final transient int f12019d;

    /* renamed from: e */
    final transient Object[] f12020e;

    /* renamed from: f */
    private final transient int f12021f;

    /* renamed from: g */
    private final transient int f12022g;

    static {
        Object[] objArr = new Object[0];
        f12016h = objArr;
        f12017i = new kc3(objArr, 0, objArr, 0, 0);
    }

    kc3(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f12018c = objArr;
        this.f12019d = i;
        this.f12020e = objArr2;
        this.f12021f = i2;
        this.f12022g = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo9535b(Object[] objArr, int i) {
        System.arraycopy(this.f12018c, 0, objArr, i, this.f12022g);
        return i + this.f12022g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo9536c() {
        return this.f12022g;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f12020e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b = ma3.m16461b(obj);
        while (true) {
            int i = b & this.f12021f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo9537f() {
        return 0;
    }

    public final int hashCode() {
        return this.f12019d;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo10475i().listIterator(0);
    }

    /* renamed from: j */
    public final uc3 mo10124j() {
        return mo10475i().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Object[] mo9540l() {
        return this.f12018c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final ua3 mo10125q() {
        return ua3.m21504s(this.f12018c, this.f12022g);
    }

    public final int size() {
        return this.f12022g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo11658w() {
        return true;
    }
}
