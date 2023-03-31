package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class oq0 implements C2966vp {

    /* renamed from: r */
    private static final Pattern f15310r = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: a */
    private final int f15311a;

    /* renamed from: b */
    private final int f15312b;

    /* renamed from: c */
    private final String f15313c;

    /* renamed from: d */
    private final C2929up f15314d = new C2929up();

    /* renamed from: e */
    private final C2298dq f15315e;

    /* renamed from: f */
    private C2744pp f15316f;

    /* renamed from: g */
    private HttpURLConnection f15317g;

    /* renamed from: h */
    private final Queue f15318h;

    /* renamed from: i */
    private InputStream f15319i;

    /* renamed from: j */
    private boolean f15320j;

    /* renamed from: k */
    private long f15321k;

    /* renamed from: l */
    private long f15322l;

    /* renamed from: m */
    private long f15323m;

    /* renamed from: n */
    private long f15324n;

    /* renamed from: o */
    private long f15325o;

    /* renamed from: p */
    private final long f15326p;

    /* renamed from: q */
    private final long f15327q;

    oq0(String str, C2298dq dqVar, int i, int i2, long j, long j2) {
        C2335eq.m12242b(str);
        this.f15313c = str;
        this.f15315e = dqVar;
        this.f15311a = i;
        this.f15312b = i2;
        this.f15318h = new ArrayDeque();
        this.f15326p = j;
        this.f15327q = j2;
    }

    /* renamed from: g */
    private final void m18024g() {
        while (!this.f15318h.isEmpty()) {
            try {
                ((HttpURLConnection) this.f15318h.remove()).disconnect();
            } catch (Exception e) {
                pm0.m18665e("Unexpected error while disconnecting", e);
            }
        }
        this.f15317g = null;
    }

    /* renamed from: a */
    public final Map mo13020a() {
        HttpURLConnection httpURLConnection = this.f15317g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* renamed from: b */
    public final void mo12051b() throws C2855sp {
        try {
            InputStream inputStream = this.f15319i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f15319i = null;
            m18024g();
            if (this.f15320j) {
                this.f15320j = false;
            }
        } catch (IOException e) {
            throw new C2855sp(e, this.f15316f, 3);
        } catch (Throwable th) {
            this.f15319i = null;
            m18024g();
            if (this.f15320j) {
                this.f15320j = false;
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final int mo12052c(byte[] bArr, int i, int i2) throws C2855sp {
        int i3 = i2;
        if (i3 == 0) {
            return 0;
        }
        try {
            long j = this.f15321k;
            long j2 = this.f15322l;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = (long) i3;
            long j4 = this.f15327q;
            long j5 = this.f15325o;
            long j6 = j5 + 1;
            if (this.f15323m + j2 + j3 + j4 > j6) {
                long j7 = this.f15324n;
                if (j5 < j7) {
                    long min = Math.min(j7, Math.max(((this.f15326p + j6) - j4) - 1, -1 + j6 + j3));
                    long j8 = j6;
                    long j9 = min;
                    mo13021f(j8, min, 2);
                    this.f15325o = j9;
                    j5 = j9;
                }
            }
            int read = this.f15319i.read(bArr, i, (int) Math.min(j3, ((j5 + 1) - this.f15323m) - this.f15322l));
            if (read != -1) {
                this.f15322l += (long) read;
                C2298dq dqVar = this.f15315e;
                if (dqVar != null) {
                    ((kq0) dqVar).mo11769l0(this, read);
                }
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C2855sp(e, this.f15316f, 2);
        }
    }

    /* renamed from: d */
    public final long mo12053d(C2744pp ppVar) throws C2855sp {
        long j;
        this.f15316f = ppVar;
        this.f15322l = 0;
        long j2 = ppVar.f15943c;
        long j3 = ppVar.f15944d;
        if (j3 == -1) {
            j = this.f15326p;
        } else {
            j = Math.min(this.f15326p, j3);
        }
        this.f15323m = j2;
        HttpURLConnection f = mo13021f(j2, (j + j2) - 1, 1);
        this.f15317g = f;
        String headerField = f.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f15310r.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = ppVar.f15944d;
                    if (j4 != -1) {
                        this.f15321k = j4;
                        this.f15324n = Math.max(parseLong, (this.f15323m + j4) - 1);
                    } else {
                        this.f15321k = parseLong2 - this.f15323m;
                        this.f15324n = parseLong2 - 1;
                    }
                    this.f15325o = parseLong;
                    this.f15320j = true;
                    C2298dq dqVar = this.f15315e;
                    if (dqVar != null) {
                        ((kq0) dqVar).mo9649k(this, ppVar);
                    }
                    return this.f15321k;
                } catch (NumberFormatException unused) {
                    pm0.m18664d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new mq0(headerField, ppVar);
    }

    /* renamed from: e */
    public final Uri mo12054e() {
        HttpURLConnection httpURLConnection = this.f15317g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final HttpURLConnection mo13021f(long j, long j2, int i) throws C2855sp {
        String uri = this.f15316f.f15941a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f15311a);
            httpURLConnection.setReadTimeout(this.f15312b);
            for (Map.Entry entry : this.f15314d.mo14563a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.f15313c);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f15318h.add(httpURLConnection);
            String uri2 = this.f15316f.f15941a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    Map headerFields = httpURLConnection.getHeaderFields();
                    m18024g();
                    throw new nq0(responseCode, headerFields, this.f15316f, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f15319i != null) {
                        inputStream = new SequenceInputStream(this.f15319i, inputStream);
                    }
                    this.f15319i = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    m18024g();
                    throw new C2855sp(e, this.f15316f, i);
                }
            } catch (IOException e2) {
                m18024g();
                throw new C2855sp("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.f15316f, i);
            }
        } catch (IOException e3) {
            throw new C2855sp("Unable to connect to ".concat(String.valueOf(uri)), e3, this.f15316f, i);
        }
    }
}
