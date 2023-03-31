package com.startapp;

import android.location.Location;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.enums.TimeSources;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.Date;

/* renamed from: com.startapp.va */
/* compiled from: Sta */
public class C9603va {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f39301j = "va";

    /* renamed from: k */
    private static final String f39302k = "0.de.pool.ntp.org";

    /* renamed from: l */
    private static final long f39303l = 28800000;

    /* renamed from: m */
    private static final int f39304m = 10000;

    /* renamed from: n */
    private static final int f39305n = 30000;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f39306a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f39307b = false;

    /* renamed from: c */
    private boolean f39308c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f39309d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f39310e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f39311f = -1;

    /* renamed from: g */
    private long f39312g = -1;

    /* renamed from: h */
    private long f39313h = -1;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C8892ca f39314i = new C8892ca();

    public C9603va() {
        if (C8821a5.m48254b().NTP_SYNC_ENABLED()) {
            m50438g();
        }
    }

    /* renamed from: d */
    public static long m50435d() {
        return C8821a5.m48258f().m50437f();
    }

    /* renamed from: e */
    public static TimeInfo m50436e() {
        return C8821a5.m48258f().m50434c();
    }

    /* renamed from: f */
    private long m50437f() {
        long j;
        long elapsedRealtime;
        long j2;
        if (this.f39308c && this.f39312g > this.f39310e) {
            if (SystemClock.elapsedRealtime() - this.f39310e > f39303l) {
                m50431b();
            }
            j = this.f39313h;
            elapsedRealtime = SystemClock.elapsedRealtime();
            j2 = this.f39312g;
        } else if (this.f39307b) {
            if (SystemClock.elapsedRealtime() - this.f39310e > f39303l) {
                m50431b();
            }
            j = this.f39311f;
            elapsedRealtime = SystemClock.elapsedRealtime();
            j2 = this.f39310e;
        } else {
            m50431b();
            return System.currentTimeMillis();
        }
        return (elapsedRealtime - j2) + j;
    }

    /* renamed from: g */
    private void m50438g() {
        if (Build.VERSION.SDK_INT < 11) {
            new C9604a().execute(new Void[0]);
        } else {
            new C9604a().executeOnExecutor(ThreadManager.m49065b().mo29768a(), new Void[0]);
        }
    }

    /* renamed from: c */
    private TimeInfo m50434c() {
        long j;
        TimeInfo timeInfo = new TimeInfo();
        boolean z = this.f39307b;
        timeInfo.IsSynced = z || this.f39308c;
        if (this.f39308c && this.f39312g > this.f39310e) {
            j = (SystemClock.elapsedRealtime() - this.f39312g) + this.f39313h;
            timeInfo.DeviceDriftMillis = System.currentTimeMillis() - j;
            timeInfo.MillisSinceLastSync = j - this.f39313h;
            timeInfo.TimeSource = TimeSources.GPS;
            if (SystemClock.elapsedRealtime() - this.f39310e > f39303l) {
                m50431b();
            }
        } else if (z) {
            if (SystemClock.elapsedRealtime() - this.f39310e > f39303l) {
                m50431b();
            }
            j = (SystemClock.elapsedRealtime() - this.f39310e) + this.f39311f;
            timeInfo.DeviceDriftMillis = System.currentTimeMillis() - j;
            timeInfo.MillisSinceLastSync = j - this.f39311f;
            timeInfo.TimeSource = TimeSources.NTP;
        } else {
            m50431b();
            j = System.currentTimeMillis();
            timeInfo.TimeSource = TimeSources.Device;
        }
        timeInfo.setMillis(j);
        return timeInfo;
    }

    /* renamed from: b */
    private void m50431b() {
        if (C8821a5.m48254b().NTP_SYNC_ENABLED() && !this.f39306a && SystemClock.elapsedRealtime() - this.f39309d > 30000) {
            m50438g();
        }
    }

    /* renamed from: a */
    public void mo31331a(Location location) {
        this.f39313h = location.getTime();
        this.f39312g = SystemClock.elapsedRealtime();
        this.f39308c = true;
    }

    /* renamed from: com.startapp.va$a */
    /* compiled from: Sta */
    public class C9604a extends AsyncTask<Void, Void, Void> {
        public C9604a() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                String unused = C9603va.f39301j;
                if (C9603va.this.f39314i.mo29282a(C9603va.f39302k, (int) C9603va.f39304m)) {
                    long a = C9603va.this.f39314i.mo29281a();
                    if (a <= 1458564533202L || a >= 3468524400000L) {
                        return null;
                    }
                    long unused2 = C9603va.this.f39310e = SystemClock.elapsedRealtime();
                    long unused3 = C9603va.this.f39311f = a;
                    String unused4 = C9603va.f39301j;
                    new Date(C9603va.this.f39311f).toString();
                    boolean unused5 = C9603va.this.f39307b = true;
                    return null;
                }
                String unused6 = C9603va.f39301j;
                long unused7 = C9603va.this.f39309d = SystemClock.elapsedRealtime();
                return null;
            } catch (Throwable th) {
                C9632x2.m50510a(th);
                return null;
            }
        }

        public void onPreExecute() {
            boolean unused = C9603va.this.f39306a = true;
        }

        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            boolean unused = C9603va.this.f39306a = false;
        }
    }
}
