package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.m1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2608m1 implements j50 {
    public static final Parcelable.Creator<C2608m1> CREATOR = new C2571l1();

    /* renamed from: a */
    public final int f13149a;

    /* renamed from: b */
    public final String f13150b;

    /* renamed from: c */
    public final String f13151c;

    /* renamed from: d */
    public final int f13152d;

    /* renamed from: e */
    public final int f13153e;

    /* renamed from: f */
    public final int f13154f;

    /* renamed from: g */
    public final int f13155g;

    /* renamed from: h */
    public final byte[] f13156h;

    public C2608m1(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f13149a = i;
        this.f13150b = str;
        this.f13151c = str2;
        this.f13152d = i2;
        this.f13153e = i3;
        this.f13154f = i4;
        this.f13155g = i5;
        this.f13156h = bArr;
    }

    C2608m1(Parcel parcel) {
        this.f13149a = parcel.readInt();
        String readString = parcel.readString();
        int i = gb2.f9812a;
        this.f13150b = readString;
        this.f13151c = parcel.readString();
        this.f13152d = parcel.readInt();
        this.f13153e = parcel.readInt();
        this.f13154f = parcel.readInt();
        this.f13155g = parcel.readInt();
        this.f13156h = (byte[]) gb2.m13171h(parcel.createByteArray());
    }

    /* renamed from: a */
    public static C2608m1 m16352a(y22 y22) {
        int m = y22.mo15300m();
        String F = y22.mo15285F(y22.mo15300m(), o73.f14984a);
        String F2 = y22.mo15285F(y22.mo15300m(), o73.f14986c);
        int m2 = y22.mo15300m();
        int m3 = y22.mo15300m();
        int m4 = y22.mo15300m();
        int m5 = y22.mo15300m();
        int m6 = y22.mo15300m();
        byte[] bArr = new byte[m6];
        y22.mo15289b(bArr, 0, m6);
        return new C2608m1(m, F, F2, m2, m3, m4, m5, bArr);
    }

    /* renamed from: E0 */
    public final void mo8652E0(l00 l00) {
        l00.mo11853q(this.f13156h, this.f13149a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2608m1.class == obj.getClass()) {
            C2608m1 m1Var = (C2608m1) obj;
            return this.f13149a == m1Var.f13149a && this.f13150b.equals(m1Var.f13150b) && this.f13151c.equals(m1Var.f13151c) && this.f13152d == m1Var.f13152d && this.f13153e == m1Var.f13153e && this.f13154f == m1Var.f13154f && this.f13155g == m1Var.f13155g && Arrays.equals(this.f13156h, m1Var.f13156h);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f13149a + 527) * 31) + this.f13150b.hashCode()) * 31) + this.f13151c.hashCode()) * 31) + this.f13152d) * 31) + this.f13153e) * 31) + this.f13154f) * 31) + this.f13155g) * 31) + Arrays.hashCode(this.f13156h);
    }

    public final String toString() {
        String str = this.f13150b;
        String str2 = this.f13151c;
        return "Picture: mimeType=" + str + ", description=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13149a);
        parcel.writeString(this.f13150b);
        parcel.writeString(this.f13151c);
        parcel.writeInt(this.f13152d);
        parcel.writeInt(this.f13153e);
        parcel.writeInt(this.f13154f);
        parcel.writeInt(this.f13155g);
        parcel.writeByteArray(this.f13156h);
    }
}
