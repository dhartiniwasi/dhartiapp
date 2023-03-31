package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;
import p040e5.C4243c;

/* renamed from: com.google.firebase.messaging.p0 */
/* compiled from: RemoteMessageCreator */
public class C8064p0 implements Parcelable.Creator<C8059o0> {
    /* renamed from: c */
    static void m44414c(C8059o0 o0Var, Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28608e(parcel, 2, o0Var.f34716a, false);
        C4243c.m28605b(parcel, a);
    }

    /* renamed from: a */
    public C8059o0 createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            if (C4241b.m28589l(r) != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                bundle = C4241b.m28578a(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C8059o0(bundle);
    }

    /* renamed from: b */
    public C8059o0[] newArray(int i) {
        return new C8059o0[i];
    }
}
