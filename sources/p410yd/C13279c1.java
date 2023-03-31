package p410yd;

import java.util.concurrent.locks.LockSupport;
import p410yd.C13270b1;

/* renamed from: yd.c1 */
/* compiled from: EventLoop.kt */
public abstract class C13279c1 extends C13266a1 {
    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public abstract Thread mo38411i0();

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public void mo38412k0(long j, C13270b1.C13271a aVar) {
        C13336p0.f47658g.mo38397M0(j, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public final void mo38413r0() {
        Thread i0 = mo38411i0();
        if (Thread.currentThread() != i0) {
            C13274c.m62170a();
            LockSupport.unpark(i0);
        }
    }
}
