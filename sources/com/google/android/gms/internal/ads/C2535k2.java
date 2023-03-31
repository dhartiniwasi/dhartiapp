package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.k2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2535k2 extends C2460i2 {
    public static final Parcelable.Creator<C2535k2> CREATOR = new C2498j2();

    /* renamed from: b */
    public final String f11871b;

    /* renamed from: c */
    public final String f11872c;

    /* renamed from: d */
    public final String f11873d;

    C2535k2(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = gb2.f9812a;
        this.f11871b = readString;
        this.f11872c = parcel.readString();
        this.f11873d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2535k2.class == obj.getClass()) {
            C2535k2 k2Var = (C2535k2) obj;
            return gb2.m13186t(this.f11872c, k2Var.f11872c) && gb2.m13186t(this.f11871b, k2Var.f11871b) && gb2.m13186t(this.f11873d, k2Var.f11873d);
        }
    }

    public final int hashCode() {
        String str = this.f11871b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f11872c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11873d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f10589a;
        String str2 = this.f11871b;
        String str3 = this.f11872c;
        return str + ": domain=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10589a);
        parcel.writeString(this.f11871b);
        parcel.writeString(this.f11873d);
    }

    public C2535k2(String str, String str2, String str3) {
        super("----");
        this.f11871b = str;
        this.f11872c = str2;
        this.f11873d = str3;
    }
}
