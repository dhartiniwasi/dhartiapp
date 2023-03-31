package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.measurement.internal.e9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7347e9 implements Parcelable.Creator {
    /* renamed from: a */
    static void m41466a(C7336d9 d9Var, Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, d9Var.f32438a);
        C4243c.m28620q(parcel, 2, d9Var.f32439b, false);
        C4243c.m28617n(parcel, 3, d9Var.f32440c);
        C4243c.m28618o(parcel, 4, d9Var.f32441d, false);
        C4243c.m28612i(parcel, 5, (Float) null, false);
        C4243c.m28620q(parcel, 6, d9Var.f32442e, false);
        C4243c.m28620q(parcel, 7, d9Var.f32443f, false);
        C4243c.m28610g(parcel, 8, d9Var.f32444g, false);
        C4243c.m28605b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    i = C4241b.m28597t(parcel2, r);
                    break;
                case 2:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 3:
                    j = C4241b.m28598u(parcel2, r);
                    break;
                case 4:
                    l = C4241b.m28599v(parcel2, r);
                    break;
                case 5:
                    f = C4241b.m28594q(parcel2, r);
                    break;
                case 6:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 7:
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 8:
                    d = C4241b.m28592o(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C7336d9(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7336d9[i];
    }
}
