package p410yd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: yd.o */
/* compiled from: CompletionState.kt */
public final class C13332o extends C13355v {

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f47655c = AtomicIntegerFieldUpdater.newUpdater(C13332o.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13332o(p272jd.C11565d<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x001d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L_0x001d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p410yd.C13332o.<init>(jd.d, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean mo38465c() {
        return f47655c.compareAndSet(this, 0, 1);
    }
}
