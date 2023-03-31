package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class ja2 extends vb0 {

    /* renamed from: a */
    private final t91 f11288a;

    /* renamed from: b */
    private final oh1 f11289b;

    /* renamed from: c */
    private final oa1 f11290c;

    /* renamed from: d */
    private final eb1 f11291d;

    /* renamed from: e */
    private final jb1 f11292e;

    /* renamed from: f */
    private final te1 f11293f;

    /* renamed from: g */
    private final ec1 f11294g;

    /* renamed from: h */
    private final hi1 f11295h;

    /* renamed from: i */
    private final pe1 f11296i;

    /* renamed from: r */
    private final ja1 f11297r;

    public ja2(t91 t91, oh1 oh1, oa1 oa1, eb1 eb1, jb1 jb1, te1 te1, ec1 ec1, hi1 hi1, pe1 pe1, ja1 ja1) {
        this.f11288a = t91;
        this.f11289b = oh1;
        this.f11290c = oa1;
        this.f11291d = eb1;
        this.f11292e = jb1;
        this.f11293f = te1;
        this.f11294g = ec1;
        this.f11295h = hi1;
        this.f11296i = pe1;
        this.f11297r = ja1;
    }

    /* renamed from: A1 */
    public final void mo11352A1(int i, String str) {
    }

    @Deprecated
    /* renamed from: D0 */
    public final void mo11353D0(int i) throws RemoteException {
        mo11355R(new C4623z2(i, "", "undefined", (C4623z2) null, (IBinder) null));
    }

    /* renamed from: E */
    public final void mo11354E(String str) {
        mo11355R(new C4623z2(0, str, "undefined", (C4623z2) null, (IBinder) null));
    }

    /* renamed from: I3 */
    public void mo10766I3(fi0 fi0) throws RemoteException {
    }

    /* renamed from: R */
    public final void mo11355R(C4623z2 z2Var) {
        this.f11297r.mo8289g(eu2.m12270c(8, z2Var));
    }

    /* renamed from: T */
    public final void mo11356T() {
        this.f11294g.mo8935p(4);
    }

    /* renamed from: Y */
    public final void mo11357Y() {
        this.f11292e.mo10019a0();
    }

    /* renamed from: Z4 */
    public final void mo11358Z4(String str, String str2) {
        this.f11293f.mo8204R(str, str2);
    }

    /* renamed from: a */
    public final void mo11359a() {
        this.f11288a.onAdClicked();
        this.f11289b.mo9272h();
    }

    /* renamed from: a0 */
    public final void mo11360a0() {
        this.f11291d.mo9866d();
    }

    /* renamed from: b0 */
    public final void mo11361b0() {
        this.f11294g.mo8932d();
        this.f11296i.zza();
    }

    /* renamed from: c0 */
    public void mo8705c0() {
        this.f11290c.zza();
        this.f11296i.mo13257d();
    }

    /* renamed from: f0 */
    public final void mo11362f0(int i) {
    }

    /* renamed from: g0 */
    public void mo10767g0() {
        this.f11295h.zza();
    }

    /* renamed from: g2 */
    public void mo10768g2(bi0 bi0) {
    }

    /* renamed from: j */
    public void mo10769j() throws RemoteException {
    }

    /* renamed from: m0 */
    public void mo10770m0() {
        this.f11295h.mo10818b();
    }

    /* renamed from: q */
    public final void mo11363q() throws RemoteException {
        this.f11295h.mo10820e();
    }

    /* renamed from: t */
    public final void mo11364t() {
        this.f11295h.mo10819d();
    }

    /* renamed from: t2 */
    public final void mo11365t2(j30 j30, String str) {
    }

    /* renamed from: u3 */
    public final void mo11366u3(C4623z2 z2Var) {
    }
}
