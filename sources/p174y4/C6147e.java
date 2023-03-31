package p174y4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: y4.e */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C6147e implements Parcelable.Creator<C6138a> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            if (C4241b.m28589l(r) != 1) {
                C4241b.m28601x(parcel, r);
            } else {
                intent = (Intent) C4241b.m28582e(parcel, r, Intent.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C6138a(intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C6138a[i];
    }
}
