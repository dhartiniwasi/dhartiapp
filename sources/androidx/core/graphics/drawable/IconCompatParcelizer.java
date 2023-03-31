package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.C1506a;

public class IconCompatParcelizer {
    public static IconCompat read(C1506a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2272a = aVar.mo5983v(iconCompat.f2272a, 1);
        iconCompat.f2274c = aVar.mo5974m(iconCompat.f2274c, 2);
        iconCompat.f2275d = aVar.mo5931A(iconCompat.f2275d, 3);
        iconCompat.f2276e = aVar.mo5983v(iconCompat.f2276e, 4);
        iconCompat.f2277f = aVar.mo5983v(iconCompat.f2277f, 5);
        iconCompat.f2278g = (ColorStateList) aVar.mo5931A(iconCompat.f2278g, 6);
        iconCompat.f2280i = aVar.mo5935E(iconCompat.f2280i, 7);
        iconCompat.f2281j = aVar.mo5935E(iconCompat.f2281j, 8);
        iconCompat.mo3057c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C1506a aVar) {
        aVar.mo5941K(true, true);
        iconCompat.mo3058d(aVar.mo5962g());
        int i = iconCompat.f2272a;
        if (-1 != i) {
            aVar.mo5953Y(i, 1);
        }
        byte[] bArr = iconCompat.f2274c;
        if (bArr != null) {
            aVar.mo5947Q(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2275d;
        if (parcelable != null) {
            aVar.mo5960d0(parcelable, 3);
        }
        int i2 = iconCompat.f2276e;
        if (i2 != 0) {
            aVar.mo5953Y(i2, 4);
        }
        int i3 = iconCompat.f2277f;
        if (i3 != 0) {
            aVar.mo5953Y(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f2278g;
        if (colorStateList != null) {
            aVar.mo5960d0(colorStateList, 6);
        }
        String str = iconCompat.f2280i;
        if (str != null) {
            aVar.mo5965h0(str, 7);
        }
        String str2 = iconCompat.f2281j;
        if (str2 != null) {
            aVar.mo5965h0(str2, 8);
        }
    }
}
