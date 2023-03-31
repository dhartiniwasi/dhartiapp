package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.la */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2580la implements C3060y8 {

    /* renamed from: a */
    private final Map f12705a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    private long f12706b = 0;

    /* renamed from: c */
    private final C2543ka f12707c;

    /* renamed from: d */
    private final int f12708d;

    public C2580la(C2543ka kaVar, int i) {
        this.f12707c = kaVar;
        this.f12708d = 5242880;
    }

    /* renamed from: a */
    static int m15894a(InputStream inputStream) throws IOException {
        return (m15901n(inputStream) << 24) | m15901n(inputStream) | (m15901n(inputStream) << 8) | (m15901n(inputStream) << 16);
    }

    /* renamed from: b */
    static long m15895b(InputStream inputStream) throws IOException {
        return (((long) m15901n(inputStream)) & 255) | ((((long) m15901n(inputStream)) & 255) << 8) | ((((long) m15901n(inputStream)) & 255) << 16) | ((((long) m15901n(inputStream)) & 255) << 24) | ((((long) m15901n(inputStream)) & 255) << 32) | ((((long) m15901n(inputStream)) & 255) << 40) | ((((long) m15901n(inputStream)) & 255) << 48) | ((255 & ((long) m15901n(inputStream))) << 56);
    }

    /* renamed from: e */
    static String m15896e(C2506ja jaVar) throws IOException {
        return new String(m15900m(jaVar, m15895b(jaVar)), "UTF-8");
    }

    /* renamed from: j */
    static void m15897j(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: k */
    static void m15898k(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: l */
    static void m15899l(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        m15898k(outputStream, (long) length);
        outputStream.write(bytes, 0, length);
    }

    /* renamed from: m */
    static byte[] m15900m(C2506ja jaVar, long j) throws IOException {
        long a = jaVar.mo11346a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(jaVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + a);
    }

    /* renamed from: n */
    private static int m15901n(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: o */
    private final void m15902o(String str, C2468ia iaVar) {
        if (!this.f12705a.containsKey(str)) {
            this.f12706b += iaVar.f10704a;
        } else {
            this.f12706b += iaVar.f10704a - ((C2468ia) this.f12705a.get(str)).f10704a;
        }
        this.f12705a.put(str, iaVar);
    }

    /* renamed from: p */
    private final void m15903p(String str) {
        C2468ia iaVar = (C2468ia) this.f12705a.remove(str);
        if (iaVar != null) {
            this.f12706b -= iaVar.f10704a;
        }
    }

    /* renamed from: q */
    private static final String m15904q(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    /* renamed from: c */
    public final File mo11956c(String str) {
        return new File(this.f12707c.zza(), m15904q(str));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005a */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11957d() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.ka r0 = r9.f12707c     // Catch:{ all -> 0x0062 }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x0062 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 != 0) goto L_0x0026
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0024
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0062 }
            r1[r2] = r0     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "Unable to create cache dir %s"
            com.google.android.gms.internal.ads.C2208ba.m10258b(r0, r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r9)
            return
        L_0x0024:
            monitor-exit(r9)
            return
        L_0x0026:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r1 = r0.length     // Catch:{ all -> 0x0062 }
        L_0x002f:
            if (r2 >= r1) goto L_0x0060
            r3 = r0[r2]     // Catch:{ all -> 0x0062 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x005a }
            com.google.android.gms.internal.ads.ja r6 = new com.google.android.gms.internal.ads.ja     // Catch:{ IOException -> 0x005a }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x005a }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x005a }
            r8.<init>(r3)     // Catch:{ IOException -> 0x005a }
            r7.<init>(r8)     // Catch:{ IOException -> 0x005a }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x005a }
            com.google.android.gms.internal.ads.ia r7 = com.google.android.gms.internal.ads.C2468ia.m14245a(r6)     // Catch:{ all -> 0x0055 }
            r7.f10704a = r4     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = r7.f10705b     // Catch:{ all -> 0x0055 }
            r9.m15902o(r4, r7)     // Catch:{ all -> 0x0055 }
            r6.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005d
        L_0x0055:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x005a }
            throw r4     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r3.delete()     // Catch:{ all -> 0x0062 }
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0060:
            monitor-exit(r9)
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2580la.mo11957d():void");
    }

    /* renamed from: f */
    public final synchronized C3023x8 mo11958f(String str) {
        C2506ja jaVar;
        C2468ia iaVar = (C2468ia) this.f12705a.get(str);
        if (iaVar == null) {
            return null;
        }
        File c = mo11956c(str);
        try {
            jaVar = new C2506ja(new BufferedInputStream(new FileInputStream(c)), c.length());
            C2468ia a = C2468ia.m14245a(jaVar);
            if (!TextUtils.equals(str, a.f10705b)) {
                C2208ba.m10257a("%s: key=%s, found=%s", c.getAbsolutePath(), str, a.f10705b);
                m15903p(str);
                jaVar.close();
                return null;
            }
            byte[] m = m15900m(jaVar, jaVar.mo11346a());
            C3023x8 x8Var = new C3023x8();
            x8Var.f20023a = m;
            x8Var.f20024b = iaVar.f10706c;
            x8Var.f20025c = iaVar.f10707d;
            x8Var.f20026d = iaVar.f10708e;
            x8Var.f20027e = iaVar.f10709f;
            x8Var.f20028f = iaVar.f10710g;
            List<C2393g9> list = iaVar.f10711h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (C2393g9 g9Var : list) {
                treeMap.put(g9Var.mo10420a(), g9Var.mo10421b());
            }
            x8Var.f20029g = treeMap;
            x8Var.f20030h = Collections.unmodifiableList(iaVar.f10711h);
            jaVar.close();
            return x8Var;
        } catch (IOException e) {
            C2208ba.m10257a("%s: %s", c.getAbsolutePath(), e.toString());
            mo11961i(str);
            return null;
        } catch (Throwable th) {
            jaVar.close();
            throw th;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x016e */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11959g(java.lang.String r16, com.google.android.gms.internal.ads.C3023x8 r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.f12706b     // Catch:{ all -> 0x01a4 }
            byte[] r5 = r2.f20023a     // Catch:{ all -> 0x01a4 }
            int r5 = r5.length     // Catch:{ all -> 0x01a4 }
            int r6 = r1.f12708d     // Catch:{ all -> 0x01a4 }
            long r7 = (long) r5
            long r3 = r3 + r7
            long r7 = (long) r6
            r9 = 1063675494(0x3f666666, float:0.9)
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0022
            float r3 = (float) r5
            float r4 = (float) r6
            float r4 = r4 * r9
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            monitor-exit(r15)
            return
        L_0x0022:
            java.io.File r3 = r15.mo11956c(r16)     // Catch:{ all -> 0x01a4 }
            r4 = 1
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x016e }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x016e }
            r7.<init>(r3)     // Catch:{ IOException -> 0x016e }
            r6.<init>(r7)     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.ia r7 = new com.google.android.gms.internal.ads.ia     // Catch:{ IOException -> 0x016e }
            r7.<init>(r0, r2)     // Catch:{ IOException -> 0x016e }
            r8 = 538247942(0x20150306, float:1.2621791E-19)
            m15897j(r6, r8)     // Catch:{ IOException -> 0x014a }
            java.lang.String r8 = r7.f10705b     // Catch:{ IOException -> 0x014a }
            m15899l(r6, r8)     // Catch:{ IOException -> 0x014a }
            java.lang.String r8 = r7.f10706c     // Catch:{ IOException -> 0x014a }
            if (r8 != 0) goto L_0x0048
            java.lang.String r8 = ""
        L_0x0048:
            m15899l(r6, r8)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f10707d     // Catch:{ IOException -> 0x014a }
            m15898k(r6, r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f10708e     // Catch:{ IOException -> 0x014a }
            m15898k(r6, r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f10709f     // Catch:{ IOException -> 0x014a }
            m15898k(r6, r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f10710g     // Catch:{ IOException -> 0x014a }
            m15898k(r6, r10)     // Catch:{ IOException -> 0x014a }
            java.util.List r8 = r7.f10711h     // Catch:{ IOException -> 0x014a }
            if (r8 == 0) goto L_0x0089
            int r10 = r8.size()     // Catch:{ IOException -> 0x014a }
            m15897j(r6, r10)     // Catch:{ IOException -> 0x014a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x014a }
        L_0x006e:
            boolean r10 = r8.hasNext()     // Catch:{ IOException -> 0x014a }
            if (r10 == 0) goto L_0x008c
            java.lang.Object r10 = r8.next()     // Catch:{ IOException -> 0x014a }
            com.google.android.gms.internal.ads.g9 r10 = (com.google.android.gms.internal.ads.C2393g9) r10     // Catch:{ IOException -> 0x014a }
            java.lang.String r11 = r10.mo10420a()     // Catch:{ IOException -> 0x014a }
            m15899l(r6, r11)     // Catch:{ IOException -> 0x014a }
            java.lang.String r10 = r10.mo10421b()     // Catch:{ IOException -> 0x014a }
            m15899l(r6, r10)     // Catch:{ IOException -> 0x014a }
            goto L_0x006e
        L_0x0089:
            m15897j(r6, r5)     // Catch:{ IOException -> 0x014a }
        L_0x008c:
            r6.flush()     // Catch:{ IOException -> 0x014a }
            byte[] r2 = r2.f20023a     // Catch:{ IOException -> 0x016e }
            r6.write(r2)     // Catch:{ IOException -> 0x016e }
            r6.close()     // Catch:{ IOException -> 0x016e }
            long r10 = r3.length()     // Catch:{ IOException -> 0x016e }
            r7.f10704a = r10     // Catch:{ IOException -> 0x016e }
            r15.m15902o(r0, r7)     // Catch:{ IOException -> 0x016e }
            long r6 = r1.f12706b     // Catch:{ IOException -> 0x016e }
            int r0 = r1.f12708d     // Catch:{ IOException -> 0x016e }
            long r10 = (long) r0     // Catch:{ IOException -> 0x016e }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ab
            goto L_0x01a2
        L_0x00ab:
            boolean r0 = com.google.android.gms.internal.ads.C2208ba.f7181b     // Catch:{ IOException -> 0x016e }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.C2208ba.m10260d(r0, r2)     // Catch:{ IOException -> 0x016e }
        L_0x00b6:
            long r6 = r1.f12706b     // Catch:{ IOException -> 0x016e }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x016e }
            java.util.Map r0 = r1.f12705a     // Catch:{ IOException -> 0x016e }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x016e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x016e }
            r2 = 0
        L_0x00c7:
            boolean r8 = r0.hasNext()     // Catch:{ IOException -> 0x016e }
            r12 = 2
            if (r8 == 0) goto L_0x011e
            java.lang.Object r8 = r0.next()     // Catch:{ IOException -> 0x016e }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ IOException -> 0x016e }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.ia r8 = (com.google.android.gms.internal.ads.C2468ia) r8     // Catch:{ IOException -> 0x016e }
            java.lang.String r13 = r8.f10705b     // Catch:{ IOException -> 0x016e }
            java.io.File r13 = r15.mo11956c(r13)     // Catch:{ IOException -> 0x016e }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x016e }
            if (r13 == 0) goto L_0x00f0
            long r13 = r1.f12706b     // Catch:{ IOException -> 0x016e }
            r16 = r10
            long r9 = r8.f10704a     // Catch:{ IOException -> 0x016e }
            long r13 = r13 - r9
            r1.f12706b = r13     // Catch:{ IOException -> 0x016e }
            goto L_0x0103
        L_0x00f0:
            r16 = r10
            java.lang.String r9 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r10 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x016e }
            java.lang.String r8 = r8.f10705b     // Catch:{ IOException -> 0x016e }
            r10[r5] = r8     // Catch:{ IOException -> 0x016e }
            java.lang.String r8 = m15904q(r8)     // Catch:{ IOException -> 0x016e }
            r10[r4] = r8     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.C2208ba.m10257a(r9, r10)     // Catch:{ IOException -> 0x016e }
        L_0x0103:
            r0.remove()     // Catch:{ IOException -> 0x016e }
            int r2 = r2 + 1
            long r8 = r1.f12706b     // Catch:{ IOException -> 0x016e }
            float r8 = (float) r8     // Catch:{ IOException -> 0x016e }
            int r9 = r1.f12708d     // Catch:{ IOException -> 0x016e }
            float r9 = (float) r9     // Catch:{ IOException -> 0x016e }
            r10 = 1063675494(0x3f666666, float:0.9)
            float r9 = r9 * r10
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0118
            goto L_0x0120
        L_0x0118:
            r10 = r16
            r9 = 1063675494(0x3f666666, float:0.9)
            goto L_0x00c7
        L_0x011e:
            r16 = r10
        L_0x0120:
            boolean r0 = com.google.android.gms.internal.ads.C2208ba.f7181b     // Catch:{ IOException -> 0x016e }
            if (r0 == 0) goto L_0x01a2
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x016e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x016e }
            r0[r5] = r2     // Catch:{ IOException -> 0x016e }
            long r8 = r1.f12706b     // Catch:{ IOException -> 0x016e }
            long r8 = r8 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x016e }
            r0[r4] = r2     // Catch:{ IOException -> 0x016e }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x016e }
            r8 = r16
            long r6 = r6 - r8
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x016e }
            r0[r12] = r2     // Catch:{ IOException -> 0x016e }
            java.lang.String r2 = "pruned %d files, %d bytes, %d ms"
            com.google.android.gms.internal.ads.C2208ba.m10260d(r2, r0)     // Catch:{ IOException -> 0x016e }
            monitor-exit(r15)
            return
        L_0x014a:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x016e }
            r2[r5] = r0     // Catch:{ IOException -> 0x016e }
            java.lang.String r0 = "%s"
            com.google.android.gms.internal.ads.C2208ba.m10257a(r0, r2)     // Catch:{ IOException -> 0x016e }
            r6.close()     // Catch:{ IOException -> 0x016e }
            java.lang.String r0 = "Failed to write header for %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x016e }
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x016e }
            r2[r5] = r6     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.C2208ba.m10257a(r0, r2)     // Catch:{ IOException -> 0x016e }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x016e }
            r0.<init>()     // Catch:{ IOException -> 0x016e }
            throw r0     // Catch:{ IOException -> 0x016e }
        L_0x016e:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x0181
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ all -> 0x01a4 }
            r0[r5] = r2     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = "Could not clean up file %s"
            com.google.android.gms.internal.ads.C2208ba.m10257a(r2, r0)     // Catch:{ all -> 0x01a4 }
        L_0x0181:
            com.google.android.gms.internal.ads.ka r0 = r1.f12707c     // Catch:{ all -> 0x01a4 }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x01a4 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x01a2
            java.lang.String r0 = "Re-initializing cache after external clearing."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a4 }
            com.google.android.gms.internal.ads.C2208ba.m10257a(r0, r2)     // Catch:{ all -> 0x01a4 }
            java.util.Map r0 = r1.f12705a     // Catch:{ all -> 0x01a4 }
            r0.clear()     // Catch:{ all -> 0x01a4 }
            r2 = 0
            r1.f12706b = r2     // Catch:{ all -> 0x01a4 }
            r15.mo11957d()     // Catch:{ all -> 0x01a4 }
            monitor-exit(r15)
            return
        L_0x01a2:
            monitor-exit(r15)
            return
        L_0x01a4:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2580la.mo11959g(java.lang.String, com.google.android.gms.internal.ads.x8):void");
    }

    /* renamed from: h */
    public final synchronized void mo11960h(String str, boolean z) {
        C3023x8 f = mo11958f(str);
        if (f != null) {
            f.f20028f = 0;
            f.f20027e = 0;
            mo11959g(str, f);
        }
    }

    /* renamed from: i */
    public final synchronized void mo11961i(String str) {
        boolean delete = mo11956c(str).delete();
        m15903p(str);
        if (!delete) {
            C2208ba.m10257a("Could not delete cache entry for key=%s, filename=%s", str, m15904q(str));
        }
    }

    public C2580la(File file, int i) {
        this.f12707c = new C2431ha(this, file);
        this.f12708d = 20971520;
    }
}
