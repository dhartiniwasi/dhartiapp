package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class vp0 implements C2966vp {

    /* renamed from: q */
    private static final Pattern f19176q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r */
    private static final AtomicReference f19177r = new AtomicReference();

    /* renamed from: a */
    private final SSLSocketFactory f19178a = new up0(this);

    /* renamed from: b */
    private final int f19179b;

    /* renamed from: c */
    private final int f19180c;

    /* renamed from: d */
    private final String f19181d;

    /* renamed from: e */
    private final C2929up f19182e;

    /* renamed from: f */
    private final C2298dq f19183f;

    /* renamed from: g */
    private C2744pp f19184g;

    /* renamed from: h */
    private HttpURLConnection f19185h;

    /* renamed from: i */
    private InputStream f19186i;

    /* renamed from: j */
    private boolean f19187j;

    /* renamed from: k */
    private long f19188k;

    /* renamed from: l */
    private long f19189l;

    /* renamed from: m */
    private long f19190m;

    /* renamed from: n */
    private long f19191n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f19192o;

    /* renamed from: p */
    private final Set f19193p = new HashSet();

    vp0(String str, C2298dq dqVar, int i, int i2, int i3) {
        C2335eq.m12242b(str);
        this.f19181d = str;
        this.f19183f = dqVar;
        this.f19182e = new C2929up();
        this.f19179b = i;
        this.f19180c = i2;
        this.f19192o = i3;
    }

    /* renamed from: i */
    private final void m22338i() {
        HttpURLConnection httpURLConnection = this.f19185h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                pm0.m18665e("Unexpected error while disconnecting", e);
            }
            this.f19185h = null;
        }
    }

    /* renamed from: a */
    public final Map mo13020a() {
        HttpURLConnection httpURLConnection = this.f19185h;
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
            java.io.InputStream r2 = r9.f19186i     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0077
            java.net.HttpURLConnection r2 = r9.f19185h     // Catch:{ all -> 0x0088 }
            long r3 = r9.f19189l     // Catch:{ all -> 0x0088 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.f19191n     // Catch:{ all -> 0x0088 }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = com.google.android.gms.internal.ads.C2893tq.f18208a     // Catch:{ all -> 0x0088 }
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
            java.io.InputStream r2 = r9.f19186i     // Catch:{ IOException -> 0x006d }
            r2.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0077
        L_0x006d:
            r2 = move-exception
            com.google.android.gms.internal.ads.sp r3 = new com.google.android.gms.internal.ads.sp     // Catch:{ all -> 0x0088 }
            com.google.android.gms.internal.ads.pp r4 = r9.f19184g     // Catch:{ all -> 0x0088 }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.C2744pp) r4, (int) r5)     // Catch:{ all -> 0x0088 }
            throw r3     // Catch:{ all -> 0x0088 }
        L_0x0077:
            r9.f19186i = r0
            r9.m22338i()
            boolean r0 = r9.f19187j
            if (r0 == 0) goto L_0x0082
            r9.f19187j = r1
        L_0x0082:
            java.util.Set r0 = r9.f19193p
            r0.clear()
            return
        L_0x0088:
            r2 = move-exception
            r9.f19186i = r0
            r9.m22338i()
            boolean r0 = r9.f19187j
            if (r0 == 0) goto L_0x0094
            r9.f19187j = r1
        L_0x0094:
            java.util.Set r0 = r9.f19193p
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vp0.mo12051b():void");
    }

    /* renamed from: c */
    public final int mo12052c(byte[] bArr, int i, int i2) throws C2855sp {
        try {
            if (this.f19190m != this.f19188k) {
                byte[] bArr2 = (byte[]) f19177r.getAndSet((Object) null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.f19190m;
                    long j2 = this.f19188k;
                    if (j == j2) {
                        f19177r.set(bArr2);
                        break;
                    }
                    int read = this.f19186i.read(bArr2, 0, (int) Math.min(j2 - j, (long) bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f19190m += (long) read;
                        C2298dq dqVar = this.f19183f;
                        if (dqVar != null) {
                            ((kq0) dqVar).mo11769l0(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f19189l;
            if (j3 != -1) {
                long j4 = j3 - this.f19191n;
                if (j4 != 0) {
                    i2 = (int) Math.min((long) i2, j4);
                }
                return -1;
            }
            int read2 = this.f19186i.read(bArr, i, i2);
            if (read2 != -1) {
                this.f19191n += (long) read2;
                C2298dq dqVar2 = this.f19183f;
                if (dqVar2 == null) {
                    return read2;
                }
                ((kq0) dqVar2).mo11769l0(this, read2);
                return read2;
            } else if (this.f19189l == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new C2855sp(e, this.f19184g, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f6, code lost:
        if (r3 != 0) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x00de A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dc A[Catch:{ IOException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ae  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo12053d(com.google.android.gms.internal.ads.C2744pp r20) throws com.google.android.gms.internal.ads.C2855sp {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "Unable to connect to "
            r1.f19184g = r2
            r4 = 0
            r1.f19191n = r4
            r1.f19190m = r4
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0269 }
            android.net.Uri r7 = r2.f15941a     // Catch:{ IOException -> 0x0269 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0269 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0269 }
            long r7 = r2.f15943c     // Catch:{ IOException -> 0x0269 }
            long r9 = r2.f15944d     // Catch:{ IOException -> 0x0269 }
            r12 = 0
        L_0x001e:
            int r13 = r12 + 1
            r14 = 20
            if (r12 > r14) goto L_0x0252
            java.net.URLConnection r12 = r0.openConnection()     // Catch:{ IOException -> 0x0269 }
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ IOException -> 0x0269 }
            boolean r14 = r12 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0269 }
            if (r14 == 0) goto L_0x0036
            r14 = r12
            javax.net.ssl.HttpsURLConnection r14 = (javax.net.ssl.HttpsURLConnection) r14     // Catch:{ IOException -> 0x0269 }
            javax.net.ssl.SSLSocketFactory r15 = r1.f19178a     // Catch:{ IOException -> 0x0269 }
            r14.setSSLSocketFactory(r15)     // Catch:{ IOException -> 0x0269 }
        L_0x0036:
            int r14 = r1.f19179b     // Catch:{ IOException -> 0x0269 }
            r12.setConnectTimeout(r14)     // Catch:{ IOException -> 0x0269 }
            int r14 = r1.f19180c     // Catch:{ IOException -> 0x0269 }
            r12.setReadTimeout(r14)     // Catch:{ IOException -> 0x0269 }
            com.google.android.gms.internal.ads.up r14 = r1.f19182e     // Catch:{ IOException -> 0x0269 }
            java.util.Map r14 = r14.mo14563a()     // Catch:{ IOException -> 0x0269 }
            java.util.Set r14 = r14.entrySet()     // Catch:{ IOException -> 0x0269 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ IOException -> 0x0269 }
        L_0x004e:
            boolean r15 = r14.hasNext()     // Catch:{ IOException -> 0x0269 }
            if (r15 == 0) goto L_0x006c
            java.lang.Object r15 = r14.next()     // Catch:{ IOException -> 0x0269 }
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch:{ IOException -> 0x0269 }
            java.lang.Object r16 = r15.getKey()     // Catch:{ IOException -> 0x0269 }
            r6 = r16
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0269 }
            java.lang.Object r15 = r15.getValue()     // Catch:{ IOException -> 0x0269 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x0269 }
            r12.setRequestProperty(r6, r15)     // Catch:{ IOException -> 0x0269 }
            goto L_0x004e
        L_0x006c:
            r14 = -1
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0077
            int r6 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x00a8
            goto L_0x0078
        L_0x0077:
            r4 = r7
        L_0x0078:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0269 }
            r6.<init>()     // Catch:{ IOException -> 0x0269 }
            java.lang.String r11 = "bytes="
            r6.append(r11)     // Catch:{ IOException -> 0x0269 }
            r6.append(r4)     // Catch:{ IOException -> 0x0269 }
            java.lang.String r11 = "-"
            r6.append(r11)     // Catch:{ IOException -> 0x0269 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0269 }
            int r11 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r11 == 0) goto L_0x00a3
            long r4 = r4 + r9
            long r4 = r4 + r14
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0269 }
            r11.<init>()     // Catch:{ IOException -> 0x0269 }
            r11.append(r6)     // Catch:{ IOException -> 0x0269 }
            r11.append(r4)     // Catch:{ IOException -> 0x0269 }
            java.lang.String r6 = r11.toString()     // Catch:{ IOException -> 0x0269 }
        L_0x00a3:
            java.lang.String r4 = "Range"
            r12.setRequestProperty(r4, r6)     // Catch:{ IOException -> 0x0269 }
        L_0x00a8:
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = r1.f19181d     // Catch:{ IOException -> 0x0269 }
            r12.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0269 }
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "identity"
            r12.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0269 }
            r4 = 0
            r12.setInstanceFollowRedirects(r4)     // Catch:{ IOException -> 0x0269 }
            r12.setDoOutput(r4)     // Catch:{ IOException -> 0x0269 }
            r12.connect()     // Catch:{ IOException -> 0x0269 }
            int r4 = r12.getResponseCode()     // Catch:{ IOException -> 0x0269 }
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 == r5) goto L_0x020c
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x020c
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x020c
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L_0x020c
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L_0x020c
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L_0x00de
            goto L_0x020c
        L_0x00de:
            r1.f19185h = r12     // Catch:{ IOException -> 0x0269 }
            int r0 = r12.getResponseCode()     // Catch:{ IOException -> 0x01f2 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 < r3) goto L_0x01d6
            r4 = 299(0x12b, float:4.19E-43)
            if (r0 <= r4) goto L_0x00ee
            goto L_0x01d6
        L_0x00ee:
            if (r0 != r3) goto L_0x00f9
            long r3 = r2.f15943c
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00f9
            goto L_0x00fb
        L_0x00f9:
            r3 = 0
        L_0x00fb:
            r1.f19188k = r3
            long r3 = r2.f15944d
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0107
            r1.f19189l = r3
            goto L_0x01b4
        L_0x0107:
            java.net.HttpURLConnection r0 = r1.f19185h
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = "]"
            if (r4 != 0) goto L_0x0133
            long r6 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x011c }
            goto L_0x0134
        L_0x011c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Unexpected Content-Length ["
            r4.append(r6)
            r4.append(r3)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.ads.pm0.m18664d(r4)
        L_0x0133:
            r6 = r14
        L_0x0134:
            java.lang.String r4 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x01aa
            java.util.regex.Pattern r4 = f19176q
            java.util.regex.Matcher r4 = r4.matcher(r0)
            boolean r8 = r4.find()
            if (r8 == 0) goto L_0x01aa
            r8 = 2
            java.lang.String r8 = r4.group(r8)     // Catch:{ NumberFormatException -> 0x0193 }
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0193 }
            r10 = 1
            java.lang.String r4 = r4.group(r10)     // Catch:{ NumberFormatException -> 0x0193 }
            long r10 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0193 }
            long r8 = r8 - r10
            r10 = 1
            long r8 = r8 + r10
            r17 = 0
            int r4 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r4 >= 0) goto L_0x016a
            r6 = r8
            goto L_0x01aa
        L_0x016a:
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x01aa
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0193 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x0193 }
            java.lang.String r10 = "Inconsistent headers ["
            r4.append(r10)     // Catch:{ NumberFormatException -> 0x0193 }
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x0193 }
            java.lang.String r3 = "] ["
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x0193 }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x0193 }
            r4.append(r5)     // Catch:{ NumberFormatException -> 0x0193 }
            java.lang.String r3 = r4.toString()     // Catch:{ NumberFormatException -> 0x0193 }
            com.google.android.gms.internal.ads.pm0.m18667g(r3)     // Catch:{ NumberFormatException -> 0x0193 }
            long r3 = java.lang.Math.max(r6, r8)     // Catch:{ NumberFormatException -> 0x0193 }
            r6 = r3
            goto L_0x01aa
        L_0x0193:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected Content-Range ["
            r3.append(r4)
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.ads.pm0.m18664d(r0)
        L_0x01aa:
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01b2
            long r3 = r1.f19188k
            long r14 = r6 - r3
        L_0x01b2:
            r1.f19189l = r14
        L_0x01b4:
            java.net.HttpURLConnection r0 = r1.f19185h     // Catch:{ IOException -> 0x01cb }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x01cb }
            r1.f19186i = r0     // Catch:{ IOException -> 0x01cb }
            r3 = 1
            r1.f19187j = r3
            com.google.android.gms.internal.ads.dq r0 = r1.f19183f
            if (r0 == 0) goto L_0x01c8
            com.google.android.gms.internal.ads.kq0 r0 = (com.google.android.gms.internal.ads.kq0) r0
            r0.mo9649k(r1, r2)
        L_0x01c8:
            long r2 = r1.f19189l
            return r2
        L_0x01cb:
            r0 = move-exception
            r19.m22338i()
            com.google.android.gms.internal.ads.sp r3 = new com.google.android.gms.internal.ads.sp
            r4 = 1
            r3.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.C2744pp) r2, (int) r4)
            throw r3
        L_0x01d6:
            java.net.HttpURLConnection r3 = r1.f19185h
            java.util.Map r3 = r3.getHeaderFields()
            r19.m22338i()
            com.google.android.gms.internal.ads.tp r4 = new com.google.android.gms.internal.ads.tp
            r4.<init>(r0, r3, r2)
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x01f1
            com.google.android.gms.internal.ads.op r0 = new com.google.android.gms.internal.ads.op
            r5 = 0
            r0.<init>(r5)
            r4.initCause(r0)
        L_0x01f1:
            throw r4
        L_0x01f2:
            r0 = move-exception
            r4 = r0
            r19.m22338i()
            com.google.android.gms.internal.ads.sp r0 = new com.google.android.gms.internal.ads.sp
            android.net.Uri r5 = r2.f15941a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r3 = r3.concat(r5)
            r5 = 1
            r0.<init>(r3, r4, r2, r5)
            throw r0
        L_0x020c:
            r5 = 0
            r17 = 0
            java.lang.String r4 = "Location"
            java.lang.String r4 = r12.getHeaderField(r4)     // Catch:{ IOException -> 0x0269 }
            r12.disconnect()     // Catch:{ IOException -> 0x0269 }
            if (r4 == 0) goto L_0x024a
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x0269 }
            r6.<init>(r0, r4)     // Catch:{ IOException -> 0x0269 }
            java.lang.String r0 = r6.getProtocol()     // Catch:{ IOException -> 0x0269 }
            java.lang.String r4 = "https"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x0269 }
            if (r4 != 0) goto L_0x0244
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x0269 }
            if (r4 == 0) goto L_0x0234
            goto L_0x0244
        L_0x0234:
            java.net.ProtocolException r4 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0269 }
            java.lang.String r5 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0269 }
            java.lang.String r0 = r5.concat(r0)     // Catch:{ IOException -> 0x0269 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0269 }
            throw r4     // Catch:{ IOException -> 0x0269 }
        L_0x0244:
            r0 = r6
            r12 = r13
            r4 = r17
            goto L_0x001e
        L_0x024a:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0269 }
            java.lang.String r4 = "Null location redirect"
            r0.<init>(r4)     // Catch:{ IOException -> 0x0269 }
            throw r0     // Catch:{ IOException -> 0x0269 }
        L_0x0252:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0269 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0269 }
            r4.<init>()     // Catch:{ IOException -> 0x0269 }
            java.lang.String r5 = "Too many redirects: "
            r4.append(r5)     // Catch:{ IOException -> 0x0269 }
            r4.append(r13)     // Catch:{ IOException -> 0x0269 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0269 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0269 }
            throw r0     // Catch:{ IOException -> 0x0269 }
        L_0x0269:
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vp0.mo12053d(com.google.android.gms.internal.ads.pp):long");
    }

    /* renamed from: e */
    public final Uri mo12054e() {
        HttpURLConnection httpURLConnection = this.f19185h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo14802h(int i) {
        this.f19192o = i;
        for (Socket socket : this.f19193p) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f19192o);
                } catch (SocketException e) {
                    pm0.m18668h("Failed to update receive buffer size.", e);
                }
            }
        }
    }
}