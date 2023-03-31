package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.m2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2609m2 extends C2460i2 {
    public static final Parcelable.Creator<C2609m2> CREATOR = new C2572l2();

    /* renamed from: b */
    public final int f13160b;

    /* renamed from: c */
    public final int f13161c;

    /* renamed from: d */
    public final int f13162d;

    /* renamed from: e */
    public final int[] f13163e;

    /* renamed from: f */
    public final int[] f13164f;

    public C2609m2(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f13160b = i;
        this.f13161c = i2;
        this.f13162d = i3;
        this.f13163e = iArr;
        this.f13164f = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2609m2.class == obj.getClass()) {
            C2609m2 m2Var = (C2609m2) obj;
            return this.f13160b == m2Var.f13160b && this.f13161c == m2Var.f13161c && this.f13162d == m2Var.f13162d && Arrays.equals(this.f13163e, m2Var.f13163e) && Arrays.equals(this.f13164f, m2Var.f13164f);
        }
    }

    public final int hashCode() {
        return ((((((((this.f13160b + 527) * 31) + this.f13161c) * 31) + this.f13162d) * 31) + Arrays.hashCode(this.f13163e)) * 31) + Arrays.hashCode(this.f13164f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13160b);
        parcel.writeInt(this.f13161c);
        parcel.writeInt(this.f13162d);
        parcel.writeIntArray(this.f13163e);
        parcel.writeIntArray(this.f13164f);
    }

    C2609m2(Parcel parcel) {
        super("MLLT");
        this.f13160b = parcel.readInt();
        this.f13161c = parcel.readInt();
        this.f13162d = parcel.readInt();
        this.f13163e = (int[]) gb2.m13171h(parcel.createIntArray());
        this.f13164f = (int[]) gb2.m13171h(parcel.createIntArray());
    }
}
