package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;
import p180z4.C6378j;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class vm0 extends C4240a {
    public static final Parcelable.Creator<vm0> CREATOR = new wm0();

    /* renamed from: a */
    public String f19150a;

    /* renamed from: b */
    public int f19151b;

    /* renamed from: c */
    public int f19152c;

    /* renamed from: d */
    public boolean f19153d;

    /* renamed from: e */
    public boolean f19154e;

    public vm0(int i, int i2, boolean z, boolean z2) {
        this(223104000, i2, true, false, z2);
    }

    /* renamed from: I1 */
    public static vm0 m22307I1() {
        return new vm0((int) C6378j.f30617a, (int) C6378j.f30617a, true, false, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f19150a, false);
        C4243c.m28614k(parcel, 3, this.f19151b);
        C4243c.m28614k(parcel, 4, this.f19152c);
        C4243c.m28606c(parcel, 5, this.f19153d);
        C4243c.m28606c(parcel, 6, this.f19154e);
        C4243c.m28605b(parcel, a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vm0(int r9, int r10, boolean r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            if (r11 == 0) goto L_0x0005
            java.lang.String r12 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r12 = "1"
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "afma-sdk-a-v"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r10)
            r0.append(r1)
            r0.append(r12)
            java.lang.String r3 = r0.toString()
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>((java.lang.String) r3, (int) r4, (int) r5, (boolean) r6, (boolean) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vm0.<init>(int, int, boolean, boolean, boolean):void");
    }

    vm0(String str, int i, int i2, boolean z, boolean z2) {
        this.f19150a = str;
        this.f19151b = i;
        this.f19152c = i2;
        this.f19153d = z;
        this.f19154e = z2;
    }
}
