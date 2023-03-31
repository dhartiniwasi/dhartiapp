package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.measurement.n1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C7083n1 extends C4240a {
    public static final Parcelable.Creator<C7083n1> CREATOR = new C7099o1();

    /* renamed from: a */
    public final long f31900a;

    /* renamed from: b */
    public final long f31901b;

    /* renamed from: c */
    public final boolean f31902c;

    /* renamed from: d */
    public final String f31903d;

    /* renamed from: e */
    public final String f31904e;

    /* renamed from: f */
    public final String f31905f;

    /* renamed from: g */
    public final Bundle f31906g;

    /* renamed from: h */
    public final String f31907h;

    public C7083n1(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f31900a = j;
        this.f31901b = j2;
        this.f31902c = z;
        this.f31903d = str;
        this.f31904e = str2;
        this.f31905f = str3;
        this.f31906g = bundle;
        this.f31907h = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28617n(parcel, 1, this.f31900a);
        C4243c.m28617n(parcel, 2, this.f31901b);
        C4243c.m28606c(parcel, 3, this.f31902c);
        C4243c.m28620q(parcel, 4, this.f31903d, false);
        C4243c.m28620q(parcel, 5, this.f31904e, false);
        C4243c.m28620q(parcel, 6, this.f31905f, false);
        C4243c.m28608e(parcel, 7, this.f31906g, false);
        C4243c.m28620q(parcel, 8, this.f31907h, false);
        C4243c.m28605b(parcel, a);
    }
}
