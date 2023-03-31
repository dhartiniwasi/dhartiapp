package com.startapp.sdk.jobs;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.startapp.sdk.jobs.b */
/* compiled from: Sta */
public abstract class C9529b implements Runnable {
    public final C9530a callback;
    public final Context context;
    public final Bundle extras;

    /* renamed from: com.startapp.sdk.jobs.b$a */
    /* compiled from: Sta */
    public interface C9530a {
        /* renamed from: a */
        void mo31223a(C9529b bVar, boolean z);
    }

    public C9529b(Context context2, C9530a aVar, Bundle bundle) {
        this.context = context2;
        this.callback = aVar;
        this.extras = bundle;
    }

    public void run() {
        this.callback.mo31223a(this, runSync());
    }

    public boolean runSync() {
        return false;
    }
}
