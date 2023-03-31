package androidx.media2.session;

import androidx.versionedparcelable.C1506a;

public final class SessionCommandParcelizer {
    public static SessionCommand read(C1506a aVar) {
        SessionCommand sessionCommand = new SessionCommand();
        sessionCommand.f3630a = aVar.mo5983v(sessionCommand.f3630a, 1);
        sessionCommand.f3631b = aVar.mo5935E(sessionCommand.f3631b, 2);
        sessionCommand.f3632c = aVar.mo5970k(sessionCommand.f3632c, 3);
        return sessionCommand;
    }

    public static void write(SessionCommand sessionCommand, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5953Y(sessionCommand.f3630a, 1);
        aVar.mo5965h0(sessionCommand.f3631b, 2);
        aVar.mo5945O(sessionCommand.f3632c, 3);
    }
}
