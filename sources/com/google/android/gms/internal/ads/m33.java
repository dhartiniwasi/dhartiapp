package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p033d5.C4087c;
import p053g4.C4392c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class m33 extends C4392c {

    /* renamed from: N */
    private final int f13203N;

    public m33(Context context, Looper looper, C4087c.C4088a aVar, C4087c.C4089b bVar, int i) {
        super(context, looper, 116, aVar, bVar, (String) null);
        this.f13203N = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo9818I() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo9819J() {
        return "com.google.android.gms.gass.START";
    }

    /* renamed from: m */
    public final int mo12268m() {
        return this.f13203N;
    }

    /* renamed from: n0 */
    public final r33 mo12269n0() throws DeadObjectException {
        return (r33) super.mo17324H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final /* synthetic */ IInterface mo9821w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof r33 ? (r33) queryLocalInterface : new r33(iBinder);
    }
}
