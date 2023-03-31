package com.startapp.networkTest.startapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import com.startapp.C8815a3;
import com.startapp.C8821a5;
import com.startapp.C8900d2;
import com.startapp.C9006h9;
import com.startapp.C9258r5;
import com.startapp.C9632x2;
import com.startapp.C9639x7;
import com.startapp.networkTest.results.ConnectivityTestResult;
import com.startapp.networkTest.results.LatencyResult;
import com.startapp.networkTest.startapp.CoverageMapperManager;

/* compiled from: Sta */
public final class NetworkTester {
    private static final String CTLT_CHECK_INTERVAL_KEY = "StartappCtLtCheckIntervalKey";
    private static final String CTLT_GUARD_DIFF_KEY = "StartappGuardDiffKey";
    private static final String CTLT_PREV_TIME_CHECK_KEY = "StartappCtLtPrevTimeCheckKey";
    public static final String LOG_TAG = "NetworkTester";
    private static final String P3WRAPPER_PREFS = "StartappP3WrapperPrefs";
    public static NetworkTester sInstance;
    public Thread mActiveThread;
    public ConnectivityTestListener mConnectivityTestListener;
    private Context mContext;
    public CoverageMapperManager mCoverageMapper;
    public C8815a3 mForegroundTestManager;

    /* compiled from: Sta */
    public static final class Config {
        public String CONNECTIVITY_TEST_CDNCONFIG_URL = "https://d2to8y50b3n6dq.cloudfront.net/truststores/[PROJECTID]/cdnconfig.zip";
        public boolean CONNECTIVITY_TEST_ENABLED = true;
        public String CONNECTIVITY_TEST_FILENAME = "/favicon.ico";
        public String CONNECTIVITY_TEST_HOSTNAME = "d2to8y50b3n6dq.cloudfront.net";
        public boolean CT_COLLECT_CELLINFO = true;
        public boolean FOREGROUND_TEST_CT_ENABLED = true;
        public long FOREGROUND_TEST_CT_MIN_INTERVAL = 180000;
        public long FOREGROUND_TEST_CT_SCHEDULE_INTERVAL = 300000;
        public boolean FOREGROUND_TEST_NIR_ENABLED = true;
        public String GEOIP_URL = "https://geoip.api.c0nnectthed0ts.com/geoip/";
        public boolean NIR_COLLECT_CELLINFO = true;
        public int NIR_COLLECT_CELLINFO_THRESHOLD = 2;
        public String PROJECT_ID = "20050";
    }

    /* renamed from: com.startapp.networkTest.startapp.NetworkTester$a */
    /* compiled from: Sta */
    public class C9172a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f37948a;

        /* renamed from: b */
        public final /* synthetic */ C9175b f37949b;

        /* renamed from: com.startapp.networkTest.startapp.NetworkTester$a$a */
        /* compiled from: Sta */
        public class C9173a implements C9639x7 {

            /* renamed from: a */
            public final /* synthetic */ boolean[] f37950a;

            /* renamed from: b */
            public final /* synthetic */ Looper f37951b;

            /* renamed from: c */
            public final /* synthetic */ C8900d2 f37952c;

            /* renamed from: com.startapp.networkTest.startapp.NetworkTester$a$a$a */
            /* compiled from: Sta */
            public class C9174a implements Runnable {
                public C9174a() {
                }

                public void run() {
                    C9172a.this.f37949b.mo29069a(false);
                }
            }

            public C9173a(boolean[] zArr, Looper looper, C8900d2 d2Var) {
                this.f37950a = zArr;
                this.f37951b = looper;
                this.f37952c = d2Var;
            }

            /* renamed from: a */
            public void mo29764a() {
                this.f37952c.mo29290b();
                Looper looper = this.f37951b;
                if (looper != null) {
                    NetworkTester.sInstance.mActiveThread = null;
                    looper.quit();
                }
                ConnectivityTestListener connectivityTestListener = NetworkTester.sInstance.mConnectivityTestListener;
                if (connectivityTestListener != null) {
                    connectivityTestListener.onConnectivityTestFinished(new C9006h9(new C9174a()));
                } else {
                    C9172a.this.f37949b.mo29069a(false);
                }
            }

            public void onConnectivityTestResult(ConnectivityTestResult connectivityTestResult) {
                boolean[] zArr = this.f37950a;
                if (zArr[0]) {
                    Looper looper = this.f37951b;
                    if (looper != null) {
                        NetworkTester.sInstance.mActiveThread = null;
                        looper.quit();
                        C9172a.this.f37949b.mo29069a(false);
                        return;
                    }
                    return;
                }
                zArr[0] = true;
                ConnectivityTestListener connectivityTestListener = NetworkTester.sInstance.mConnectivityTestListener;
                if (connectivityTestListener != null) {
                    connectivityTestListener.onConnectivityTestResult(connectivityTestResult);
                }
            }

            public void onLatencyTestResult(LatencyResult latencyResult) {
                boolean[] zArr = this.f37950a;
                if (zArr[1]) {
                    Looper looper = this.f37951b;
                    if (looper != null) {
                        NetworkTester.sInstance.mActiveThread = null;
                        looper.quit();
                        C9172a.this.f37949b.mo29069a(false);
                        return;
                    }
                    return;
                }
                zArr[1] = true;
                ConnectivityTestListener connectivityTestListener = NetworkTester.sInstance.mConnectivityTestListener;
                if (connectivityTestListener != null) {
                    connectivityTestListener.onLatencyTestResult(latencyResult);
                }
            }
        }

        public C9172a(Context context, C9175b bVar) {
            this.f37948a = context;
            this.f37949b = bVar;
        }

        public void run() {
            Looper.prepare();
            Looper myLooper = Looper.myLooper();
            C8900d2 d2Var = new C8900d2(this.f37948a.getApplicationContext());
            d2Var.mo29288a();
            d2Var.mo29289a((C9639x7) new C9173a(new boolean[2], myLooper, d2Var));
            Looper.loop();
        }
    }

    /* renamed from: com.startapp.networkTest.startapp.NetworkTester$b */
    /* compiled from: Sta */
    public interface C9175b {
        /* renamed from: a */
        void mo29069a(boolean z);
    }

    private NetworkTester() {
    }

    public static void init(Context context, Config config) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        } else if (config != null) {
            String a = C9258r5.m49219a(config);
            if (a == null) {
                throw new IllegalArgumentException("Wrong format of config");
            } else if (sInstance == null) {
                NetworkTester networkTester = new NetworkTester();
                sInstance = networkTester;
                networkTester.mContext = context;
                C8821a5.m48252a(context, a.getBytes());
                sInstance.mCoverageMapper = new CoverageMapperManager(context);
                if (Build.VERSION.SDK_INT >= 14) {
                    sInstance.mForegroundTestManager = new C8815a3(context, sInstance.mCoverageMapper);
                }
            }
        } else {
            throw new IllegalArgumentException("config is null");
        }
    }

    public static int isAppInForeground() {
        C8815a3 a3Var;
        NetworkTester networkTester = sInstance;
        if (networkTester == null || (a3Var = networkTester.mForegroundTestManager) == null) {
            return -1;
        }
        return a3Var.mo29055d();
    }

    public static boolean isPermissionGranted(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (context.checkSelfPermission(str) == 0) {
                    return true;
                }
                return false;
            } else if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            } else {
                return false;
            }
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return false;
        }
    }

    public static void runTests(Context context, C9175b bVar) {
        CoverageMapperManager coverageMapperManager;
        CoverageMapperManager coverageMapperManager2;
        if (sInstance == null) {
            bVar.mo29069a(false);
        } else if (isPermissionGranted(context, "android.permission.ACCESS_FINE_LOCATION") || isPermissionGranted(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(P3WRAPPER_PREFS, 0);
            long j = sharedPreferences.getLong(CTLT_GUARD_DIFF_KEY, 120000);
            if (System.currentTimeMillis() - sharedPreferences.getLong(CTLT_PREV_TIME_CHECK_KEY, 0) < sharedPreferences.getLong(CTLT_CHECK_INTERVAL_KEY, j) - j) {
                bVar.mo29069a(false);
            } else if (!C8821a5.m48260h()) {
                bVar.mo29069a(false);
            } else if (sInstance.mActiveThread != null) {
                bVar.mo29069a(false);
            } else {
                sharedPreferences.edit().putLong(CTLT_PREV_TIME_CHECK_KEY, System.currentTimeMillis()).commit();
                NetworkTester networkTester = sInstance;
                if (!(networkTester == null || (coverageMapperManager = networkTester.mCoverageMapper) == null)) {
                    coverageMapperManager.mo29754b();
                }
                if (networkTester != null) {
                    networkTester.mActiveThread = new Thread(new C9006h9(new C9172a(context, bVar)));
                }
                sInstance.mActiveThread.start();
            }
        } else {
            NetworkTester networkTester2 = sInstance;
            if (!(networkTester2 == null || (coverageMapperManager2 = networkTester2.mCoverageMapper) == null)) {
                coverageMapperManager2.mo29756e();
            }
            bVar.mo29069a(false);
        }
    }

    public static void setOnConnectivityLatencyListener(ConnectivityTestListener connectivityTestListener) {
        NetworkTester networkTester = sInstance;
        if (networkTester != null) {
            networkTester.mConnectivityTestListener = connectivityTestListener;
        }
    }

    public static void setOnNetworkInfoListener(CoverageMapperManager.OnNetworkInfoResultListener onNetworkInfoResultListener) {
        CoverageMapperManager coverageMapperManager;
        NetworkTester networkTester = sInstance;
        if (networkTester != null && (coverageMapperManager = networkTester.mCoverageMapper) != null) {
            coverageMapperManager.mo29753a(onNetworkInfoResultListener);
        }
    }

    public static void startListening(long j, long j2) {
        NetworkTester networkTester = sInstance;
        if (networkTester != null) {
            SharedPreferences sharedPreferences = networkTester.mContext.getSharedPreferences(P3WRAPPER_PREFS, 0);
            sharedPreferences.edit().putLong(CTLT_CHECK_INTERVAL_KEY, j).commit();
            sharedPreferences.edit().putLong(CTLT_GUARD_DIFF_KEY, j2).commit();
            CoverageMapperManager coverageMapperManager = networkTester.mCoverageMapper;
            if (coverageMapperManager != null) {
                coverageMapperManager.mo29754b();
            }
            C8815a3 a3Var = networkTester.mForegroundTestManager;
            if (a3Var != null) {
                a3Var.mo29056e();
            }
        }
    }

    public static void stopListening() {
        C8815a3 a3Var;
        CoverageMapperManager coverageMapperManager;
        NetworkTester networkTester = sInstance;
        if (!(networkTester == null || (coverageMapperManager = networkTester.mCoverageMapper) == null)) {
            coverageMapperManager.mo29756e();
        }
        if (networkTester != null && Build.VERSION.SDK_INT >= 14 && (a3Var = networkTester.mForegroundTestManager) != null) {
            a3Var.mo29057h();
        }
    }
}
