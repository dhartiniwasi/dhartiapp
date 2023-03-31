package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class be3 extends ge3 {

    /* renamed from: w */
    private static final Logger f7215w = Logger.getLogger(be3.class.getName());

    /* renamed from: t */
    private pa3 f7216t;

    /* renamed from: u */
    private final boolean f7217u;

    /* renamed from: v */
    private final boolean f7218v;

    be3(pa3 pa3, boolean z, boolean z2) {
        super(pa3.size());
        this.f7216t = pa3;
        this.f7217u = z;
        this.f7218v = z2;
    }

    /* renamed from: K */
    private final void m10319K(int i, Future future) {
        try {
            mo8752P(i, cf3.m10918p(future));
        } catch (ExecutionException e) {
            m10321M(e.getCause());
        } catch (Error | RuntimeException e2) {
            m10321M(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void mo8756T(pa3 pa3) {
        int E = mo10495E();
        int i = 0;
        b83.m10245i(E >= 0, "Less than 0 remaining futures");
        if (E == 0) {
            if (pa3 != null) {
                uc3 j = pa3.iterator();
                while (j.hasNext()) {
                    Future future = (Future) j.next();
                    if (!future.isCancelled()) {
                        m10319K(i, future);
                    }
                    i++;
                }
            }
            mo10497I();
            mo8753Q();
            mo8757U(2);
        }
    }

    /* renamed from: M */
    private final void m10321M(Throwable th) {
        Objects.requireNonNull(th);
        if (this.f7217u && !mo9806h(th) && m10323O(mo10496H(), th)) {
            m10322N(th);
        } else if (th instanceof Error) {
            m10322N(th);
        }
    }

    /* renamed from: N */
    private static void m10322N(Throwable th) {
        f7215w.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* renamed from: O */
    private static boolean m10323O(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo8751J(Set set) {
        Objects.requireNonNull(set);
        if (!isCancelled()) {
            Throwable a = mo10129a();
            a.getClass();
            m10323O(set, a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public abstract void mo8752P(int i, Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public abstract void mo8753Q();

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final void mo8754R() {
        pa3 pa3 = this.f7216t;
        pa3.getClass();
        if (pa3.isEmpty()) {
            mo8753Q();
        } else if (this.f7217u) {
            uc3 j = this.f7216t.iterator();
            int i = 0;
            while (j.hasNext()) {
                lf3 lf3 = (lf3) j.next();
                lf3.mo10135j(new zd3(this, lf3, i), pe3.INSTANCE);
                i++;
            }
        } else {
            ae3 ae3 = new ae3(this, this.f7218v ? this.f7216t : null);
            uc3 j2 = this.f7216t.iterator();
            while (j2.hasNext()) {
                ((lf3) j2.next()).mo10135j(ae3, pe3.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final /* synthetic */ void mo8755S(lf3 lf3, int i) {
        try {
            if (lf3.isCancelled()) {
                this.f7216t = null;
                cancel(false);
            } else {
                m10319K(i, lf3);
            }
        } finally {
            mo8756T((pa3) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo8757U(int i) {
        this.f7216t = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo8329e() {
        pa3 pa3 = this.f7216t;
        if (pa3 == null) {
            return super.mo8329e();
        }
        pa3.toString();
        return "futures=".concat(pa3.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo8330f() {
        pa3 pa3 = this.f7216t;
        boolean z = true;
        mo8757U(1);
        boolean isCancelled = isCancelled();
        if (pa3 == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean x = mo10140x();
            uc3 j = pa3.iterator();
            while (j.hasNext()) {
                ((Future) j.next()).cancel(x);
            }
        }
    }
}
