package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.jh */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class C2513jh implements Callable {

    /* renamed from: a */
    protected final String f11599a = getClass().getSimpleName();

    /* renamed from: b */
    protected final C2993wf f11600b;

    /* renamed from: c */
    protected final String f11601c;

    /* renamed from: d */
    protected final String f11602d;

    /* renamed from: e */
    protected final C3063yb f11603e;

    /* renamed from: f */
    protected Method f11604f;

    /* renamed from: g */
    protected final int f11605g;

    /* renamed from: h */
    protected final int f11606h;

    public C2513jh(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2) {
        this.f11600b = wfVar;
        this.f11601c = str;
        this.f11602d = str2;
        this.f11603e = ybVar;
        this.f11605g = i;
        this.f11606h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8332a() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: b */
    public Void mo11400b() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method j = this.f11600b.mo14909j(this.f11601c, this.f11602d);
            this.f11604f = j;
            if (j == null) {
                return null;
            }
            mo8332a();
            C2733pe d = this.f11600b.mo14904d();
            if (!(d == null || (i = this.f11605g) == Integer.MIN_VALUE)) {
                d.mo13256c(this.f11606h, i, (System.nanoTime() - nanoTime) / 1000, (String) null, (Exception) null);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        mo11400b();
        return null;
    }
}
