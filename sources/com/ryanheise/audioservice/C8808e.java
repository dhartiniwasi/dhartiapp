package com.ryanheise.audioservice;

import android.util.Log;
import p186ac.C6556k;

/* renamed from: com.ryanheise.audioservice.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C8808e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6556k.C6561d f36357a;

    /* renamed from: b */
    public final /* synthetic */ Exception f36358b;

    public /* synthetic */ C8808e(C6556k.C6561d dVar, Exception exc) {
        this.f36357a = dVar;
        this.f36358b = exc;
    }

    public final void run() {
        this.f36357a.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(this.f36358b));
    }
}
