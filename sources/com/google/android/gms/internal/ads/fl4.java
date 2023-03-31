package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fl4 implements Comparator<ek4>, Parcelable {
    public static final Parcelable.Creator<fl4> CREATOR = new di4();

    /* renamed from: a */
    private final ek4[] f9325a;

    /* renamed from: b */
    private int f9326b;

    /* renamed from: c */
    public final String f9327c;

    /* renamed from: d */
    public final int f9328d;

    fl4(Parcel parcel) {
        this.f9327c = parcel.readString();
        ek4[] ek4Arr = (ek4[]) gb2.m13171h((ek4[]) parcel.createTypedArray(ek4.CREATOR));
        this.f9325a = ek4Arr;
        this.f9328d = ek4Arr.length;
    }

    /* renamed from: a */
    public final ek4 mo10182a(int i) {
        return this.f9325a[i];
    }

    /* renamed from: b */
    public final fl4 mo10183b(String str) {
        if (gb2.m13186t(this.f9327c, str)) {
            return this;
        }
        return new fl4(str, false, this.f9325a);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ek4 ek4 = (ek4) obj;
        ek4 ek42 = (ek4) obj2;
        UUID uuid = ac4.f6520a;
        if (uuid.equals(ek4.f8835b)) {
            return !uuid.equals(ek42.f8835b) ? 1 : 0;
        }
        return ek4.f8835b.compareTo(ek42.f8835b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fl4.class == obj.getClass()) {
            fl4 fl4 = (fl4) obj;
            return gb2.m13186t(this.f9327c, fl4.f9327c) && Arrays.equals(this.f9325a, fl4.f9325a);
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.f9326b;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f9327c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (i * 31) + Arrays.hashCode(this.f9325a);
        this.f9326b = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9327c);
        parcel.writeTypedArray(this.f9325a, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.gms.internal.ads.ek4[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private fl4(java.lang.String r1, boolean r2, com.google.android.gms.internal.ads.ek4... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f9327c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.gms.internal.ads.ek4[] r3 = (com.google.android.gms.internal.ads.ek4[]) r3
        L_0x000e:
            r0.f9325a = r3
            int r1 = r3.length
            r0.f9328d = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fl4.<init>(java.lang.String, boolean, com.google.android.gms.internal.ads.ek4[]):void");
    }

    public fl4(String str, ek4... ek4Arr) {
        this((String) null, true, ek4Arr);
    }

    public fl4(List list) {
        this((String) null, false, (ek4[]) list.toArray(new ek4[0]));
    }
}
