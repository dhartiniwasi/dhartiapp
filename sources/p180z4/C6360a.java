package p180z4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p033d5.C4141r;

/* renamed from: z4.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C6360a implements ServiceConnection {

    /* renamed from: a */
    boolean f30574a = false;

    /* renamed from: b */
    private final BlockingQueue f30575b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo21748a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C4141r.m28220j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f30574a) {
            this.f30574a = true;
            IBinder iBinder = (IBinder) this.f30575b.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f30575b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
