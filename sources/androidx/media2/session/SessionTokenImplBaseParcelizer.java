package androidx.media2.session;

import android.content.ComponentName;
import androidx.versionedparcelable.C1506a;

public final class SessionTokenImplBaseParcelizer {
    public static SessionTokenImplBase read(C1506a aVar) {
        SessionTokenImplBase sessionTokenImplBase = new SessionTokenImplBase();
        sessionTokenImplBase.f3640a = aVar.mo5983v(sessionTokenImplBase.f3640a, 1);
        sessionTokenImplBase.f3641b = aVar.mo5983v(sessionTokenImplBase.f3641b, 2);
        sessionTokenImplBase.f3642c = aVar.mo5935E(sessionTokenImplBase.f3642c, 3);
        sessionTokenImplBase.f3643d = aVar.mo5935E(sessionTokenImplBase.f3643d, 4);
        sessionTokenImplBase.f3644e = aVar.mo5937G(sessionTokenImplBase.f3644e, 5);
        sessionTokenImplBase.f3645f = (ComponentName) aVar.mo5931A(sessionTokenImplBase.f3645f, 6);
        sessionTokenImplBase.f3646g = aVar.mo5970k(sessionTokenImplBase.f3646g, 7);
        return sessionTokenImplBase;
    }

    public static void write(SessionTokenImplBase sessionTokenImplBase, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5953Y(sessionTokenImplBase.f3640a, 1);
        aVar.mo5953Y(sessionTokenImplBase.f3641b, 2);
        aVar.mo5965h0(sessionTokenImplBase.f3642c, 3);
        aVar.mo5965h0(sessionTokenImplBase.f3643d, 4);
        aVar.mo5969j0(sessionTokenImplBase.f3644e, 5);
        aVar.mo5960d0(sessionTokenImplBase.f3645f, 6);
        aVar.mo5945O(sessionTokenImplBase.f3646g, 7);
    }
}
