package p023c4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: c4.j */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C1872j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        boolean z = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                z = C4241b.m28590m(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                iBinder = C4241b.m28596s(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C1859a(z, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1859a[i];
    }
}
