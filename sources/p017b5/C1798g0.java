package p017b5;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p033d5.C4095d;
import p033d5.C4141r;
import p033d5.C4148t0;
import p180z4.C6362b;
import p189b6.C6606a;
import p189b6.C6610e;
import p189b6.C6611f;
import p198c6.C6755d;
import p198c6.C6763l;

/* renamed from: b5.g0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C1798g0 extends C6755d implements GoogleApiClient.C2049b, GoogleApiClient.C2050c {

    /* renamed from: h */
    private static final C2051a.C2052a<? extends C6611f, C6606a> f5335h = C6610e.f31073c;

    /* renamed from: a */
    private final Context f5336a;

    /* renamed from: b */
    private final Handler f5337b;

    /* renamed from: c */
    private final C2051a.C2052a<? extends C6611f, C6606a> f5338c;

    /* renamed from: d */
    private final Set<Scope> f5339d;

    /* renamed from: e */
    private final C4095d f5340e;

    /* renamed from: f */
    private C6611f f5341f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1796f0 f5342g;

    public C1798g0(Context context, Handler handler, C4095d dVar) {
        C2051a.C2052a<? extends C6611f, C6606a> aVar = f5335h;
        this.f5336a = context;
        this.f5337b = handler;
        this.f5340e = (C4095d) C4141r.m28222l(dVar, "ClientSettings must not be null");
        this.f5339d = dVar.mo17363e();
        this.f5338c = aVar;
    }

    /* renamed from: r6 */
    static /* bridge */ /* synthetic */ void m8457r6(C1798g0 g0Var, C6763l lVar) {
        C6362b I1 = lVar.mo22682I1();
        if (I1.mo21755M1()) {
            C4148t0 t0Var = (C4148t0) C4141r.m28221k(lVar.mo22683J1());
            C6362b I12 = t0Var.mo17469I1();
            if (!I12.mo21755M1()) {
                String valueOf = String.valueOf(I12);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                g0Var.f5342g.mo6952a(I12);
                g0Var.f5341f.mo6935e();
                return;
            }
            g0Var.f5342g.mo6953b(t0Var.mo17470J1(), g0Var.f5339d);
        } else {
            g0Var.f5342g.mo6952a(I1);
        }
        g0Var.f5341f.mo6935e();
    }

    /* renamed from: B0 */
    public final void mo6954B0(C6362b bVar) {
        this.f5342g.mo6952a(bVar);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [b6.f, com.google.android.gms.common.api.a$f] */
    /* renamed from: H6 */
    public final void mo6955H6(C1796f0 f0Var) {
        C6611f fVar = this.f5341f;
        if (fVar != null) {
            fVar.mo6935e();
        }
        this.f5340e.mo17368j(Integer.valueOf(System.identityHashCode(this)));
        C2051a.C2052a aVar = this.f5338c;
        Context context = this.f5336a;
        Looper looper = this.f5337b.getLooper();
        C4095d dVar = this.f5340e;
        this.f5341f = aVar.mo7964d(context, looper, dVar, dVar.mo17364f(), this, this);
        this.f5342g = f0Var;
        Set<Scope> set = this.f5339d;
        if (set == null || set.isEmpty()) {
            this.f5337b.post(new C1792d0(this));
        } else {
            this.f5341f.mo22243t();
        }
    }

    /* renamed from: I6 */
    public final void mo6956I6() {
        C6611f fVar = this.f5341f;
        if (fVar != null) {
            fVar.mo6935e();
        }
    }

    /* renamed from: P0 */
    public final void mo6918P0(Bundle bundle) {
        this.f5341f.mo22242q(this);
    }

    /* renamed from: p */
    public final void mo6919p(int i) {
        this.f5341f.mo6935e();
    }

    /* renamed from: q4 */
    public final void mo6957q4(C6763l lVar) {
        this.f5337b.post(new C1794e0(this, lVar));
    }
}
