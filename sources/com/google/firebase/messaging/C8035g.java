package com.google.firebase.messaging;

import android.content.Intent;
import p218e6.C9977j;

/* renamed from: com.google.firebase.messaging.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C8035g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8039h f34673a;

    /* renamed from: b */
    public final /* synthetic */ Intent f34674b;

    /* renamed from: c */
    public final /* synthetic */ C9977j f34675c;

    public /* synthetic */ C8035g(C8039h hVar, Intent intent, C9977j jVar) {
        this.f34673a = hVar;
        this.f34674b = intent;
        this.f34675c = jVar;
    }

    public final void run() {
        this.f34673a.m44262i(this.f34674b, this.f34675c);
    }
}
