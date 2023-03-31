package p174y4;

import android.os.Bundle;

/* renamed from: y4.t */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class C6163t extends C6164u<Void> {
    C6163t(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21039a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo21042d(null);
        } else {
            mo21041c(new C6165v(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo21040b() {
        return true;
    }
}
