package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class k64 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, km4, sb4, mi4, lf4, mv3, ir3, e84, v44 {

    /* renamed from: a */
    final /* synthetic */ o64 f11934a;

    /* synthetic */ k64(o64 o64, j64 j64) {
        this.f11934a = o64;
    }

    /* renamed from: A */
    public final void mo11583A(String str) {
        this.f11934a.f14967q.mo11927o(str);
    }

    /* renamed from: I */
    public final void mo11584I(s61 s61) {
        this.f11934a.f14947c0 = s61;
        lq1 x0 = this.f11934a.f14961k;
        x0.mo12062d(25, new i64(s61));
        x0.mo12061c();
    }

    /* renamed from: a */
    public final void mo11585a(boolean z) {
        o64 o64 = this.f11934a;
        if (o64.f14940X != z) {
            o64.f14940X = z;
            lq1 x0 = this.f11934a.f14961k;
            x0.mo12062d(23, new h64(z));
            x0.mo12061c();
        }
    }

    /* renamed from: b */
    public final void mo11586b(boolean z) {
        this.f11934a.m17550o0();
    }

    /* renamed from: c */
    public final void mo11587c(C2388g4 g4Var, oz3 oz3) {
        this.f11934a.f14927K = g4Var;
        this.f11934a.f14967q.mo11923k(g4Var, oz3);
    }

    /* renamed from: d */
    public final void mo11588d(int i, long j) {
        this.f11934a.f14967q.mo11919g(i, j);
    }

    /* renamed from: e */
    public final void mo11589e(long j, int i) {
        this.f11934a.f14967q.mo11930r(j, i);
    }

    /* renamed from: f */
    public final void mo11590f(Exception exc) {
        this.f11934a.f14967q.mo11933u(exc);
    }

    /* renamed from: g */
    public final void mo11591g(ny3 ny3) {
        this.f11934a.f14967q.mo11920h(ny3);
        this.f11934a.f14928L = null;
        this.f11934a.f14936T = null;
    }

    /* renamed from: h */
    public final void mo11592h(String str, long j, long j2) {
        this.f11934a.f14967q.mo11936x(str, j, j2);
    }

    /* renamed from: i */
    public final void mo11593i(ny3 ny3) {
        this.f11934a.f14936T = ny3;
        this.f11934a.f14967q.mo11928p(ny3);
    }

    /* renamed from: j */
    public final void mo11594j(Exception exc) {
        this.f11934a.f14967q.mo11932t(exc);
    }

    /* renamed from: k */
    public final void mo11595k(C2388g4 g4Var, oz3 oz3) {
        this.f11934a.f14928L = g4Var;
        this.f11934a.f14967q.mo11916C(g4Var, oz3);
    }

    /* renamed from: l */
    public final void mo11596l(ny3 ny3) {
        this.f11934a.f14967q.mo11925m(ny3);
        this.f11934a.f14927K = null;
        this.f11934a.f14935S = null;
    }

    /* renamed from: m */
    public final void mo11597m(int i, long j, long j2) {
        this.f11934a.f14967q.mo11934v(i, j, j2);
    }

    /* renamed from: n */
    public final void mo11598n(ny3 ny3) {
        this.f11934a.f14935S = ny3;
        this.f11934a.f14967q.mo11935w(ny3);
    }

    /* renamed from: o */
    public final void mo11599o(Exception exc) {
        this.f11934a.f14967q.mo11921i(exc);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        o64.m17559u(this.f11934a, surfaceTexture);
        this.f11934a.m17536h0(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f11934a.m17542k0((Object) null);
        this.f11934a.m17536h0(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f11934a.m17536h0(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: p */
    public final void mo11604p(String str, long j, long j2) {
        this.f11934a.f14967q.mo11922j(str, j, j2);
    }

    /* renamed from: q */
    public final void mo11605q(long j) {
        this.f11934a.f14967q.mo11914A(j);
    }

    /* renamed from: r */
    public final void mo11606r(Object obj, long j) {
        this.f11934a.f14967q.mo11915B(obj, j);
        o64 o64 = this.f11934a;
        if (o64.f14930N == obj) {
            lq1 x0 = o64.f14961k;
            x0.mo12062d(26, e64.f8689a);
            x0.mo12061c();
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f11934a.m17536h0(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f11934a.m17536h0(0, 0);
    }

    /* renamed from: z */
    public final void mo11610z(String str) {
        this.f11934a.f14967q.mo11918f(str);
    }
}
