package p174y4;

import android.util.Log;
import java.io.IOException;
import p218e6.C9977j;

/* renamed from: y4.d0 */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class C6146d0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9977j f29591a;

    public /* synthetic */ C6146d0(C9977j jVar) {
        this.f29591a = jVar;
    }

    public final void run() {
        if (this.f29591a.mo32545d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
