package androidx.media2.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.media2.common.MediaItem;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class SessionResult extends CustomVersionedParcelable {

    /* renamed from: a */
    int f3634a;

    /* renamed from: b */
    long f3635b;

    /* renamed from: c */
    Bundle f3636c;

    /* renamed from: d */
    MediaItem f3637d;

    /* renamed from: e */
    MediaItem f3638e;

    public SessionResult(int i, Bundle bundle) {
        this(i, bundle, (MediaItem) null, SystemClock.elapsedRealtime());
    }

    /* renamed from: c */
    public void mo3057c() {
        this.f3637d = this.f3638e;
    }

    /* renamed from: d */
    public void mo3058d(boolean z) {
        MediaItem mediaItem = this.f3637d;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (this.f3638e == null) {
                    this.f3638e = C1319b.m5740c(this.f3637d);
                }
            }
        }
    }

    SessionResult() {
    }

    SessionResult(int i, Bundle bundle, MediaItem mediaItem, long j) {
        this.f3634a = i;
        this.f3636c = bundle;
        this.f3637d = mediaItem;
        this.f3635b = j;
    }
}
