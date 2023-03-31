package com.startapp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Signature;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.startapp.x1 */
/* compiled from: Sta */
public class C9631x1 {

    /* renamed from: a */
    private static final String f39362a = "x1";

    /* renamed from: b */
    private static final boolean f39363b = false;

    /* renamed from: c */
    private static final String f39364c = "cdnconfig.txt";

    /* renamed from: d */
    private static final String f39365d = "cdnconfig.txt.sig";

    /* renamed from: e */
    private static final int f39366e = 10000;

    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m50505a() {
        /*
            r0 = 0
            com.startapp.y4 r1 = com.startapp.C8821a5.m48254b()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r1.CONNECTIVITY_TEST_CDNCONFIG_URL()     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "[PROJECTID]"
            com.startapp.y4 r3 = com.startapp.C8821a5.m48254b()     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = r3.PROJECT_ID()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ all -> 0x0096 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0096 }
            r2.<init>(r1)     // Catch:{ all -> 0x0096 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x0096 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "GET"
            r1.setRequestMethod(r0)     // Catch:{ all -> 0x0094 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r1.setConnectTimeout(r0)     // Catch:{ all -> 0x0094 }
            r1.setReadTimeout(r0)     // Catch:{ all -> 0x0094 }
            com.startapp.b5 r0 = com.startapp.C8821a5.m48255c()     // Catch:{ all -> 0x0094 }
            long r2 = r0.mo29172g()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = m50504a((long) r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "If-Modified-Since"
            r1.setRequestProperty(r2, r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "Connection"
            java.lang.String r2 = "close"
            r1.setRequestProperty(r0, r2)     // Catch:{ all -> 0x0094 }
            int r0 = r1.getResponseCode()     // Catch:{ all -> 0x0094 }
            r2 = 304(0x130, float:4.26E-43)
            if (r0 != r2) goto L_0x005b
            com.startapp.b5 r0 = com.startapp.C8821a5.m48255c()     // Catch:{ all -> 0x0094 }
            long r2 = com.startapp.C9603va.m50435d()     // Catch:{ all -> 0x0094 }
            r0.mo29164e((long) r2)     // Catch:{ all -> 0x0094 }
            goto L_0x009f
        L_0x005b:
            int r0 = r1.getResponseCode()     // Catch:{ all -> 0x0094 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x009f
            long r2 = r1.getLastModified()     // Catch:{ all -> 0x0094 }
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ all -> 0x0094 }
            boolean r4 = m50507a((java.io.InputStream) r0)     // Catch:{ all -> 0x008f }
            r0.close()     // Catch:{ all -> 0x0094 }
            if (r4 == 0) goto L_0x0087
            com.startapp.b5 r0 = com.startapp.C8821a5.m48255c()     // Catch:{ all -> 0x0094 }
            long r4 = com.startapp.C9603va.m50435d()     // Catch:{ all -> 0x0094 }
            r0.mo29164e((long) r4)     // Catch:{ all -> 0x0094 }
            com.startapp.b5 r0 = com.startapp.C8821a5.m48255c()     // Catch:{ all -> 0x0094 }
            r0.mo29150b((long) r2)     // Catch:{ all -> 0x0094 }
            goto L_0x009f
        L_0x0087:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "Verification of downloaded cdn config failed"
            r0.<init>(r2)     // Catch:{ all -> 0x0094 }
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x008f:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0094 }
            throw r2     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            goto L_0x009a
        L_0x0096:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x009a:
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x00a2
        L_0x009f:
            r1.disconnect()
        L_0x00a2:
            return
        L_0x00a3:
            r0 = move-exception
            if (r1 == 0) goto L_0x00a9
            r1.disconnect()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9631x1.m50505a():void");
    }

    /* renamed from: a */
    private static boolean m50507a(InputStream inputStream) throws IOException {
        C9614w1 w1Var;
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byte[] bArr = new byte[512];
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                } else if (!nextEntry.isDirectory()) {
                    if (nextEntry.getName().equalsIgnoreCase(f39364c)) {
                        for (int read = zipInputStream.read(bArr); read != -1; read = zipInputStream.read(bArr)) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.flush();
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase(f39365d)) {
                        for (int read2 = zipInputStream.read(bArr); read2 != -1; read2 = zipInputStream.read(bArr)) {
                            byteArrayOutputStream2.write(bArr, 0, read2);
                        }
                        byteArrayOutputStream2.flush();
                        zipInputStream.closeEntry();
                    }
                }
            } catch (Throwable th) {
                C9632x2.m50512b(th);
            }
        }
        zipInputStream.close();
        try {
            byteArrayOutputStream2.close();
        } catch (Throwable th2) {
            C9632x2.m50512b(th2);
        }
        try {
            byteArrayOutputStream.close();
        } catch (Throwable th3) {
            C9632x2.m50512b(th3);
        }
        boolean z = true;
        if (C8821a5.m48254b().CONNECTIVITY_TEST_VERIFY_CDNCONFIG_SIGNATURE()) {
            z = m50506a(byteArrayOutputStream, byteArrayOutputStream2);
        }
        if (z && (w1Var = (C9614w1) C9258r5.m49216a(new String(byteArrayOutputStream.toByteArray(), "UTF-8"), C9614w1.class)) != null) {
            C8844b5 c = C8821a5.m48255c();
            c.mo29149a((Set<String>) null);
            c.mo29152b((Set<String>) new HashSet(w1Var.f39323ct.cdn));
            c.mo29155c(w1Var.f39323ct.criteria);
            c.mo29156c((Set<String>) new HashSet(w1Var.ltr.cdn));
            c.mo29161d(w1Var.ltr.criteria);
        }
        return z;
        byteArrayOutputStream.close();
        throw th;
        throw th;
    }

    /* renamed from: a */
    private static boolean m50506a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        try {
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(C8821a5.m48257e());
            instance.update(byteArray2);
            return instance.verify(byteArray);
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return false;
        }
    }

    /* renamed from: a */
    private static String m50504a(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(Long.valueOf(j));
    }
}
