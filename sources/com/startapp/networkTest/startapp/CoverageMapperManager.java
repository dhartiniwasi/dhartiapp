package com.startapp.networkTest.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.telephony.CellLocation;
import android.telephony.ServiceState;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.startapp.C8880c7;
import com.startapp.C9115l8;
import com.startapp.C9632x2;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.enums.LocationProviders;
import com.startapp.networkTest.enums.TriggerEvents;
import com.startapp.networkTest.results.NetworkInformationResult;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class CoverageMapperManager implements LocationController.C9162c, C9115l8 {

    /* renamed from: A */
    private static final int f37914A = 1000;

    /* renamed from: B */
    private static final int f37915B = 2000;

    /* renamed from: s */
    private static final String f37916s = "CoverageMapperManager";

    /* renamed from: t */
    private static final long f37917t = 1;

    /* renamed from: u */
    private static final long f37918u = 10000;

    /* renamed from: v */
    private static final long f37919v = 10000;

    /* renamed from: w */
    private static final int f37920w = 500;

    /* renamed from: x */
    private static final int f37921x = 10000;

    /* renamed from: y */
    private static final int f37922y = 1000;

    /* renamed from: z */
    private static final int f37923z = 1000;

    /* renamed from: a */
    private Context f37924a;

    /* renamed from: b */
    private C8880c7 f37925b;

    /* renamed from: c */
    private boolean f37926c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f37927d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ScheduledFuture<?> f37928e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ScheduledFuture<?> f37929f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ScheduledFuture<?> f37930g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f37931h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f37932i;

    /* renamed from: j */
    private int f37933j = -1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f37934k;

    /* renamed from: l */
    private int f37935l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f37936m;

    /* renamed from: n */
    private OnNetworkInfoResultListener f37937n;

    /* renamed from: o */
    private Runnable f37938o = new C9168b();

    /* renamed from: p */
    private Runnable f37939p = new C9169c();

    /* renamed from: q */
    private Runnable f37940q = new C9170d();

    /* renamed from: r */
    private BroadcastReceiver f37941r = new C9171e();

    /* compiled from: Sta */
    public interface OnNetworkInfoResultListener {
        void onNetworkInfoResult(NetworkInformationResult networkInformationResult);
    }

    /* renamed from: com.startapp.networkTest.startapp.CoverageMapperManager$a */
    /* compiled from: Sta */
    public class C9167a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ LocationInfo f37942a;

        public C9167a(LocationInfo locationInfo) {
            this.f37942a = locationInfo;
        }

        public void run() {
            CoverageMapperManager.this.m49044a(this.f37942a, TriggerEvents.LocationUpdateGps, false);
        }
    }

    /* renamed from: com.startapp.networkTest.startapp.CoverageMapperManager$b */
    /* compiled from: Sta */
    public class C9168b implements Runnable {
        public C9168b() {
        }

        public void run() {
            CoverageMapperManager.this.m49044a((LocationInfo) null, TriggerEvents.OutOfService, true);
            if (CoverageMapperManager.this.f37931h + 10000 < SystemClock.elapsedRealtime()) {
                CoverageMapperManager.this.f37928e.cancel(false);
            }
        }
    }

    /* renamed from: com.startapp.networkTest.startapp.CoverageMapperManager$c */
    /* compiled from: Sta */
    public class C9169c implements Runnable {
        public C9169c() {
        }

        public void run() {
            CoverageMapperManager.this.m49044a((LocationInfo) null, TriggerEvents.CellIdChange, true);
            if (CoverageMapperManager.this.f37934k + 1 < SystemClock.elapsedRealtime()) {
                CoverageMapperManager.this.f37929f.cancel(false);
            }
        }
    }

    /* renamed from: com.startapp.networkTest.startapp.CoverageMapperManager$d */
    /* compiled from: Sta */
    public class C9170d implements Runnable {
        public C9170d() {
        }

        public void run() {
            if (SystemClock.elapsedRealtime() > CoverageMapperManager.this.f37927d + 2000) {
                CoverageMapperManager.this.m49044a((LocationInfo) null, TriggerEvents.Foreground, false);
            }
            if (CoverageMapperManager.this.f37936m + 10000 < SystemClock.elapsedRealtime()) {
                CoverageMapperManager.this.f37930g.cancel(false);
            }
        }
    }

    /* renamed from: com.startapp.networkTest.startapp.CoverageMapperManager$e */
    /* compiled from: Sta */
    public class C9171e extends BroadcastReceiver {
        public C9171e() {
        }

        public void onReceive(Context context, Intent intent) {
            long unused = CoverageMapperManager.this.f37932i = SystemClock.elapsedRealtime();
        }
    }

    public CoverageMapperManager(Context context) {
        this.f37925b = new C8880c7(context);
        this.f37924a = context;
    }

    /* renamed from: d */
    private void m49049d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f37932i + 10000 <= elapsedRealtime) {
            this.f37931h = elapsedRealtime;
            ScheduledFuture<?> scheduledFuture = this.f37928e;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f37928e = ThreadManager.m49065b().mo29770d().scheduleWithFixedDelay(this.f37938o, 0, 1000, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public void mo29754b() {
        if (!this.f37926c) {
            this.f37926c = true;
            this.f37925b.mo29255a((C9115l8) this);
            this.f37925b.mo29256a((LocationController.C9162c) this);
            this.f37925b.mo29260e();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
            intentFilter.addAction("android.intent.action.ACTION_SHUTDOWN");
            this.f37924a.registerReceiver(this.f37941r, intentFilter);
        }
    }

    /* renamed from: c */
    public void mo29755c() {
        this.f37936m = SystemClock.elapsedRealtime();
        ScheduledFuture<?> scheduledFuture = this.f37930g;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.f37930g = ThreadManager.m49065b().mo29770d().scheduleWithFixedDelay(this.f37940q, 0, 1000, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: e */
    public void mo29756e() {
        if (this.f37926c) {
            this.f37925b.mo29258b(this);
            this.f37925b.mo29259c();
            this.f37925b.mo29261f();
            try {
                this.f37924a.unregisterReceiver(this.f37941r);
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
            this.f37926c = false;
        }
    }

    /* renamed from: f */
    public void mo29757f() {
        ScheduledFuture<?> scheduledFuture = this.f37930g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: a */
    public void mo29753a(OnNetworkInfoResultListener onNetworkInfoResultListener) {
        this.f37937n = onNetworkInfoResultListener;
    }

    /* renamed from: a */
    public void mo29731a(LocationInfo locationInfo) {
        if (locationInfo.LocationProvider == LocationProviders.Gps) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f37927d + 500) {
                this.f37927d = elapsedRealtime;
                ThreadManager.m49065b().mo29768a().execute(new C9167a(locationInfo));
            }
        }
    }

    /* renamed from: a */
    public void mo29671a(ServiceState serviceState, int i) {
        if (this.f37925b.mo29257b().mo29549b().DefaultDataSimId == i) {
            int state = serviceState.getState();
            if (state == 1 && this.f37933j == 0) {
                m49049d();
            }
            this.f37933j = state;
        }
    }

    /* renamed from: a */
    public void mo29670a(CellLocation cellLocation, int i) {
        int i2;
        if (this.f37925b.mo29257b().mo29549b().DefaultDataSimId == i && cellLocation != null) {
            if (cellLocation.getClass().equals(GsmCellLocation.class)) {
                i2 = ((GsmCellLocation) cellLocation).getCid();
            } else {
                i2 = cellLocation.getClass().equals(CdmaCellLocation.class) ? ((CdmaCellLocation) cellLocation).getBaseStationId() : -1;
            }
            int i3 = this.f37935l;
            if (i2 != i3 && i3 != -1 && i2 > 0 && i2 != Integer.MAX_VALUE) {
                this.f37935l = i2;
                m49043a();
            } else if (i2 > 0 && i2 < Integer.MAX_VALUE) {
                this.f37935l = i2;
            }
        }
    }

    /* renamed from: a */
    private void m49043a() {
        this.f37934k = SystemClock.elapsedRealtime();
        ScheduledFuture<?> scheduledFuture = this.f37929f;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.f37929f = ThreadManager.m49065b().mo29770d().scheduleWithFixedDelay(this.f37939p, 0, 1000, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49044a(LocationInfo locationInfo, TriggerEvents triggerEvents, boolean z) {
        NetworkInformationResult networkInformationResult;
        if (locationInfo == null) {
            networkInformationResult = this.f37925b.mo29254a(triggerEvents, z);
        } else {
            networkInformationResult = this.f37925b.mo29253a(locationInfo, triggerEvents, z);
        }
        OnNetworkInfoResultListener onNetworkInfoResultListener = this.f37937n;
        if (onNetworkInfoResultListener != null) {
            onNetworkInfoResultListener.onNetworkInfoResult(networkInformationResult);
        }
    }
}
