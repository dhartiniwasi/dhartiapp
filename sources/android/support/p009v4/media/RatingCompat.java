package android.support.p009v4.media;

import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0181a();

    /* renamed from: a */
    private final int f408a;

    /* renamed from: b */
    private final float f409b;

    /* renamed from: c */
    private Object f410c;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    class C0181a implements Parcelable.Creator<RatingCompat> {
        C0181a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.RatingCompat$b */
    private static class C0182b {
        /* renamed from: a */
        static float m742a(Rating rating) {
            return rating.getPercentRating();
        }

        /* renamed from: b */
        static int m743b(Rating rating) {
            return rating.getRatingStyle();
        }

        /* renamed from: c */
        static float m744c(Rating rating) {
            return rating.getStarRating();
        }

        /* renamed from: d */
        static boolean m745d(Rating rating) {
            return rating.hasHeart();
        }

        /* renamed from: e */
        static boolean m746e(Rating rating) {
            return rating.isRated();
        }

        /* renamed from: f */
        static boolean m747f(Rating rating) {
            return rating.isThumbUp();
        }

        /* renamed from: g */
        static Rating m748g(boolean z) {
            return Rating.newHeartRating(z);
        }

        /* renamed from: h */
        static Rating m749h(float f) {
            return Rating.newPercentageRating(f);
        }

        /* renamed from: i */
        static Rating m750i(int i, float f) {
            return Rating.newStarRating(i, f);
        }

        /* renamed from: j */
        static Rating m751j(boolean z) {
            return Rating.newThumbRating(z);
        }

        /* renamed from: k */
        static Rating m752k(int i) {
            return Rating.newUnratedRating(i);
        }
    }

    RatingCompat(int i, float f) {
        this.f408a = i;
        this.f409b = f;
    }

    /* renamed from: a */
    public static RatingCompat m727a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null && Build.VERSION.SDK_INT >= 19) {
            Rating rating = (Rating) obj;
            int b = C0182b.m743b(rating);
            if (C0182b.m746e(rating)) {
                switch (b) {
                    case 1:
                        ratingCompat = m728i(C0182b.m745d(rating));
                        break;
                    case 2:
                        ratingCompat = m731l(C0182b.m747f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = m730k(b, C0182b.m744c(rating));
                        break;
                    case 6:
                        ratingCompat = m729j(C0182b.m742a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = m732m(b);
            }
            ratingCompat.f410c = obj;
        }
        return ratingCompat;
    }

    /* renamed from: i */
    public static RatingCompat m728i(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    /* renamed from: j */
    public static RatingCompat m729j(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    /* renamed from: k */
    public static RatingCompat m730k(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else if (i != 5) {
            Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
            return null;
        } else {
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new RatingCompat(i, f);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    /* renamed from: l */
    public static RatingCompat m731l(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    /* renamed from: m */
    public static RatingCompat m732m(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    /* renamed from: b */
    public float mo397b() {
        if (this.f408a != 6 || !mo403g()) {
            return -1.0f;
        }
        return this.f409b;
    }

    /* renamed from: c */
    public Object mo398c() {
        if (this.f410c == null && Build.VERSION.SDK_INT >= 19) {
            if (mo403g()) {
                int i = this.f408a;
                switch (i) {
                    case 1:
                        this.f410c = C0182b.m748g(mo402f());
                        break;
                    case 2:
                        this.f410c = C0182b.m751j(mo404h());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f410c = C0182b.m750i(i, mo401e());
                        break;
                    case 6:
                        this.f410c = C0182b.m749h(mo397b());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f410c = C0182b.m752k(this.f408a);
            }
        }
        return this.f410c;
    }

    /* renamed from: d */
    public int mo399d() {
        return this.f408a;
    }

    public int describeContents() {
        return this.f408a;
    }

    /* renamed from: e */
    public float mo401e() {
        int i = this.f408a;
        if ((i == 3 || i == 4 || i == 5) && mo403g()) {
            return this.f409b;
        }
        return -1.0f;
    }

    /* renamed from: f */
    public boolean mo402f() {
        if (this.f408a == 1 && this.f409b == 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo403g() {
        return this.f409b >= 0.0f;
    }

    /* renamed from: h */
    public boolean mo404h() {
        if (this.f408a == 2 && this.f409b == 1.0f) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f408a);
        sb.append(" rating=");
        float f = this.f409b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f408a);
        parcel.writeFloat(this.f409b);
    }
}
