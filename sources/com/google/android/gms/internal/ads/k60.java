package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class k60 implements Parcelable {
    public static final Parcelable.Creator<k60> CREATOR = new l40();

    /* renamed from: a */
    private final j50[] f11926a;

    /* renamed from: b */
    public final long f11927b;

    public k60(long j, j50... j50Arr) {
        this.f11927b = j;
        this.f11926a = j50Arr;
    }

    k60(Parcel parcel) {
        this.f11926a = new j50[parcel.readInt()];
        int i = 0;
        while (true) {
            j50[] j50Arr = this.f11926a;
            if (i < j50Arr.length) {
                j50Arr[i] = (j50) parcel.readParcelable(j50.class.getClassLoader());
                i++;
            } else {
                this.f11927b = parcel.readLong();
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo11568a() {
        return this.f11926a.length;
    }

    /* renamed from: b */
    public final j50 mo11569b(int i) {
        return this.f11926a[i];
    }

    /* renamed from: c */
    public final k60 mo11570c(j50... j50Arr) {
        if (j50Arr.length == 0) {
            return this;
        }
        return new k60(this.f11927b, (j50[]) gb2.m13135E(this.f11926a, j50Arr));
    }

    /* renamed from: d */
    public final k60 mo11571d(k60 k60) {
        return k60 == null ? this : mo11570c(k60.f11926a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k60.class == obj.getClass()) {
            k60 k60 = (k60) obj;
            return Arrays.equals(this.f11926a, k60.f11926a) && this.f11927b == k60.f11927b;
        }
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f11926a);
        long j = this.f11927b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        String arrays = Arrays.toString(this.f11926a);
        long j = this.f11927b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + arrays + str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11926a.length);
        for (j50 writeParcelable : this.f11926a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.f11927b);
    }

    public k60(List list) {
        this(-9223372036854775807L, (j50[]) list.toArray(new j50[0]));
    }
}
