package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040e5.C4240a;
import p040e5.C4243c;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3914y extends C4240a {
    public static final Parcelable.Creator<C3914y> CREATOR = new C3946z();

    /* renamed from: a */
    public final int f22942a;

    /* renamed from: b */
    private List f22943b;

    public C3914y() {
        this((List) null);
    }

    /* renamed from: I1 */
    public static C3914y m27410I1(C3914y yVar) {
        return new C3914y(yVar.f22943b);
    }

    /* renamed from: J1 */
    public final List mo17064J1() {
        return this.f22943b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f22942a);
        C4243c.m28622s(parcel, 2, this.f22943b, false);
        C4243c.m28605b(parcel, a);
    }

    C3914y(int i, List list) {
        this.f22942a = i;
        if (list == null || list.isEmpty()) {
            this.f22943b = Collections.emptyList();
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, C4703q.m30425a((String) list.get(i2)));
        }
        this.f22943b = Collections.unmodifiableList(list);
    }

    public C3914y(List list) {
        this.f22942a = 1;
        this.f22943b = new ArrayList();
        if (list != null && !list.isEmpty()) {
            this.f22943b.addAll(list);
        }
    }
}
