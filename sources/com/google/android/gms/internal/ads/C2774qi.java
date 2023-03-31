package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qi */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2774qi implements Parcelable {
    public static final Parcelable.Creator<C2774qi> CREATOR = new C2737pi();

    /* renamed from: A */
    public final int f16378A;

    /* renamed from: B */
    public final int f16379B;

    /* renamed from: C */
    public final int f16380C;

    /* renamed from: D */
    public final int f16381D;

    /* renamed from: E */
    public final long f16382E;

    /* renamed from: F */
    public final int f16383F;

    /* renamed from: G */
    public final String f16384G;

    /* renamed from: H */
    public final int f16385H;

    /* renamed from: I */
    private int f16386I;

    /* renamed from: a */
    public final String f16387a;

    /* renamed from: b */
    public final int f16388b;

    /* renamed from: c */
    public final String f16389c;

    /* renamed from: d */
    public final C2407gn f16390d;

    /* renamed from: e */
    public final String f16391e;

    /* renamed from: f */
    public final String f16392f;

    /* renamed from: g */
    public final int f16393g;

    /* renamed from: h */
    public final List f16394h;

    /* renamed from: i */
    public final C2813rk f16395i;

    /* renamed from: r */
    public final int f16396r;

    /* renamed from: s */
    public final int f16397s;

    /* renamed from: t */
    public final float f16398t;

    /* renamed from: u */
    public final int f16399u;

    /* renamed from: v */
    public final float f16400v;

    /* renamed from: w */
    public final int f16401w;

    /* renamed from: x */
    public final byte[] f16402x;

    /* renamed from: y */
    public final C3004wq f16403y;

    /* renamed from: z */
    public final int f16404z;

    C2774qi(Parcel parcel) {
        this.f16387a = parcel.readString();
        this.f16391e = parcel.readString();
        this.f16392f = parcel.readString();
        this.f16389c = parcel.readString();
        this.f16388b = parcel.readInt();
        this.f16393g = parcel.readInt();
        this.f16396r = parcel.readInt();
        this.f16397s = parcel.readInt();
        this.f16398t = parcel.readFloat();
        this.f16399u = parcel.readInt();
        this.f16400v = parcel.readFloat();
        this.f16402x = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f16401w = parcel.readInt();
        this.f16403y = (C3004wq) parcel.readParcelable(C3004wq.class.getClassLoader());
        this.f16404z = parcel.readInt();
        this.f16378A = parcel.readInt();
        this.f16379B = parcel.readInt();
        this.f16380C = parcel.readInt();
        this.f16381D = parcel.readInt();
        this.f16383F = parcel.readInt();
        this.f16384G = parcel.readString();
        this.f16385H = parcel.readInt();
        this.f16382E = parcel.readLong();
        int readInt = parcel.readInt();
        this.f16394h = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f16394h.add(parcel.createByteArray());
        }
        this.f16395i = (C2813rk) parcel.readParcelable(C2813rk.class.getClassLoader());
        this.f16390d = (C2407gn) parcel.readParcelable(C2407gn.class.getClassLoader());
    }

    /* renamed from: g */
    public static C2774qi m19214g(String str, String str2, String str3, int i, int i2, int i3, int i4, List list, C2813rk rkVar, int i5, String str4) {
        return m19215h(str, str2, (String) null, -1, -1, i3, i4, -1, -1, -1, (List) null, rkVar, 0, str4, (C2407gn) null);
    }

    /* renamed from: h */
    public static C2774qi m19215h(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, C2813rk rkVar, int i8, String str4, C2407gn gnVar) {
        return new C2774qi(str, (String) null, str2, (String) null, -1, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3004wq) null, i3, i4, i5, -1, -1, i8, str4, -1, Long.MAX_VALUE, list, rkVar, (C2407gn) null);
    }

    /* renamed from: i */
    public static C2774qi m19216i(String str, String str2, String str3, int i, List list, String str4, C2813rk rkVar) {
        return new C2774qi(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3004wq) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, rkVar, (C2407gn) null);
    }

    /* renamed from: j */
    public static C2774qi m19217j(String str, String str2, String str3, int i, C2813rk rkVar) {
        return new C2774qi(str, (String) null, "application/x-camera-motion", (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3004wq) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List) null, rkVar, (C2407gn) null);
    }

    /* renamed from: k */
    public static C2774qi m19218k(String str, String str2, String str3, int i, int i2, String str4, int i3, C2813rk rkVar, long j, List list) {
        return new C2774qi(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3004wq) null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, rkVar, (C2407gn) null);
    }

    /* renamed from: l */
    public static C2774qi m19219l(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List list, int i5, float f2, byte[] bArr, int i6, C3004wq wqVar, C2813rk rkVar) {
        return new C2774qi(str, (String) null, str2, (String) null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, wqVar, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, rkVar, (C2407gn) null);
    }

    /* renamed from: m */
    private static void m19220m(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    public final int mo13538a() {
        int i;
        int i2 = this.f16396r;
        if (i2 == -1 || (i = this.f16397s) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: b */
    public final MediaFormat mo13539b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f16392f);
        String str = this.f16384G;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m19220m(mediaFormat, "max-input-size", this.f16393g);
        m19220m(mediaFormat, "width", this.f16396r);
        m19220m(mediaFormat, "height", this.f16397s);
        float f = this.f16398t;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m19220m(mediaFormat, "rotation-degrees", this.f16399u);
        m19220m(mediaFormat, "channel-count", this.f16404z);
        m19220m(mediaFormat, "sample-rate", this.f16378A);
        m19220m(mediaFormat, "encoder-delay", this.f16380C);
        m19220m(mediaFormat, "encoder-padding", this.f16381D);
        for (int i = 0; i < this.f16394h.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[]) this.f16394h.get(i)));
        }
        C3004wq wqVar = this.f16403y;
        if (wqVar != null) {
            m19220m(mediaFormat, "color-transfer", wqVar.f19739c);
            m19220m(mediaFormat, "color-standard", wqVar.f19737a);
            m19220m(mediaFormat, "color-range", wqVar.f19738b);
            byte[] bArr = wqVar.f19740d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    /* renamed from: c */
    public final C2774qi mo13540c(C2813rk rkVar) {
        String str = this.f16387a;
        return new C2774qi(str, this.f16391e, this.f16392f, this.f16389c, this.f16388b, this.f16393g, this.f16396r, this.f16397s, this.f16398t, this.f16399u, this.f16400v, this.f16402x, this.f16401w, this.f16403y, this.f16404z, this.f16378A, this.f16379B, this.f16380C, this.f16381D, this.f16383F, this.f16384G, this.f16385H, this.f16382E, this.f16394h, rkVar, this.f16390d);
    }

    /* renamed from: d */
    public final C2774qi mo13541d(int i, int i2) {
        String str = this.f16387a;
        return new C2774qi(str, this.f16391e, this.f16392f, this.f16389c, this.f16388b, this.f16393g, this.f16396r, this.f16397s, this.f16398t, this.f16399u, this.f16400v, this.f16402x, this.f16401w, this.f16403y, this.f16404z, this.f16378A, this.f16379B, i, i2, this.f16383F, this.f16384G, this.f16385H, this.f16382E, this.f16394h, this.f16395i, this.f16390d);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final C2774qi mo13543e(int i) {
        String str = this.f16387a;
        return new C2774qi(str, this.f16391e, this.f16392f, this.f16389c, this.f16388b, i, this.f16396r, this.f16397s, this.f16398t, this.f16399u, this.f16400v, this.f16402x, this.f16401w, this.f16403y, this.f16404z, this.f16378A, this.f16379B, this.f16380C, this.f16381D, this.f16383F, this.f16384G, this.f16385H, this.f16382E, this.f16394h, this.f16395i, this.f16390d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2774qi.class == obj.getClass()) {
            C2774qi qiVar = (C2774qi) obj;
            if (this.f16388b == qiVar.f16388b && this.f16393g == qiVar.f16393g && this.f16396r == qiVar.f16396r && this.f16397s == qiVar.f16397s && this.f16398t == qiVar.f16398t && this.f16399u == qiVar.f16399u && this.f16400v == qiVar.f16400v && this.f16401w == qiVar.f16401w && this.f16404z == qiVar.f16404z && this.f16378A == qiVar.f16378A && this.f16379B == qiVar.f16379B && this.f16380C == qiVar.f16380C && this.f16381D == qiVar.f16381D && this.f16382E == qiVar.f16382E && this.f16383F == qiVar.f16383F && C2893tq.m21184o(this.f16387a, qiVar.f16387a) && C2893tq.m21184o(this.f16384G, qiVar.f16384G) && this.f16385H == qiVar.f16385H && C2893tq.m21184o(this.f16391e, qiVar.f16391e) && C2893tq.m21184o(this.f16392f, qiVar.f16392f) && C2893tq.m21184o(this.f16389c, qiVar.f16389c) && C2893tq.m21184o(this.f16395i, qiVar.f16395i) && C2893tq.m21184o(this.f16390d, qiVar.f16390d) && C2893tq.m21184o(this.f16403y, qiVar.f16403y) && Arrays.equals(this.f16402x, qiVar.f16402x) && this.f16394h.size() == qiVar.f16394h.size()) {
                for (int i = 0; i < this.f16394h.size(); i++) {
                    if (!Arrays.equals((byte[]) this.f16394h.get(i), (byte[]) qiVar.f16394h.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final C2774qi mo13545f(C2407gn gnVar) {
        String str = this.f16387a;
        return new C2774qi(str, this.f16391e, this.f16392f, this.f16389c, this.f16388b, this.f16393g, this.f16396r, this.f16397s, this.f16398t, this.f16399u, this.f16400v, this.f16402x, this.f16401w, this.f16403y, this.f16404z, this.f16378A, this.f16379B, this.f16380C, this.f16381D, this.f16383F, this.f16384G, this.f16385H, this.f16382E, this.f16394h, this.f16395i, gnVar);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f16386I;
        if (i7 != 0) {
            return i7;
        }
        String str = this.f16387a;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = (i + 527) * 31;
        String str2 = this.f16391e;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i10 = (i9 + i2) * 31;
        String str3 = this.f16392f;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i11 = (i10 + i3) * 31;
        String str4 = this.f16389c;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i12 = (((((((((((i11 + i4) * 31) + this.f16388b) * 31) + this.f16396r) * 31) + this.f16397s) * 31) + this.f16404z) * 31) + this.f16378A) * 31;
        String str5 = this.f16384G;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i13 = (((i12 + i5) * 31) + this.f16385H) * 31;
        C2813rk rkVar = this.f16395i;
        if (rkVar == null) {
            i6 = 0;
        } else {
            i6 = rkVar.hashCode();
        }
        int i14 = (i13 + i6) * 31;
        C2407gn gnVar = this.f16390d;
        if (gnVar != null) {
            i8 = gnVar.hashCode();
        }
        int i15 = i14 + i8;
        this.f16386I = i15;
        return i15;
    }

    public final String toString() {
        String str = this.f16387a;
        String str2 = this.f16391e;
        String str3 = this.f16392f;
        int i = this.f16388b;
        String str4 = this.f16384G;
        int i2 = this.f16396r;
        int i3 = this.f16397s;
        float f = this.f16398t;
        int i4 = this.f16404z;
        int i5 = this.f16378A;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + i + ", " + str4 + ", [" + i2 + ", " + i3 + ", " + f + "], [" + i4 + ", " + i5 + "])";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16387a);
        parcel.writeString(this.f16391e);
        parcel.writeString(this.f16392f);
        parcel.writeString(this.f16389c);
        parcel.writeInt(this.f16388b);
        parcel.writeInt(this.f16393g);
        parcel.writeInt(this.f16396r);
        parcel.writeInt(this.f16397s);
        parcel.writeFloat(this.f16398t);
        parcel.writeInt(this.f16399u);
        parcel.writeFloat(this.f16400v);
        parcel.writeInt(this.f16402x != null ? 1 : 0);
        byte[] bArr = this.f16402x;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f16401w);
        parcel.writeParcelable(this.f16403y, i);
        parcel.writeInt(this.f16404z);
        parcel.writeInt(this.f16378A);
        parcel.writeInt(this.f16379B);
        parcel.writeInt(this.f16380C);
        parcel.writeInt(this.f16381D);
        parcel.writeInt(this.f16383F);
        parcel.writeString(this.f16384G);
        parcel.writeInt(this.f16385H);
        parcel.writeLong(this.f16382E);
        int size = this.f16394h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.f16394h.get(i2));
        }
        parcel.writeParcelable(this.f16395i, 0);
        parcel.writeParcelable(this.f16390d, 0);
    }

    C2774qi(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, C3004wq wqVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, C2813rk rkVar, C2407gn gnVar) {
        this.f16387a = str;
        this.f16391e = str2;
        this.f16392f = str3;
        this.f16389c = str4;
        this.f16388b = i;
        this.f16393g = i2;
        this.f16396r = i3;
        this.f16397s = i4;
        this.f16398t = f;
        this.f16399u = i5;
        this.f16400v = f2;
        this.f16402x = bArr;
        this.f16401w = i6;
        this.f16403y = wqVar;
        this.f16404z = i7;
        this.f16378A = i8;
        this.f16379B = i9;
        this.f16380C = i10;
        this.f16381D = i11;
        this.f16383F = i12;
        this.f16384G = str5;
        this.f16385H = i13;
        this.f16382E = j;
        this.f16394h = list == null ? Collections.emptyList() : list;
        this.f16395i = rkVar;
        this.f16390d = gnVar;
    }
}
