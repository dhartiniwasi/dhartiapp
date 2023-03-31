package p013b1;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.p010os.C0759a;
import androidx.work.impl.background.systemjob.SystemJobService;
import p050g1.C4329p;
import p170y0.C6082a;
import p170y0.C6083b;
import p170y0.C6085c;
import p170y0.C6094j;
import p170y0.C6096k;

/* renamed from: b1.a */
/* compiled from: SystemJobInfoConverter */
class C1606a {

    /* renamed from: b */
    private static final String f4604b = C6094j.m35719f("SystemJobInfoConverter");

    /* renamed from: a */
    private final ComponentName f4605a;

    /* renamed from: b1.a$a */
    /* compiled from: SystemJobInfoConverter */
    static /* synthetic */ class C1607a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4606a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                y0.k[] r0 = p170y0.C6096k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4606a = r0
                y0.k r1 = p170y0.C6096k.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4606a     // Catch:{ NoSuchFieldError -> 0x001d }
                y0.k r1 = p170y0.C6096k.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4606a     // Catch:{ NoSuchFieldError -> 0x0028 }
                y0.k r1 = p170y0.C6096k.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4606a     // Catch:{ NoSuchFieldError -> 0x0033 }
                y0.k r1 = p170y0.C6096k.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4606a     // Catch:{ NoSuchFieldError -> 0x003e }
                y0.k r1 = p170y0.C6096k.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p013b1.C1606a.C1607a.<clinit>():void");
        }
    }

    C1606a(Context context) {
        this.f4605a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* renamed from: b */
    private static JobInfo.TriggerContentUri m7387b(C6085c.C6086a aVar) {
        return new JobInfo.TriggerContentUri(aVar.mo20908a(), aVar.mo20909b() ? 1 : 0);
    }

    /* renamed from: c */
    static int m7388c(C6096k kVar) {
        int i = C1607a.f4606a[kVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        C6094j.m35717c().mo20921a(f4604b, String.format("API version too low. Cannot convert network type value %s", new Object[]{kVar}), new Throwable[0]);
        return 1;
    }

    /* renamed from: d */
    static void m7389d(JobInfo.Builder builder, C6096k kVar) {
        if (Build.VERSION.SDK_INT < 30 || kVar != C6096k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m7388c(kVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JobInfo mo6445a(C4329p pVar, int i) {
        C6083b bVar = pVar.f24224j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f24215a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.mo17746d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f4605a).setRequiresCharging(bVar.mo20888g()).setRequiresDeviceIdle(bVar.mo20889h()).setExtras(persistableBundle);
        m7389d(extras, bVar.mo20882b());
        boolean z = false;
        if (!bVar.mo20889h()) {
            extras.setBackoffCriteria(pVar.f24227m, pVar.f24226l == C6082a.f29452b ? 0 : 1);
        }
        long max = Math.max(pVar.mo17743a() - System.currentTimeMillis(), 0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f24231q) {
            extras.setImportantWhileForeground(true);
        }
        if (i2 >= 24 && bVar.mo20885e()) {
            for (C6085c.C6086a b : bVar.mo20881a().mo20904b()) {
                extras.addTriggerContentUri(m7387b(b));
            }
            extras.setTriggerContentUpdateDelay(bVar.mo20883c());
            extras.setTriggerContentMaxDelay(bVar.mo20884d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.mo20887f());
            extras.setRequiresStorageNotLow(bVar.mo20891i());
        }
        boolean z2 = pVar.f24225k > 0;
        if (max > 0) {
            z = true;
        }
        if (C0759a.m3506c() && pVar.f24231q && !z2 && !z) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
