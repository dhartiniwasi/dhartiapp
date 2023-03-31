package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.ArrayList;
import p040e5.C4241b;
import p060h4.C4541l4;
import p060h4.C4551n2;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kg0 implements Parcelable.Creator {
    /* renamed from: a */
    public static final jg0 m15405a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        C4541l4 l4Var = null;
        C4571q4 q4Var = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        vm0 vm0 = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        f20 f20 = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        C4551n2 n2Var = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        f80 f80 = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    i = C4241b.m28597t(parcel2, r);
                    break;
                case 2:
                    bundle = C4241b.m28578a(parcel2, r);
                    break;
                case 3:
                    l4Var = (C4541l4) C4241b.m28582e(parcel2, r, C4541l4.CREATOR);
                    break;
                case 4:
                    q4Var = (C4571q4) C4241b.m28582e(parcel2, r, C4571q4.CREATOR);
                    break;
                case 5:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C4241b.m28582e(parcel2, r, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C4241b.m28582e(parcel2, r, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 9:
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 10:
                    str4 = C4241b.m28583f(parcel2, r);
                    break;
                case 11:
                    vm0 = (vm0) C4241b.m28582e(parcel2, r, vm0.CREATOR);
                    break;
                case 12:
                    bundle2 = C4241b.m28578a(parcel2, r);
                    break;
                case 13:
                    i2 = C4241b.m28597t(parcel2, r);
                    break;
                case 14:
                    arrayList = C4241b.m28585h(parcel2, r);
                    break;
                case 15:
                    bundle3 = C4241b.m28578a(parcel2, r);
                    break;
                case 16:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 18:
                    i3 = C4241b.m28597t(parcel2, r);
                    break;
                case 19:
                    i4 = C4241b.m28597t(parcel2, r);
                    break;
                case 20:
                    f = C4241b.m28593p(parcel2, r);
                    break;
                case 21:
                    str5 = C4241b.m28583f(parcel2, r);
                    break;
                case 25:
                    j = C4241b.m28598u(parcel2, r);
                    break;
                case 26:
                    str6 = C4241b.m28583f(parcel2, r);
                    break;
                case 27:
                    arrayList2 = C4241b.m28585h(parcel2, r);
                    break;
                case 28:
                    str7 = C4241b.m28583f(parcel2, r);
                    break;
                case 29:
                    f20 = (f20) C4241b.m28582e(parcel2, r, f20.CREATOR);
                    break;
                case 30:
                    arrayList3 = C4241b.m28585h(parcel2, r);
                    break;
                case 31:
                    j2 = C4241b.m28598u(parcel2, r);
                    break;
                case 33:
                    str8 = C4241b.m28583f(parcel2, r);
                    break;
                case 34:
                    f2 = C4241b.m28593p(parcel2, r);
                    break;
                case 35:
                    i5 = C4241b.m28597t(parcel2, r);
                    break;
                case 36:
                    i6 = C4241b.m28597t(parcel2, r);
                    break;
                case 37:
                    z3 = C4241b.m28590m(parcel2, r);
                    break;
                case 39:
                    str9 = C4241b.m28583f(parcel2, r);
                    break;
                case 40:
                    z2 = C4241b.m28590m(parcel2, r);
                    break;
                case 41:
                    str10 = C4241b.m28583f(parcel2, r);
                    break;
                case 42:
                    z4 = C4241b.m28590m(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*43*/:
                    i7 = C4241b.m28597t(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
                    bundle4 = C4241b.m28578a(parcel2, r);
                    break;
                case 45:
                    str11 = C4241b.m28583f(parcel2, r);
                    break;
                case 46:
                    n2Var = (C4551n2) C4241b.m28582e(parcel2, r, C4551n2.CREATOR);
                    break;
                case 47:
                    z5 = C4241b.m28590m(parcel2, r);
                    break;
                case 48:
                    bundle5 = C4241b.m28578a(parcel2, r);
                    break;
                case 49:
                    str12 = C4241b.m28583f(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                    str13 = C4241b.m28583f(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                    str14 = C4241b.m28583f(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                    z6 = C4241b.m28590m(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
                    arrayList4 = C4241b.m28581d(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
                    str15 = C4241b.m28583f(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
                    arrayList5 = C4241b.m28585h(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_colorError /*56*/:
                    i8 = C4241b.m28597t(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
                    z7 = C4241b.m28590m(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
                    z8 = C4241b.m28590m(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
                    z9 = C4241b.m28590m(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                    arrayList6 = C4241b.m28585h(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
                    str16 = C4241b.m28583f(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
                    f80 = (f80) C4241b.m28582e(parcel2, r, f80.CREATOR);
                    break;
                case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                    str17 = C4241b.m28583f(parcel2, r);
                    break;
                case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
                    bundle6 = C4241b.m28578a(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new jg0(i, bundle, l4Var, q4Var, str, applicationInfo, packageInfo, str2, str3, str4, vm0, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, f20, arrayList3, j2, str8, f2, z2, i5, i6, z3, str9, str10, z4, i7, bundle4, str11, n2Var, z5, bundle5, str12, str13, str14, z6, arrayList4, str15, arrayList5, i8, z7, z8, z9, arrayList6, str16, f80, str17, bundle6);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m15405a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new jg0[i];
    }
}
