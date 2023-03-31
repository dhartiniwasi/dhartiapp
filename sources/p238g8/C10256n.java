package p238g8;

import android.content.Context;
import android.os.Build;
import com.google.firebase.firestore.C7959y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import p008a8.C6452b1;
import p008a8.C6479m;
import p211d8.C9888l;
import p211d8.C9899s;
import p211d8.C9905w;
import p218e6.C9975i;
import p218e6.C9977j;
import p220e8.C10009f;
import p220e8.C10012i;
import p238g8.C10285v;
import p238g8.C10291v0;
import p238g8.C10294w0;
import p247h8.C10432b;
import p247h8.C10442g;
import p247h8.C10449g0;
import p343rc.C12335j1;
import p404y7.C13064a;
import p404y7.C13073j;
import p405y8.C13088b0;
import p405y8.C13097d;
import p405y8.C13104e;
import p405y8.C13111f;
import p405y8.C13117g;
import p405y8.C13150p;
import p405y8.C13169u;
import p405y8.C13172v;
import p405y8.C13175w;
import p405y8.C13210y;

/* renamed from: g8.n */
/* compiled from: Datastore */
public class C10256n {

    /* renamed from: e */
    static final Set<String> f40770e = new HashSet(Arrays.asList(new String[]{"date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"}));

    /* renamed from: a */
    private final C6479m f40771a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10250k0 f40772b;

    /* renamed from: c */
    private final C10442g f40773c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10285v f40774d;

    /* renamed from: g8.n$a */
    /* compiled from: Datastore */
    class C10257a extends C10285v.C10290e<C13104e> {

        /* renamed from: a */
        final /* synthetic */ List f40775a;

        /* renamed from: b */
        final /* synthetic */ List f40776b;

        /* renamed from: c */
        final /* synthetic */ C9977j f40777c;

        C10257a(List list, List list2, C9977j jVar) {
            this.f40775a = list;
            this.f40776b = list2;
            this.f40777c = jVar;
        }

        /* renamed from: a */
        public void mo33007a(C12335j1 j1Var) {
            if (j1Var.mo37028o()) {
                this.f40777c.mo32546e(Collections.emptyList());
                return;
            }
            C7959y t = C10449g0.m52720t(j1Var);
            if (t.mo26469a() == C7959y.C7960a.UNAUTHENTICATED) {
                C10256n.this.f40774d.mo33073h();
            }
            this.f40777c.mo32545d(t);
        }

        /* renamed from: c */
        public void mo33008b(C13104e eVar) {
            this.f40775a.add(eVar);
            if (this.f40775a.size() == this.f40776b.size()) {
                HashMap hashMap = new HashMap();
                for (C13104e m : this.f40775a) {
                    C9899s m2 = C10256n.this.f40772b.mo32992m(m);
                    hashMap.put(m2.getKey(), m2);
                }
                ArrayList arrayList = new ArrayList();
                for (C9888l lVar : this.f40776b) {
                    arrayList.add((C9899s) hashMap.get(lVar));
                }
                this.f40777c.mo32546e(arrayList);
            }
        }
    }

    /* renamed from: g8.n$b */
    /* compiled from: Datastore */
    static /* synthetic */ class C10258b {

        /* renamed from: a */
        static final /* synthetic */ int[] f40779a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.firebase.firestore.y$a[] r0 = com.google.firebase.firestore.C7959y.C7960a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40779a = r0
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.CANCELLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.DEADLINE_EXCEEDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.RESOURCE_EXHAUSTED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.INTERNAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.UNAUTHENTICATED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.ALREADY_EXISTS     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.PERMISSION_DENIED     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.FAILED_PRECONDITION     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.ABORTED     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.OUT_OF_RANGE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.UNIMPLEMENTED     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f40779a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.firebase.firestore.y$a r1 = com.google.firebase.firestore.C7959y.C7960a.DATA_LOSS     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p238g8.C10256n.C10258b.<clinit>():void");
        }
    }

    public C10256n(C6479m mVar, C10442g gVar, C13064a<C13073j> aVar, C13064a<String> aVar2, Context context, C10234f0 f0Var) {
        this.f40771a = mVar;
        this.f40773c = gVar;
        this.f40772b = new C10250k0(mVar.mo22002a());
        this.f40774d = mo33003h(mVar, gVar, aVar, aVar2, context, f0Var);
    }

    /* renamed from: i */
    public static boolean m51895i(C12335j1 j1Var) {
        C12335j1.C12337b m = j1Var.mo37026m();
        Throwable l = j1Var.mo37025l();
        boolean z = (l instanceof SSLHandshakeException) && l.getMessage().contains("no ciphers available");
        if (Build.VERSION.SDK_INT >= 21 || !m.equals(C12335j1.C12337b.UNAVAILABLE) || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m51896j(C7959y.C7960a aVar) {
        switch (C10258b.f40779a[aVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + aVar);
        }
    }

    /* renamed from: k */
    public static boolean m51897k(C12335j1 j1Var) {
        return m51896j(C7959y.C7960a.m43894b(j1Var.mo37026m().mo37033c()));
    }

    /* renamed from: l */
    public static boolean m51898l(C12335j1 j1Var) {
        return m51897k(j1Var) && !j1Var.mo37026m().equals(C12335j1.C12337b.ABORTED);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ List m51899m(C9975i iVar) throws Exception {
        if (!iVar.mo26362q()) {
            if ((iVar.mo26357l() instanceof C7959y) && ((C7959y) iVar.mo26357l()).mo26469a() == C7959y.C7960a.UNAUTHENTICATED) {
                this.f40774d.mo33073h();
            }
            throw iVar.mo26357l();
        }
        C13117g gVar = (C13117g) iVar.mo26358m();
        C9905w y = this.f40772b.mo32998y(gVar.mo38173b0());
        int e0 = gVar.mo38175e0();
        ArrayList arrayList = new ArrayList(e0);
        for (int i = 0; i < e0; i++) {
            arrayList.add(this.f40772b.mo32994p(gVar.mo38174d0(i), y));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Long m51900n(C9975i iVar) throws Exception {
        if (!iVar.mo26362q()) {
            if ((iVar.mo26357l() instanceof C7959y) && ((C7959y) iVar.mo26357l()).mo26469a() == C7959y.C7960a.UNAUTHENTICATED) {
                this.f40774d.mo33073h();
            }
            throw iVar.mo26357l();
        }
        Map<String, C13088b0> b0 = ((C13172v) iVar.mo26358m()).mo38241c0().mo38103b0();
        boolean z = true;
        boolean z2 = b0.size() == 1;
        C10432b.m52648d(z2, "aggregateFieldsByAlias.size()==" + b0.size(), new Object[0]);
        C13088b0 b0Var = b0.get("count_alias");
        C10432b.m52648d(b0Var != null, "countValue == null", new Object[0]);
        if (b0Var.mo38122x0() != C13088b0.C13091c.INTEGER_VALUE) {
            z = false;
        }
        C10432b.m52648d(z, "countValue.getValueTypeCase() == " + b0Var.mo38122x0(), new Object[0]);
        return Long.valueOf(b0Var.mo38117s0());
    }

    /* renamed from: e */
    public C9975i<List<C10012i>> mo33000e(List<C10009f> list) {
        C13111f.C13113b g0 = C13111f.m61603g0();
        g0.mo38169E(this.f40772b.mo32984a());
        for (C10009f O : list) {
            g0.mo38168D(this.f40772b.mo32978O(O));
        }
        return this.f40774d.mo33075n(C13150p.m61716b(), (C13111f) g0.build()).mo26354i(this.f40773c.mo33524o(), new C10252l(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C10291v0 mo33001f(C10291v0.C10292a aVar) {
        return new C10291v0(this.f40774d, this.f40773c, this.f40772b, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C10294w0 mo33002g(C10294w0.C10295a aVar) {
        return new C10294w0(this.f40774d, this.f40773c, this.f40772b, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C10285v mo33003h(C6479m mVar, C10442g gVar, C13064a<C13073j> aVar, C13064a<String> aVar2, Context context, C10234f0 f0Var) {
        return new C10285v(gVar, context, aVar, aVar2, mVar, f0Var);
    }

    /* renamed from: o */
    public C9975i<List<C9899s>> mo33004o(List<C9888l> list) {
        C13097d.C13099b g0 = C13097d.m61563g0();
        g0.mo38156E(this.f40772b.mo32984a());
        for (C9888l L : list) {
            g0.mo38155D(this.f40772b.mo32976L(L));
        }
        ArrayList arrayList = new ArrayList();
        C9977j jVar = new C9977j();
        this.f40774d.mo33076o(C13150p.m61715a(), (C13097d) g0.build(), new C10257a(arrayList, list, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: p */
    public C9975i<Long> mo33005p(C6452b1 b1Var) {
        C13210y.C13215d S = this.f40772b.mo32979S(b1Var.mo21872D());
        C13175w.C13181c f0 = C13175w.m61801f0();
        f0.mo38245E(S.mo38308f0());
        C13175w.C13177b.C13178a d0 = C13175w.C13177b.m61807d0();
        d0.mo38243E(C13175w.C13177b.C13179b.m61814b0());
        d0.mo38242D("count_alias");
        f0.mo38244D(d0);
        C13169u.C13171b e0 = C13169u.m61786e0();
        e0.mo38239D(S.mo38307e0());
        e0.mo38240E(f0);
        return this.f40774d.mo33075n(C13150p.m61718d(), (C13169u) e0.build()).mo26354i(this.f40773c.mo33524o(), new C10254m(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo33006q() {
        this.f40774d.mo33077q();
    }
}
