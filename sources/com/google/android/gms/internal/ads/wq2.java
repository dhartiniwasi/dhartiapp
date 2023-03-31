package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class wq2 {

    /* renamed from: a */
    public final Uri f19753a;

    /* renamed from: b */
    public final int f19754b;

    /* renamed from: c */
    public final byte[] f19755c;

    /* renamed from: d */
    public final Map f19756d;
    @Deprecated

    /* renamed from: e */
    public final long f19757e;

    /* renamed from: f */
    public final long f19758f;

    /* renamed from: g */
    public final long f19759g;

    /* renamed from: h */
    public final String f19760h;

    /* renamed from: i */
    public final int f19761i;

    static {
        C2492ix.m14583b("media3.datasource");
    }

    private wq2(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j2;
        long j5 = j + j4;
        boolean z = false;
        v91.m22050d(j5 >= 0);
        v91.m22050d(j4 >= 0);
        long j6 = -1;
        if (j3 > 0) {
            j6 = j3;
        } else if (j3 != -1) {
            j6 = j3;
            v91.m22050d(z);
            this.f19753a = uri;
            this.f19754b = 1;
            this.f19755c = null;
            this.f19756d = Collections.unmodifiableMap(new HashMap(map));
            this.f19758f = j4;
            this.f19757e = j5;
            this.f19759g = j6;
            this.f19760h = null;
            this.f19761i = i2;
        }
        z = true;
        v91.m22050d(z);
        this.f19753a = uri;
        this.f19754b = 1;
        this.f19755c = null;
        this.f19756d = Collections.unmodifiableMap(new HashMap(map));
        this.f19758f = j4;
        this.f19757e = j5;
        this.f19759g = j6;
        this.f19760h = null;
        this.f19761i = i2;
    }

    /* synthetic */ wq2(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, vp2 vp2) {
        this(uri, 0, 1, (byte[]) null, map, j2, -1, (String) null, i2, (Object) null);
    }

    /* renamed from: a */
    public static String m22886a(int i) {
        return "GET";
    }

    /* renamed from: b */
    public final boolean mo14977b(int i) {
        return (this.f19761i & i) == i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19753a);
        long j = this.f19758f;
        long j2 = this.f19759g;
        int i = this.f19761i;
        return "DataSpec[" + m22886a(1) + " " + valueOf + ", " + j + ", " + j2 + ", null, " + i + "]";
    }

    @Deprecated
    public wq2(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, j - j2, 1, (byte[]) null, Collections.emptyMap(), j2, j3, (String) null, i, (Object) null);
    }
}
