package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gn */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2407gn implements Parcelable {
    public static final Parcelable.Creator<C2407gn> CREATOR = new C2332en();

    /* renamed from: a */
    private final C2370fn[] f10006a;

    C2407gn(Parcel parcel) {
        this.f10006a = new C2370fn[parcel.readInt()];
        int i = 0;
        while (true) {
            C2370fn[] fnVarArr = this.f10006a;
            if (i < fnVarArr.length) {
                fnVarArr[i] = (C2370fn) parcel.readParcelable(C2370fn.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo10581a() {
        return this.f10006a.length;
    }

    /* renamed from: b */
    public final C2370fn mo10582b(int i) {
        return this.f10006a[i];
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2407gn.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10006a, ((C2407gn) obj).f10006a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10006a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10006a.length);
        for (C2370fn writeParcelable : this.f10006a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C2407gn(List list) {
        C2370fn[] fnVarArr = new C2370fn[list.size()];
        this.f10006a = fnVarArr;
        list.toArray(fnVarArr);
    }
}
