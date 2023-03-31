package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.ji */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2514ji implements C2402gi {

    /* renamed from: a */
    private final C2996wi[] f11624a;

    /* renamed from: b */
    private final C2484ip f11625b;

    /* renamed from: c */
    private final C2409gp f11626c;

    /* renamed from: d */
    private final Handler f11627d;

    /* renamed from: e */
    private final C2699oi f11628e;

    /* renamed from: f */
    private final CopyOnWriteArraySet f11629f = new CopyOnWriteArraySet();

    /* renamed from: g */
    private final C2217bj f11630g;

    /* renamed from: h */
    private final C2180aj f11631h;

    /* renamed from: i */
    private boolean f11632i;

    /* renamed from: j */
    private boolean f11633j = false;

    /* renamed from: k */
    private int f11634k = 1;

    /* renamed from: l */
    private int f11635l;

    /* renamed from: m */
    private int f11636m;

    /* renamed from: n */
    private boolean f11637n;

    /* renamed from: o */
    private C2254cj f11638o;

    /* renamed from: p */
    private Object f11639p;

    /* renamed from: q */
    private C2891to f11640q;

    /* renamed from: r */
    private C2409gp f11641r;

    /* renamed from: s */
    private C2959vi f11642s;

    /* renamed from: t */
    private C2588li f11643t;

    /* renamed from: u */
    private long f11644u;

    public C2514ji(C2996wi[] wiVarArr, C2484ip ipVar, yp0 yp0, byte[] bArr) {
        String str = C2893tq.f18212e;
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.2 [" + str + "]");
        this.f11624a = wiVarArr;
        Objects.requireNonNull(ipVar);
        this.f11625b = ipVar;
        C2409gp gpVar = new C2409gp(new C3039xo[2], (byte[]) null);
        this.f11626c = gpVar;
        this.f11638o = C2254cj.f7765a;
        this.f11630g = new C2217bj();
        this.f11631h = new C2180aj();
        this.f11640q = C2891to.f18175d;
        this.f11641r = gpVar;
        this.f11642s = C2959vi.f19105d;
        C2477ii iiVar = new C2477ii(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f11627d = iiVar;
        C2588li liVar = new C2588li(0, 0);
        this.f11643t = liVar;
        this.f11628e = new C2699oi(wiVarArr, ipVar, yp0, this.f11633j, 0, iiVar, liVar, this, (byte[]) null);
    }

    /* renamed from: V */
    public final void mo10518V() {
        this.f11628e.mo12947y();
    }

    /* renamed from: X */
    public final void mo10519X() {
        if (this.f11628e.mo12941I()) {
            if (!this.f11628e.mo12942J()) {
                Iterator it = this.f11629f.iterator();
                while (it.hasNext()) {
                    ((C2290di) it.next()).mo9598w(C2253ci.m10946c(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
                }
            }
            this.f11627d.removeCallbacksAndMessages((Object) null);
            return;
        }
        this.f11628e.mo12933A();
        this.f11627d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public final int mo11404a() {
        if (!this.f11638o.mo9188h() && this.f11635l <= 0) {
            this.f11638o.mo9184d(this.f11643t.f12809a, this.f11631h, false);
        }
        return 0;
    }

    /* renamed from: b */
    public final long mo10520b() {
        if (this.f11638o.mo9188h()) {
            return -9223372036854775807L;
        }
        C2254cj cjVar = this.f11638o;
        mo11404a();
        return C2216bi.m10387b(cjVar.mo9187g(0, this.f11630g, false).f7309a);
    }

    /* renamed from: c */
    public final void mo10521c() {
        this.f11628e.mo12945w();
    }

    /* renamed from: d */
    public final long mo10522d() {
        if (this.f11638o.mo9188h() || this.f11635l > 0) {
            return this.f11644u;
        }
        this.f11638o.mo9184d(this.f11643t.f12809a, this.f11631h, false);
        return C2216bi.m10387b(0) + C2216bi.m10387b(this.f11643t.f12812d);
    }

    /* renamed from: e */
    public final long mo10523e() {
        if (this.f11638o.mo9188h() || this.f11635l > 0) {
            return this.f11644u;
        }
        this.f11638o.mo9184d(this.f11643t.f12809a, this.f11631h, false);
        return C2216bi.m10387b(0) + C2216bi.m10387b(this.f11643t.f12811c);
    }

    /* renamed from: e0 */
    public final void mo10524e0() {
        this.f11628e.mo12939G();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo11405f(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.f11636m--;
                return;
            case 1:
                this.f11634k = message.arg1;
                Iterator it = this.f11629f.iterator();
                while (it.hasNext()) {
                    ((C2290di) it.next()).mo9599y(this.f11633j, this.f11634k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.f11637n = z;
                Iterator it2 = this.f11629f.iterator();
                while (it2.hasNext()) {
                    ((C2290di) it2.next()).mo9596b(this.f11637n);
                }
                return;
            case 3:
                if (this.f11636m == 0) {
                    C2521jp jpVar = (C2521jp) message.obj;
                    this.f11632i = true;
                    this.f11640q = jpVar.f11730a;
                    this.f11641r = jpVar.f11731b;
                    this.f11625b.mo9990b(jpVar.f11732c);
                    Iterator it3 = this.f11629f.iterator();
                    while (it3.hasNext()) {
                        ((C2290di) it3.next()).mo9600z(this.f11640q, this.f11641r);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.f11635l - 1;
                this.f11635l = i;
                if (i == 0) {
                    this.f11643t = (C2588li) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.f11629f.iterator();
                        while (it4.hasNext()) {
                            ((C2290di) it4.next()).mo9595a();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f11635l == 0) {
                    this.f11643t = (C2588li) message.obj;
                    Iterator it5 = this.f11629f.iterator();
                    while (it5.hasNext()) {
                        ((C2290di) it5.next()).mo9595a();
                    }
                    return;
                }
                return;
            case 6:
                C2662ni niVar = (C2662ni) message.obj;
                this.f11635l -= niVar.f14030d;
                if (this.f11636m == 0) {
                    this.f11638o = niVar.f14027a;
                    this.f11639p = niVar.f14028b;
                    this.f11643t = niVar.f14029c;
                    Iterator it6 = this.f11629f.iterator();
                    while (it6.hasNext()) {
                        ((C2290di) it6.next()).mo9594C(this.f11638o, this.f11639p);
                    }
                    return;
                }
                return;
            case 7:
                C2959vi viVar = (C2959vi) message.obj;
                if (!this.f11642s.equals(viVar)) {
                    this.f11642s = viVar;
                    Iterator it7 = this.f11629f.iterator();
                    while (it7.hasNext()) {
                        ((C2290di) it7.next()).mo9597m(viVar);
                    }
                    return;
                }
                return;
            case 8:
                C2253ci ciVar = (C2253ci) message.obj;
                Iterator it8 = this.f11629f.iterator();
                while (it8.hasNext()) {
                    ((C2290di) it8.next()).mo9598w(ciVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: i0 */
    public final void mo10525i0(int i) {
        this.f11628e.mo12946x(i);
    }

    /* renamed from: j0 */
    public final void mo10526j0(long j) {
        mo11404a();
        if (this.f11638o.mo9188h() || this.f11638o.mo9183c() > 0) {
            this.f11635l++;
            if (!this.f11638o.mo9188h()) {
                this.f11638o.mo9187g(0, this.f11630g, false);
                long a = C2216bi.m10386a(j);
                long j2 = this.f11638o.mo9184d(0, this.f11631h, false).f6593c;
                if (j2 != -9223372036854775807L) {
                    int i = (a > j2 ? 1 : (a == j2 ? 0 : -1));
                }
            }
            this.f11644u = j;
            this.f11628e.mo12934B(this.f11638o, 0, C2216bi.m10386a(j));
            Iterator it = this.f11629f.iterator();
            while (it.hasNext()) {
                ((C2290di) it.next()).mo9595a();
            }
            return;
        }
        throw new C2848si(this.f11638o, 0, j);
    }

    /* renamed from: k0 */
    public final void mo10527k0(boolean z) {
        if (this.f11633j != z) {
            this.f11633j = z;
            this.f11628e.mo12938F(z);
            Iterator it = this.f11629f.iterator();
            while (it.hasNext()) {
                ((C2290di) it.next()).mo9599y(z, this.f11634k);
            }
        }
    }

    /* renamed from: l0 */
    public final void mo10528l0(C2290di diVar) {
        this.f11629f.add(diVar);
    }

    /* renamed from: m0 */
    public final void mo10529m0(C2365fi... fiVarArr) {
        this.f11628e.mo12935C(fiVarArr);
    }

    /* renamed from: n0 */
    public final void mo10530n0(C2333eo eoVar) {
        if (!this.f11638o.mo9188h() || this.f11639p != null) {
            this.f11638o = C2254cj.f7765a;
            this.f11639p = null;
            Iterator it = this.f11629f.iterator();
            while (it.hasNext()) {
                ((C2290di) it.next()).mo9594C(this.f11638o, this.f11639p);
            }
        }
        if (this.f11632i) {
            this.f11632i = false;
            this.f11640q = C2891to.f18175d;
            this.f11641r = this.f11626c;
            this.f11625b.mo9990b((Object) null);
            Iterator it2 = this.f11629f.iterator();
            while (it2.hasNext()) {
                ((C2290di) it2.next()).mo9600z(this.f11640q, this.f11641r);
            }
        }
        this.f11636m++;
        this.f11628e.mo12948z(eoVar, true);
    }

    /* renamed from: o0 */
    public final void mo10531o0(C2290di diVar) {
        this.f11629f.remove(diVar);
    }

    /* renamed from: p0 */
    public final void mo10532p0(int i) {
        this.f11628e.mo12936D(i);
    }

    /* renamed from: q0 */
    public final void mo10533q0(C2365fi... fiVarArr) {
        if (!this.f11628e.mo12941I()) {
            this.f11628e.mo12944v(fiVarArr);
        } else if (!this.f11628e.mo12940H(fiVarArr)) {
            Iterator it = this.f11629f.iterator();
            while (it.hasNext()) {
                ((C2290di) it.next()).mo9598w(C2253ci.m10946c(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
            }
        }
    }

    /* renamed from: r0 */
    public final void mo10534r0(int i) {
        this.f11628e.mo12937E(i);
    }

    public final int zza() {
        return this.f11634k;
    }
}
