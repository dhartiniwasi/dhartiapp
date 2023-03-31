package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p053g4.C4409t;
import p060h4.C4470a;
import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class l11 implements w91, lb1, qa1, C4470a, ma1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f12598a;

    /* renamed from: b */
    private final Executor f12599b;

    /* renamed from: c */
    private final Executor f12600c;

    /* renamed from: d */
    private final ScheduledExecutorService f12601d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final us2 f12602e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final is2 f12603f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final nz2 f12604g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final nt2 f12605h;

    /* renamed from: i */
    private final C2955ve f12606i;

    /* renamed from: r */
    private final n00 f12607r;

    /* renamed from: s */
    private final yy2 f12608s;

    /* renamed from: t */
    private final WeakReference f12609t;

    /* renamed from: u */
    private final WeakReference f12610u;

    /* renamed from: v */
    private boolean f12611v;

    /* renamed from: w */
    private final AtomicBoolean f12612w = new AtomicBoolean();

    /* renamed from: x */
    private final p00 f12613x;

    l11(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, us2 us2, is2 is2, nz2 nz2, nt2 nt2, View view, vs0 vs0, C2955ve veVar, n00 n00, p00 p00, yy2 yy2, byte[] bArr) {
        this.f12598a = context;
        this.f12599b = executor;
        this.f12600c = executor2;
        this.f12601d = scheduledExecutorService;
        this.f12602e = us2;
        this.f12603f = is2;
        this.f12604g = nz2;
        this.f12605h = nt2;
        this.f12606i = veVar;
        this.f12609t = new WeakReference(view);
        this.f12610u = new WeakReference(vs0);
        this.f12607r = n00;
        this.f12613x = p00;
        this.f12608s = yy2;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m15772t() {
        int i;
        String f = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14325I2)).booleanValue() ? this.f12606i.mo14737c().mo12595f(this.f12598a, (View) this.f12609t.get(), (Activity) null) : null;
        if ((!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14608l0)).booleanValue() || !this.f12602e.f18723b.f18244b.f12935g) && ((Boolean) d10.f8021h.mo13438e()).booleanValue()) {
            if (((Boolean) d10.f8020g.mo13438e()).booleanValue() && ((i = this.f12603f.f10970b) == 1 || i == 2 || i == 5)) {
                vs0 vs0 = (vs0) this.f12610u.get();
            }
            cf3.m10920r((se3) cf3.m10917o(se3.m20287D(cf3.m10911i((Object) null)), ((Long) C4596v.m30088c().mo12227b(C2679nz.f14393P0)).longValue(), TimeUnit.MILLISECONDS, this.f12601d), new k11(this, f), this.f12599b);
            return;
        }
        nt2 nt2 = this.f12605h;
        nz2 nz2 = this.f12604g;
        us2 us2 = this.f12602e;
        is2 is2 = this.f12603f;
        nt2.mo12707a(nz2.mo12732d(us2, is2, false, f, (String) null, is2.f10974d));
    }

    /* renamed from: v */
    private final void m15773v(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.f12609t.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            m15772t();
        } else {
            this.f12601d.schedule(new e11(this, i, i2), (long) i2, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: R */
    public final void mo10490R(C4623z2 z2Var) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14639o1)).booleanValue()) {
            this.f12605h.mo12707a(this.f12604g.mo12731c(this.f12602e, this.f12603f, nz2.m17349f(2, z2Var.f25062a, this.f12603f.f10998p)));
        }
    }

    /* renamed from: W */
    public final void mo8333W() {
    }

    /* renamed from: Y */
    public final void mo8334Y() {
    }

    /* renamed from: Z */
    public final void mo9822Z() {
        if (this.f12612w.compareAndSet(false, true)) {
            int intValue = ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14365M2)).intValue();
            if (intValue > 0) {
                m15773v(intValue, ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14375N2)).intValue());
                return;
            }
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14355L2)).booleanValue()) {
                this.f12600c.execute(new h11(this));
            } else {
                m15772t();
            }
        }
    }

    /* renamed from: a0 */
    public final synchronized void mo10019a0() {
        if (this.f12611v) {
            ArrayList arrayList = new ArrayList(this.f12603f.f10974d);
            arrayList.addAll(this.f12603f.f10980g);
            this.f12605h.mo12707a(this.f12604g.mo12732d(this.f12602e, this.f12603f, true, (String) null, (String) null, arrayList));
        } else {
            nt2 nt2 = this.f12605h;
            nz2 nz2 = this.f12604g;
            us2 us2 = this.f12602e;
            is2 is2 = this.f12603f;
            nt2.mo12707a(nz2.mo12731c(us2, is2, is2.f10994n));
            nt2 nt22 = this.f12605h;
            nz2 nz22 = this.f12604g;
            us2 us22 = this.f12602e;
            is2 is22 = this.f12603f;
            nt22.mo12707a(nz22.mo12731c(us22, is22, is22.f10980g));
        }
        this.f12611v = true;
    }

    /* renamed from: c0 */
    public final void mo8335c0() {
    }

    /* renamed from: e0 */
    public final void mo8336e0() {
        nt2 nt2 = this.f12605h;
        nz2 nz2 = this.f12604g;
        us2 us2 = this.f12602e;
        is2 is2 = this.f12603f;
        nt2.mo12707a(nz2.mo12731c(us2, is2, is2.f10982h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo11867h() {
        this.f12599b.execute(new i11(this));
    }

    /* renamed from: j */
    public final void mo8337j(oh0 oh0, String str, String str2) {
        nt2 nt2 = this.f12605h;
        nz2 nz2 = this.f12604g;
        is2 is2 = this.f12603f;
        nt2.mo12707a(nz2.mo12733e(is2, is2.f10984i, oh0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo11868k(int i, int i2) {
        m15773v(i - 1, i2);
    }

    public final void onAdClicked() {
        if ((!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14608l0)).booleanValue() || !this.f12602e.f18723b.f18244b.f12935g) && ((Boolean) d10.f8017d.mo13438e()).booleanValue()) {
            cf3.m10920r(cf3.m10908f(se3.m20287D(this.f12607r.mo12474a()), Throwable.class, f11.f9075a, dn0.f8330f), new j11(this), this.f12599b);
            return;
        }
        nt2 nt2 = this.f12605h;
        nz2 nz2 = this.f12604g;
        us2 us2 = this.f12602e;
        is2 is2 = this.f12603f;
        List c = nz2.mo12731c(us2, is2, is2.f10972c);
        int i = 1;
        if (true == C4409t.m29325q().mo15128v(this.f12598a)) {
            i = 2;
        }
        nt2.mo12709c(c, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo11869p(int i, int i2) {
        this.f12599b.execute(new g11(this, i, i2));
    }

    /* renamed from: x */
    public final void mo8338x() {
        nt2 nt2 = this.f12605h;
        nz2 nz2 = this.f12604g;
        us2 us2 = this.f12602e;
        is2 is2 = this.f12603f;
        nt2.mo12707a(nz2.mo12731c(us2, is2, is2.f10986j));
    }
}
