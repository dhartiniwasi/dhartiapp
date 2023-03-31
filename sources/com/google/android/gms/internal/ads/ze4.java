package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ze4 {

    /* renamed from: a */
    public final String f21069a;

    /* renamed from: b */
    public final boolean f21070b;

    /* renamed from: c */
    public final boolean f21071c;

    public ze4(String str, boolean z, boolean z2) {
        this.f21069a = str;
        this.f21070b = z;
        this.f21071c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == ze4.class) {
            ze4 ze4 = (ze4) obj;
            return TextUtils.equals(this.f21069a, ze4.f21069a) && this.f21070b == ze4.f21070b && this.f21071c == ze4.f21071c;
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f21069a.hashCode() + 31) * 31) + (true != this.f21070b ? 1237 : 1231)) * 31;
        if (true == this.f21071c) {
            i = 1231;
        }
        return hashCode + i;
    }
}
