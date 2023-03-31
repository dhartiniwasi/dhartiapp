package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p023c4.C1863e;
import p040e5.C4240a;
import p040e5.C4243c;
import p060h4.C4499e4;
import p108o4.C5220b;
import p179z3.C6357y;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class f20 extends C4240a {
    public static final Parcelable.Creator<f20> CREATOR = new g20();

    /* renamed from: a */
    public final int f9087a;

    /* renamed from: b */
    public final boolean f9088b;

    /* renamed from: c */
    public final int f9089c;

    /* renamed from: d */
    public final boolean f9090d;

    /* renamed from: e */
    public final int f9091e;

    /* renamed from: f */
    public final C4499e4 f9092f;

    /* renamed from: g */
    public final boolean f9093g;

    /* renamed from: h */
    public final int f9094h;

    public f20(int i, boolean z, int i2, boolean z2, int i3, C4499e4 e4Var, boolean z3, int i4) {
        this.f9087a = i;
        this.f9088b = z;
        this.f9089c = i2;
        this.f9090d = z2;
        this.f9091e = i3;
        this.f9092f = e4Var;
        this.f9093g = z3;
        this.f9094h = i4;
    }

    /* renamed from: I1 */
    public static C5220b m12400I1(f20 f20) {
        C5220b.C5221a aVar = new C5220b.C5221a();
        if (f20 == null) {
            return aVar.mo19209a();
        }
        int i = f20.f9087a;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    aVar.mo19212d(f20.f9093g);
                    aVar.mo19211c(f20.f9094h);
                }
                aVar.mo19214f(f20.f9088b);
                aVar.mo19213e(f20.f9090d);
                return aVar.mo19209a();
            }
            C4499e4 e4Var = f20.f9092f;
            if (e4Var != null) {
                aVar.mo19215g(new C6357y(e4Var));
            }
        }
        aVar.mo19210b(f20.f9091e);
        aVar.mo19214f(f20.f9088b);
        aVar.mo19213e(f20.f9090d);
        return aVar.mo19209a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f9087a);
        C4243c.m28606c(parcel, 2, this.f9088b);
        C4243c.m28614k(parcel, 3, this.f9089c);
        C4243c.m28606c(parcel, 4, this.f9090d);
        C4243c.m28614k(parcel, 5, this.f9091e);
        C4243c.m28619p(parcel, 6, this.f9092f, i, false);
        C4243c.m28606c(parcel, 7, this.f9093g);
        C4243c.m28614k(parcel, 8, this.f9094h);
        C4243c.m28605b(parcel, a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f20(C1863e eVar) {
        this(4, eVar.mo7095f(), eVar.mo7091b(), eVar.mo7094e(), eVar.mo7090a(), eVar.mo7093d() != null ? new C4499e4(eVar.mo7093d()) : null, eVar.mo7096g(), eVar.mo7092c());
    }
}
