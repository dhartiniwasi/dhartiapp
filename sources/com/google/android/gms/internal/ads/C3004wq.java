package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.wq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3004wq implements Parcelable {
    public static final Parcelable.Creator<C3004wq> CREATOR = new C2967vq();

    /* renamed from: a */
    public final int f19737a;

    /* renamed from: b */
    public final int f19738b;

    /* renamed from: c */
    public final int f19739c;

    /* renamed from: d */
    public final byte[] f19740d;

    /* renamed from: e */
    private int f19741e;

    public C3004wq(int i, int i2, int i3, byte[] bArr) {
        this.f19737a = i;
        this.f19738b = i2;
        this.f19739c = i3;
        this.f19740d = bArr;
    }

    C3004wq(Parcel parcel) {
        this.f19737a = parcel.readInt();
        this.f19738b = parcel.readInt();
        this.f19739c = parcel.readInt();
        this.f19740d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3004wq.class == obj.getClass()) {
            C3004wq wqVar = (C3004wq) obj;
            return this.f19737a == wqVar.f19737a && this.f19738b == wqVar.f19738b && this.f19739c == wqVar.f19739c && Arrays.equals(this.f19740d, wqVar.f19740d);
        }
    }

    public final int hashCode() {
        int i = this.f19741e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f19737a + 527) * 31) + this.f19738b) * 31) + this.f19739c) * 31) + Arrays.hashCode(this.f19740d);
        this.f19741e = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f19737a;
        int i2 = this.f19738b;
        int i3 = this.f19739c;
        boolean z = this.f19740d != null;
        return "ColorInfo(" + i + ", " + i2 + ", " + i3 + ", " + z + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19737a);
        parcel.writeInt(this.f19738b);
        parcel.writeInt(this.f19739c);
        parcel.writeInt(this.f19740d != null ? 1 : 0);
        byte[] bArr = this.f19740d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
