package com.startapp;

import android.os.AsyncTask;
import android.os.Build;
import com.startapp.networkTest.data.IspInfo;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.net.WebApiClient;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.HashMap;

/* renamed from: com.startapp.g3 */
/* compiled from: Sta */
public class C8965g3 {

    /* renamed from: e */
    private static final String f36802e = "g3";

    /* renamed from: f */
    private static final String f36803f = "ispinfo";

    /* renamed from: g */
    private static final String f36804g = "anonymize";

    /* renamed from: h */
    private static C8965g3 f36805h;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f36806a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f36807b = false;

    /* renamed from: c */
    private HashMap<String, IspInfo> f36808c = new HashMap<>();

    /* renamed from: d */
    private IspInfo f36809d;

    /* renamed from: com.startapp.g3$a */
    /* compiled from: Sta */
    public class C8966a extends AsyncTask<WifiInfo, Void, IspInfo> {
        public C8966a() {
        }

        /* renamed from: a */
        public IspInfo doInBackground(WifiInfo... wifiInfoArr) {
            return C8965g3.this.mo29371a(wifiInfoArr[0]);
        }

        public void onPreExecute() {
            super.onPreExecute();
            boolean unused = C8965g3.this.f36806a = true;
        }

        /* renamed from: a */
        public void onPostExecute(IspInfo ispInfo) {
            super.onPostExecute(ispInfo);
            boolean unused = C8965g3.this.f36806a = false;
        }
    }

    /* renamed from: com.startapp.g3$b */
    /* compiled from: Sta */
    public class C8967b extends AsyncTask<Void, Void, IspInfo> {
        public C8967b() {
        }

        /* renamed from: a */
        public IspInfo doInBackground(Void... voidArr) {
            return C8965g3.this.mo29371a((WifiInfo) null);
        }

        public void onPreExecute() {
            super.onPreExecute();
            boolean unused = C8965g3.this.f36807b = true;
        }

        /* renamed from: a */
        public void onPostExecute(IspInfo ispInfo) {
            super.onPostExecute(ispInfo);
            boolean unused = C8965g3.this.f36807b = false;
        }
    }

    private C8965g3() {
    }

    /* renamed from: a */
    public static C8965g3 m48606a() {
        if (f36805h == null) {
            f36805h = new C8965g3();
        }
        return f36805h;
    }

    /* renamed from: b */
    public IspInfo mo29374b(WifiInfo wifiInfo, boolean z) {
        String str;
        C8998h5 h5Var;
        IspInfo ispInfo = new IspInfo();
        if (z) {
            try {
                str = C8821a5.m48254b().GEOIP_URL() + f36803f;
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        } else {
            str = C8821a5.m48254b().GEOIP_URL() + f36803f + "?" + f36804g + "=false";
        }
        C9053jd a = WebApiClient.m49036a(WebApiClient.RequestMethod.GET, str);
        if (a.f37025b.length() > 0 && (h5Var = (C8998h5) C9258r5.m49216a(a.f37025b, C8998h5.class)) != null) {
            ispInfo.AutonomousSystemNumber = C9135ma.m48968a(h5Var.AutonomousSystemNumber);
            ispInfo.AutonomousSystemOrganization = C9135ma.m48968a(h5Var.AutonomousSystemOrganization);
            ispInfo.IpAddress = C9135ma.m48968a(h5Var.IpAddress);
            ispInfo.IspName = C9135ma.m48968a(h5Var.IspName);
            ispInfo.IspOrganizationalName = C9135ma.m48968a(h5Var.IspOrganizationalName);
            ispInfo.SuccessfulIspLookup = true;
            if (wifiInfo != null) {
                synchronized (this.f36808c) {
                    this.f36808c.put(wifiInfo.WifiBSSID_Full, ispInfo);
                }
            } else {
                this.f36809d = ispInfo;
            }
        }
        return ispInfo;
    }

    /* renamed from: a */
    public IspInfo mo29372a(WifiInfo wifiInfo, boolean z) {
        IspInfo ispInfo;
        synchronized (this.f36808c) {
            ispInfo = this.f36808c.get(wifiInfo.WifiBSSID_Full);
        }
        if (ispInfo != null) {
            return ispInfo;
        }
        if (z && !this.f36806a) {
            if (Build.VERSION.SDK_INT < 11) {
                new C8966a().execute(new WifiInfo[]{wifiInfo});
            } else {
                new C8966a().executeOnExecutor(ThreadManager.m49065b().mo29768a(), new WifiInfo[]{wifiInfo});
            }
        }
        return new IspInfo();
    }

    /* renamed from: a */
    public IspInfo mo29373a(boolean z, boolean z2) {
        IspInfo ispInfo = this.f36809d;
        if ((z && !this.f36807b && ispInfo == null) || (z && !this.f36807b && z2)) {
            if (Build.VERSION.SDK_INT < 11) {
                new C8967b().execute(new Void[0]);
            } else {
                new C8967b().executeOnExecutor(ThreadManager.m49065b().mo29768a(), new Void[0]);
            }
        }
        return ispInfo == null ? new IspInfo() : ispInfo;
    }

    /* renamed from: a */
    public IspInfo mo29371a(WifiInfo wifiInfo) {
        return mo29374b(wifiInfo, true);
    }
}
