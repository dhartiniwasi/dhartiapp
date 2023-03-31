package p410yd;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: yd.n0 */
/* compiled from: Debug.kt */
public final class C13330n0 {

    /* renamed from: a */
    private static final boolean f47649a = false;

    /* renamed from: b */
    private static final boolean f47650b;

    /* renamed from: c */
    private static final boolean f47651c;

    /* renamed from: d */
    private static final AtomicLong f47652d = new AtomicLong(0);

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r0.equals("auto") != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r0.equals("on") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r0.equals("") != false) goto L_0x0042;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.C11692f0.m56856d(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0064
            int r3 = r0.hashCode()
            if (r3 == 0) goto L_0x003a
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L_0x0031
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L_0x0027
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L_0x0044
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0044
            goto L_0x0064
        L_0x0027:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0044
            r0 = 0
            goto L_0x0068
        L_0x0031:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0044
            goto L_0x0042
        L_0x003a:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0044
        L_0x0042:
            r0 = 1
            goto L_0x0068
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0064:
            boolean r0 = m62281a()
        L_0x0068:
            f47650b = r0
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.C11692f0.m56857e(r0, r2)
            if (r0 == 0) goto L_0x0075
            r1 = 1
        L_0x0075:
            f47651c = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            f47652d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p410yd.C13330n0.<clinit>():void");
    }

    /* renamed from: a */
    public static final boolean m62281a() {
        return f47649a;
    }

    /* renamed from: b */
    public static final AtomicLong m62282b() {
        return f47652d;
    }

    /* renamed from: c */
    public static final boolean m62283c() {
        return f47650b;
    }

    /* renamed from: d */
    public static final boolean m62284d() {
        return f47651c;
    }
}
