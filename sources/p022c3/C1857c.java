package p022c3;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6224h;

/* renamed from: c3.c */
/* compiled from: AdPlaybackState */
public final class C1857c implements C6224h {

    /* renamed from: g */
    public static final C1857c f5461g = new C1857c((Object) null, new C1858a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h */
    private static final C1858a f5462h = new C1858a(0).mo7079j(0);

    /* renamed from: i */
    public static final C6224h.C6225a<C1857c> f5463i = C1855a.f5459a;

    /* renamed from: a */
    public final Object f5464a;

    /* renamed from: b */
    public final int f5465b;

    /* renamed from: c */
    public final long f5466c;

    /* renamed from: d */
    public final long f5467d;

    /* renamed from: e */
    public final int f5468e;

    /* renamed from: f */
    private final C1858a[] f5469f;

    /* renamed from: c3.c$a */
    /* compiled from: AdPlaybackState */
    public static final class C1858a implements C6224h {

        /* renamed from: h */
        public static final C6224h.C6225a<C1858a> f5470h = C1856b.f5460a;

        /* renamed from: a */
        public final long f5471a;

        /* renamed from: b */
        public final int f5472b;

        /* renamed from: c */
        public final Uri[] f5473c;

        /* renamed from: d */
        public final int[] f5474d;

        /* renamed from: e */
        public final long[] f5475e;

        /* renamed from: f */
        public final long f5476f;

        /* renamed from: g */
        public final boolean f5477g;

        public C1858a(long j) {
            this(j, -1, new int[0], new Uri[0], new long[0], 0, false);
        }

        /* renamed from: b */
        private static long[] m8612b(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        /* renamed from: c */
        private static int[] m8613c(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static C1858a m8614d(Bundle bundle) {
            Uri[] uriArr;
            long j = bundle.getLong(m8615h(0));
            int i = bundle.getInt(m8615h(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(m8615h(2));
            int[] intArray = bundle.getIntArray(m8615h(3));
            long[] longArray = bundle.getLongArray(m8615h(4));
            long j2 = bundle.getLong(m8615h(5));
            boolean z = bundle.getBoolean(m8615h(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            int[] iArr = intArray;
            if (parcelableArrayList == null) {
                uriArr = new Uri[0];
            } else {
                uriArr = (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            }
            return new C1858a(j, i, iArr, uriArr, longArray == null ? new long[0] : longArray, j2, z);
        }

        /* renamed from: h */
        private static String m8615h(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: e */
        public int mo7073e() {
            return mo7075f(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1858a.class != obj.getClass()) {
                return false;
            }
            C1858a aVar = (C1858a) obj;
            if (this.f5471a == aVar.f5471a && this.f5472b == aVar.f5472b && Arrays.equals(this.f5473c, aVar.f5473c) && Arrays.equals(this.f5474d, aVar.f5474d) && Arrays.equals(this.f5475e, aVar.f5475e) && this.f5476f == aVar.f5476f && this.f5477g == aVar.f5477g) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public int mo7075f(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f5474d;
                if (i2 >= iArr.length || this.f5477g || iArr[i2] == 0 || iArr[i2] == 1) {
                    return i2;
                }
                i2++;
            }
            return i2;
        }

        /* renamed from: g */
        public boolean mo7076g() {
            if (this.f5472b == -1) {
                return true;
            }
            for (int i = 0; i < this.f5472b; i++) {
                int[] iArr = this.f5474d;
                if (iArr[i] == 0 || iArr[i] == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j = this.f5471a;
            long j2 = this.f5476f;
            return (((((((((((this.f5472b * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f5473c)) * 31) + Arrays.hashCode(this.f5474d)) * 31) + Arrays.hashCode(this.f5475e)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f5477g ? 1 : 0);
        }

        /* renamed from: i */
        public boolean mo7078i() {
            return this.f5472b == -1 || mo7073e() < this.f5472b;
        }

        /* renamed from: j */
        public C1858a mo7079j(int i) {
            int[] c = m8613c(this.f5474d, i);
            long[] b = m8612b(this.f5475e, i);
            return new C1858a(this.f5471a, i, c, (Uri[]) Arrays.copyOf(this.f5473c, i), b, this.f5476f, this.f5477g);
        }

        private C1858a(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            C5917a.m34868a(iArr.length == uriArr.length);
            this.f5471a = j;
            this.f5472b = i;
            this.f5474d = iArr;
            this.f5473c = uriArr;
            this.f5475e = jArr;
            this.f5476f = j2;
            this.f5477g = z;
        }
    }

    private C1857c(Object obj, C1858a[] aVarArr, long j, long j2, int i) {
        this.f5464a = obj;
        this.f5466c = j;
        this.f5467d = j2;
        this.f5465b = aVarArr.length + i;
        this.f5469f = aVarArr;
        this.f5468e = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C1857c m8605b(Bundle bundle) {
        C1858a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m8607g(1));
        if (parcelableArrayList == null) {
            aVarArr = new C1858a[0];
        } else {
            C1858a[] aVarArr2 = new C1858a[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                aVarArr2[i] = C1858a.f5470h.mo6454a((Bundle) parcelableArrayList.get(i));
            }
            aVarArr = aVarArr2;
        }
        return new C1857c((Object) null, aVarArr, bundle.getLong(m8607g(2), 0), bundle.getLong(m8607g(3), -9223372036854775807L), bundle.getInt(m8607g(4)));
    }

    /* renamed from: f */
    private boolean m8606f(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = mo7067c(i).f5471a;
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || j < j2 : j < j3;
    }

    /* renamed from: g */
    private static String m8607g(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: c */
    public C1858a mo7067c(int i) {
        int i2 = this.f5468e;
        if (i < i2) {
            return f5462h;
        }
        return this.f5469f[i - i2];
    }

    /* renamed from: d */
    public int mo7068d(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = this.f5468e;
        while (i < this.f5465b && ((mo7067c(i).f5471a != Long.MIN_VALUE && mo7067c(i).f5471a <= j) || !mo7067c(i).mo7078i())) {
            i++;
        }
        if (i < this.f5465b) {
            return i;
        }
        return -1;
    }

    /* renamed from: e */
    public int mo7069e(long j, long j2) {
        int i = this.f5465b - 1;
        while (i >= 0 && m8606f(j, j2, i)) {
            i--;
        }
        if (i < 0 || !mo7067c(i).mo7076g()) {
            return -1;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1857c.class != obj.getClass()) {
            return false;
        }
        C1857c cVar = (C1857c) obj;
        if (C5953m0.m35124c(this.f5464a, cVar.f5464a) && this.f5465b == cVar.f5465b && this.f5466c == cVar.f5466c && this.f5467d == cVar.f5467d && this.f5468e == cVar.f5468e && Arrays.equals(this.f5469f, cVar.f5469f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f5465b * 31;
        Object obj = this.f5464a;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f5466c)) * 31) + ((int) this.f5467d)) * 31) + this.f5468e) * 31) + Arrays.hashCode(this.f5469f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f5464a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f5466c);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f5469f.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f5469f[i].f5471a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.f5469f[i].f5474d.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.f5469f[i].f5474d[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f5469f[i].f5475e[i2]);
                sb.append(')');
                if (i2 < this.f5469f[i].f5474d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f5469f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
