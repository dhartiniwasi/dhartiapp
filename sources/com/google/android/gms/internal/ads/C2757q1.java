package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.q1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2757q1 implements j50 {
    public static final Parcelable.Creator<C2757q1> CREATOR = new C2719p1();

    /* renamed from: a */
    public final int f16118a;

    /* renamed from: b */
    public final String f16119b;

    /* renamed from: c */
    public final String f16120c;

    /* renamed from: d */
    public final String f16121d;

    /* renamed from: e */
    public final boolean f16122e;

    /* renamed from: f */
    public final int f16123f;

    public C2757q1(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        v91.m22050d(z2);
        this.f16118a = i;
        this.f16119b = str;
        this.f16120c = str2;
        this.f16121d = str3;
        this.f16122e = z;
        this.f16123f = i2;
    }

    /* renamed from: E0 */
    public final void mo8652E0(l00 l00) {
        String str = this.f16120c;
        if (str != null) {
            l00.mo11847G(str);
        }
        String str2 = this.f16119b;
        if (str2 != null) {
            l00.mo11862z(str2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2757q1.class == obj.getClass()) {
            C2757q1 q1Var = (C2757q1) obj;
            return this.f16118a == q1Var.f16118a && gb2.m13186t(this.f16119b, q1Var.f16119b) && gb2.m13186t(this.f16120c, q1Var.f16120c) && gb2.m13186t(this.f16121d, q1Var.f16121d) && this.f16122e == q1Var.f16122e && this.f16123f == q1Var.f16123f;
        }
    }

    public final int hashCode() {
        int i = (this.f16118a + 527) * 31;
        String str = this.f16119b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16120c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16121d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f16122e ? 1 : 0)) * 31) + this.f16123f;
    }

    public final String toString() {
        String str = this.f16120c;
        String str2 = this.f16119b;
        int i = this.f16118a;
        int i2 = this.f16123f;
        return "IcyHeaders: name=\"" + str + "\", genre=\"" + str2 + "\", bitrate=" + i + ", metadataInterval=" + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16118a);
        parcel.writeString(this.f16119b);
        parcel.writeString(this.f16120c);
        parcel.writeString(this.f16121d);
        gb2.m13185s(parcel, this.f16122e);
        parcel.writeInt(this.f16123f);
    }

    C2757q1(Parcel parcel) {
        this.f16118a = parcel.readInt();
        this.f16119b = parcel.readString();
        this.f16120c = parcel.readString();
        this.f16121d = parcel.readString();
        this.f16122e = gb2.m13192z(parcel);
        this.f16123f = parcel.readInt();
    }
}
