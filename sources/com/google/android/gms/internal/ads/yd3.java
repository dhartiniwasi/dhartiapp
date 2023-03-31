package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class yd3 extends re3 implements Runnable {

    /* renamed from: r */
    public static final /* synthetic */ int f20563r = 0;

    /* renamed from: h */
    lf3 f20564h;

    /* renamed from: i */
    Object f20565i;

    yd3(lf3 lf3, Object obj) {
        Objects.requireNonNull(lf3);
        this.f20564h = lf3;
        Objects.requireNonNull(obj);
        this.f20565i = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public abstract Object mo14896E(Object obj, Object obj2) throws Exception;

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public abstract void mo14897F(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo8329e() {
        String str;
        lf3 lf3 = this.f20564h;
        Object obj = this.f20565i;
        String e = super.mo8329e();
        if (lf3 != null) {
            str = "inputFuture=[" + lf3 + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        } else if (e != null) {
            return str.concat(e);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo8330f() {
        mo10138v(this.f20564h);
        this.f20564h = null;
        this.f20565i = null;
    }

    public final void run() {
        lf3 lf3 = this.f20564h;
        Object obj = this.f20565i;
        boolean z = true;
        boolean isCancelled = isCancelled() | (lf3 == null);
        if (obj != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.f20564h = null;
            if (lf3.isCancelled()) {
                mo10139w(lf3);
                return;
            }
            try {
                try {
                    Object E = mo14896E(obj, cf3.m10918p(lf3));
                    this.f20565i = null;
                    mo14897F(E);
                } catch (Throwable th) {
                    this.f20565i = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                mo9806h(e.getCause());
            } catch (RuntimeException e2) {
                mo9806h(e2);
            } catch (Error e3) {
                mo9806h(e3);
            }
        }
    }
}
