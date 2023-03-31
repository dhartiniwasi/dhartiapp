package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.startapp.s8 */
/* compiled from: Sta */
public class C9280s8 extends C8861b9 {

    /* renamed from: a */
    public final int f38196a;

    public C9280s8(int i) {
        this.f38196a = i;
    }

    /* renamed from: a */
    public boolean mo29235a(Object obj) {
        if (!(obj instanceof C9671z0)) {
            return false;
        }
        int i = ((C9671z0) obj).f39509Z;
        if ((this.f38196a & i) == i) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9280s8.class == obj.getClass() && this.f38196a == ((C9280s8) obj).f38196a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f38196a)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
