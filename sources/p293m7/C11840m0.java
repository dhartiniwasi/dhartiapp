package p293m7;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.C2069a;
import com.google.android.gms.internal.p026firebaseauthapi.C3784tv;
import p246h7.C10412f;

/* renamed from: m7.m0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11840m0 {

    /* renamed from: a */
    private volatile int f44535a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11848p f44536b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f44537c = false;

    public C11840m0(C10412f fVar) {
        Context m = fVar.mo33469m();
        C11848p pVar = new C11848p(fVar);
        this.f44536b = pVar;
        C2069a.m9142c((Application) m.getApplicationContext());
        C2069a.m9141b().mo8009a(new C11837l0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final boolean m57270g() {
        return this.f44535a > 0 && !this.f44537c;
    }

    /* renamed from: c */
    public final void mo36077c() {
        this.f44536b.mo36097b();
    }

    /* renamed from: d */
    public final void mo36078d(int i) {
        if (i > 0 && this.f44535a == 0) {
            this.f44535a = i;
            if (m57270g()) {
                this.f44536b.mo36098c();
            }
        } else if (i == 0 && this.f44535a != 0) {
            this.f44536b.mo36097b();
        }
        this.f44535a = i;
    }

    /* renamed from: e */
    public final void mo36079e(C3784tv tvVar) {
        if (tvVar != null) {
            long d = tvVar.mo16840d();
            if (d <= 0) {
                d = 3600;
            }
            long e = tvVar.mo16841e();
            C11848p pVar = this.f44536b;
            pVar.f44559b = e + (d * 1000);
            pVar.f44560c = -1;
            if (m57270g()) {
                this.f44536b.mo36098c();
            }
        }
    }
}
