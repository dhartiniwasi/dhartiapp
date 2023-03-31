package androidx.media.app;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.p009v4.media.session.MediaSessionCompat;

/* renamed from: androidx.media.app.b */
/* compiled from: NotificationCompat */
class C1257b {
    /* renamed from: a */
    static Notification.MediaStyle m5571a() {
        return new Notification.MediaStyle();
    }

    /* renamed from: b */
    static Notification.MediaStyle m5572b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
        if (iArr != null) {
            m5575e(mediaStyle, iArr);
        }
        if (token != null) {
            m5573c(mediaStyle, (MediaSession.Token) token.mo499f());
        }
        return mediaStyle;
    }

    /* renamed from: c */
    static void m5573c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* renamed from: d */
    static void m5574d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* renamed from: e */
    static void m5575e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
