package p073j4;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: j4.c */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4752c {

    /* renamed from: a */
    private boolean f25412a = false;

    /* renamed from: b */
    private float f25413b = 1.0f;

    /* renamed from: b */
    public static float m30638b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    /* renamed from: f */
    private final synchronized boolean m30639f() {
        return this.f25413b >= 0.0f;
    }

    /* renamed from: a */
    public final synchronized float mo18439a() {
        if (!m30639f()) {
            return 1.0f;
        }
        return this.f25413b;
    }

    /* renamed from: c */
    public final synchronized void mo18440c(boolean z) {
        this.f25412a = z;
    }

    /* renamed from: d */
    public final synchronized void mo18441d(float f) {
        this.f25413b = f;
    }

    /* renamed from: e */
    public final synchronized boolean mo18442e() {
        return this.f25412a;
    }
}
