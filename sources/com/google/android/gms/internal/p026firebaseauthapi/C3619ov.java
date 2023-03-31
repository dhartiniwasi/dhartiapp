package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ov */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3619ov extends C4240a {
    public static final Parcelable.Creator<C3619ov> CREATOR = new C3652pv();

    /* renamed from: a */
    private final List f22491a;

    public C3619ov() {
        this.f22491a = new ArrayList();
    }

    /* renamed from: I1 */
    public static C3619ov m26407I1(C3619ov ovVar) {
        C4141r.m28221k(ovVar);
        List list = ovVar.f22491a;
        C3619ov ovVar2 = new C3619ov();
        if (list != null && !list.isEmpty()) {
            ovVar2.f22491a.addAll(list);
        }
        return ovVar2;
    }

    /* renamed from: J1 */
    public final List mo16521J1() {
        return this.f22491a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28624u(parcel, 2, this.f22491a, false);
        C4243c.m28605b(parcel, a);
    }

    C3619ov(List list) {
        List list2;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f22491a = list2;
    }
}
