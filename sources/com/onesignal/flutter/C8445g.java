package com.onesignal.flutter;

import com.onesignal.C8338d3;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: com.onesignal.flutter.g */
/* compiled from: OneSignalTagsController */
public class C8445g extends C8434a implements C6556k.C6560c {

    /* renamed from: d */
    private C6556k f35645d;

    /* renamed from: t */
    private void m46805t(C6555j jVar, C6556k.C6561d dVar) {
        try {
            C8338d3.m46439K((List) jVar.f31000b, new C8439b(this.f35623c, this.f35645d, dVar));
        } catch (ClassCastException e) {
            mo27799p(dVar, "OneSignal", "deleteTags failed with error: " + e.getMessage() + "\n" + e.getStackTrace(), (Object) null);
        }
    }

    /* renamed from: u */
    private void m46806u(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46444L0(new C8439b(this.f35623c, this.f35645d, dVar));
    }

    /* renamed from: v */
    static void m46807v(C6539c cVar) {
        C8445g gVar = new C8445g();
        gVar.f35623c = cVar;
        C6556k kVar = new C6556k(cVar, "OneSignal#tags");
        gVar.f35645d = kVar;
        kVar.mo22161e(gVar);
    }

    /* renamed from: w */
    private void m46808w(C6555j jVar, C6556k.C6561d dVar) {
        try {
            C8338d3.m46531j2(new JSONObject((Map) jVar.f31000b), new C8439b(this.f35623c, this.f35645d, dVar));
        } catch (ClassCastException e) {
            mo27799p(dVar, "OneSignal", "sendTags failed with error: " + e.getMessage() + "\n" + e.getStackTrace(), (Object) null);
        }
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        if (jVar.f30999a.contentEquals("OneSignal#getTags")) {
            m46806u(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#sendTags")) {
            m46808w(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#deleteTags")) {
            m46805t(jVar, dVar);
        } else {
            mo27800q(dVar);
        }
    }
}
