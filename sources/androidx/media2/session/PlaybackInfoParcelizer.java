package androidx.media2.session;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.C1506a;

public final class PlaybackInfoParcelizer {
    public static MediaController$PlaybackInfo read(C1506a aVar) {
        MediaController$PlaybackInfo mediaController$PlaybackInfo = new MediaController$PlaybackInfo();
        mediaController$PlaybackInfo.f3610a = aVar.mo5983v(mediaController$PlaybackInfo.f3610a, 1);
        mediaController$PlaybackInfo.f3611b = aVar.mo5983v(mediaController$PlaybackInfo.f3611b, 2);
        mediaController$PlaybackInfo.f3612c = aVar.mo5983v(mediaController$PlaybackInfo.f3612c, 3);
        mediaController$PlaybackInfo.f3613d = aVar.mo5983v(mediaController$PlaybackInfo.f3613d, 4);
        mediaController$PlaybackInfo.f3614e = (AudioAttributesCompat) aVar.mo5939I(mediaController$PlaybackInfo.f3614e, 5);
        return mediaController$PlaybackInfo;
    }

    public static void write(MediaController$PlaybackInfo mediaController$PlaybackInfo, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5953Y(mediaController$PlaybackInfo.f3610a, 1);
        aVar.mo5953Y(mediaController$PlaybackInfo.f3611b, 2);
        aVar.mo5953Y(mediaController$PlaybackInfo.f3612c, 3);
        aVar.mo5953Y(mediaController$PlaybackInfo.f3613d, 4);
        aVar.mo5975m0(mediaController$PlaybackInfo.f3614e, 5);
    }
}
