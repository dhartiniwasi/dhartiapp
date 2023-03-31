package p312o8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.firebase.installations.C8001d;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p067i5.C4687a;
import p067i5.C4696j;
import p218e6.C9980l;
import p257i8.C10561i;
import p276k8.C11600b;
import p312o8.C12037d;
import p312o8.C12041f;

/* renamed from: o8.c */
/* compiled from: FirebaseInstallationServiceClient */
public class C12036c {

    /* renamed from: d */
    private static final Pattern f45026d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    private static final Charset f45027e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f45028a;

    /* renamed from: b */
    private final C11600b<C10561i> f45029b;

    /* renamed from: c */
    private final C12040e f45030c = new C12040e();

    public C12036c(Context context, C11600b<C10561i> bVar) {
        this.f45028a = context;
        this.f45029b = bVar;
    }

    /* renamed from: a */
    private static String m57947a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m57948b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.2");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private static JSONObject m57949c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    private String m57950f() {
        try {
            Context context = this.f45028a;
            byte[] a = C4687a.m30364a(context, context.getPackageName());
            if (a != null) {
                return C4696j.m30403c(a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f45028a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f45028a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: g */
    private URL m57951g(String str) throws C8001d {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new C8001d(e.getMessage(), C8001d.C8002a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m57952h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    private static boolean m57953i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    private static void m57954j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    private static void m57955k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String o = m57959o(httpURLConnection);
        if (!TextUtils.isEmpty(o)) {
            Log.w("Firebase-Installations", o);
            Log.w("Firebase-Installations", m57947a(str, str2, str3));
        }
    }

    /* renamed from: l */
    private HttpURLConnection m57956l(URL url, String str) throws C8001d {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f45028a.getPackageName());
            C10561i iVar = this.f45029b.get();
            if (iVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) C9980l.m51027a(iVar.mo33753a()));
                } catch (ExecutionException e) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m57950f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C8001d("Firebase Installations Service is unavailable. Please try again later.", C8001d.C8002a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    static long m57957m(String str) {
        C4141r.m28212b(f45026d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: n */
    private C12037d m57958n(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f45027e));
        C12041f.C12042a a = C12041f.m57984a();
        C12037d.C12038a a2 = C12037d.m57966a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(MediationMetaData.KEY_NAME)) {
                a2.mo36401f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo36398c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo36399d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo36410c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo36411d(m57957m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo36397b(a.mo36408a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.mo36400e(C12037d.C12039b.OK).mo36396a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m57959o(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f45027e
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p312o8.C12036c.m57959o(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: p */
    private C12041f m57960p(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f45027e));
        C12041f.C12042a a = C12041f.m57984a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo36410c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo36411d(m57957m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.mo36409b(C12041f.C12043b.OK).mo36408a();
    }

    /* renamed from: q */
    private void m57961q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        m57963s(httpURLConnection, m57952h(m57948b(str, str2)));
    }

    /* renamed from: r */
    private void m57962r(HttpURLConnection httpURLConnection) throws IOException {
        m57963s(httpURLConnection, m57952h(m57949c()));
    }

    /* renamed from: s */
    private static void m57963s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* renamed from: d */
    public C12037d mo36412d(String str, String str2, String str3, String str4, String str5) throws C8001d {
        C12037d n;
        if (this.f45030c.mo36414b()) {
            int i = 0;
            URL g = m57951g(String.format("projects/%s/installations", new Object[]{str3}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l = m57956l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.setDoOutput(true);
                    if (str5 != null) {
                        l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m57961q(l, str2, str4);
                    int responseCode = l.getResponseCode();
                    this.f45030c.mo36415f(responseCode);
                    if (m57953i(responseCode)) {
                        n = m57958n(l);
                    } else {
                        m57955k(l, str4, str, str3);
                        if (responseCode == 429) {
                            throw new C8001d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C8001d.C8002a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m57954j();
                            n = C12037d.m57966a().mo36400e(C12037d.C12039b.BAD_CONFIG).mo36396a();
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return n;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new C8001d("Firebase Installations Service is unavailable. Please try again later.", C8001d.C8002a.UNAVAILABLE);
        }
        throw new C8001d("Firebase Installations Service is unavailable. Please try again later.", C8001d.C8002a.UNAVAILABLE);
    }

    /* renamed from: e */
    public C12041f mo36413e(String str, String str2, String str3, String str4) throws C8001d {
        C12041f p;
        if (this.f45030c.mo36414b()) {
            int i = 0;
            URL g = m57951g(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l = m57956l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l.setDoOutput(true);
                    m57962r(l);
                    int responseCode = l.getResponseCode();
                    this.f45030c.mo36415f(responseCode);
                    if (m57953i(responseCode)) {
                        p = m57960p(l);
                    } else {
                        m57955k(l, (String) null, str, str3);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new C8001d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C8001d.C8002a.TOO_MANY_REQUESTS);
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    m57954j();
                                    p = C12041f.m57984a().mo36409b(C12041f.C12043b.BAD_CONFIG).mo36408a();
                                } else {
                                    l.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i++;
                                }
                            }
                        }
                        p = C12041f.m57984a().mo36409b(C12041f.C12043b.AUTH_ERROR).mo36408a();
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return p;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new C8001d("Firebase Installations Service is unavailable. Please try again later.", C8001d.C8002a.UNAVAILABLE);
        }
        throw new C8001d("Firebase Installations Service is unavailable. Please try again later.", C8001d.C8002a.UNAVAILABLE);
    }
}
