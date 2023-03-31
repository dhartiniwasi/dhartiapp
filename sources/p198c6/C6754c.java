package p198c6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: c6.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C6754c implements Parcelable.Creator<C6753b> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i = C4241b.m28597t(parcel, r);
            } else if (l == 2) {
                i2 = C4241b.m28597t(parcel, r);
            } else if (l != 3) {
                C4241b.m28601x(parcel, r);
            } else {
                intent = (Intent) C4241b.m28582e(parcel, r, Intent.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C6753b(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6753b[i];
    }
}
