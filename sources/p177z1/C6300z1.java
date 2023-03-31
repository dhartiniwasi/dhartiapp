package p177z1;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p005a3.C0093c;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6224h;
import p190b7.C6685q;
import p190b7.C6690r;

/* renamed from: z1.z1 */
/* compiled from: MediaItem */
public final class C6300z1 implements C6224h {

    /* renamed from: i */
    public static final C6300z1 f30388i = new C6303c().mo21587a();

    /* renamed from: r */
    public static final C6224h.C6225a<C6300z1> f30389r = C13441y1.f47783a;

    /* renamed from: a */
    public final String f30390a;

    /* renamed from: b */
    public final C6311h f30391b;
    @Deprecated

    /* renamed from: c */
    public final C6312i f30392c;

    /* renamed from: d */
    public final C6309g f30393d;

    /* renamed from: e */
    public final C6214e2 f30394e;

    /* renamed from: f */
    public final C6304d f30395f;
    @Deprecated

    /* renamed from: g */
    public final C6306e f30396g;

    /* renamed from: h */
    public final C6313j f30397h;

    /* renamed from: z1.z1$b */
    /* compiled from: MediaItem */
    public static final class C6302b {
    }

    /* renamed from: z1.z1$c */
    /* compiled from: MediaItem */
    public static final class C6303c {

        /* renamed from: a */
        private String f30398a;

        /* renamed from: b */
        private Uri f30399b;

        /* renamed from: c */
        private String f30400c;

        /* renamed from: d */
        private C6304d.C6305a f30401d;

        /* renamed from: e */
        private C6307f.C6308a f30402e;

        /* renamed from: f */
        private List<C0093c> f30403f;

        /* renamed from: g */
        private String f30404g;

        /* renamed from: h */
        private C6685q<C6316l> f30405h;

        /* renamed from: i */
        private C6302b f30406i;

        /* renamed from: j */
        private Object f30407j;

        /* renamed from: k */
        private C6214e2 f30408k;

        /* renamed from: l */
        private C6309g.C6310a f30409l;

        /* renamed from: m */
        private C6313j f30410m;

        /* renamed from: a */
        public C6300z1 mo21587a() {
            C6312i iVar;
            C5917a.m34873f(this.f30402e.f30436b == null || this.f30402e.f30435a != null);
            Uri uri = this.f30399b;
            C6307f fVar = null;
            if (uri != null) {
                String str = this.f30400c;
                if (this.f30402e.f30435a != null) {
                    fVar = this.f30402e.mo21607i();
                }
                iVar = new C6312i(uri, str, fVar, this.f30406i, this.f30403f, this.f30404g, this.f30405h, this.f30407j);
            } else {
                iVar = null;
            }
            String str2 = this.f30398a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            C6306e g = this.f30401d.mo21597g();
            C6309g f = this.f30409l.mo21611f();
            C6214e2 e2Var = this.f30408k;
            if (e2Var == null) {
                e2Var = C6214e2.f29855O;
            }
            return new C6300z1(str3, g, iVar, f, e2Var, this.f30410m);
        }

        /* renamed from: b */
        public C6303c mo21588b(String str) {
            this.f30404g = str;
            return this;
        }

        /* renamed from: c */
        public C6303c mo21589c(String str) {
            this.f30398a = (String) C5917a.m34872e(str);
            return this;
        }

        /* renamed from: d */
        public C6303c mo21590d(String str) {
            this.f30400c = str;
            return this;
        }

        /* renamed from: e */
        public C6303c mo21591e(Object obj) {
            this.f30407j = obj;
            return this;
        }

        /* renamed from: f */
        public C6303c mo21592f(Uri uri) {
            this.f30399b = uri;
            return this;
        }

        public C6303c() {
            this.f30401d = new C6304d.C6305a();
            this.f30402e = new C6307f.C6308a();
            this.f30403f = Collections.emptyList();
            this.f30405h = C6685q.m38445x();
            this.f30409l = new C6309g.C6310a();
            this.f30410m = C6313j.f30464d;
        }

        private C6303c(C6300z1 z1Var) {
            this();
            C6307f.C6308a aVar;
            this.f30401d = z1Var.f30395f.mo21593b();
            this.f30398a = z1Var.f30390a;
            this.f30408k = z1Var.f30394e;
            this.f30409l = z1Var.f30393d.mo21608b();
            this.f30410m = z1Var.f30397h;
            C6311h hVar = z1Var.f30391b;
            if (hVar != null) {
                this.f30404g = hVar.f30460f;
                this.f30400c = hVar.f30456b;
                this.f30399b = hVar.f30455a;
                this.f30403f = hVar.f30459e;
                this.f30405h = hVar.f30461g;
                this.f30407j = hVar.f30463i;
                C6307f fVar = hVar.f30457c;
                if (fVar != null) {
                    aVar = fVar.mo21603b();
                } else {
                    aVar = new C6307f.C6308a();
                }
                this.f30402e = aVar;
            }
        }
    }

    /* renamed from: z1.z1$d */
    /* compiled from: MediaItem */
    public static class C6304d implements C6224h {

        /* renamed from: f */
        public static final C6304d f30411f = new C6305a().mo21596f();

        /* renamed from: g */
        public static final C6224h.C6225a<C6306e> f30412g = C13375a2.f47705a;

        /* renamed from: a */
        public final long f30413a;

        /* renamed from: b */
        public final long f30414b;

        /* renamed from: c */
        public final boolean f30415c;

        /* renamed from: d */
        public final boolean f30416d;

        /* renamed from: e */
        public final boolean f30417e;

        /* renamed from: z1.z1$d$a */
        /* compiled from: MediaItem */
        public static final class C6305a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public long f30418a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public long f30419b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public boolean f30420c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public boolean f30421d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public boolean f30422e;

            /* renamed from: f */
            public C6304d mo21596f() {
                return mo21597g();
            }

            @Deprecated
            /* renamed from: g */
            public C6306e mo21597g() {
                return new C6306e(this);
            }

            /* renamed from: h */
            public C6305a mo21598h(long j) {
                C5917a.m34868a(j == Long.MIN_VALUE || j >= 0);
                this.f30419b = j;
                return this;
            }

            /* renamed from: i */
            public C6305a mo21599i(boolean z) {
                this.f30421d = z;
                return this;
            }

            /* renamed from: j */
            public C6305a mo21600j(boolean z) {
                this.f30420c = z;
                return this;
            }

            /* renamed from: k */
            public C6305a mo21601k(long j) {
                C5917a.m34868a(j >= 0);
                this.f30418a = j;
                return this;
            }

            /* renamed from: l */
            public C6305a mo21602l(boolean z) {
                this.f30422e = z;
                return this;
            }

            public C6305a() {
                this.f30419b = Long.MIN_VALUE;
            }

            private C6305a(C6304d dVar) {
                this.f30418a = dVar.f30413a;
                this.f30419b = dVar.f30414b;
                this.f30420c = dVar.f30415c;
                this.f30421d = dVar.f30416d;
                this.f30422e = dVar.f30417e;
            }
        }

        /* renamed from: c */
        private static String m37181c(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: b */
        public C6305a mo21593b() {
            return new C6305a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6304d)) {
                return false;
            }
            C6304d dVar = (C6304d) obj;
            if (this.f30413a == dVar.f30413a && this.f30414b == dVar.f30414b && this.f30415c == dVar.f30415c && this.f30416d == dVar.f30416d && this.f30417e == dVar.f30417e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.f30413a;
            long j2 = this.f30414b;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f30415c ? 1 : 0)) * 31) + (this.f30416d ? 1 : 0)) * 31) + (this.f30417e ? 1 : 0);
        }

        private C6304d(C6305a aVar) {
            this.f30413a = aVar.f30418a;
            this.f30414b = aVar.f30419b;
            this.f30415c = aVar.f30420c;
            this.f30416d = aVar.f30421d;
            this.f30417e = aVar.f30422e;
        }
    }

    @Deprecated
    /* renamed from: z1.z1$e */
    /* compiled from: MediaItem */
    public static final class C6306e extends C6304d {

        /* renamed from: h */
        public static final C6306e f30423h = new C6304d.C6305a().mo21597g();

        private C6306e(C6304d.C6305a aVar) {
            super(aVar);
        }
    }

    /* renamed from: z1.z1$f */
    /* compiled from: MediaItem */
    public static final class C6307f {

        /* renamed from: a */
        public final UUID f30424a;
        @Deprecated

        /* renamed from: b */
        public final UUID f30425b;

        /* renamed from: c */
        public final Uri f30426c;
        @Deprecated

        /* renamed from: d */
        public final C6690r<String, String> f30427d;

        /* renamed from: e */
        public final C6690r<String, String> f30428e;

        /* renamed from: f */
        public final boolean f30429f;

        /* renamed from: g */
        public final boolean f30430g;

        /* renamed from: h */
        public final boolean f30431h;
        @Deprecated

        /* renamed from: i */
        public final C6685q<Integer> f30432i;

        /* renamed from: j */
        public final C6685q<Integer> f30433j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public final byte[] f30434k;

        /* renamed from: b */
        public C6308a mo21603b() {
            return new C6308a();
        }

        /* renamed from: c */
        public byte[] mo21604c() {
            byte[] bArr = this.f30434k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6307f)) {
                return false;
            }
            C6307f fVar = (C6307f) obj;
            if (!this.f30424a.equals(fVar.f30424a) || !C5953m0.m35124c(this.f30426c, fVar.f30426c) || !C5953m0.m35124c(this.f30428e, fVar.f30428e) || this.f30429f != fVar.f30429f || this.f30431h != fVar.f30431h || this.f30430g != fVar.f30430g || !this.f30433j.equals(fVar.f30433j) || !Arrays.equals(this.f30434k, fVar.f30434k)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f30424a.hashCode() * 31;
            Uri uri = this.f30426c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f30428e.hashCode()) * 31) + (this.f30429f ? 1 : 0)) * 31) + (this.f30431h ? 1 : 0)) * 31) + (this.f30430g ? 1 : 0)) * 31) + this.f30433j.hashCode()) * 31) + Arrays.hashCode(this.f30434k);
        }

        /* renamed from: z1.z1$f$a */
        /* compiled from: MediaItem */
        public static final class C6308a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public UUID f30435a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public Uri f30436b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public C6690r<String, String> f30437c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public boolean f30438d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public boolean f30439e;
            /* access modifiers changed from: private */

            /* renamed from: f */
            public boolean f30440f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public C6685q<Integer> f30441g;
            /* access modifiers changed from: private */

            /* renamed from: h */
            public byte[] f30442h;

            /* renamed from: i */
            public C6307f mo21607i() {
                return new C6307f(this);
            }

            @Deprecated
            private C6308a() {
                this.f30437c = C6690r.m38472k();
                this.f30441g = C6685q.m38445x();
            }

            private C6308a(C6307f fVar) {
                this.f30435a = fVar.f30424a;
                this.f30436b = fVar.f30426c;
                this.f30437c = fVar.f30428e;
                this.f30438d = fVar.f30429f;
                this.f30439e = fVar.f30430g;
                this.f30440f = fVar.f30431h;
                this.f30441g = fVar.f30433j;
                this.f30442h = fVar.f30434k;
            }
        }

        private C6307f(C6308a aVar) {
            C5917a.m34873f(!aVar.f30440f || aVar.f30436b != null);
            UUID uuid = (UUID) C5917a.m34872e(aVar.f30435a);
            this.f30424a = uuid;
            this.f30425b = uuid;
            this.f30426c = aVar.f30436b;
            this.f30427d = aVar.f30437c;
            this.f30428e = aVar.f30437c;
            this.f30429f = aVar.f30438d;
            this.f30431h = aVar.f30440f;
            this.f30430g = aVar.f30439e;
            this.f30432i = aVar.f30441g;
            this.f30433j = aVar.f30441g;
            this.f30434k = aVar.f30442h != null ? Arrays.copyOf(aVar.f30442h, aVar.f30442h.length) : null;
        }
    }

    /* renamed from: z1.z1$g */
    /* compiled from: MediaItem */
    public static final class C6309g implements C6224h {

        /* renamed from: f */
        public static final C6309g f30443f = new C6310a().mo21611f();

        /* renamed from: g */
        public static final C6224h.C6225a<C6309g> f30444g = C13378b2.f47709a;

        /* renamed from: a */
        public final long f30445a;

        /* renamed from: b */
        public final long f30446b;

        /* renamed from: c */
        public final long f30447c;

        /* renamed from: d */
        public final float f30448d;

        /* renamed from: e */
        public final float f30449e;

        /* renamed from: z1.z1$g$a */
        /* compiled from: MediaItem */
        public static final class C6310a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public long f30450a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public long f30451b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public long f30452c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public float f30453d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public float f30454e;

            /* renamed from: f */
            public C6309g mo21611f() {
                return new C6309g(this);
            }

            /* renamed from: g */
            public C6310a mo21612g(long j) {
                this.f30452c = j;
                return this;
            }

            /* renamed from: h */
            public C6310a mo21613h(float f) {
                this.f30454e = f;
                return this;
            }

            /* renamed from: i */
            public C6310a mo21614i(long j) {
                this.f30451b = j;
                return this;
            }

            /* renamed from: j */
            public C6310a mo21615j(float f) {
                this.f30453d = f;
                return this;
            }

            /* renamed from: k */
            public C6310a mo21616k(long j) {
                this.f30450a = j;
                return this;
            }

            public C6310a() {
                this.f30450a = -9223372036854775807L;
                this.f30451b = -9223372036854775807L;
                this.f30452c = -9223372036854775807L;
                this.f30453d = -3.4028235E38f;
                this.f30454e = -3.4028235E38f;
            }

            private C6310a(C6309g gVar) {
                this.f30450a = gVar.f30445a;
                this.f30451b = gVar.f30446b;
                this.f30452c = gVar.f30447c;
                this.f30453d = gVar.f30448d;
                this.f30454e = gVar.f30449e;
            }
        }

        /* renamed from: c */
        private static String m37209c(int i) {
            return Integer.toString(i, 36);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ C6309g m37210d(Bundle bundle) {
            return new C6309g(bundle.getLong(m37209c(0), -9223372036854775807L), bundle.getLong(m37209c(1), -9223372036854775807L), bundle.getLong(m37209c(2), -9223372036854775807L), bundle.getFloat(m37209c(3), -3.4028235E38f), bundle.getFloat(m37209c(4), -3.4028235E38f));
        }

        /* renamed from: b */
        public C6310a mo21608b() {
            return new C6310a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6309g)) {
                return false;
            }
            C6309g gVar = (C6309g) obj;
            if (this.f30445a == gVar.f30445a && this.f30446b == gVar.f30446b && this.f30447c == gVar.f30447c && this.f30448d == gVar.f30448d && this.f30449e == gVar.f30449e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.f30445a;
            long j2 = this.f30446b;
            long j3 = this.f30447c;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            float f = this.f30448d;
            int i2 = 0;
            int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f30449e;
            if (f2 != 0.0f) {
                i2 = Float.floatToIntBits(f2);
            }
            return floatToIntBits + i2;
        }

        private C6309g(C6310a aVar) {
            this(aVar.f30450a, aVar.f30451b, aVar.f30452c, aVar.f30453d, aVar.f30454e);
        }

        @Deprecated
        public C6309g(long j, long j2, long j3, float f, float f2) {
            this.f30445a = j;
            this.f30446b = j2;
            this.f30447c = j3;
            this.f30448d = f;
            this.f30449e = f2;
        }
    }

    /* renamed from: z1.z1$h */
    /* compiled from: MediaItem */
    public static class C6311h {

        /* renamed from: a */
        public final Uri f30455a;

        /* renamed from: b */
        public final String f30456b;

        /* renamed from: c */
        public final C6307f f30457c;

        /* renamed from: d */
        public final C6302b f30458d;

        /* renamed from: e */
        public final List<C0093c> f30459e;

        /* renamed from: f */
        public final String f30460f;

        /* renamed from: g */
        public final C6685q<C6316l> f30461g;
        @Deprecated

        /* renamed from: h */
        public final List<C6315k> f30462h;

        /* renamed from: i */
        public final Object f30463i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6311h)) {
                return false;
            }
            C6311h hVar = (C6311h) obj;
            if (!this.f30455a.equals(hVar.f30455a) || !C5953m0.m35124c(this.f30456b, hVar.f30456b) || !C5953m0.m35124c(this.f30457c, hVar.f30457c) || !C5953m0.m35124c(this.f30458d, hVar.f30458d) || !this.f30459e.equals(hVar.f30459e) || !C5953m0.m35124c(this.f30460f, hVar.f30460f) || !this.f30461g.equals(hVar.f30461g) || !C5953m0.m35124c(this.f30463i, hVar.f30463i)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f30455a.hashCode() * 31;
            String str = this.f30456b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C6307f fVar = this.f30457c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f30459e.hashCode()) * 31;
            String str2 = this.f30460f;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f30461g.hashCode()) * 31;
            Object obj = this.f30463i;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode4 + i;
        }

        private C6311h(Uri uri, String str, C6307f fVar, C6302b bVar, List<C0093c> list, String str2, C6685q<C6316l> qVar, Object obj) {
            this.f30455a = uri;
            this.f30456b = str;
            this.f30457c = fVar;
            this.f30459e = list;
            this.f30460f = str2;
            this.f30461g = qVar;
            C6685q.C6686a r = C6685q.m38441r();
            for (int i = 0; i < qVar.size(); i++) {
                r.mo22506a(qVar.get(i).mo21625a().m37242i());
            }
            this.f30462h = r.mo22547h();
            this.f30463i = obj;
        }
    }

    @Deprecated
    /* renamed from: z1.z1$i */
    /* compiled from: MediaItem */
    public static final class C6312i extends C6311h {
        private C6312i(Uri uri, String str, C6307f fVar, C6302b bVar, List<C0093c> list, String str2, C6685q<C6316l> qVar, Object obj) {
            super(uri, str, fVar, bVar, list, str2, qVar, obj);
        }
    }

    /* renamed from: z1.z1$j */
    /* compiled from: MediaItem */
    public static final class C6313j implements C6224h {

        /* renamed from: d */
        public static final C6313j f30464d = new C6314a().mo21621d();

        /* renamed from: e */
        public static final C6224h.C6225a<C6313j> f30465e = C13382c2.f47715a;

        /* renamed from: a */
        public final Uri f30466a;

        /* renamed from: b */
        public final String f30467b;

        /* renamed from: c */
        public final Bundle f30468c;

        /* renamed from: z1.z1$j$a */
        /* compiled from: MediaItem */
        public static final class C6314a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public Uri f30469a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public String f30470b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public Bundle f30471c;

            /* renamed from: d */
            public C6313j mo21621d() {
                return new C6313j(this);
            }

            /* renamed from: e */
            public C6314a mo21622e(Bundle bundle) {
                this.f30471c = bundle;
                return this;
            }

            /* renamed from: f */
            public C6314a mo21623f(Uri uri) {
                this.f30469a = uri;
                return this;
            }

            /* renamed from: g */
            public C6314a mo21624g(String str) {
                this.f30470b = str;
                return this;
            }
        }

        /* renamed from: b */
        private static String m37224b(int i) {
            return Integer.toString(i, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6313j)) {
                return false;
            }
            C6313j jVar = (C6313j) obj;
            if (!C5953m0.m35124c(this.f30466a, jVar.f30466a) || !C5953m0.m35124c(this.f30467b, jVar.f30467b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Uri uri = this.f30466a;
            int i = 0;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f30467b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        private C6313j(C6314a aVar) {
            this.f30466a = aVar.f30469a;
            this.f30467b = aVar.f30470b;
            this.f30468c = aVar.f30471c;
        }
    }

    @Deprecated
    /* renamed from: z1.z1$k */
    /* compiled from: MediaItem */
    public static final class C6315k extends C6316l {
        private C6315k(C6316l.C6317a aVar) {
            super(aVar);
        }
    }

    /* renamed from: z1.z1$l */
    /* compiled from: MediaItem */
    public static class C6316l {

        /* renamed from: a */
        public final Uri f30472a;

        /* renamed from: b */
        public final String f30473b;

        /* renamed from: c */
        public final String f30474c;

        /* renamed from: d */
        public final int f30475d;

        /* renamed from: e */
        public final int f30476e;

        /* renamed from: f */
        public final String f30477f;

        /* renamed from: g */
        public final String f30478g;

        /* renamed from: z1.z1$l$a */
        /* compiled from: MediaItem */
        public static final class C6317a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public Uri f30479a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public String f30480b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public String f30481c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public int f30482d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public int f30483e;
            /* access modifiers changed from: private */

            /* renamed from: f */
            public String f30484f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public String f30485g;

            /* access modifiers changed from: private */
            /* renamed from: i */
            public C6315k m37242i() {
                return new C6315k(this);
            }

            private C6317a(C6316l lVar) {
                this.f30479a = lVar.f30472a;
                this.f30480b = lVar.f30473b;
                this.f30481c = lVar.f30474c;
                this.f30482d = lVar.f30475d;
                this.f30483e = lVar.f30476e;
                this.f30484f = lVar.f30477f;
                this.f30485g = lVar.f30478g;
            }
        }

        /* renamed from: a */
        public C6317a mo21625a() {
            return new C6317a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6316l)) {
                return false;
            }
            C6316l lVar = (C6316l) obj;
            if (!this.f30472a.equals(lVar.f30472a) || !C5953m0.m35124c(this.f30473b, lVar.f30473b) || !C5953m0.m35124c(this.f30474c, lVar.f30474c) || this.f30475d != lVar.f30475d || this.f30476e != lVar.f30476e || !C5953m0.m35124c(this.f30477f, lVar.f30477f) || !C5953m0.m35124c(this.f30478g, lVar.f30478g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f30472a.hashCode() * 31;
            String str = this.f30473b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f30474c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f30475d) * 31) + this.f30476e) * 31;
            String str3 = this.f30477f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f30478g;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode4 + i;
        }

        private C6316l(C6317a aVar) {
            this.f30472a = aVar.f30479a;
            this.f30473b = aVar.f30480b;
            this.f30474c = aVar.f30481c;
            this.f30475d = aVar.f30482d;
            this.f30476e = aVar.f30483e;
            this.f30477f = aVar.f30484f;
            this.f30478g = aVar.f30485g;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static C6300z1 m37170c(Bundle bundle) {
        C6309g gVar;
        C6214e2 e2Var;
        C6306e eVar;
        C6313j jVar;
        String str = (String) C5917a.m34872e(bundle.getString(m37172e(0), ""));
        Bundle bundle2 = bundle.getBundle(m37172e(1));
        if (bundle2 == null) {
            gVar = C6309g.f30443f;
        } else {
            gVar = C6309g.f30444g.mo6454a(bundle2);
        }
        C6309g gVar2 = gVar;
        Bundle bundle3 = bundle.getBundle(m37172e(2));
        if (bundle3 == null) {
            e2Var = C6214e2.f29855O;
        } else {
            e2Var = C6214e2.f29856P.mo6454a(bundle3);
        }
        C6214e2 e2Var2 = e2Var;
        Bundle bundle4 = bundle.getBundle(m37172e(3));
        if (bundle4 == null) {
            eVar = C6306e.f30423h;
        } else {
            eVar = C6304d.f30412g.mo6454a(bundle4);
        }
        C6306e eVar2 = eVar;
        Bundle bundle5 = bundle.getBundle(m37172e(4));
        if (bundle5 == null) {
            jVar = C6313j.f30464d;
        } else {
            jVar = C6313j.f30465e.mo6454a(bundle5);
        }
        return new C6300z1(str, eVar2, (C6312i) null, gVar2, e2Var2, jVar);
    }

    /* renamed from: d */
    public static C6300z1 m37171d(Uri uri) {
        return new C6303c().mo21592f(uri).mo21587a();
    }

    /* renamed from: e */
    private static String m37172e(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: b */
    public C6303c mo21584b() {
        return new C6303c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6300z1)) {
            return false;
        }
        C6300z1 z1Var = (C6300z1) obj;
        if (!C5953m0.m35124c(this.f30390a, z1Var.f30390a) || !this.f30395f.equals(z1Var.f30395f) || !C5953m0.m35124c(this.f30391b, z1Var.f30391b) || !C5953m0.m35124c(this.f30393d, z1Var.f30393d) || !C5953m0.m35124c(this.f30394e, z1Var.f30394e) || !C5953m0.m35124c(this.f30397h, z1Var.f30397h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f30390a.hashCode() * 31;
        C6311h hVar = this.f30391b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f30393d.hashCode()) * 31) + this.f30395f.hashCode()) * 31) + this.f30394e.hashCode()) * 31) + this.f30397h.hashCode();
    }

    private C6300z1(String str, C6306e eVar, C6312i iVar, C6309g gVar, C6214e2 e2Var, C6313j jVar) {
        this.f30390a = str;
        this.f30391b = iVar;
        this.f30392c = iVar;
        this.f30393d = gVar;
        this.f30394e = e2Var;
        this.f30395f = eVar;
        this.f30396g = eVar;
        this.f30397h = jVar;
    }
}
