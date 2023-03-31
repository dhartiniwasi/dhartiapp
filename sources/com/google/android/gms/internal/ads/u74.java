package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class u74 extends gp3 {

    /* renamed from: e */
    private final int f18440e;

    /* renamed from: f */
    private final int f18441f;

    /* renamed from: g */
    private final int[] f18442g;

    /* renamed from: h */
    private final int[] f18443h;

    /* renamed from: i */
    private final gt0[] f18444i;

    /* renamed from: j */
    private final Object[] f18445j;

    /* renamed from: k */
    private final HashMap f18446k = new HashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u74(Collection collection, gi4 gi4, byte[] bArr) {
        super(false, gi4, (byte[]) null);
        int i = 0;
        int size = collection.size();
        this.f18442g = new int[size];
        this.f18443h = new int[size];
        this.f18444i = new gt0[size];
        this.f18445j = new Object[size];
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            j74 j74 = (j74) it.next();
            this.f18444i[i3] = j74.zza();
            this.f18443h[i3] = i;
            this.f18442g[i3] = i2;
            i += this.f18444i[i3].mo8901c();
            i2 += this.f18444i[i3].mo8900b();
            this.f18445j[i3] = j74.mo11336d();
            this.f18446k.put(this.f18445j[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f18440e = i;
        this.f18441f = i2;
    }

    /* renamed from: b */
    public final int mo8900b() {
        return this.f18441f;
    }

    /* renamed from: c */
    public final int mo8901c() {
        return this.f18440e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo10609p(Object obj) {
        Integer num = (Integer) this.f18446k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo10610q(int i) {
        return gb2.m13143M(this.f18442g, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo10611r(int i) {
        return gb2.m13143M(this.f18443h, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final int mo10612s(int i) {
        return this.f18442g[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo10613t(int i) {
        return this.f18443h[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final gt0 mo10614u(int i) {
        return this.f18444i[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo10615v(int i) {
        return this.f18445j[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final List mo14457y() {
        return Arrays.asList(this.f18444i);
    }
}
