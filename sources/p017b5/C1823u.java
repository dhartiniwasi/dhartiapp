package p017b5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: b5.u */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C1823u extends BroadcastReceiver {

    /* renamed from: a */
    Context f5369a;

    /* renamed from: b */
    private final C1822t f5370b;

    public C1823u(C1822t tVar) {
        this.f5370b = tVar;
    }

    /* renamed from: a */
    public final void mo6994a(Context context) {
        this.f5369a = context;
    }

    /* renamed from: b */
    public final synchronized void mo6995b() {
        Context context = this.f5369a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f5369a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f5370b.mo6993a();
            mo6995b();
        }
    }
}
