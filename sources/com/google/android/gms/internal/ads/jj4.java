package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jj4 extends l01 {

    /* renamed from: S */
    public static final jj4 f11659S;
    @Deprecated

    /* renamed from: T */
    public static final jj4 f11660T;

    /* renamed from: U */
    public static final za4 f11661U = fj4.f9299a;

    /* renamed from: D */
    public final boolean f11662D;

    /* renamed from: E */
    public final boolean f11663E;

    /* renamed from: F */
    public final boolean f11664F;

    /* renamed from: G */
    public final boolean f11665G;

    /* renamed from: H */
    public final boolean f11666H;

    /* renamed from: I */
    public final boolean f11667I;

    /* renamed from: J */
    public final boolean f11668J;

    /* renamed from: K */
    public final boolean f11669K;

    /* renamed from: L */
    public final boolean f11670L;

    /* renamed from: M */
    public final boolean f11671M;

    /* renamed from: N */
    public final boolean f11672N;

    /* renamed from: O */
    public final boolean f11673O;

    /* renamed from: P */
    public final boolean f11674P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final SparseArray f11675Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final SparseBooleanArray f11676R;

    static {
        jj4 jj4 = new jj4(new hj4());
        f11659S = jj4;
        f11660T = jj4;
    }

    private jj4(hj4 hj4) {
        super(hj4);
        this.f11662D = hj4.f10349q;
        this.f11663E = false;
        this.f11664F = hj4.f10350r;
        this.f11665G = false;
        this.f11666H = hj4.f10351s;
        this.f11667I = false;
        this.f11668J = false;
        this.f11669K = false;
        this.f11670L = false;
        this.f11671M = hj4.f10352t;
        this.f11672N = hj4.f10353u;
        this.f11673O = false;
        this.f11674P = hj4.f10354v;
        this.f11675Q = hj4.f10355w;
        this.f11676R = hj4.f10356x;
    }

    /* renamed from: d */
    public static jj4 m14919d(Context context) {
        return new jj4(new hj4(context));
    }

    /* renamed from: c */
    public final hj4 mo11410c() {
        return new hj4(this, (gj4) null);
    }

    @Deprecated
    /* renamed from: e */
    public final lj4 mo11411e(int i, ki4 ki4) {
        Map map = (Map) this.f11675Q.get(i);
        if (map != null) {
            return (lj4) map.get(ki4);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jj4.class == obj.getClass()) {
            jj4 jj4 = (jj4) obj;
            if (super.equals(jj4) && this.f11662D == jj4.f11662D && this.f11664F == jj4.f11664F && this.f11666H == jj4.f11666H && this.f11671M == jj4.f11671M && this.f11672N == jj4.f11672N && this.f11674P == jj4.f11674P) {
                SparseBooleanArray sparseBooleanArray = this.f11676R;
                SparseBooleanArray sparseBooleanArray2 = jj4.f11676R;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.f11675Q;
                            SparseArray sparseArray2 = jj4.f11675Q;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i2 = 0;
                                while (i2 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                ki4 ki4 = (ki4) entry.getKey();
                                                if (map2.containsKey(ki4)) {
                                                    if (!gb2.m13186t(entry.getValue(), map2.get(ki4))) {
                                                    }
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo11413f(int i) {
        return this.f11676R.get(i);
    }

    @Deprecated
    /* renamed from: g */
    public final boolean mo11414g(int i, ki4 ki4) {
        Map map = (Map) this.f11675Q.get(i);
        return map != null && map.containsKey(ki4);
    }

    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.f11662D ? 1 : 0)) * 961) + (this.f11664F ? 1 : 0)) * 961) + (this.f11666H ? 1 : 0)) * 28629151) + (this.f11671M ? 1 : 0)) * 31) + (this.f11672N ? 1 : 0)) * 961) + (this.f11674P ? 1 : 0);
    }
}
