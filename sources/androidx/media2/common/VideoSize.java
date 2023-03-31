package androidx.media2.common;

import p152v0.C5755b;

public class VideoSize implements C5755b {

    /* renamed from: a */
    int f3567a;

    /* renamed from: b */
    int f3568b;

    VideoSize() {
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        if (this.f3567a == videoSize.f3567a && this.f3568b == videoSize.f3568b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f3568b;
        int i2 = this.f3567a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f3567a + "x" + this.f3568b;
    }
}
