package androidx.media2.common;

import androidx.versionedparcelable.ParcelImpl;
import p152v0.C5754a;
import p152v0.C5755b;

public class MediaParcelUtils {

    private static class MediaItemParcelImpl extends ParcelImpl {

        /* renamed from: b */
        private final MediaItem f3554b;

        MediaItemParcelImpl(MediaItem mediaItem) {
            super((C5755b) new MediaItem(mediaItem));
            this.f3554b = mediaItem;
        }

        /* renamed from: b */
        public MediaItem mo4645a() {
            return this.f3554b;
        }
    }

    /* renamed from: a */
    public static <T extends C5755b> T m5714a(ParcelImpl parcelImpl) {
        return C5754a.m34336a(parcelImpl);
    }

    /* renamed from: b */
    public static ParcelImpl m5715b(C5755b bVar) {
        if (bVar instanceof MediaItem) {
            return new MediaItemParcelImpl((MediaItem) bVar);
        }
        return (ParcelImpl) C5754a.m34339d(bVar);
    }
}
