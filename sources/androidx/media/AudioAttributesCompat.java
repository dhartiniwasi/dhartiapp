package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import p152v0.C5755b;

public class AudioAttributesCompat implements C5755b {

    /* renamed from: b */
    private static final SparseIntArray f3383b;

    /* renamed from: c */
    static boolean f3384c;

    /* renamed from: d */
    private static final int[] f3385d = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: a */
    public AudioAttributesImpl f3386a;

    /* renamed from: androidx.media.AudioAttributesCompat$a */
    public static class C1247a {

        /* renamed from: a */
        final AudioAttributesImpl.C1248a f3387a;

        public C1247a() {
            if (AudioAttributesCompat.f3384c) {
                this.f3387a = new AudioAttributesImplBase.C1251a();
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                this.f3387a = new AudioAttributesImplApi26.C1250a();
            } else if (i >= 21) {
                this.f3387a = new AudioAttributesImplApi21.C1249a();
            } else {
                this.f3387a = new AudioAttributesImplBase.C1251a();
            }
        }

        /* renamed from: a */
        public AudioAttributesCompat mo4470a() {
            return new AudioAttributesCompat(this.f3387a.build());
        }

        /* renamed from: b */
        public C1247a mo4471b(int i) {
            this.f3387a.mo4478b(i);
            return this;
        }

        /* renamed from: c */
        public C1247a mo4472c(int i) {
            this.f3387a.mo4480c(i);
            return this;
        }

        /* renamed from: d */
        public C1247a mo4473d(int i) {
            this.f3387a.mo4477a(i);
            return this;
        }

        /* renamed from: e */
        public C1247a mo4474e(int i) {
            this.f3387a.mo4481d(i);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3383b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    /* renamed from: c */
    static int m5511c(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
        }
    }

    /* renamed from: e */
    static String m5512e(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                return "unknown usage " + i;
        }
    }

    /* renamed from: f */
    public static AudioAttributesCompat m5513f(Object obj) {
        if (f3384c) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
        }
        if (i >= 21) {
            return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
        }
        return null;
    }

    /* renamed from: a */
    public int mo4465a() {
        return this.f3386a.mo4475a();
    }

    /* renamed from: d */
    public Object mo4466d() {
        return this.f3386a.mo4476b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f3386a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.f3386a);
        }
        if (audioAttributesCompat.f3386a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3386a.hashCode();
    }

    public String toString() {
        return this.f3386a.toString();
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f3386a = audioAttributesImpl;
    }
}
