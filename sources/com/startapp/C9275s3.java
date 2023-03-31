package com.startapp;

import android.os.Handler;

/* renamed from: com.startapp.s3 */
/* compiled from: Sta */
public class C9275s3 implements C9256r3 {

    /* renamed from: a */
    public final Handler f38190a;

    public C9275s3(Handler handler) {
        this.f38190a = handler;
    }

    /* renamed from: a */
    public void mo29866a(Runnable runnable, long j) {
        this.f38190a.postDelayed(runnable, j);
    }

    public void execute(Runnable runnable) {
        this.f38190a.post(runnable);
    }

    /* renamed from: a */
    public void mo29865a(Runnable runnable) {
        this.f38190a.removeCallbacks(runnable);
    }
}
