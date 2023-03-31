package com.onesignal.flutter;

import com.onesignal.C8338d3;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: com.onesignal.flutter.e */
/* compiled from: OneSignalOutcomeEventsController */
public class C8442e extends C8434a implements C6556k.C6560c {

    /* renamed from: d */
    private C6556k f35643d;

    /* renamed from: t */
    static void m46784t(C6539c cVar) {
        C8442e eVar = new C8442e();
        eVar.f35623c = cVar;
        C6556k kVar = new C6556k(cVar, "OneSignal#outcomes");
        eVar.f35643d = kVar;
        kVar.mo22161e(eVar);
    }

    /* renamed from: u */
    private void m46785u(C6555j jVar, C6556k.C6561d dVar) {
        String str = (String) jVar.f31000b;
        if (str == null || str.isEmpty()) {
            mo27799p(dVar, "OneSignal", "sendOutcome() name must not be null or empty", (Object) null);
        } else {
            C8338d3.m46515f2(str, new C8440c(this.f35623c, this.f35643d, dVar));
        }
    }

    /* renamed from: v */
    private void m46786v(C6555j jVar, C6556k.C6561d dVar) {
        String str = (String) jVar.mo22156a("outcome_name");
        Double d = (Double) jVar.mo22156a("outcome_value");
        if (str == null || str.isEmpty()) {
            mo27799p(dVar, "OneSignal", "sendOutcomeWithValue() name must not be null or empty", (Object) null);
        } else if (d == null) {
            mo27799p(dVar, "OneSignal", "sendOutcomeWithValue() value must not be null", (Object) null);
        } else {
            C8338d3.m46519g2(str, d.floatValue(), new C8440c(this.f35623c, this.f35643d, dVar));
        }
    }

    /* renamed from: w */
    private void m46787w(C6555j jVar, C6556k.C6561d dVar) {
        String str = (String) jVar.f31000b;
        if (str == null || str.isEmpty()) {
            mo27799p(dVar, "OneSignal", "sendUniqueOutcome() name must not be null or empty", (Object) null);
        } else {
            C8338d3.m46535k2(str, new C8440c(this.f35623c, this.f35643d, dVar));
        }
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        if (jVar.f30999a.contentEquals("OneSignal#sendOutcome")) {
            m46785u(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#sendUniqueOutcome")) {
            m46787w(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#sendOutcomeWithValue")) {
            m46786v(jVar, dVar);
        } else {
            mo27800q(dVar);
        }
    }
}
