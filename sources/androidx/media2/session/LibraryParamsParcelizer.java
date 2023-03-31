package androidx.media2.session;

import androidx.versionedparcelable.C1506a;

public final class LibraryParamsParcelizer {
    public static MediaLibraryService$LibraryParams read(C1506a aVar) {
        MediaLibraryService$LibraryParams mediaLibraryService$LibraryParams = new MediaLibraryService$LibraryParams();
        mediaLibraryService$LibraryParams.f3615a = aVar.mo5970k(mediaLibraryService$LibraryParams.f3615a, 1);
        mediaLibraryService$LibraryParams.f3616b = aVar.mo5983v(mediaLibraryService$LibraryParams.f3616b, 2);
        mediaLibraryService$LibraryParams.f3617c = aVar.mo5983v(mediaLibraryService$LibraryParams.f3617c, 3);
        mediaLibraryService$LibraryParams.f3618d = aVar.mo5983v(mediaLibraryService$LibraryParams.f3618d, 4);
        return mediaLibraryService$LibraryParams;
    }

    public static void write(MediaLibraryService$LibraryParams mediaLibraryService$LibraryParams, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5945O(mediaLibraryService$LibraryParams.f3615a, 1);
        aVar.mo5953Y(mediaLibraryService$LibraryParams.f3616b, 2);
        aVar.mo5953Y(mediaLibraryService$LibraryParams.f3617c, 3);
        aVar.mo5953Y(mediaLibraryService$LibraryParams.f3618d, 4);
    }
}
