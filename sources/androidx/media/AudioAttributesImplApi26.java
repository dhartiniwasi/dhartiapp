package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;

public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* renamed from: androidx.media.AudioAttributesImplApi26$a */
    static class C1250a extends AudioAttributesImplApi21.C1249a {
        C1250a() {
        }

        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.f3390a.build());
        }

        /* renamed from: i */
        public C1250a mo4490h(int i) {
            this.f3390a.setUsage(i);
            return this;
        }
    }

    public AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
