package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
import p088l5.C4954a;

/* renamed from: com.google.android.gms.internal.measurement.f1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public interface C6953f1 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(C7003i1 i1Var) throws RemoteException;

    void getAppInstanceId(C7003i1 i1Var) throws RemoteException;

    void getCachedAppInstanceId(C7003i1 i1Var) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, C7003i1 i1Var) throws RemoteException;

    void getCurrentScreenClass(C7003i1 i1Var) throws RemoteException;

    void getCurrentScreenName(C7003i1 i1Var) throws RemoteException;

    void getGmpAppId(C7003i1 i1Var) throws RemoteException;

    void getMaxUserProperties(String str, C7003i1 i1Var) throws RemoteException;

    void getSessionId(C7003i1 i1Var) throws RemoteException;

    void getTestFlag(C7003i1 i1Var, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, C7003i1 i1Var) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(C4954a aVar, C7083n1 n1Var, long j) throws RemoteException;

    void isDataCollectionEnabled(C7003i1 i1Var) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, C7003i1 i1Var, long j) throws RemoteException;

    void logHealthData(int i, String str, C4954a aVar, C4954a aVar2, C4954a aVar3) throws RemoteException;

    void onActivityCreated(C4954a aVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(C4954a aVar, long j) throws RemoteException;

    void onActivityPaused(C4954a aVar, long j) throws RemoteException;

    void onActivityResumed(C4954a aVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(C4954a aVar, C7003i1 i1Var, long j) throws RemoteException;

    void onActivityStarted(C4954a aVar, long j) throws RemoteException;

    void onActivityStopped(C4954a aVar, long j) throws RemoteException;

    void performAction(Bundle bundle, C7003i1 i1Var, long j) throws RemoteException;

    void registerOnMeasurementEventListener(C7035k1 k1Var) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(C4954a aVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(C7035k1 k1Var) throws RemoteException;

    void setInstanceIdProvider(C7067m1 m1Var) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, C4954a aVar, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(C7035k1 k1Var) throws RemoteException;
}
