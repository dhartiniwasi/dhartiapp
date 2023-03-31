package androidx.media2.session;

import androidx.versionedparcelable.C1506a;

public final class CommandButtonParcelizer {
    public static MediaSession$CommandButton read(C1506a aVar) {
        MediaSession$CommandButton mediaSession$CommandButton = new MediaSession$CommandButton();
        mediaSession$CommandButton.f3619a = (SessionCommand) aVar.mo5939I(mediaSession$CommandButton.f3619a, 1);
        mediaSession$CommandButton.f3620b = aVar.mo5983v(mediaSession$CommandButton.f3620b, 2);
        mediaSession$CommandButton.f3621c = aVar.mo5977o(mediaSession$CommandButton.f3621c, 3);
        mediaSession$CommandButton.f3622d = aVar.mo5970k(mediaSession$CommandButton.f3622d, 4);
        mediaSession$CommandButton.f3623e = aVar.mo5966i(mediaSession$CommandButton.f3623e, 5);
        return mediaSession$CommandButton;
    }

    public static void write(MediaSession$CommandButton mediaSession$CommandButton, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5975m0(mediaSession$CommandButton.f3619a, 1);
        aVar.mo5953Y(mediaSession$CommandButton.f3620b, 2);
        aVar.mo5949S(mediaSession$CommandButton.f3621c, 3);
        aVar.mo5945O(mediaSession$CommandButton.f3622d, 4);
        aVar.mo5943M(mediaSession$CommandButton.f3623e, 5);
    }
}
