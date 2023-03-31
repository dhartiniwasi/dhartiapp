package androidx.media2.session;

import android.os.Bundle;
import android.os.ResultReceiver;

class MediaControllerImplLegacy$2 extends ResultReceiver {
    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        new SessionResult(i, bundle);
        throw null;
    }
}
