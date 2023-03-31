package p198c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040e5.C4241b;

/* renamed from: c6.i */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C6760i implements Parcelable.Creator<C6759h> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                arrayList = C4241b.m28585h(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                str = C4241b.m28583f(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C6759h(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6759h[i];
    }
}
