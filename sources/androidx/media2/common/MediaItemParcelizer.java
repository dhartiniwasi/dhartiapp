package androidx.media2.common;

import androidx.versionedparcelable.C1506a;

public final class MediaItemParcelizer {
    public static MediaItem read(C1506a aVar) {
        MediaItem mediaItem = new MediaItem();
        mediaItem.f3541b = (MediaMetadata) aVar.mo5939I(mediaItem.f3541b, 1);
        mediaItem.f3542c = aVar.mo5986y(mediaItem.f3542c, 2);
        mediaItem.f3543d = aVar.mo5986y(mediaItem.f3543d, 3);
        mediaItem.mo3057c();
        return mediaItem;
    }

    public static void write(MediaItem mediaItem, C1506a aVar) {
        aVar.mo5941K(false, false);
        mediaItem.mo3058d(aVar.mo5962g());
        aVar.mo5975m0(mediaItem.f3541b, 1);
        aVar.mo5958b0(mediaItem.f3542c, 2);
        aVar.mo5958b0(mediaItem.f3543d, 3);
    }
}
