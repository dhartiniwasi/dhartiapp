package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import p033d5.C4141r;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class po0 {

    /* renamed from: a */
    private final Context f15935a;

    /* renamed from: b */
    private final ap0 f15936b;

    /* renamed from: c */
    private final ViewGroup f15937c;

    /* renamed from: d */
    private oo0 f15938d;

    public po0(Context context, ViewGroup viewGroup, vs0 vs0) {
        this.f15935a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f15937c = viewGroup;
        this.f15936b = vs0;
        this.f15938d = null;
    }

    /* renamed from: a */
    public final oo0 mo13313a() {
        return this.f15938d;
    }

    /* renamed from: b */
    public final void mo13314b(int i, int i2, int i3, int i4) {
        C4141r.m28216f("The underlay may only be modified from the UI thread.");
        oo0 oo0 = this.f15938d;
        if (oo0 != null) {
            oo0.mo13001i(i, i2, i3, i4);
        }
    }

    /* renamed from: c */
    public final void mo13315c(int i, int i2, int i3, int i4, int i5, boolean z, zo0 zo0, Integer num) {
        if (this.f15938d == null) {
            C2939uz.m21908a(this.f15936b.mo8462Y().mo8152a(), this.f15936b.mo8463a0(), "vpr2");
            Context context = this.f15935a;
            ap0 ap0 = this.f15936b;
            oo0 oo0 = new oo0(context, ap0, i5, z, ap0.mo8462Y().mo8152a(), zo0, num);
            this.f15938d = oo0;
            this.f15937c.addView(oo0, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            this.f15938d.mo13001i(i, i2, i3, i4);
            this.f15936b.mo8475p(false);
        }
    }

    /* renamed from: d */
    public final void mo13316d() {
        C4141r.m28216f("onDestroy must be called from the UI thread.");
        oo0 oo0 = this.f15938d;
        if (oo0 != null) {
            oo0.mo13008t();
            this.f15937c.removeView(this.f15938d);
            this.f15938d = null;
        }
    }

    /* renamed from: e */
    public final void mo13317e() {
        C4141r.m28216f("onPause must be called from the UI thread.");
        oo0 oo0 = this.f15938d;
        if (oo0 != null) {
            oo0.mo13014z();
        }
    }

    /* renamed from: f */
    public final void mo13318f(int i) {
        oo0 oo0 = this.f15938d;
        if (oo0 != null) {
            oo0.mo12997f(i);
        }
    }
}
