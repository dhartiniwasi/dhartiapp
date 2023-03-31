package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p033d5.C4087c;
import p180z4.C6378j;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.b3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7308b3 extends C4087c {
    public C7308b3(Context context, Looper looper, C4087c.C4088a aVar, C4087c.C4089b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo9818I() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo9819J() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: m */
    public final int mo12268m() {
        return C6378j.f30617a;
    }

    /* renamed from: w */
    public final /* synthetic */ IInterface mo9821w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C13028f ? (C13028f) queryLocalInterface : new C7527v2(iBinder);
    }
}
