package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.startapp.u8 */
/* compiled from: Sta */
public class C9583u8 extends C8861b9 {

    /* renamed from: a */
    public final C9043j4 f39251a;

    /* renamed from: b */
    public final String f39252b;

    public C9583u8(C9043j4 j4Var, String str) {
        this.f39251a = j4Var;
        this.f39252b = str;
    }

    /* renamed from: a */
    public boolean mo29235a(Object obj) {
        if (!(obj instanceof C9257r4)) {
            return false;
        }
        C9043j4 j4Var = this.f39251a;
        C9023i4 i4Var = ((C9257r4) obj).f38139h0;
        if (j4Var != i4Var.f36949a) {
            return false;
        }
        String str = this.f39252b;
        if (str == null || str.equals(i4Var.f36952d)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9583u8.class != obj.getClass()) {
            return false;
        }
        C9583u8 u8Var = (C9583u8) obj;
        if (!C9605vb.m50465a(this.f39251a, u8Var.f39251a) || !C9605vb.m50465a(this.f39252b, u8Var.f39252b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.f39251a, this.f39252b};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
