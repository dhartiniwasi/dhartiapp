package p177z1;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import p022c3.C1857c;
import p161w3.C5917a;
import p161w3.C5919b;
import p161w3.C5953m0;
import p177z1.C6224h;
import p177z1.C6300z1;
import p190b7.C6685q;

/* renamed from: z1.q3 */
/* compiled from: Timeline */
public abstract class C6266q3 implements C6224h {

    /* renamed from: a */
    public static final C6266q3 f30181a = new C6267a();

    /* renamed from: b */
    public static final C6224h.C6225a<C6266q3> f30182b = C13416p3.f47754a;

    /* renamed from: z1.q3$a */
    /* compiled from: Timeline */
    class C6267a extends C6266q3 {
        C6267a() {
        }

        /* renamed from: f */
        public int mo6809f(Object obj) {
            return -1;
        }

        /* renamed from: k */
        public C6268b mo6711k(int i, C6268b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: m */
        public int mo6760m() {
            return 0;
        }

        /* renamed from: q */
        public Object mo6813q(int i) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: s */
        public C6270d mo6712s(int i, C6270d dVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: t */
        public int mo6761t() {
            return 0;
        }
    }

    /* renamed from: z1.q3$b */
    /* compiled from: Timeline */
    public static final class C6268b implements C6224h {

        /* renamed from: h */
        public static final C6224h.C6225a<C6268b> f30183h = C13420r3.f47758a;

        /* renamed from: a */
        public Object f30184a;

        /* renamed from: b */
        public Object f30185b;

        /* renamed from: c */
        public int f30186c;

        /* renamed from: d */
        public long f30187d;

        /* renamed from: e */
        public long f30188e;

        /* renamed from: f */
        public boolean f30189f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C1857c f30190g = C1857c.f5461g;

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static C6268b m36856c(Bundle bundle) {
            C1857c cVar;
            int i = bundle.getInt(m36857u(0), 0);
            long j = bundle.getLong(m36857u(1), -9223372036854775807L);
            long j2 = bundle.getLong(m36857u(2), 0);
            boolean z = bundle.getBoolean(m36857u(3));
            Bundle bundle2 = bundle.getBundle(m36857u(4));
            if (bundle2 != null) {
                cVar = C1857c.f5463i.mo6454a(bundle2);
            } else {
                cVar = C1857c.f5461g;
            }
            C1857c cVar2 = cVar;
            C6268b bVar = new C6268b();
            bVar.mo21473w((Object) null, (Object) null, i, j, j2, cVar2, z);
            return bVar;
        }

        /* renamed from: u */
        private static String m36857u(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: d */
        public int mo21453d(int i) {
            return this.f30190g.mo7067c(i).f5472b;
        }

        /* renamed from: e */
        public long mo21454e(int i, int i2) {
            C1857c.C1858a c = this.f30190g.mo7067c(i);
            if (c.f5472b != -1) {
                return c.f5475e[i2];
            }
            return -9223372036854775807L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C6268b.class.equals(obj.getClass())) {
                return false;
            }
            C6268b bVar = (C6268b) obj;
            if (C5953m0.m35124c(this.f30184a, bVar.f30184a) && C5953m0.m35124c(this.f30185b, bVar.f30185b) && this.f30186c == bVar.f30186c && this.f30187d == bVar.f30187d && this.f30188e == bVar.f30188e && this.f30189f == bVar.f30189f && C5953m0.m35124c(this.f30190g, bVar.f30190g)) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public int mo21456f() {
            return this.f30190g.f5465b;
        }

        /* renamed from: g */
        public int mo21457g(long j) {
            return this.f30190g.mo7068d(j, this.f30187d);
        }

        /* renamed from: h */
        public int mo21458h(long j) {
            return this.f30190g.mo7069e(j, this.f30187d);
        }

        public int hashCode() {
            Object obj = this.f30184a;
            int i = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f30185b;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            long j = this.f30187d;
            long j2 = this.f30188e;
            return ((((((((((hashCode + i) * 31) + this.f30186c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f30189f ? 1 : 0)) * 31) + this.f30190g.hashCode();
        }

        /* renamed from: i */
        public long mo21460i(int i) {
            return this.f30190g.mo7067c(i).f5471a;
        }

        /* renamed from: j */
        public long mo21461j() {
            return this.f30190g.f5466c;
        }

        /* renamed from: k */
        public int mo21462k(int i, int i2) {
            C1857c.C1858a c = this.f30190g.mo7067c(i);
            if (c.f5472b != -1) {
                return c.f5474d[i2];
            }
            return 0;
        }

        /* renamed from: l */
        public long mo21463l(int i) {
            return this.f30190g.mo7067c(i).f5476f;
        }

        /* renamed from: m */
        public long mo21464m() {
            return this.f30187d;
        }

        /* renamed from: n */
        public int mo21465n(int i) {
            return this.f30190g.mo7067c(i).mo7073e();
        }

        /* renamed from: o */
        public int mo21466o(int i, int i2) {
            return this.f30190g.mo7067c(i).mo7075f(i2);
        }

        /* renamed from: p */
        public long mo21467p() {
            return C5953m0.m35117Y0(this.f30188e);
        }

        /* renamed from: q */
        public long mo21468q() {
            return this.f30188e;
        }

        /* renamed from: r */
        public int mo21469r() {
            return this.f30190g.f5468e;
        }

        /* renamed from: s */
        public boolean mo21470s(int i) {
            return !this.f30190g.mo7067c(i).mo7076g();
        }

        /* renamed from: t */
        public boolean mo21471t(int i) {
            return this.f30190g.mo7067c(i).f5477g;
        }

        /* renamed from: v */
        public C6268b mo21472v(Object obj, Object obj2, int i, long j, long j2) {
            return mo21473w(obj, obj2, i, j, j2, C1857c.f5461g, false);
        }

        /* renamed from: w */
        public C6268b mo21473w(Object obj, Object obj2, int i, long j, long j2, C1857c cVar, boolean z) {
            this.f30184a = obj;
            this.f30185b = obj2;
            this.f30186c = i;
            this.f30187d = j;
            this.f30188e = j2;
            this.f30190g = cVar;
            this.f30189f = z;
            return this;
        }
    }

    /* renamed from: z1.q3$c */
    /* compiled from: Timeline */
    public static final class C6269c extends C6266q3 {

        /* renamed from: c */
        private final C6685q<C6270d> f30191c;

        /* renamed from: d */
        private final C6685q<C6268b> f30192d;

        /* renamed from: e */
        private final int[] f30193e;

        /* renamed from: f */
        private final int[] f30194f;

        public C6269c(C6685q<C6270d> qVar, C6685q<C6268b> qVar2, int[] iArr) {
            C5917a.m34868a(qVar.size() == iArr.length);
            this.f30191c = qVar;
            this.f30192d = qVar2;
            this.f30193e = iArr;
            this.f30194f = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f30194f[iArr[i]] = i;
            }
        }

        /* renamed from: e */
        public int mo6808e(boolean z) {
            if (mo21451u()) {
                return -1;
            }
            if (z) {
                return this.f30193e[0];
            }
            return 0;
        }

        /* renamed from: f */
        public int mo6809f(Object obj) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public int mo6810g(boolean z) {
            if (mo21451u()) {
                return -1;
            }
            if (z) {
                return this.f30193e[mo6761t() - 1];
            }
            return mo6761t() - 1;
        }

        /* renamed from: i */
        public int mo6811i(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo6810g(z)) {
                return z ? this.f30193e[this.f30194f[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return mo6808e(z);
            }
            return -1;
        }

        /* renamed from: k */
        public C6268b mo6711k(int i, C6268b bVar, boolean z) {
            C6268b bVar2 = this.f30192d.get(i);
            bVar.mo21473w(bVar2.f30184a, bVar2.f30185b, bVar2.f30186c, bVar2.f30187d, bVar2.f30188e, bVar2.f30190g, bVar2.f30189f);
            return bVar;
        }

        /* renamed from: m */
        public int mo6760m() {
            return this.f30192d.size();
        }

        /* renamed from: p */
        public int mo6812p(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo6808e(z)) {
                return z ? this.f30193e[this.f30194f[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return mo6810g(z);
            }
            return -1;
        }

        /* renamed from: q */
        public Object mo6813q(int i) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: s */
        public C6270d mo6712s(int i, C6270d dVar, long j) {
            C6270d dVar2 = dVar;
            C6270d dVar3 = this.f30191c.get(i);
            Object obj = dVar3.f30199a;
            C6300z1 z1Var = dVar3.f30201c;
            C6300z1 z1Var2 = z1Var;
            C6270d dVar4 = dVar3;
            C6270d dVar5 = dVar;
            dVar5.mo21482j(obj, z1Var2, dVar3.f30202d, dVar3.f30203e, dVar3.f30204f, dVar3.f30205g, dVar3.f30206h, dVar3.f30207i, dVar3.f30209s, dVar3.f30211u, dVar4.f30212v, dVar4.f30213w, dVar4.f30214x, dVar4.f30215y);
            C6270d dVar6 = dVar;
            dVar6.f30210t = dVar4.f30210t;
            return dVar6;
        }

        /* renamed from: t */
        public int mo6761t() {
            return this.f30191c.size();
        }
    }

    /* renamed from: z1.q3$d */
    /* compiled from: Timeline */
    public static final class C6270d implements C6224h {

        /* renamed from: A */
        private static final Object f30195A = new Object();

        /* renamed from: B */
        private static final C6300z1 f30196B = new C6300z1.C6303c().mo21589c("com.google.android.exoplayer2.Timeline").mo21592f(Uri.EMPTY).mo21587a();

        /* renamed from: C */
        public static final C6224h.C6225a<C6270d> f30197C = C13423s3.f47761a;

        /* renamed from: z */
        public static final Object f30198z = new Object();

        /* renamed from: a */
        public Object f30199a = f30198z;
        @Deprecated

        /* renamed from: b */
        public Object f30200b;

        /* renamed from: c */
        public C6300z1 f30201c = f30196B;

        /* renamed from: d */
        public Object f30202d;

        /* renamed from: e */
        public long f30203e;

        /* renamed from: f */
        public long f30204f;

        /* renamed from: g */
        public long f30205g;

        /* renamed from: h */
        public boolean f30206h;

        /* renamed from: i */
        public boolean f30207i;
        @Deprecated

        /* renamed from: r */
        public boolean f30208r;

        /* renamed from: s */
        public C6300z1.C6309g f30209s;

        /* renamed from: t */
        public boolean f30210t;

        /* renamed from: u */
        public long f30211u;

        /* renamed from: v */
        public long f30212v;

        /* renamed from: w */
        public int f30213w;

        /* renamed from: x */
        public int f30214x;

        /* renamed from: y */
        public long f30215y;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C6270d m36888b(Bundle bundle) {
            Bundle bundle2 = bundle;
            Bundle bundle3 = bundle2.getBundle(m36889i(1));
            C6300z1.C6309g gVar = null;
            C6300z1 a = bundle3 != null ? C6300z1.f30389r.mo6454a(bundle3) : null;
            long j = bundle2.getLong(m36889i(2), -9223372036854775807L);
            long j2 = bundle2.getLong(m36889i(3), -9223372036854775807L);
            long j3 = bundle2.getLong(m36889i(4), -9223372036854775807L);
            boolean z = bundle2.getBoolean(m36889i(5), false);
            boolean z2 = bundle2.getBoolean(m36889i(6), false);
            Bundle bundle4 = bundle2.getBundle(m36889i(7));
            if (bundle4 != null) {
                gVar = C6300z1.C6309g.f30444g.mo6454a(bundle4);
            }
            boolean z3 = bundle2.getBoolean(m36889i(8), false);
            long j4 = bundle2.getLong(m36889i(9), 0);
            long j5 = bundle2.getLong(m36889i(10), -9223372036854775807L);
            int i = bundle2.getInt(m36889i(11), 0);
            int i2 = bundle2.getInt(m36889i(12), 0);
            long j6 = bundle2.getLong(m36889i(13), 0);
            C6270d dVar = r0;
            C6270d dVar2 = new C6270d();
            dVar.mo21482j(f30195A, a, (Object) null, j, j2, j3, z, z2, gVar, j4, j5, i, i2, j6);
            dVar2.f30210t = z3;
            return dVar2;
        }

        /* renamed from: i */
        private static String m36889i(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: c */
        public long mo21474c() {
            return C5953m0.m35121a0(this.f30205g);
        }

        /* renamed from: d */
        public long mo21475d() {
            return C5953m0.m35117Y0(this.f30211u);
        }

        /* renamed from: e */
        public long mo21476e() {
            return this.f30211u;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C6270d.class.equals(obj.getClass())) {
                return false;
            }
            C6270d dVar = (C6270d) obj;
            if (C5953m0.m35124c(this.f30199a, dVar.f30199a) && C5953m0.m35124c(this.f30201c, dVar.f30201c) && C5953m0.m35124c(this.f30202d, dVar.f30202d) && C5953m0.m35124c(this.f30209s, dVar.f30209s) && this.f30203e == dVar.f30203e && this.f30204f == dVar.f30204f && this.f30205g == dVar.f30205g && this.f30206h == dVar.f30206h && this.f30207i == dVar.f30207i && this.f30210t == dVar.f30210t && this.f30211u == dVar.f30211u && this.f30212v == dVar.f30212v && this.f30213w == dVar.f30213w && this.f30214x == dVar.f30214x && this.f30215y == dVar.f30215y) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public long mo21478f() {
            return C5953m0.m35117Y0(this.f30212v);
        }

        /* renamed from: g */
        public long mo21479g() {
            return this.f30215y;
        }

        /* renamed from: h */
        public boolean mo21480h() {
            C5917a.m34873f(this.f30208r == (this.f30209s != null));
            if (this.f30209s != null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f30199a.hashCode()) * 31) + this.f30201c.hashCode()) * 31;
            Object obj = this.f30202d;
            int i = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C6300z1.C6309g gVar = this.f30209s;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            long j = this.f30203e;
            long j2 = this.f30204f;
            long j3 = this.f30205g;
            long j4 = this.f30211u;
            long j5 = this.f30212v;
            long j6 = this.f30215y;
            return ((((((((((((((((((((((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f30206h ? 1 : 0)) * 31) + (this.f30207i ? 1 : 0)) * 31) + (this.f30210t ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f30213w) * 31) + this.f30214x) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
            r1 = r1.f30391b;
         */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p177z1.C6266q3.C6270d mo21482j(java.lang.Object r6, p177z1.C6300z1 r7, java.lang.Object r8, long r9, long r11, long r13, boolean r15, boolean r16, p177z1.C6300z1.C6309g r17, long r18, long r20, int r22, int r23, long r24) {
            /*
                r5 = this;
                r0 = r5
                r1 = r7
                r2 = r17
                r3 = r6
                r0.f30199a = r3
                if (r1 == 0) goto L_0x000b
                r3 = r1
                goto L_0x000d
            L_0x000b:
                z1.z1 r3 = f30196B
            L_0x000d:
                r0.f30201c = r3
                if (r1 == 0) goto L_0x0018
                z1.z1$h r1 = r1.f30391b
                if (r1 == 0) goto L_0x0018
                java.lang.Object r1 = r1.f30463i
                goto L_0x0019
            L_0x0018:
                r1 = 0
            L_0x0019:
                r0.f30200b = r1
                r1 = r8
                r0.f30202d = r1
                r3 = r9
                r0.f30203e = r3
                r3 = r11
                r0.f30204f = r3
                r3 = r13
                r0.f30205g = r3
                r1 = r15
                r0.f30206h = r1
                r1 = r16
                r0.f30207i = r1
                r1 = 0
                if (r2 == 0) goto L_0x0033
                r3 = 1
                goto L_0x0034
            L_0x0033:
                r3 = 0
            L_0x0034:
                r0.f30208r = r3
                r0.f30209s = r2
                r2 = r18
                r0.f30211u = r2
                r2 = r20
                r0.f30212v = r2
                r2 = r22
                r0.f30213w = r2
                r2 = r23
                r0.f30214x = r2
                r2 = r24
                r0.f30215y = r2
                r0.f30210t = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p177z1.C6266q3.C6270d.mo21482j(java.lang.Object, z1.z1, java.lang.Object, long, long, long, boolean, boolean, z1.z1$g, long, long, int, int, long):z1.q3$d");
        }
    }

    protected C6266q3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C6266q3 m36826b(Bundle bundle) {
        C6685q<C6270d> c = m36827c(C6270d.f30197C, C5919b.m34919a(bundle, m36829w(0)));
        C6685q<C6268b> c2 = m36827c(C6268b.f30183h, C5919b.m34919a(bundle, m36829w(1)));
        int[] intArray = bundle.getIntArray(m36829w(2));
        if (intArray == null) {
            intArray = m36828d(c.size());
        }
        return new C6269c(c, c2, intArray);
    }

    /* renamed from: c */
    private static <T extends C6224h> C6685q<T> m36827c(C6224h.C6225a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return C6685q.m38445x();
        }
        C6685q.C6686a aVar2 = new C6685q.C6686a();
        C6685q<Bundle> a = C6221g.m36498a(iBinder);
        for (int i = 0; i < a.size(); i++) {
            aVar2.mo22506a(aVar.mo6454a(a.get(i)));
        }
        return aVar2.mo22547h();
    }

    /* renamed from: d */
    private static int[] m36828d(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    /* renamed from: w */
    private static String m36829w(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: e */
    public int mo6808e(boolean z) {
        return mo21451u() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        int g;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6266q3)) {
            return false;
        }
        C6266q3 q3Var = (C6266q3) obj;
        if (q3Var.mo6761t() != mo6761t() || q3Var.mo6760m() != mo6760m()) {
            return false;
        }
        C6270d dVar = new C6270d();
        C6268b bVar = new C6268b();
        C6270d dVar2 = new C6270d();
        C6268b bVar2 = new C6268b();
        for (int i = 0; i < mo6761t(); i++) {
            if (!mo21450r(i, dVar).equals(q3Var.mo21450r(i, dVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo6760m(); i2++) {
            if (!mo6711k(i2, bVar, true).equals(q3Var.mo6711k(i2, bVar2, true))) {
                return false;
            }
        }
        int e = mo6808e(true);
        if (e != q3Var.mo6808e(true) || (g = mo6810g(true)) != q3Var.mo6810g(true)) {
            return false;
        }
        while (e != g) {
            int i3 = mo6811i(e, 0, true);
            if (i3 != q3Var.mo6811i(e, 0, true)) {
                return false;
            }
            e = i3;
        }
        return true;
    }

    /* renamed from: f */
    public abstract int mo6809f(Object obj);

    /* renamed from: g */
    public int mo6810g(boolean z) {
        if (mo21451u()) {
            return -1;
        }
        return mo6761t() - 1;
    }

    /* renamed from: h */
    public final int mo21445h(int i, C6268b bVar, C6270d dVar, int i2, boolean z) {
        int i3 = mo21447j(i, bVar).f30186c;
        if (mo21450r(i3, dVar).f30214x != i) {
            return i + 1;
        }
        int i4 = mo6811i(i3, i2, z);
        if (i4 == -1) {
            return -1;
        }
        return mo21450r(i4, dVar).f30213w;
    }

    public int hashCode() {
        C6270d dVar = new C6270d();
        C6268b bVar = new C6268b();
        int t = 217 + mo6761t();
        for (int i = 0; i < mo6761t(); i++) {
            t = (t * 31) + mo21450r(i, dVar).hashCode();
        }
        int m = (t * 31) + mo6760m();
        for (int i2 = 0; i2 < mo6760m(); i2++) {
            m = (m * 31) + mo6711k(i2, bVar, true).hashCode();
        }
        int e = mo6808e(true);
        while (e != -1) {
            m = (m * 31) + e;
            e = mo6811i(e, 0, true);
        }
        return m;
    }

    /* renamed from: i */
    public int mo6811i(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo6810g(z) ? mo6808e(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo6810g(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: j */
    public final C6268b mo21447j(int i, C6268b bVar) {
        return mo6711k(i, bVar, false);
    }

    /* renamed from: k */
    public abstract C6268b mo6711k(int i, C6268b bVar, boolean z);

    /* renamed from: l */
    public C6268b mo21149l(Object obj, C6268b bVar) {
        return mo6711k(mo6809f(obj), bVar, true);
    }

    /* renamed from: m */
    public abstract int mo6760m();

    /* renamed from: n */
    public final Pair<Object, Long> mo21448n(C6270d dVar, C6268b bVar, int i, long j) {
        return (Pair) C5917a.m34872e(mo21449o(dVar, bVar, i, j, 0));
    }

    /* renamed from: o */
    public final Pair<Object, Long> mo21449o(C6270d dVar, C6268b bVar, int i, long j, long j2) {
        C5917a.m34870c(i, 0, mo6761t());
        mo6712s(i, dVar, j2);
        if (j == -9223372036854775807L) {
            j = dVar.mo21476e();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = dVar.f30213w;
        mo21447j(i2, bVar);
        while (i2 < dVar.f30214x && bVar.f30188e != j) {
            int i3 = i2 + 1;
            if (mo21447j(i3, bVar).f30188e > j) {
                break;
            }
            i2 = i3;
        }
        mo6711k(i2, bVar, true);
        long j3 = j - bVar.f30188e;
        long j4 = bVar.f30187d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        return Pair.create(C5917a.m34872e(bVar.f30185b), Long.valueOf(Math.max(0, j3)));
    }

    /* renamed from: p */
    public int mo6812p(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo6808e(z) ? mo6810g(z) : i - 1;
            }
            throw new IllegalStateException();
        } else if (i == mo6808e(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    /* renamed from: q */
    public abstract Object mo6813q(int i);

    /* renamed from: r */
    public final C6270d mo21450r(int i, C6270d dVar) {
        return mo6712s(i, dVar, 0);
    }

    /* renamed from: s */
    public abstract C6270d mo6712s(int i, C6270d dVar, long j);

    /* renamed from: t */
    public abstract int mo6761t();

    /* renamed from: u */
    public final boolean mo21451u() {
        return mo6761t() == 0;
    }

    /* renamed from: v */
    public final boolean mo21452v(int i, C6268b bVar, C6270d dVar, int i2, boolean z) {
        return mo21445h(i, bVar, dVar, i2, z) == -1;
    }
}
