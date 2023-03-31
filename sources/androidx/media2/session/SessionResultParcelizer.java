package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.versionedparcelable.C1506a;

public final class SessionResultParcelizer {
    public static SessionResult read(C1506a aVar) {
        SessionResult sessionResult = new SessionResult();
        sessionResult.f3634a = aVar.mo5983v(sessionResult.f3634a, 1);
        sessionResult.f3635b = aVar.mo5986y(sessionResult.f3635b, 2);
        sessionResult.f3636c = aVar.mo5970k(sessionResult.f3636c, 3);
        sessionResult.f3638e = (MediaItem) aVar.mo5939I(sessionResult.f3638e, 4);
        sessionResult.mo3057c();
        return sessionResult;
    }

    public static void write(SessionResult sessionResult, C1506a aVar) {
        aVar.mo5941K(false, false);
        sessionResult.mo3058d(aVar.mo5962g());
        aVar.mo5953Y(sessionResult.f3634a, 1);
        aVar.mo5958b0(sessionResult.f3635b, 2);
        aVar.mo5945O(sessionResult.f3636c, 3);
        aVar.mo5975m0(sessionResult.f3638e, 4);
    }
}
