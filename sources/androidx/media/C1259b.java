package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;

/* renamed from: androidx.media.b */
/* compiled from: AudioManagerCompat */
public final class C1259b {

    /* renamed from: androidx.media.b$a */
    /* compiled from: AudioManagerCompat */
    private static class C1260a {
        /* renamed from: a */
        static int m5590a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        /* renamed from: b */
        static int m5591b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    /* renamed from: a */
    public static int m5588a(AudioManager audioManager, C1252a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        } else if (aVar == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        } else if (Build.VERSION.SDK_INT >= 26) {
            return C1260a.m5590a(audioManager, aVar.mo4504c());
        } else {
            return audioManager.abandonAudioFocus(aVar.mo4506e());
        }
    }

    /* renamed from: b */
    public static int m5589b(AudioManager audioManager, C1252a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        } else if (aVar == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        } else if (Build.VERSION.SDK_INT >= 26) {
            return C1260a.m5591b(audioManager, aVar.mo4504c());
        } else {
            return audioManager.requestAudioFocus(aVar.mo4506e(), aVar.mo4503b().mo4465a(), aVar.mo4505d());
        }
    }
}
