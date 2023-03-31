package androidx.media2.session;

import androidx.core.util.C0825c;
import androidx.media2.common.Rating;

public final class StarRating implements Rating {

    /* renamed from: a */
    int f3654a;

    /* renamed from: b */
    float f3655b;

    StarRating() {
    }

    /* renamed from: c */
    public boolean mo4686c() {
        return this.f3655b >= 0.0f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        if (this.f3654a == starRating.f3654a && this.f3655b == starRating.f3655b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C0825c.m3643b(Integer.valueOf(this.f3654a), Float.valueOf(this.f3655b));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("StarRating: maxStars=");
        sb.append(this.f3654a);
        if (mo4686c()) {
            str = ", starRating=" + this.f3655b;
        } else {
            str = ", unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}
