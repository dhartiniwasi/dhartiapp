package p149u3;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p014b2.C1612a0;
import p014b2.C1624e;
import p015b3.C1772x;
import p015b3.C1776x0;
import p015b3.C1780z0;
import p149u3.C5713a;
import p149u3.C5735s;
import p149u3.C5739u;
import p149u3.C5743z;
import p161w3.C5917a;
import p161w3.C5921c;
import p161w3.C5953m0;
import p161w3.C5961r;
import p177z1.C6217e3;
import p177z1.C6223g3;
import p177z1.C6224h;
import p177z1.C6264q;
import p177z1.C6266q3;
import p177z1.C6272r1;
import p182a7.C6432o;
import p190b7.C6653h0;
import p190b7.C6659k;
import p190b7.C6685q;
import p219e7.C9998d;

/* renamed from: u3.m */
/* compiled from: DefaultTrackSelector */
public class C5721m extends C5739u {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C6653h0<Integer> f28545k = C6653h0.m38337a(C12667f.f46432a);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C6653h0<Integer> f28546l = C6653h0.m38337a(C12666e.f46431a);

    /* renamed from: d */
    private final Object f28547d;

    /* renamed from: e */
    public final Context f28548e;

    /* renamed from: f */
    private final C5735s.C5737b f28549f;

    /* renamed from: g */
    private final boolean f28550g;

    /* renamed from: h */
    private C5725d f28551h;

    /* renamed from: i */
    private C5728f f28552i;

    /* renamed from: j */
    private C1624e f28553j;

    /* renamed from: u3.m$b */
    /* compiled from: DefaultTrackSelector */
    private static final class C5723b extends C5731h<C5723b> implements Comparable<C5723b> {

        /* renamed from: A */
        private final int f28554A;

        /* renamed from: B */
        private final int f28555B;

        /* renamed from: C */
        private final boolean f28556C;

        /* renamed from: D */
        private final boolean f28557D;

        /* renamed from: e */
        private final int f28558e;

        /* renamed from: f */
        private final boolean f28559f;

        /* renamed from: g */
        private final String f28560g = C5721m.m34127Q(this.f28629d.f30234c);

        /* renamed from: h */
        private final C5725d f28561h;

        /* renamed from: i */
        private final boolean f28562i;

        /* renamed from: r */
        private final int f28563r;

        /* renamed from: s */
        private final int f28564s;

        /* renamed from: t */
        private final int f28565t;

        /* renamed from: u */
        private final boolean f28566u;

        /* renamed from: v */
        private final int f28567v;

        /* renamed from: w */
        private final int f28568w;

        /* renamed from: x */
        private final boolean f28569x;

        /* renamed from: y */
        private final int f28570y;

        /* renamed from: z */
        private final int f28571z;

        public C5723b(int i, C1776x0 x0Var, int i2, C5725d dVar, int i3, boolean z, C6432o<C6272r1> oVar) {
            super(i, x0Var, i2);
            int i4;
            int i5;
            int i6;
            this.f28561h = dVar;
            boolean z2 = false;
            this.f28562i = C5721m.m34119I(i3, false);
            int i7 = 0;
            while (true) {
                i4 = Integer.MAX_VALUE;
                if (i7 >= dVar.f28684v.size()) {
                    i7 = Integer.MAX_VALUE;
                    i5 = 0;
                    break;
                }
                i5 = C5721m.m34112B(this.f28629d, dVar.f28684v.get(i7), false);
                if (i5 > 0) {
                    break;
                }
                i7++;
            }
            this.f28564s = i7;
            this.f28563r = i5;
            this.f28565t = C5721m.m34115E(this.f28629d.f30236e, dVar.f28685w);
            C6272r1 r1Var = this.f28629d;
            int i8 = r1Var.f30236e;
            this.f28566u = i8 == 0 || (i8 & 1) != 0;
            this.f28569x = (r1Var.f30235d & 1) != 0;
            int i9 = r1Var.f30224G;
            this.f28570y = i9;
            this.f28571z = r1Var.f30225H;
            int i10 = r1Var.f30239h;
            this.f28554A = i10;
            this.f28559f = (i10 == -1 || i10 <= dVar.f28687y) && (i9 == -1 || i9 <= dVar.f28686x) && oVar.apply(r1Var);
            String[] g0 = C5953m0.m35133g0();
            int i11 = 0;
            while (true) {
                if (i11 >= g0.length) {
                    i11 = Integer.MAX_VALUE;
                    i6 = 0;
                    break;
                }
                i6 = C5721m.m34112B(this.f28629d, g0[i11], false);
                if (i6 > 0) {
                    break;
                }
                i11++;
            }
            this.f28567v = i11;
            this.f28568w = i6;
            int i12 = 0;
            while (true) {
                if (i12 < dVar.f28688z.size()) {
                    String str = this.f28629d.f30243t;
                    if (str != null && str.equals(dVar.f28688z.get(i12))) {
                        i4 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            this.f28555B = i4;
            this.f28556C = C6217e3.m36428e(i3) == 128;
            this.f28557D = C6217e3.m36430g(i3) == 64 ? true : z2;
            this.f28558e = m34155n(i3, z);
        }

        /* renamed from: c */
        public static int m34153c(List<C5723b> list, List<C5723b> list2) {
            return ((C5723b) Collections.max(list)).compareTo((C5723b) Collections.max(list2));
        }

        /* renamed from: k */
        public static C6685q<C5723b> m34154k(int i, C1776x0 x0Var, C5725d dVar, int[] iArr, boolean z, C6432o<C6272r1> oVar) {
            C6685q.C6686a r = C6685q.m38441r();
            C1776x0 x0Var2 = x0Var;
            for (int i2 = 0; i2 < x0Var2.f5280a; i2++) {
                r.mo22506a(new C5723b(i, x0Var, i2, dVar, iArr[i2], z, oVar));
            }
            return r.mo22547h();
        }

        /* renamed from: n */
        private int m34155n(int i, boolean z) {
            if (!C5721m.m34119I(i, this.f28561h.f28587c0)) {
                return 0;
            }
            if (!this.f28559f && !this.f28561h.f28581P) {
                return 0;
            }
            if (C5721m.m34119I(i, false) && this.f28559f && this.f28629d.f30239h != -1) {
                C5725d dVar = this.f28561h;
                return (dVar.f28668F || dVar.f28667E || (!dVar.f28589e0 && z)) ? 1 : 2;
            }
        }

        /* renamed from: a */
        public int mo20167a() {
            return this.f28558e;
        }

        /* renamed from: j */
        public int compareTo(C5723b bVar) {
            C6653h0 h0Var;
            if (!this.f28559f || !this.f28562i) {
                h0Var = C5721m.f28545k.mo22416d();
            } else {
                h0Var = C5721m.f28545k;
            }
            C6659k f = C6659k.m38354j().mo22457g(this.f28562i, bVar.f28562i).mo22456f(Integer.valueOf(this.f28564s), Integer.valueOf(bVar.f28564s), C6653h0.m38338b().mo22416d()).mo22454d(this.f28563r, bVar.f28563r).mo22454d(this.f28565t, bVar.f28565t).mo22457g(this.f28569x, bVar.f28569x).mo22457g(this.f28566u, bVar.f28566u).mo22456f(Integer.valueOf(this.f28567v), Integer.valueOf(bVar.f28567v), C6653h0.m38338b().mo22416d()).mo22454d(this.f28568w, bVar.f28568w).mo22457g(this.f28559f, bVar.f28559f).mo22456f(Integer.valueOf(this.f28555B), Integer.valueOf(bVar.f28555B), C6653h0.m38338b().mo22416d()).mo22456f(Integer.valueOf(this.f28554A), Integer.valueOf(bVar.f28554A), this.f28561h.f28667E ? C5721m.f28545k.mo22416d() : C5721m.f28546l).mo22457g(this.f28556C, bVar.f28556C).mo22457g(this.f28557D, bVar.f28557D).mo22456f(Integer.valueOf(this.f28570y), Integer.valueOf(bVar.f28570y), h0Var).mo22456f(Integer.valueOf(this.f28571z), Integer.valueOf(bVar.f28571z), h0Var);
            Integer valueOf = Integer.valueOf(this.f28554A);
            Integer valueOf2 = Integer.valueOf(bVar.f28554A);
            if (!C5953m0.m35124c(this.f28560g, bVar.f28560g)) {
                h0Var = C5721m.f28546l;
            }
            return f.mo22456f(valueOf, valueOf2, h0Var).mo22459i();
        }

        /* renamed from: o */
        public boolean mo20168b(C5723b bVar) {
            int i;
            String str;
            int i2;
            C5725d dVar = this.f28561h;
            if ((dVar.f28584S || ((i2 = this.f28629d.f30224G) != -1 && i2 == bVar.f28629d.f30224G)) && (dVar.f28582Q || ((str = this.f28629d.f30243t) != null && TextUtils.equals(str, bVar.f28629d.f30243t)))) {
                C5725d dVar2 = this.f28561h;
                if ((dVar2.f28583R || ((i = this.f28629d.f30225H) != -1 && i == bVar.f28629d.f30225H)) && (dVar2.f28585a0 || (this.f28556C == bVar.f28556C && this.f28557D == bVar.f28557D))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: u3.m$c */
    /* compiled from: DefaultTrackSelector */
    private static final class C5724c implements Comparable<C5724c> {

        /* renamed from: a */
        private final boolean f28572a;

        /* renamed from: b */
        private final boolean f28573b;

        public C5724c(C6272r1 r1Var, int i) {
            this.f28572a = (r1Var.f30235d & 1) == 0 ? false : true;
            this.f28573b = C5721m.m34119I(i, false);
        }

        /* renamed from: a */
        public int compareTo(C5724c cVar) {
            return C6659k.m38354j().mo22457g(this.f28573b, cVar.f28573b).mo22457g(this.f28572a, cVar.f28572a).mo22459i();
        }
    }

    /* renamed from: u3.m$d */
    /* compiled from: DefaultTrackSelector */
    public static final class C5725d extends C5743z {

        /* renamed from: h0 */
        public static final C5725d f28574h0;
        @Deprecated

        /* renamed from: i0 */
        public static final C5725d f28575i0;

        /* renamed from: j0 */
        public static final C6224h.C6225a<C5725d> f28576j0 = C12674n.f46443a;

        /* renamed from: L */
        public final boolean f28577L;

        /* renamed from: M */
        public final boolean f28578M;

        /* renamed from: N */
        public final boolean f28579N;

        /* renamed from: O */
        public final boolean f28580O;

        /* renamed from: P */
        public final boolean f28581P;

        /* renamed from: Q */
        public final boolean f28582Q;

        /* renamed from: R */
        public final boolean f28583R;

        /* renamed from: S */
        public final boolean f28584S;

        /* renamed from: a0 */
        public final boolean f28585a0;

        /* renamed from: b0 */
        public final boolean f28586b0;

        /* renamed from: c0 */
        public final boolean f28587c0;

        /* renamed from: d0 */
        public final boolean f28588d0;

        /* renamed from: e0 */
        public final boolean f28589e0;
        /* access modifiers changed from: private */

        /* renamed from: f0 */
        public final SparseArray<Map<C1780z0, C5727e>> f28590f0;
        /* access modifiers changed from: private */

        /* renamed from: g0 */
        public final SparseBooleanArray f28591g0;

        static {
            C5725d X = new C5726a().mo20180A();
            f28574h0 = X;
            f28575i0 = X;
        }

        /* renamed from: f */
        private static boolean m34164f(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        private static boolean m34165g(SparseArray<Map<C1780z0, C5727e>> sparseArray, SparseArray<Map<C1780z0, C5727e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !m34166h(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m34166h(java.util.Map<p015b3.C1780z0, p149u3.C5721m.C5727e> r4, java.util.Map<p015b3.C1780z0, p149u3.C5721m.C5727e> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                b3.z0 r1 = (p015b3.C1780z0) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = p161w3.C5953m0.m35124c(r0, r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p149u3.C5721m.C5725d.m34166h(java.util.Map, java.util.Map):boolean");
        }

        /* renamed from: j */
        public static C5725d m34167j(Context context) {
            return new C5726a(context).mo20180A();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5725d.class != obj.getClass()) {
                return false;
            }
            C5725d dVar = (C5725d) obj;
            if (super.equals(dVar) && this.f28577L == dVar.f28577L && this.f28578M == dVar.f28578M && this.f28579N == dVar.f28579N && this.f28580O == dVar.f28580O && this.f28581P == dVar.f28581P && this.f28582Q == dVar.f28582Q && this.f28583R == dVar.f28583R && this.f28584S == dVar.f28584S && this.f28585a0 == dVar.f28585a0 && this.f28586b0 == dVar.f28586b0 && this.f28587c0 == dVar.f28587c0 && this.f28588d0 == dVar.f28588d0 && this.f28589e0 == dVar.f28589e0 && m34164f(this.f28591g0, dVar.f28591g0) && m34165g(this.f28590f0, dVar.f28590f0)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f28577L ? 1 : 0)) * 31) + (this.f28578M ? 1 : 0)) * 31) + (this.f28579N ? 1 : 0)) * 31) + (this.f28580O ? 1 : 0)) * 31) + (this.f28581P ? 1 : 0)) * 31) + (this.f28582Q ? 1 : 0)) * 31) + (this.f28583R ? 1 : 0)) * 31) + (this.f28584S ? 1 : 0)) * 31) + (this.f28585a0 ? 1 : 0)) * 31) + (this.f28586b0 ? 1 : 0)) * 31) + (this.f28587c0 ? 1 : 0)) * 31) + (this.f28588d0 ? 1 : 0)) * 31) + (this.f28589e0 ? 1 : 0);
        }

        /* renamed from: i */
        public C5726a mo20176i() {
            return new C5726a();
        }

        /* renamed from: k */
        public boolean mo20177k(int i) {
            return this.f28591g0.get(i);
        }

        @Deprecated
        /* renamed from: l */
        public C5727e mo20178l(int i, C1780z0 z0Var) {
            Map map = this.f28590f0.get(i);
            if (map != null) {
                return (C5727e) map.get(z0Var);
            }
            return null;
        }

        @Deprecated
        /* renamed from: m */
        public boolean mo20179m(int i, C1780z0 z0Var) {
            Map map = this.f28590f0.get(i);
            return map != null && map.containsKey(z0Var);
        }

        /* renamed from: u3.m$d$a */
        /* compiled from: DefaultTrackSelector */
        public static final class C5726a extends C5743z.C5744a {
            /* access modifiers changed from: private */

            /* renamed from: A */
            public boolean f28592A;
            /* access modifiers changed from: private */

            /* renamed from: B */
            public boolean f28593B;
            /* access modifiers changed from: private */

            /* renamed from: C */
            public boolean f28594C;
            /* access modifiers changed from: private */

            /* renamed from: D */
            public boolean f28595D;
            /* access modifiers changed from: private */

            /* renamed from: E */
            public boolean f28596E;
            /* access modifiers changed from: private */

            /* renamed from: F */
            public boolean f28597F;
            /* access modifiers changed from: private */

            /* renamed from: G */
            public boolean f28598G;
            /* access modifiers changed from: private */

            /* renamed from: H */
            public boolean f28599H;
            /* access modifiers changed from: private */

            /* renamed from: I */
            public boolean f28600I;
            /* access modifiers changed from: private */

            /* renamed from: J */
            public boolean f28601J;
            /* access modifiers changed from: private */

            /* renamed from: K */
            public boolean f28602K;
            /* access modifiers changed from: private */

            /* renamed from: L */
            public boolean f28603L;
            /* access modifiers changed from: private */

            /* renamed from: M */
            public boolean f28604M;
            /* access modifiers changed from: private */

            /* renamed from: N */
            public final SparseArray<Map<C1780z0, C5727e>> f28605N;
            /* access modifiers changed from: private */

            /* renamed from: O */
            public final SparseBooleanArray f28606O;

            /* renamed from: Y */
            private static SparseArray<Map<C1780z0, C5727e>> m34188Y(SparseArray<Map<C1780z0, C5727e>> sparseArray) {
                SparseArray<Map<C1780z0, C5727e>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            /* renamed from: Z */
            private void m34189Z() {
                this.f28592A = true;
                this.f28593B = false;
                this.f28594C = true;
                this.f28595D = false;
                this.f28596E = true;
                this.f28597F = false;
                this.f28598G = false;
                this.f28599H = false;
                this.f28600I = false;
                this.f28601J = true;
                this.f28602K = true;
                this.f28603L = false;
                this.f28604M = true;
            }

            /* renamed from: a0 */
            private SparseBooleanArray m34190a0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int append : iArr) {
                    sparseBooleanArray.append(append, true);
                }
                return sparseBooleanArray;
            }

            /* renamed from: q0 */
            private void m34191q0(Bundle bundle) {
                C6685q<C1780z0> qVar;
                SparseArray<C5727e> sparseArray;
                int[] intArray = bundle.getIntArray(C5743z.m34293b(1010));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C5743z.m34293b(1011));
                if (parcelableArrayList == null) {
                    qVar = C6685q.m38445x();
                } else {
                    qVar = C5921c.m34934b(C1780z0.f5295e, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(C5743z.m34293b(1012));
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray<>();
                } else {
                    sparseArray = C5921c.m34935c(C5727e.f28607e, sparseParcelableArray);
                }
                if (intArray != null && intArray.length == qVar.size()) {
                    for (int i = 0; i < intArray.length; i++) {
                        mo20199p0(intArray[i], qVar.get(i), sparseArray.get(i));
                    }
                }
            }

            /* renamed from: X */
            public C5725d mo20180A() {
                return new C5725d(this);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b0 */
            public C5726a mo20185b0(C5743z zVar) {
                super.mo20229D(zVar);
                return this;
            }

            /* renamed from: c0 */
            public C5726a mo20186c0(boolean z) {
                this.f28599H = z;
                return this;
            }

            /* renamed from: d0 */
            public C5726a mo20187d0(boolean z) {
                this.f28600I = z;
                return this;
            }

            /* renamed from: e0 */
            public C5726a mo20188e0(boolean z) {
                this.f28597F = z;
                return this;
            }

            /* renamed from: f0 */
            public C5726a mo20189f0(boolean z) {
                this.f28598G = z;
                return this;
            }

            /* renamed from: g0 */
            public C5726a mo20190g0(boolean z) {
                this.f28604M = z;
                return this;
            }

            /* renamed from: h0 */
            public C5726a mo20191h0(boolean z) {
                this.f28595D = z;
                return this;
            }

            /* renamed from: i0 */
            public C5726a mo20192i0(boolean z) {
                this.f28593B = z;
                return this;
            }

            /* renamed from: j0 */
            public C5726a mo20193j0(boolean z) {
                this.f28594C = z;
                return this;
            }

            /* renamed from: k0 */
            public C5726a mo20194k0(boolean z) {
                this.f28601J = z;
                return this;
            }

            /* renamed from: l0 */
            public C5726a mo20195l0(boolean z) {
                this.f28596E = z;
                return this;
            }

            /* renamed from: m0 */
            public C5726a mo20196m0(boolean z) {
                this.f28602K = z;
                return this;
            }

            /* renamed from: n0 */
            public C5726a mo20197n0(boolean z) {
                this.f28592A = z;
                return this;
            }

            /* renamed from: o0 */
            public C5726a mo20181E(Context context) {
                super.mo20181E(context);
                return this;
            }

            @Deprecated
            /* renamed from: p0 */
            public C5726a mo20199p0(int i, C1780z0 z0Var, C5727e eVar) {
                Map map = this.f28605N.get(i);
                if (map == null) {
                    map = new HashMap();
                    this.f28605N.put(i, map);
                }
                if (map.containsKey(z0Var) && C5953m0.m35124c(map.get(z0Var), eVar)) {
                    return this;
                }
                map.put(z0Var, eVar);
                return this;
            }

            /* renamed from: r0 */
            public C5726a mo20200r0(boolean z) {
                this.f28603L = z;
                return this;
            }

            /* renamed from: s0 */
            public C5726a mo20182G(int i, int i2, boolean z) {
                super.mo20182G(i, i2, z);
                return this;
            }

            /* renamed from: t0 */
            public C5726a mo20183H(Context context, boolean z) {
                super.mo20183H(context, z);
                return this;
            }

            @Deprecated
            public C5726a() {
                this.f28605N = new SparseArray<>();
                this.f28606O = new SparseBooleanArray();
                m34189Z();
            }

            public C5726a(Context context) {
                super(context);
                this.f28605N = new SparseArray<>();
                this.f28606O = new SparseBooleanArray();
                m34189Z();
            }

            private C5726a(C5725d dVar) {
                super((C5743z) dVar);
                this.f28592A = dVar.f28577L;
                this.f28593B = dVar.f28578M;
                this.f28594C = dVar.f28579N;
                this.f28595D = dVar.f28580O;
                this.f28596E = dVar.f28581P;
                this.f28597F = dVar.f28582Q;
                this.f28598G = dVar.f28583R;
                this.f28599H = dVar.f28584S;
                this.f28600I = dVar.f28585a0;
                this.f28601J = dVar.f28586b0;
                this.f28602K = dVar.f28587c0;
                this.f28603L = dVar.f28588d0;
                this.f28604M = dVar.f28589e0;
                this.f28605N = m34188Y(dVar.f28590f0);
                this.f28606O = dVar.f28591g0.clone();
            }

            private C5726a(Bundle bundle) {
                super(bundle);
                m34189Z();
                C5725d dVar = C5725d.f28574h0;
                mo20197n0(bundle.getBoolean(C5743z.m34293b(AdError.NETWORK_ERROR_CODE), dVar.f28577L));
                mo20192i0(bundle.getBoolean(C5743z.m34293b(AdError.NO_FILL_ERROR_CODE), dVar.f28578M));
                mo20193j0(bundle.getBoolean(C5743z.m34293b(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE), dVar.f28579N));
                mo20191h0(bundle.getBoolean(C5743z.m34293b(1014), dVar.f28580O));
                mo20195l0(bundle.getBoolean(C5743z.m34293b(1003), dVar.f28581P));
                mo20188e0(bundle.getBoolean(C5743z.m34293b(1004), dVar.f28582Q));
                mo20189f0(bundle.getBoolean(C5743z.m34293b(1005), dVar.f28583R));
                mo20186c0(bundle.getBoolean(C5743z.m34293b(1006), dVar.f28584S));
                mo20187d0(bundle.getBoolean(C5743z.m34293b(1015), dVar.f28585a0));
                mo20194k0(bundle.getBoolean(C5743z.m34293b(1016), dVar.f28586b0));
                mo20196m0(bundle.getBoolean(C5743z.m34293b(1007), dVar.f28587c0));
                mo20200r0(bundle.getBoolean(C5743z.m34293b(1008), dVar.f28588d0));
                mo20190g0(bundle.getBoolean(C5743z.m34293b(1009), dVar.f28589e0));
                this.f28605N = new SparseArray<>();
                m34191q0(bundle);
                this.f28606O = m34190a0(bundle.getIntArray(C5743z.m34293b(1013)));
            }
        }

        private C5725d(C5726a aVar) {
            super(aVar);
            this.f28577L = aVar.f28592A;
            this.f28578M = aVar.f28593B;
            this.f28579N = aVar.f28594C;
            this.f28580O = aVar.f28595D;
            this.f28581P = aVar.f28596E;
            this.f28582Q = aVar.f28597F;
            this.f28583R = aVar.f28598G;
            this.f28584S = aVar.f28599H;
            this.f28585a0 = aVar.f28600I;
            this.f28586b0 = aVar.f28601J;
            this.f28587c0 = aVar.f28602K;
            this.f28588d0 = aVar.f28603L;
            this.f28589e0 = aVar.f28604M;
            this.f28590f0 = aVar.f28605N;
            this.f28591g0 = aVar.f28606O;
        }
    }

    /* renamed from: u3.m$e */
    /* compiled from: DefaultTrackSelector */
    public static final class C5727e implements C6224h {

        /* renamed from: e */
        public static final C6224h.C6225a<C5727e> f28607e = C12675o.f46444a;

        /* renamed from: a */
        public final int f28608a;

        /* renamed from: b */
        public final int[] f28609b;

        /* renamed from: c */
        public final int f28610c;

        /* renamed from: d */
        public final int f28611d;

        public C5727e(int i, int[] iArr, int i2) {
            this.f28608a = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f28609b = copyOf;
            this.f28610c = iArr.length;
            this.f28611d = i2;
            Arrays.sort(copyOf);
        }

        /* renamed from: b */
        private static String m34216b(int i) {
            return Integer.toString(i, 36);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static /* synthetic */ C5727e m34217c(Bundle bundle) {
            boolean z = false;
            int i = bundle.getInt(m34216b(0), -1);
            int[] intArray = bundle.getIntArray(m34216b(1));
            int i2 = bundle.getInt(m34216b(2), -1);
            if (i >= 0 && i2 >= 0) {
                z = true;
            }
            C5917a.m34868a(z);
            C5917a.m34872e(intArray);
            return new C5727e(i, intArray, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5727e.class != obj.getClass()) {
                return false;
            }
            C5727e eVar = (C5727e) obj;
            if (this.f28608a == eVar.f28608a && Arrays.equals(this.f28609b, eVar.f28609b) && this.f28611d == eVar.f28611d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f28608a * 31) + Arrays.hashCode(this.f28609b)) * 31) + this.f28611d;
        }
    }

    /* renamed from: u3.m$f */
    /* compiled from: DefaultTrackSelector */
    private static class C5728f {

        /* renamed from: a */
        private final Spatializer f28612a;

        /* renamed from: b */
        private final boolean f28613b;

        /* renamed from: c */
        private Handler f28614c;

        /* renamed from: d */
        private Spatializer.OnSpatializerStateChangedListener f28615d;

        /* renamed from: u3.m$f$a */
        /* compiled from: DefaultTrackSelector */
        class C5729a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a */
            final /* synthetic */ C5721m f28616a;

            C5729a(C5728f fVar, C5721m mVar) {
                this.f28616a = mVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                this.f28616a.m34126P();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                this.f28616a.m34126P();
            }
        }

        private C5728f(Spatializer spatializer) {
            this.f28612a = spatializer;
            this.f28613b = spatializer.getImmersiveAudioLevel() != 0;
        }

        /* renamed from: g */
        public static C5728f m34218g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new C5728f(audioManager.getSpatializer());
        }

        /* renamed from: a */
        public boolean mo20205a(C1624e eVar, C6272r1 r1Var) {
            int i;
            if (!"audio/eac3-joc".equals(r1Var.f30243t) || r1Var.f30224G != 16) {
                i = r1Var.f30224G;
            } else {
                i = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(C5953m0.m35080G(i));
            int i2 = r1Var.f30225H;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            return this.f28612a.canBeSpatialized(eVar.mo6457b().f4661a, channelMask.build());
        }

        /* renamed from: b */
        public void mo20206b(C5721m mVar, Looper looper) {
            if (this.f28615d == null && this.f28614c == null) {
                this.f28615d = new C5729a(this, mVar);
                Handler handler = new Handler(looper);
                this.f28614c = handler;
                Spatializer spatializer = this.f28612a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new C1612a0(handler), this.f28615d);
            }
        }

        /* renamed from: c */
        public boolean mo20207c() {
            return this.f28612a.isAvailable();
        }

        /* renamed from: d */
        public boolean mo20208d() {
            return this.f28612a.isEnabled();
        }

        /* renamed from: e */
        public boolean mo20209e() {
            return this.f28613b;
        }

        /* renamed from: f */
        public void mo20210f() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f28615d;
            if (onSpatializerStateChangedListener != null && this.f28614c != null) {
                this.f28612a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
                ((Handler) C5953m0.m35138j(this.f28614c)).removeCallbacksAndMessages((Object) null);
                this.f28614c = null;
                this.f28615d = null;
            }
        }
    }

    /* renamed from: u3.m$g */
    /* compiled from: DefaultTrackSelector */
    private static final class C5730g extends C5731h<C5730g> implements Comparable<C5730g> {

        /* renamed from: e */
        private final int f28617e;

        /* renamed from: f */
        private final boolean f28618f;

        /* renamed from: g */
        private final boolean f28619g;

        /* renamed from: h */
        private final boolean f28620h;

        /* renamed from: i */
        private final int f28621i;

        /* renamed from: r */
        private final int f28622r;

        /* renamed from: s */
        private final int f28623s;

        /* renamed from: t */
        private final int f28624t;

        /* renamed from: u */
        private final boolean f28625u;

        public C5730g(int i, C1776x0 x0Var, int i2, C5725d dVar, int i3, String str) {
            super(i, x0Var, i2);
            C6685q<String> qVar;
            int i4;
            int i5 = 0;
            this.f28618f = C5721m.m34119I(i3, false);
            int i6 = this.f28629d.f30235d & (~dVar.f28665C);
            this.f28619g = (i6 & 1) != 0;
            this.f28620h = (i6 & 2) != 0;
            int i7 = Integer.MAX_VALUE;
            if (dVar.f28663A.isEmpty()) {
                qVar = C6685q.m38446y("");
            } else {
                qVar = dVar.f28663A;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= qVar.size()) {
                    i4 = 0;
                    break;
                }
                i4 = C5721m.m34112B(this.f28629d, qVar.get(i8), dVar.f28666D);
                if (i4 > 0) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            this.f28621i = i7;
            this.f28622r = i4;
            int t = C5721m.m34115E(this.f28629d.f30236e, dVar.f28664B);
            this.f28623s = t;
            this.f28625u = (this.f28629d.f30236e & 1088) != 0;
            int B = C5721m.m34112B(this.f28629d, str, C5721m.m34127Q(str) == null);
            this.f28624t = B;
            boolean z = i4 > 0 || (dVar.f28663A.isEmpty() && t > 0) || this.f28619g || (this.f28620h && B > 0);
            if (C5721m.m34119I(i3, dVar.f28587c0) && z) {
                i5 = 1;
            }
            this.f28617e = i5;
        }

        /* renamed from: c */
        public static int m34225c(List<C5730g> list, List<C5730g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        /* renamed from: k */
        public static C6685q<C5730g> m34226k(int i, C1776x0 x0Var, C5725d dVar, int[] iArr, String str) {
            C6685q.C6686a r = C6685q.m38441r();
            for (int i2 = 0; i2 < x0Var.f5280a; i2++) {
                r.mo22506a(new C5730g(i, x0Var, i2, dVar, iArr[i2], str));
            }
            return r.mo22547h();
        }

        /* renamed from: a */
        public int mo20167a() {
            return this.f28617e;
        }

        /* renamed from: j */
        public int compareTo(C5730g gVar) {
            C6659k d = C6659k.m38354j().mo22457g(this.f28618f, gVar.f28618f).mo22456f(Integer.valueOf(this.f28621i), Integer.valueOf(gVar.f28621i), C6653h0.m38338b().mo22416d()).mo22454d(this.f28622r, gVar.f28622r).mo22454d(this.f28623s, gVar.f28623s).mo22457g(this.f28619g, gVar.f28619g).mo22456f(Boolean.valueOf(this.f28620h), Boolean.valueOf(gVar.f28620h), this.f28622r == 0 ? C6653h0.m38338b() : C6653h0.m38338b().mo22416d()).mo22454d(this.f28624t, gVar.f28624t);
            if (this.f28623s == 0) {
                d = d.mo22458h(this.f28625u, gVar.f28625u);
            }
            return d.mo22459i();
        }

        /* renamed from: n */
        public boolean mo20168b(C5730g gVar) {
            return false;
        }
    }

    /* renamed from: u3.m$h */
    /* compiled from: DefaultTrackSelector */
    private static abstract class C5731h<T extends C5731h<T>> {

        /* renamed from: a */
        public final int f28626a;

        /* renamed from: b */
        public final C1776x0 f28627b;

        /* renamed from: c */
        public final int f28628c;

        /* renamed from: d */
        public final C6272r1 f28629d;

        /* renamed from: u3.m$h$a */
        /* compiled from: DefaultTrackSelector */
        public interface C5732a<T extends C5731h<T>> {
            /* renamed from: a */
            List<T> mo20216a(int i, C1776x0 x0Var, int[] iArr);
        }

        public C5731h(int i, C1776x0 x0Var, int i2) {
            this.f28626a = i;
            this.f28627b = x0Var;
            this.f28628c = i2;
            this.f28629d = x0Var.mo6897b(i2);
        }

        /* renamed from: a */
        public abstract int mo20167a();

        /* renamed from: b */
        public abstract boolean mo20168b(T t);
    }

    /* renamed from: u3.m$i */
    /* compiled from: DefaultTrackSelector */
    private static final class C5733i extends C5731h<C5733i> {

        /* renamed from: e */
        private final boolean f28630e;

        /* renamed from: f */
        private final C5725d f28631f;

        /* renamed from: g */
        private final boolean f28632g;

        /* renamed from: h */
        private final boolean f28633h;

        /* renamed from: i */
        private final int f28634i;

        /* renamed from: r */
        private final int f28635r;

        /* renamed from: s */
        private final int f28636s;

        /* renamed from: t */
        private final int f28637t;

        /* renamed from: u */
        private final boolean f28638u;

        /* renamed from: v */
        private final boolean f28639v;

        /* renamed from: w */
        private final int f28640w;

        /* renamed from: x */
        private final boolean f28641x;

        /* renamed from: y */
        private final boolean f28642y;

        /* renamed from: z */
        private final int f28643z;

        /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x00cc A[EDGE_INSN: B:74:0x00cc->B:65:0x00cc ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C5733i(int r5, p015b3.C1776x0 r6, int r7, p149u3.C5721m.C5725d r8, int r9, int r10, boolean r11) {
            /*
                r4 = this;
                r4.<init>(r5, r6, r7)
                r4.f28631f = r8
                boolean r5 = r8.f28579N
                if (r5 == 0) goto L_0x000c
                r5 = 24
                goto L_0x000e
            L_0x000c:
                r5 = 16
            L_0x000e:
                boolean r6 = r8.f28578M
                r7 = 1
                r0 = 0
                if (r6 == 0) goto L_0x001a
                r6 = r10 & r5
                if (r6 == 0) goto L_0x001a
                r6 = 1
                goto L_0x001b
            L_0x001a:
                r6 = 0
            L_0x001b:
                r4.f28639v = r6
                r6 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10 = -1
                if (r11 == 0) goto L_0x004b
                z1.r1 r1 = r4.f28629d
                int r2 = r1.f30248y
                if (r2 == r10) goto L_0x002c
                int r3 = r8.f28671a
                if (r2 > r3) goto L_0x004b
            L_0x002c:
                int r2 = r1.f30249z
                if (r2 == r10) goto L_0x0034
                int r3 = r8.f28672b
                if (r2 > r3) goto L_0x004b
            L_0x0034:
                float r2 = r1.f30218A
                int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r3 == 0) goto L_0x0041
                int r3 = r8.f28673c
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 > 0) goto L_0x004b
            L_0x0041:
                int r1 = r1.f30239h
                if (r1 == r10) goto L_0x0049
                int r2 = r8.f28674d
                if (r1 > r2) goto L_0x004b
            L_0x0049:
                r1 = 1
                goto L_0x004c
            L_0x004b:
                r1 = 0
            L_0x004c:
                r4.f28630e = r1
                if (r11 == 0) goto L_0x0079
                z1.r1 r11 = r4.f28629d
                int r1 = r11.f30248y
                if (r1 == r10) goto L_0x005a
                int r2 = r8.f28675e
                if (r1 < r2) goto L_0x0079
            L_0x005a:
                int r1 = r11.f30249z
                if (r1 == r10) goto L_0x0062
                int r2 = r8.f28676f
                if (r1 < r2) goto L_0x0079
            L_0x0062:
                float r1 = r11.f30218A
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 == 0) goto L_0x006f
                int r6 = r8.f28677g
                float r6 = (float) r6
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 < 0) goto L_0x0079
            L_0x006f:
                int r6 = r11.f30239h
                if (r6 == r10) goto L_0x0077
                int r10 = r8.f28678h
                if (r6 < r10) goto L_0x0079
            L_0x0077:
                r6 = 1
                goto L_0x007a
            L_0x0079:
                r6 = 0
            L_0x007a:
                r4.f28632g = r6
                boolean r6 = p149u3.C5721m.m34119I(r9, r0)
                r4.f28633h = r6
                z1.r1 r6 = r4.f28629d
                int r10 = r6.f30239h
                r4.f28634i = r10
                int r6 = r6.mo21486f()
                r4.f28635r = r6
                z1.r1 r6 = r4.f28629d
                int r6 = r6.f30236e
                int r10 = r8.f28683u
                int r6 = p149u3.C5721m.m34115E(r6, r10)
                r4.f28637t = r6
                z1.r1 r6 = r4.f28629d
                int r6 = r6.f30236e
                if (r6 == 0) goto L_0x00a6
                r6 = r6 & r7
                if (r6 == 0) goto L_0x00a4
                goto L_0x00a6
            L_0x00a4:
                r6 = 0
                goto L_0x00a7
            L_0x00a6:
                r6 = 1
            L_0x00a7:
                r4.f28638u = r6
                r6 = 2147483647(0x7fffffff, float:NaN)
                r10 = 0
            L_0x00ad:
                b7.q<java.lang.String> r11 = r8.f28682t
                int r11 = r11.size()
                if (r10 >= r11) goto L_0x00cc
                z1.r1 r11 = r4.f28629d
                java.lang.String r11 = r11.f30243t
                if (r11 == 0) goto L_0x00c9
                b7.q<java.lang.String> r1 = r8.f28682t
                java.lang.Object r1 = r1.get(r10)
                boolean r11 = r11.equals(r1)
                if (r11 == 0) goto L_0x00c9
                r6 = r10
                goto L_0x00cc
            L_0x00c9:
                int r10 = r10 + 1
                goto L_0x00ad
            L_0x00cc:
                r4.f28636s = r6
                int r6 = p177z1.C6217e3.m36428e(r9)
                r8 = 128(0x80, float:1.794E-43)
                if (r6 != r8) goto L_0x00d8
                r6 = 1
                goto L_0x00d9
            L_0x00d8:
                r6 = 0
            L_0x00d9:
                r4.f28641x = r6
                int r6 = p177z1.C6217e3.m36430g(r9)
                r8 = 64
                if (r6 != r8) goto L_0x00e4
                goto L_0x00e5
            L_0x00e4:
                r7 = 0
            L_0x00e5:
                r4.f28642y = r7
                z1.r1 r6 = r4.f28629d
                java.lang.String r6 = r6.f30243t
                int r6 = p149u3.C5721m.m34116F(r6)
                r4.f28643z = r6
                int r5 = r4.m34240q(r9, r5)
                r4.f28640w = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p149u3.C5721m.C5733i.<init>(int, b3.x0, int, u3.m$d, int, int, boolean):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static int m34236k(C5733i iVar, C5733i iVar2) {
            C6659k g = C6659k.m38354j().mo22457g(iVar.f28633h, iVar2.f28633h).mo22454d(iVar.f28637t, iVar2.f28637t).mo22457g(iVar.f28638u, iVar2.f28638u).mo22457g(iVar.f28630e, iVar2.f28630e).mo22457g(iVar.f28632g, iVar2.f28632g).mo22456f(Integer.valueOf(iVar.f28636s), Integer.valueOf(iVar2.f28636s), C6653h0.m38338b().mo22416d()).mo22457g(iVar.f28641x, iVar2.f28641x).mo22457g(iVar.f28642y, iVar2.f28642y);
            if (iVar.f28641x && iVar.f28642y) {
                g = g.mo22454d(iVar.f28643z, iVar2.f28643z);
            }
            return g.mo22459i();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static int m34237n(C5733i iVar, C5733i iVar2) {
            C6653h0 h0Var;
            if (!iVar.f28630e || !iVar.f28633h) {
                h0Var = C5721m.f28545k.mo22416d();
            } else {
                h0Var = C5721m.f28545k;
            }
            return C6659k.m38354j().mo22456f(Integer.valueOf(iVar.f28634i), Integer.valueOf(iVar2.f28634i), iVar.f28631f.f28667E ? C5721m.f28545k.mo22416d() : C5721m.f28546l).mo22456f(Integer.valueOf(iVar.f28635r), Integer.valueOf(iVar2.f28635r), h0Var).mo22456f(Integer.valueOf(iVar.f28634i), Integer.valueOf(iVar2.f28634i), h0Var).mo22459i();
        }

        /* renamed from: o */
        public static int m34238o(List<C5733i> list, List<C5733i> list2) {
            return C6659k.m38354j().mo22456f((C5733i) Collections.max(list, C12676p.f46445a), (C5733i) Collections.max(list2, C12676p.f46445a), C12676p.f46445a).mo22454d(list.size(), list2.size()).mo22456f((C5733i) Collections.max(list, C12677q.f46446a), (C5733i) Collections.max(list2, C12677q.f46446a), C12677q.f46446a).mo22459i();
        }

        /* renamed from: p */
        public static C6685q<C5733i> m34239p(int i, C1776x0 x0Var, C5725d dVar, int[] iArr, int i2) {
            C1776x0 x0Var2 = x0Var;
            C5725d dVar2 = dVar;
            int s = C5721m.m34113C(x0Var2, dVar2.f28679i, dVar2.f28680r, dVar2.f28681s);
            C6685q.C6686a r = C6685q.m38441r();
            for (int i3 = 0; i3 < x0Var2.f5280a; i3++) {
                int f = x0Var2.mo6897b(i3).mo21486f();
                r.mo22506a(new C5733i(i, x0Var, i3, dVar, iArr[i3], i2, s == Integer.MAX_VALUE || (f != -1 && f <= s)));
            }
            return r.mo22547h();
        }

        /* renamed from: q */
        private int m34240q(int i, int i2) {
            if ((this.f28629d.f30236e & 16384) != 0 || !C5721m.m34119I(i, this.f28631f.f28587c0)) {
                return 0;
            }
            if (!this.f28630e && !this.f28631f.f28577L) {
                return 0;
            }
            if (C5721m.m34119I(i, false) && this.f28632g && this.f28630e && this.f28629d.f30239h != -1) {
                C5725d dVar = this.f28631f;
                return (dVar.f28668F || dVar.f28667E || (i & i2) == 0) ? 1 : 2;
            }
        }

        /* renamed from: a */
        public int mo20167a() {
            return this.f28640w;
        }

        /* renamed from: r */
        public boolean mo20168b(C5733i iVar) {
            return (this.f28639v || C5953m0.m35124c(this.f28629d.f30243t, iVar.f28629d.f30243t)) && (this.f28631f.f28580O || (this.f28641x == iVar.f28641x && this.f28642y == iVar.f28642y));
        }
    }

    public C5721m(Context context) {
        this(context, new C5713a.C5715b());
    }

    /* renamed from: A */
    private static void m34111A(C1780z0 z0Var, C5743z zVar, Map<Integer, C5742x> map) {
        C5742x xVar;
        for (int i = 0; i < z0Var.f5296a; i++) {
            C5742x xVar2 = zVar.f28669G.get(z0Var.mo6903b(i));
            if (xVar2 != null && ((xVar = map.get(Integer.valueOf(xVar2.mo20226b()))) == null || (xVar.f28659b.isEmpty() && !xVar2.f28659b.isEmpty()))) {
                map.put(Integer.valueOf(xVar2.mo20226b()), xVar2);
            }
        }
    }

    /* renamed from: B */
    protected static int m34112B(C6272r1 r1Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(r1Var.f30234c)) {
            return 4;
        }
        String Q = m34127Q(str);
        String Q2 = m34127Q(r1Var.f30234c);
        if (Q2 == null || Q == null) {
            if (!z || Q2 != null) {
                return 0;
            }
            return 1;
        } else if (Q2.startsWith(Q) || Q.startsWith(Q2)) {
            return 3;
        } else {
            if (C5953m0.m35103R0(Q2, "-")[0].equals(C5953m0.m35103R0(Q, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static int m34113C(C1776x0 x0Var, int i, int i2, boolean z) {
        int i3;
        int i4 = Integer.MAX_VALUE;
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            for (int i5 = 0; i5 < x0Var.f5280a; i5++) {
                C6272r1 b = x0Var.mo6897b(i5);
                int i6 = b.f30248y;
                if (i6 > 0 && (i3 = b.f30249z) > 0) {
                    Point D = m34114D(z, i, i2, i6, i3);
                    int i7 = b.f30248y;
                    int i8 = b.f30249z;
                    int i9 = i7 * i8;
                    if (i7 >= ((int) (((float) D.x) * 0.98f)) && i8 >= ((int) (((float) D.y) * 0.98f)) && i9 < i4) {
                        i4 = i9;
                    }
                }
            }
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point m34114D(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p161w3.C5953m0.m35142l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p161w3.C5953m0.m35142l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p149u3.C5721m.m34114D(boolean, int, int, int, int):android.graphics.Point");
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static int m34115E(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static int m34116F(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1662735862:
                if (str.equals("video/av01")) {
                    c = 0;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 1;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public boolean m34117G(C6272r1 r1Var) {
        boolean z;
        C5728f fVar;
        C5728f fVar2;
        synchronized (this.f28547d) {
            if (this.f28551h.f28586b0 && !this.f28550g && r1Var.f30224G > 2 && (!m34118H(r1Var) || (C5953m0.f29110a >= 32 && (fVar2 = this.f28552i) != null && fVar2.mo20209e()))) {
                if (C5953m0.f29110a < 32 || (fVar = this.f28552i) == null || !fVar.mo20209e() || !this.f28552i.mo20207c() || !this.f28552i.mo20208d() || !this.f28552i.mo20205a(this.f28553j, r1Var)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: H */
    private static boolean m34118H(C6272r1 r1Var) {
        String str = r1Var.f30243t;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: I */
    protected static boolean m34119I(int i, boolean z) {
        int f = C6217e3.m36429f(i);
        return f == 4 || (z && f == 3);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ List m34120J(C5725d dVar, boolean z, int i, C1776x0 x0Var, int[] iArr) {
        return C5723b.m34154k(i, x0Var, dVar, iArr, z, new C12665d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static /* synthetic */ int m34123M(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            if (num2.intValue() == -1) {
                return 0;
            }
            return -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static /* synthetic */ int m34124N(Integer num, Integer num2) {
        return 0;
    }

    /* renamed from: O */
    private static void m34125O(C5739u.C5740a aVar, int[][][] iArr, C6223g3[] g3VarArr, C5735s[] sVarArr) {
        boolean z;
        boolean z2 = false;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            if (i >= aVar.mo20221d()) {
                z = true;
                break;
            }
            int e = aVar.mo20222e(i);
            C5735s sVar = sVarArr[i];
            if ((e == 1 || e == 2) && sVar != null && m34128R(iArr[i], aVar.mo20223f(i), sVar)) {
                if (e == 1) {
                    if (i3 != -1) {
                        break;
                    }
                    i3 = i;
                } else if (i2 != -1) {
                    break;
                } else {
                    i2 = i;
                }
            }
            i++;
        }
        z = false;
        if (!(i3 == -1 || i2 == -1)) {
            z2 = true;
        }
        if (z && z2) {
            C6223g3 g3Var = new C6223g3(true);
            g3VarArr[i3] = g3Var;
            g3VarArr[i2] = g3Var;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r1 = r3.f28552i;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m34126P() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f28547d
            monitor-enter(r0)
            u3.m$d r1 = r3.f28551h     // Catch:{ all -> 0x0027 }
            boolean r1 = r1.f28586b0     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x001f
            boolean r1 = r3.f28550g     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x001f
            int r1 = p161w3.C5953m0.f29110a     // Catch:{ all -> 0x0027 }
            r2 = 32
            if (r1 < r2) goto L_0x001f
            u3.m$f r1 = r3.f28552i     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x001f
            boolean r1 = r1.mo20209e()     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x001f
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0026
            r3.mo20135c()
        L_0x0026:
            return
        L_0x0027:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p149u3.C5721m.m34126P():void");
    }

    /* renamed from: Q */
    protected static String m34127Q(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: R */
    private static boolean m34128R(int[][] iArr, C1780z0 z0Var, C5735s sVar) {
        if (sVar == null) {
            return false;
        }
        int c = z0Var.mo6904c(sVar.mo20142a());
        for (int i = 0; i < sVar.length(); i++) {
            if (C6217e3.m36431h(iArr[c][sVar.mo20145d(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: W */
    private <T extends C5731h<T>> Pair<C5735s.C5736a, Integer> m34129W(int i, C5739u.C5740a aVar, int[][][] iArr, C5731h.C5732a<T> aVar2, Comparator<List<T>> comparator) {
        int i2;
        Object obj;
        C5739u.C5740a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d = aVar.mo20221d();
        int i3 = 0;
        while (i3 < d) {
            if (i == aVar3.mo20222e(i3)) {
                C1780z0 f = aVar3.mo20223f(i3);
                int i4 = 0;
                while (i4 < f.f5296a) {
                    C1776x0 b = f.mo6903b(i4);
                    List<T> a = aVar2.mo20216a(i3, b, iArr[i3][i4]);
                    boolean[] zArr = new boolean[b.f5280a];
                    int i5 = 0;
                    while (i5 < b.f5280a) {
                        C5731h hVar = (C5731h) a.get(i5);
                        int a2 = hVar.mo20167a();
                        if (zArr[i5] || a2 == 0) {
                            i2 = d;
                        } else {
                            if (a2 == 1) {
                                obj = C6685q.m38446y(hVar);
                                i2 = d;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(hVar);
                                int i6 = i5 + 1;
                                while (i6 < b.f5280a) {
                                    C5731h hVar2 = (C5731h) a.get(i6);
                                    int i7 = d;
                                    if (hVar2.mo20167a() == 2 && hVar.mo20168b(hVar2)) {
                                        arrayList2.add(hVar2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    C5739u.C5740a aVar4 = aVar;
                                    d = i7;
                                }
                                i2 = d;
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i5++;
                        C5739u.C5740a aVar5 = aVar;
                        d = i2;
                    }
                    int i8 = d;
                    i4++;
                    C5739u.C5740a aVar6 = aVar;
                }
            }
            C5731h.C5732a<T> aVar7 = aVar2;
            i3++;
            aVar3 = aVar;
            d = d;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((C5731h) list.get(i9)).f28628c;
        }
        C5731h hVar3 = (C5731h) list.get(0);
        return Pair.create(new C5735s.C5736a(hVar3.f28627b, iArr2), Integer.valueOf(hVar3.f28626a));
    }

    /* renamed from: y */
    private static void m34142y(C5739u.C5740a aVar, C5725d dVar, C5735s.C5736a[] aVarArr) {
        int d = aVar.mo20221d();
        for (int i = 0; i < d; i++) {
            C1780z0 f = aVar.mo20223f(i);
            if (dVar.mo20179m(i, f)) {
                C5727e l = dVar.mo20178l(i, f);
                aVarArr[i] = (l == null || l.f28609b.length == 0) ? null : new C5735s.C5736a(f.mo6903b(l.f28608a), l.f28609b, l.f28611d);
            }
        }
    }

    /* renamed from: z */
    private static void m34143z(C5739u.C5740a aVar, C5743z zVar, C5735s.C5736a[] aVarArr) {
        int d = aVar.mo20221d();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < d; i++) {
            m34111A(aVar.mo20223f(i), zVar, hashMap);
        }
        m34111A(aVar.mo20225h(), zVar, hashMap);
        for (int i2 = 0; i2 < d; i2++) {
            C5742x xVar = (C5742x) hashMap.get(Integer.valueOf(aVar.mo20222e(i2)));
            if (xVar != null) {
                aVarArr[i2] = (xVar.f28659b.isEmpty() || aVar.mo20223f(i2).mo6904c(xVar.f28658a) == -1) ? null : new C5735s.C5736a(xVar.f28658a, C9998d.m51076k(xVar.f28659b));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public C5735s.C5736a[] mo20161S(C5739u.C5740a aVar, int[][][] iArr, int[] iArr2, C5725d dVar) throws C6264q {
        String str;
        int d = aVar.mo20221d();
        C5735s.C5736a[] aVarArr = new C5735s.C5736a[d];
        Pair<C5735s.C5736a, Integer> X = mo20165X(aVar, iArr, iArr2, dVar);
        if (X != null) {
            aVarArr[((Integer) X.second).intValue()] = (C5735s.C5736a) X.first;
        }
        Pair<C5735s.C5736a, Integer> T = mo20162T(aVar, iArr, iArr2, dVar);
        if (T != null) {
            aVarArr[((Integer) T.second).intValue()] = (C5735s.C5736a) T.first;
        }
        if (T == null) {
            str = null;
        } else {
            Object obj = T.first;
            str = ((C5735s.C5736a) obj).f28644a.mo6897b(((C5735s.C5736a) obj).f28645b[0]).f30234c;
        }
        Pair<C5735s.C5736a, Integer> V = mo20164V(aVar, iArr, dVar, str);
        if (V != null) {
            aVarArr[((Integer) V.second).intValue()] = (C5735s.C5736a) V.first;
        }
        for (int i = 0; i < d; i++) {
            int e = aVar.mo20222e(i);
            if (!(e == 2 || e == 1 || e == 3)) {
                aVarArr[i] = mo20163U(e, aVar.mo20223f(i), iArr[i], dVar);
            }
        }
        return aVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public Pair<C5735s.C5736a, Integer> mo20162T(C5739u.C5740a aVar, int[][][] iArr, int[] iArr2, C5725d dVar) throws C6264q {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < aVar.mo20221d()) {
                if (2 == aVar.mo20222e(i) && aVar.mo20223f(i).f5296a > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return m34129W(1, aVar, iArr, new C12673l(this, dVar, z), C12668g.f46433a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public C5735s.C5736a mo20163U(int i, C1780z0 z0Var, int[][] iArr, C5725d dVar) throws C6264q {
        C1776x0 x0Var = null;
        C5724c cVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < z0Var.f5296a; i3++) {
            C1776x0 b = z0Var.mo6903b(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < b.f5280a; i4++) {
                if (m34119I(iArr2[i4], dVar.f28587c0)) {
                    C5724c cVar2 = new C5724c(b.mo6897b(i4), iArr2[i4]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        x0Var = b;
                        i2 = i4;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (x0Var == null) {
            return null;
        }
        return new C5735s.C5736a(x0Var, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public Pair<C5735s.C5736a, Integer> mo20164V(C5739u.C5740a aVar, int[][][] iArr, C5725d dVar, String str) throws C6264q {
        return m34129W(3, aVar, iArr, new C12671j(dVar, str), C12669h.f46434a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public Pair<C5735s.C5736a, Integer> mo20165X(C5739u.C5740a aVar, int[][][] iArr, int[] iArr2, C5725d dVar) throws C6264q {
        return m34129W(2, aVar, iArr, new C12672k(dVar, iArr2), C12670i.f46435a);
    }

    /* renamed from: d */
    public boolean mo20136d() {
        return true;
    }

    /* renamed from: f */
    public void mo20138f() {
        C5728f fVar;
        synchronized (this.f28547d) {
            if (C5953m0.f29110a >= 32 && (fVar = this.f28552i) != null) {
                fVar.mo20210f();
            }
        }
        super.mo20138f();
    }

    /* renamed from: h */
    public void mo20140h(C1624e eVar) {
        boolean z;
        synchronized (this.f28547d) {
            z = !this.f28553j.equals(eVar);
            this.f28553j = eVar;
        }
        if (z) {
            m34126P();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Pair<C6223g3[], C5735s[]> mo20166l(C5739u.C5740a aVar, int[][][] iArr, int[] iArr2, C1772x.C1774b bVar, C6266q3 q3Var) throws C6264q {
        C5725d dVar;
        C5728f fVar;
        synchronized (this.f28547d) {
            dVar = this.f28551h;
            if (dVar.f28586b0 && C5953m0.f29110a >= 32 && (fVar = this.f28552i) != null) {
                fVar.mo20206b(this, (Looper) C5917a.m34875h(Looper.myLooper()));
            }
        }
        int d = aVar.mo20221d();
        C5735s.C5736a[] S = mo20161S(aVar, iArr, iArr2, dVar);
        m34143z(aVar, dVar, S);
        m34142y(aVar, dVar, S);
        for (int i = 0; i < d; i++) {
            int e = aVar.mo20222e(i);
            if (dVar.mo20177k(i) || dVar.f28670H.contains(Integer.valueOf(e))) {
                S[i] = null;
            }
        }
        C5735s[] a = this.f28549f.mo20131a(S, mo20133a(), bVar, q3Var);
        C6223g3[] g3VarArr = new C6223g3[d];
        for (int i2 = 0; i2 < d; i2++) {
            boolean z = true;
            if ((dVar.mo20177k(i2) || dVar.f28670H.contains(Integer.valueOf(aVar.mo20222e(i2)))) || (aVar.mo20222e(i2) != -2 && a[i2] == null)) {
                z = false;
            }
            g3VarArr[i2] = z ? C6223g3.f29958b : null;
        }
        if (dVar.f28588d0) {
            m34125O(aVar, iArr, g3VarArr, a);
        }
        return Pair.create(g3VarArr, a);
    }

    public C5721m(Context context, C5735s.C5737b bVar) {
        this(context, (C5743z) C5725d.m34167j(context), bVar);
    }

    public C5721m(Context context, C5743z zVar, C5735s.C5737b bVar) {
        this(zVar, bVar, context);
    }

    private C5721m(C5743z zVar, C5735s.C5737b bVar, Context context) {
        this.f28547d = new Object();
        this.f28548e = context != null ? context.getApplicationContext() : null;
        this.f28549f = bVar;
        if (zVar instanceof C5725d) {
            this.f28551h = (C5725d) zVar;
        } else {
            this.f28551h = (context == null ? C5725d.f28574h0 : C5725d.m34167j(context)).mo20176i().mo20185b0(zVar).mo20180A();
        }
        this.f28553j = C1624e.f4653g;
        boolean z = context != null && C5953m0.m35165w0(context);
        this.f28550g = z;
        if (!z && context != null && C5953m0.f29110a >= 32) {
            this.f28552i = C5728f.m34218g(context);
        }
        if (this.f28551h.f28586b0 && context == null) {
            C5961r.m35215i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
