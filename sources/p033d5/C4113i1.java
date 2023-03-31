package p033d5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p180z4.C6362b;

/* renamed from: d5.i1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4113i1 extends C4154v0 {

    /* renamed from: g */
    public final IBinder f23334g;

    /* renamed from: h */
    final /* synthetic */ C4087c f23335h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4113i1(C4087c cVar, int i, IBinder iBinder, Bundle bundle) {
        super(cVar, i, bundle);
        this.f23335h = cVar;
        this.f23334g = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo17407f(C6362b bVar) {
        if (this.f23335h.f23242D != null) {
            this.f23335h.f23242D.mo8940B0(bVar);
        }
        this.f23335h.mo17330P(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo17408g() {
        try {
            IBinder iBinder = this.f23334g;
            C4141r.m28221k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f23335h.mo9818I().equals(interfaceDescriptor)) {
                String I = this.f23335h.mo9818I();
                Log.w("GmsClient", "service descriptor mismatch: " + I + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface w = this.f23335h.mo9821w(this.f23334g);
            if (w == null || (!C4087c.m28042k0(this.f23335h, 2, 4, w) && !C4087c.m28042k0(this.f23335h, 3, 4, w))) {
                return false;
            }
            this.f23335h.f23246H = null;
            Bundle B = this.f23335h.mo17318B();
            C4087c cVar = this.f23335h;
            if (cVar.f23241C == null) {
                return true;
            }
            cVar.f23241C.mo8531P0(B);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
