package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
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
final class ls0 extends kf2 implements f93 {

    /* renamed from: v */
    private static final Pattern f12903v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e */
    private final int f12904e;

    /* renamed from: f */
    private final int f12905f;

    /* renamed from: g */
    private final String f12906g;

    /* renamed from: h */
    private final e83 f12907h = new e83();

    /* renamed from: i */
    private wq2 f12908i;

    /* renamed from: j */
    private HttpURLConnection f12909j;

    /* renamed from: k */
    private final Queue f12910k;

    /* renamed from: l */
    private InputStream f12911l;

    /* renamed from: m */
    private boolean f12912m;

    /* renamed from: n */
    private int f12913n;

    /* renamed from: o */
    private long f12914o;

    /* renamed from: p */
    private long f12915p;

    /* renamed from: q */
    private long f12916q;

    /* renamed from: r */
    private long f12917r;

    /* renamed from: s */
    private long f12918s;

    /* renamed from: t */
    private final long f12919t;

    /* renamed from: u */
    private final long f12920u;

    ls0(String str, ve3 ve3, int i, int i2, long j, long j2) {
        super(true);
        v91.m22049c(str);
        this.f12906g = str;
        this.f12904e = i;
        this.f12905f = i2;
        this.f12910k = new ArrayDeque();
        this.f12919t = j;
        this.f12920u = j2;
        if (ve3 != null) {
            mo8795k(ve3);
        }
    }

    /* renamed from: q */
    private final void m16118q() {
        while (!this.f12910k.isEmpty()) {
            try {
                ((HttpURLConnection) this.f12910k.remove()).disconnect();
            } catch (Exception e) {
                pm0.m18665e("Unexpected error while disconnecting", e);
            }
        }
        this.f12909j = null;
    }

    /* renamed from: a */
    public final Map mo8790a() {
        HttpURLConnection httpURLConnection = this.f12909j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* renamed from: b */
    public final void mo8791b() throws c53 {
        try {
            InputStream inputStream = this.f12911l;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f12911l = null;
            m16118q();
            if (this.f12912m) {
                this.f12912m = false;
                mo11673m();
            }
        } catch (IOException e) {
            throw new c53(e, this.f12908i, (int) AdError.SERVER_ERROR_CODE, 3);
        } catch (Throwable th) {
            this.f12911l = null;
            m16118q();
            if (this.f12912m) {
                this.f12912m = false;
                mo11673m();
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) throws c53 {
        int i3 = i2;
        if (i3 == 0) {
            return 0;
        }
        try {
            long j = this.f12914o;
            long j2 = this.f12915p;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = (long) i3;
            long j4 = this.f12920u;
            long j5 = this.f12918s;
            long j6 = j5 + 1;
            if (this.f12916q + j2 + j3 + j4 > j6) {
                long j7 = this.f12917r;
                if (j5 < j7) {
                    long min = Math.min(j7, Math.max(((this.f12919t + j6) - j4) - 1, -1 + j6 + j3));
                    long j8 = j6;
                    long j9 = min;
                    mo12075p(j8, min, 2);
                    this.f12918s = j9;
                    j5 = j9;
                }
            }
            int read = this.f12911l.read(bArr, i, (int) Math.min(j3, ((j5 + 1) - this.f12916q) - this.f12915p));
            if (read != -1) {
                this.f12915p += (long) read;
                mo11672f0(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new c53(e, this.f12908i, (int) AdError.SERVER_ERROR_CODE, 2);
        }
    }

    /* renamed from: e */
    public final Uri mo8793e() {
        HttpURLConnection httpURLConnection = this.f12909j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: f */
    public final long mo8794f(wq2 wq2) throws c53 {
        long j;
        this.f12908i = wq2;
        this.f12915p = 0;
        long j2 = wq2.f19758f;
        long j3 = wq2.f19759g;
        if (j3 == -1) {
            j = this.f12919t;
        } else {
            j = Math.min(this.f12919t, j3);
        }
        this.f12916q = j2;
        HttpURLConnection p = mo12075p(j2, (j + j2) - 1, 1);
        this.f12909j = p;
        String headerField = p.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f12903v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = wq2.f19759g;
                    if (j4 != -1) {
                        this.f12914o = j4;
                        this.f12917r = Math.max(parseLong, (this.f12916q + j4) - 1);
                    } else {
                        this.f12914o = parseLong2 - this.f12916q;
                        this.f12917r = parseLong2 - 1;
                    }
                    this.f12918s = parseLong;
                    this.f12912m = true;
                    mo11675o(wq2);
                    return this.f12914o;
                } catch (NumberFormatException unused) {
                    pm0.m18664d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new js0(headerField, wq2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final HttpURLConnection mo12075p(long j, long j2, int i) throws c53 {
        String uri = this.f12908i.f19753a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f12904e);
            httpURLConnection.setReadTimeout(this.f12905f);
            for (Map.Entry entry : this.f12907h.mo9825a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.f12906g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f12910k.add(httpURLConnection);
            String uri2 = this.f12908i.f19753a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f12913n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map headerFields = httpURLConnection.getHeaderFields();
                    m16118q();
                    throw new ks0(this.f12913n, headerFields, this.f12908i, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f12911l != null) {
                        inputStream = new SequenceInputStream(this.f12911l, inputStream);
                    }
                    this.f12911l = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    m16118q();
                    throw new c53(e, this.f12908i, (int) AdError.SERVER_ERROR_CODE, i);
                }
            } catch (IOException e2) {
                m16118q();
                throw new c53("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.f12908i, AdError.SERVER_ERROR_CODE, i);
            }
        } catch (IOException e3) {
            throw new c53("Unable to connect to ".concat(String.valueOf(uri)), e3, this.f12908i, AdError.SERVER_ERROR_CODE, i);
        }
    }
}
