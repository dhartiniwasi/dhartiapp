package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class ge3 extends od3 {

    /* renamed from: r */
    private static final de3 f9869r;

    /* renamed from: s */
    private static final Logger f9870s = Logger.getLogger(ge3.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile Set<Throwable> f9871h = null;

    /* renamed from: i */
    private volatile int f9872i;

    static {
        Throwable th;
        de3 de3;
        try {
            de3 = new ee3(AtomicReferenceFieldUpdater.newUpdater(ge3.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(ge3.class, "i"));
            th = null;
        } catch (Error | RuntimeException e) {
            th = e;
            de3 = new fe3((ce3) null);
        }
        f9869r = de3;
        if (th != null) {
            f9870s.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    ge3(int i) {
        this.f9872i = i;
    }

    /* renamed from: D */
    static /* synthetic */ int m13254D(ge3 ge3) {
        int i = ge3.f9872i - 1;
        ge3.f9872i = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final int mo10495E() {
        return f9869r.mo9561a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final Set mo10496H() {
        Set<Throwable> set = this.f9871h;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        mo8751J(newSetFromMap);
        f9869r.mo9562b(this, (Set) null, newSetFromMap);
        Set<Throwable> set2 = this.f9871h;
        set2.getClass();
        return set2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo10497I() {
        this.f9871h = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public abstract void mo8751J(Set set);
}
