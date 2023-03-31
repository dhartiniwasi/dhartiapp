package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.startapp.y0 */
/* compiled from: Sta */
public abstract class C9649y0 {

    /* renamed from: a */
    public final Context f39424a;

    /* renamed from: b */
    public final C9620w7 f39425b;

    /* renamed from: c */
    public final Handler f39426c;

    /* renamed from: d */
    public final Runnable f39427d = new C9650a();

    /* renamed from: com.startapp.y0$a */
    /* compiled from: Sta */
    public class C9650a implements Runnable {
        public C9650a() {
        }

        public void run() {
            C9649y0.this.mo29502a();
        }
    }

    /* renamed from: com.startapp.y0$b */
    /* compiled from: Sta */
    public class C9651b implements C9620w7 {

        /* renamed from: a */
        public boolean f39429a;

        /* renamed from: b */
        public final /* synthetic */ C9620w7 f39430b;

        public C9651b(C9620w7 w7Var) {
            this.f39430b = w7Var;
        }

        /* renamed from: a */
        public synchronized void mo29232a(Object obj) {
            if (!this.f39429a) {
                this.f39429a = true;
                C9649y0.this.f39426c.removeCallbacksAndMessages((Object) null);
                this.f39430b.mo29232a(obj);
            }
        }
    }

    public C9649y0(Context context, C9620w7 w7Var) {
        this.f39424a = context;
        this.f39425b = new C9651b(w7Var);
        this.f39426c = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public abstract void mo29502a();
}
