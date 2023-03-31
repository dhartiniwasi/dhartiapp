package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.j3 */
/* compiled from: Sta */
public class C9041j3 extends C9649y0 {

    /* renamed from: e */
    public final C9441e f36989e;

    /* renamed from: com.startapp.j3$a */
    /* compiled from: Sta */
    public class C9042a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9182o1 f36990a;

        public C9042a(C9182o1 o1Var) {
            this.f36990a = o1Var;
        }

        public void run() {
            this.f36990a.mo29780c();
            C9041j3.this.f39425b.mo29232a(this.f36990a.mo29779b());
        }
    }

    public C9041j3(Context context, C9441e eVar, C9620w7 w7Var) {
        super(context, w7Var);
        this.f36989e = eVar;
    }

    /* renamed from: a */
    public void mo29502a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis((long) MetaData.f38952k.mo31026h().mo30963c());
            C9182o1 o1Var = new C9182o1(this.f39424a, this.f39425b);
            this.f39426c.postDelayed(new C9042a(o1Var), millis);
            o1Var.mo29778a(mo29503b());
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            this.f39425b.mo29232a((Object) null);
        }
    }

    /* renamed from: b */
    public final boolean mo29503b() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = currentTimeMillis - this.f36989e.getLong("lastBtDiscoveringTime", 0) >= ((long) MetaData.f38952k.mo31026h().mo30961a()) * 60000;
        if (z) {
            C9441e.C9442a a = this.f36989e.edit();
            a.mo30812a("lastBtDiscoveringTime", Long.valueOf(currentTimeMillis));
            a.f38873a.putLong("lastBtDiscoveringTime", currentTimeMillis);
            a.apply();
        }
        return z;
    }
}
