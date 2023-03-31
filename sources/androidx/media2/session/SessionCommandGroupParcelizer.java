package androidx.media2.session;

import androidx.versionedparcelable.C1506a;

public final class SessionCommandGroupParcelizer {
    public static SessionCommandGroup read(C1506a aVar) {
        SessionCommandGroup sessionCommandGroup = new SessionCommandGroup();
        sessionCommandGroup.f3633a = aVar.mo5933C(sessionCommandGroup.f3633a, 1);
        return sessionCommandGroup;
    }

    public static void write(SessionCommandGroup sessionCommandGroup, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5961f0(sessionCommandGroup.f3633a, 1);
    }
}
