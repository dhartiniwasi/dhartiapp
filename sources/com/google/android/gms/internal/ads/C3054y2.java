package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.y2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3054y2 implements j50 {
    public static final Parcelable.Creator<C3054y2> CREATOR = new C2980w2();

    /* renamed from: a */
    public final long f20439a;

    /* renamed from: b */
    public final long f20440b;

    /* renamed from: c */
    public final long f20441c;

    /* renamed from: d */
    public final long f20442d;

    /* renamed from: e */
    public final long f20443e;

    public C3054y2(long j, long j2, long j3, long j4, long j5) {
        this.f20439a = j;
        this.f20440b = j2;
        this.f20441c = j3;
        this.f20442d = j4;
        this.f20443e = j5;
    }

    /* synthetic */ C3054y2(Parcel parcel, C3017x2 x2Var) {
        this.f20439a = parcel.readLong();
        this.f20440b = parcel.readLong();
        this.f20441c = parcel.readLong();
        this.f20442d = parcel.readLong();
        this.f20443e = parcel.readLong();
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
        if (obj != null && C3054y2.class == obj.getClass()) {
            C3054y2 y2Var = (C3054y2) obj;
            return this.f20439a == y2Var.f20439a && this.f20440b == y2Var.f20440b && this.f20441c == y2Var.f20441c && this.f20442d == y2Var.f20442d && this.f20443e == y2Var.f20443e;
        }
    }

    public final int hashCode() {
        long j = this.f20439a;
        long j2 = this.f20440b;
        long j3 = this.f20441c;
        long j4 = this.f20442d;
        long j5 = this.f20443e;
        return ((((((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        long j = this.f20439a;
        long j2 = this.f20440b;
        long j3 = this.f20441c;
        long j4 = this.f20442d;
        long j5 = this.f20443e;
        return "Motion photo metadata: photoStartPosition=" + j + ", photoSize=" + j2 + ", photoPresentationTimestampUs=" + j3 + ", videoStartPosition=" + j4 + ", videoSize=" + j5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f20439a);
        parcel.writeLong(this.f20440b);
        parcel.writeLong(this.f20441c);
        parcel.writeLong(this.f20442d);
        parcel.writeLong(this.f20443e);
    }
}
