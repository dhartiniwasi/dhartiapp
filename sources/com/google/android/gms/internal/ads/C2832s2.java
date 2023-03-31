package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.s2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2832s2 extends C2460i2 {
    public static final Parcelable.Creator<C2832s2> CREATOR = new C2795r2();

    /* renamed from: b */
    public final String f17197b;

    /* renamed from: c */
    public final String f17198c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2832s2(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.gb2.f9812a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f17197b = r0
            java.lang.String r3 = r3.readString()
            r2.f17198c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2832s2.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2832s2.class == obj.getClass()) {
            C2832s2 s2Var = (C2832s2) obj;
            return this.f10589a.equals(s2Var.f10589a) && gb2.m13186t(this.f17197b, s2Var.f17197b) && gb2.m13186t(this.f17198c, s2Var.f17198c);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f10589a.hashCode() + 527) * 31;
        String str = this.f17197b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17198c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f10589a;
        String str2 = this.f17198c;
        return str + ": url=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10589a);
        parcel.writeString(this.f17197b);
        parcel.writeString(this.f17198c);
    }

    public C2832s2(String str, String str2, String str3) {
        super(str);
        this.f17197b = str2;
        this.f17198c = str3;
    }
}
