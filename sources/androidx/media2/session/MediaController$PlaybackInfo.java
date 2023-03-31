package androidx.media2.session;

import androidx.core.util.C0825c;
import androidx.media.AudioAttributesCompat;
import p152v0.C5755b;

public final class MediaController$PlaybackInfo implements C5755b {

    /* renamed from: a */
    int f3610a;

    /* renamed from: b */
    int f3611b;

    /* renamed from: c */
    int f3612c;

    /* renamed from: d */
    int f3613d;

    /* renamed from: e */
    AudioAttributesCompat f3614e;

    MediaController$PlaybackInfo() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaController$PlaybackInfo)) {
            return false;
        }
        MediaController$PlaybackInfo mediaController$PlaybackInfo = (MediaController$PlaybackInfo) obj;
        if (this.f3610a == mediaController$PlaybackInfo.f3610a && this.f3611b == mediaController$PlaybackInfo.f3611b && this.f3612c == mediaController$PlaybackInfo.f3612c && this.f3613d == mediaController$PlaybackInfo.f3613d && C0825c.m3642a(this.f3614e, mediaController$PlaybackInfo.f3614e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C0825c.m3643b(Integer.valueOf(this.f3610a), Integer.valueOf(this.f3611b), Integer.valueOf(this.f3612c), Integer.valueOf(this.f3613d), this.f3614e);
    }
}
