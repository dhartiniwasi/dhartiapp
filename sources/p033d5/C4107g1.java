package p033d5;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: d5.g1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4107g1 extends C4157w0 {

    /* renamed from: a */
    private C4087c f23321a;

    /* renamed from: b */
    private final int f23322b;

    public C4107g1(C4087c cVar, int i) {
        this.f23321a = cVar;
        this.f23322b = i;
    }

    /* renamed from: B2 */
    public final void mo17394B2(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    /* renamed from: F3 */
    public final void mo17395F3(int i, IBinder iBinder, Bundle bundle) {
        C4141r.m28222l(this.f23321a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f23321a.mo17332R(i, iBinder, bundle, this.f23322b);
        this.f23321a = null;
    }

    /* renamed from: z2 */
    public final void mo17396z2(int i, IBinder iBinder, C4120k1 k1Var) {
        C4087c cVar = this.f23321a;
        C4141r.m28222l(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C4141r.m28221k(k1Var);
        C4087c.m28039g0(cVar, k1Var);
        mo17395F3(i, iBinder, k1Var.f23346a);
    }
}
