package p059h3;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p005a3.C0093c;
import p030d2.C4035m;
import p190b7.C6685q;
import p190b7.C6690r;
import p190b7.C6696t;

/* renamed from: h3.g */
/* compiled from: HlsMediaPlaylist */
public final class C4449g extends C4459i {

    /* renamed from: d */
    public final int f24694d;

    /* renamed from: e */
    public final long f24695e;

    /* renamed from: f */
    public final boolean f24696f;

    /* renamed from: g */
    public final boolean f24697g;

    /* renamed from: h */
    public final long f24698h;

    /* renamed from: i */
    public final boolean f24699i;

    /* renamed from: j */
    public final int f24700j;

    /* renamed from: k */
    public final long f24701k;

    /* renamed from: l */
    public final int f24702l;

    /* renamed from: m */
    public final long f24703m;

    /* renamed from: n */
    public final long f24704n;

    /* renamed from: o */
    public final boolean f24705o;

    /* renamed from: p */
    public final boolean f24706p;

    /* renamed from: q */
    public final C4035m f24707q;

    /* renamed from: r */
    public final List<C4453d> f24708r;

    /* renamed from: s */
    public final List<C4451b> f24709s;

    /* renamed from: t */
    public final Map<Uri, C4452c> f24710t;

    /* renamed from: u */
    public final long f24711u;

    /* renamed from: v */
    public final C4455f f24712v;

    /* renamed from: h3.g$b */
    /* compiled from: HlsMediaPlaylist */
    public static final class C4451b extends C4454e {

        /* renamed from: t */
        public final boolean f24713t;

        /* renamed from: u */
        public final boolean f24714u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4451b(String str, C4453d dVar, long j, int i, long j2, C4035m mVar, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, dVar, j, i, j2, mVar, str2, str3, j3, j4, z);
            this.f24713t = z2;
            this.f24714u = z3;
        }

        /* renamed from: b */
        public C4451b mo18001b(long j, int i) {
            int i2 = i;
            return new C4451b(this.f24720a, this.f24721b, this.f24722c, i2, j, this.f24725f, this.f24726g, this.f24727h, this.f24728i, this.f24729r, this.f24730s, this.f24713t, this.f24714u);
        }
    }

    /* renamed from: h3.g$c */
    /* compiled from: HlsMediaPlaylist */
    public static final class C4452c {

        /* renamed from: a */
        public final Uri f24715a;

        /* renamed from: b */
        public final long f24716b;

        /* renamed from: c */
        public final int f24717c;

        public C4452c(Uri uri, long j, int i) {
            this.f24715a = uri;
            this.f24716b = j;
            this.f24717c = i;
        }
    }

    /* renamed from: h3.g$e */
    /* compiled from: HlsMediaPlaylist */
    public static class C4454e implements Comparable<Long> {

        /* renamed from: a */
        public final String f24720a;

        /* renamed from: b */
        public final C4453d f24721b;

        /* renamed from: c */
        public final long f24722c;

        /* renamed from: d */
        public final int f24723d;

        /* renamed from: e */
        public final long f24724e;

        /* renamed from: f */
        public final C4035m f24725f;

        /* renamed from: g */
        public final String f24726g;

        /* renamed from: h */
        public final String f24727h;

        /* renamed from: i */
        public final long f24728i;

        /* renamed from: r */
        public final long f24729r;

        /* renamed from: s */
        public final boolean f24730s;

        /* renamed from: a */
        public int compareTo(Long l) {
            if (this.f24724e > l.longValue()) {
                return 1;
            }
            return this.f24724e < l.longValue() ? -1 : 0;
        }

        private C4454e(String str, C4453d dVar, long j, int i, long j2, C4035m mVar, String str2, String str3, long j3, long j4, boolean z) {
            this.f24720a = str;
            this.f24721b = dVar;
            this.f24722c = j;
            this.f24723d = i;
            this.f24724e = j2;
            this.f24725f = mVar;
            this.f24726g = str2;
            this.f24727h = str3;
            this.f24728i = j3;
            this.f24729r = j4;
            this.f24730s = z;
        }
    }

    /* renamed from: h3.g$f */
    /* compiled from: HlsMediaPlaylist */
    public static final class C4455f {

        /* renamed from: a */
        public final long f24731a;

        /* renamed from: b */
        public final boolean f24732b;

        /* renamed from: c */
        public final long f24733c;

        /* renamed from: d */
        public final long f24734d;

        /* renamed from: e */
        public final boolean f24735e;

        public C4455f(long j, boolean z, long j2, long j3, boolean z2) {
            this.f24731a = j;
            this.f24732b = z;
            this.f24733c = j2;
            this.f24734d = j3;
            this.f24735e = z2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4449g(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, C4035m mVar, List<C4453d> list2, List<C4451b> list3, C4455f fVar, Map<Uri, C4452c> map) {
        super(str, list, z3);
        long j6 = j;
        String str2 = str;
        List<String> list4 = list;
        this.f24694d = i;
        this.f24698h = j2;
        this.f24697g = z;
        this.f24699i = z2;
        this.f24700j = i2;
        this.f24701k = j3;
        this.f24702l = i3;
        this.f24703m = j4;
        this.f24704n = j5;
        this.f24705o = z4;
        this.f24706p = z5;
        this.f24707q = mVar;
        this.f24708r = C6685q.m38443t(list2);
        this.f24709s = C6685q.m38443t(list3);
        this.f24710t = C6690r.m38471d(map);
        if (!list3.isEmpty()) {
            C4451b bVar = (C4451b) C6696t.m38506c(list3);
            this.f24711u = bVar.f24724e + bVar.f24722c;
        } else if (!list2.isEmpty()) {
            C4453d dVar = (C4453d) C6696t.m38506c(list2);
            this.f24711u = dVar.f24724e + dVar.f24722c;
        } else {
            this.f24711u = 0;
        }
        long j7 = -9223372036854775807L;
        if (j6 != -9223372036854775807L) {
            if (j6 >= 0) {
                j7 = Math.min(this.f24711u, j);
            } else {
                j7 = Math.max(0, this.f24711u + j6);
            }
        }
        this.f24695e = j7;
        this.f24696f = j6 >= 0;
        this.f24712v = fVar;
    }

    /* renamed from: b */
    public C4449g mo215a(List<C0093c> list) {
        return this;
    }

    /* renamed from: c */
    public C4449g mo17997c(long j, int i) {
        int i2 = this.f24694d;
        return new C4449g(i2, this.f24757a, this.f24758b, this.f24695e, this.f24697g, j, true, i, this.f24701k, this.f24702l, this.f24703m, this.f24704n, this.f24759c, this.f24705o, this.f24706p, this.f24707q, this.f24708r, this.f24709s, this.f24712v, this.f24710t);
    }

    /* renamed from: d */
    public C4449g mo17998d() {
        if (this.f24705o) {
            return this;
        }
        C4449g gVar = r2;
        C4449g gVar2 = new C4449g(this.f24694d, this.f24757a, this.f24758b, this.f24695e, this.f24697g, this.f24698h, this.f24699i, this.f24700j, this.f24701k, this.f24702l, this.f24703m, this.f24704n, this.f24759c, true, this.f24706p, this.f24707q, this.f24708r, this.f24709s, this.f24712v, this.f24710t);
        return gVar;
    }

    /* renamed from: e */
    public long mo17999e() {
        return this.f24698h + this.f24711u;
    }

    /* renamed from: f */
    public boolean mo18000f(C4449g gVar) {
        if (gVar == null) {
            return true;
        }
        long j = this.f24701k;
        long j2 = gVar.f24701k;
        if (j > j2) {
            return true;
        }
        if (j < j2) {
            return false;
        }
        int size = this.f24708r.size() - gVar.f24708r.size();
        if (size == 0) {
            int size2 = this.f24709s.size();
            int size3 = gVar.f24709s.size();
            if (size2 > size3) {
                return true;
            }
            if (size2 != size3 || !this.f24705o || gVar.f24705o) {
                return false;
            }
            return true;
        } else if (size > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: h3.g$d */
    /* compiled from: HlsMediaPlaylist */
    public static final class C4453d extends C4454e {

        /* renamed from: t */
        public final String f24718t;

        /* renamed from: u */
        public final List<C4451b> f24719u;

        public C4453d(String str, long j, long j2, String str2, String str3) {
            this(str, (C4453d) null, "", 0, -1, -9223372036854775807L, (C4035m) null, str2, str3, j, j2, false, C6685q.m38445x());
        }

        /* renamed from: b */
        public C4453d mo18002b(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.f24719u.size(); i2++) {
                C4451b bVar = this.f24719u.get(i2);
                arrayList.add(bVar.mo18001b(j2, i));
                j2 += bVar.f24722c;
            }
            int i3 = i;
            return new C4453d(this.f24720a, this.f24721b, this.f24718t, this.f24722c, i, j, this.f24725f, this.f24726g, this.f24727h, this.f24728i, this.f24729r, this.f24730s, arrayList);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4453d(String str, C4453d dVar, String str2, long j, int i, long j2, C4035m mVar, String str3, String str4, long j3, long j4, boolean z, List<C4451b> list) {
            super(str, dVar, j, i, j2, mVar, str3, str4, j3, j4, z);
            this.f24718t = str2;
            this.f24719u = C6685q.m38443t(list);
        }
    }
}
