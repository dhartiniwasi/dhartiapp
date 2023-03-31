package androidx.media2.common;

import androidx.versionedparcelable.C1506a;

public final class SubtitleDataParcelizer {
    public static SubtitleData read(C1506a aVar) {
        SubtitleData subtitleData = new SubtitleData();
        subtitleData.f3564a = aVar.mo5986y(subtitleData.f3564a, 1);
        subtitleData.f3565b = aVar.mo5986y(subtitleData.f3565b, 2);
        subtitleData.f3566c = aVar.mo5974m(subtitleData.f3566c, 3);
        return subtitleData;
    }

    public static void write(SubtitleData subtitleData, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5958b0(subtitleData.f3564a, 1);
        aVar.mo5958b0(subtitleData.f3565b, 2);
        aVar.mo5947Q(subtitleData.f3566c, 3);
    }
}
