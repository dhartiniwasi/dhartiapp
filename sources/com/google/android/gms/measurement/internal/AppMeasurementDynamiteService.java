package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.C6936e1;
import com.google.android.gms.internal.measurement.C7003i1;
import com.google.android.gms.internal.measurement.C7035k1;
import com.google.android.gms.internal.measurement.C7067m1;
import com.google.android.gms.internal.measurement.C7083n1;
import java.util.Map;
import p033d5.C4141r;
import p088l5.C4954a;
import p088l5.C4956b;
import p124r.C5413a;
import p402y5.C13043u;
import p402y5.C13046x;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
public class AppMeasurementDynamiteService extends C6936e1 {

    /* renamed from: a */
    C7397j4 f32301a = null;

    /* renamed from: b */
    private final Map f32302b = new C5413a();

    /* renamed from: B0 */
    private final void m41249B0(C7003i1 i1Var, String str) {
        m41250d();
        this.f32301a.mo24423N().mo24373J(i1Var, str);
    }

    /* renamed from: d */
    private final void m41250d() {
        if (this.f32301a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        m41250d();
        this.f32301a.mo24442y().mo24089j(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        m41250d();
        this.f32301a.mo24418I().mo24350n(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) throws RemoteException {
        m41250d();
        this.f32301a.mo24418I().mo24331I((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j) throws RemoteException {
        m41250d();
        this.f32301a.mo24442y().mo24090k(str, j);
    }

    public void generateEventId(C7003i1 i1Var) throws RemoteException {
        m41250d();
        long r0 = this.f32301a.mo24423N().mo24400r0();
        m41250d();
        this.f32301a.mo24423N().mo24372I(i1Var, r0);
    }

    public void getAppInstanceId(C7003i1 i1Var) throws RemoteException {
        m41250d();
        this.f32301a.mo24143s().mo24309z(new C7410k6(this, i1Var));
    }

    public void getCachedAppInstanceId(C7003i1 i1Var) throws RemoteException {
        m41250d();
        m41249B0(i1Var, this.f32301a.mo24418I().mo24342V());
    }

    public void getConditionalUserProperties(String str, String str2, C7003i1 i1Var) throws RemoteException {
        m41250d();
        this.f32301a.mo24143s().mo24309z(new C7402j9(this, i1Var, str, str2));
    }

    public void getCurrentScreenClass(C7003i1 i1Var) throws RemoteException {
        m41250d();
        m41249B0(i1Var, this.f32301a.mo24418I().mo24343W());
    }

    public void getCurrentScreenName(C7003i1 i1Var) throws RemoteException {
        m41250d();
        m41249B0(i1Var, this.f32301a.mo24418I().mo24344X());
    }

    public void getGmpAppId(C7003i1 i1Var) throws RemoteException {
        String str;
        m41250d();
        C7388i6 I = this.f32301a.mo24418I();
        if (I.f32389a.mo24424O() != null) {
            str = I.f32389a.mo24424O();
        } else {
            try {
                str = C13046x.m61372b(I.f32389a.mo24121d(), "google_app_id", I.f32389a.mo24427R());
            } catch (IllegalStateException e) {
                I.f32389a.mo24135l().mo24256q().mo24209b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        m41249B0(i1Var, str);
    }

    public void getMaxUserProperties(String str, C7003i1 i1Var) throws RemoteException {
        m41250d();
        this.f32301a.mo24418I().mo24337Q(str);
        m41250d();
        this.f32301a.mo24423N().mo24371H(i1Var, 25);
    }

    public void getSessionId(C7003i1 i1Var) throws RemoteException {
        m41250d();
        C7388i6 I = this.f32301a.mo24418I();
        I.f32389a.mo24143s().mo24309z(new C7540w5(I, i1Var));
    }

    public void getTestFlag(C7003i1 i1Var, int i) throws RemoteException {
        m41250d();
        if (i == 0) {
            this.f32301a.mo24423N().mo24373J(i1Var, this.f32301a.mo24418I().mo24345Y());
        } else if (i == 1) {
            this.f32301a.mo24423N().mo24372I(i1Var, this.f32301a.mo24418I().mo24341U().longValue());
        } else if (i == 2) {
            C7391i9 N = this.f32301a.mo24423N();
            double doubleValue = this.f32301a.mo24418I().mo24339S().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                i1Var.mo23037L2(bundle);
            } catch (RemoteException e) {
                N.f32389a.mo24135l().mo24261w().mo24209b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f32301a.mo24423N().mo24371H(i1Var, this.f32301a.mo24418I().mo24340T().intValue());
        } else if (i == 4) {
            this.f32301a.mo24423N().mo24367D(i1Var, this.f32301a.mo24418I().mo24338R().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C7003i1 i1Var) throws RemoteException {
        m41250d();
        this.f32301a.mo24143s().mo24309z(new C7390i8(this, i1Var, str, str2, z));
    }

    public void initForTests(Map map) throws RemoteException {
        m41250d();
    }

    public void initialize(C4954a aVar, C7083n1 n1Var, long j) throws RemoteException {
        C7397j4 j4Var = this.f32301a;
        if (j4Var == null) {
            this.f32301a = C7397j4.m41654H((Context) C4141r.m28221k((Context) C4956b.m31384P0(aVar)), n1Var, Long.valueOf(j));
        } else {
            j4Var.mo24135l().mo24261w().mo24208a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C7003i1 i1Var) throws RemoteException {
        m41250d();
        this.f32301a.mo24143s().mo24309z(new C7413k9(this, i1Var));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        m41250d();
        this.f32301a.mo24418I().mo24354r(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C7003i1 i1Var, long j) throws RemoteException {
        Bundle bundle2;
        m41250d();
        C4141r.m28217g(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f32301a.mo24143s().mo24309z(new C7389i7(this, i1Var, new C7524v(str2, new C7502t(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, C4954a aVar, C4954a aVar2, C4954a aVar3) throws RemoteException {
        Object obj;
        Object obj2;
        m41250d();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = C4956b.m31384P0(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = C4956b.m31384P0(aVar2);
        }
        if (aVar3 != null) {
            obj3 = C4956b.m31384P0(aVar3);
        }
        this.f32301a.mo24135l().mo24254F(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(C4954a aVar, Bundle bundle, long j) throws RemoteException {
        m41250d();
        C7377h6 h6Var = this.f32301a.mo24418I().f32564c;
        if (h6Var != null) {
            this.f32301a.mo24418I().mo24351o();
            h6Var.onActivityCreated((Activity) C4956b.m31384P0(aVar), bundle);
        }
    }

    public void onActivityDestroyed(C4954a aVar, long j) throws RemoteException {
        m41250d();
        C7377h6 h6Var = this.f32301a.mo24418I().f32564c;
        if (h6Var != null) {
            this.f32301a.mo24418I().mo24351o();
            h6Var.onActivityDestroyed((Activity) C4956b.m31384P0(aVar));
        }
    }

    public void onActivityPaused(C4954a aVar, long j) throws RemoteException {
        m41250d();
        C7377h6 h6Var = this.f32301a.mo24418I().f32564c;
        if (h6Var != null) {
            this.f32301a.mo24418I().mo24351o();
            h6Var.onActivityPaused((Activity) C4956b.m31384P0(aVar));
        }
    }

    public void onActivityResumed(C4954a aVar, long j) throws RemoteException {
        m41250d();
        C7377h6 h6Var = this.f32301a.mo24418I().f32564c;
        if (h6Var != null) {
            this.f32301a.mo24418I().mo24351o();
            h6Var.onActivityResumed((Activity) C4956b.m31384P0(aVar));
        }
    }

    public void onActivitySaveInstanceState(C4954a aVar, C7003i1 i1Var, long j) throws RemoteException {
        m41250d();
        C7377h6 h6Var = this.f32301a.mo24418I().f32564c;
        Bundle bundle = new Bundle();
        if (h6Var != null) {
            this.f32301a.mo24418I().mo24351o();
            h6Var.onActivitySaveInstanceState((Activity) C4956b.m31384P0(aVar), bundle);
        }
        try {
            i1Var.mo23037L2(bundle);
        } catch (RemoteException e) {
            this.f32301a.mo24135l().mo24261w().mo24209b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(C4954a aVar, long j) throws RemoteException {
        m41250d();
        if (this.f32301a.mo24418I().f32564c != null) {
            this.f32301a.mo24418I().mo24351o();
            Activity activity = (Activity) C4956b.m31384P0(aVar);
        }
    }

    public void onActivityStopped(C4954a aVar, long j) throws RemoteException {
        m41250d();
        if (this.f32301a.mo24418I().f32564c != null) {
            this.f32301a.mo24418I().mo24351o();
            Activity activity = (Activity) C4956b.m31384P0(aVar);
        }
    }

    public void performAction(Bundle bundle, C7003i1 i1Var, long j) throws RemoteException {
        m41250d();
        i1Var.mo23037L2((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C7035k1 k1Var) throws RemoteException {
        C13043u uVar;
        m41250d();
        synchronized (this.f32302b) {
            uVar = (C13043u) this.f32302b.get(Integer.valueOf(k1Var.mo23543b()));
            if (uVar == null) {
                uVar = new C7435m9(this, k1Var);
                this.f32302b.put(Integer.valueOf(k1Var.mo23543b()), uVar);
            }
        }
        this.f32301a.mo24418I().mo24359x(uVar);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        m41250d();
        this.f32301a.mo24418I().mo24360y(j);
    }

    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        m41250d();
        if (bundle == null) {
            this.f32301a.mo24135l().mo24256q().mo24208a("Conditional user property must not be null");
        } else {
            this.f32301a.mo24418I().mo24327E(bundle, j);
        }
    }

    public void setConsent(Bundle bundle, long j) throws RemoteException {
        m41250d();
        C7388i6 I = this.f32301a.mo24418I();
        I.f32389a.mo24143s().mo24303A(new C7376h5(I, bundle, j));
    }

    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        m41250d();
        this.f32301a.mo24418I().mo24328F(bundle, -20, j);
    }

    public void setCurrentScreen(C4954a aVar, String str, String str2, long j) throws RemoteException {
        m41250d();
        this.f32301a.mo24420K().mo24697D((Activity) C4956b.m31384P0(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        m41250d();
        C7388i6 I = this.f32301a.mo24418I();
        I.mo24741g();
        I.f32389a.mo24143s().mo24309z(new C7355f6(I, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        m41250d();
        C7388i6 I = this.f32301a.mo24418I();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        I.f32389a.mo24143s().mo24309z(new C7387i5(I, bundle2));
    }

    public void setEventInterceptor(C7035k1 k1Var) throws RemoteException {
        m41250d();
        C7424l9 l9Var = new C7424l9(this, k1Var);
        if (this.f32301a.mo24143s().mo24304C()) {
            this.f32301a.mo24418I().mo24330H(l9Var);
        } else {
            this.f32301a.mo24143s().mo24309z(new C7369g9(this, l9Var));
        }
    }

    public void setInstanceIdProvider(C7067m1 m1Var) throws RemoteException {
        m41250d();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        m41250d();
        this.f32301a.mo24418I().mo24331I(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        m41250d();
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        m41250d();
        C7388i6 I = this.f32301a.mo24418I();
        I.f32389a.mo24143s().mo24309z(new C7442n5(I, j));
    }

    public void setUserId(String str, long j) throws RemoteException {
        m41250d();
        C7388i6 I = this.f32301a.mo24418I();
        if (str == null || !TextUtils.isEmpty(str)) {
            I.f32389a.mo24143s().mo24309z(new C7398j5(I, str));
            I.mo24334L((String) null, "_id", str, true, j);
            return;
        }
        I.f32389a.mo24135l().mo24261w().mo24208a("User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, C4954a aVar, boolean z, long j) throws RemoteException {
        m41250d();
        this.f32301a.mo24418I().mo24334L(str, str2, C4956b.m31384P0(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C7035k1 k1Var) throws RemoteException {
        C13043u uVar;
        m41250d();
        synchronized (this.f32302b) {
            uVar = (C13043u) this.f32302b.remove(Integer.valueOf(k1Var.mo23543b()));
        }
        if (uVar == null) {
            uVar = new C7435m9(this, k1Var);
        }
        this.f32301a.mo24418I().mo24336N(uVar);
    }
}
