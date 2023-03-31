package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.vm0;
import p040e5.C4241b;
import p053g4.C4399j;
import p066i4.C4669i;

/* renamed from: com.google.android.gms.ads.internal.overlay.a */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2039a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        C4669i iVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        vm0 vm0 = null;
        String str4 = null;
        C4399j jVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder11 = null;
        IBinder iBinder12 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 2:
                    iVar = (C4669i) C4241b.m28582e(parcel2, r, C4669i.CREATOR);
                    break;
                case 3:
                    iBinder = C4241b.m28596s(parcel2, r);
                    break;
                case 4:
                    iBinder2 = C4241b.m28596s(parcel2, r);
                    break;
                case 5:
                    iBinder3 = C4241b.m28596s(parcel2, r);
                    break;
                case 6:
                    iBinder4 = C4241b.m28596s(parcel2, r);
                    break;
                case 7:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 8:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 9:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 10:
                    iBinder5 = C4241b.m28596s(parcel2, r);
                    break;
                case 11:
                    i = C4241b.m28597t(parcel2, r);
                    break;
                case 12:
                    i2 = C4241b.m28597t(parcel2, r);
                    break;
                case 13:
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 14:
                    vm0 = (vm0) C4241b.m28582e(parcel2, r, vm0.CREATOR);
                    break;
                case 16:
                    str4 = C4241b.m28583f(parcel2, r);
                    break;
                case 17:
                    jVar = (C4399j) C4241b.m28582e(parcel2, r, C4399j.CREATOR);
                    break;
                case 18:
                    iBinder6 = C4241b.m28596s(parcel2, r);
                    break;
                case 19:
                    str5 = C4241b.m28583f(parcel2, r);
                    break;
                case 20:
                    iBinder7 = C4241b.m28596s(parcel2, r);
                    break;
                case 21:
                    iBinder8 = C4241b.m28596s(parcel2, r);
                    break;
                case 22:
                    iBinder9 = C4241b.m28596s(parcel2, r);
                    break;
                case 23:
                    iBinder10 = C4241b.m28596s(parcel2, r);
                    break;
                case 24:
                    str6 = C4241b.m28583f(parcel2, r);
                    break;
                case 25:
                    str7 = C4241b.m28583f(parcel2, r);
                    break;
                case 26:
                    iBinder11 = C4241b.m28596s(parcel2, r);
                    break;
                case 27:
                    iBinder12 = C4241b.m28596s(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new AdOverlayInfoParcel(iVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, vm0, str4, jVar, iBinder6, str5, iBinder7, iBinder8, iBinder9, iBinder10, str6, str7, iBinder11, iBinder12);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
