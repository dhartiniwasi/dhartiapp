package p225ed;

import android.graphics.Bitmap;

/* renamed from: ed.a */
/* compiled from: CompressFormats.kt */
public final class C10106a {
    /* renamed from: a */
    public static final Bitmap.CompressFormat m51420a(int i) {
        if (i == 0) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (i == 1) {
            return Bitmap.CompressFormat.PNG;
        }
        if (i != 2) {
            return Bitmap.CompressFormat.JPEG;
        }
        return Bitmap.CompressFormat.WEBP;
    }
}
