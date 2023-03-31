package p066i4;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: i4.h */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4668h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 2:
                    str = C4241b.m28583f(parcel, r);
                    break;
                case 3:
                    str2 = C4241b.m28583f(parcel, r);
                    break;
                case 4:
                    str3 = C4241b.m28583f(parcel, r);
                    break;
                case 5:
                    str4 = C4241b.m28583f(parcel, r);
                    break;
                case 6:
                    str5 = C4241b.m28583f(parcel, r);
                    break;
                case 7:
                    str6 = C4241b.m28583f(parcel, r);
                    break;
                case 8:
                    str7 = C4241b.m28583f(parcel, r);
                    break;
                case 9:
                    intent = (Intent) C4241b.m28582e(parcel, r, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = C4241b.m28596s(parcel, r);
                    break;
                case 11:
                    z = C4241b.m28590m(parcel, r);
                    break;
                default:
                    C4241b.m28601x(parcel, r);
                    break;
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4669i(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4669i[i];
    }
}
