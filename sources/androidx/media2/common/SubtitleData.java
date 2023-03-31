package androidx.media2.common;

import androidx.core.util.C0825c;
import java.util.Arrays;
import p152v0.C5755b;

public final class SubtitleData implements C5755b {

    /* renamed from: a */
    long f3564a;

    /* renamed from: b */
    long f3565b;

    /* renamed from: c */
    byte[] f3566c;

    SubtitleData() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SubtitleData.class != obj.getClass()) {
            return false;
        }
        SubtitleData subtitleData = (SubtitleData) obj;
        if (this.f3564a == subtitleData.f3564a && this.f3565b == subtitleData.f3565b && Arrays.equals(this.f3566c, subtitleData.f3566c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C0825c.m3643b(Long.valueOf(this.f3564a), Long.valueOf(this.f3565b), Integer.valueOf(Arrays.hashCode(this.f3566c)));
    }
}
