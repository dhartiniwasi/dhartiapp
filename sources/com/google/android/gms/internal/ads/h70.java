package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class h70 extends C4240a {
    public static final Parcelable.Creator<h70> CREATOR = new i70();

    /* renamed from: a */
    public final boolean f10216a;

    /* renamed from: b */
    public final String f10217b;

    /* renamed from: c */
    public final int f10218c;

    /* renamed from: d */
    public final byte[] f10219d;

    /* renamed from: e */
    public final String[] f10220e;

    /* renamed from: f */
    public final String[] f10221f;

    /* renamed from: g */
    public final boolean f10222g;

    /* renamed from: h */
    public final long f10223h;

    h70(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f10216a = z;
        this.f10217b = str;
        this.f10218c = i;
        this.f10219d = bArr;
        this.f10220e = strArr;
        this.f10221f = strArr2;
        this.f10222g = z2;
        this.f10223h = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28606c(parcel, 1, this.f10216a);
        C4243c.m28620q(parcel, 2, this.f10217b, false);
        C4243c.m28614k(parcel, 3, this.f10218c);
        C4243c.m28609f(parcel, 4, this.f10219d, false);
        C4243c.m28621r(parcel, 5, this.f10220e, false);
        C4243c.m28621r(parcel, 6, this.f10221f, false);
        C4243c.m28606c(parcel, 7, this.f10222g);
        C4243c.m28617n(parcel, 8, this.f10223h);
        C4243c.m28605b(parcel, a);
    }
}
