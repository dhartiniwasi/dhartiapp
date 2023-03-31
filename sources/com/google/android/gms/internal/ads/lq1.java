package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lq1 {

    /* renamed from: a */
    private final wa1 f12886a;

    /* renamed from: b */
    private final fk1 f12887b;

    /* renamed from: c */
    private final jo1 f12888c;

    /* renamed from: d */
    private final CopyOnWriteArraySet f12889d;

    /* renamed from: e */
    private final ArrayDeque f12890e;

    /* renamed from: f */
    private final ArrayDeque f12891f;

    /* renamed from: g */
    private boolean f12892g;

    public lq1(Looper looper, wa1 wa1, jo1 jo1) {
        this(new CopyOnWriteArraySet(), looper, wa1, jo1);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m16098g(lq1 lq1, Message message) {
        Iterator it = lq1.f12889d.iterator();
        while (it.hasNext()) {
            ((kp1) it.next()).mo11752b(lq1.f12888c);
            if (lq1.f12887b.mo9037p(0)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final lq1 mo12059a(Looper looper, jo1 jo1) {
        return new lq1(this.f12889d, looper, this.f12886a, jo1);
    }

    /* renamed from: b */
    public final void mo12060b(Object obj) {
        if (!this.f12892g) {
            this.f12889d.add(new kp1(obj));
        }
    }

    /* renamed from: c */
    public final void mo12061c() {
        if (!this.f12891f.isEmpty()) {
            if (!this.f12887b.mo9037p(0)) {
                fk1 fk1 = this.f12887b;
                fk1.mo9038q(fk1.mo9034g(0));
            }
            boolean isEmpty = this.f12890e.isEmpty();
            this.f12890e.addAll(this.f12891f);
            this.f12891f.clear();
            if (!(!isEmpty)) {
                while (!this.f12890e.isEmpty()) {
                    ((Runnable) this.f12890e.peekFirst()).run();
                    this.f12890e.removeFirst();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo12062d(int i, in1 in1) {
        this.f12891f.add(new hm1(new CopyOnWriteArraySet(this.f12889d), i, in1));
    }

    /* renamed from: e */
    public final void mo12063e() {
        Iterator it = this.f12889d.iterator();
        while (it.hasNext()) {
            ((kp1) it.next()).mo11753c(this.f12888c);
        }
        this.f12889d.clear();
        this.f12892g = true;
    }

    /* renamed from: f */
    public final void mo12064f(Object obj) {
        Iterator it = this.f12889d.iterator();
        while (it.hasNext()) {
            kp1 kp1 = (kp1) it.next();
            if (kp1.f12207a.equals(obj)) {
                kp1.mo11753c(this.f12888c);
                this.f12889d.remove(kp1);
            }
        }
    }

    private lq1(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, wa1 wa1, jo1 jo1) {
        this.f12886a = wa1;
        this.f12889d = copyOnWriteArraySet;
        this.f12888c = jo1;
        this.f12890e = new ArrayDeque();
        this.f12891f = new ArrayDeque();
        this.f12887b = wa1.mo14878a(looper, new gl1(this));
    }
}
