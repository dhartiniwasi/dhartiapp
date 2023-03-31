package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class t33 {

    /* renamed from: a */
    private final C2810rh f17826a;

    /* renamed from: b */
    private final File f17827b;

    /* renamed from: c */
    private final File f17828c;

    /* renamed from: d */
    private final File f17829d;

    /* renamed from: e */
    private byte[] f17830e;

    public t33(C2810rh rhVar, File file, File file2, File file3) {
        this.f17826a = rhVar;
        this.f17827b = file;
        this.f17828c = file3;
        this.f17829d = file2;
    }

    /* renamed from: a */
    public final C2810rh mo14199a() {
        return this.f17826a;
    }

    /* renamed from: b */
    public final File mo14200b() {
        return this.f17828c;
    }

    /* renamed from: c */
    public final File mo14201c() {
        return this.f17827b;
    }

    /* renamed from: d */
    public final boolean mo14202d(long j) {
        return this.f17826a.mo13797H() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo14203e() {
        /*
            r3 = this;
            byte[] r0 = r3.f17830e
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.io.File r0 = r3.f17829d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0020, all -> 0x001b }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0020, all -> 0x001b }
            com.google.android.gms.internal.ads.jw3 r0 = com.google.android.gms.internal.ads.jw3.m15089N(r2)     // Catch:{ IOException -> 0x0021, all -> 0x0018 }
            byte[] r0 = r0.mo11531j()     // Catch:{ IOException -> 0x0021, all -> 0x0018 }
            p067i5.C4697k.m30405a(r2)
            goto L_0x0025
        L_0x0018:
            r0 = move-exception
            r1 = r2
            goto L_0x001c
        L_0x001b:
            r0 = move-exception
        L_0x001c:
            p067i5.C4697k.m30405a(r1)
            throw r0
        L_0x0020:
            r2 = r1
        L_0x0021:
            p067i5.C4697k.m30405a(r2)
            r0 = r1
        L_0x0025:
            r3.f17830e = r0
        L_0x0027:
            byte[] r0 = r3.f17830e
            if (r0 != 0) goto L_0x002c
            return r1
        L_0x002c:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t33.mo14203e():byte[]");
    }
}
