package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.a2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2163a2 extends C2460i2 {
    public static final Parcelable.Creator<C2163a2> CREATOR = new C3090z1();

    /* renamed from: b */
    public final String f6374b;

    /* renamed from: c */
    public final String f6375c;

    /* renamed from: d */
    public final String f6376d;

    C2163a2(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = gb2.f9812a;
        this.f6374b = readString;
        this.f6375c = parcel.readString();
        this.f6376d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2163a2.class == obj.getClass()) {
            C2163a2 a2Var = (C2163a2) obj;
            return gb2.m13186t(this.f6375c, a2Var.f6375c) && gb2.m13186t(this.f6374b, a2Var.f6374b) && gb2.m13186t(this.f6376d, a2Var.f6376d);
        }
    }

    public final int hashCode() {
        String str = this.f6374b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f6375c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6376d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f10589a;
        String str2 = this.f6374b;
        String str3 = this.f6375c;
        return str + ": language=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10589a);
        parcel.writeString(this.f6374b);
        parcel.writeString(this.f6376d);
    }

    public C2163a2(String str, String str2, String str3) {
        super("COMM");
        this.f6374b = str;
        this.f6375c = str2;
        this.f6376d = str3;
    }
}
