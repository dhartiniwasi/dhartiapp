package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C9441e;

/* renamed from: com.startapp.a8 */
/* compiled from: Sta */
public abstract class C8825a8<T> extends C9021i2<T> {

    /* renamed from: e */
    public final C9441e f36414e;

    /* renamed from: f */
    public final C9256r3 f36415f;

    /* renamed from: g */
    public final String f36416g;

    /* renamed from: h */
    public final String f36417h;

    /* renamed from: i */
    public final Runnable f36418i = new C8826a();

    /* renamed from: com.startapp.a8$a */
    /* compiled from: Sta */
    public class C8826a implements Runnable {
        public C8826a() {
        }

        public void run() {
            C8825a8.this.mo29093g();
        }
    }

    public C8825a8(Context context, C9441e eVar, C9256r3 r3Var, String str, String str2) {
        super(context, 1000);
        this.f36414e = eVar;
        this.f36415f = r3Var;
        this.f36416g = str;
        this.f36417h = str2;
    }

    /* renamed from: a */
    public final T mo29086a() {
        T a;
        if (!mo29092f()) {
            return null;
        }
        synchronized (this) {
            a = mo29087a(this.f36414e.getString(this.f36416g, (String) null));
        }
        return a;
    }

    /* renamed from: a */
    public abstract T mo29087a(String str);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public synchronized void mo29088b(T r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x0020
            com.startapp.sdk.adsbase.e r0 = r4.f36414e     // Catch:{ all -> 0x0046 }
            com.startapp.sdk.adsbase.e$a r0 = r0.edit()     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = r4.f36416g     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = r4.mo29089c(r5)     // Catch:{ all -> 0x0046 }
            com.startapp.sdk.adsbase.e$a r5 = r0.mo30811a((java.lang.String) r1, (java.lang.String) r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = r4.f36417h     // Catch:{ all -> 0x0046 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0046 }
            com.startapp.sdk.adsbase.e$a r5 = r5.mo30810a((java.lang.String) r0, (long) r1)     // Catch:{ all -> 0x0046 }
            r5.apply()     // Catch:{ all -> 0x0046 }
        L_0x0020:
            long r0 = r4.mo29090d()     // Catch:{ all -> 0x0046 }
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0046 }
            monitor-enter(r4)     // Catch:{ all -> 0x0046 }
            boolean r5 = r4.mo29092f()     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x0040
            com.startapp.r3 r5 = r4.f36415f     // Catch:{ all -> 0x0043 }
            java.lang.Runnable r2 = r4.f36418i     // Catch:{ all -> 0x0043 }
            r5.mo29865a(r2)     // Catch:{ all -> 0x0043 }
            com.startapp.r3 r5 = r4.f36415f     // Catch:{ all -> 0x0043 }
            java.lang.Runnable r2 = r4.f36418i     // Catch:{ all -> 0x0043 }
            r5.mo29866a(r2, r0)     // Catch:{ all -> 0x0043 }
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r4)
            return
        L_0x0043:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r5     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C8825a8.mo29088b(java.lang.Object):void");
    }

    /* renamed from: c */
    public String mo29089c(T t) {
        return t.toString();
    }

    /* renamed from: d */
    public abstract long mo29090d();

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public synchronized void mo29091e() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.startapp.sdk.adsbase.e r0 = r8.f36414e     // Catch:{ all -> 0x003b }
            java.lang.String r1 = r8.f36417h     // Catch:{ all -> 0x003b }
            r2 = 0
            long r0 = r0.getLong(r1, r2)     // Catch:{ all -> 0x003b }
            long r4 = r8.mo29090d()     // Catch:{ all -> 0x003b }
            r6 = 60000(0xea60, double:2.9644E-319)
            long r4 = java.lang.Math.max(r6, r4)     // Catch:{ all -> 0x003b }
            long r4 = r4 + r0
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003b }
            long r4 = r4 - r0
            long r0 = java.lang.Math.max(r2, r4)     // Catch:{ all -> 0x003b }
            monitor-enter(r8)     // Catch:{ all -> 0x003b }
            boolean r2 = r8.mo29092f()     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0035
            com.startapp.r3 r2 = r8.f36415f     // Catch:{ all -> 0x0038 }
            java.lang.Runnable r3 = r8.f36418i     // Catch:{ all -> 0x0038 }
            r2.mo29865a(r3)     // Catch:{ all -> 0x0038 }
            com.startapp.r3 r2 = r8.f36415f     // Catch:{ all -> 0x0038 }
            java.lang.Runnable r3 = r8.f36418i     // Catch:{ all -> 0x0038 }
            r2.mo29866a(r3, r0)     // Catch:{ all -> 0x0038 }
        L_0x0035:
            monitor-exit(r8)     // Catch:{ all -> 0x003b }
            monitor-exit(r8)
            return
        L_0x0038:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C8825a8.mo29091e():void");
    }

    /* renamed from: f */
    public abstract boolean mo29092f();

    /* renamed from: g */
    public abstract void mo29093g();
}
