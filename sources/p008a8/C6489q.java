package p008a8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p211d8.C9885i;
import p211d8.C9898r;
import p211d8.C9907y;
import p247h8.C10432b;
import p405y8.C13088b0;

/* renamed from: a8.q */
/* compiled from: FieldFilter */
public class C6489q extends C6494r {

    /* renamed from: a */
    private final C6491b f30839a;

    /* renamed from: b */
    private final C13088b0 f30840b;

    /* renamed from: c */
    private final C9898r f30841c;

    /* renamed from: a8.q$a */
    /* compiled from: FieldFilter */
    static /* synthetic */ class C6490a {

        /* renamed from: a */
        static final /* synthetic */ int[] f30842a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                a8.q$b[] r0 = p008a8.C6489q.C6491b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30842a = r0
                a8.q$b r1 = p008a8.C6489q.C6491b.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30842a     // Catch:{ NoSuchFieldError -> 0x001d }
                a8.q$b r1 = p008a8.C6489q.C6491b.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30842a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a8.q$b r1 = p008a8.C6489q.C6491b.EQUAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30842a     // Catch:{ NoSuchFieldError -> 0x0033 }
                a8.q$b r1 = p008a8.C6489q.C6491b.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30842a     // Catch:{ NoSuchFieldError -> 0x003e }
                a8.q$b r1 = p008a8.C6489q.C6491b.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30842a     // Catch:{ NoSuchFieldError -> 0x0049 }
                a8.q$b r1 = p008a8.C6489q.C6491b.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p008a8.C6489q.C6490a.<clinit>():void");
        }
    }

    /* renamed from: a8.q$b */
    /* compiled from: FieldFilter */
    public enum C6491b {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");
        

        /* renamed from: a */
        private final String f30854a;

        private C6491b(String str) {
            this.f30854a = str;
        }

        public String toString() {
            return this.f30854a;
        }
    }

    protected C6489q(C9898r rVar, C6491b bVar, C13088b0 b0Var) {
        this.f30841c = rVar;
        this.f30839a = bVar;
        this.f30840b = b0Var;
    }

    /* renamed from: f */
    public static C6489q m37894f(C9898r rVar, C6491b bVar, C13088b0 b0Var) {
        if (rVar.mo32415y()) {
            if (bVar == C6491b.IN) {
                return new C6497s0(rVar, b0Var);
            }
            if (bVar == C6491b.NOT_IN) {
                return new C6499t0(rVar, b0Var);
            }
            boolean z = (bVar == C6491b.ARRAY_CONTAINS || bVar == C6491b.ARRAY_CONTAINS_ANY) ? false : true;
            C10432b.m52648d(z, bVar.toString() + "queries don't make sense on document keys", new Object[0]);
            return new C6495r0(rVar, bVar, b0Var);
        } else if (bVar == C6491b.ARRAY_CONTAINS) {
            return new C6464f(rVar, b0Var);
        } else {
            if (bVar == C6491b.IN) {
                return new C6492q0(rVar, b0Var);
            }
            if (bVar == C6491b.ARRAY_CONTAINS_ANY) {
                return new C6462e(rVar, b0Var);
            }
            if (bVar == C6491b.NOT_IN) {
                return new C6513y0(rVar, b0Var);
            }
            return new C6489q(rVar, bVar, b0Var);
        }
    }

    /* renamed from: a */
    public String mo21988a() {
        return mo22037g().mo32348c() + mo22038h().toString() + C9907y.m50807b(mo22040i());
    }

    /* renamed from: b */
    public List<C6494r> mo21989b() {
        return Collections.singletonList(this);
    }

    /* renamed from: c */
    public C9898r mo21990c() {
        if (mo22041j()) {
            return mo22037g();
        }
        return null;
    }

    /* renamed from: d */
    public List<C6489q> mo21991d() {
        return Collections.singletonList(this);
    }

    /* renamed from: e */
    public boolean mo21910e(C9885i iVar) {
        C13088b0 g = iVar.mo32376g(this.f30841c);
        if (this.f30839a == C6491b.NOT_EQUAL) {
            if (g == null || !mo22042k(C9907y.m50814i(g, this.f30840b))) {
                return false;
            }
            return true;
        } else if (g == null || C9907y.m50804G(g) != C9907y.m50804G(this.f30840b) || !mo22042k(C9907y.m50814i(g, this.f30840b))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6489q)) {
            return false;
        }
        C6489q qVar = (C6489q) obj;
        if (this.f30839a != qVar.f30839a || !this.f30841c.equals(qVar.f30841c) || !this.f30840b.equals(qVar.f30840b)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public C9898r mo22037g() {
        return this.f30841c;
    }

    /* renamed from: h */
    public C6491b mo22038h() {
        return this.f30839a;
    }

    public int hashCode() {
        return ((((1147 + this.f30839a.hashCode()) * 31) + this.f30841c.hashCode()) * 31) + this.f30840b.hashCode();
    }

    /* renamed from: i */
    public C13088b0 mo22040i() {
        return this.f30840b;
    }

    /* renamed from: j */
    public boolean mo22041j() {
        return Arrays.asList(new C6491b[]{C6491b.LESS_THAN, C6491b.LESS_THAN_OR_EQUAL, C6491b.GREATER_THAN, C6491b.GREATER_THAN_OR_EQUAL, C6491b.NOT_EQUAL, C6491b.NOT_IN}).contains(this.f30839a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo22042k(int i) {
        switch (C6490a.f30842a[this.f30839a.ordinal()]) {
            case 1:
                if (i < 0) {
                    return true;
                }
                return false;
            case 2:
                if (i <= 0) {
                    return true;
                }
                return false;
            case 3:
                if (i == 0) {
                    return true;
                }
                return false;
            case 4:
                if (i != 0) {
                    return true;
                }
                return false;
            case 5:
                if (i > 0) {
                    return true;
                }
                return false;
            case 6:
                if (i >= 0) {
                    return true;
                }
                return false;
            default:
                throw C10432b.m52645a("Unknown FieldFilter operator: %s", this.f30839a);
        }
    }

    public String toString() {
        return mo21988a();
    }
}
