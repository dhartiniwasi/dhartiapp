package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.C2063c;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p007a5.C0111g;
import p017b5.C1786a0;
import p017b5.C1787b;
import p017b5.C1802i0;
import p017b5.C1803j;
import p017b5.C1817q;
import p033d5.C4108h;
import p033d5.C4122l0;
import p033d5.C4130o;
import p033d5.C4144s;
import p033d5.C4147t;
import p033d5.C4153v;
import p033d5.C4156w;
import p033d5.C4159x;
import p067i5.C4695i;
import p123q5.C5412j;
import p124r.C5415b;
import p180z4.C6362b;
import p180z4.C6368e;
import p218e6.C9975i;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C2076c implements Handler.Callback {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final Status f6117A = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final Object f6118B = new Object();

    /* renamed from: C */
    private static C2076c f6119C;

    /* renamed from: z */
    public static final Status f6120z = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f6121a = 5000;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f6122b = 120000;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f6123c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f6124d = false;

    /* renamed from: e */
    private C4153v f6125e;

    /* renamed from: f */
    private C4159x f6126f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f6127g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C6368e f6128h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C4122l0 f6129i;

    /* renamed from: r */
    private final AtomicInteger f6130r = new AtomicInteger(1);

    /* renamed from: s */
    private final AtomicInteger f6131s = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Map<C1787b<?>, C2115o0<?>> f6132t = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C2105l f6133u = null;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final Set<C1787b<?>> f6134v = new C5415b();

    /* renamed from: w */
    private final Set<C1787b<?>> f6135w = new C5415b();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final Handler f6136x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public volatile boolean f6137y = true;

    private C2076c(Context context, Looper looper, C6368e eVar) {
        this.f6127g = context;
        C5412j jVar = new C5412j(looper, this);
        this.f6136x = jVar;
        this.f6128h = eVar;
        this.f6129i = new C4122l0(eVar);
        if (C4695i.m30392a(context)) {
            this.f6137y = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static Status m9209h(C1787b<?> bVar, C6362b bVar2) {
        String b = bVar.mo6915b();
        String valueOf = String.valueOf(bVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(bVar2, sb.toString());
    }

    /* renamed from: i */
    private final C2115o0<?> m9210i(C2063c<?> cVar) {
        C1787b<?> j = cVar.mo7977j();
        C2115o0<?> o0Var = this.f6132t.get(j);
        if (o0Var == null) {
            o0Var = new C2115o0<>(this, cVar);
            this.f6132t.put(j, o0Var);
        }
        if (o0Var.mo8108N()) {
            this.f6135w.add(j);
        }
        o0Var.mo8098C();
        return o0Var;
    }

    /* renamed from: j */
    private final C4159x m9211j() {
        if (this.f6126f == null) {
            this.f6126f = C4156w.m28261a(this.f6127g);
        }
        return this.f6126f;
    }

    /* renamed from: k */
    private final void m9212k() {
        C4153v vVar = this.f6125e;
        if (vVar != null) {
            if (vVar.mo17478I1() > 0 || mo8043f()) {
                m9211j().mo17487b(vVar);
            }
            this.f6125e = null;
        }
    }

    /* renamed from: l */
    private final <T> void m9213l(C9977j<T> jVar, int i, C2063c cVar) {
        C2124s0 b;
        if (i != 0 && (b = C2124s0.m9453b(this, i, cVar.mo7977j())) != null) {
            C9975i<T> a = jVar.mo32542a();
            Handler handler = this.f6136x;
            handler.getClass();
            a.mo26348c(new C1817q(handler), b);
        }
    }

    /* renamed from: x */
    public static C2076c m9223x(Context context) {
        C2076c cVar;
        synchronized (f6118B) {
            if (f6119C == null) {
                f6119C = new C2076c(context.getApplicationContext(), C4108h.m28150c().getLooper(), C6368e.m37415q());
            }
            cVar = f6119C;
        }
        return cVar;
    }

    /* renamed from: D */
    public final <O extends C2051a.C2055d> void mo8035D(C2063c<O> cVar, int i, C2073b<? extends C0111g, C2051a.C2053b> bVar) {
        C2075b1 b1Var = new C2075b1(i, bVar);
        Handler handler = this.f6136x;
        handler.sendMessage(handler.obtainMessage(4, new C1786a0(b1Var, this.f6131s.get(), cVar)));
    }

    /* renamed from: E */
    public final <O extends C2051a.C2055d, ResultT> void mo8036E(C2063c<O> cVar, int i, C2089g<C2051a.C2053b, ResultT> gVar, C9977j<ResultT> jVar, C1803j jVar2) {
        m9213l(jVar, gVar.mo8059d(), cVar);
        C2078c1 c1Var = new C2078c1(i, gVar, jVar, jVar2);
        Handler handler = this.f6136x;
        handler.sendMessage(handler.obtainMessage(4, new C1786a0(c1Var, this.f6131s.get(), cVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo8037F(C4130o oVar, int i, long j, int i2) {
        Handler handler = this.f6136x;
        handler.sendMessage(handler.obtainMessage(18, new C2126t0(oVar, i, j, i2)));
    }

    /* renamed from: G */
    public final void mo8038G(C6362b bVar, int i) {
        if (!mo8044g(bVar, i)) {
            Handler handler = this.f6136x;
            handler.sendMessage(handler.obtainMessage(5, i, 0, bVar));
        }
    }

    /* renamed from: a */
    public final void mo8039a() {
        Handler handler = this.f6136x;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: b */
    public final void mo8040b(C2063c<?> cVar) {
        Handler handler = this.f6136x;
        handler.sendMessage(handler.obtainMessage(7, cVar));
    }

    /* renamed from: c */
    public final void mo8041c(C2105l lVar) {
        synchronized (f6118B) {
            if (this.f6133u != lVar) {
                this.f6133u = lVar;
                this.f6134v.clear();
            }
            this.f6134v.addAll(lVar.mo8089t());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8042d(C2105l lVar) {
        synchronized (f6118B) {
            if (this.f6133u == lVar) {
                this.f6133u = null;
                this.f6134v.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo8043f() {
        if (this.f6124d) {
            return false;
        }
        C4147t a = C4144s.m28227b().mo17459a();
        if (a != null && !a.mo17465K1()) {
            return false;
        }
        int a2 = this.f6129i.mo17421a(this.f6127g, 203400000);
        if (a2 == -1 || a2 == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo8044g(C6362b bVar, int i) {
        return this.f6128h.mo21772A(this.f6127g, bVar, i);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        long j = 300000;
        C2115o0 o0Var = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f6123c = j;
                this.f6136x.removeMessages(12);
                for (C1787b<?> obtainMessage : this.f6132t.keySet()) {
                    Handler handler = this.f6136x;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f6123c);
                }
                break;
            case 2:
                C1802i0 i0Var = (C1802i0) message.obj;
                Iterator<C1787b<?>> it = i0Var.mo6960a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C1787b next = it.next();
                        C2115o0 o0Var2 = this.f6132t.get(next);
                        if (o0Var2 == null) {
                            i0Var.mo6961b(next, new C6362b(13), (String) null);
                            break;
                        } else if (o0Var2.mo8107M()) {
                            i0Var.mo6961b(next, C6362b.f30577e, o0Var2.mo8113t().mo6937g());
                        } else {
                            C6362b r = o0Var2.mo8112r();
                            if (r != null) {
                                i0Var.mo6961b(next, r, (String) null);
                            } else {
                                o0Var2.mo8103H(i0Var);
                                o0Var2.mo8098C();
                            }
                        }
                    }
                }
            case 3:
                for (C2115o0 next2 : this.f6132t.values()) {
                    next2.mo8097B();
                    next2.mo8098C();
                }
                break;
            case 4:
            case 8:
            case 13:
                C1786a0 a0Var = (C1786a0) message.obj;
                C2115o0<?> o0Var3 = this.f6132t.get(a0Var.f5311c.mo7977j());
                if (o0Var3 == null) {
                    o0Var3 = m9210i(a0Var.f5311c);
                }
                if (o0Var3.mo8108N() && this.f6131s.get() != a0Var.f5310b) {
                    a0Var.f5309a.mo8031a(f6120z);
                    o0Var3.mo8105J();
                    break;
                } else {
                    o0Var3.mo8099D(a0Var.f5309a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                C6362b bVar = (C6362b) message.obj;
                Iterator<C2115o0<?>> it2 = this.f6132t.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C2115o0 next3 = it2.next();
                        if (next3.mo8110o() == i2) {
                            o0Var = next3;
                        }
                    }
                }
                if (o0Var != null) {
                    if (bVar.mo21751I1() != 13) {
                        o0Var.m9388d(m9209h(o0Var.f6250c, bVar));
                        break;
                    } else {
                        String g = this.f6128h.mo21775g(bVar.mo21751I1());
                        String J1 = bVar.mo21752J1();
                        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 69 + String.valueOf(J1).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(g);
                        sb.append(": ");
                        sb.append(J1);
                        o0Var.m9388d(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f6127g.getApplicationContext() instanceof Application) {
                    C2069a.m9142c((Application) this.f6127g.getApplicationContext());
                    C2069a.m9141b().mo8009a(new C2100j0(this));
                    if (!C2069a.m9141b().mo8011e(true)) {
                        this.f6123c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m9210i((C2063c) message.obj);
                break;
            case 9:
                if (this.f6132t.containsKey(message.obj)) {
                    this.f6132t.get(message.obj).mo8104I();
                    break;
                }
                break;
            case 10:
                for (C1787b<?> remove : this.f6135w) {
                    C2115o0 remove2 = this.f6132t.remove(remove);
                    if (remove2 != null) {
                        remove2.mo8105J();
                    }
                }
                this.f6135w.clear();
                break;
            case 11:
                if (this.f6132t.containsKey(message.obj)) {
                    this.f6132t.get(message.obj).mo8106K();
                    break;
                }
                break;
            case 12:
                if (this.f6132t.containsKey(message.obj)) {
                    this.f6132t.get(message.obj).mo8109a();
                    break;
                }
                break;
            case 14:
                C2108m mVar = (C2108m) message.obj;
                C1787b<?> a = mVar.mo8092a();
                if (this.f6132t.containsKey(a)) {
                    mVar.mo8093b().mo32544c(Boolean.valueOf(this.f6132t.get(a).m9398n(false)));
                    break;
                } else {
                    mVar.mo8093b().mo32544c(Boolean.FALSE);
                    break;
                }
            case 15:
                C2118p0 p0Var = (C2118p0) message.obj;
                if (this.f6132t.containsKey(p0Var.f6264a)) {
                    C2115o0.m9404z(this.f6132t.get(p0Var.f6264a), p0Var);
                    break;
                }
                break;
            case 16:
                C2118p0 p0Var2 = (C2118p0) message.obj;
                if (this.f6132t.containsKey(p0Var2.f6264a)) {
                    C2115o0.m9384A(this.f6132t.get(p0Var2.f6264a), p0Var2);
                    break;
                }
                break;
            case 17:
                m9212k();
                break;
            case 18:
                C2126t0 t0Var = (C2126t0) message.obj;
                if (t0Var.f6288c != 0) {
                    C4153v vVar = this.f6125e;
                    if (vVar != null) {
                        List<C4130o> J12 = vVar.mo17479J1();
                        if (vVar.mo17478I1() != t0Var.f6287b || (J12 != null && J12.size() >= t0Var.f6289d)) {
                            this.f6136x.removeMessages(17);
                            m9212k();
                        } else {
                            this.f6125e.mo17480K1(t0Var.f6286a);
                        }
                    }
                    if (this.f6125e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(t0Var.f6286a);
                        this.f6125e = new C4153v(t0Var.f6287b, arrayList);
                        Handler handler2 = this.f6136x;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), t0Var.f6288c);
                        break;
                    }
                } else {
                    m9211j().mo17487b(new C4153v(t0Var.f6287b, Arrays.asList(new C4130o[]{t0Var.f6286a})));
                    break;
                }
                break;
            case 19:
                this.f6124d = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: m */
    public final int mo8046m() {
        return this.f6130r.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final C2115o0 mo8047w(C1787b<?> bVar) {
        return this.f6132t.get(bVar);
    }
}
