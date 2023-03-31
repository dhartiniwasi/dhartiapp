package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zh3 {

    /* renamed from: a */
    private int f21086a;

    /* renamed from: a */
    public final void mo15593a(int i) {
        this.f21086a |= RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: b */
    public void mo10233b() {
        this.f21086a = 0;
    }

    /* renamed from: c */
    public final void mo15594c(int i) {
        this.f21086a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo15595d(int i) {
        return (this.f21086a & i) == i;
    }

    /* renamed from: e */
    public final boolean mo15596e() {
        return mo15595d(268435456);
    }

    /* renamed from: f */
    public final boolean mo15597f() {
        return mo15595d(RecyclerView.UNDEFINED_DURATION);
    }

    /* renamed from: g */
    public final boolean mo15598g() {
        return mo15595d(4);
    }

    /* renamed from: h */
    public final boolean mo15599h() {
        return mo15595d(1);
    }
}
