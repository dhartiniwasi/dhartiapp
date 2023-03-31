package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C7313b8;
import p035e0.C4171a;
import p402y5.C13048z;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class AppMeasurementService extends Service implements C13048z {

    /* renamed from: a */
    private C7313b8 f32297a;

    /* renamed from: c */
    private final C7313b8 m41219c() {
        if (this.f32297a == null) {
            this.f32297a = new C7313b8(this);
        }
        return this.f32297a;
    }

    /* renamed from: a */
    public final void mo24057a(Intent intent) {
        C4171a.m28287b(intent);
    }

    /* renamed from: b */
    public final void mo24058b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final boolean mo24059d(int i) {
        return stopSelfResult(i);
    }

    public IBinder onBind(Intent intent) {
        return m41219c().mo24178b(intent);
    }

    public void onCreate() {
        super.onCreate();
        m41219c().mo24181e();
    }

    public void onDestroy() {
        m41219c().mo24182f();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        m41219c().mo24183g(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        m41219c().mo24177a(intent, i, i2);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        m41219c().mo24186j(intent);
        return true;
    }
}
