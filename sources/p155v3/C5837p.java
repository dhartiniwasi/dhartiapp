package p155v3;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p161w3.C5917a;
import p177z1.C6260o1;

/* renamed from: v3.p */
/* compiled from: DataSpec */
public final class C5837p {

    /* renamed from: a */
    public final Uri f28881a;

    /* renamed from: b */
    public final long f28882b;

    /* renamed from: c */
    public final int f28883c;

    /* renamed from: d */
    public final byte[] f28884d;

    /* renamed from: e */
    public final Map<String, String> f28885e;
    @Deprecated

    /* renamed from: f */
    public final long f28886f;

    /* renamed from: g */
    public final long f28887g;

    /* renamed from: h */
    public final long f28888h;

    /* renamed from: i */
    public final String f28889i;

    /* renamed from: j */
    public final int f28890j;

    /* renamed from: k */
    public final Object f28891k;

    /* renamed from: v3.p$b */
    /* compiled from: DataSpec */
    public static final class C5839b {

        /* renamed from: a */
        private Uri f28892a;

        /* renamed from: b */
        private long f28893b;

        /* renamed from: c */
        private int f28894c;

        /* renamed from: d */
        private byte[] f28895d;

        /* renamed from: e */
        private Map<String, String> f28896e;

        /* renamed from: f */
        private long f28897f;

        /* renamed from: g */
        private long f28898g;

        /* renamed from: h */
        private String f28899h;

        /* renamed from: i */
        private int f28900i;

        /* renamed from: j */
        private Object f28901j;

        /* renamed from: a */
        public C5837p mo20372a() {
            C5917a.m34876i(this.f28892a, "The uri must be set.");
            return new C5837p(this.f28892a, this.f28893b, this.f28894c, this.f28895d, this.f28896e, this.f28897f, this.f28898g, this.f28899h, this.f28900i, this.f28901j);
        }

        /* renamed from: b */
        public C5839b mo20373b(int i) {
            this.f28900i = i;
            return this;
        }

        /* renamed from: c */
        public C5839b mo20374c(byte[] bArr) {
            this.f28895d = bArr;
            return this;
        }

        /* renamed from: d */
        public C5839b mo20375d(int i) {
            this.f28894c = i;
            return this;
        }

        /* renamed from: e */
        public C5839b mo20376e(Map<String, String> map) {
            this.f28896e = map;
            return this;
        }

        /* renamed from: f */
        public C5839b mo20377f(String str) {
            this.f28899h = str;
            return this;
        }

        /* renamed from: g */
        public C5839b mo20378g(long j) {
            this.f28898g = j;
            return this;
        }

        /* renamed from: h */
        public C5839b mo20379h(long j) {
            this.f28897f = j;
            return this;
        }

        /* renamed from: i */
        public C5839b mo20380i(Uri uri) {
            this.f28892a = uri;
            return this;
        }

        /* renamed from: j */
        public C5839b mo20381j(String str) {
            this.f28892a = Uri.parse(str);
            return this;
        }

        public C5839b() {
            this.f28894c = 1;
            this.f28896e = Collections.emptyMap();
            this.f28898g = -1;
        }

        private C5839b(C5837p pVar) {
            this.f28892a = pVar.f28881a;
            this.f28893b = pVar.f28882b;
            this.f28894c = pVar.f28883c;
            this.f28895d = pVar.f28884d;
            this.f28896e = pVar.f28885e;
            this.f28897f = pVar.f28887g;
            this.f28898g = pVar.f28888h;
            this.f28899h = pVar.f28889i;
            this.f28900i = pVar.f28890j;
            this.f28901j = pVar.f28891k;
        }
    }

    static {
        C6260o1.m36802a("goog.exo.datasource");
    }

    /* renamed from: c */
    public static String m34634c(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C5839b mo20366a() {
        return new C5839b();
    }

    /* renamed from: b */
    public final String mo20367b() {
        return m34634c(this.f28883c);
    }

    /* renamed from: d */
    public boolean mo20368d(int i) {
        return (this.f28890j & i) == i;
    }

    /* renamed from: e */
    public C5837p mo20369e(long j) {
        long j2 = this.f28888h;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return mo20370f(j, j3);
    }

    /* renamed from: f */
    public C5837p mo20370f(long j, long j2) {
        if (j == 0 && this.f28888h == j2) {
            return this;
        }
        return new C5837p(this.f28881a, this.f28882b, this.f28883c, this.f28884d, this.f28885e, this.f28887g + j, j2, this.f28889i, this.f28890j, this.f28891k);
    }

    public String toString() {
        return "DataSpec[" + mo20367b() + " " + this.f28881a + ", " + this.f28887g + ", " + this.f28888h + ", " + this.f28889i + ", " + this.f28890j + "]";
    }

    public C5837p(Uri uri) {
        this(uri, 0, -1);
    }

    public C5837p(Uri uri, long j, long j2) {
        this(uri, 0, 1, (byte[]) null, Collections.emptyMap(), j, j2, (String) null, 0, (Object) null);
    }

    private C5837p(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j;
        byte[] bArr2 = bArr;
        long j5 = j2;
        long j6 = j3;
        long j7 = j4 + j5;
        boolean z = true;
        C5917a.m34868a(j7 >= 0);
        C5917a.m34868a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        C5917a.m34868a(z);
        this.f28881a = uri;
        this.f28882b = j4;
        this.f28883c = i;
        this.f28884d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f28885e = Collections.unmodifiableMap(new HashMap(map));
        this.f28887g = j5;
        this.f28886f = j7;
        this.f28888h = j6;
        this.f28889i = str;
        this.f28890j = i2;
        this.f28891k = obj;
    }
}
