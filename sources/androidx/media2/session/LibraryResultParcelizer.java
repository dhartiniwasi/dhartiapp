package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.C1506a;

public final class LibraryResultParcelizer {
    public static LibraryResult read(C1506a aVar) {
        LibraryResult libraryResult = new LibraryResult();
        libraryResult.f3603a = aVar.mo5983v(libraryResult.f3603a, 1);
        libraryResult.f3604b = aVar.mo5986y(libraryResult.f3604b, 2);
        libraryResult.f3606d = (MediaItem) aVar.mo5939I(libraryResult.f3606d, 3);
        libraryResult.f3607e = (MediaLibraryService$LibraryParams) aVar.mo5939I(libraryResult.f3607e, 4);
        libraryResult.f3609g = (ParcelImplListSlice) aVar.mo5931A(libraryResult.f3609g, 5);
        libraryResult.mo3057c();
        return libraryResult;
    }

    public static void write(LibraryResult libraryResult, C1506a aVar) {
        aVar.mo5941K(false, false);
        libraryResult.mo3058d(aVar.mo5962g());
        aVar.mo5953Y(libraryResult.f3603a, 1);
        aVar.mo5958b0(libraryResult.f3604b, 2);
        aVar.mo5975m0(libraryResult.f3606d, 3);
        aVar.mo5975m0(libraryResult.f3607e, 4);
        aVar.mo5960d0(libraryResult.f3609g, 5);
    }
}
