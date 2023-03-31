package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.p010os.C0759a;
import androidx.work.C1532a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p013b1.C1608b;
import p050g1.C4324n;
import p050g1.C4329p;
import p050g1.C4332q;
import p057h1.C4421f;
import p170y0.C6090g;
import p170y0.C6094j;
import p170y0.C6110s;
import p176z0.C6188f;
import p176z0.C6190h;
import p176z0.C6191i;

public class ForceStopRunnable implements Runnable {

    /* renamed from: d */
    private static final String f4526d = C6094j.m35719f("ForceStopRunnable");

    /* renamed from: e */
    private static final long f4527e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a */
    private final Context f4528a;

    /* renamed from: b */
    private final C6191i f4529b;

    /* renamed from: c */
    private int f4530c = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f4531a = C6094j.m35719f("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                C6094j.m35717c().mo20924g(f4531a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.m7266g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C6191i iVar) {
        this.f4528a = context.getApplicationContext();
        this.f4529b = iVar;
    }

    /* renamed from: c */
    static Intent m7264c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    private static PendingIntent m7265d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m7264c(context), i);
    }

    /* renamed from: g */
    static void m7266g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d = m7265d(context, C0759a.m3506c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f4527e;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, d);
        } else {
            alarmManager.set(0, currentTimeMillis, d);
        }
    }

    /* renamed from: a */
    public boolean mo6364a() {
        boolean i = Build.VERSION.SDK_INT >= 23 ? C1608b.m7396i(this.f4528a, this.f4529b) : false;
        WorkDatabase q = this.f4529b.mo21130q();
        C4332q B = q.mo6318B();
        C4324n A = q.mo6317A();
        q.mo5592c();
        try {
            List<C4329p> j = B.mo17762j();
            boolean z = j != null && !j.isEmpty();
            if (z) {
                for (C4329p next : j) {
                    B.mo17754b(C6110s.ENQUEUED, next.f24215a);
                    B.mo17755c(next.f24215a, -1);
                }
            }
            A.mo17741c();
            q.mo5606r();
            if (z || i) {
                return true;
            }
            return false;
        } finally {
            q.mo5596g();
        }
    }

    /* renamed from: b */
    public void mo6365b() {
        boolean a = mo6364a();
        if (mo6368h()) {
            C6094j.m35717c().mo20921a(f4526d, "Rescheduling Workers.", new Throwable[0]);
            this.f4529b.mo21133u();
            this.f4529b.mo21127n().mo17950c(false);
        } else if (mo6366e()) {
            C6094j.m35717c().mo20921a(f4526d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f4529b.mo21133u();
        } else if (a) {
            C6094j.m35717c().mo20921a(f4526d, "Found unfinished work, scheduling it.", new Throwable[0]);
            C6188f.m36001b(this.f4529b.mo21126k(), this.f4529b.mo21130q(), this.f4529b.mo21129p());
        }
    }

    /* renamed from: e */
    public boolean mo6366e() {
        int i = 536870912;
        try {
            if (C0759a.m3506c()) {
                i = 570425344;
            }
            PendingIntent d = m7265d(this.f4528a, i);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d != null) {
                    d.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f4528a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        if (((ApplicationExitInfo) historicalProcessExitReasons.get(i2)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d == null) {
                m7266g(this.f4528a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e) {
            C6094j.m35717c().mo20925h(f4526d, "Ignoring exception", e);
            return true;
        }
    }

    /* renamed from: f */
    public boolean mo6367f() {
        C1532a k = this.f4529b.mo21126k();
        if (TextUtils.isEmpty(k.mo6285c())) {
            C6094j.m35717c().mo20921a(f4526d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b = C4421f.m29376b(this.f4528a, k);
        C6094j.m35717c().mo20921a(f4526d, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(b)}), new Throwable[0]);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo6368h() {
        return this.f4529b.mo21127n().mo17949a();
    }

    /* renamed from: i */
    public void mo6369i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!mo6367f()) {
                this.f4529b.mo21132t();
                return;
            }
            while (true) {
                C6190h.m36019e(this.f4528a);
                C6094j.m35717c().mo20921a(f4526d, "Performing cleanup operations.", new Throwable[0]);
                mo6365b();
                break;
            }
            this.f4529b.mo21132t();
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
            int i = this.f4530c + 1;
            this.f4530c = i;
            if (i >= 3) {
                C6094j c = C6094j.m35717c();
                String str = f4526d;
                c.mo20922b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                C6090g d = this.f4529b.mo21126k().mo6286d();
                if (d != null) {
                    C6094j.m35717c().mo20921a(str, "Routing exception to the specified exception handler", illegalStateException);
                    d.mo20918a(illegalStateException);
                } else {
                    throw illegalStateException;
                }
            } else {
                C6094j.m35717c().mo20921a(f4526d, String.format("Retrying after %s", new Object[]{Long.valueOf(((long) i) * 300)}), e);
                mo6369i(((long) this.f4530c) * 300);
            }
        } catch (Throwable th) {
            this.f4529b.mo21132t();
            throw th;
        }
    }
}
