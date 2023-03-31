package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.C7194u0;
import com.google.android.gms.internal.measurement.C7210v0;

/* renamed from: com.google.android.gms.measurement.internal.o8 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7456o8 extends C7478q8 {

    /* renamed from: d */
    private final AlarmManager f32841d = ((AlarmManager) this.f32389a.mo24121d().getSystemService("alarm"));

    /* renamed from: e */
    private C7447o f32842e;

    /* renamed from: f */
    private Integer f32843f;

    protected C7456o8(C7303a9 a9Var) {
        super(a9Var);
    }

    /* renamed from: n */
    private final int m41850n() {
        if (this.f32843f == null) {
            this.f32843f = Integer.valueOf("measurement".concat(String.valueOf(this.f32389a.mo24121d().getPackageName())).hashCode());
        }
        return this.f32843f.intValue();
    }

    /* renamed from: o */
    private final PendingIntent m41851o() {
        Context d = this.f32389a.mo24121d();
        return PendingIntent.getBroadcast(d, 0, new Intent().setClassName(d, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C7194u0.f32125a);
    }

    /* renamed from: p */
    private final C7447o m41852p() {
        if (this.f32842e == null) {
            this.f32842e = new C7445n8(this, this.f32873b.mo24120c0());
        }
        return this.f32842e;
    }

    /* renamed from: q */
    private final void m41853q() {
        JobScheduler jobScheduler = (JobScheduler) this.f32389a.mo24121d().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m41850n());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo24151j() {
        AlarmManager alarmManager = this.f32841d;
        if (alarmManager != null) {
            alarmManager.cancel(m41851o());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m41853q();
        return false;
    }

    /* renamed from: k */
    public final void mo24595k() {
        mo24623g();
        this.f32389a.mo24135l().mo24260v().mo24208a("Unscheduling upload");
        AlarmManager alarmManager = this.f32841d;
        if (alarmManager != null) {
            alarmManager.cancel(m41851o());
        }
        m41852p().mo24587b();
        if (Build.VERSION.SDK_INT >= 24) {
            m41853q();
        }
    }

    /* renamed from: m */
    public final void mo24596m(long j) {
        mo24623g();
        this.f32389a.mo24118b();
        Context d = this.f32389a.mo24121d();
        if (!C7391i9.m41593Y(d)) {
            this.f32389a.mo24135l().mo24255p().mo24208a("Receiver not registered/enabled");
        }
        if (!C7391i9.m41594Z(d, false)) {
            this.f32389a.mo24135l().mo24255p().mo24208a("Service not registered/enabled");
        }
        mo24595k();
        this.f32389a.mo24135l().mo24260v().mo24209b("Scheduling upload, millis", Long.valueOf(j));
        long b = this.f32389a.mo24116a().mo18371b() + j;
        this.f32389a.mo24443z();
        if (j < Math.max(0, ((Long) C7516u2.f33085y.mo24669a((Object) null)).longValue()) && !m41852p().mo24589e()) {
            m41852p().mo24588d(j);
        }
        this.f32389a.mo24118b();
        if (Build.VERSION.SDK_INT >= 24) {
            Context d2 = this.f32389a.mo24121d();
            ComponentName componentName = new ComponentName(d2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int n = m41850n();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            C7210v0.m41000a(d2, new JobInfo.Builder(n, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f32841d;
        if (alarmManager != null) {
            this.f32389a.mo24443z();
            alarmManager.setInexactRepeating(2, b, Math.max(((Long) C7516u2.f33076t.mo24669a((Object) null)).longValue(), j), m41851o());
        }
    }
}
