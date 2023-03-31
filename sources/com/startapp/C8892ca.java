package com.startapp;

/* renamed from: com.startapp.ca */
/* compiled from: Sta */
public class C8892ca {

    /* renamed from: b */
    private static final String f36641b = "ca";

    /* renamed from: c */
    private static final int f36642c = 32;

    /* renamed from: d */
    private static final int f36643d = 40;

    /* renamed from: e */
    private static final int f36644e = 48;

    /* renamed from: f */
    private static final int f36645f = 123;

    /* renamed from: g */
    private static final int f36646g = 3;

    /* renamed from: h */
    private static final int f36647h = 3;

    /* renamed from: i */
    private static final long f36648i = 2208988800L;

    /* renamed from: a */
    private long f36649a;

    /* renamed from: b */
    private long m48463b(byte[] bArr, int i) {
        long a = m48462a(bArr, i);
        return ((m48462a(bArr, i + 4) * 1000) / 4294967296L) + ((a - f36648i) * 1000);
    }

    /* renamed from: c */
    private void m48464c(byte[] bArr, int i) {
        for (int i2 = i; i2 < i + 8; i2++) {
            bArr[i2] = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046 A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo29282a(java.lang.String r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            java.net.DatagramSocket r2 = new java.net.DatagramSocket     // Catch:{ all -> 0x0040 }
            r2.<init>()     // Catch:{ all -> 0x0040 }
            r2.setSoTimeout(r7)     // Catch:{ all -> 0x003d }
            java.net.InetAddress r6 = java.net.InetAddress.getByName(r6)     // Catch:{ all -> 0x003d }
            r7 = 48
            byte[] r1 = new byte[r7]     // Catch:{ all -> 0x003d }
            java.net.DatagramPacket r3 = new java.net.DatagramPacket     // Catch:{ all -> 0x003d }
            r4 = 123(0x7b, float:1.72E-43)
            r3.<init>(r1, r7, r6, r4)     // Catch:{ all -> 0x003d }
            r6 = 27
            r1[r0] = r6     // Catch:{ all -> 0x003d }
            r6 = 40
            r5.m48464c(r1, r6)     // Catch:{ all -> 0x003d }
            r2.send(r3)     // Catch:{ all -> 0x003d }
            java.net.DatagramPacket r6 = new java.net.DatagramPacket     // Catch:{ all -> 0x003d }
            r6.<init>(r1, r7)     // Catch:{ all -> 0x003d }
            r2.receive(r6)     // Catch:{ all -> 0x003d }
            r2.close()     // Catch:{ all -> 0x003d }
            r6 = 32
            long r6 = r5.m48463b(r1, r6)     // Catch:{ all -> 0x003d }
            r5.f36649a = r6     // Catch:{ all -> 0x003d }
            r2.close()
            r6 = 1
            return r6
        L_0x003d:
            r6 = move-exception
            r1 = r2
            goto L_0x0041
        L_0x0040:
            r6 = move-exception
        L_0x0041:
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r6)     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0049
            r1.close()
        L_0x0049:
            return r0
        L_0x004a:
            r6 = move-exception
            if (r1 == 0) goto L_0x0050
            r1.close()
        L_0x0050:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C8892ca.mo29282a(java.lang.String, int):boolean");
    }

    /* renamed from: a */
    public long mo29281a() {
        return this.f36649a;
    }

    /* renamed from: a */
    private long m48462a(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        byte b5 = b & true;
        int i2 = b;
        if (b5 == true) {
            i2 = (b & Byte.MAX_VALUE) + C8843b4.f36445d;
        }
        byte b6 = b2 & true;
        int i3 = b2;
        if (b6 == true) {
            i3 = (b2 & Byte.MAX_VALUE) + C8843b4.f36445d;
        }
        byte b7 = b3 & true;
        int i4 = b3;
        if (b7 == true) {
            i4 = (b3 & Byte.MAX_VALUE) + C8843b4.f36445d;
        }
        byte b8 = b4 & true;
        int i5 = b4;
        if (b8 == true) {
            i5 = (b4 & Byte.MAX_VALUE) + C8843b4.f36445d;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }
}
