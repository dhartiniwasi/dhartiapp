package p402y5;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C7083n1;
import com.google.android.gms.measurement.internal.C7352f3;
import com.google.android.gms.measurement.internal.C7397j4;
import p033d5.C4141r;

/* renamed from: y5.k */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C13033k {

    /* renamed from: a */
    private final C13032j f47282a;

    public C13033k(C13032j jVar) {
        C4141r.m28221k(jVar);
        this.f47282a = jVar;
    }

    /* renamed from: a */
    public final void mo38079a(Context context, Intent intent) {
        C7397j4 H = C7397j4.m41654H(context, (C7083n1) null, (Long) null);
        C7352f3 l = H.mo24135l();
        if (intent == null) {
            l.mo24261w().mo24208a("Receiver called with null intent");
            return;
        }
        H.mo24118b();
        String action = intent.getAction();
        l.mo24260v().mo24209b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            l.mo24260v().mo24208a("Starting wakeful intent.");
            this.f47282a.mo24066a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            l.mo24261w().mo24208a("Install Referrer Broadcasts are deprecated");
        }
    }
}
