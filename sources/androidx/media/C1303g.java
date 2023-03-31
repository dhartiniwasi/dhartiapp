package androidx.media;

import android.media.session.MediaSessionManager;

/* renamed from: androidx.media.g */
/* compiled from: MediaSessionManagerImplApi28 */
final class C1303g extends C1304h {

    /* renamed from: d */
    final MediaSessionManager.RemoteUserInfo f3527d;

    C1303g(String str, int i, int i2) {
        super(str, i, i2);
        this.f3527d = new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    /* renamed from: a */
    static String m5686a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }

    C1303g(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        this.f3527d = remoteUserInfo;
    }
}
