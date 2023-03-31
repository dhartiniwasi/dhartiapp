package p017b5;

import android.os.Bundle;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.GoogleApiClient;
import p033d5.C4141r;
import p180z4.C6362b;

/* renamed from: b5.k0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C1806k0 implements GoogleApiClient.C2049b, GoogleApiClient.C2050c {

    /* renamed from: a */
    public final C2051a<?> f5348a;

    /* renamed from: b */
    private final boolean f5349b;

    /* renamed from: c */
    private C1808l0 f5350c;

    public C1806k0(C2051a<?> aVar, boolean z) {
        this.f5348a = aVar;
        this.f5349b = z;
    }

    /* renamed from: b */
    private final C1808l0 m8471b() {
        C4141r.m28222l(this.f5350c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f5350c;
    }

    /* renamed from: B0 */
    public final void mo6954B0(C6362b bVar) {
        m8471b().mo6969o3(bVar, this.f5348a, this.f5349b);
    }

    /* renamed from: P0 */
    public final void mo6918P0(Bundle bundle) {
        m8471b().mo6918P0(bundle);
    }

    /* renamed from: a */
    public final void mo6962a(C1808l0 l0Var) {
        this.f5350c = l0Var;
    }

    /* renamed from: p */
    public final void mo6919p(int i) {
        m8471b().mo6919p(i);
    }
}
