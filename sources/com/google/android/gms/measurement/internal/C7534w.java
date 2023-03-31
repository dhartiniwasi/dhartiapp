package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.measurement.internal.w */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7534w implements Parcelable.Creator {
    /* renamed from: a */
    static void m42012a(C7524v vVar, Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, vVar.f33101a, false);
        C4243c.m28619p(parcel, 3, vVar.f33102b, i, false);
        C4243c.m28620q(parcel, 4, vVar.f33103c, false);
        C4243c.m28617n(parcel, 5, vVar.f33104d);
        C4243c.m28605b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        C7502t tVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 2) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 3) {
                tVar = (C7502t) C4241b.m28582e(parcel, r, C7502t.CREATOR);
            } else if (l == 4) {
                str2 = C4241b.m28583f(parcel, r);
            } else if (l != 5) {
                C4241b.m28601x(parcel, r);
            } else {
                j = C4241b.m28598u(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C7524v(str, tVar, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7524v[i];
    }
}
