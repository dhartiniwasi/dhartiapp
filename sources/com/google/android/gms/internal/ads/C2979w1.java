package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.w1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2979w1 extends C2460i2 {
    public static final Parcelable.Creator<C2979w1> CREATOR = new C2942v1();

    /* renamed from: b */
    public final String f19411b;

    /* renamed from: c */
    public final int f19412c;

    /* renamed from: d */
    public final int f19413d;

    /* renamed from: e */
    public final long f19414e;

    /* renamed from: f */
    public final long f19415f;

    /* renamed from: g */
    private final C2460i2[] f19416g;

    C2979w1(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = gb2.f9812a;
        this.f19411b = readString;
        this.f19412c = parcel.readInt();
        this.f19413d = parcel.readInt();
        this.f19414e = parcel.readLong();
        this.f19415f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f19416g = new C2460i2[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f19416g[i2] = (C2460i2) parcel.readParcelable(C2460i2.class.getClassLoader());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2979w1.class == obj.getClass()) {
            C2979w1 w1Var = (C2979w1) obj;
            return this.f19412c == w1Var.f19412c && this.f19413d == w1Var.f19413d && this.f19414e == w1Var.f19414e && this.f19415f == w1Var.f19415f && gb2.m13186t(this.f19411b, w1Var.f19411b) && Arrays.equals(this.f19416g, w1Var.f19416g);
        }
    }

    public final int hashCode() {
        int i = (((((((this.f19412c + 527) * 31) + this.f19413d) * 31) + ((int) this.f19414e)) * 31) + ((int) this.f19415f)) * 31;
        String str = this.f19411b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19411b);
        parcel.writeInt(this.f19412c);
        parcel.writeInt(this.f19413d);
        parcel.writeLong(this.f19414e);
        parcel.writeLong(this.f19415f);
        parcel.writeInt(this.f19416g.length);
        for (C2460i2 writeParcelable : this.f19416g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C2979w1(String str, int i, int i2, long j, long j2, C2460i2[] i2VarArr) {
        super("CHAP");
        this.f19411b = str;
        this.f19412c = i;
        this.f19413d = i2;
        this.f19414e = j;
        this.f19415f = j2;
        this.f19416g = i2VarArr;
    }
}
