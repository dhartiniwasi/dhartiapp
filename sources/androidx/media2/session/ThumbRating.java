package androidx.media2.session;

import androidx.core.util.C0825c;
import androidx.media2.common.Rating;

public final class ThumbRating implements Rating {

    /* renamed from: a */
    boolean f3656a = false;

    /* renamed from: b */
    boolean f3657b;

    public boolean equals(Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        if (this.f3657b == thumbRating.f3657b && this.f3656a == thumbRating.f3656a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C0825c.m3643b(Boolean.valueOf(this.f3656a), Boolean.valueOf(this.f3657b));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ThumbRating: ");
        if (this.f3656a) {
            str = "isThumbUp=" + this.f3657b;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}
