package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p053g4.C4409t;
import p060h4.C4584t;
import p060h4.C4596v;
import p067i5.C4699m;
import p073j4.C4794n1;
import p073j4.C4800p1;
import p073j4.C4809s1;
import p081k5.C4888c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xl0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f20158a = new Object();

    /* renamed from: b */
    private final C4809s1 f20159b;

    /* renamed from: c */
    private final cm0 f20160c;

    /* renamed from: d */
    private boolean f20161d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f20162e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public vm0 f20163f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2865sz f20164g;

    /* renamed from: h */
    private Boolean f20165h;

    /* renamed from: i */
    private final AtomicInteger f20166i;

    /* renamed from: j */
    private final wl0 f20167j;

    /* renamed from: k */
    private final Object f20168k;

    /* renamed from: l */
    private lf3 f20169l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final AtomicBoolean f20170m;

    public xl0() {
        C4809s1 s1Var = new C4809s1();
        this.f20159b = s1Var;
        this.f20160c = new cm0(C4584t.m30038d(), s1Var);
        this.f20161d = false;
        this.f20164g = null;
        this.f20165h = null;
        this.f20166i = new AtomicInteger(0);
        this.f20167j = new wl0((vl0) null);
        this.f20168k = new Object();
        this.f20170m = new AtomicBoolean();
    }

    /* renamed from: a */
    public final int mo15112a() {
        return this.f20166i.get();
    }

    /* renamed from: c */
    public final Context mo15113c() {
        return this.f20162e;
    }

    /* renamed from: d */
    public final Resources mo15114d() {
        if (this.f20163f.f19153d) {
            return this.f20162e.getResources();
        }
        try {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14746y8)).booleanValue()) {
                return tm0.m21078a(this.f20162e).getResources();
            }
            tm0.m21078a(this.f20162e).getResources();
            return null;
        } catch (sm0 e) {
            pm0.m18668h("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: f */
    public final C2865sz mo15115f() {
        C2865sz szVar;
        synchronized (this.f20158a) {
            szVar = this.f20164g;
        }
        return szVar;
    }

    /* renamed from: g */
    public final cm0 mo15116g() {
        return this.f20160c;
    }

    /* renamed from: h */
    public final C4800p1 mo15117h() {
        C4809s1 s1Var;
        synchronized (this.f20158a) {
            s1Var = this.f20159b;
        }
        return s1Var;
    }

    /* renamed from: j */
    public final lf3 mo15118j() {
        if (this.f20162e != null) {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14610l2)).booleanValue()) {
                synchronized (this.f20168k) {
                    lf3 lf3 = this.f20169l;
                    if (lf3 != null) {
                        return lf3;
                    }
                    lf3 a = dn0.f8325a.mo12324a(new sl0(this));
                    this.f20169l = a;
                    return a;
                }
            }
        }
        return cf3.m10911i(new ArrayList());
    }

    /* renamed from: k */
    public final Boolean mo15119k() {
        Boolean bool;
        synchronized (this.f20158a) {
            bool = this.f20165h;
        }
        return bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ ArrayList mo15120m() throws Exception {
        Context a = mh0.m16529a(this.f20162e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f = C4888c.m31075a(a).mo18673f(a.getApplicationInfo().packageName, 4096);
            if (f.requestedPermissions != null && f.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = f.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((f.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    /* renamed from: o */
    public final void mo15121o() {
        this.f20167j.mo14948a();
    }

    /* renamed from: p */
    public final void mo15122p() {
        this.f20166i.decrementAndGet();
    }

    /* renamed from: q */
    public final void mo15123q() {
        this.f20166i.incrementAndGet();
    }

    /* renamed from: r */
    public final void mo15124r(Context context, vm0 vm0) {
        C2865sz szVar;
        synchronized (this.f20158a) {
            if (!this.f20161d) {
                this.f20162e = context.getApplicationContext();
                this.f20163f = vm0;
                C4409t.m29312d().mo13029c(this.f20160c);
                this.f20159b.mo18516u(this.f20162e);
                ag0.m9705d(this.f20162e, this.f20163f);
                C4409t.m29315g();
                if (!((Boolean) y00.f20408c.mo13438e()).booleanValue()) {
                    C4794n1.m30693k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    szVar = null;
                } else {
                    szVar = new C2865sz();
                }
                this.f20164g = szVar;
                if (szVar != null) {
                    gn0.m13405a(new tl0(this).mo15227b(), "AppState.registerCsiReporter");
                }
                if (C4699m.m30418i()) {
                    if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14615l7)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new ul0(this));
                    }
                }
                this.f20161d = true;
                mo15118j();
            }
        }
        C4409t.m29326r().mo18438z(context, vm0.f19150a);
    }

    /* renamed from: s */
    public final void mo15125s(Throwable th, String str) {
        ag0.m9705d(this.f20162e, this.f20163f).mo8325a(th, str, ((Double) n10.f13756g.mo13438e()).floatValue());
    }

    /* renamed from: t */
    public final void mo15126t(Throwable th, String str) {
        ag0.m9705d(this.f20162e, this.f20163f).mo8326b(th, str);
    }

    /* renamed from: u */
    public final void mo15127u(Boolean bool) {
        synchronized (this.f20158a) {
            this.f20165h = bool;
        }
    }

    /* renamed from: v */
    public final boolean mo15128v(Context context) {
        if (C4699m.m30418i()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14615l7)).booleanValue()) {
                return this.f20170m.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
