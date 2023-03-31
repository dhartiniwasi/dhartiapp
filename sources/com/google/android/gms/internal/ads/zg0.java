package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040e5.C4241b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zg0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        Bundle bundle = null;
        vm0 vm0 = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        xu2 xu2 = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    bundle = C4241b.m28578a(parcel2, r);
                    break;
                case 2:
                    vm0 = (vm0) C4241b.m28582e(parcel2, r, vm0.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) C4241b.m28582e(parcel2, r, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 5:
                    arrayList = C4241b.m28585h(parcel2, r);
                    break;
                case 6:
                    packageInfo = (PackageInfo) C4241b.m28582e(parcel2, r, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 9:
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 10:
                    xu2 = (xu2) C4241b.m28582e(parcel2, r, xu2.CREATOR);
                    break;
                case 11:
                    str4 = C4241b.m28583f(parcel2, r);
                    break;
                case 12:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new yg0(bundle, vm0, applicationInfo, str, arrayList, packageInfo, str2, str3, xu2, str4, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new yg0[i];
    }
}
