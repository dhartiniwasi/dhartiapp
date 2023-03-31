package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class na3 extends oa3 {

    /* renamed from: a */
    Object[] f13929a;

    /* renamed from: b */
    int f13930b = 0;

    /* renamed from: c */
    boolean f13931c;

    na3(int i) {
        this.f13929a = new Object[i];
    }

    /* renamed from: e */
    private final void m16995e(int i) {
        Object[] objArr = this.f13929a;
        int length = objArr.length;
        if (length < i) {
            this.f13929a = Arrays.copyOf(objArr, oa3.m17662b(length, i));
            this.f13931c = false;
        } else if (this.f13931c) {
            this.f13929a = (Object[]) objArr.clone();
            this.f13931c = false;
        }
    }

    /* renamed from: c */
    public final na3 mo12560c(Object obj) {
        Objects.requireNonNull(obj);
        m16995e(this.f13930b + 1);
        Object[] objArr = this.f13929a;
        int i = this.f13930b;
        this.f13930b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* renamed from: d */
    public final oa3 mo12561d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m16995e(this.f13930b + collection.size());
            if (collection instanceof pa3) {
                this.f13930b = ((pa3) collection).mo9535b(this.f13929a, this.f13930b);
                return this;
            }
        }
        for (Object a : iterable) {
            mo12886a(a);
        }
        return this;
    }
}
