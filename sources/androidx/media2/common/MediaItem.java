package androidx.media2.common;

import androidx.core.util.C0827d;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class MediaItem extends CustomVersionedParcelable {

    /* renamed from: a */
    private final Object f3540a;

    /* renamed from: b */
    MediaMetadata f3541b;

    /* renamed from: c */
    long f3542c;

    /* renamed from: d */
    long f3543d;

    /* renamed from: e */
    private final List<C0827d<Object, Executor>> f3544e;

    /* renamed from: androidx.media2.common.MediaItem$a */
    public static class C1313a {

        /* renamed from: a */
        MediaMetadata f3545a;

        /* renamed from: b */
        long f3546b = 0;

        /* renamed from: c */
        long f3547c = 576460752303423487L;

        /* renamed from: a */
        public MediaItem mo4635a() {
            return new MediaItem(this);
        }

        /* renamed from: b */
        public C1313a mo4636b(long j) {
            if (j < 0) {
                j = 576460752303423487L;
            }
            this.f3547c = j;
            return this;
        }

        /* renamed from: c */
        public C1313a mo4637c(MediaMetadata mediaMetadata) {
            this.f3545a = mediaMetadata;
            return this;
        }

        /* renamed from: d */
        public C1313a mo4638d(long j) {
            if (j < 0) {
                j = 0;
            }
            this.f3546b = j;
            return this;
        }
    }

    MediaItem() {
        this.f3540a = new Object();
        this.f3542c = 0;
        this.f3543d = 576460752303423487L;
        this.f3544e = new ArrayList();
    }

    /* renamed from: d */
    public void mo3058d(boolean z) {
        if (getClass() == MediaItem.class) {
            super.mo3058d(z);
            return;
        }
        throw new RuntimeException("MediaItem's subclasses shouldn't be parcelized.");
    }

    /* renamed from: e */
    public long mo4630e() {
        return this.f3543d;
    }

    /* renamed from: f */
    public String mo4631f() {
        String g;
        synchronized (this.f3540a) {
            MediaMetadata mediaMetadata = this.f3541b;
            g = mediaMetadata != null ? mediaMetadata.mo4641g("android.media.metadata.MEDIA_ID") : null;
        }
        return g;
    }

    /* renamed from: g */
    public MediaMetadata mo4632g() {
        MediaMetadata mediaMetadata;
        synchronized (this.f3540a) {
            mediaMetadata = this.f3541b;
        }
        return mediaMetadata;
    }

    /* renamed from: h */
    public long mo4633h() {
        return this.f3542c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        synchronized (this.f3540a) {
            sb.append("{Media Id=");
            sb.append(mo4631f());
            sb.append(", mMetadata=");
            sb.append(this.f3541b);
            sb.append(", mStartPositionMs=");
            sb.append(this.f3542c);
            sb.append(", mEndPositionMs=");
            sb.append(this.f3543d);
            sb.append('}');
        }
        return sb.toString();
    }

    MediaItem(C1313a aVar) {
        this(aVar.f3545a, aVar.f3546b, aVar.f3547c);
    }

    MediaItem(MediaItem mediaItem) {
        this(mediaItem.f3541b, mediaItem.f3542c, mediaItem.f3543d);
    }

    MediaItem(MediaMetadata mediaMetadata, long j, long j2) {
        this.f3540a = new Object();
        this.f3542c = 0;
        this.f3543d = 576460752303423487L;
        this.f3544e = new ArrayList();
        if (j <= j2) {
            if (mediaMetadata != null && mediaMetadata.mo4639e("android.media.metadata.DURATION")) {
                long f = mediaMetadata.mo4640f("android.media.metadata.DURATION");
                if (!(f == Long.MIN_VALUE || j2 == 576460752303423487L || j2 <= f)) {
                    throw new IllegalStateException("endPositionMs shouldn't be greater than duration in the metdata, endPositionMs=" + j2 + ", durationMs=" + f);
                }
            }
            this.f3541b = mediaMetadata;
            this.f3542c = j;
            this.f3543d = j2;
            return;
        }
        throw new IllegalStateException("Illegal start/end position: " + j + " : " + j2);
    }
}
