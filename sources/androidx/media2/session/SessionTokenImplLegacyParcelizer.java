package androidx.media2.session;

import android.content.ComponentName;
import androidx.versionedparcelable.C1506a;

public final class SessionTokenImplLegacyParcelizer {
    public static SessionTokenImplLegacy read(C1506a aVar) {
        SessionTokenImplLegacy sessionTokenImplLegacy = new SessionTokenImplLegacy();
        sessionTokenImplLegacy.f3648b = aVar.mo5970k(sessionTokenImplLegacy.f3648b, 1);
        sessionTokenImplLegacy.f3649c = aVar.mo5983v(sessionTokenImplLegacy.f3649c, 2);
        sessionTokenImplLegacy.f3650d = aVar.mo5983v(sessionTokenImplLegacy.f3650d, 3);
        sessionTokenImplLegacy.f3651e = (ComponentName) aVar.mo5931A(sessionTokenImplLegacy.f3651e, 4);
        sessionTokenImplLegacy.f3652f = aVar.mo5935E(sessionTokenImplLegacy.f3652f, 5);
        sessionTokenImplLegacy.f3653g = aVar.mo5970k(sessionTokenImplLegacy.f3653g, 6);
        sessionTokenImplLegacy.mo3057c();
        return sessionTokenImplLegacy;
    }

    public static void write(SessionTokenImplLegacy sessionTokenImplLegacy, C1506a aVar) {
        aVar.mo5941K(false, false);
        sessionTokenImplLegacy.mo3058d(aVar.mo5962g());
        aVar.mo5945O(sessionTokenImplLegacy.f3648b, 1);
        aVar.mo5953Y(sessionTokenImplLegacy.f3649c, 2);
        aVar.mo5953Y(sessionTokenImplLegacy.f3650d, 3);
        aVar.mo5960d0(sessionTokenImplLegacy.f3651e, 4);
        aVar.mo5965h0(sessionTokenImplLegacy.f3652f, 5);
        aVar.mo5945O(sessionTokenImplLegacy.f3653g, 6);
    }
}
