package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.C9448a;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.k3 */
/* compiled from: Sta */
public class C9061k3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ComponentLocator f37034a;

    /* renamed from: b */
    public final /* synthetic */ C9448a f37035b;

    /* renamed from: com.startapp.k3$a */
    /* compiled from: Sta */
    public class C9062a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Boolean f37036a;

        public C9062a(Boolean bool) {
            this.f37036a = bool;
        }

        public void run() {
            C9061k3.this.f37035b.mo31151a(this.f37036a);
        }
    }

    public C9061k3(C9448a aVar, ComponentLocator componentLocator) {
        this.f37035b = aVar;
        this.f37034a = componentLocator;
    }

    public void run() {
        this.f37034a.mo31171g().execute(new C9062a(this.f37035b.mo31150a()));
    }
}
