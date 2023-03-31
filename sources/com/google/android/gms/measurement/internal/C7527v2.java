package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C7098o0;
import com.google.android.gms.internal.measurement.C7130q0;
import java.util.ArrayList;
import java.util.List;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.v2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7527v2 extends C7098o0 implements C13028f {
    C7527v2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: B3 */
    public final void mo24154B3(C7446n9 n9Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, n9Var);
        mo23706P0(4, p);
    }

    /* renamed from: C3 */
    public final List mo24155C3(String str, String str2, C7446n9 n9Var) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString(str);
        p.writeString(str2);
        C7130q0.m40616e(p, n9Var);
        Parcel B0 = mo23705B0(16, p);
        ArrayList<C7326d> createTypedArrayList = B0.createTypedArrayList(C7326d.CREATOR);
        B0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: C5 */
    public final void mo24156C5(C7326d dVar, C7446n9 n9Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, dVar);
        C7130q0.m40616e(p, n9Var);
        mo23706P0(12, p);
    }

    /* renamed from: F4 */
    public final void mo24157F4(C7446n9 n9Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, n9Var);
        mo23706P0(20, p);
    }

    /* renamed from: L1 */
    public final byte[] mo24159L1(C7524v vVar, String str) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, vVar);
        p.writeString(str);
        Parcel B0 = mo23705B0(9, p);
        byte[] createByteArray = B0.createByteArray();
        B0.recycle();
        return createByteArray;
    }

    /* renamed from: M4 */
    public final List mo24160M4(String str, String str2, boolean z, C7446n9 n9Var) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString(str);
        p.writeString(str2);
        C7130q0.m40615d(p, z);
        C7130q0.m40616e(p, n9Var);
        Parcel B0 = mo23705B0(14, p);
        ArrayList<C7336d9> createTypedArrayList = B0.createTypedArrayList(C7336d9.CREATOR);
        B0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: T3 */
    public final void mo24162T3(long j, String str, String str2, String str3) throws RemoteException {
        Parcel p = mo23708p();
        p.writeLong(j);
        p.writeString(str);
        p.writeString(str2);
        p.writeString(str3);
        mo23706P0(10, p);
    }

    /* renamed from: W1 */
    public final String mo24164W1(C7446n9 n9Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, n9Var);
        Parcel B0 = mo23705B0(11, p);
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: e4 */
    public final void mo24166e4(C7336d9 d9Var, C7446n9 n9Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, d9Var);
        C7130q0.m40616e(p, n9Var);
        mo23706P0(2, p);
    }

    /* renamed from: g1 */
    public final void mo24167g1(C7446n9 n9Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, n9Var);
        mo23706P0(6, p);
    }

    /* renamed from: j5 */
    public final void mo24169j5(C7446n9 n9Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, n9Var);
        mo23706P0(18, p);
    }

    /* renamed from: m2 */
    public final List mo24170m2(String str, String str2, String str3) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString((String) null);
        p.writeString(str2);
        p.writeString(str3);
        Parcel B0 = mo23705B0(17, p);
        ArrayList<C7326d> createTypedArrayList = B0.createTypedArrayList(C7326d.CREATOR);
        B0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: q3 */
    public final void mo24171q3(C7524v vVar, C7446n9 n9Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, vVar);
        C7130q0.m40616e(p, n9Var);
        mo23706P0(1, p);
    }

    /* renamed from: s1 */
    public final void mo24173s1(Bundle bundle, C7446n9 n9Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, bundle);
        C7130q0.m40616e(p, n9Var);
        mo23706P0(19, p);
    }

    /* renamed from: x1 */
    public final List mo24174x1(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString((String) null);
        p.writeString(str2);
        p.writeString(str3);
        C7130q0.m40615d(p, z);
        Parcel B0 = mo23705B0(15, p);
        ArrayList<C7336d9> createTypedArrayList = B0.createTypedArrayList(C7336d9.CREATOR);
        B0.recycle();
        return createTypedArrayList;
    }
}
