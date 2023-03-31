package p052g3;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p004a2.C0079u1;
import p015b3.C1690b;
import p015b3.C1776x0;
import p031d3.C4056b;
import p031d3.C4060f;
import p031d3.C4070l;
import p031d3.C4072n;
import p031d3.C4073o;
import p059h3.C4449g;
import p059h3.C4464l;
import p149u3.C5719c;
import p149u3.C5735s;
import p155v3.C5828l;
import p155v3.C5837p;
import p155v3.C5840p0;
import p161w3.C5917a;
import p161w3.C5947k0;
import p161w3.C5953m0;
import p177z1.C6229i3;
import p177z1.C6272r1;
import p190b7.C6685q;
import p190b7.C6696t;
import p219e7.C9998d;

/* renamed from: g3.f */
/* compiled from: HlsChunkSource */
class C4366f {

    /* renamed from: a */
    private final C4373h f24322a;

    /* renamed from: b */
    private final C5828l f24323b;

    /* renamed from: c */
    private final C5828l f24324c;

    /* renamed from: d */
    private final C4388s f24325d;

    /* renamed from: e */
    private final Uri[] f24326e;

    /* renamed from: f */
    private final C6272r1[] f24327f;

    /* renamed from: g */
    private final C4464l f24328g;

    /* renamed from: h */
    private final C1776x0 f24329h;

    /* renamed from: i */
    private final List<C6272r1> f24330i;

    /* renamed from: j */
    private final C4364e f24331j = new C4364e(4);

    /* renamed from: k */
    private final C0079u1 f24332k;

    /* renamed from: l */
    private boolean f24333l;

    /* renamed from: m */
    private byte[] f24334m = C5953m0.f29115f;

    /* renamed from: n */
    private IOException f24335n;

    /* renamed from: o */
    private Uri f24336o;

    /* renamed from: p */
    private boolean f24337p;

    /* renamed from: q */
    private C5735s f24338q;

    /* renamed from: r */
    private long f24339r = -9223372036854775807L;

    /* renamed from: s */
    private boolean f24340s;

    /* renamed from: g3.f$a */
    /* compiled from: HlsChunkSource */
    private static final class C4367a extends C4070l {

        /* renamed from: l */
        private byte[] f24341l;

        public C4367a(C5828l lVar, C5837p pVar, C6272r1 r1Var, int i, Object obj, byte[] bArr) {
            super(lVar, pVar, 3, r1Var, i, obj, bArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo17299g(byte[] bArr, int i) {
            this.f24341l = Arrays.copyOf(bArr, i);
        }

        /* renamed from: j */
        public byte[] mo17827j() {
            return this.f24341l;
        }
    }

    /* renamed from: g3.f$b */
    /* compiled from: HlsChunkSource */
    public static final class C4368b {

        /* renamed from: a */
        public C4060f f24342a;

        /* renamed from: b */
        public boolean f24343b;

        /* renamed from: c */
        public Uri f24344c;

        public C4368b() {
            mo17828a();
        }

        /* renamed from: a */
        public void mo17828a() {
            this.f24342a = null;
            this.f24343b = false;
            this.f24344c = null;
        }
    }

    /* renamed from: g3.f$c */
    /* compiled from: HlsChunkSource */
    static final class C4369c extends C4056b {

        /* renamed from: e */
        private final List<C4449g.C4454e> f24345e;

        /* renamed from: f */
        private final long f24346f;

        /* renamed from: g */
        private final String f24347g;

        public C4369c(String str, long j, List<C4449g.C4454e> list) {
            super(0, (long) (list.size() - 1));
            this.f24347g = str;
            this.f24346f = j;
            this.f24345e = list;
        }

        /* renamed from: a */
        public long mo7774a() {
            mo17264c();
            return this.f24346f + this.f24345e.get((int) mo17265d()).f24724e;
        }

        /* renamed from: b */
        public long mo7775b() {
            mo17264c();
            C4449g.C4454e eVar = this.f24345e.get((int) mo17265d());
            return this.f24346f + eVar.f24724e + eVar.f24722c;
        }
    }

    /* renamed from: g3.f$d */
    /* compiled from: HlsChunkSource */
    private static final class C4370d extends C5719c {

        /* renamed from: h */
        private int f24348h;

        public C4370d(C1776x0 x0Var, int[] iArr) {
            super(x0Var, iArr);
            this.f24348h = mo20143b(x0Var.mo6897b(iArr[0]));
        }

        /* renamed from: h */
        public void mo17829h(long j, long j2, long j3, List<? extends C4072n> list, C4073o[] oVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo20151k(this.f24348h, elapsedRealtime)) {
                for (int i = this.f28534b - 1; i >= 0; i--) {
                    if (!mo20151k(i, elapsedRealtime)) {
                        this.f24348h = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: i */
        public int mo17830i() {
            return this.f24348h;
        }

        /* renamed from: q */
        public int mo17831q() {
            return 0;
        }

        /* renamed from: s */
        public Object mo17832s() {
            return null;
        }
    }

    /* renamed from: g3.f$e */
    /* compiled from: HlsChunkSource */
    static final class C4371e {

        /* renamed from: a */
        public final C4449g.C4454e f24349a;

        /* renamed from: b */
        public final long f24350b;

        /* renamed from: c */
        public final int f24351c;

        /* renamed from: d */
        public final boolean f24352d;

        public C4371e(C4449g.C4454e eVar, long j, int i) {
            this.f24349a = eVar;
            this.f24350b = j;
            this.f24351c = i;
            this.f24352d = (eVar instanceof C4449g.C4451b) && ((C4449g.C4451b) eVar).f24714u;
        }
    }

    public C4366f(C4373h hVar, C4464l lVar, Uri[] uriArr, C6272r1[] r1VarArr, C4372g gVar, C5840p0 p0Var, C4388s sVar, List<C6272r1> list, C0079u1 u1Var) {
        this.f24322a = hVar;
        this.f24328g = lVar;
        this.f24326e = uriArr;
        this.f24327f = r1VarArr;
        this.f24325d = sVar;
        this.f24330i = list;
        this.f24332k = u1Var;
        C5828l a = gVar.mo17804a(1);
        this.f24323b = a;
        if (p0Var != null) {
            a.mo6818n(p0Var);
        }
        this.f24324c = gVar.mo17804a(3);
        this.f24329h = new C1776x0(r1VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((r1VarArr[i].f30236e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f24338q = new C4370d(this.f24329h, C9998d.m51076k(arrayList));
    }

    /* renamed from: d */
    private static Uri m29031d(C4449g gVar, C4449g.C4454e eVar) {
        String str;
        if (eVar == null || (str = eVar.f24726g) == null) {
            return null;
        }
        return C5947k0.m35055e(gVar.f24757a, str);
    }

    /* renamed from: f */
    private Pair<Long, Integer> m29032f(C4374i iVar, boolean z, C4449g gVar, long j, long j2) {
        List<C4449g.C4451b> list;
        long j3;
        int i = -1;
        if (iVar == null || z) {
            long j4 = gVar.f24711u + j;
            if (iVar != null && !this.f24337p) {
                j2 = iVar.f23168g;
            }
            if (!gVar.f24705o && j2 >= j4) {
                return new Pair<>(Long.valueOf(gVar.f24701k + ((long) gVar.f24708r.size())), -1);
            }
            long j5 = j2 - j;
            int i2 = 0;
            int f = C5953m0.m35130f(gVar.f24708r, Long.valueOf(j5), true, !this.f24328g.mo17981g() || iVar == null);
            long j6 = ((long) f) + gVar.f24701k;
            if (f >= 0) {
                C4449g.C4453d dVar = gVar.f24708r.get(f);
                if (j5 < dVar.f24724e + dVar.f24722c) {
                    list = dVar.f24719u;
                } else {
                    list = gVar.f24709s;
                }
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    C4449g.C4451b bVar = list.get(i2);
                    if (j5 >= bVar.f24724e + bVar.f24722c) {
                        i2++;
                    } else if (bVar.f24713t) {
                        j6 += list == gVar.f24709s ? 1 : 0;
                        i = i2;
                    }
                }
            }
            return new Pair<>(Long.valueOf(j6), Integer.valueOf(i));
        } else if (!iVar.mo17297h()) {
            return new Pair<>(Long.valueOf(iVar.f23213j), Integer.valueOf(iVar.f24371o));
        } else {
            if (iVar.f24371o == -1) {
                j3 = iVar.mo17296g();
            } else {
                j3 = iVar.f23213j;
            }
            Long valueOf = Long.valueOf(j3);
            int i3 = iVar.f24371o;
            if (i3 != -1) {
                i = i3 + 1;
            }
            return new Pair<>(valueOf, Integer.valueOf(i));
        }
    }

    /* renamed from: g */
    private static C4371e m29033g(C4449g gVar, long j, int i) {
        int i2 = (int) (j - gVar.f24701k);
        if (i2 == gVar.f24708r.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < gVar.f24709s.size()) {
                return new C4371e(gVar.f24709s.get(i), j, i);
            }
            return null;
        }
        C4449g.C4453d dVar = gVar.f24708r.get(i2);
        if (i == -1) {
            return new C4371e(dVar, j, -1);
        }
        if (i < dVar.f24719u.size()) {
            return new C4371e(dVar.f24719u.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < gVar.f24708r.size()) {
            return new C4371e(gVar.f24708r.get(i3), j + 1, -1);
        }
        if (!gVar.f24709s.isEmpty()) {
            return new C4371e(gVar.f24709s.get(0), j + 1, 0);
        }
        return null;
    }

    /* renamed from: i */
    static List<C4449g.C4454e> m29034i(C4449g gVar, long j, int i) {
        int i2 = (int) (j - gVar.f24701k);
        if (i2 < 0 || gVar.f24708r.size() < i2) {
            return C6685q.m38445x();
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (i2 < gVar.f24708r.size()) {
            if (i != -1) {
                C4449g.C4453d dVar = gVar.f24708r.get(i2);
                if (i == 0) {
                    arrayList.add(dVar);
                } else if (i < dVar.f24719u.size()) {
                    List<C4449g.C4451b> list = dVar.f24719u;
                    arrayList.addAll(list.subList(i, list.size()));
                }
                i2++;
            }
            List<C4449g.C4453d> list2 = gVar.f24708r;
            arrayList.addAll(list2.subList(i2, list2.size()));
            i = 0;
        }
        if (gVar.f24704n != -9223372036854775807L) {
            if (i != -1) {
                i3 = i;
            }
            if (i3 < gVar.f24709s.size()) {
                List<C4449g.C4451b> list3 = gVar.f24709s;
                arrayList.addAll(list3.subList(i3, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: l */
    private C4060f m29035l(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        byte[] c = this.f24331j.mo17809c(uri);
        if (c != null) {
            this.f24331j.mo17808b(uri, c);
            return null;
        }
        return new C4367a(this.f24324c, new C5837p.C5839b().mo20380i(uri).mo20373b(1).mo20372a(), this.f24327f[i], this.f24338q.mo17831q(), this.f24338q.mo17832s(), this.f24334m);
    }

    /* renamed from: s */
    private long m29036s(long j) {
        long j2 = this.f24339r;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: w */
    private void m29037w(C4449g gVar) {
        long j;
        if (gVar.f24705o) {
            j = -9223372036854775807L;
        } else {
            j = gVar.mo17999e() - this.f24328g.mo17979e();
        }
        this.f24339r = j;
    }

    /* renamed from: a */
    public C4073o[] mo17811a(C4374i iVar, long j) {
        int i;
        C4374i iVar2 = iVar;
        int c = iVar2 == null ? -1 : this.f24329h.mo6898c(iVar2.f23165d);
        int length = this.f24338q.length();
        C4073o[] oVarArr = new C4073o[length];
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            int d = this.f24338q.mo20145d(i2);
            Uri uri = this.f24326e[d];
            if (!this.f24328g.mo17975a(uri)) {
                oVarArr[i2] = C4073o.f23214a;
                i = i2;
            } else {
                C4449g m = this.f24328g.mo17986m(uri, z);
                C5917a.m34872e(m);
                long e = m.f24698h - this.f24328g.mo17979e();
                i = i2;
                Pair<Long, Integer> f = m29032f(iVar, d != c, m, e, j);
                oVarArr[i] = new C4369c(m.f24757a, e, m29034i(m, ((Long) f.first).longValue(), ((Integer) f.second).intValue()));
            }
            i2 = i + 1;
            z = false;
        }
        return oVarArr;
    }

    /* renamed from: b */
    public long mo17812b(long j, C6229i3 i3Var) {
        int i = this.f24338q.mo17830i();
        Uri[] uriArr = this.f24326e;
        C4449g m = (i >= uriArr.length || i == -1) ? null : this.f24328g.mo17986m(uriArr[this.f24338q.mo20154o()], true);
        if (m == null || m.f24708r.isEmpty() || !m.f24759c) {
            return j;
        }
        long e = m.f24698h - this.f24328g.mo17979e();
        long j2 = j - e;
        int f = C5953m0.m35130f(m.f24708r, Long.valueOf(j2), true, true);
        long j3 = m.f24708r.get(f).f24724e;
        return i3Var.mo21342a(j2, j3, f != m.f24708r.size() - 1 ? m.f24708r.get(f + 1).f24724e : j3) + e;
    }

    /* renamed from: c */
    public int mo17813c(C4374i iVar) {
        List<C4449g.C4451b> list;
        if (iVar.f24371o == -1) {
            return 1;
        }
        C4449g gVar = (C4449g) C5917a.m34872e(this.f24328g.mo17986m(this.f24326e[this.f24329h.mo6898c(iVar.f23165d)], false));
        int i = (int) (iVar.f23213j - gVar.f24701k);
        if (i < 0) {
            return 1;
        }
        if (i < gVar.f24708r.size()) {
            list = gVar.f24708r.get(i).f24719u;
        } else {
            list = gVar.f24709s;
        }
        if (iVar.f24371o >= list.size()) {
            return 2;
        }
        C4449g.C4451b bVar = list.get(iVar.f24371o);
        if (bVar.f24714u) {
            return 0;
        }
        if (C5953m0.m35124c(Uri.parse(C5947k0.m35054d(gVar.f24757a, bVar.f24720a)), iVar.f23163b.f28881a)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: e */
    public void mo17814e(long j, long j2, List<C4374i> list, boolean z, C4368b bVar) {
        int i;
        long j3;
        Uri uri;
        C4449g gVar;
        int i2;
        long j4 = j2;
        C4368b bVar2 = bVar;
        C4374i iVar = list.isEmpty() ? null : (C4374i) C6696t.m38506c(list);
        if (iVar == null) {
            i = -1;
        } else {
            i = this.f24329h.mo6898c(iVar.f23165d);
        }
        long j5 = j4 - j;
        long s = m29036s(j);
        if (iVar != null && !this.f24337p) {
            long d = iVar.mo17279d();
            j5 = Math.max(0, j5 - d);
            if (s != -9223372036854775807L) {
                s = Math.max(0, s - d);
            }
        }
        this.f24338q.mo17829h(j, j5, s, list, mo17811a(iVar, j4));
        int o = this.f24338q.mo20154o();
        boolean z2 = i != o;
        Uri uri2 = this.f24326e[o];
        if (!this.f24328g.mo17975a(uri2)) {
            bVar2.f24344c = uri2;
            this.f24340s &= uri2.equals(this.f24336o);
            this.f24336o = uri2;
            return;
        }
        C4449g m = this.f24328g.mo17986m(uri2, true);
        C5917a.m34872e(m);
        this.f24337p = m.f24759c;
        m29037w(m);
        long e = m.f24698h - this.f24328g.mo17979e();
        C4449g gVar2 = m;
        Uri uri3 = uri2;
        int i3 = o;
        Pair<Long, Integer> f = m29032f(iVar, z2, m, e, j2);
        long longValue = ((Long) f.first).longValue();
        int intValue = ((Integer) f.second).intValue();
        if (longValue >= m.f24701k || iVar == null || !z2) {
            gVar = m;
            j3 = e;
            uri = uri3;
            i2 = i3;
        } else {
            Uri uri4 = this.f24326e[i];
            C4449g m2 = this.f24328g.mo17986m(uri4, true);
            C5917a.m34872e(m2);
            j3 = m2.f24698h - this.f24328g.mo17979e();
            Pair<Long, Integer> f2 = m29032f(iVar, false, m2, j3, j2);
            longValue = ((Long) f2.first).longValue();
            intValue = ((Integer) f2.second).intValue();
            i2 = i;
            uri = uri4;
            gVar = m2;
        }
        if (longValue < gVar.f24701k) {
            this.f24335n = new C1690b();
            return;
        }
        C4371e g = m29033g(gVar, longValue, intValue);
        if (g == null) {
            if (!gVar.f24705o) {
                bVar2.f24344c = uri;
                this.f24340s &= uri.equals(this.f24336o);
                this.f24336o = uri;
                return;
            } else if (z || gVar.f24708r.isEmpty()) {
                bVar2.f24343b = true;
                return;
            } else {
                g = new C4371e((C4449g.C4454e) C6696t.m38506c(gVar.f24708r), (gVar.f24701k + ((long) gVar.f24708r.size())) - 1, -1);
            }
        }
        this.f24340s = false;
        this.f24336o = null;
        Uri d2 = m29031d(gVar, g.f24349a.f24721b);
        C4060f l = m29035l(d2, i2);
        bVar2.f24342a = l;
        if (l == null) {
            Uri d3 = m29031d(gVar, g.f24349a);
            C4060f l2 = m29035l(d3, i2);
            bVar2.f24342a = l2;
            if (l2 == null) {
                boolean w = C4374i.m29074w(iVar, uri, gVar, g, j3);
                if (!w || !g.f24352d) {
                    bVar2.f24342a = C4374i.m29066j(this.f24322a, this.f24323b, this.f24327f[i2], j3, gVar, g, uri, this.f24330i, this.f24338q.mo17831q(), this.f24338q.mo17832s(), this.f24333l, this.f24325d, iVar, this.f24331j.mo17807a(d3), this.f24331j.mo17807a(d2), w, this.f24332k);
                }
            }
        }
    }

    /* renamed from: h */
    public int mo17815h(long j, List<? extends C4072n> list) {
        if (this.f24335n != null || this.f24338q.length() < 2) {
            return list.size();
        }
        return this.f24338q.mo20126n(j, list);
    }

    /* renamed from: j */
    public C1776x0 mo17816j() {
        return this.f24329h;
    }

    /* renamed from: k */
    public C5735s mo17817k() {
        return this.f24338q;
    }

    /* renamed from: m */
    public boolean mo17818m(C4060f fVar, long j) {
        C5735s sVar = this.f24338q;
        return sVar.mo20150j(sVar.mo20146e(this.f24329h.mo6898c(fVar.f23165d)), j);
    }

    /* renamed from: n */
    public void mo17819n() throws IOException {
        IOException iOException = this.f24335n;
        if (iOException == null) {
            Uri uri = this.f24336o;
            if (uri != null && this.f24340s) {
                this.f24328g.mo17976b(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: o */
    public boolean mo17820o(Uri uri) {
        return C5953m0.m35156s(this.f24326e, uri);
    }

    /* renamed from: p */
    public void mo17821p(C4060f fVar) {
        if (fVar instanceof C4367a) {
            C4367a aVar = (C4367a) fVar;
            this.f24334m = aVar.mo17300h();
            this.f24331j.mo17808b(aVar.f23163b.f28881a, (byte[]) C5917a.m34872e(aVar.mo17827j()));
        }
    }

    /* renamed from: q */
    public boolean mo17822q(Uri uri, long j) {
        int e;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f24326e;
            if (i >= uriArr.length) {
                i = -1;
                break;
            } else if (uriArr[i].equals(uri)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1 || (e = this.f24338q.mo20146e(i)) == -1) {
            return true;
        }
        this.f24340s |= uri.equals(this.f24336o);
        if (j == -9223372036854775807L || (this.f24338q.mo20150j(e, j) && this.f24328g.mo17983i(uri, j))) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void mo17823r() {
        this.f24335n = null;
    }

    /* renamed from: t */
    public void mo17824t(boolean z) {
        this.f24333l = z;
    }

    /* renamed from: u */
    public void mo17825u(C5735s sVar) {
        this.f24338q = sVar;
    }

    /* renamed from: v */
    public boolean mo17826v(long j, C4060f fVar, List<? extends C4072n> list) {
        if (this.f24335n != null) {
            return false;
        }
        return this.f24338q.mo20148g(j, fVar, list);
    }
}
