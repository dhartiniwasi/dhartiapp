package p244ge;

import java.util.concurrent.TimeUnit;

/* renamed from: ge.e */
/* compiled from: CacheControl */
public final class C10362e {

    /* renamed from: n */
    public static final C10362e f41061n = new C10363a().mo33282c().mo33280a();

    /* renamed from: o */
    public static final C10362e f41062o = new C10363a().mo33283d().mo33281b(Integer.MAX_VALUE, TimeUnit.SECONDS).mo33280a();

    /* renamed from: a */
    private final boolean f41063a;

    /* renamed from: b */
    private final boolean f41064b;

    /* renamed from: c */
    private final int f41065c;

    /* renamed from: d */
    private final int f41066d;

    /* renamed from: e */
    private final boolean f41067e;

    /* renamed from: f */
    private final boolean f41068f;

    /* renamed from: g */
    private final boolean f41069g;

    /* renamed from: h */
    private final int f41070h;

    /* renamed from: i */
    private final int f41071i;

    /* renamed from: j */
    private final boolean f41072j;

    /* renamed from: k */
    private final boolean f41073k;

    /* renamed from: l */
    private final boolean f41074l;

    /* renamed from: m */
    String f41075m;

    /* renamed from: ge.e$a */
    /* compiled from: CacheControl */
    public static final class C10363a {

        /* renamed from: a */
        boolean f41076a;

        /* renamed from: b */
        boolean f41077b;

        /* renamed from: c */
        int f41078c = -1;

        /* renamed from: d */
        int f41079d = -1;

        /* renamed from: e */
        int f41080e = -1;

        /* renamed from: f */
        boolean f41081f;

        /* renamed from: g */
        boolean f41082g;

        /* renamed from: h */
        boolean f41083h;

        /* renamed from: a */
        public C10362e mo33280a() {
            return new C10362e(this);
        }

        /* renamed from: b */
        public C10363a mo33281b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f41079d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        /* renamed from: c */
        public C10363a mo33282c() {
            this.f41076a = true;
            return this;
        }

        /* renamed from: d */
        public C10363a mo33283d() {
            this.f41081f = true;
            return this;
        }
    }

    private C10362e(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f41063a = z;
        this.f41064b = z2;
        this.f41065c = i;
        this.f41066d = i2;
        this.f41067e = z3;
        this.f41068f = z4;
        this.f41069g = z5;
        this.f41070h = i3;
        this.f41071i = i4;
        this.f41072j = z6;
        this.f41073k = z7;
        this.f41074l = z8;
        this.f41075m = str;
    }

    /* renamed from: a */
    private String m52333a() {
        StringBuilder sb = new StringBuilder();
        if (this.f41063a) {
            sb.append("no-cache, ");
        }
        if (this.f41064b) {
            sb.append("no-store, ");
        }
        if (this.f41065c != -1) {
            sb.append("max-age=");
            sb.append(this.f41065c);
            sb.append(", ");
        }
        if (this.f41066d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f41066d);
            sb.append(", ");
        }
        if (this.f41067e) {
            sb.append("private, ");
        }
        if (this.f41068f) {
            sb.append("public, ");
        }
        if (this.f41069g) {
            sb.append("must-revalidate, ");
        }
        if (this.f41070h != -1) {
            sb.append("max-stale=");
            sb.append(this.f41070h);
            sb.append(", ");
        }
        if (this.f41071i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f41071i);
            sb.append(", ");
        }
        if (this.f41072j) {
            sb.append("only-if-cached, ");
        }
        if (this.f41073k) {
            sb.append("no-transform, ");
        }
        if (this.f41074l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p244ge.C10362e m52334k(p244ge.C10395w r22) {
        /*
            r0 = r22
            int r1 = r22.mo33405h()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x013f
            java.lang.String r2 = r0.mo33402e(r6)
            java.lang.String r4 = r0.mo33407i(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r4
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0138
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x0138
            java.lang.String r3 = "=,;"
            int r3 = p282ke.C11638e.m56731f(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0099
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0099
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            int r3 = r3 + 1
            int r0 = p282ke.C11638e.m56732g(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = p282ke.C11638e.m56731f(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009d
        L_0x0089:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = p282ke.C11638e.m56731f(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009d
        L_0x0099:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009d:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a9
            r5 = -1
            r9 = 1
            goto L_0x0133
        L_0x00a9:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b5
            r5 = -1
            r10 = 1
            goto L_0x0133
        L_0x00b5:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c4
            r5 = -1
            int r11 = p282ke.C11638e.m56729d(r0, r5)
            goto L_0x0133
        L_0x00c4:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d2
            r5 = -1
            int r12 = p282ke.C11638e.m56729d(r0, r5)
            goto L_0x0133
        L_0x00d2:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00dd
            r5 = -1
            r13 = 1
            goto L_0x0133
        L_0x00dd:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e8
            r5 = -1
            r14 = 1
            goto L_0x0133
        L_0x00e8:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f3
            r5 = -1
            r15 = 1
            goto L_0x0133
        L_0x00f3:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0104
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = p282ke.C11638e.m56729d(r0, r2)
            r5 = -1
            goto L_0x0133
        L_0x0104:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0112
            r5 = -1
            int r17 = p282ke.C11638e.m56729d(r0, r5)
            goto L_0x0133
        L_0x0112:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011e
            r18 = 1
            goto L_0x0133
        L_0x011e:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0129
            r19 = 1
            goto L_0x0133
        L_0x0129:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0133
            r20 = 1
        L_0x0133:
            r0 = r22
            r2 = r3
            goto L_0x003b
        L_0x0138:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x013f:
            if (r7 != 0) goto L_0x0144
            r21 = 0
            goto L_0x0146
        L_0x0144:
            r21 = r8
        L_0x0146:
            ge.e r0 = new ge.e
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p244ge.C10362e.m52334k(ge.w):ge.e");
    }

    /* renamed from: b */
    public boolean mo33270b() {
        return this.f41067e;
    }

    /* renamed from: c */
    public boolean mo33271c() {
        return this.f41068f;
    }

    /* renamed from: d */
    public int mo33272d() {
        return this.f41065c;
    }

    /* renamed from: e */
    public int mo33273e() {
        return this.f41070h;
    }

    /* renamed from: f */
    public int mo33274f() {
        return this.f41071i;
    }

    /* renamed from: g */
    public boolean mo33275g() {
        return this.f41069g;
    }

    /* renamed from: h */
    public boolean mo33276h() {
        return this.f41063a;
    }

    /* renamed from: i */
    public boolean mo33277i() {
        return this.f41064b;
    }

    /* renamed from: j */
    public boolean mo33278j() {
        return this.f41072j;
    }

    public String toString() {
        String str = this.f41075m;
        if (str != null) {
            return str;
        }
        String a = m52333a();
        this.f41075m = a;
        return a;
    }

    C10362e(C10363a aVar) {
        this.f41063a = aVar.f41076a;
        this.f41064b = aVar.f41077b;
        this.f41065c = aVar.f41078c;
        this.f41066d = -1;
        this.f41067e = false;
        this.f41068f = false;
        this.f41069g = false;
        this.f41070h = aVar.f41079d;
        this.f41071i = aVar.f41080e;
        this.f41072j = aVar.f41081f;
        this.f41073k = aVar.f41082g;
        this.f41074l = aVar.f41083h;
    }
}
