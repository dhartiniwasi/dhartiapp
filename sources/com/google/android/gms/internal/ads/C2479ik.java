package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.gms.internal.ads.ik */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class C2479ik {

    /* renamed from: a */
    private int f10822a;

    /* renamed from: a */
    public final void mo11134a(int i) {
        this.f10822a |= RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: b */
    public void mo11135b() {
        this.f10822a = 0;
    }

    /* renamed from: c */
    public final void mo11136c(int i) {
        this.f10822a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo11137d(int i) {
        return (this.f10822a & i) == i;
    }

    /* renamed from: e */
    public final boolean mo11138e() {
        return mo11137d(RecyclerView.UNDEFINED_DURATION);
    }

    /* renamed from: f */
    public final boolean mo11139f() {
        return mo11137d(4);
    }

    /* renamed from: g */
    public final boolean mo11140g() {
        return mo11137d(1);
    }
}
