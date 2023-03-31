package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zs0 implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ nj0 f21261a;

    /* renamed from: b */
    final /* synthetic */ ct0 f21262b;

    zs0(ct0 ct0, nj0 nj0) {
        this.f21262b = ct0;
        this.f21261a = nj0;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f21262b.m11095t(view, this.f21261a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
