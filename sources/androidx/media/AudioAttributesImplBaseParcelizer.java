package androidx.media;

import androidx.versionedparcelable.C1506a;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C1506a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3391a = aVar.mo5983v(audioAttributesImplBase.f3391a, 1);
        audioAttributesImplBase.f3392b = aVar.mo5983v(audioAttributesImplBase.f3392b, 2);
        audioAttributesImplBase.f3393c = aVar.mo5983v(audioAttributesImplBase.f3393c, 3);
        audioAttributesImplBase.f3394d = aVar.mo5983v(audioAttributesImplBase.f3394d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5953Y(audioAttributesImplBase.f3391a, 1);
        aVar.mo5953Y(audioAttributesImplBase.f3392b, 2);
        aVar.mo5953Y(audioAttributesImplBase.f3393c, 3);
        aVar.mo5953Y(audioAttributesImplBase.f3394d, 4);
    }
}
