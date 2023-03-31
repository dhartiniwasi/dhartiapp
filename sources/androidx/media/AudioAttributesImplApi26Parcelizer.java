package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C1506a;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(C1506a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f3388a = (AudioAttributes) aVar.mo5931A(audioAttributesImplApi26.f3388a, 1);
        audioAttributesImplApi26.f3389b = aVar.mo5983v(audioAttributesImplApi26.f3389b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5960d0(audioAttributesImplApi26.f3388a, 1);
        aVar.mo5953Y(audioAttributesImplApi26.f3389b, 2);
    }
}
