package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ni2 extends kf2 {

    /* renamed from: e */
    private final ContentResolver f14035e;

    /* renamed from: f */
    private Uri f14036f;

    /* renamed from: g */
    private AssetFileDescriptor f14037g;

    /* renamed from: h */
    private FileInputStream f14038h;

    /* renamed from: i */
    private long f14039i;

    /* renamed from: j */
    private boolean f14040j;

    public ni2(Context context) {
        super(false);
        this.f14035e = context.getContentResolver();
    }

    /* renamed from: b */
    public final void mo8791b() throws mh2 {
        this.f14036f = null;
        try {
            FileInputStream fileInputStream = this.f14038h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f14038h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f14037g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f14037g = null;
                if (this.f14040j) {
                    this.f14040j = false;
                    mo11673m();
                }
            } catch (IOException e) {
                throw new mh2(e, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th) {
                this.f14037g = null;
                if (this.f14040j) {
                    this.f14040j = false;
                    mo11673m();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new mh2(e2, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th2) {
            this.f14038h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f14037g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f14037g = null;
                if (this.f14040j) {
                    this.f14040j = false;
                    mo11673m();
                }
                throw th2;
            } catch (IOException e3) {
                throw new mh2(e3, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th3) {
                this.f14037g = null;
                if (this.f14040j) {
                    this.f14040j = false;
                    mo11673m();
                }
                throw th3;
            }
        }
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) throws mh2 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14039i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new mh2(e, AdError.SERVER_ERROR_CODE);
            }
        }
        FileInputStream fileInputStream = this.f14038h;
        int i3 = gb2.f9812a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f14039i;
        if (j2 != -1) {
            this.f14039i = j2 - ((long) read);
        }
        mo11672f0(read);
        return read;
    }

    /* renamed from: e */
    public final Uri mo8793e() {
        return this.f14036f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ee, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ef, code lost:
        r3 = com.facebook.ads.AdError.SERVER_ERROR_CODE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f9, code lost:
        r3 = 2005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0100, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ff A[ExcHandler: mh2 (r0v1 'e' com.google.android.gms.internal.ads.mh2 A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo8794f(com.google.android.gms.internal.ads.wq2 r18) throws com.google.android.gms.internal.ads.mh2 {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r3 = 1
            android.net.Uri r4 = r0.f19753a     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r1.f14036f = r4     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r17.mo11674n(r18)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            java.lang.String r5 = "content"
            android.net.Uri r6 = r0.f19753a     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            java.lang.String r6 = r6.getScheme()     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            boolean r5 = r5.equals(r6)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            if (r5 == 0) goto L_0x002d
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r5.<init>()     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            java.lang.String r6 = "android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT"
            r5.putBoolean(r6, r3)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            android.content.ContentResolver r6 = r1.f14035e     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            java.lang.String r7 = "*/*"
            android.content.res.AssetFileDescriptor r5 = r6.openTypedAssetFileDescriptor(r4, r7, r5)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            goto L_0x0035
        L_0x002d:
            android.content.ContentResolver r5 = r1.f14035e     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r5 = r5.openAssetFileDescriptor(r4, r6)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
        L_0x0035:
            r1.f14037g = r5     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            if (r5 == 0) goto L_0x00ca
            long r6 = r5.getLength()     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            java.io.FileDescriptor r8 = r5.getFileDescriptor()     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r4.<init>(r8)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r1.f14038h = r4     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r8 = 2008(0x7d8, float:2.814E-42)
            r9 = 0
            r10 = -1
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x005e
            long r13 = r0.f19758f     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 > 0) goto L_0x0058
            goto L_0x005e
        L_0x0058:
            com.google.android.gms.internal.ads.mh2 r0 = new com.google.android.gms.internal.ads.mh2     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r0.<init>(r9, r8)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            throw r0     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
        L_0x005e:
            long r13 = r5.getStartOffset()     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            long r2 = r0.f19758f     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            long r2 = r2 + r13
            long r2 = r4.skip(r2)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            long r2 = r2 - r13
            long r13 = r0.f19758f     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            int r16 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r16 != 0) goto L_0x00c4
            r13 = 0
            if (r12 != 0) goto L_0x0096
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            long r3 = r2.size()     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0084
            r1.f14039i = r10     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r3 = r10
            goto L_0x009e
        L_0x0084:
            long r6 = r2.position()     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            long r3 = r3 - r6
            r1.f14039i = r3     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0090
            goto L_0x009e
        L_0x0090:
            com.google.android.gms.internal.ads.mh2 r0 = new com.google.android.gms.internal.ads.mh2     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r0.<init>(r9, r8)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            throw r0     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
        L_0x0096:
            long r3 = r6 - r2
            r1.f14039i = r3     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x00be
        L_0x009e:
            long r5 = r0.f19759g
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00ae
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00ac
            long r5 = java.lang.Math.min(r3, r5)
        L_0x00ac:
            r1.f14039i = r5
        L_0x00ae:
            r2 = 1
            r1.f14040j = r2
            r17.mo11675o(r18)
            long r2 = r0.f19759g
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00bb
            return r2
        L_0x00bb:
            long r2 = r1.f14039i
            return r2
        L_0x00be:
            com.google.android.gms.internal.ads.mh2 r0 = new com.google.android.gms.internal.ads.mh2     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r0.<init>(r9, r8)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            throw r0     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
        L_0x00c4:
            com.google.android.gms.internal.ads.mh2 r0 = new com.google.android.gms.internal.ads.mh2     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r0.<init>(r9, r8)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            throw r0     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
        L_0x00ca:
            com.google.android.gms.internal.ads.mh2 r0 = new com.google.android.gms.internal.ads.mh2     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r4.<init>()     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            java.lang.String r6 = "Could not open file descriptor for: "
            r4.append(r6)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r4.append(r3)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            java.lang.String r3 = r4.toString()     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r2.<init>(r3)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ee }
            r3 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r2, r3)     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ec }
            throw r0     // Catch:{ mh2 -> 0x00ff, IOException -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            goto L_0x00f1
        L_0x00ee:
            r0 = move-exception
            r3 = 2000(0x7d0, float:2.803E-42)
        L_0x00f1:
            com.google.android.gms.internal.ads.mh2 r2 = new com.google.android.gms.internal.ads.mh2
            boolean r4 = r0 instanceof java.io.FileNotFoundException
            r5 = 1
            if (r5 == r4) goto L_0x00f9
            goto L_0x00fb
        L_0x00f9:
            r3 = 2005(0x7d5, float:2.81E-42)
        L_0x00fb:
            r2.<init>(r0, r3)
            throw r2
        L_0x00ff:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ni2.mo8794f(com.google.android.gms.internal.ads.wq2):long");
    }
}
