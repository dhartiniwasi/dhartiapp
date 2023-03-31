package androidx.media2.session;

import androidx.media2.session.SessionToken;
import androidx.versionedparcelable.C1506a;

public final class SessionTokenParcelizer {
    public static SessionToken read(C1506a aVar) {
        SessionToken sessionToken = new SessionToken();
        sessionToken.f3639a = (SessionToken.SessionTokenImpl) aVar.mo5939I(sessionToken.f3639a, 1);
        return sessionToken;
    }

    public static void write(SessionToken sessionToken, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5975m0(sessionToken.f3639a, 1);
    }
}
