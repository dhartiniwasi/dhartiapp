package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.c7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public abstract class C6908c7 {

    /* renamed from: g */
    private static final Object f31617g = new Object();

    /* renamed from: h */
    private static volatile C7280z6 f31618h;

    /* renamed from: i */
    private static final AtomicReference f31619i = new AtomicReference();

    /* renamed from: j */
    private static final C6942e7 f31620j = new C6942e7(C7184t6.f32109a, (byte[]) null);

    /* renamed from: k */
    private static final AtomicInteger f31621k = new AtomicInteger();

    /* renamed from: l */
    public static final /* synthetic */ int f31622l = 0;

    /* renamed from: a */
    final C7264y6 f31623a;

    /* renamed from: b */
    final String f31624b;

    /* renamed from: c */
    private final Object f31625c;

    /* renamed from: d */
    private volatile int f31626d = -1;

    /* renamed from: e */
    private volatile Object f31627e;

    /* renamed from: f */
    private final boolean f31628f;

    /* synthetic */ C6908c7(C7264y6 y6Var, String str, Object obj, boolean z, C6891b7 b7Var) {
        if (y6Var.f32203b != null) {
            this.f31623a = y6Var;
            this.f31624b = str;
            this.f31625c = obj;
            this.f31628f = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: d */
    public static void m39870d() {
        f31621k.incrementAndGet();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public static void m39871e(android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.z6 r0 = f31618h
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = f31617g
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.z6 r1 = f31618h     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0040
            monitor-enter(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.measurement.z6 r1 = f31618h     // Catch:{ all -> 0x003d }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0015
            r3 = r2
        L_0x0015:
            if (r1 == 0) goto L_0x001d
            android.content.Context r1 = r1.mo23244a()     // Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x003b
        L_0x001d:
            com.google.android.gms.internal.measurement.C6958f6.m40017d()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.C6925d7.m39921b()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.C7088n6.m40445d()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.s6 r1 = new com.google.android.gms.internal.measurement.s6     // Catch:{ all -> 0x003d }
            r1.<init>(r3)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.j7 r1 = com.google.android.gms.internal.measurement.C7089n7.m40449a(r1)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.c6 r2 = new com.google.android.gms.internal.measurement.c6     // Catch:{ all -> 0x003d }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x003d }
            f31618h = r2     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicInteger r3 = f31621k     // Catch:{ all -> 0x003d }
            r3.incrementAndGet()     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r3
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6908c7.m39871e(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo23249a(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r2 = r2.mo23322i(mo23251c());
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo23250b() {
        /*
            r6 = this;
            boolean r0 = r6.f31628f
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = r6.f31624b
            java.lang.String r1 = "flagName must not be null"
            java.util.Objects.requireNonNull(r0, r1)
        L_0x000b:
            java.util.concurrent.atomic.AtomicInteger r0 = f31621k
            int r0 = r0.get()
            int r1 = r6.f31626d
            if (r1 >= r0) goto L_0x00d6
            monitor-enter(r6)
            int r1 = r6.f31626d     // Catch:{ all -> 0x00d3 }
            if (r1 >= r0) goto L_0x00d1
            com.google.android.gms.internal.measurement.z6 r1 = f31618h     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00cb
            com.google.android.gms.internal.measurement.y6 r2 = r6.f31623a     // Catch:{ all -> 0x00d3 }
            boolean r3 = r2.f32207f     // Catch:{ all -> 0x00d3 }
            android.net.Uri r2 = r2.f32203b     // Catch:{ all -> 0x00d3 }
            r3 = 0
            if (r2 == 0) goto L_0x0050
            android.content.Context r2 = r1.mo23244a()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.y6 r4 = r6.f31623a     // Catch:{ all -> 0x00d3 }
            android.net.Uri r4 = r4.f32203b     // Catch:{ all -> 0x00d3 }
            boolean r2 = com.google.android.gms.internal.measurement.C7120p6.m40557a(r2, r4)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x004e
            com.google.android.gms.internal.measurement.y6 r2 = r6.f31623a     // Catch:{ all -> 0x00d3 }
            boolean r2 = r2.f32209h     // Catch:{ all -> 0x00d3 }
            android.content.Context r2 = r1.mo23244a()     // Catch:{ all -> 0x00d3 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.y6 r4 = r6.f31623a     // Catch:{ all -> 0x00d3 }
            android.net.Uri r4 = r4.f32203b     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.r6 r5 = com.google.android.gms.internal.measurement.C7152r6.f32008a     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.f6 r2 = com.google.android.gms.internal.measurement.C6958f6.m40016a(r2, r4, r5)     // Catch:{ all -> 0x00d3 }
            goto L_0x005e
        L_0x004e:
            r2 = r3
            goto L_0x005e
        L_0x0050:
            android.content.Context r2 = r1.mo23244a()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.y6 r4 = r6.f31623a     // Catch:{ all -> 0x00d3 }
            java.lang.String r4 = r4.f32202a     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.r6 r4 = com.google.android.gms.internal.measurement.C7152r6.f32008a     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.d7 r2 = com.google.android.gms.internal.measurement.C6925d7.m39920a(r2, r3, r4)     // Catch:{ all -> 0x00d3 }
        L_0x005e:
            if (r2 == 0) goto L_0x006f
            java.lang.String r4 = r6.mo23251c()     // Catch:{ all -> 0x00d3 }
            java.lang.Object r2 = r2.mo23322i(r4)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r6.mo23249a(r2)     // Catch:{ all -> 0x00d3 }
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            if (r2 == 0) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            com.google.android.gms.internal.measurement.y6 r2 = r6.f31623a     // Catch:{ all -> 0x00d3 }
            boolean r2 = r2.f32206e     // Catch:{ all -> 0x00d3 }
            if (r2 != 0) goto L_0x0096
            android.content.Context r2 = r1.mo23244a()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.n6 r2 = com.google.android.gms.internal.measurement.C7088n6.m40444a(r2)     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.y6 r4 = r6.f31623a     // Catch:{ all -> 0x00d3 }
            boolean r4 = r4.f32206e     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x0089
            r4 = r3
            goto L_0x008b
        L_0x0089:
            java.lang.String r4 = r6.f31624b     // Catch:{ all -> 0x00d3 }
        L_0x008b:
            java.lang.String r2 = r2.mo23322i(r4)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x0096
            java.lang.Object r2 = r6.mo23249a(r2)     // Catch:{ all -> 0x00d3 }
            goto L_0x0097
        L_0x0096:
            r2 = r3
        L_0x0097:
            if (r2 != 0) goto L_0x009b
            java.lang.Object r2 = r6.f31625c     // Catch:{ all -> 0x00d3 }
        L_0x009b:
            com.google.android.gms.internal.measurement.j7 r1 = r1.mo23245b()     // Catch:{ all -> 0x00d3 }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.h7 r1 = (com.google.android.gms.internal.measurement.C6993h7) r1     // Catch:{ all -> 0x00d3 }
            boolean r4 = r1.mo23414b()     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00c6
            java.lang.Object r1 = r1.mo23413a()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.h6 r1 = (com.google.android.gms.internal.measurement.C6992h6) r1     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.y6 r2 = r6.f31623a     // Catch:{ all -> 0x00d3 }
            android.net.Uri r4 = r2.f32203b     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = r2.f32205d     // Catch:{ all -> 0x00d3 }
            java.lang.String r5 = r6.f31624b     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = r1.mo23485a(r4, r3, r2, r5)     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x00c2
            java.lang.Object r2 = r6.f31625c     // Catch:{ all -> 0x00d3 }
            goto L_0x00c6
        L_0x00c2:
            java.lang.Object r2 = r6.mo23249a(r1)     // Catch:{ all -> 0x00d3 }
        L_0x00c6:
            r6.f31627e = r2     // Catch:{ all -> 0x00d3 }
            r6.f31626d = r0     // Catch:{ all -> 0x00d3 }
            goto L_0x00d1
        L_0x00cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d3 }
            r0.<init>(r2)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d1:
            monitor-exit(r6)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d6
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d3 }
            throw r0
        L_0x00d6:
            java.lang.Object r0 = r6.f31627e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6908c7.mo23250b():java.lang.Object");
    }

    /* renamed from: c */
    public final String mo23251c() {
        String str = this.f31623a.f32205d;
        return this.f31624b;
    }
}
