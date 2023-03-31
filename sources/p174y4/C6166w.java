package p174y4;

import android.os.Bundle;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;

/* renamed from: y4.w */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class C6166w extends C6164u<Bundle> {
    C6166w(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21039a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(JsonStorageKeyNames.DATA_KEY);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo21042d(bundle2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo21040b() {
        return false;
    }
}
