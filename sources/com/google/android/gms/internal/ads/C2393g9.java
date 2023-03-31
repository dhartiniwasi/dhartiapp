package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.g9 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2393g9 {

    /* renamed from: a */
    private final String f9779a;

    /* renamed from: b */
    private final String f9780b;

    public C2393g9(String str, String str2) {
        this.f9779a = str;
        this.f9780b = str2;
    }

    /* renamed from: a */
    public final String mo10420a() {
        return this.f9779a;
    }

    /* renamed from: b */
    public final String mo10421b() {
        return this.f9780b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2393g9.class == obj.getClass()) {
            C2393g9 g9Var = (C2393g9) obj;
            return TextUtils.equals(this.f9779a, g9Var.f9779a) && TextUtils.equals(this.f9780b, g9Var.f9780b);
        }
    }

    public final int hashCode() {
        return (this.f9779a.hashCode() * 31) + this.f9780b.hashCode();
    }

    public final String toString() {
        String str = this.f9779a;
        String str2 = this.f9780b;
        return "Header[name=" + str + ",value=" + str2 + "]";
    }
}
