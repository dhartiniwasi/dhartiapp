package androidx.media2.session;

import androidx.core.util.C0825c;
import androidx.media2.common.Rating;

public final class HeartRating implements Rating {

    /* renamed from: a */
    boolean f3601a = false;

    /* renamed from: b */
    boolean f3602b;

    public boolean equals(Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        if (this.f3602b == heartRating.f3602b && this.f3601a == heartRating.f3601a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C0825c.m3643b(Boolean.valueOf(this.f3601a), Boolean.valueOf(this.f3602b));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HeartRating: ");
        if (this.f3601a) {
            str = "hasHeart=" + this.f3602b;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}
