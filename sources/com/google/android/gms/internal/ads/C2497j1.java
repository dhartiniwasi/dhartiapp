package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.j1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2497j1 implements j50 {
    public static final Parcelable.Creator<C2497j1> CREATOR = new C2459i1();

    /* renamed from: g */
    private static final C2388g4 f11162g;

    /* renamed from: h */
    private static final C2388g4 f11163h;

    /* renamed from: a */
    public final String f11164a;

    /* renamed from: b */
    public final String f11165b;

    /* renamed from: c */
    public final long f11166c;

    /* renamed from: d */
    public final long f11167d;

    /* renamed from: e */
    public final byte[] f11168e;

    /* renamed from: f */
    private int f11169f;

    static {
        C2311e2 e2Var = new C2311e2();
        e2Var.mo9776s("application/id3");
        f11162g = e2Var.mo9782y();
        C2311e2 e2Var2 = new C2311e2();
        e2Var2.mo9776s("application/x-scte35");
        f11163h = e2Var2.mo9782y();
    }

    C2497j1(Parcel parcel) {
        String readString = parcel.readString();
        int i = gb2.f9812a;
        this.f11164a = readString;
        this.f11165b = parcel.readString();
        this.f11166c = parcel.readLong();
        this.f11167d = parcel.readLong();
        this.f11168e = (byte[]) gb2.m13171h(parcel.createByteArray());
    }

    public C2497j1(String str, String str2, long j, long j2, byte[] bArr) {
        this.f11164a = str;
        this.f11165b = str2;
        this.f11166c = j;
        this.f11167d = j2;
        this.f11168e = bArr;
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
        if (obj != null && C2497j1.class == obj.getClass()) {
            C2497j1 j1Var = (C2497j1) obj;
            return this.f11166c == j1Var.f11166c && this.f11167d == j1Var.f11167d && gb2.m13186t(this.f11164a, j1Var.f11164a) && gb2.m13186t(this.f11165b, j1Var.f11165b) && Arrays.equals(this.f11168e, j1Var.f11168e);
        }
    }

    public final int hashCode() {
        int i = this.f11169f;
        if (i != 0) {
            return i;
        }
        String str = this.f11164a;
        int i2 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f11165b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.f11166c;
        long j2 = this.f11167d;
        int hashCode2 = ((((((hashCode + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.f11168e);
        this.f11169f = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String str = this.f11164a;
        long j = this.f11167d;
        long j2 = this.f11166c;
        String str2 = this.f11165b;
        return "EMSG: scheme=" + str + ", id=" + j + ", durationMs=" + j2 + ", value=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11164a);
        parcel.writeString(this.f11165b);
        parcel.writeLong(this.f11166c);
        parcel.writeLong(this.f11167d);
        parcel.writeByteArray(this.f11168e);
    }
}
