package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.rp */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2818rp implements C2966vp {

    /* renamed from: n */
    private static final Pattern f17039n = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: o */
    private static final AtomicReference f17040o = new AtomicReference();

    /* renamed from: a */
    private final int f17041a;

    /* renamed from: b */
    private final int f17042b;

    /* renamed from: c */
    private final String f17043c;

    /* renamed from: d */
    private final C2929up f17044d = new C2929up();

    /* renamed from: e */
    private final C2298dq f17045e;

    /* renamed from: f */
    private C2744pp f17046f;

    /* renamed from: g */
    private HttpURLConnection f17047g;

    /* renamed from: h */
    private InputStream f17048h;

    /* renamed from: i */
    private boolean f17049i;

    /* renamed from: j */
    private long f17050j;

    /* renamed from: k */
    private long f17051k;

    /* renamed from: l */
    private long f17052l;

    /* renamed from: m */
    private long f17053m;

    public C2818rp(String str, C2707oq oqVar, C2298dq dqVar, int i, int i2, boolean z, C2929up upVar) {
        C2335eq.m12242b(str);
        this.f17043c = str;
        this.f17045e = dqVar;
        this.f17041a = i;
        this.f17042b = i2;
    }

    /* renamed from: f */
    private final void m19976f() {
        HttpURLConnection httpURLConnection = this.f17047g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f17047g = null;
        }
    }

    /* renamed from: a */
    public final Map mo13020a() {
        HttpURLConnection httpURLConnection = this.f17047g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|(1:6)(1:7)|8|9|(5:13|14|(2:16|(1:18))(2:19|(1:21))|22|(1:26))|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12051b() throws com.google.android.gms.internal.ads.C2855sp {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f17048h     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0077
            java.net.HttpURLConnection r2 = r9.f17047g     // Catch:{ all -> 0x0083 }
            long r3 = r9.f17051k     // Catch:{ all -> 0x0083 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.f17053m     // Catch:{ all -> 0x0083 }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = com.google.android.gms.internal.ads.C2893tq.f18208a     // Catch:{ all -> 0x0083 }
            r8 = 19
            if (r7 == r8) goto L_0x001f
            r8 = 20
            if (r7 == r8) goto L_0x001f
            goto L_0x0067
        L_0x001f:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x0067 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x002f
            int r3 = r2.read()     // Catch:{ Exception -> 0x0067 }
            r4 = -1
            if (r3 == r4) goto L_0x0067
            goto L_0x0036
        L_0x002f:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0036
            goto L_0x0067
        L_0x0036:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x0067 }
            if (r4 != 0) goto L_0x004e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0067 }
            if (r3 == 0) goto L_0x0067
        L_0x004e:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0067 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0067 }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x0067 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0067 }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            java.io.InputStream r2 = r9.f17048h     // Catch:{ IOException -> 0x006d }
            r2.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0077
        L_0x006d:
            r2 = move-exception
            com.google.android.gms.internal.ads.sp r3 = new com.google.android.gms.internal.ads.sp     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.pp r4 = r9.f17046f     // Catch:{ all -> 0x0083 }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.C2744pp) r4, (int) r5)     // Catch:{ all -> 0x0083 }
            throw r3     // Catch:{ all -> 0x0083 }
        L_0x0077:
            r9.f17048h = r0
            r9.m19976f()
            boolean r0 = r9.f17049i
            if (r0 == 0) goto L_0x0082
            r9.f17049i = r1
        L_0x0082:
            return
        L_0x0083:
            r2 = move-exception
            r9.f17048h = r0
            r9.m19976f()
            boolean r0 = r9.f17049i
            if (r0 == 0) goto L_0x008f
            r9.f17049i = r1
        L_0x008f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2818rp.mo12051b():void");
    }

    /* renamed from: c */
    public final int mo12052c(byte[] bArr, int i, int i2) throws C2855sp {
        try {
            if (this.f17052l != this.f17050j) {
                byte[] bArr2 = (byte[]) f17040o.getAndSet((Object) null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.f17052l;
                    long j2 = this.f17050j;
                    if (j == j2) {
                        f17040o.set(bArr2);
                        break;
                    }
                    int read = this.f17048h.read(bArr2, 0, (int) Math.min(j2 - j, (long) bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f17052l += (long) read;
                        C2298dq dqVar = this.f17045e;
                        if (dqVar != null) {
                            dqVar.mo9648j(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f17051k;
            if (j3 != -1) {
                long j4 = j3 - this.f17053m;
                if (j4 != 0) {
                    i2 = (int) Math.min((long) i2, j4);
                }
                return -1;
            }
            int read2 = this.f17048h.read(bArr, i, i2);
            if (read2 != -1) {
                this.f17053m += (long) read2;
                C2298dq dqVar2 = this.f17045e;
                if (dqVar2 == null) {
                    return read2;
                }
                dqVar2.mo9648j(this, read2);
                return read2;
            } else if (this.f17051k == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new C2855sp(e, this.f17046f, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ef, code lost:
        if (r3 != 0) goto L_0x00f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x00d2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d0 A[Catch:{ IOException -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a9  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo12053d(com.google.android.gms.internal.ads.C2744pp r20) throws com.google.android.gms.internal.ads.C2855sp {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "Unable to connect to "
            r1.f17046f = r2
            r4 = 0
            r1.f17053m = r4
            r1.f17052l = r4
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0262 }
            android.net.Uri r7 = r2.f15941a     // Catch:{ IOException -> 0x0262 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0262 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0262 }
            long r7 = r2.f15943c     // Catch:{ IOException -> 0x0262 }
            long r9 = r2.f15944d     // Catch:{ IOException -> 0x0262 }
            r12 = 0
        L_0x001e:
            int r13 = r12 + 1
            r14 = 20
            if (r12 > r14) goto L_0x024b
            java.net.URLConnection r12 = r0.openConnection()     // Catch:{ IOException -> 0x0262 }
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ IOException -> 0x0262 }
            int r14 = r1.f17041a     // Catch:{ IOException -> 0x0262 }
            r12.setConnectTimeout(r14)     // Catch:{ IOException -> 0x0262 }
            int r14 = r1.f17042b     // Catch:{ IOException -> 0x0262 }
            r12.setReadTimeout(r14)     // Catch:{ IOException -> 0x0262 }
            com.google.android.gms.internal.ads.up r14 = r1.f17044d     // Catch:{ IOException -> 0x0262 }
            java.util.Map r14 = r14.mo14563a()     // Catch:{ IOException -> 0x0262 }
            java.util.Set r14 = r14.entrySet()     // Catch:{ IOException -> 0x0262 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ IOException -> 0x0262 }
        L_0x0042:
            boolean r15 = r14.hasNext()     // Catch:{ IOException -> 0x0262 }
            if (r15 == 0) goto L_0x0060
            java.lang.Object r15 = r14.next()     // Catch:{ IOException -> 0x0262 }
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch:{ IOException -> 0x0262 }
            java.lang.Object r16 = r15.getKey()     // Catch:{ IOException -> 0x0262 }
            r6 = r16
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0262 }
            java.lang.Object r15 = r15.getValue()     // Catch:{ IOException -> 0x0262 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x0262 }
            r12.setRequestProperty(r6, r15)     // Catch:{ IOException -> 0x0262 }
            goto L_0x0042
        L_0x0060:
            r14 = -1
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x006b
            int r6 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x009c
            goto L_0x006c
        L_0x006b:
            r4 = r7
        L_0x006c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0262 }
            r6.<init>()     // Catch:{ IOException -> 0x0262 }
            java.lang.String r11 = "bytes="
            r6.append(r11)     // Catch:{ IOException -> 0x0262 }
            r6.append(r4)     // Catch:{ IOException -> 0x0262 }
            java.lang.String r11 = "-"
            r6.append(r11)     // Catch:{ IOException -> 0x0262 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0262 }
            int r11 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r11 == 0) goto L_0x0097
            long r4 = r4 + r9
            long r4 = r4 + r14
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0262 }
            r11.<init>()     // Catch:{ IOException -> 0x0262 }
            r11.append(r6)     // Catch:{ IOException -> 0x0262 }
            r11.append(r4)     // Catch:{ IOException -> 0x0262 }
            java.lang.String r6 = r11.toString()     // Catch:{ IOException -> 0x0262 }
        L_0x0097:
            java.lang.String r4 = "Range"
            r12.setRequestProperty(r4, r6)     // Catch:{ IOException -> 0x0262 }
        L_0x009c:
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = r1.f17043c     // Catch:{ IOException -> 0x0262 }
            r12.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0262 }
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "identity"
            r12.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0262 }
            r4 = 0
            r12.setInstanceFollowRedirects(r4)     // Catch:{ IOException -> 0x0262 }
            r12.setDoOutput(r4)     // Catch:{ IOException -> 0x0262 }
            r12.connect()     // Catch:{ IOException -> 0x0262 }
            int r4 = r12.getResponseCode()     // Catch:{ IOException -> 0x0262 }
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 == r5) goto L_0x0205
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x0205
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x0205
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L_0x0205
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L_0x0205
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L_0x00d2
            goto L_0x0205
        L_0x00d2:
            r1.f17047g = r12     // Catch:{ IOException -> 0x0262 }
            int r0 = r12.getResponseCode()     // Catch:{ IOException -> 0x01eb }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 < r3) goto L_0x01cf
            r4 = 299(0x12b, float:4.19E-43)
            if (r0 <= r4) goto L_0x00e2
            goto L_0x01cf
        L_0x00e2:
            java.net.HttpURLConnection r4 = r1.f17047g
            r4.getContentType()
            if (r0 != r3) goto L_0x00f2
            long r3 = r2.f15943c
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r3 = 0
        L_0x00f4:
            r1.f17050j = r3
            long r3 = r2.f15944d
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0100
            r1.f17051k = r3
            goto L_0x01af
        L_0x0100:
            java.net.HttpURLConnection r0 = r1.f17047g
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = "DefaultHttpDataSource"
            java.lang.String r6 = "]"
            if (r4 != 0) goto L_0x012e
            long r7 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0117 }
            goto L_0x012f
        L_0x0117:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Unexpected Content-Length ["
            r4.append(r7)
            r4.append(r3)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r5, r4)
        L_0x012e:
            r7 = r14
        L_0x012f:
            java.lang.String r4 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x01a5
            java.util.regex.Pattern r4 = f17039n
            java.util.regex.Matcher r4 = r4.matcher(r0)
            boolean r9 = r4.find()
            if (r9 == 0) goto L_0x01a5
            r9 = 2
            java.lang.String r9 = r4.group(r9)     // Catch:{ NumberFormatException -> 0x018e }
            long r9 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x018e }
            r11 = 1
            java.lang.String r4 = r4.group(r11)     // Catch:{ NumberFormatException -> 0x018e }
            long r11 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x018e }
            long r9 = r9 - r11
            r11 = 1
            long r9 = r9 + r11
            r17 = 0
            int r4 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r4 >= 0) goto L_0x0165
            r7 = r9
            goto L_0x01a5
        L_0x0165:
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x018e }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x018e }
            java.lang.String r11 = "Inconsistent headers ["
            r4.append(r11)     // Catch:{ NumberFormatException -> 0x018e }
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x018e }
            java.lang.String r3 = "] ["
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x018e }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x018e }
            r4.append(r6)     // Catch:{ NumberFormatException -> 0x018e }
            java.lang.String r3 = r4.toString()     // Catch:{ NumberFormatException -> 0x018e }
            android.util.Log.w(r5, r3)     // Catch:{ NumberFormatException -> 0x018e }
            long r3 = java.lang.Math.max(r7, r9)     // Catch:{ NumberFormatException -> 0x018e }
            r7 = r3
            goto L_0x01a5
        L_0x018e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected Content-Range ["
            r3.append(r4)
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r5, r0)
        L_0x01a5:
            int r0 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01ad
            long r3 = r1.f17050j
            long r14 = r7 - r3
        L_0x01ad:
            r1.f17051k = r14
        L_0x01af:
            java.net.HttpURLConnection r0 = r1.f17047g     // Catch:{ IOException -> 0x01c4 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x01c4 }
            r1.f17048h = r0     // Catch:{ IOException -> 0x01c4 }
            r3 = 1
            r1.f17049i = r3
            com.google.android.gms.internal.ads.dq r0 = r1.f17045e
            if (r0 == 0) goto L_0x01c1
            r0.mo9649k(r1, r2)
        L_0x01c1:
            long r2 = r1.f17051k
            return r2
        L_0x01c4:
            r0 = move-exception
            r19.m19976f()
            com.google.android.gms.internal.ads.sp r3 = new com.google.android.gms.internal.ads.sp
            r4 = 1
            r3.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.C2744pp) r2, (int) r4)
            throw r3
        L_0x01cf:
            java.net.HttpURLConnection r3 = r1.f17047g
            java.util.Map r3 = r3.getHeaderFields()
            r19.m19976f()
            com.google.android.gms.internal.ads.tp r4 = new com.google.android.gms.internal.ads.tp
            r4.<init>(r0, r3, r2)
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x01ea
            com.google.android.gms.internal.ads.op r0 = new com.google.android.gms.internal.ads.op
            r5 = 0
            r0.<init>(r5)
            r4.initCause(r0)
        L_0x01ea:
            throw r4
        L_0x01eb:
            r0 = move-exception
            r4 = r0
            r19.m19976f()
            com.google.android.gms.internal.ads.sp r0 = new com.google.android.gms.internal.ads.sp
            android.net.Uri r5 = r2.f15941a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r3 = r3.concat(r5)
            r5 = 1
            r0.<init>(r3, r4, r2, r5)
            throw r0
        L_0x0205:
            r5 = 0
            r17 = 0
            java.lang.String r4 = "Location"
            java.lang.String r4 = r12.getHeaderField(r4)     // Catch:{ IOException -> 0x0262 }
            r12.disconnect()     // Catch:{ IOException -> 0x0262 }
            if (r4 == 0) goto L_0x0243
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x0262 }
            r6.<init>(r0, r4)     // Catch:{ IOException -> 0x0262 }
            java.lang.String r0 = r6.getProtocol()     // Catch:{ IOException -> 0x0262 }
            java.lang.String r4 = "https"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x0262 }
            if (r4 != 0) goto L_0x023d
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x0262 }
            if (r4 == 0) goto L_0x022d
            goto L_0x023d
        L_0x022d:
            java.net.ProtocolException r4 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0262 }
            java.lang.String r5 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0262 }
            java.lang.String r0 = r5.concat(r0)     // Catch:{ IOException -> 0x0262 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0262 }
            throw r4     // Catch:{ IOException -> 0x0262 }
        L_0x023d:
            r0 = r6
            r12 = r13
            r4 = r17
            goto L_0x001e
        L_0x0243:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0262 }
            java.lang.String r4 = "Null location redirect"
            r0.<init>(r4)     // Catch:{ IOException -> 0x0262 }
            throw r0     // Catch:{ IOException -> 0x0262 }
        L_0x024b:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0262 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0262 }
            r4.<init>()     // Catch:{ IOException -> 0x0262 }
            java.lang.String r5 = "Too many redirects: "
            r4.append(r5)     // Catch:{ IOException -> 0x0262 }
            r4.append(r13)     // Catch:{ IOException -> 0x0262 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0262 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0262 }
            throw r0     // Catch:{ IOException -> 0x0262 }
        L_0x0262:
            r0 = move-exception
            com.google.android.gms.internal.ads.sp r4 = new com.google.android.gms.internal.ads.sp
            android.net.Uri r5 = r2.f15941a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r3 = r3.concat(r5)
            r5 = 1
            r4.<init>(r3, r0, r2, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2818rp.mo12053d(com.google.android.gms.internal.ads.pp):long");
    }

    /* renamed from: e */
    public final Uri mo12054e() {
        HttpURLConnection httpURLConnection = this.f17047g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
