package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: androidx.media.e */
/* compiled from: MediaSessionManager */
public final class C1301e {

    /* renamed from: a */
    C1302f f3526a;

    public C1301e(String str, int i, int i2) {
        Objects.requireNonNull(str, "package shouldn't be null");
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f3526a = new C1303g(str, i, i2);
        } else {
            this.f3526a = new C1304h(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1301e)) {
            return false;
        }
        return this.f3526a.equals(((C1301e) obj).f3526a);
    }

    public int hashCode() {
        return this.f3526a.hashCode();
    }

    public C1301e(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String a = C1303g.m5686a(remoteUserInfo);
        Objects.requireNonNull(a, "package shouldn't be null");
        if (!TextUtils.isEmpty(a)) {
            this.f3526a = new C1303g(remoteUserInfo);
            return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
    }
}
