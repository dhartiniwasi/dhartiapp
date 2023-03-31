package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.qk */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2776qk implements Parcelable {
    public static final Parcelable.Creator<C2776qk> CREATOR = new C2739pk();

    /* renamed from: a */
    private int f16422a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final UUID f16423b;

    /* renamed from: c */
    public final String f16424c;

    /* renamed from: d */
    public final byte[] f16425d;

    /* renamed from: e */
    public final boolean f16426e;

    C2776qk(Parcel parcel) {
        this.f16423b = new UUID(parcel.readLong(), parcel.readLong());
        this.f16424c = parcel.readString();
        this.f16425d = parcel.createByteArray();
        this.f16426e = parcel.readByte() != 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2776qk)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2776qk qkVar = (C2776qk) obj;
        return this.f16424c.equals(qkVar.f16424c) && C2893tq.m21184o(this.f16423b, qkVar.f16423b) && Arrays.equals(this.f16425d, qkVar.f16425d);
    }

    public final int hashCode() {
        int i = this.f16422a;
        if (i != 0) {
            return i;
        }
        int hashCode = (((this.f16423b.hashCode() * 31) + this.f16424c.hashCode()) * 31) + Arrays.hashCode(this.f16425d);
        this.f16422a = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f16423b.getMostSignificantBits());
        parcel.writeLong(this.f16423b.getLeastSignificantBits());
        parcel.writeString(this.f16424c);
        parcel.writeByteArray(this.f16425d);
        parcel.writeByte(this.f16426e ? (byte) 1 : 0);
    }

    public C2776qk(UUID uuid, String str, byte[] bArr, boolean z) {
        Objects.requireNonNull(uuid);
        this.f16423b = uuid;
        this.f16424c = str;
        Objects.requireNonNull(bArr);
        this.f16425d = bArr;
        this.f16426e = false;
    }
}
