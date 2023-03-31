package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.y1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3053y1 extends C2460i2 {
    public static final Parcelable.Creator<C3053y1> CREATOR = new C3016x1();

    /* renamed from: b */
    public final String f20423b;

    /* renamed from: c */
    public final boolean f20424c;

    /* renamed from: d */
    public final boolean f20425d;

    /* renamed from: e */
    public final String[] f20426e;

    /* renamed from: f */
    private final C2460i2[] f20427f;

    C3053y1(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = gb2.f9812a;
        this.f20423b = readString;
        boolean z = true;
        this.f20424c = parcel.readByte() != 0;
        this.f20425d = parcel.readByte() == 0 ? false : z;
        this.f20426e = (String[]) gb2.m13171h(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f20427f = new C2460i2[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f20427f[i2] = (C2460i2) parcel.readParcelable(C2460i2.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3053y1.class == obj.getClass()) {
            C3053y1 y1Var = (C3053y1) obj;
            return this.f20424c == y1Var.f20424c && this.f20425d == y1Var.f20425d && gb2.m13186t(this.f20423b, y1Var.f20423b) && Arrays.equals(this.f20426e, y1Var.f20426e) && Arrays.equals(this.f20427f, y1Var.f20427f);
        }
    }

    public final int hashCode() {
        int i = ((((this.f20424c ? 1 : 0) + true) * 31) + (this.f20425d ? 1 : 0)) * 31;
        String str = this.f20423b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20423b);
        parcel.writeByte(this.f20424c ? (byte) 1 : 0);
        parcel.writeByte(this.f20425d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f20426e);
        parcel.writeInt(this.f20427f.length);
        for (C2460i2 writeParcelable : this.f20427f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C3053y1(String str, boolean z, boolean z2, String[] strArr, C2460i2[] i2VarArr) {
        super("CTOC");
        this.f20423b = str;
        this.f20424c = z;
        this.f20425d = z2;
        this.f20426e = strArr;
        this.f20427f = i2VarArr;
    }
}
