package kotlinx.coroutines.scheduling;

import p272jd.C11570g;
import p410yd.C13298g1;

/* renamed from: kotlinx.coroutines.scheduling.f */
/* compiled from: Dispatcher.kt */
public class C11745f extends C13298g1 {

    /* renamed from: c */
    private final int f44353c;

    /* renamed from: d */
    private final int f44354d;

    /* renamed from: e */
    private final long f44355e;

    /* renamed from: f */
    private final String f44356f;

    /* renamed from: g */
    private C11736a f44357g = m57034L();

    public C11745f(int i, int i2, long j, String str) {
        this.f44353c = i;
        this.f44354d = i2;
        this.f44355e = j;
        this.f44356f = str;
    }

    /* renamed from: L */
    private final C11736a m57034L() {
        return new C11736a(this.f44353c, this.f44354d, this.f44355e, this.f44356f);
    }

    /* renamed from: H */
    public void mo35925H(C11570g gVar, Runnable runnable) {
        C11736a.m57000n(this.f44357g, runnable, (C11748i) null, false, 6, (Object) null);
    }

    /* renamed from: Q */
    public final void mo35984Q(Runnable runnable, C11748i iVar, boolean z) {
        this.f44357g.mo35967m(runnable, iVar, z);
    }
}
