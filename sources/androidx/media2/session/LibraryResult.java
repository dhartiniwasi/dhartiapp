package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.List;

public class LibraryResult extends CustomVersionedParcelable {

    /* renamed from: a */
    int f3603a;

    /* renamed from: b */
    long f3604b;

    /* renamed from: c */
    MediaItem f3605c;

    /* renamed from: d */
    MediaItem f3606d;

    /* renamed from: e */
    MediaLibraryService$LibraryParams f3607e;

    /* renamed from: f */
    List<MediaItem> f3608f;

    /* renamed from: g */
    ParcelImplListSlice f3609g;

    LibraryResult() {
    }

    /* renamed from: c */
    public void mo3057c() {
        this.f3605c = this.f3606d;
        this.f3608f = C1319b.m5739b(this.f3609g);
    }

    /* renamed from: d */
    public void mo3058d(boolean z) {
        MediaItem mediaItem = this.f3605c;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (this.f3606d == null) {
                    this.f3606d = C1319b.m5740c(this.f3605c);
                }
            }
        }
        List<MediaItem> list = this.f3608f;
        if (list != null) {
            synchronized (list) {
                if (this.f3609g == null) {
                    this.f3609g = C1319b.m5738a(this.f3608f);
                }
            }
        }
    }
}
