package androidx.media2.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer$TrackInfo;
import androidx.media2.common.VideoSize;
import androidx.media2.session.C1316a;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.List;

class ConnectionResult extends CustomVersionedParcelable {

    /* renamed from: A */
    MediaMetadata f3573A;

    /* renamed from: B */
    int f3574B;

    /* renamed from: a */
    int f3575a;

    /* renamed from: b */
    C1316a f3576b;

    /* renamed from: c */
    IBinder f3577c;

    /* renamed from: d */
    PendingIntent f3578d;

    /* renamed from: e */
    int f3579e;

    /* renamed from: f */
    MediaItem f3580f;

    /* renamed from: g */
    MediaItem f3581g;

    /* renamed from: h */
    long f3582h;

    /* renamed from: i */
    long f3583i;

    /* renamed from: j */
    float f3584j;

    /* renamed from: k */
    long f3585k;

    /* renamed from: l */
    MediaController$PlaybackInfo f3586l;

    /* renamed from: m */
    int f3587m;

    /* renamed from: n */
    int f3588n;

    /* renamed from: o */
    ParcelImplListSlice f3589o;

    /* renamed from: p */
    SessionCommandGroup f3590p;

    /* renamed from: q */
    int f3591q;

    /* renamed from: r */
    int f3592r;

    /* renamed from: s */
    int f3593s;

    /* renamed from: t */
    Bundle f3594t;

    /* renamed from: u */
    VideoSize f3595u;

    /* renamed from: v */
    List<SessionPlayer$TrackInfo> f3596v;

    /* renamed from: w */
    SessionPlayer$TrackInfo f3597w;

    /* renamed from: x */
    SessionPlayer$TrackInfo f3598x;

    /* renamed from: y */
    SessionPlayer$TrackInfo f3599y;

    /* renamed from: z */
    SessionPlayer$TrackInfo f3600z;

    ConnectionResult() {
    }

    /* renamed from: c */
    public void mo3057c() {
        this.f3576b = C1316a.C1317a.m5737p(this.f3577c);
        this.f3580f = this.f3581g;
    }

    /* renamed from: d */
    public void mo3058d(boolean z) {
        synchronized (this.f3576b) {
            if (this.f3577c == null) {
                this.f3577c = (IBinder) this.f3576b;
                this.f3581g = C1319b.m5740c(this.f3580f);
            }
        }
    }
}
