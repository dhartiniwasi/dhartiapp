package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Map;
import p007a5.C0108d;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class gr0 implements C0108d {

    /* renamed from: a */
    protected final Context f10044a;

    /* renamed from: b */
    protected final String f10045b;

    /* renamed from: c */
    protected final WeakReference f10046c;

    public gr0(ap0 ap0) {
        Context context = ap0.getContext();
        this.f10044a = context;
        this.f10045b = C4409t.m29326r().mo18438z(context, ap0.mo8464b0().f19150a);
        this.f10046c = new WeakReference(ap0);
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m13478g(gr0 gr0, String str, Map map) {
        ap0 ap0 = (ap0) gr0.f10046c.get();
        if (ap0 != null) {
            ap0.mo9081R("onPrecacheEvent", map);
        }
    }

    /* renamed from: a */
    public void mo256a() {
    }

    /* renamed from: h */
    public abstract void mo10621h();

    /* renamed from: i */
    public final void mo10622i(String str, String str2, String str3, String str4) {
        im0.f10857b.post(new fr0(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo10623l(String str, String str2, int i) {
        im0.f10857b.post(new cr0(this, str, str2, i));
    }

    /* renamed from: m */
    public final void mo10624m(String str, String str2, long j) {
        im0.f10857b.post(new dr0(this, str, str2, j));
    }

    /* renamed from: n */
    public final void mo10625n(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        im0.f10857b.post(new br0(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    /* renamed from: o */
    public final void mo10626o(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        Handler handler = im0.f10857b;
        ar0 ar0 = r0;
        ar0 ar02 = new ar0(this, str, str2, j, j2, j3, j4, j5, z, i, i2);
        handler.post(ar0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo10627p(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo10628q(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo10629r(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo10630s(int i) {
    }

    /* renamed from: t */
    public abstract boolean mo10631t(String str);

    /* renamed from: u */
    public boolean mo10632u(String str, String[] strArr) {
        return mo10631t(str);
    }

    /* renamed from: v */
    public boolean mo10633v(String str, String[] strArr, xq0 xq0) {
        return mo10631t(str);
    }
}
