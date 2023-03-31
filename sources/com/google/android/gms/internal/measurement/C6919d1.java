package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* renamed from: com.google.android.gms.internal.measurement.d1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C6919d1 extends C7098o0 implements C6953f1 {
    C6919d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString(str);
        p.writeLong(j);
        mo23706P0(23, p);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString(str);
        p.writeString(str2);
        C7130q0.m40616e(p, bundle);
        mo23706P0(9, p);
    }

    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel p = mo23708p();
        p.writeLong(j);
        mo23706P0(43, p);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString(str);
        p.writeLong(j);
        mo23706P0(24, p);
    }

    public final void generateEventId(C7003i1 i1Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, i1Var);
        mo23706P0(22, p);
    }

    public final void getAppInstanceId(C7003i1 i1Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, i1Var);
        mo23706P0(20, p);
    }

    public final void getCachedAppInstanceId(C7003i1 i1Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, i1Var);
        mo23706P0(19, p);
    }

    public final void getConditionalUserProperties(String str, String str2, C7003i1 i1Var) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString(str);
        p.writeString(str2);
        C7130q0.m40617f(p, i1Var);
        mo23706P0(10, p);
    }

    public final void getCurrentScreenClass(C7003i1 i1Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, i1Var);
        mo23706P0(17, p);
    }

    public final void getCurrentScreenName(C7003i1 i1Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, i1Var);
        mo23706P0(16, p);
    }

    public final void getGmpAppId(C7003i1 i1Var) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, i1Var);
        mo23706P0(21, p);
    }

    public final void getMaxUserProperties(String str, C7003i1 i1Var) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString(str);
        C7130q0.m40617f(p, i1Var);
        mo23706P0(6, p);
    }

    public final void getUserProperties(String str, String str2, boolean z, C7003i1 i1Var) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString(str);
        p.writeString(str2);
        C7130q0.m40615d(p, z);
        C7130q0.m40617f(p, i1Var);
        mo23706P0(5, p);
    }

    public final void initialize(C4954a aVar, C7083n1 n1Var, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, aVar);
        C7130q0.m40616e(p, n1Var);
        p.writeLong(j);
        mo23706P0(1, p);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString(str);
        p.writeString(str2);
        C7130q0.m40616e(p, bundle);
        C7130q0.m40615d(p, z);
        C7130q0.m40615d(p, z2);
        p.writeLong(j);
        mo23706P0(2, p);
    }

    public final void logHealthData(int i, String str, C4954a aVar, C4954a aVar2, C4954a aVar3) throws RemoteException {
        Parcel p = mo23708p();
        p.writeInt(5);
        p.writeString(str);
        C7130q0.m40617f(p, aVar);
        C7130q0.m40617f(p, aVar2);
        C7130q0.m40617f(p, aVar3);
        mo23706P0(33, p);
    }

    public final void onActivityCreated(C4954a aVar, Bundle bundle, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, aVar);
        C7130q0.m40616e(p, bundle);
        p.writeLong(j);
        mo23706P0(27, p);
    }

    public final void onActivityDestroyed(C4954a aVar, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, aVar);
        p.writeLong(j);
        mo23706P0(28, p);
    }

    public final void onActivityPaused(C4954a aVar, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, aVar);
        p.writeLong(j);
        mo23706P0(29, p);
    }

    public final void onActivityResumed(C4954a aVar, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, aVar);
        p.writeLong(j);
        mo23706P0(30, p);
    }

    public final void onActivitySaveInstanceState(C4954a aVar, C7003i1 i1Var, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, aVar);
        C7130q0.m40617f(p, i1Var);
        p.writeLong(j);
        mo23706P0(31, p);
    }

    public final void onActivityStarted(C4954a aVar, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, aVar);
        p.writeLong(j);
        mo23706P0(25, p);
    }

    public final void onActivityStopped(C4954a aVar, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, aVar);
        p.writeLong(j);
        mo23706P0(26, p);
    }

    public final void performAction(Bundle bundle, C7003i1 i1Var, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, bundle);
        C7130q0.m40617f(p, i1Var);
        p.writeLong(j);
        mo23706P0(32, p);
    }

    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel p = mo23708p();
        p.writeLong(j);
        mo23706P0(12, p);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, bundle);
        p.writeLong(j);
        mo23706P0(8, p);
    }

    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, bundle);
        p.writeLong(j);
        mo23706P0(44, p);
    }

    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, bundle);
        p.writeLong(j);
        mo23706P0(45, p);
    }

    public final void setCurrentScreen(C4954a aVar, String str, String str2, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40617f(p, aVar);
        p.writeString(str);
        p.writeString(str2);
        p.writeLong(j);
        mo23706P0(15, p);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40615d(p, z);
        mo23706P0(39, p);
    }

    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, bundle);
        mo23706P0(42, p);
    }

    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40615d(p, z);
        p.writeLong(j);
        mo23706P0(11, p);
    }

    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel p = mo23708p();
        p.writeLong(j);
        mo23706P0(14, p);
    }

    public final void setUserId(String str, long j) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString(str);
        p.writeLong(j);
        mo23706P0(7, p);
    }

    public final void setUserProperty(String str, String str2, C4954a aVar, boolean z, long j) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString(str);
        p.writeString(str2);
        C7130q0.m40617f(p, aVar);
        C7130q0.m40615d(p, z);
        p.writeLong(j);
        mo23706P0(4, p);
    }
}
