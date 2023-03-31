package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.rk */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2813rk implements Comparator<C2776qk>, Parcelable {
    public static final Parcelable.Creator<C2813rk> CREATOR = new C2701ok();

    /* renamed from: a */
    private final C2776qk[] f16989a;

    /* renamed from: b */
    private int f16990b;

    /* renamed from: c */
    public final int f16991c;

    C2813rk(Parcel parcel) {
        C2776qk[] qkVarArr = (C2776qk[]) parcel.createTypedArray(C2776qk.CREATOR);
        this.f16989a = qkVarArr;
        this.f16991c = qkVarArr.length;
    }

    /* renamed from: a */
    public final C2776qk mo13824a(int i) {
        return this.f16989a[i];
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C2776qk qkVar = (C2776qk) obj;
        C2776qk qkVar2 = (C2776qk) obj2;
        UUID uuid = C2216bi.f7273b;
        if (uuid.equals(qkVar.f16423b)) {
            return !uuid.equals(qkVar2.f16423b) ? 1 : 0;
        }
        return qkVar.f16423b.compareTo(qkVar2.f16423b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2813rk.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f16989a, ((C2813rk) obj).f16989a);
    }

    public final int hashCode() {
        int i = this.f16990b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f16989a);
        this.f16990b = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f16989a, 0);
    }

    public C2813rk(List list) {
        this(false, (C2776qk[]) list.toArray(new C2776qk[list.size()]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.gms.internal.ads.qk[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C2813rk(boolean r3, com.google.android.gms.internal.ads.C2776qk... r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r4.clone()
            r4 = r3
            com.google.android.gms.internal.ads.qk[] r4 = (com.google.android.gms.internal.ads.C2776qk[]) r4
        L_0x000c:
            java.util.Arrays.sort(r4, r2)
            r3 = 1
        L_0x0010:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x0040
            int r0 = r3 + -1
            r0 = r4[r0]
            java.util.UUID r0 = r0.f16423b
            r1 = r4[r3]
            java.util.UUID r1 = r1.f16423b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = r4[r3]
            java.util.UUID r3 = r3.f16423b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Duplicate data for uuid: "
            java.lang.String r3 = r4.concat(r3)
            r0.<init>(r3)
            throw r0
        L_0x0040:
            r2.f16989a = r4
            r2.f16991c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2813rk.<init>(boolean, com.google.android.gms.internal.ads.qk[]):void");
    }

    public C2813rk(C2776qk... qkVarArr) {
        this(true, qkVarArr);
    }
}
