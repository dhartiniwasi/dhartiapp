package androidx.media2.session;

import androidx.versionedparcelable.C1506a;

public final class HeartRatingParcelizer {
    public static HeartRating read(C1506a aVar) {
        HeartRating heartRating = new HeartRating();
        heartRating.f3601a = aVar.mo5966i(heartRating.f3601a, 1);
        heartRating.f3602b = aVar.mo5966i(heartRating.f3602b, 2);
        return heartRating;
    }

    public static void write(HeartRating heartRating, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5943M(heartRating.f3601a, 1);
        aVar.mo5943M(heartRating.f3602b, 2);
    }
}
