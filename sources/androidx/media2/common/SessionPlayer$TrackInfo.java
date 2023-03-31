package androidx.media2.common;

import android.media.MediaFormat;
import android.os.Bundle;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class SessionPlayer$TrackInfo extends CustomVersionedParcelable {

    /* renamed from: a */
    int f3558a;

    /* renamed from: b */
    int f3559b;

    /* renamed from: c */
    MediaFormat f3560c;

    /* renamed from: d */
    boolean f3561d;

    /* renamed from: e */
    Bundle f3562e;

    /* renamed from: f */
    private final Object f3563f = new Object();

    SessionPlayer$TrackInfo() {
    }

    /* renamed from: e */
    private static void m5721e(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (mediaFormat.containsKey(str)) {
            bundle.putInt(str, mediaFormat.getInteger(str));
        }
    }

    /* renamed from: f */
    private static void m5722f(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (mediaFormat.containsKey(str)) {
            bundle.putString(str, mediaFormat.getString(str));
        }
    }

    /* renamed from: g */
    private static void m5723g(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (bundle.containsKey(str)) {
            mediaFormat.setInteger(str, bundle.getInt(str));
        }
    }

    /* renamed from: h */
    private static void m5724h(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (bundle.containsKey(str)) {
            mediaFormat.setString(str, bundle.getString(str));
        }
    }

    /* renamed from: c */
    public void mo3057c() {
        Bundle bundle = this.f3562e;
        if (bundle != null && !bundle.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL")) {
            MediaFormat mediaFormat = new MediaFormat();
            this.f3560c = mediaFormat;
            m5724h("language", mediaFormat, this.f3562e);
            m5724h("mime", this.f3560c, this.f3562e);
            m5723g("is-forced-subtitle", this.f3560c, this.f3562e);
            m5723g("is-autoselect", this.f3560c, this.f3562e);
            m5723g("is-default", this.f3560c, this.f3562e);
        }
        Bundle bundle2 = this.f3562e;
        if (bundle2 == null || !bundle2.containsKey("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE")) {
            boolean z = true;
            if (this.f3559b == 1) {
                z = false;
            }
            this.f3561d = z;
            return;
        }
        this.f3561d = this.f3562e.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE");
    }

    /* renamed from: d */
    public void mo3058d(boolean z) {
        synchronized (this.f3563f) {
            Bundle bundle = new Bundle();
            this.f3562e = bundle;
            bundle.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL", this.f3560c == null);
            MediaFormat mediaFormat = this.f3560c;
            if (mediaFormat != null) {
                m5722f("language", mediaFormat, this.f3562e);
                m5722f("mime", this.f3560c, this.f3562e);
                m5721e("is-forced-subtitle", this.f3560c, this.f3562e);
                m5721e("is-autoselect", this.f3560c, this.f3562e);
                m5721e("is-default", this.f3560c, this.f3562e);
            }
            this.f3562e.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE", this.f3561d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SessionPlayer$TrackInfo) && this.f3558a == ((SessionPlayer$TrackInfo) obj).f3558a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3558a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getName());
        sb.append('#');
        sb.append(this.f3558a);
        sb.append('{');
        int i = this.f3559b;
        if (i == 1) {
            sb.append("VIDEO");
        } else if (i == 2) {
            sb.append("AUDIO");
        } else if (i == 4) {
            sb.append("SUBTITLE");
        } else if (i != 5) {
            sb.append("UNKNOWN");
        } else {
            sb.append("METADATA");
        }
        sb.append(", ");
        sb.append(this.f3560c);
        sb.append(", isSelectable=");
        sb.append(this.f3561d);
        sb.append("}");
        return sb.toString();
    }
}
