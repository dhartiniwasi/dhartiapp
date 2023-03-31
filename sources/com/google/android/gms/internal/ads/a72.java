package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class a72 extends zh0 implements hb1 {

    /* renamed from: a */
    private ai0 f6455a;

    /* renamed from: b */
    private gb1 f6456b;

    /* renamed from: c */
    private bi1 f6457c;

    /* renamed from: B */
    public final synchronized void mo8241B(C4954a aVar) throws RemoteException {
        ai0 ai0 = this.f6455a;
        if (ai0 != null) {
            ((w92) ai0).f19533a.mo8932d();
        }
    }

    /* renamed from: D1 */
    public final synchronized void mo8242D1(C4954a aVar) throws RemoteException {
        ai0 ai0 = this.f6455a;
        if (ai0 != null) {
            ((w92) ai0).f19535c.mo9865a();
        }
    }

    /* renamed from: I0 */
    public final synchronized void mo8243I0(C4954a aVar) throws RemoteException {
        ai0 ai0 = this.f6455a;
        if (ai0 != null) {
            ai0.mo8243I0(aVar);
        }
    }

    /* renamed from: J6 */
    public final synchronized void mo8244J6(ai0 ai0) {
        this.f6455a = ai0;
    }

    /* renamed from: K6 */
    public final synchronized void mo8245K6(bi1 bi1) {
        this.f6457c = bi1;
    }

    /* renamed from: L */
    public final synchronized void mo8246L(C4954a aVar) throws RemoteException {
        gb1 gb1 = this.f6456b;
        if (gb1 != null) {
            gb1.mo10446b();
        }
    }

    /* renamed from: L0 */
    public final synchronized void mo8247L0(C4954a aVar, int i) throws RemoteException {
        gb1 gb1 = this.f6456b;
        if (gb1 != null) {
            gb1.mo10447g(i);
        }
    }

    /* renamed from: N2 */
    public final synchronized void mo8248N2(C4954a aVar, int i) throws RemoteException {
        bi1 bi1 = this.f6457c;
        if (bi1 != null) {
            pm0.m18667g("Fail to initialize adapter ".concat(String.valueOf(((v92) bi1).f18985c.f9704a)));
        }
    }

    /* renamed from: P0 */
    public final synchronized void mo8249P0(gb1 gb1) {
        this.f6456b = gb1;
    }

    /* renamed from: S5 */
    public final synchronized void mo8250S5(C4954a aVar) throws RemoteException {
        ai0 ai0 = this.f6455a;
        if (ai0 != null) {
            ((w92) ai0).f19536d.mo12071e();
        }
    }

    /* renamed from: n6 */
    public final synchronized void mo8251n6(C4954a aVar) throws RemoteException {
        ai0 ai0 = this.f6455a;
        if (ai0 != null) {
            ((w92) ai0).f19535c.mo9866d();
        }
    }

    /* renamed from: s0 */
    public final synchronized void mo8252s0(C4954a aVar) throws RemoteException {
        bi1 bi1 = this.f6457c;
        if (bi1 != null) {
            ((v92) bi1).f18986d.f20051b.execute(new u92((v92) bi1, ((v92) bi1).f18983a, ((v92) bi1).f18984b, ((v92) bi1).f18985c));
        }
    }

    /* renamed from: x2 */
    public final synchronized void mo8253x2(C4954a aVar, bi0 bi0) throws RemoteException {
        ai0 ai0 = this.f6455a;
        if (ai0 != null) {
            ((w92) ai0).f19536d.mo12069D(bi0);
        }
    }

    public final synchronized void zze(C4954a aVar) throws RemoteException {
        ai0 ai0 = this.f6455a;
        if (ai0 != null) {
            ((w92) ai0).f19534b.onAdClicked();
        }
    }
}
