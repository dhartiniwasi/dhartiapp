package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: com.startapp.e7 */
/* compiled from: Sta */
public class C8928e7 {

    /* renamed from: a */
    public String f36722a;

    /* renamed from: b */
    public String f36723b;

    /* renamed from: c */
    public Set<String> f36724c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8928e7.class != obj.getClass()) {
            return false;
        }
        return this.f36722a.equals(((C8928e7) obj).f36722a);
    }

    public int hashCode() {
        Object[] objArr = {this.f36722a};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        StringBuilder a = C8870c1.m48422a("NameValueObject [name=");
        a.append(this.f36722a);
        a.append(", value=");
        a.append(this.f36723b);
        a.append(", valueSet=");
        a.append(this.f36724c);
        a.append("]");
        return a.toString();
    }
}
