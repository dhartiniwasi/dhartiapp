package com.google.android.gms.measurement.internal;

import java.net.URL;
import java.util.Map;
import p033d5.C4141r;
import p402y5.C13036n;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7421l6 implements Runnable {

    /* renamed from: a */
    private final URL f32695a;

    /* renamed from: b */
    private final String f32696b;

    /* renamed from: c */
    final /* synthetic */ C7432m6 f32697c;

    /* renamed from: d */
    private final C13036n f32698d;

    public C7421l6(C7432m6 m6Var, String str, URL url, byte[] bArr, Map map, C13036n nVar, byte[] bArr2) {
        this.f32697c = m6Var;
        C4141r.m28217g(str);
        C4141r.m28221k(url);
        C4141r.m28221k(nVar);
        this.f32695a = url;
        this.f32698d = nVar;
        this.f32696b = str;
    }

    /* renamed from: b */
    private final void m41756b(int i, Exception exc, byte[] bArr, Map map) {
        this.f32697c.f32389a.mo24143s().mo24309z(new C7399j6(this, i, exc, bArr, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo24505a(int i, Exception exc, byte[] bArr, Map map) {
        C13036n nVar = this.f32698d;
        nVar.f47285a.mo24429f(this.f32696b, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[SYNTHETIC, Splitter:B:26:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.m6 r0 = r9.f32697c
            r0.mo24188e()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.m6 r2 = r9.f32697c     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            java.net.URL r3 = r9.f32695a     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            if (r4 == 0) goto L_0x007c
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r3.setDefaultUseCaches(r0)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            com.google.android.gms.measurement.internal.j4 r4 = r2.f32389a     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r4.mo24443z()     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r2.mo24443z()     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r3.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x0079, all -> 0x0076 }
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ IOException -> 0x0073, all -> 0x0070 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0064 }
            r5.<init>()     // Catch:{ all -> 0x0064 }
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ all -> 0x0064 }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0062 }
        L_0x004a:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x0062 }
            if (r8 <= 0) goto L_0x0054
            r5.write(r7, r0, r8)     // Catch:{ all -> 0x0062 }
            goto L_0x004a
        L_0x0054:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x0062 }
            r6.close()     // Catch:{ IOException -> 0x006e, all -> 0x006c }
            r3.disconnect()
            r9.m41756b(r2, r1, r0, r4)
            return
        L_0x0062:
            r0 = move-exception
            goto L_0x0066
        L_0x0064:
            r0 = move-exception
            r6 = r1
        L_0x0066:
            if (r6 == 0) goto L_0x006b
            r6.close()     // Catch:{ IOException -> 0x006e, all -> 0x006c }
        L_0x006b:
            throw r0     // Catch:{ IOException -> 0x006e, all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            goto L_0x0089
        L_0x006e:
            r0 = move-exception
            goto L_0x0097
        L_0x0070:
            r0 = move-exception
            r4 = r1
            goto L_0x0089
        L_0x0073:
            r0 = move-exception
            r4 = r1
            goto L_0x0097
        L_0x0076:
            r2 = move-exception
            r4 = r1
            goto L_0x0087
        L_0x0079:
            r2 = move-exception
            r4 = r1
            goto L_0x0095
        L_0x007c:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
            throw r2     // Catch:{ IOException -> 0x0092, all -> 0x0084 }
        L_0x0084:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L_0x0087:
            r0 = r2
            r2 = 0
        L_0x0089:
            if (r3 == 0) goto L_0x008e
            r3.disconnect()
        L_0x008e:
            r9.m41756b(r2, r1, r1, r4)
            throw r0
        L_0x0092:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L_0x0095:
            r0 = r2
            r2 = 0
        L_0x0097:
            if (r3 == 0) goto L_0x009c
            r3.disconnect()
        L_0x009c:
            r9.m41756b(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7421l6.run():void");
    }
}
