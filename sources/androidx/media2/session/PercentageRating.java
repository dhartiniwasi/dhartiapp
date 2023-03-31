package androidx.media2.session;

import androidx.core.util.C0825c;
import androidx.media2.common.Rating;

public final class PercentageRating implements Rating {

    /* renamed from: a */
    float f3624a = -1.0f;

    /* renamed from: c */
    public boolean mo4669c() {
        return this.f3624a != -1.0f;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof PercentageRating) && this.f3624a == ((PercentageRating) obj).f3624a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C0825c.m3643b(Float.valueOf(this.f3624a));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("PercentageRating: ");
        if (mo4669c()) {
            str = "percentage=" + this.f3624a;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}
