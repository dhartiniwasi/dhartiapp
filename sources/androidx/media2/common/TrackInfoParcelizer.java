package androidx.media2.common;

import androidx.versionedparcelable.C1506a;

public final class TrackInfoParcelizer {
    public static SessionPlayer$TrackInfo read(C1506a aVar) {
        SessionPlayer$TrackInfo sessionPlayer$TrackInfo = new SessionPlayer$TrackInfo();
        sessionPlayer$TrackInfo.f3558a = aVar.mo5983v(sessionPlayer$TrackInfo.f3558a, 1);
        sessionPlayer$TrackInfo.f3559b = aVar.mo5983v(sessionPlayer$TrackInfo.f3559b, 3);
        sessionPlayer$TrackInfo.f3562e = aVar.mo5970k(sessionPlayer$TrackInfo.f3562e, 4);
        sessionPlayer$TrackInfo.mo3057c();
        return sessionPlayer$TrackInfo;
    }

    public static void write(SessionPlayer$TrackInfo sessionPlayer$TrackInfo, C1506a aVar) {
        aVar.mo5941K(false, false);
        sessionPlayer$TrackInfo.mo3058d(aVar.mo5962g());
        aVar.mo5953Y(sessionPlayer$TrackInfo.f3558a, 1);
        aVar.mo5953Y(sessionPlayer$TrackInfo.f3559b, 3);
        aVar.mo5945O(sessionPlayer$TrackInfo.f3562e, 4);
    }
}
