package androidx.core.graphics;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: androidx.core.graphics.a */
/* compiled from: BitmapCompat */
public final class C0721a {

    /* renamed from: androidx.core.graphics.a$a */
    /* compiled from: BitmapCompat */
    static class C0722a {
        /* renamed from: a */
        static int m3309a(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    /* renamed from: a */
    public static int m3308a(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0722a.m3309a(bitmap);
        }
        return bitmap.getByteCount();
    }
}
