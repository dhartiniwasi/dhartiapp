package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import com.startapp.networkTest.results.BaseResult;
import com.startapp.networkTest.results.ConnectivityTestResult;
import com.startapp.networkTest.results.LatencyResult;
import com.startapp.networkTest.results.NetworkInformationResult;
import com.startapp.networkTest.startapp.ConnectivityTestListener;
import com.startapp.networkTest.startapp.CoverageMapperManager;
import java.util.Map;

/* renamed from: com.startapp.l7 */
/* compiled from: Sta */
public class C9114l7 implements ConnectivityTestListener, CoverageMapperManager.OnNetworkInfoResultListener {
    public C9114l7(Context context) {
    }

    /* renamed from: a */
    public final void mo29665a(C9043j4 j4Var, BaseResult baseResult) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Map<Activity, Integer> map = C9605vb.f39316a;
            String encodeToString = Base64.encodeToString(C9605vb.m50467a(String.valueOf(C9065k5.m48756b(baseResult))), 11);
            if (encodeToString != null) {
                C9023i4 i4Var = new C9023i4(j4Var);
                i4Var.f36956h = Long.valueOf(currentTimeMillis);
                i4Var.f36953e = encodeToString;
                i4Var.mo29471a();
                return;
            }
            C9023i4 i4Var2 = new C9023i4(C9043j4.f36994e);
            i4Var2.f36952d = "NTS, can not encode result";
            i4Var2.f36953e = baseResult.getClass().getName();
            i4Var2.mo29471a();
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    public void onConnectivityTestFinished(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void onConnectivityTestResult(ConnectivityTestResult connectivityTestResult) {
        if (connectivityTestResult != null) {
            mo29665a(C9043j4.f37005p, connectivityTestResult);
        }
    }

    public void onLatencyTestResult(LatencyResult latencyResult) {
        if (latencyResult != null) {
            mo29665a(C9043j4.f37006q, latencyResult);
        }
    }

    public void onNetworkInfoResult(NetworkInformationResult networkInformationResult) {
        if (networkInformationResult != null) {
            mo29665a(C9043j4.f37007r, networkInformationResult);
        }
    }
}
