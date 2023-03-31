package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class tn0 {

    /* renamed from: a */
    private final WeakReference f18170a;

    public tn0(View view) {
        this.f18170a = new WeakReference(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13857a(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo13858b(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ViewTreeObserver mo14328c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f18170a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* renamed from: d */
    public final void mo14329d() {
        ViewTreeObserver c = mo14328c();
        if (c != null) {
            mo13857a(c);
        }
    }

    /* renamed from: e */
    public final void mo14330e() {
        ViewTreeObserver c = mo14328c();
        if (c != null) {
            mo13858b(c);
        }
    }
}
