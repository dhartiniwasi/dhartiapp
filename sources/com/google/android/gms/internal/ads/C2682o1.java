package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.o1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class C2682o1 implements j50 {
    public static final Parcelable.Creator<C2682o1> CREATOR = new C2645n1();

    /* renamed from: a */
    public final String f14791a;

    /* renamed from: b */
    public final String f14792b;

    protected C2682o1(Parcel parcel) {
        String readString = parcel.readString();
        int i = gb2.f9812a;
        this.f14791a = readString;
        this.f14792b = parcel.readString();
    }

    public C2682o1(String str, String str2) {
        this.f14791a = str;
        this.f14792b = str2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8652E0(com.google.android.gms.internal.ads.l00 r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f14791a
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case 62359119: goto L_0x0036;
                case 79833656: goto L_0x002c;
                case 428414940: goto L_0x0022;
                case 1746739798: goto L_0x0018;
                case 1939198791: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0018:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 3
            goto L_0x0041
        L_0x0022:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 4
            goto L_0x0041
        L_0x002c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x0036:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 2
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            if (r0 == 0) goto L_0x0064
            if (r0 == r5) goto L_0x005e
            if (r0 == r4) goto L_0x0058
            if (r0 == r3) goto L_0x0052
            if (r0 == r2) goto L_0x004c
            return
        L_0x004c:
            java.lang.String r0 = r6.f14792b
            r7.mo11861y(r0)
            return
        L_0x0052:
            java.lang.String r0 = r6.f14792b
            r7.mo11855s(r0)
            return
        L_0x0058:
            java.lang.String r0 = r6.f14792b
            r7.mo11856t(r0)
            return
        L_0x005e:
            java.lang.String r0 = r6.f14792b
            r7.mo11857u(r0)
            return
        L_0x0064:
            java.lang.String r0 = r6.f14792b
            r7.mo11848H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2682o1.mo8652E0(com.google.android.gms.internal.ads.l00):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2682o1 o1Var = (C2682o1) obj;
            return this.f14791a.equals(o1Var.f14791a) && this.f14792b.equals(o1Var.f14792b);
        }
    }

    public final int hashCode() {
        return ((this.f14791a.hashCode() + 527) * 31) + this.f14792b.hashCode();
    }

    public final String toString() {
        String str = this.f14791a;
        String str2 = this.f14792b;
        return "VC: " + str + "=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14791a);
        parcel.writeString(this.f14792b);
    }
}
