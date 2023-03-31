package com.ryanheise.audioservice;

import android.util.Log;
import p186ac.C6556k;

/* renamed from: com.ryanheise.audioservice.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C8807d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6556k.C6561d f36355a;

    /* renamed from: b */
    public final /* synthetic */ Exception f36356b;

    public /* synthetic */ C8807d(C6556k.C6561d dVar, Exception exc) {
        this.f36355a = dVar;
        this.f36356b = exc;
    }

    public final void run() {
        this.f36355a.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(this.f36356b));
    }
}
