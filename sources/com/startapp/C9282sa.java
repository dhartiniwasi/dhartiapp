package com.startapp;

import com.startapp.C9558ta;

/* renamed from: com.startapp.sa */
/* compiled from: Sta */
public class C9282sa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9558ta f38198a;

    public C9282sa(C9558ta taVar) {
        this.f38198a = taVar;
    }

    public void run() {
        C9558ta taVar = this.f38198a;
        taVar.getClass();
        try {
            C9558ta.C9562c cVar = taVar.f39200f;
            if (cVar != null) {
                cVar.mo31293b();
                taVar.f39200f = null;
            }
        } catch (Throwable th) {
            if (taVar.mo31289a(4)) {
                C9023i4.m48681a(th);
            }
        }
    }
}
