package com.google.protobuf;

import com.google.protobuf.C8105b2;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.protobuf.k */
/* compiled from: CodedInputStreamReader */
final class C8176k implements C8190l1 {

    /* renamed from: a */
    private final C8167j f34983a;

    /* renamed from: b */
    private int f34984b;

    /* renamed from: c */
    private int f34985c;

    /* renamed from: d */
    private int f34986d = 0;

    /* renamed from: com.google.protobuf.k$a */
    /* compiled from: CodedInputStreamReader */
    static /* synthetic */ class C8177a {

        /* renamed from: a */
        static final /* synthetic */ int[] f34987a;

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
                com.google.protobuf.b2$b[] r0 = com.google.protobuf.C8105b2.C8107b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34987a = r0
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f34987a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8176k.C8177a.<clinit>():void");
        }
    }

    private C8176k(C8167j jVar) {
        C8167j jVar2 = (C8167j) C8119d0.m44650b(jVar, "input");
        this.f34983a = jVar2;
        jVar2.f34932d = this;
    }

    /* renamed from: P */
    public static C8176k m45055P(C8167j jVar) {
        C8176k kVar = jVar.f34932d;
        if (kVar != null) {
            return kVar;
        }
        return new C8176k(jVar);
    }

    /* renamed from: Q */
    private <T> void m45056Q(T t, C8202n1<T> n1Var, C8210q qVar) throws IOException {
        int i = this.f34985c;
        this.f34985c = C8105b2.m44582c(C8105b2.m44580a(this.f34984b), 4);
        try {
            n1Var.mo27201e(t, this, qVar);
            if (this.f34984b != this.f34985c) {
                throw C8135e0.m44689h();
            }
        } finally {
            this.f34985c = i;
        }
    }

    /* renamed from: R */
    private <T> void m45057R(T t, C8202n1<T> n1Var, C8210q qVar) throws IOException {
        int E = this.f34983a.mo26967E();
        C8167j jVar = this.f34983a;
        if (jVar.f34929a < jVar.f34930b) {
            int n = jVar.mo26975n(E);
            this.f34983a.f34929a++;
            n1Var.mo27201e(t, this, qVar);
            this.f34983a.mo26971a(0);
            C8167j jVar2 = this.f34983a;
            jVar2.f34929a--;
            jVar2.mo26974m(n);
            return;
        }
        throw C8135e0.m44690i();
    }

    /* renamed from: S */
    private Object m45058S(C8105b2.C8107b bVar, Class<?> cls, C8210q qVar) throws IOException {
        switch (C8177a.f34987a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo27066k());
            case 2:
                return mo27045F();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo27077t());
            case 5:
                return Integer.valueOf(mo27065j());
            case 6:
                return Long.valueOf(mo27058c());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo27047H());
            case 9:
                return Long.valueOf(mo27052M());
            case 10:
                return mo27063h(cls, qVar);
            case 11:
                return Integer.valueOf(mo27049J());
            case 12:
                return Long.valueOf(mo27068m());
            case 13:
                return Integer.valueOf(mo27079v());
            case 14:
                return Long.valueOf(mo27081w());
            case 15:
                return mo27053N();
            case 16:
                return Integer.valueOf(mo27070o());
            case 17:
                return Long.valueOf(mo27057b());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* renamed from: T */
    private <T> T m45059T(C8202n1<T> n1Var, C8210q qVar) throws IOException {
        T i = n1Var.mo27205i();
        m45056Q(i, n1Var, qVar);
        n1Var.mo27199c(i);
        return i;
    }

    /* renamed from: U */
    private <T> T m45060U(C8202n1<T> n1Var, C8210q qVar) throws IOException {
        T i = n1Var.mo27205i();
        m45057R(i, n1Var, qVar);
        n1Var.mo27199c(i);
        return i;
    }

    /* renamed from: W */
    private void m45061W(int i) throws IOException {
        if (this.f34983a.mo26972d() != i) {
            throw C8135e0.m44692m();
        }
    }

    /* renamed from: X */
    private void m45062X(int i) throws IOException {
        if (C8105b2.m44581b(this.f34984b) != i) {
            throw C8135e0.m44686e();
        }
    }

    /* renamed from: Y */
    private void m45063Y(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C8135e0.m44689h();
        }
    }

    /* renamed from: Z */
    private void m45064Z(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C8135e0.m44689h();
        }
    }

    /* renamed from: A */
    public int mo27040A() throws IOException {
        int i = this.f34986d;
        if (i != 0) {
            this.f34984b = i;
            this.f34986d = 0;
        } else {
            this.f34984b = this.f34983a.mo26966D();
        }
        int i2 = this.f34984b;
        if (i2 == 0 || i2 == this.f34985c) {
            return Integer.MAX_VALUE;
        }
        return C8105b2.m44580a(i2);
    }

    /* renamed from: B */
    public void mo27041B(List<String> list) throws IOException {
        mo27055V(list, false);
    }

    /* renamed from: C */
    public <T> void mo27042C(T t, C8202n1<T> n1Var, C8210q qVar) throws IOException {
        m45062X(2);
        m45057R(t, n1Var, qVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (mo27048I() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new com.google.protobuf.C8135e0("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void mo27043D(java.util.Map<K, V> r8, com.google.protobuf.C8204o0.C8205a<K, V> r9, com.google.protobuf.C8210q r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.m45062X(r0)
            com.google.protobuf.j r1 = r7.f34983a
            int r1 = r1.mo26967E()
            com.google.protobuf.j r2 = r7.f34983a
            int r1 = r2.mo26975n(r1)
            K r2 = r9.f35035b
            V r3 = r9.f35037d
        L_0x0014:
            int r4 = r7.mo27040A()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            com.google.protobuf.j r5 = r7.f34983a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.mo26973e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.mo27048I()     // Catch:{ a -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.google.protobuf.e0 r4 = new com.google.protobuf.e0     // Catch:{ a -> 0x004f }
            r4.<init>((java.lang.String) r6)     // Catch:{ a -> 0x004f }
            throw r4     // Catch:{ a -> 0x004f }
        L_0x003a:
            com.google.protobuf.b2$b r4 = r9.f35036c     // Catch:{ a -> 0x004f }
            V r5 = r9.f35037d     // Catch:{ a -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004f }
            java.lang.Object r3 = r7.m45058S(r4, r5, r10)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x0047:
            com.google.protobuf.b2$b r4 = r9.f35034a     // Catch:{ a -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.m45058S(r4, r5, r5)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.mo27048I()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.protobuf.e0 r8 = new com.google.protobuf.e0     // Catch:{ all -> 0x0065 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            com.google.protobuf.j r8 = r7.f34983a
            r8.mo26974m(r1)
            return
        L_0x0065:
            r8 = move-exception
            com.google.protobuf.j r9 = r7.f34983a
            r9.mo26974m(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8176k.mo27043D(java.util.Map, com.google.protobuf.o0$a, com.google.protobuf.q):void");
    }

    /* renamed from: E */
    public void mo27044E(List<String> list) throws IOException {
        mo27055V(list, true);
    }

    /* renamed from: F */
    public C8153i mo27045F() throws IOException {
        m45062X(2);
        return this.f34983a.mo26977p();
    }

    /* renamed from: G */
    public void mo27046G(List<Float> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8251x) {
            C8251x xVar = (C8251x) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 2) {
                int E = this.f34983a.mo26967E();
                m45063Y(E);
                int d = this.f34983a.mo26972d() + E;
                do {
                    xVar.mo27364i(this.f34983a.mo26982u());
                } while (this.f34983a.mo26972d() < d);
            } else if (b == 5) {
                do {
                    xVar.mo27364i(this.f34983a.mo26982u());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 2) {
                int E2 = this.f34983a.mo26967E();
                m45063Y(E2);
                int d2 = this.f34983a.mo26972d() + E2;
                do {
                    list.add(Float.valueOf(this.f34983a.mo26982u()));
                } while (this.f34983a.mo26972d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f34983a.mo26982u()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    /* renamed from: H */
    public int mo27047H() throws IOException {
        m45062X(0);
        return this.f34983a.mo26983v();
    }

    /* renamed from: I */
    public boolean mo27048I() throws IOException {
        int i;
        if (this.f34983a.mo26973e() || (i = this.f34984b) == this.f34985c) {
            return false;
        }
        return this.f34983a.mo26970H(i);
    }

    /* renamed from: J */
    public int mo27049J() throws IOException {
        m45062X(5);
        return this.f34983a.mo26985x();
    }

    /* renamed from: K */
    public void mo27050K(List<C8153i> list) throws IOException {
        int D;
        if (C8105b2.m44581b(this.f34984b) == 2) {
            do {
                list.add(mo27045F());
                if (!this.f34983a.mo26973e()) {
                    D = this.f34983a.mo26966D();
                } else {
                    return;
                }
            } while (D == this.f34984b);
            this.f34986d = D;
            return;
        }
        throw C8135e0.m44686e();
    }

    /* renamed from: L */
    public void mo27051L(List<Double> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8198n) {
            C8198n nVar = (C8198n) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 1) {
                do {
                    nVar.mo27183i(this.f34983a.mo26978q());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else if (b == 2) {
                int E = this.f34983a.mo26967E();
                m45064Z(E);
                int d = this.f34983a.mo26972d() + E;
                do {
                    nVar.mo27183i(this.f34983a.mo26978q());
                } while (this.f34983a.mo26972d() < d);
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 1) {
                do {
                    list.add(Double.valueOf(this.f34983a.mo26978q()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else if (b2 == 2) {
                int E2 = this.f34983a.mo26967E();
                m45064Z(E2);
                int d2 = this.f34983a.mo26972d() + E2;
                do {
                    list.add(Double.valueOf(this.f34983a.mo26978q()));
                } while (this.f34983a.mo26972d() < d2);
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    /* renamed from: M */
    public long mo27052M() throws IOException {
        m45062X(0);
        return this.f34983a.mo26984w();
    }

    /* renamed from: N */
    public String mo27053N() throws IOException {
        m45062X(2);
        return this.f34983a.mo26965C();
    }

    /* renamed from: O */
    public void mo27054O(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8193m0) {
            C8193m0 m0Var = (C8193m0) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 1) {
                do {
                    m0Var.mo27162j(this.f34983a.mo26981t());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else if (b == 2) {
                int E = this.f34983a.mo26967E();
                m45064Z(E);
                int d = this.f34983a.mo26972d() + E;
                do {
                    m0Var.mo27162j(this.f34983a.mo26981t());
                } while (this.f34983a.mo26972d() < d);
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f34983a.mo26981t()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else if (b2 == 2) {
                int E2 = this.f34983a.mo26967E();
                m45064Z(E2);
                int d2 = this.f34983a.mo26972d() + E2;
                do {
                    list.add(Long.valueOf(this.f34983a.mo26981t()));
                } while (this.f34983a.mo26972d() < d2);
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    /* renamed from: V */
    public void mo27055V(List<String> list, boolean z) throws IOException {
        int D;
        int D2;
        if (C8105b2.m44581b(this.f34984b) != 2) {
            throw C8135e0.m44686e();
        } else if (!(list instanceof C8178k0) || z) {
            do {
                list.add(z ? mo27053N() : mo27083y());
                if (!this.f34983a.mo26973e()) {
                    D = this.f34983a.mo26966D();
                } else {
                    return;
                }
            } while (D == this.f34984b);
            this.f34986d = D;
        } else {
            C8178k0 k0Var = (C8178k0) list;
            do {
                k0Var.mo27022Q(mo27045F());
                if (!this.f34983a.mo26973e()) {
                    D2 = this.f34983a.mo26966D();
                } else {
                    return;
                }
            } while (D2 == this.f34984b);
            this.f34986d = D2;
        }
    }

    /* renamed from: a */
    public void mo27056a(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8114c0) {
            C8114c0 c0Var = (C8114c0) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 0) {
                do {
                    c0Var.mo26815S(this.f34983a.mo26987z());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else if (b == 2) {
                int d = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    c0Var.mo26815S(this.f34983a.mo26987z());
                } while (this.f34983a.mo26972d() < d);
                m45061W(d);
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f34983a.mo26987z()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else if (b2 == 2) {
                int d2 = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    list.add(Integer.valueOf(this.f34983a.mo26987z()));
                } while (this.f34983a.mo26972d() < d2);
                m45061W(d2);
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    /* renamed from: b */
    public long mo27057b() throws IOException {
        m45062X(0);
        return this.f34983a.mo26968F();
    }

    /* renamed from: c */
    public long mo27058c() throws IOException {
        m45062X(1);
        return this.f34983a.mo26981t();
    }

    /* renamed from: d */
    public void mo27059d(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8114c0) {
            C8114c0 c0Var = (C8114c0) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 2) {
                int E = this.f34983a.mo26967E();
                m45063Y(E);
                int d = this.f34983a.mo26972d() + E;
                do {
                    c0Var.mo26815S(this.f34983a.mo26985x());
                } while (this.f34983a.mo26972d() < d);
            } else if (b == 5) {
                do {
                    c0Var.mo26815S(this.f34983a.mo26985x());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 2) {
                int E2 = this.f34983a.mo26967E();
                m45063Y(E2);
                int d2 = this.f34983a.mo26972d() + E2;
                do {
                    list.add(Integer.valueOf(this.f34983a.mo26985x()));
                } while (this.f34983a.mo26972d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f34983a.mo26985x()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    /* renamed from: e */
    public void mo27060e(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8193m0) {
            C8193m0 m0Var = (C8193m0) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 0) {
                do {
                    m0Var.mo27162j(this.f34983a.mo26963A());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else if (b == 2) {
                int d = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    m0Var.mo27162j(this.f34983a.mo26963A());
                } while (this.f34983a.mo26972d() < d);
                m45061W(d);
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f34983a.mo26963A()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else if (b2 == 2) {
                int d2 = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    list.add(Long.valueOf(this.f34983a.mo26963A()));
                } while (this.f34983a.mo26972d() < d2);
                m45061W(d2);
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    @Deprecated
    /* renamed from: f */
    public <T> void mo27061f(List<T> list, C8202n1<T> n1Var, C8210q qVar) throws IOException {
        int D;
        if (C8105b2.m44581b(this.f34984b) == 3) {
            int i = this.f34984b;
            do {
                list.add(m45059T(n1Var, qVar));
                if (!this.f34983a.mo26973e() && this.f34986d == 0) {
                    D = this.f34983a.mo26966D();
                } else {
                    return;
                }
            } while (D == i);
            this.f34986d = D;
            return;
        }
        throw C8135e0.m44686e();
    }

    /* renamed from: g */
    public void mo27062g(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8114c0) {
            C8114c0 c0Var = (C8114c0) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 0) {
                do {
                    c0Var.mo26815S(this.f34983a.mo26967E());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else if (b == 2) {
                int d = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    c0Var.mo26815S(this.f34983a.mo26967E());
                } while (this.f34983a.mo26972d() < d);
                m45061W(d);
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f34983a.mo26967E()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else if (b2 == 2) {
                int d2 = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    list.add(Integer.valueOf(this.f34983a.mo26967E()));
                } while (this.f34983a.mo26972d() < d2);
                m45061W(d2);
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    /* renamed from: h */
    public <T> T mo27063h(Class<T> cls, C8210q qVar) throws IOException {
        m45062X(2);
        return m45060U(C8166i1.m44835a().mo26961c(cls), qVar);
    }

    /* renamed from: i */
    public <T> void mo27064i(T t, C8202n1<T> n1Var, C8210q qVar) throws IOException {
        m45062X(3);
        m45056Q(t, n1Var, qVar);
    }

    /* renamed from: j */
    public int mo27065j() throws IOException {
        m45062X(5);
        return this.f34983a.mo26980s();
    }

    /* renamed from: k */
    public boolean mo27066k() throws IOException {
        m45062X(0);
        return this.f34983a.mo26976o();
    }

    /* renamed from: l */
    public <T> void mo27067l(List<T> list, C8202n1<T> n1Var, C8210q qVar) throws IOException {
        int D;
        if (C8105b2.m44581b(this.f34984b) == 2) {
            int i = this.f34984b;
            do {
                list.add(m45060U(n1Var, qVar));
                if (!this.f34983a.mo26973e() && this.f34986d == 0) {
                    D = this.f34983a.mo26966D();
                } else {
                    return;
                }
            } while (D == i);
            this.f34986d = D;
            return;
        }
        throw C8135e0.m44686e();
    }

    /* renamed from: m */
    public long mo27068m() throws IOException {
        m45062X(1);
        return this.f34983a.mo26986y();
    }

    /* renamed from: n */
    public void mo27069n(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8193m0) {
            C8193m0 m0Var = (C8193m0) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 0) {
                do {
                    m0Var.mo27162j(this.f34983a.mo26968F());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else if (b == 2) {
                int d = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    m0Var.mo27162j(this.f34983a.mo26968F());
                } while (this.f34983a.mo26972d() < d);
                m45061W(d);
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f34983a.mo26968F()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else if (b2 == 2) {
                int d2 = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    list.add(Long.valueOf(this.f34983a.mo26968F()));
                } while (this.f34983a.mo26972d() < d2);
                m45061W(d2);
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    /* renamed from: o */
    public int mo27070o() throws IOException {
        m45062X(0);
        return this.f34983a.mo26967E();
    }

    /* renamed from: p */
    public void mo27071p(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8193m0) {
            C8193m0 m0Var = (C8193m0) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 0) {
                do {
                    m0Var.mo27162j(this.f34983a.mo26984w());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else if (b == 2) {
                int d = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    m0Var.mo27162j(this.f34983a.mo26984w());
                } while (this.f34983a.mo26972d() < d);
                m45061W(d);
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f34983a.mo26984w()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else if (b2 == 2) {
                int d2 = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    list.add(Long.valueOf(this.f34983a.mo26984w()));
                } while (this.f34983a.mo26972d() < d2);
                m45061W(d2);
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    /* renamed from: q */
    public void mo27072q(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8193m0) {
            C8193m0 m0Var = (C8193m0) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 1) {
                do {
                    m0Var.mo27162j(this.f34983a.mo26986y());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else if (b == 2) {
                int E = this.f34983a.mo26967E();
                m45064Z(E);
                int d = this.f34983a.mo26972d() + E;
                do {
                    m0Var.mo27162j(this.f34983a.mo26986y());
                } while (this.f34983a.mo26972d() < d);
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f34983a.mo26986y()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else if (b2 == 2) {
                int E2 = this.f34983a.mo26967E();
                m45064Z(E2);
                int d2 = this.f34983a.mo26972d() + E2;
                do {
                    list.add(Long.valueOf(this.f34983a.mo26986y()));
                } while (this.f34983a.mo26972d() < d2);
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    /* renamed from: r */
    public void mo27073r(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8114c0) {
            C8114c0 c0Var = (C8114c0) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 0) {
                do {
                    c0Var.mo26815S(this.f34983a.mo26983v());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else if (b == 2) {
                int d = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    c0Var.mo26815S(this.f34983a.mo26983v());
                } while (this.f34983a.mo26972d() < d);
                m45061W(d);
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f34983a.mo26983v()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else if (b2 == 2) {
                int d2 = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    list.add(Integer.valueOf(this.f34983a.mo26983v()));
                } while (this.f34983a.mo26972d() < d2);
                m45061W(d2);
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    public double readDouble() throws IOException {
        m45062X(1);
        return this.f34983a.mo26978q();
    }

    public float readFloat() throws IOException {
        m45062X(5);
        return this.f34983a.mo26982u();
    }

    /* renamed from: s */
    public void mo27076s(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8114c0) {
            C8114c0 c0Var = (C8114c0) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 0) {
                do {
                    c0Var.mo26815S(this.f34983a.mo26979r());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else if (b == 2) {
                int d = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    c0Var.mo26815S(this.f34983a.mo26979r());
                } while (this.f34983a.mo26972d() < d);
                m45061W(d);
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f34983a.mo26979r()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else if (b2 == 2) {
                int d2 = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    list.add(Integer.valueOf(this.f34983a.mo26979r()));
                } while (this.f34983a.mo26972d() < d2);
                m45061W(d2);
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    /* renamed from: t */
    public int mo27077t() throws IOException {
        m45062X(0);
        return this.f34983a.mo26979r();
    }

    /* renamed from: u */
    public void mo27078u(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8114c0) {
            C8114c0 c0Var = (C8114c0) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 2) {
                int E = this.f34983a.mo26967E();
                m45063Y(E);
                int d = this.f34983a.mo26972d() + E;
                do {
                    c0Var.mo26815S(this.f34983a.mo26980s());
                } while (this.f34983a.mo26972d() < d);
            } else if (b == 5) {
                do {
                    c0Var.mo26815S(this.f34983a.mo26980s());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 2) {
                int E2 = this.f34983a.mo26967E();
                m45063Y(E2);
                int d2 = this.f34983a.mo26972d() + E2;
                do {
                    list.add(Integer.valueOf(this.f34983a.mo26980s()));
                } while (this.f34983a.mo26972d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f34983a.mo26980s()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    /* renamed from: v */
    public int mo27079v() throws IOException {
        m45062X(0);
        return this.f34983a.mo26987z();
    }

    /* renamed from: v0 */
    public int mo27080v0() {
        return this.f34984b;
    }

    /* renamed from: w */
    public long mo27081w() throws IOException {
        m45062X(0);
        return this.f34983a.mo26963A();
    }

    /* renamed from: x */
    public void mo27082x(List<Boolean> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C8144g) {
            C8144g gVar = (C8144g) list;
            int b = C8105b2.m44581b(this.f34984b);
            if (b == 0) {
                do {
                    gVar.mo26905j(this.f34983a.mo26976o());
                    if (!this.f34983a.mo26973e()) {
                        D2 = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D2 == this.f34984b);
                this.f34986d = D2;
            } else if (b == 2) {
                int d = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    gVar.mo26905j(this.f34983a.mo26976o());
                } while (this.f34983a.mo26972d() < d);
                m45061W(d);
            } else {
                throw C8135e0.m44686e();
            }
        } else {
            int b2 = C8105b2.m44581b(this.f34984b);
            if (b2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f34983a.mo26976o()));
                    if (!this.f34983a.mo26973e()) {
                        D = this.f34983a.mo26966D();
                    } else {
                        return;
                    }
                } while (D == this.f34984b);
                this.f34986d = D;
            } else if (b2 == 2) {
                int d2 = this.f34983a.mo26972d() + this.f34983a.mo26967E();
                do {
                    list.add(Boolean.valueOf(this.f34983a.mo26976o()));
                } while (this.f34983a.mo26972d() < d2);
                m45061W(d2);
            } else {
                throw C8135e0.m44686e();
            }
        }
    }

    /* renamed from: y */
    public String mo27083y() throws IOException {
        m45062X(2);
        return this.f34983a.mo26964B();
    }

    @Deprecated
    /* renamed from: z */
    public <T> T mo27084z(Class<T> cls, C8210q qVar) throws IOException {
        m45062X(3);
        return m45059T(C8166i1.m44835a().mo26961c(cls), qVar);
    }
}
