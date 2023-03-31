package com.startapp;

import com.startapp.C9558ta;

/* renamed from: com.startapp.ra */
/* compiled from: Sta */
public class C9264ra implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9558ta f38159a;

    public C9264ra(C9558ta taVar) {
        this.f38159a = taVar;
    }

    public void run() {
        C9558ta taVar = this.f38159a;
        taVar.getClass();
        try {
            if (taVar.mo31285a() != null) {
                if (taVar.f39200f == null) {
                    C9558ta.C9562c a = taVar.mo31286a((Class<?>) null);
                    taVar.f39200f = a;
                    if (a != null) {
                        a.mo31292a();
                    }
                }
            }
        } catch (Throwable th) {
            if (taVar.mo31289a(1)) {
                C9023i4.m48681a(th);
            }
        }
    }
}
