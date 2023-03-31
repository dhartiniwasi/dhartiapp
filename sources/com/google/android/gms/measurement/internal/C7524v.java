package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p033d5.C4141r;
import p040e5.C4240a;

/* renamed from: com.google.android.gms.measurement.internal.v */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7524v extends C4240a {
    public static final Parcelable.Creator<C7524v> CREATOR = new C7534w();

    /* renamed from: a */
    public final String f33101a;

    /* renamed from: b */
    public final C7502t f33102b;

    /* renamed from: c */
    public final String f33103c;

    /* renamed from: d */
    public final long f33104d;

    C7524v(C7524v vVar, long j) {
        C4141r.m28221k(vVar);
        this.f33101a = vVar.f33101a;
        this.f33102b = vVar.f33102b;
        this.f33103c = vVar.f33103c;
        this.f33104d = j;
    }

    public final String toString() {
        String str = this.f33103c;
        String str2 = this.f33101a;
        String valueOf = String.valueOf(this.f33102b);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7534w.m42012a(this, parcel, i);
    }

    public C7524v(String str, C7502t tVar, String str2, long j) {
        this.f33101a = str;
        this.f33102b = tVar;
        this.f33103c = str2;
        this.f33104d = j;
    }
}
