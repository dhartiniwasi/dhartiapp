package androidx.media;

import android.os.Bundle;

/* renamed from: androidx.media.c */
/* compiled from: MediaBrowserCompatUtils */
public class C1261c {
    /* renamed from: a */
    public static boolean m5592a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        } else if (bundle2 == null) {
            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m5593b(Bundle bundle, Bundle bundle2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
        if (bundle2 == null) {
            i = -1;
        } else {
            i = bundle2.getInt("android.media.browse.extra.PAGE", -1);
        }
        if (bundle == null) {
            i2 = -1;
        } else {
            i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        }
        if (bundle2 == null) {
            i3 = -1;
        } else {
            i3 = bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        }
        int i8 = Integer.MAX_VALUE;
        if (i7 == -1 || i2 == -1) {
            i4 = Integer.MAX_VALUE;
            i5 = 0;
        } else {
            i5 = i7 * i2;
            i4 = (i2 + i5) - 1;
        }
        if (i == -1 || i3 == -1) {
            i6 = 0;
        } else {
            i6 = i * i3;
            i8 = (i3 + i6) - 1;
        }
        return i4 >= i6 && i8 >= i5;
    }
}
