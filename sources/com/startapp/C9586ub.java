package com.startapp;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.startapp.ub */
/* compiled from: Sta */
public class C9586ub implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent[] f39261a;

    /* renamed from: b */
    public final /* synthetic */ Context f39262b;

    /* renamed from: c */
    public final /* synthetic */ String f39263c;

    public C9586ub(Intent[] intentArr, Context context, String str) {
        this.f39261a = intentArr;
        this.f39262b = context;
        this.f39263c = str;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r3 = this;
            android.content.Intent[] r0 = r3.f39261a
            android.content.Context r1 = r3.f39262b
            java.lang.String r2 = r3.f39263c
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x0015
            android.content.Intent r1 = r1.getLaunchIntentForPackage(r2)     // Catch:{ all -> 0x0011 }
            goto L_0x0016
        L_0x0011:
            r1 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r1)
        L_0x0015:
            r1 = 0
        L_0x0016:
            r2 = 0
            r0[r2] = r1
            android.content.Intent[] r0 = r3.f39261a
            monitor-enter(r0)
            android.content.Intent[] r1 = r3.f39261a     // Catch:{ all -> 0x0023 }
            r1.notifyAll()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9586ub.run():void");
    }
}
