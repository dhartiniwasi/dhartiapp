package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;
import p040e5.C4240a;
import p040e5.C4243c;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class vf0 extends C4240a {
    public static final Parcelable.Creator<vf0> CREATOR = new wf0();

    /* renamed from: a */
    public final View f19082a;

    /* renamed from: b */
    public final Map f19083b;

    public vf0(IBinder iBinder, IBinder iBinder2) {
        this.f19082a = (View) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder));
        this.f19083b = (Map) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder2));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28613j(parcel, 1, C4956b.m31385o3(this.f19082a).asBinder(), false);
        C4243c.m28613j(parcel, 2, C4956b.m31385o3(this.f19083b).asBinder(), false);
        C4243c.m28605b(parcel, a);
    }
}
