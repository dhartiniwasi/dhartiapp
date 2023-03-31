package androidx.media2.common;

import androidx.versionedparcelable.C1506a;

public final class MediaMetadataParcelizer {
    public static MediaMetadata read(C1506a aVar) {
        MediaMetadata mediaMetadata = new MediaMetadata();
        mediaMetadata.f3550b = aVar.mo5970k(mediaMetadata.f3550b, 1);
        mediaMetadata.f3551c = (ParcelImplListSlice) aVar.mo5931A(mediaMetadata.f3551c, 2);
        mediaMetadata.mo3057c();
        return mediaMetadata;
    }

    public static void write(MediaMetadata mediaMetadata, C1506a aVar) {
        aVar.mo5941K(false, false);
        mediaMetadata.mo3058d(aVar.mo5962g());
        aVar.mo5945O(mediaMetadata.f3550b, 1);
        aVar.mo5960d0(mediaMetadata.f3551c, 2);
    }
}
