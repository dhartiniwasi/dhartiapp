package p174y4;

import android.os.Bundle;
import android.util.Log;
import p218e6.C9977j;

/* renamed from: y4.u */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
abstract class C6164u<T> {

    /* renamed from: a */
    final int f29617a;

    /* renamed from: b */
    final C9977j<T> f29618b = new C9977j<>();

    /* renamed from: c */
    final int f29619c;

    /* renamed from: d */
    final Bundle f29620d;

    C6164u(int i, int i2, Bundle bundle) {
        this.f29617a = i;
        this.f29619c = i2;
        this.f29620d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo21039a(Bundle bundle);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo21040b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo21041c(C6165v vVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(vVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f29618b.mo32543b(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo21042d(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f29618b.mo32544c(t);
    }

    public final String toString() {
        int i = this.f29619c;
        int i2 = this.f29617a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(mo21040b());
        sb.append("}");
        return sb.toString();
    }
}
