package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.measurement.internal.d */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7326d extends C4240a {
    public static final Parcelable.Creator<C7326d> CREATOR = new C7337e();

    /* renamed from: a */
    public String f32396a;

    /* renamed from: b */
    public String f32397b;

    /* renamed from: c */
    public C7336d9 f32398c;

    /* renamed from: d */
    public long f32399d;

    /* renamed from: e */
    public boolean f32400e;

    /* renamed from: f */
    public String f32401f;

    /* renamed from: g */
    public final C7524v f32402g;

    /* renamed from: h */
    public long f32403h;

    /* renamed from: i */
    public C7524v f32404i;

    /* renamed from: r */
    public final long f32405r;

    /* renamed from: s */
    public final C7524v f32406s;

    C7326d(C7326d dVar) {
        C4141r.m28221k(dVar);
        this.f32396a = dVar.f32396a;
        this.f32397b = dVar.f32397b;
        this.f32398c = dVar.f32398c;
        this.f32399d = dVar.f32399d;
        this.f32400e = dVar.f32400e;
        this.f32401f = dVar.f32401f;
        this.f32402g = dVar.f32402g;
        this.f32403h = dVar.f32403h;
        this.f32404i = dVar.f32404i;
        this.f32405r = dVar.f32405r;
        this.f32406s = dVar.f32406s;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f32396a, false);
        C4243c.m28620q(parcel, 3, this.f32397b, false);
        C4243c.m28619p(parcel, 4, this.f32398c, i, false);
        C4243c.m28617n(parcel, 5, this.f32399d);
        C4243c.m28606c(parcel, 6, this.f32400e);
        C4243c.m28620q(parcel, 7, this.f32401f, false);
        C4243c.m28619p(parcel, 8, this.f32402g, i, false);
        C4243c.m28617n(parcel, 9, this.f32403h);
        C4243c.m28619p(parcel, 10, this.f32404i, i, false);
        C4243c.m28617n(parcel, 11, this.f32405r);
        C4243c.m28619p(parcel, 12, this.f32406s, i, false);
        C4243c.m28605b(parcel, a);
    }

    C7326d(String str, String str2, C7336d9 d9Var, long j, boolean z, String str3, C7524v vVar, long j2, C7524v vVar2, long j3, C7524v vVar3) {
        this.f32396a = str;
        this.f32397b = str2;
        this.f32398c = d9Var;
        this.f32399d = j;
        this.f32400e = z;
        this.f32401f = str3;
        this.f32402g = vVar;
        this.f32403h = j2;
        this.f32404i = vVar2;
        this.f32405r = j3;
        this.f32406s = vVar3;
    }
}
