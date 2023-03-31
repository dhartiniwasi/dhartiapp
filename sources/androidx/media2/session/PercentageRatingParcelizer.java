package androidx.media2.session;

import androidx.versionedparcelable.C1506a;

public final class PercentageRatingParcelizer {
    public static PercentageRating read(C1506a aVar) {
        PercentageRating percentageRating = new PercentageRating();
        percentageRating.f3624a = aVar.mo5980s(percentageRating.f3624a, 1);
        return percentageRating;
    }

    public static void write(PercentageRating percentageRating, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5951W(percentageRating.f3624a, 1);
    }
}
