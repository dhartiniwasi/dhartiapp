package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ek4 implements Parcelable {
    public static final Parcelable.Creator<ek4> CREATOR = new dj4();

    /* renamed from: a */
    private int f8834a;

    /* renamed from: b */
    public final UUID f8835b;

    /* renamed from: c */
    public final String f8836c;

    /* renamed from: d */
    public final String f8837d;

    /* renamed from: e */
    public final byte[] f8838e;

    ek4(Parcel parcel) {
        this.f8835b = new UUID(parcel.readLong(), parcel.readLong());
        this.f8836c = parcel.readString();
        String readString = parcel.readString();
        int i = gb2.f9812a;
        this.f8837d = readString;
        this.f8838e = parcel.createByteArray();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ek4)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ek4 ek4 = (ek4) obj;
        return gb2.m13186t(this.f8836c, ek4.f8836c) && gb2.m13186t(this.f8837d, ek4.f8837d) && gb2.m13186t(this.f8835b, ek4.f8835b) && Arrays.equals(this.f8838e, ek4.f8838e);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f8834a;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f8835b.hashCode() * 31;
        String str = this.f8836c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = ((((hashCode + i) * 31) + this.f8837d.hashCode()) * 31) + Arrays.hashCode(this.f8838e);
        this.f8834a = hashCode2;
        return hashCode2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8835b.getMostSignificantBits());
        parcel.writeLong(this.f8835b.getLeastSignificantBits());
        parcel.writeString(this.f8836c);
        parcel.writeString(this.f8837d);
        parcel.writeByteArray(this.f8838e);
    }

    public ek4(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.f8835b = uuid;
        this.f8836c = null;
        this.f8837d = str2;
        this.f8838e = bArr;
    }
}
