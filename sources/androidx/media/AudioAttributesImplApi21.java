package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f3388a;

    /* renamed from: b */
    public int f3389b;

    /* renamed from: androidx.media.AudioAttributesImplApi21$a */
    static class C1249a implements AudioAttributesImpl.C1248a {

        /* renamed from: a */
        final AudioAttributes.Builder f3390a = new AudioAttributes.Builder();

        C1249a() {
        }

        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f3390a.build());
        }

        /* renamed from: e */
        public C1249a mo4478b(int i) {
            this.f3390a.setContentType(i);
            return this;
        }

        /* renamed from: f */
        public C1249a mo4480c(int i) {
            this.f3390a.setFlags(i);
            return this;
        }

        /* renamed from: g */
        public C1249a mo4477a(int i) {
            this.f3390a.setLegacyStreamType(i);
            return this;
        }

        /* renamed from: h */
        public C1249a mo4481d(int i) {
            if (i == 16) {
                i = 12;
            }
            this.f3390a.setUsage(i);
            return this;
        }
    }

    public AudioAttributesImplApi21() {
        this.f3389b = -1;
    }

    /* renamed from: a */
    public int mo4475a() {
        int i = this.f3389b;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m5511c(false, mo4482c(), mo4483d());
    }

    /* renamed from: b */
    public Object mo4476b() {
        return this.f3388a;
    }

    /* renamed from: c */
    public int mo4482c() {
        return this.f3388a.getFlags();
    }

    /* renamed from: d */
    public int mo4483d() {
        return this.f3388a.getUsage();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f3388a.equals(((AudioAttributesImplApi21) obj).f3388a);
    }

    public int hashCode() {
        return this.f3388a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3388a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f3389b = -1;
        this.f3388a = audioAttributes;
        this.f3389b = i;
    }
}
