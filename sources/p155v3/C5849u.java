package p155v3;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import p155v3.C5828l;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;
import p182a7.C6432o;
import p190b7.C6667l;
import p190b7.C6678p0;
import p190b7.C6690r;

/* renamed from: v3.u */
/* compiled from: DefaultHttpDataSource */
public class C5849u extends C5803g {

    /* renamed from: e */
    private final boolean f28959e;

    /* renamed from: f */
    private final int f28960f;

    /* renamed from: g */
    private final int f28961g;

    /* renamed from: h */
    private final String f28962h;

    /* renamed from: i */
    private final C5796d0 f28963i;

    /* renamed from: j */
    private final C5796d0 f28964j;

    /* renamed from: k */
    private final boolean f28965k;

    /* renamed from: l */
    private C6432o<String> f28966l;

    /* renamed from: m */
    private C5837p f28967m;

    /* renamed from: n */
    private HttpURLConnection f28968n;

    /* renamed from: o */
    private InputStream f28969o;

    /* renamed from: p */
    private boolean f28970p;

    /* renamed from: q */
    private int f28971q;

    /* renamed from: r */
    private long f28972r;

    /* renamed from: s */
    private long f28973s;

    /* renamed from: v3.u$b */
    /* compiled from: DefaultHttpDataSource */
    public static final class C5851b implements C5828l.C5829a {

        /* renamed from: a */
        private final C5796d0 f28974a = new C5796d0();

        /* renamed from: b */
        private C5840p0 f28975b;

        /* renamed from: c */
        private C6432o<String> f28976c;

        /* renamed from: d */
        private String f28977d;

        /* renamed from: e */
        private int f28978e = 8000;

        /* renamed from: f */
        private int f28979f = 8000;

        /* renamed from: g */
        private boolean f28980g;

        /* renamed from: h */
        private boolean f28981h;

        /* renamed from: b */
        public C5849u mo20353a() {
            C5849u uVar = new C5849u(this.f28977d, this.f28978e, this.f28979f, this.f28980g, this.f28974a, this.f28976c, this.f28981h);
            C5840p0 p0Var = this.f28975b;
            if (p0Var != null) {
                uVar.mo6818n(p0Var);
            }
            return uVar;
        }

        /* renamed from: c */
        public C5851b mo20393c(boolean z) {
            this.f28980g = z;
            return this;
        }

        /* renamed from: d */
        public final C5851b mo20394d(Map<String, String> map) {
            this.f28974a.mo20314a(map);
            return this;
        }

        /* renamed from: e */
        public C5851b mo20395e(String str) {
            this.f28977d = str;
            return this;
        }
    }

    /* renamed from: v3.u$c */
    /* compiled from: DefaultHttpDataSource */
    private static class C5852c extends C6667l<String, List<String>> {

        /* renamed from: a */
        private final Map<String, List<String>> f28982a;

        public C5852c(Map<String, List<String>> map) {
            this.f28982a = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static /* synthetic */ boolean m34717j(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static /* synthetic */ boolean m34718k(String str) {
            return str != null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<String, List<String>> mo20396b() {
            return this.f28982a;
        }

        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return super.mo22480d(obj);
        }

        public Set<Map.Entry<String, List<String>>> entrySet() {
            return C6678p0.m38427b(super.entrySet(), C12806w.f46817a);
        }

        public boolean equals(Object obj) {
            return obj != null && super.mo22481e(obj);
        }

        public int hashCode() {
            return super.mo22482f();
        }

        /* renamed from: i */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        public boolean isEmpty() {
            if (!super.isEmpty()) {
                return super.size() == 1 && super.containsKey((Object) null);
            }
            return true;
        }

        public Set<String> keySet() {
            return C6678p0.m38427b(super.keySet(), C12805v.f46816a);
        }

        public int size() {
            return super.size() - (super.containsKey((Object) null) ? 1 : 0);
        }
    }

    /* renamed from: B */
    private int m34698B(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f28972r;
        if (j != -1) {
            long j2 = j - this.f28973s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j2);
        }
        int read = ((InputStream) C5953m0.m35138j(this.f28969o)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f28973s += (long) read;
        mo20325q(read);
        return read;
    }

    /* renamed from: C */
    private void m34699C(long j, C5837p pVar) throws IOException {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                int read = ((InputStream) C5953m0.m35138j(this.f28969o)).read(bArr, 0, (int) Math.min(j, (long) 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new C5788a0((IOException) new InterruptedIOException(), pVar, (int) AdError.SERVER_ERROR_CODE, 1);
                } else if (read != -1) {
                    j -= (long) read;
                    mo20325q(read);
                } else {
                    throw new C5788a0(pVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
                }
            }
        }
    }

    /* renamed from: u */
    private void m34700u() {
        HttpURLConnection httpURLConnection = this.f28968n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C5961r.m35210d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f28968n = null;
        }
    }

    /* renamed from: v */
    private URL m34701v(URL url, String str, C5837p pVar) throws C5788a0 {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new C5788a0("Unsupported protocol redirect: " + protocol, pVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
                } else if (this.f28959e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new C5788a0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", pVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
                }
            } catch (MalformedURLException e) {
                throw new C5788a0((IOException) e, pVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        } else {
            throw new C5788a0("Null location redirect", pVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    /* renamed from: w */
    private static boolean m34702w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* renamed from: x */
    private HttpURLConnection m34703x(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection A = mo20391A(url);
        A.setConnectTimeout(this.f28960f);
        A.setReadTimeout(this.f28961g);
        HashMap hashMap = new HashMap();
        C5796d0 d0Var = this.f28963i;
        if (d0Var != null) {
            hashMap.putAll(d0Var.mo20315b());
        }
        hashMap.putAll(this.f28964j.mo20315b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            A.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a = C5797e0.m34533a(j, j2);
        if (a != null) {
            A.setRequestProperty("Range", a);
        }
        String str = this.f28962h;
        if (str != null) {
            A.setRequestProperty("User-Agent", str);
        }
        A.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        A.setInstanceFollowRedirects(z2);
        A.setDoOutput(bArr != null);
        A.setRequestMethod(C5837p.m34634c(i));
        if (bArr != null) {
            A.setFixedLengthStreamingMode(bArr.length);
            A.connect();
            OutputStream outputStream = A.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            A.connect();
        }
        return A;
    }

    /* renamed from: y */
    private HttpURLConnection m34704y(C5837p pVar) throws IOException {
        HttpURLConnection x;
        C5837p pVar2 = pVar;
        URL url = new URL(pVar2.f28881a.toString());
        int i = pVar2.f28883c;
        byte[] bArr = pVar2.f28884d;
        long j = pVar2.f28887g;
        long j2 = pVar2.f28888h;
        boolean d = pVar2.mo20368d(1);
        if (!this.f28959e && !this.f28965k) {
            return m34703x(url, i, bArr, j, j2, d, true, pVar2.f28885e);
        }
        URL url2 = url;
        int i2 = i;
        byte[] bArr2 = bArr;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                long j3 = j;
                int i5 = i2;
                long j4 = j;
                int i6 = i4;
                URL url3 = url2;
                long j5 = j2;
                x = m34703x(url2, i2, bArr2, j3, j2, d, false, pVar2.f28885e);
                int responseCode = x.getResponseCode();
                String headerField = x.getHeaderField("Location");
                if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    x.disconnect();
                    url2 = m34701v(url3, headerField, pVar2);
                    i2 = i5;
                } else if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return x;
                } else {
                    x.disconnect();
                    if (!(this.f28965k && responseCode == 302)) {
                        bArr2 = null;
                        i2 = 1;
                    } else {
                        i2 = i5;
                    }
                    url2 = m34701v(url3, headerField, pVar2);
                }
                i3 = i6;
                j = j4;
                j2 = j5;
            } else {
                throw new C5788a0((IOException) new NoRouteToHostException("Too many redirects: " + i4), pVar2, (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        }
        return x;
    }

    /* renamed from: z */
    private static void m34705z(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = C5953m0.f29110a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) C5917a.m34872e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public HttpURLConnection mo20391A(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    public void close() throws C5788a0 {
        try {
            InputStream inputStream = this.f28969o;
            if (inputStream != null) {
                long j = this.f28972r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f28973s;
                }
                m34705z(this.f28968n, j2);
                inputStream.close();
            }
            this.f28969o = null;
            m34700u();
            if (this.f28970p) {
                this.f28970p = false;
                mo20326r();
            }
        } catch (IOException e) {
            throw new C5788a0(e, (C5837p) C5953m0.m35138j(this.f28967m), (int) AdError.SERVER_ERROR_CODE, 3);
        } catch (Throwable th) {
            this.f28969o = null;
            m34700u();
            if (this.f28970p) {
                this.f28970p = false;
                mo20326r();
            }
            throw th;
        }
    }

    /* renamed from: i */
    public Map<String, List<String>> mo6816i() {
        HttpURLConnection httpURLConnection = this.f28968n;
        if (httpURLConnection == null) {
            return C6690r.m38472k();
        }
        return new C5852c(httpURLConnection.getHeaderFields());
    }

    /* renamed from: m */
    public Uri mo6817m() {
        HttpURLConnection httpURLConnection = this.f28968n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: o */
    public long mo6819o(C5837p pVar) throws C5788a0 {
        byte[] bArr;
        this.f28967m = pVar;
        long j = 0;
        this.f28973s = 0;
        this.f28972r = 0;
        mo20327s(pVar);
        try {
            HttpURLConnection y = m34704y(pVar);
            this.f28968n = y;
            this.f28971q = y.getResponseCode();
            String responseMessage = y.getResponseMessage();
            int i = this.f28971q;
            long j2 = -1;
            if (i < 200 || i > 299) {
                Map headerFields = y.getHeaderFields();
                if (this.f28971q == 416) {
                    if (pVar.f28887g == C5797e0.m34535c(y.getHeaderField("Content-Range"))) {
                        this.f28970p = true;
                        mo20328t(pVar);
                        long j3 = pVar.f28888h;
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0;
                    }
                }
                InputStream errorStream = y.getErrorStream();
                if (errorStream != null) {
                    try {
                        bArr = C5953m0.m35109U0(errorStream);
                    } catch (IOException unused) {
                        bArr = C5953m0.f29115f;
                    }
                } else {
                    bArr = C5953m0.f29115f;
                }
                byte[] bArr2 = bArr;
                m34700u();
                throw new C5794c0(this.f28971q, responseMessage, this.f28971q == 416 ? new C5830m(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, pVar, bArr2);
            }
            String contentType = y.getContentType();
            C6432o<String> oVar = this.f28966l;
            if (oVar == null || oVar.apply(contentType)) {
                if (this.f28971q == 200) {
                    long j4 = pVar.f28887g;
                    if (j4 != 0) {
                        j = j4;
                    }
                }
                boolean w = m34702w(y);
                if (!w) {
                    long j5 = pVar.f28888h;
                    if (j5 != -1) {
                        this.f28972r = j5;
                    } else {
                        long b = C5797e0.m34534b(y.getHeaderField("Content-Length"), y.getHeaderField("Content-Range"));
                        if (b != -1) {
                            j2 = b - j;
                        }
                        this.f28972r = j2;
                    }
                } else {
                    this.f28972r = pVar.f28888h;
                }
                try {
                    this.f28969o = y.getInputStream();
                    if (w) {
                        this.f28969o = new GZIPInputStream(this.f28969o);
                    }
                    this.f28970p = true;
                    mo20328t(pVar);
                    try {
                        m34699C(j, pVar);
                        return this.f28972r;
                    } catch (IOException e) {
                        m34700u();
                        if (e instanceof C5788a0) {
                            throw ((C5788a0) e);
                        }
                        throw new C5788a0(e, pVar, (int) AdError.SERVER_ERROR_CODE, 1);
                    }
                } catch (IOException e2) {
                    m34700u();
                    throw new C5788a0(e2, pVar, (int) AdError.SERVER_ERROR_CODE, 1);
                }
            } else {
                m34700u();
                throw new C5791b0(contentType, pVar);
            }
        } catch (IOException e3) {
            m34700u();
            throw C5788a0.m34521c(e3, pVar, 1);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C5788a0 {
        try {
            return m34698B(bArr, i, i2);
        } catch (IOException e) {
            throw C5788a0.m34521c(e, (C5837p) C5953m0.m35138j(this.f28967m), 2);
        }
    }

    private C5849u(String str, int i, int i2, boolean z, C5796d0 d0Var, C6432o<String> oVar, boolean z2) {
        super(true);
        this.f28962h = str;
        this.f28960f = i;
        this.f28961g = i2;
        this.f28959e = z;
        this.f28963i = d0Var;
        this.f28966l = oVar;
        this.f28964j = new C5796d0();
        this.f28965k = z2;
    }
}
