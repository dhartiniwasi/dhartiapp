package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hj4 extends kz0 {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f10349q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f10350r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f10351s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f10352t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f10353u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f10354v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final SparseArray f10355w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final SparseBooleanArray f10356x;

    @Deprecated
    public hj4() {
        this.f10355w = new SparseArray();
        this.f10356x = new SparseBooleanArray();
        m13887v();
    }

    /* renamed from: v */
    private final void m13887v() {
        this.f10349q = true;
        this.f10350r = true;
        this.f10351s = true;
        this.f10352t = true;
        this.f10353u = true;
        this.f10354v = true;
    }

    /* renamed from: e */
    public final /* synthetic */ kz0 mo10825e(int i, int i2, boolean z) {
        super.mo10825e(i, i2, true);
        return this;
    }

    /* renamed from: o */
    public final hj4 mo10826o(int i, boolean z) {
        if (this.f10356x.get(i) == z) {
            return this;
        }
        if (z) {
            this.f10356x.put(i, true);
        } else {
            this.f10356x.delete(i);
        }
        return this;
    }

    public hj4(Context context) {
        super.mo11825d(context);
        Point b = gb2.m13159b(context);
        mo10825e(b.x, b.y, true);
        this.f10355w = new SparseArray();
        this.f10356x = new SparseBooleanArray();
        m13887v();
    }

    /* synthetic */ hj4(jj4 jj4, gj4 gj4) {
        super(jj4);
        this.f10349q = jj4.f11662D;
        this.f10350r = jj4.f11664F;
        this.f10351s = jj4.f11666H;
        this.f10352t = jj4.f11671M;
        this.f10353u = jj4.f11672N;
        this.f10354v = jj4.f11674P;
        SparseArray a = jj4.f11675Q;
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < a.size(); i++) {
            sparseArray.put(a.keyAt(i), new HashMap((Map) a.valueAt(i)));
        }
        this.f10355w = sparseArray;
        this.f10356x = jj4.f11676R.clone();
    }
}
