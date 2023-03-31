package p187ad;

/* renamed from: ad.c */
/* compiled from: PerfMark */
public final class C6574c {

    /* renamed from: a */
    private static final C6572a f31021a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            java.lang.String r2 = "io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x000b }
            r3 = r1
            goto L_0x000e
        L_0x000b:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x000e:
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0031
            java.lang.Class<ad.a> r6 = p187ad.C6572a.class
            java.lang.Class r2 = r2.asSubclass(r6)     // Catch:{ all -> 0x002f }
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x002f }
            java.lang.Class<ad.d> r7 = p187ad.C6575d.class
            r6[r4] = r7     // Catch:{ all -> 0x002f }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r6)     // Catch:{ all -> 0x002f }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x002f }
            ad.d r7 = p187ad.C6572a.f31018a     // Catch:{ all -> 0x002f }
            r6[r4] = r7     // Catch:{ all -> 0x002f }
            java.lang.Object r2 = r2.newInstance(r6)     // Catch:{ all -> 0x002f }
            ad.a r2 = (p187ad.C6572a) r2     // Catch:{ all -> 0x002f }
            goto L_0x0032
        L_0x002f:
            r2 = move-exception
            r3 = r2
        L_0x0031:
            r2 = r1
        L_0x0032:
            if (r2 == 0) goto L_0x0037
            f31021a = r2
            goto L_0x0040
        L_0x0037:
            ad.a r2 = new ad.a
            ad.d r6 = p187ad.C6572a.f31018a
            r2.<init>(r6)
            f31021a = r2
        L_0x0040:
            if (r3 == 0) goto L_0x0097
            java.lang.String r2 = "io.perfmark.PerfMark.debug"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x0097
            java.lang.String r2 = "java.util.logging.Logger"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0097 }
            java.lang.String r6 = "getLogger"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x0097 }
            r7[r4] = r0     // Catch:{ all -> 0x0097 }
            java.lang.reflect.Method r6 = r2.getMethod(r6, r7)     // Catch:{ all -> 0x0097 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0097 }
            java.lang.Class<ad.c> r8 = p187ad.C6574c.class
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x0097 }
            r7[r4] = r8     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.invoke(r1, r7)     // Catch:{ all -> 0x0097 }
            java.lang.String r7 = "java.util.logging.Level"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0097 }
            java.lang.String r8 = "FINE"
            java.lang.reflect.Field r8 = r7.getField(r8)     // Catch:{ all -> 0x0097 }
            java.lang.Object r1 = r8.get(r1)     // Catch:{ all -> 0x0097 }
            java.lang.String r8 = "log"
            r9 = 3
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ all -> 0x0097 }
            r10[r4] = r7     // Catch:{ all -> 0x0097 }
            r10[r5] = r0     // Catch:{ all -> 0x0097 }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r7 = 2
            r10[r7] = r0     // Catch:{ all -> 0x0097 }
            java.lang.reflect.Method r0 = r2.getMethod(r8, r10)     // Catch:{ all -> 0x0097 }
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x0097 }
            r2[r4] = r1     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = "Error during PerfMark.<clinit>"
            r2[r5] = r1     // Catch:{ all -> 0x0097 }
            r2[r7] = r3     // Catch:{ all -> 0x0097 }
            r0.invoke(r6, r2)     // Catch:{ all -> 0x0097 }
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p187ad.C6574c.<clinit>():void");
    }

    private C6574c() {
    }

    /* renamed from: a */
    public static C6575d m38135a(String str) {
        return f31021a.mo22181a(str, Long.MIN_VALUE);
    }

    /* renamed from: b */
    public static C6575d m38136b(String str, long j) {
        return f31021a.mo22181a(str, j);
    }

    /* renamed from: c */
    public static void m38137c(String str, C6575d dVar) {
        f31021a.mo22182b(str, dVar);
    }

    /* renamed from: d */
    public static void m38138d(C6573b bVar) {
        f31021a.mo22183c(bVar);
    }

    /* renamed from: e */
    public static C6573b m38139e() {
        return f31021a.mo22184d();
    }

    /* renamed from: f */
    public static void m38140f(String str) {
        f31021a.mo22185e(str);
    }

    /* renamed from: g */
    public static void m38141g(String str, C6575d dVar) {
        f31021a.mo22186f(str, dVar);
    }

    /* renamed from: h */
    public static void m38142h(String str) {
        f31021a.mo22187g(str);
    }

    /* renamed from: i */
    public static void m38143i(String str, C6575d dVar) {
        f31021a.mo22188h(str, dVar);
    }
}
