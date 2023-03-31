package androidx.media2.common;

import androidx.versionedparcelable.C1506a;

public final class VideoSizeParcelizer {
    public static VideoSize read(C1506a aVar) {
        VideoSize videoSize = new VideoSize();
        videoSize.f3567a = aVar.mo5983v(videoSize.f3567a, 1);
        videoSize.f3568b = aVar.mo5983v(videoSize.f3568b, 2);
        return videoSize;
    }

    public static void write(VideoSize videoSize, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5953Y(videoSize.f3567a, 1);
        aVar.mo5953Y(videoSize.f3568b, 2);
    }
}
