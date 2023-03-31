package com.onesignal.flutter;

import com.onesignal.C8324c2;
import com.onesignal.C8338d3;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p186ac.C6539c;
import p186ac.C6556k;

/* renamed from: com.onesignal.flutter.c */
/* compiled from: OneSignalOutcomeEventsController */
class C8440c extends C8434a implements C8338d3.C8353e1 {

    /* renamed from: d */
    private C6556k.C6561d f35640d;

    /* renamed from: e */
    private AtomicBoolean f35641e = new AtomicBoolean(false);

    C8440c(C6539c cVar, C6556k kVar, C6556k.C6561d dVar) {
        this.f35623c = cVar;
        this.f35622b = kVar;
        this.f35640d = dVar;
    }

    /* renamed from: e */
    public void mo27712e(C8324c2 c2Var) {
        if (!this.f35641e.getAndSet(true)) {
            if (c2Var == null) {
                mo27801r(this.f35640d, new HashMap());
            } else {
                mo27801r(this.f35640d, C8443f.m46800m(c2Var));
            }
        }
    }
}
