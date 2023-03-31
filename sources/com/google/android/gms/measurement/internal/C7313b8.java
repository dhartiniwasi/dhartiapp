package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C7083n1;
import p033d5.C4141r;
import p402y5.C13048z;

/* renamed from: com.google.android.gms.measurement.internal.b8 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7313b8 {

    /* renamed from: a */
    private final Context f32376a;

    public C7313b8(Context context) {
        C4141r.m28221k(context);
        this.f32376a = context;
    }

    /* renamed from: k */
    private final C7352f3 m41367k() {
        return C7397j4.m41654H(this.f32376a, (C7083n1) null, (Long) null).mo24135l();
    }

    /* renamed from: a */
    public final int mo24177a(Intent intent, int i, int i2) {
        C7397j4 H = C7397j4.m41654H(this.f32376a, (C7083n1) null, (Long) null);
        C7352f3 l = H.mo24135l();
        if (intent == null) {
            l.mo24261w().mo24208a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.mo24118b();
        l.mo24260v().mo24210c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            mo24184h(new C7572z7(this, i2, l, intent));
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder mo24178b(Intent intent) {
        if (intent == null) {
            m41367k().mo24256q().mo24208a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C7310b5(C7303a9.m41281f0(this.f32376a), (String) null);
        }
        m41367k().mo24261w().mo24209b("onBind received unknown action", action);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo24179c(int i, C7352f3 f3Var, Intent intent) {
        if (((C13048z) this.f32376a).mo24059d(i)) {
            f3Var.mo24260v().mo24209b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m41367k().mo24260v().mo24208a("Completed wakeful intent.");
            ((C13048z) this.f32376a).mo24057a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo24180d(C7352f3 f3Var, JobParameters jobParameters) {
        f3Var.mo24260v().mo24208a("AppMeasurementJobService processed last upload request.");
        ((C13048z) this.f32376a).mo24058b(jobParameters, false);
    }

    /* renamed from: e */
    public final void mo24181e() {
        C7397j4 H = C7397j4.m41654H(this.f32376a, (C7083n1) null, (Long) null);
        C7352f3 l = H.mo24135l();
        H.mo24118b();
        l.mo24260v().mo24208a("Local AppMeasurementService is starting up");
    }

    /* renamed from: f */
    public final void mo24182f() {
        C7397j4 H = C7397j4.m41654H(this.f32376a, (C7083n1) null, (Long) null);
        C7352f3 l = H.mo24135l();
        H.mo24118b();
        l.mo24260v().mo24208a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: g */
    public final void mo24183g(Intent intent) {
        if (intent == null) {
            m41367k().mo24256q().mo24208a("onRebind called with null intent");
            return;
        }
        m41367k().mo24260v().mo24209b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void mo24184h(Runnable runnable) {
        C7303a9 f0 = C7303a9.m41281f0(this.f32376a);
        f0.mo24143s().mo24309z(new C7302a8(this, f0, runnable));
    }

    /* renamed from: i */
    public final boolean mo24185i(JobParameters jobParameters) {
        C7397j4 H = C7397j4.m41654H(this.f32376a, (C7083n1) null, (Long) null);
        C7352f3 l = H.mo24135l();
        String string = jobParameters.getExtras().getString("action");
        H.mo24118b();
        l.mo24260v().mo24209b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        mo24184h(new C7562y7(this, l, jobParameters));
        return true;
    }

    /* renamed from: j */
    public final boolean mo24186j(Intent intent) {
        if (intent == null) {
            m41367k().mo24256q().mo24208a("onUnbind called with null intent");
            return true;
        }
        m41367k().mo24260v().mo24209b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
