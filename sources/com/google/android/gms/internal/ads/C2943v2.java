package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.v2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2943v2 implements j50 {
    public static final Parcelable.Creator<C2943v2> CREATOR = new C2869t2();

    /* renamed from: a */
    public final String f18885a;

    /* renamed from: b */
    public final byte[] f18886b;

    /* renamed from: c */
    public final int f18887c;

    /* renamed from: d */
    public final int f18888d;

    /* synthetic */ C2943v2(Parcel parcel, C2906u2 u2Var) {
        String readString = parcel.readString();
        int i = gb2.f9812a;
        this.f18885a = readString;
        this.f18886b = (byte[]) gb2.m13171h(parcel.createByteArray());
        this.f18887c = parcel.readInt();
        this.f18888d = parcel.readInt();
    }

    public C2943v2(String str, byte[] bArr, int i, int i2) {
        this.f18885a = str;
        this.f18886b = bArr;
        this.f18887c = i;
        this.f18888d = i2;
    }

    /* renamed from: E0 */
    public final /* synthetic */ void mo8652E0(l00 l00) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2943v2.class == obj.getClass()) {
            C2943v2 v2Var = (C2943v2) obj;
            return this.f18885a.equals(v2Var.f18885a) && Arrays.equals(this.f18886b, v2Var.f18886b) && this.f18887c == v2Var.f18887c && this.f18888d == v2Var.f18888d;
        }
    }

    public final int hashCode() {
        return ((((((this.f18885a.hashCode() + 527) * 31) + Arrays.hashCode(this.f18886b)) * 31) + this.f18887c) * 31) + this.f18888d;
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.f18885a));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18885a);
        parcel.writeByteArray(this.f18886b);
        parcel.writeInt(this.f18887c);
        parcel.writeInt(this.f18888d);
    }
}
