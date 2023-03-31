package androidx.media;

import androidx.versionedparcelable.C1506a;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C1506a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3386a = (AudioAttributesImpl) aVar.mo5939I(audioAttributesCompat.f3386a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5975m0(audioAttributesCompat.f3386a, 1);
    }
}
