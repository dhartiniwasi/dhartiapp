package com.onesignal.flutter;

import com.onesignal.C8338d3;
import java.util.Collection;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: com.onesignal.flutter.d */
/* compiled from: OneSignalInAppMessagingController */
public class C8441d extends C8434a implements C6556k.C6560c {

    /* renamed from: d */
    private C6556k f35642d;

    /* renamed from: t */
    private void m46779t(C6555j jVar, C6556k.C6561d dVar) {
        try {
            C8338d3.m46411D((Map) jVar.f31000b);
            mo27801r(dVar, (Object) null);
        } catch (ClassCastException e) {
            mo27799p(dVar, "OneSignal", "Add triggers failed with error: " + e.getMessage() + "\n" + e.getStackTrace(), (Object) null);
        }
    }

    /* renamed from: u */
    private void m46780u(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46405B1(((Boolean) jVar.f31000b).booleanValue());
        mo27801r(dVar, (Object) null);
    }

    /* renamed from: v */
    static void m46781v(C6539c cVar) {
        C8441d dVar = new C8441d();
        dVar.f35623c = cVar;
        C6556k kVar = new C6556k(cVar, "OneSignal#inAppMessages");
        dVar.f35642d = kVar;
        kVar.mo22161e(dVar);
    }

    /* renamed from: w */
    private void m46782w(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46476U1((String) jVar.f31000b);
        mo27801r(dVar, (Object) null);
    }

    /* renamed from: x */
    private void m46783x(C6555j jVar, C6556k.C6561d dVar) {
        try {
            C8338d3.m46479V1((Collection) jVar.f31000b);
            mo27801r(dVar, (Object) null);
        } catch (ClassCastException e) {
            mo27799p(dVar, "OneSignal", "Remove triggers for keys failed with error: " + e.getMessage() + "\n" + e.getStackTrace(), (Object) null);
        }
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        if (jVar.f30999a.contentEquals("OneSignal#addTrigger")) {
            m46779t(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#addTriggers")) {
            m46779t(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#removeTriggerForKey")) {
            m46782w(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#removeTriggersForKeys")) {
            m46783x(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#getTriggerValueForKey")) {
            mo27801r(dVar, C8338d3.m46460P0((String) jVar.f31000b));
        } else if (jVar.f30999a.contentEquals("OneSignal#pauseInAppMessages")) {
            m46780u(jVar, dVar);
        } else {
            mo27800q(dVar);
        }
    }
}
