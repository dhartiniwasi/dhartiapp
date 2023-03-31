package p033d5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: d5.h1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4110h1 implements ServiceConnection {

    /* renamed from: a */
    private final int f23329a;

    /* renamed from: b */
    final /* synthetic */ C4087c f23330b;

    public C4110h1(C4087c cVar, int i) {
        this.f23330b = cVar;
        this.f23329a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C4124m mVar;
        C4087c cVar = this.f23330b;
        if (iBinder == null) {
            C4087c.m28040h0(cVar, 16);
            return;
        }
        synchronized (cVar.f23263v) {
            C4087c cVar2 = this.f23330b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C4124m)) {
                mVar = new C4160x0(iBinder);
            } else {
                mVar = (C4124m) queryLocalInterface;
            }
            cVar2.f23264w = mVar;
        }
        this.f23330b.mo17348i0(0, (Bundle) null, this.f23329a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f23330b.f23263v) {
            this.f23330b.f23264w = null;
        }
        Handler handler = this.f23330b.f23261t;
        handler.sendMessage(handler.obtainMessage(6, this.f23329a, 1));
    }
}
