package p293m7;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.p026firebaseauthapi.C3434jb;
import p033d5.C4141r;
import p054g5.C4410a;
import p067i5.C4694h;
import p246h7.C10412f;

/* renamed from: m7.p */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11848p {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C4410a f44557h = new C4410a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a */
    private final C10412f f44558a;

    /* renamed from: b */
    volatile long f44559b;

    /* renamed from: c */
    volatile long f44560c;

    /* renamed from: d */
    final long f44561d = 300000;

    /* renamed from: e */
    final HandlerThread f44562e;

    /* renamed from: f */
    final Handler f44563f;

    /* renamed from: g */
    final Runnable f44564g;

    public C11848p(C10412f fVar) {
        f44557h.mo17934g("Initializing TokenRefresher", new Object[0]);
        C10412f fVar2 = (C10412f) C4141r.m28221k(fVar);
        this.f44558a = fVar2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f44562e = handlerThread;
        handlerThread.start();
        this.f44563f = new C3434jb(handlerThread.getLooper());
        this.f44564g = new C11845o(this, fVar2.mo33470q());
    }

    /* renamed from: b */
    public final void mo36097b() {
        this.f44563f.removeCallbacks(this.f44564g);
    }

    /* renamed from: c */
    public final void mo36098c() {
        C4410a aVar = f44557h;
        long j = this.f44559b;
        long j2 = this.f44561d;
        aVar.mo17934g("Scheduling refresh for " + (j - j2), new Object[0]);
        mo36097b();
        this.f44560c = Math.max((this.f44559b - C4694h.m30388d().mo18370a()) - this.f44561d, 0) / 1000;
        this.f44563f.postDelayed(this.f44564g, this.f44560c * 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo36099d() {
        long j;
        int i = (int) this.f44560c;
        if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
            long j2 = this.f44560c;
            j = j2 + j2;
        } else {
            j = i != 960 ? 30 : 960;
        }
        this.f44560c = j;
        this.f44559b = C4694h.m30388d().mo18370a() + (this.f44560c * 1000);
        C4410a aVar = f44557h;
        long j3 = this.f44559b;
        aVar.mo17934g("Scheduling refresh for " + j3, new Object[0]);
        this.f44563f.postDelayed(this.f44564g, this.f44560c * 1000);
    }
}
