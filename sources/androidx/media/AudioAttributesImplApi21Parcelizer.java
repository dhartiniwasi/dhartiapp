package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C1506a;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C1506a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3388a = (AudioAttributes) aVar.mo5931A(audioAttributesImplApi21.f3388a, 1);
        audioAttributesImplApi21.f3389b = aVar.mo5983v(audioAttributesImplApi21.f3389b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5960d0(audioAttributesImplApi21.f3388a, 1);
        aVar.mo5953Y(audioAttributesImplApi21.f3389b, 2);
    }
}
