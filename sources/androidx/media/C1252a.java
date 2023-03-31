package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.util.C0825c;
import androidx.media.AudioAttributesCompat;
import java.util.Objects;

/* renamed from: androidx.media.a */
/* compiled from: AudioFocusRequestCompat */
public class C1252a {

    /* renamed from: g */
    static final AudioAttributesCompat f3399g = new AudioAttributesCompat.C1247a().mo4474e(1).mo4470a();

    /* renamed from: a */
    private final int f3400a;

    /* renamed from: b */
    private final AudioManager.OnAudioFocusChangeListener f3401b;

    /* renamed from: c */
    private final Handler f3402c;

    /* renamed from: d */
    private final AudioAttributesCompat f3403d;

    /* renamed from: e */
    private final boolean f3404e;

    /* renamed from: f */
    private final Object f3405f;

    /* renamed from: androidx.media.a$a */
    /* compiled from: AudioFocusRequestCompat */
    private static class C1253a {
        /* renamed from: a */
        static AudioFocusRequest m5562a(int i, AudioAttributes audioAttributes, boolean z, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    /* renamed from: androidx.media.a$b */
    /* compiled from: AudioFocusRequestCompat */
    public static final class C1254b {

        /* renamed from: a */
        private int f3406a;

        /* renamed from: b */
        private AudioManager.OnAudioFocusChangeListener f3407b;

        /* renamed from: c */
        private Handler f3408c;

        /* renamed from: d */
        private AudioAttributesCompat f3409d = C1252a.f3399g;

        /* renamed from: e */
        private boolean f3410e;

        public C1254b(int i) {
            mo4511d(i);
        }

        /* renamed from: b */
        private static boolean m5563b(int i) {
            return i == 1 || i == 2 || i == 3 || i == 4;
        }

        /* renamed from: a */
        public C1252a mo4509a() {
            if (this.f3407b != null) {
                return new C1252a(this.f3406a, this.f3407b, this.f3408c, this.f3409d, this.f3410e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        /* renamed from: c */
        public C1254b mo4510c(AudioAttributesCompat audioAttributesCompat) {
            Objects.requireNonNull(audioAttributesCompat, "Illegal null AudioAttributes");
            this.f3409d = audioAttributesCompat;
            return this;
        }

        /* renamed from: d */
        public C1254b mo4511d(int i) {
            if (m5563b(i)) {
                if (Build.VERSION.SDK_INT < 19 && i == 4) {
                    i = 2;
                }
                this.f3406a = i;
                return this;
            }
            throw new IllegalArgumentException("Illegal audio focus gain type " + i);
        }

        /* renamed from: e */
        public C1254b mo4512e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return mo4513f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        /* renamed from: f */
        public C1254b mo4513f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            if (onAudioFocusChangeListener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            } else if (handler != null) {
                this.f3407b = onAudioFocusChangeListener;
                this.f3408c = handler;
                return this;
            } else {
                throw new IllegalArgumentException("Handler must not be null");
            }
        }

        /* renamed from: g */
        public C1254b mo4514g(boolean z) {
            this.f3410e = z;
            return this;
        }
    }

    /* renamed from: androidx.media.a$c */
    /* compiled from: AudioFocusRequestCompat */
    private static class C1255c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        private final Handler f3411a;

        /* renamed from: b */
        private final AudioManager.OnAudioFocusChangeListener f3412b;

        C1255c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f3412b = onAudioFocusChangeListener;
            this.f3411a = new Handler(handler.getLooper(), this);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 2782386) {
                return false;
            }
            this.f3412b.onAudioFocusChange(message.arg1);
            return true;
        }

        public void onAudioFocusChange(int i) {
            Handler handler = this.f3411a;
            handler.sendMessage(Message.obtain(handler, 2782386, i, 0));
        }
    }

    C1252a(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z) {
        this.f3400a = i;
        this.f3402c = handler;
        this.f3403d = audioAttributesCompat;
        this.f3404e = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f3401b = onAudioFocusChangeListener;
        } else {
            this.f3401b = new C1255c(onAudioFocusChangeListener, handler);
        }
        if (i2 >= 26) {
            this.f3405f = C1253a.m5562a(i, mo4502a(), z, this.f3401b, handler);
        } else {
            this.f3405f = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AudioAttributes mo4502a() {
        AudioAttributesCompat audioAttributesCompat = this.f3403d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.mo4466d();
        }
        return null;
    }

    /* renamed from: b */
    public AudioAttributesCompat mo4503b() {
        return this.f3403d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AudioFocusRequest mo4504c() {
        return (AudioFocusRequest) this.f3405f;
    }

    /* renamed from: d */
    public int mo4505d() {
        return this.f3400a;
    }

    /* renamed from: e */
    public AudioManager.OnAudioFocusChangeListener mo4506e() {
        return this.f3401b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1252a)) {
            return false;
        }
        C1252a aVar = (C1252a) obj;
        if (this.f3400a != aVar.f3400a || this.f3404e != aVar.f3404e || !C0825c.m3642a(this.f3401b, aVar.f3401b) || !C0825c.m3642a(this.f3402c, aVar.f3402c) || !C0825c.m3642a(this.f3403d, aVar.f3403d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C0825c.m3643b(Integer.valueOf(this.f3400a), this.f3401b, this.f3402c, this.f3403d, Boolean.valueOf(this.f3404e));
    }
}
