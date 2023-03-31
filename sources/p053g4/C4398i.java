package p053g4;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C2658ne;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.C2807re;
import com.google.android.gms.internal.ads.C2918ue;
import com.google.android.gms.internal.ads.b43;
import com.google.android.gms.internal.ads.dn0;
import com.google.android.gms.internal.ads.e23;
import com.google.android.gms.internal.ads.h33;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.vm0;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import p060h4.C4584t;
import p060h4.C4596v;
import p073j4.C4751b2;

/* renamed from: g4.i */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4398i implements Runnable, C2807re {

    /* renamed from: a */
    private final List f24502a = new Vector();

    /* renamed from: b */
    private final AtomicReference f24503b = new AtomicReference();

    /* renamed from: c */
    private final AtomicReference f24504c = new AtomicReference();

    /* renamed from: d */
    protected boolean f24505d;

    /* renamed from: e */
    private final boolean f24506e;

    /* renamed from: f */
    private final boolean f24507f;

    /* renamed from: g */
    private final Executor f24508g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final e23 f24509h;

    /* renamed from: i */
    private Context f24510i;

    /* renamed from: r */
    private final Context f24511r;

    /* renamed from: s */
    private vm0 f24512s;

    /* renamed from: t */
    private final vm0 f24513t;

    /* renamed from: u */
    private final boolean f24514u;

    /* renamed from: v */
    final CountDownLatch f24515v = new CountDownLatch(1);

    /* renamed from: w */
    private int f24516w;

    public C4398i(Context context, vm0 vm0) {
        this.f24510i = context;
        this.f24511r = context;
        this.f24512s = vm0;
        this.f24513t = vm0;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f24508g = newCachedThreadPool;
        boolean booleanValue = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14454V1)).booleanValue();
        this.f24514u = booleanValue;
        this.f24509h = e23.m11882a(context, newCachedThreadPool, booleanValue);
        this.f24506e = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14414R1)).booleanValue();
        this.f24507f = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14463W1)).booleanValue();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14444U1)).booleanValue()) {
            this.f24516w = 2;
        } else {
            this.f24516w = 1;
        }
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14295F2)).booleanValue()) {
            this.f24505d = mo17904j();
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14740y2)).booleanValue()) {
            dn0.f8325a.execute(this);
            return;
        }
        C4584t.m30036b();
        if (im0.m14415v()) {
            dn0.f8325a.execute(this);
        } else {
            run();
        }
    }

    /* renamed from: m */
    private final C2807re m29230m() {
        if (mo17906l() == 2) {
            return (C2807re) this.f24504c.get();
        }
        return (C2807re) this.f24503b.get();
    }

    /* renamed from: n */
    private final void m29231n() {
        C2807re m = m29230m();
        if (!this.f24502a.isEmpty() && m != null) {
            for (Object[] objArr : this.f24502a) {
                int length = objArr.length;
                if (length == 1) {
                    m.mo12594e((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    m.mo12592c(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f24502a.clear();
        }
    }

    /* renamed from: o */
    private final void m29232o(boolean z) {
        this.f24503b.set(C2918ue.m21595x(this.f24512s.f19150a, m29233p(this.f24510i), z, this.f24516w));
    }

    /* renamed from: p */
    private static final Context m29233p(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final void mo12590a(View view) {
        C2807re m = m29230m();
        if (m != null) {
            m.mo12590a(view);
        }
    }

    /* renamed from: b */
    public final String mo12591b(Context context) {
        C2807re m;
        if (!mo17905k() || (m = m29230m()) == null) {
            return "";
        }
        m29231n();
        return m.mo12591b(m29233p(context));
    }

    /* renamed from: c */
    public final void mo12592c(int i, int i2, int i3) {
        C2807re m = m29230m();
        if (m != null) {
            m29231n();
            m.mo12592c(i, i2, i3);
            return;
        }
        this.f24502a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: d */
    public final String mo12593d(Context context, String str, View view, Activity activity) {
        if (!mo17905k()) {
            return "";
        }
        C2807re m = m29230m();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14676r8)).booleanValue()) {
            C4409t.m29326r();
            C4751b2.m30611f(view, 4, (MotionEvent) null);
        }
        if (m == null) {
            return "";
        }
        m29231n();
        return m.mo12593d(m29233p(context), str, view, activity);
    }

    /* renamed from: e */
    public final void mo12594e(MotionEvent motionEvent) {
        C2807re m = m29230m();
        if (m != null) {
            m29231n();
            m.mo12594e(motionEvent);
            return;
        }
        this.f24502a.add(new Object[]{motionEvent});
    }

    /* renamed from: f */
    public final String mo12595f(Context context, View view, Activity activity) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14666q8)).booleanValue()) {
            C2807re m = m29230m();
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14676r8)).booleanValue()) {
                C4409t.m29326r();
                C4751b2.m30611f(view, 2, (MotionEvent) null);
            }
            return m != null ? m.mo12595f(context, view, activity) : "";
        } else if (!mo17905k()) {
            return "";
        } else {
            C2807re m2 = m29230m();
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14676r8)).booleanValue()) {
                C4409t.m29326r();
                C4751b2.m30611f(view, 2, (MotionEvent) null);
            }
            if (m2 != null) {
                return m2.mo12595f(context, view, activity);
            }
            return "";
        }
    }

    /* renamed from: g */
    public final String mo12596g(Context context, String str, View view) {
        return mo12593d(context, str, view, (Activity) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo17903i(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C2658ne.m17046h(this.f24513t.f19150a, m29233p(this.f24511r), z, this.f24514u).mo12598o();
        } catch (NullPointerException e) {
            this.f24509h.mo9788c(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo17904j() {
        Context context = this.f24510i;
        e23 e23 = this.f24509h;
        C4397h hVar = new C4397h(this);
        return new b43(this.f24510i, h33.m13695b(context, e23), hVar, ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14424S1)).booleanValue()).mo8674d(1);
    }

    /* renamed from: k */
    public final boolean mo17905k() {
        try {
            this.f24515v.await();
            return true;
        } catch (InterruptedException e) {
            pm0.m18668h("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo17906l() {
        if (!this.f24506e || this.f24505d) {
            return this.f24516w;
        }
        return 1;
    }

    public final void run() {
        boolean z;
        long currentTimeMillis;
        try {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14295F2)).booleanValue()) {
                this.f24505d = mo17904j();
            }
            boolean z2 = this.f24512s.f19153d;
            z = false;
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14403Q0)).booleanValue() && z2) {
                z = true;
            }
            if (mo17906l() == 1) {
                m29232o(z);
                if (this.f24516w == 2) {
                    this.f24508g.execute(new C4396g(this, z));
                }
            } else {
                currentTimeMillis = System.currentTimeMillis();
                C2658ne h = C2658ne.m17046h(this.f24512s.f19150a, m29233p(this.f24510i), z, this.f24514u);
                this.f24504c.set(h);
                if (this.f24507f && !h.mo12599q()) {
                    this.f24516w = 1;
                    m29232o(z);
                }
            }
        } catch (NullPointerException e) {
            this.f24516w = 1;
            m29232o(z);
            this.f24509h.mo9788c(2031, System.currentTimeMillis() - currentTimeMillis, e);
        } catch (Throwable th) {
            this.f24515v.countDown();
            this.f24510i = null;
            this.f24512s = null;
            throw th;
        }
        this.f24515v.countDown();
        this.f24510i = null;
        this.f24512s = null;
    }
}
