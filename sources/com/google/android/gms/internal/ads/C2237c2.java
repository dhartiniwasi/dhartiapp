package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.c2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2237c2 extends C2460i2 {
    public static final Parcelable.Creator<C2237c2> CREATOR = new C2200b2();

    /* renamed from: b */
    public final String f7572b;

    /* renamed from: c */
    public final String f7573c;

    /* renamed from: d */
    public final String f7574d;

    /* renamed from: e */
    public final byte[] f7575e;

    C2237c2(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = gb2.f9812a;
        this.f7572b = readString;
        this.f7573c = parcel.readString();
        this.f7574d = parcel.readString();
        this.f7575e = (byte[]) gb2.m13171h(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2237c2.class == obj.getClass()) {
            C2237c2 c2Var = (C2237c2) obj;
            return gb2.m13186t(this.f7572b, c2Var.f7572b) && gb2.m13186t(this.f7573c, c2Var.f7573c) && gb2.m13186t(this.f7574d, c2Var.f7574d) && Arrays.equals(this.f7575e, c2Var.f7575e);
        }
    }

    public final int hashCode() {
        String str = this.f7572b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f7573c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7574d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f7575e);
    }

    public final String toString() {
        String str = this.f10589a;
        String str2 = this.f7572b;
        String str3 = this.f7573c;
        String str4 = this.f7574d;
        return str + ": mimeType=" + str2 + ", filename=" + str3 + ", description=" + str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7572b);
        parcel.writeString(this.f7573c);
        parcel.writeString(this.f7574d);
        parcel.writeByteArray(this.f7575e);
    }

    public C2237c2(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f7572b = str;
        this.f7573c = str2;
        this.f7574d = str3;
        this.f7575e = bArr;
    }
}
