package p073j4;

import p053g4.C4409t;

/* renamed from: j4.b1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4750b1 {

    /* renamed from: a */
    private long f25400a;

    /* renamed from: b */
    private long f25401b = Long.MIN_VALUE;

    /* renamed from: c */
    private final Object f25402c = new Object();

    public C4750b1(long j) {
        this.f25400a = j;
    }

    /* renamed from: a */
    public final void mo18429a(long j) {
        synchronized (this.f25402c) {
            this.f25400a = j;
        }
    }

    /* renamed from: b */
    public final boolean mo18430b() {
        synchronized (this.f25402c) {
            long b = C4409t.m29310b().mo18371b();
            if (this.f25401b + this.f25400a > b) {
                return false;
            }
            this.f25401b = b;
            return true;
        }
    }
}
