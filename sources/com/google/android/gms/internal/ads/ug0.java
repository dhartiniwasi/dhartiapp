package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class ug0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ OutputStream f18524a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f18525b;

    public /* synthetic */ ug0(OutputStream outputStream, byte[] bArr) {
        this.f18524a = outputStream;
        this.f18525b = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            java.io.OutputStream r0 = r5.f18524a
            byte[] r1 = r5.f18525b
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.wg0> r2 = com.google.android.gms.internal.ads.wg0.CREATOR
            r2 = 0
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x001f }
            r3.<init>(r0)     // Catch:{ IOException -> 0x001f }
            int r2 = r1.length     // Catch:{ IOException -> 0x001a, all -> 0x0017 }
            r3.writeInt(r2)     // Catch:{ IOException -> 0x001a, all -> 0x0017 }
            r3.write(r1)     // Catch:{ IOException -> 0x001a, all -> 0x0017 }
            p067i5.C4697k.m30405a(r3)
            return
        L_0x0017:
            r1 = move-exception
            r2 = r3
            goto L_0x0038
        L_0x001a:
            r1 = move-exception
            r2 = r3
            goto L_0x0020
        L_0x001d:
            r1 = move-exception
            goto L_0x0038
        L_0x001f:
            r1 = move-exception
        L_0x0020:
            java.lang.String r3 = "Error transporting the ad response"
            com.google.android.gms.internal.ads.pm0.m18665e(r3, r1)     // Catch:{ all -> 0x001d }
            com.google.android.gms.internal.ads.xl0 r3 = p053g4.C4409t.m29325q()     // Catch:{ all -> 0x001d }
            java.lang.String r4 = "LargeParcelTeleporter.pipeData.1"
            r3.mo15126t(r1, r4)     // Catch:{ all -> 0x001d }
            if (r2 != 0) goto L_0x0034
            p067i5.C4697k.m30405a(r0)
            return
        L_0x0034:
            p067i5.C4697k.m30405a(r2)
            return
        L_0x0038:
            if (r2 != 0) goto L_0x003e
            p067i5.C4697k.m30405a(r0)
            goto L_0x0041
        L_0x003e:
            p067i5.C4697k.m30405a(r2)
        L_0x0041:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ug0.run():void");
    }
}
