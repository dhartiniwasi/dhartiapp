package androidx.media2.session;

import androidx.versionedparcelable.C1506a;

public final class ThumbRatingParcelizer {
    public static ThumbRating read(C1506a aVar) {
        ThumbRating thumbRating = new ThumbRating();
        thumbRating.f3656a = aVar.mo5966i(thumbRating.f3656a, 1);
        thumbRating.f3657b = aVar.mo5966i(thumbRating.f3657b, 2);
        return thumbRating;
    }

    public static void write(ThumbRating thumbRating, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5943M(thumbRating.f3656a, 1);
        aVar.mo5943M(thumbRating.f3657b, 2);
    }
}
