package p036e1;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p020c1.C1836a;
import p064i1.C4647a;
import p170y0.C6094j;

/* renamed from: e1.d */
/* compiled from: ConstraintTracker */
public abstract class C4176d<T> {

    /* renamed from: f */
    private static final String f23436f = C6094j.m35719f("ConstraintTracker");

    /* renamed from: a */
    protected final C4647a f23437a;

    /* renamed from: b */
    protected final Context f23438b;

    /* renamed from: c */
    private final Object f23439c = new Object();

    /* renamed from: d */
    private final Set<C1836a<T>> f23440d = new LinkedHashSet();

    /* renamed from: e */
    T f23441e;

    /* renamed from: e1.d$a */
    /* compiled from: ConstraintTracker */
    class C4177a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f23442a;

        C4177a(List list) {
            this.f23442a = list;
        }

        public void run() {
            for (C1836a a : this.f23442a) {
                a.mo7015a(C4176d.this.f23441e);
            }
        }
    }

    C4176d(Context context, C4647a aVar) {
        this.f23438b = context.getApplicationContext();
        this.f23437a = aVar;
    }

    /* renamed from: a */
    public void mo17510a(C1836a<T> aVar) {
        synchronized (this.f23439c) {
            if (this.f23440d.add(aVar)) {
                if (this.f23440d.size() == 1) {
                    this.f23441e = mo17502b();
                    C6094j.m35717c().mo20921a(f23436f, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f23441e}), new Throwable[0]);
                    mo17507e();
                }
                aVar.mo7015a(this.f23441e);
            }
        }
    }

    /* renamed from: b */
    public abstract T mo17502b();

    /* renamed from: c */
    public void mo17511c(C1836a<T> aVar) {
        synchronized (this.f23439c) {
            if (this.f23440d.remove(aVar) && this.f23440d.isEmpty()) {
                mo17508f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17512d(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f23439c
            monitor-enter(r0)
            T r1 = r3.f23441e     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f23441e = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.Set<c1.a<T>> r1 = r3.f23440d     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            i1.a r1 = r3.f23437a     // Catch:{ all -> 0x002b }
            java.util.concurrent.Executor r1 = r1.mo18321a()     // Catch:{ all -> 0x002b }
            e1.d$a r2 = new e1.d$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e1.C4176d.mo17512d(java.lang.Object):void");
    }

    /* renamed from: e */
    public abstract void mo17507e();

    /* renamed from: f */
    public abstract void mo17508f();
}
