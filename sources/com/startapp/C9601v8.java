package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.startapp.v8 */
/* compiled from: Sta */
public class C9601v8 extends C8861b9 {

    /* renamed from: a */
    public final List<C9043j4> f39297a;

    public C9601v8(List<C9043j4> list) {
        this.f39297a = list;
    }

    /* renamed from: a */
    public boolean mo29235a(Object obj) {
        if (obj instanceof C9257r4) {
            return this.f39297a.contains(((C9257r4) obj).f38139h0.f36949a);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9601v8.class != obj.getClass()) {
            return false;
        }
        return C9605vb.m50465a(this.f39297a, ((C9601v8) obj).f39297a);
    }

    public int hashCode() {
        Object[] objArr = {this.f39297a};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
