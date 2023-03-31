package androidx.media2.session;

import androidx.versionedparcelable.C1506a;

public final class StarRatingParcelizer {
    public static StarRating read(C1506a aVar) {
        StarRating starRating = new StarRating();
        starRating.f3654a = aVar.mo5983v(starRating.f3654a, 1);
        starRating.f3655b = aVar.mo5980s(starRating.f3655b, 2);
        return starRating;
    }

    public static void write(StarRating starRating, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5953Y(starRating.f3654a, 1);
        aVar.mo5951W(starRating.f3655b, 2);
    }
}
