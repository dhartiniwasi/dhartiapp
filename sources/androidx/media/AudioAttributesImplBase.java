package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f3391a = 0;

    /* renamed from: b */
    public int f3392b = 0;

    /* renamed from: c */
    public int f3393c = 0;

    /* renamed from: d */
    public int f3394d = -1;

    /* renamed from: androidx.media.AudioAttributesImplBase$a */
    static class C1251a implements AudioAttributesImpl.C1248a {

        /* renamed from: a */
        private int f3395a = 0;

        /* renamed from: b */
        private int f3396b = 0;

        /* renamed from: c */
        private int f3397c = 0;

        /* renamed from: d */
        private int f3398d = -1;

        C1251a() {
        }

        /* renamed from: g */
        private C1251a m5548g(int i) {
            switch (i) {
                case 0:
                    this.f3396b = 1;
                    break;
                case 1:
                    break;
                case 2:
                    this.f3396b = 4;
                    break;
                case 3:
                    this.f3396b = 2;
                    break;
                case 4:
                    this.f3396b = 4;
                    break;
                case 5:
                    this.f3396b = 4;
                    break;
                case 6:
                    this.f3396b = 1;
                    this.f3397c |= 4;
                    break;
                case 7:
                    this.f3397c = 1 | this.f3397c;
                    break;
                case 8:
                    this.f3396b = 4;
                    break;
                case 9:
                    this.f3396b = 4;
                    break;
                case 10:
                    this.f3396b = 1;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i + " for AudioAttributesCompat");
                    break;
            }
            this.f3396b = 4;
            this.f3395a = AudioAttributesImplBase.m5542f(i);
            return this;
        }

        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f3396b, this.f3397c, this.f3395a, this.f3398d);
        }

        /* renamed from: e */
        public C1251a mo4478b(int i) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                this.f3396b = i;
            } else {
                this.f3396b = 0;
            }
            return this;
        }

        /* renamed from: f */
        public C1251a mo4480c(int i) {
            this.f3397c = (i & 1023) | this.f3397c;
            return this;
        }

        /* renamed from: h */
        public C1251a mo4477a(int i) {
            if (i != 10) {
                this.f3398d = i;
                return m5548g(i);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        /* renamed from: i */
        public C1251a mo4481d(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f3395a = i;
                    break;
                case 16:
                    this.f3395a = 12;
                    break;
                default:
                    this.f3395a = 0;
                    break;
            }
            return this;
        }
    }

    public AudioAttributesImplBase() {
    }

    /* renamed from: f */
    static int m5542f(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public int mo4475a() {
        int i = this.f3394d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m5511c(false, this.f3393c, this.f3391a);
    }

    /* renamed from: b */
    public Object mo4476b() {
        return null;
    }

    /* renamed from: c */
    public int mo4492c() {
        return this.f3392b;
    }

    /* renamed from: d */
    public int mo4493d() {
        int i = this.f3393c;
        int a = mo4475a();
        if (a == 6) {
            i |= 4;
        } else if (a == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: e */
    public int mo4494e() {
        return this.f3391a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f3392b == audioAttributesImplBase.mo4492c() && this.f3393c == audioAttributesImplBase.mo4493d() && this.f3391a == audioAttributesImplBase.mo4494e() && this.f3394d == audioAttributesImplBase.f3394d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3392b), Integer.valueOf(this.f3393c), Integer.valueOf(this.f3391a), Integer.valueOf(this.f3394d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3394d != -1) {
            sb.append(" stream=");
            sb.append(this.f3394d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m5512e(this.f3391a));
        sb.append(" content=");
        sb.append(this.f3392b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3393c).toUpperCase());
        return sb.toString();
    }

    AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.f3392b = i;
        this.f3393c = i2;
        this.f3391a = i3;
        this.f3394d = i4;
    }
}
