package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4521i2;
import p060h4.C4527j2;
import p060h4.C4541l4;
import p060h4.C4571q4;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class id0 extends C2847sh implements kd0 {
    id0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: A */
    public final void mo11083A(String str) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        mo14003P0(19, p);
    }

    /* renamed from: O3 */
    public final void mo11084O3(String str, String str2, C4541l4 l4Var, C4954a aVar, hd0 hd0, wb0 wb0) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        p.writeString(str2);
        C2958vh.m22236e(p, l4Var);
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, hd0);
        C2958vh.m22238g(p, wb0);
        mo14003P0(16, p);
    }

    /* renamed from: P */
    public final boolean mo11085P(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        Parcel B0 = mo14002B0(17, p);
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }

    /* renamed from: T */
    public final wd0 mo11086T() throws RemoteException {
        Parcel B0 = mo14002B0(2, mo14006p());
        wd0 wd0 = (wd0) C2958vh.m22232a(B0, wd0.CREATOR);
        B0.recycle();
        return wd0;
    }

    /* renamed from: Z1 */
    public final void mo11087Z1(String str, String str2, C4541l4 l4Var, C4954a aVar, dd0 dd0, wb0 wb0) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        p.writeString(str2);
        C2958vh.m22236e(p, l4Var);
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, dd0);
        C2958vh.m22238g(p, wb0);
        mo14003P0(18, p);
    }

    /* renamed from: a */
    public final C4527j2 mo11088a() throws RemoteException {
        Parcel B0 = mo14002B0(5, mo14006p());
        C4527j2 I6 = C4521i2.m29687I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* renamed from: c */
    public final wd0 mo11089c() throws RemoteException {
        Parcel B0 = mo14002B0(3, mo14006p());
        wd0 wd0 = (wd0) C2958vh.m22232a(B0, wd0.CREATOR);
        B0.recycle();
        return wd0;
    }

    /* renamed from: f1 */
    public final void mo11090f1(String str, String str2, C4541l4 l4Var, C4954a aVar, ad0 ad0, wb0 wb0) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        p.writeString(str2);
        C2958vh.m22236e(p, l4Var);
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, ad0);
        C2958vh.m22238g(p, wb0);
        mo14003P0(14, p);
    }

    /* renamed from: f6 */
    public final void mo11091f6(String str, String str2, C4541l4 l4Var, C4954a aVar, hd0 hd0, wb0 wb0) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        p.writeString(str2);
        C2958vh.m22236e(p, l4Var);
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, hd0);
        C2958vh.m22238g(p, wb0);
        mo14003P0(20, p);
    }

    /* renamed from: g5 */
    public final void mo11092g5(C4954a aVar, String str, Bundle bundle, Bundle bundle2, C4571q4 q4Var, nd0 nd0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        p.writeString(str);
        C2958vh.m22236e(p, bundle);
        C2958vh.m22236e(p, bundle2);
        C2958vh.m22236e(p, q4Var);
        C2958vh.m22238g(p, nd0);
        mo14003P0(1, p);
    }

    /* renamed from: h1 */
    public final void mo11093h1(String str, String str2, C4541l4 l4Var, C4954a aVar, xc0 xc0, wb0 wb0, C4571q4 q4Var) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        p.writeString(str2);
        C2958vh.m22236e(p, l4Var);
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, xc0);
        C2958vh.m22238g(p, wb0);
        C2958vh.m22236e(p, q4Var);
        mo14003P0(21, p);
    }

    /* renamed from: i3 */
    public final void mo11094i3(String str, String str2, C4541l4 l4Var, C4954a aVar, dd0 dd0, wb0 wb0, f20 f20) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        p.writeString(str2);
        C2958vh.m22236e(p, l4Var);
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, dd0);
        C2958vh.m22238g(p, wb0);
        C2958vh.m22236e(p, f20);
        mo14003P0(22, p);
    }

    /* renamed from: k1 */
    public final void mo11095k1(String str, String str2, C4541l4 l4Var, C4954a aVar, xc0 xc0, wb0 wb0, C4571q4 q4Var) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        p.writeString(str2);
        C2958vh.m22236e(p, l4Var);
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, xc0);
        C2958vh.m22238g(p, wb0);
        C2958vh.m22236e(p, q4Var);
        mo14003P0(13, p);
    }

    /* renamed from: r4 */
    public final boolean mo11096r4(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        Parcel B0 = mo14002B0(15, p);
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }
}
