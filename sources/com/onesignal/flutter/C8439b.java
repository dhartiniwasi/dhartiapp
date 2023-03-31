package com.onesignal.flutter;

import com.onesignal.C8338d3;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p186ac.C6539c;
import p186ac.C6556k;

/* renamed from: com.onesignal.flutter.b */
/* compiled from: OneSignalTagsController */
class C8439b extends C8434a implements C8338d3.C8367j0, C8338d3.C8388t0 {

    /* renamed from: d */
    private C6556k.C6561d f35638d;

    /* renamed from: e */
    private AtomicBoolean f35639e = new AtomicBoolean(false);

    C8439b(C6539c cVar, C6556k kVar, C6556k.C6561d dVar) {
        this.f35623c = cVar;
        this.f35622b = kVar;
        this.f35638d = dVar;
    }

    /* renamed from: a */
    public void mo27728a(JSONObject jSONObject) {
        if (!this.f35639e.getAndSet(true)) {
            try {
                mo27801r(this.f35638d, C8443f.m46795h(jSONObject));
            } catch (JSONException e) {
                C6556k.C6561d dVar = this.f35638d;
                mo27799p(dVar, "OneSignal", "Encountered an error serializing tags into hashmap: " + e.getMessage() + "\n" + e.getStackTrace(), (Object) null);
            }
        }
    }

    /* renamed from: c */
    public void mo27748c(JSONObject jSONObject) {
        if (!this.f35639e.getAndSet(true)) {
            try {
                mo27801r(this.f35638d, C8443f.m46795h(jSONObject));
            } catch (JSONException e) {
                C6556k.C6561d dVar = this.f35638d;
                mo27799p(dVar, "OneSignal", "Encountered an error serializing tags into hashmap: " + e.getMessage() + "\n" + e.getStackTrace(), (Object) null);
            }
        }
    }

    /* renamed from: i */
    public void mo27729i(C8338d3.C8368j1 j1Var) {
        if (!this.f35639e.getAndSet(true)) {
            C6556k.C6561d dVar = this.f35638d;
            mo27799p(dVar, "OneSignal", "Encountered an error updating tags (" + j1Var.mo27730a() + "): " + j1Var.mo27731b(), (Object) null);
        }
    }
}
