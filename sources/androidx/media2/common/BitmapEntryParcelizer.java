package androidx.media2.common;

import android.graphics.Bitmap;
import androidx.media2.common.MediaMetadata;
import androidx.versionedparcelable.C1506a;

public final class BitmapEntryParcelizer {
    public static MediaMetadata.BitmapEntry read(C1506a aVar) {
        MediaMetadata.BitmapEntry bitmapEntry = new MediaMetadata.BitmapEntry();
        bitmapEntry.f3552a = aVar.mo5935E(bitmapEntry.f3552a, 1);
        bitmapEntry.f3553b = (Bitmap) aVar.mo5931A(bitmapEntry.f3553b, 2);
        return bitmapEntry;
    }

    public static void write(MediaMetadata.BitmapEntry bitmapEntry, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5965h0(bitmapEntry.f3552a, 1);
        aVar.mo5960d0(bitmapEntry.f3553b, 2);
    }
}
