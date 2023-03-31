package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.firebase.messaging.a1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C8015a1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f34619a;

    /* renamed from: b */
    public final /* synthetic */ ScheduledExecutorService f34620b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseMessaging f34621c;

    /* renamed from: d */
    public final /* synthetic */ C8044i0 f34622d;

    /* renamed from: e */
    public final /* synthetic */ C8027d0 f34623e;

    public /* synthetic */ C8015a1(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C8044i0 i0Var, C8027d0 d0Var) {
        this.f34619a = context;
        this.f34620b = scheduledExecutorService;
        this.f34621c = firebaseMessaging;
        this.f34622d = i0Var;
        this.f34623e = d0Var;
    }

    public final Object call() {
        return C8019b1.m44173j(this.f34619a, this.f34620b, this.f34621c, this.f34622d, this.f34623e);
    }
}
