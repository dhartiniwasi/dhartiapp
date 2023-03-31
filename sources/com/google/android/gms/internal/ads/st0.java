package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import p060h4.C4499e4;
import p060h4.C4521i2;
import p060h4.C4545m2;
import p067i5.C4692f;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class st0 extends C4521i2 {

    /* renamed from: a */
    private final ap0 f17643a;

    /* renamed from: b */
    private final Object f17644b = new Object();

    /* renamed from: c */
    private final boolean f17645c;

    /* renamed from: d */
    private final boolean f17646d;

    /* renamed from: e */
    private int f17647e;

    /* renamed from: f */
    private C4545m2 f17648f;

    /* renamed from: g */
    private boolean f17649g;

    /* renamed from: h */
    private boolean f17650h = true;

    /* renamed from: i */
    private float f17651i;

    /* renamed from: r */
    private float f17652r;

    /* renamed from: s */
    private float f17653s;

    /* renamed from: t */
    private boolean f17654t;

    /* renamed from: u */
    private boolean f17655u;

    /* renamed from: v */
    private y30 f17656v;

    public st0(ap0 ap0, float f, boolean z, boolean z2) {
        this.f17643a = ap0;
        this.f17651i = f;
        this.f17645c = z;
        this.f17646d = z2;
    }

    /* renamed from: P6 */
    private final void m20589P6(int i, int i2, boolean z, boolean z2) {
        dn0.f8329e.execute(new rt0(this, i, i2, z, z2));
    }

    /* renamed from: Q6 */
    private final void m20590Q6(String str, Map map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        dn0.f8329e.execute(new qt0(this, hashMap));
    }

    /* renamed from: J6 */
    public final void mo14135J6(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.f17644b) {
            z2 = true;
            if (f2 == this.f17651i) {
                if (f3 == this.f17653s) {
                    z2 = false;
                }
            }
            this.f17651i = f2;
            this.f17652r = f;
            z3 = this.f17650h;
            this.f17650h = z;
            i2 = this.f17647e;
            this.f17647e = i;
            float f4 = this.f17653s;
            this.f17653s = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.f17643a.mo10647w().invalidate();
            }
        }
        if (z2) {
            try {
                y30 y30 = this.f17656v;
                if (y30 != null) {
                    y30.mo15319a();
                }
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        }
        m20589P6(i2, i, z3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K6 */
    public final /* synthetic */ void mo14136K6(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        int i3;
        boolean z4;
        C4545m2 m2Var;
        C4545m2 m2Var2;
        C4545m2 m2Var3;
        synchronized (this.f17644b) {
            boolean z5 = this.f17649g;
            boolean z6 = false;
            if (z5 || i2 != 1) {
                i3 = i2;
                z3 = false;
            } else {
                i3 = 1;
                z3 = true;
            }
            if (i == i2 || i3 != 1) {
                z4 = false;
            } else {
                i3 = 1;
                z4 = true;
            }
            boolean z7 = i != i2 && i3 == 2;
            boolean z8 = i != i2 && i3 == 3;
            if (z5 || z3) {
                z6 = true;
            }
            this.f17649g = z6;
            if (z3) {
                try {
                    C4545m2 m2Var4 = this.f17648f;
                    if (m2Var4 != null) {
                        m2Var4.mo18039V();
                    }
                } catch (RemoteException e) {
                    pm0.m18669i("#007 Could not call remote method.", e);
                }
            }
            if (z4 && (m2Var3 = this.f17648f) != null) {
                m2Var3.mo18038U();
            }
            if (z7 && (m2Var2 = this.f17648f) != null) {
                m2Var2.mo18041c();
            }
            if (z8) {
                C4545m2 m2Var5 = this.f17648f;
                if (m2Var5 != null) {
                    m2Var5.mo18040a();
                }
                this.f17643a.mo8474m0();
            }
            if (!(z == z2 || (m2Var = this.f17648f) == null)) {
                m2Var.mo18042v5(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L6 */
    public final /* synthetic */ void mo14137L6(Map map) {
        this.f17643a.mo9081R("pubVideoCmd", map);
    }

    /* renamed from: M6 */
    public final void mo14138M6(C4499e4 e4Var) {
        boolean z = e4Var.f24837a;
        boolean z2 = e4Var.f24838b;
        boolean z3 = e4Var.f24839c;
        synchronized (this.f17644b) {
            this.f17654t = z2;
            this.f17655u = z3;
        }
        m20590Q6("initialState", C4692f.m30381d("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    /* renamed from: N6 */
    public final void mo14139N6(float f) {
        synchronized (this.f17644b) {
            this.f17652r = f;
        }
    }

    /* renamed from: O6 */
    public final void mo14140O6(y30 y30) {
        synchronized (this.f17644b) {
            this.f17656v = y30;
        }
    }

    /* renamed from: T */
    public final float mo10783T() {
        float f;
        synchronized (this.f17644b) {
            f = this.f17652r;
        }
        return f;
    }

    /* renamed from: U */
    public final int mo10784U() {
        int i;
        synchronized (this.f17644b) {
            i = this.f17647e;
        }
        return i;
    }

    /* renamed from: V */
    public final C4545m2 mo10785V() throws RemoteException {
        C4545m2 m2Var;
        synchronized (this.f17644b) {
            m2Var = this.f17648f;
        }
        return m2Var;
    }

    /* renamed from: X */
    public final void mo10786X() {
        m20590Q6("pause", (Map) null);
    }

    /* renamed from: Y */
    public final boolean mo10787Y() {
        boolean z;
        boolean b0 = mo10791b0();
        synchronized (this.f17644b) {
            z = false;
            if (!b0) {
                try {
                    if (this.f17655u && this.f17646d) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    /* renamed from: Z */
    public final void mo10788Z() {
        m20590Q6("play", (Map) null);
    }

    /* renamed from: a */
    public final float mo10789a() {
        float f;
        synchronized (this.f17644b) {
            f = this.f17653s;
        }
        return f;
    }

    /* renamed from: a0 */
    public final void mo10790a0() {
        m20590Q6("stop", (Map) null);
    }

    /* renamed from: b0 */
    public final boolean mo10791b0() {
        boolean z;
        synchronized (this.f17644b) {
            z = false;
            if (this.f17645c && this.f17654t) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final float mo10792c() {
        float f;
        synchronized (this.f17644b) {
            f = this.f17651i;
        }
        return f;
    }

    /* renamed from: h */
    public final boolean mo10793h() {
        boolean z;
        synchronized (this.f17644b) {
            z = this.f17650h;
        }
        return z;
    }

    /* renamed from: j */
    public final void mo14141j() {
        boolean z;
        int i;
        synchronized (this.f17644b) {
            z = this.f17650h;
            i = this.f17647e;
            this.f17647e = 3;
        }
        m20589P6(i, 3, z, z);
    }

    /* renamed from: l1 */
    public final void mo10794l1(C4545m2 m2Var) {
        synchronized (this.f17644b) {
            this.f17648f = m2Var;
        }
    }

    /* renamed from: n2 */
    public final void mo10795n2(boolean z) {
        m20590Q6(true != z ? "unmute" : "mute", (Map) null);
    }
}
