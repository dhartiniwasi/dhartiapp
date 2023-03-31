package p383vn.hunghd.flutterdownloader;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import androidx.core.app.C0651l;
import androidx.core.app.C0665o;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import org.json.JSONException;
import org.json.JSONObject;
import p186ac.C6555j;
import p186ac.C6556k;
import p243gd.C10349s;
import p264io.flutter.embedding.engine.C10685a;
import p264io.flutter.view.FlutterCallbackInformation;
import p297mb.C11877a;
import p315ob.C12051a;
import p354se.C12518a;
import p354se.C12520c;
import p354se.C12521d;
import p354se.C12522e;
import p354se.C12523f;
import p354se.C12527i;
import p354se.C12528j;
import p354se.C12529k;

/* renamed from: vn.hunghd.flutterdownloader.DownloadWorker */
/* compiled from: DownloadWorker.kt */
public final class DownloadWorker extends Worker implements C6556k.C6560c {

    /* renamed from: J */
    public static final C12897a f47077J = new C12897a((C11665g) null);

    /* renamed from: K */
    private static final String f47078K = DownloadWorker.class.getSimpleName();

    /* renamed from: L */
    private static final AtomicBoolean f47079L = new AtomicBoolean(false);

    /* renamed from: M */
    private static final ArrayDeque<List<Object>> f47080M = new ArrayDeque<>();

    /* renamed from: N */
    private static C10685a f47081N;

    /* renamed from: O */
    private static final HostnameVerifier f47082O = C12523f.f46007a;

    /* renamed from: A */
    private String f47083A;

    /* renamed from: B */
    private String f47084B;

    /* renamed from: C */
    private String f47085C;

    /* renamed from: D */
    private String f47086D;

    /* renamed from: E */
    private String f47087E;

    /* renamed from: F */
    private String f47088F;

    /* renamed from: G */
    private long f47089G;

    /* renamed from: H */
    private int f47090H;

    /* renamed from: I */
    private boolean f47091I;

    /* renamed from: g */
    private final Pattern f47092g = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)");

    /* renamed from: h */
    private final Pattern f47093h = Pattern.compile("(?i)\\bfilename\\*=([^']+)'([^']*)'\"?([^\"]+)\"?");

    /* renamed from: i */
    private final Pattern f47094i = Pattern.compile("(?i)\\bfilename=\"?([^\"]+)\"?");

    /* renamed from: r */
    private C6556k f47095r;

    /* renamed from: s */
    private C12529k f47096s;

    /* renamed from: t */
    private C12528j f47097t;

    /* renamed from: u */
    private boolean f47098u;

    /* renamed from: v */
    private boolean f47099v;

    /* renamed from: w */
    private boolean f47100w;

    /* renamed from: x */
    private boolean f47101x;

    /* renamed from: y */
    private int f47102y;

    /* renamed from: z */
    private int f47103z;

    /* renamed from: vn.hunghd.flutterdownloader.DownloadWorker$a */
    /* compiled from: DownloadWorker.kt */
    public static final class C12897a {

        /* renamed from: vn.hunghd.flutterdownloader.DownloadWorker$a$a */
        /* compiled from: DownloadWorker.kt */
        public static final class C12898a implements X509TrustManager {

            /* renamed from: a */
            final /* synthetic */ String f47104a;

            C12898a(String str) {
                this.f47104a = str;
            }

            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                C11669k.m56787e(x509CertificateArr, "chain");
                C11669k.m56787e(str, "authType");
                Log.i(this.f47104a, "checkClientTrusted");
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                C11669k.m56787e(x509CertificateArr, "chain");
                C11669k.m56787e(str, "authType");
                Log.i(this.f47104a, "checkServerTrusted");
            }

            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }

        private C12897a() {
        }

        public /* synthetic */ C12897a(C11665g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m61003b() {
            TrustManager[] trustManagerArr = {new C12898a("trustAllHosts")};
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                C11669k.m56786d(instance, "getInstance(\"TLS\")");
                instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: vn.hunghd.flutterdownloader.DownloadWorker$b */
    /* compiled from: DownloadWorker.kt */
    public /* synthetic */ class C12899b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47105a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                se.a[] r0 = p354se.C12518a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                se.a r1 = p354se.C12518a.RUNNING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                se.a r1 = p354se.C12518a.CANCELED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                se.a r1 = p354se.C12518a.FAILED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                se.a r1 = p354se.C12518a.PAUSED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                se.a r1 = p354se.C12518a.COMPLETE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f47105a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p383vn.hunghd.flutterdownloader.DownloadWorker.C12899b.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C11669k.m56787e(context, "context");
        C11669k.m56787e(workerParameters, "params");
        new Handler(context.getMainLooper()).post(new C12521d(this, context));
    }

    /* renamed from: A */
    private final void m60976A(Context context) {
        C12051a i;
        synchronized (f47079L) {
            if (f47081N == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("vn.hunghd.downloader.pref", 0);
                C11669k.m56786d(sharedPreferences, "context.getSharedPrefere…PRIVATE\n                )");
                long j = sharedPreferences.getLong("callback_dispatcher_handle_key", 0);
                f47081N = new C10685a(getApplicationContext(), (String[]) null, false);
                FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j);
                if (lookupCallbackInformation == null) {
                    m60995t("Fatal: failed to find callback");
                    return;
                }
                String i2 = C11877a.m57376e().mo36134c().mo36742i();
                C11669k.m56786d(i2, "instance().flutterLoader().findAppBundlePath()");
                AssetManager assets = getApplicationContext().getAssets();
                C10685a aVar = f47081N;
                if (!(aVar == null || (i = aVar.mo34072i()) == null)) {
                    i.mo36419i(new C12051a.C12053b(assets, i2, lookupCallbackInformation));
                }
            }
            C10349s sVar = C10349s.f40964a;
            C10685a aVar2 = f47081N;
            C11669k.m56784b(aVar2);
            C6556k kVar = new C6556k(aVar2.mo34072i(), "vn.hunghd/downloader_background");
            this.f47095r = kVar;
            kVar.mo22161e(this);
        }
    }

    /* renamed from: B */
    private final void m60977B(Context context, String str, C12518a aVar, int i, PendingIntent pendingIntent, boolean z) {
        m60997v(aVar, i);
        if (this.f47098u) {
            C0651l.C0659e D = new C0651l.C0659e(context, "FLUTTER_DOWNLOADER_NOTIFICATION").mo2944q(str).mo2942o(pendingIntent).mo2918C(true).mo2938k(true).mo2919D(-1);
            C11669k.m56786d(D, "Builder(context, CHANNEL…ationCompat.PRIORITY_LOW)");
            int i2 = C12899b.f47105a[aVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    D.mo2943p(this.f47085C).mo2920E(0, 0, false);
                    D.mo2917B(false).mo2922G(17301634);
                } else if (i2 == 3) {
                    D.mo2943p(this.f47086D).mo2920E(0, 0, false);
                    D.mo2917B(false).mo2922G(17301634);
                } else if (i2 == 4) {
                    D.mo2943p(this.f47087E).mo2920E(0, 0, false);
                    D.mo2917B(false).mo2922G(17301634);
                } else if (i2 != 5) {
                    D.mo2920E(0, 0, false);
                    D.mo2917B(false).mo2922G(m60992q());
                } else {
                    D.mo2943p(this.f47088F).mo2920E(0, 0, false);
                    D.mo2917B(false).mo2922G(17301634);
                }
            } else if (i <= 0) {
                D.mo2943p(this.f47083A).mo2920E(0, 0, false);
                D.mo2917B(false).mo2922G(m60992q());
            } else if (i < 100) {
                D.mo2943p(this.f47084B).mo2920E(100, i, false);
                D.mo2917B(true).mo2922G(17301633);
            } else {
                D.mo2943p(this.f47088F).mo2920E(0, 0, false);
                D.mo2917B(false).mo2922G(17301634);
            }
            if (System.currentTimeMillis() - this.f47089G < 1000) {
                if (z) {
                    m60995t("Update too frequently!!!!, but it is the final update, we should sleep a second to ensure the update call can be processed");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    m60995t("Update too frequently!!!!, this should be dropped");
                    return;
                }
            }
            m60995t("Update notification: {notificationId: " + this.f47103z + ", title: " + str + ", status: " + aVar + ", progress: " + i + '}');
            C0665o.m3094e(context).mo2969g(this.f47103z, D.mo2932c());
            this.f47089G = System.currentTimeMillis();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m60981e(String str, SSLSession sSLSession) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m60982g(DownloadWorker downloadWorker, Context context) {
        C11669k.m56787e(downloadWorker, "this$0");
        C11669k.m56787e(context, "$context");
        downloadWorker.m60976A(context);
    }

    /* renamed from: h */
    private final void m60983h(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (!(str6 == null || str5 == null || str4 == null)) {
            if (C13010n.m61260n(str6, "image/", false, 2, (Object) null)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("title", str4);
                contentValues.put("_display_name", str4);
                contentValues.put("description", "");
                contentValues.put("mime_type", str6);
                contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("_data", str5);
                m60995t("insert " + contentValues + " to MediaStore");
                getApplicationContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            } else {
                String str7 = " to MediaStore";
                if (C13010n.m61260n(str6, "video", false, 2, (Object) null)) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("title", str4);
                    contentValues2.put("_display_name", str4);
                    contentValues2.put("description", "");
                    contentValues2.put("mime_type", str6);
                    contentValues2.put("date_added", Long.valueOf(System.currentTimeMillis()));
                    contentValues2.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                    contentValues2.put("_data", str5);
                    m60995t("insert " + contentValues2 + str7);
                    getApplicationContext().getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues2);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: i */
    private final void m60984i() {
        C12528j jVar = this.f47097t;
        C11669k.m56784b(jVar);
        String uuid = getId().toString();
        C11669k.m56786d(uuid, "id.toString()");
        C12520c d = jVar.mo37333d(uuid);
        if (d != null && d.mo37321l() != C12518a.COMPLETE && !d.mo37316h()) {
            String b = d.mo37309b();
            if (b == null) {
                b = d.mo37324o().substring(C13011o.m61265E(d.mo37324o(), "/", 0, false, 6, (Object) null) + 1, d.mo37324o().length());
                C11669k.m56786d(b, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            File file = new File(d.mo37319j() + File.separator + b);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* renamed from: j */
    private final File m60985j(String str, String str2) {
        File file = new File(str2, str);
        try {
            if (file.createNewFile()) {
                return file;
            }
            m60996u("It looks like you are trying to save file in public storage but not setting 'saveInPublicStorage' to 'true'");
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            m60996u("Create a file using java.io API failed ");
            return null;
        }
    }

    /* renamed from: k */
    private final Uri m60986k(String str, String str2) {
        Uri uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        C11669k.m56786d(uri, "EXTERNAL_CONTENT_URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        try {
            return getApplicationContext().getContentResolver().insert(uri, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
            m60996u("Create a file using MediaStore API failed.");
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v15, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v16, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v17, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v56, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v58, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX WARNING: type inference failed for: r34v13 */
    /* JADX WARNING: type inference failed for: r34v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0528, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0529, code lost:
        r1 = r0;
        r16 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x052d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x052e, code lost:
        r12 = r0;
        r11 = r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0223 A[SYNTHETIC, Splitter:B:102:0x0223] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0273 A[SYNTHETIC, Splitter:B:118:0x0273] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f5 A[Catch:{ IOException -> 0x0400, all -> 0x03fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0305 A[Catch:{ IOException -> 0x0400, all -> 0x03fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x030c A[Catch:{ IOException -> 0x0400, all -> 0x03fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0321 A[Catch:{ IOException -> 0x0400, all -> 0x03fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0330 A[Catch:{ IOException -> 0x0400, all -> 0x03fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0341 A[Catch:{ IOException -> 0x0400, all -> 0x03fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03f1 A[Catch:{ IOException -> 0x0400, all -> 0x03fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03f2 A[Catch:{ IOException -> 0x0400, all -> 0x03fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04b0 A[SYNTHETIC, Splitter:B:239:0x04b0] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0528 A[ExcHandler: all (r0v10 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r11 
      PHI: (r11v11 java.net.HttpURLConnection) = (r11v14 java.net.HttpURLConnection), (r11v14 java.net.HttpURLConnection), (r11v42 java.net.HttpURLConnection), (r11v45 java.net.HttpURLConnection), (r11v47 java.net.HttpURLConnection), (r11v49 java.net.HttpURLConnection), (r11v50 java.net.HttpURLConnection), (r11v51 java.net.HttpURLConnection), (r11v54 java.net.HttpURLConnection) binds: [B:254:0x04d5, B:255:?, B:25:0x00a7, B:89:0x01e0, B:90:?, B:57:0x0162, B:82:0x01c2, B:83:?, B:49:0x0111] A[DONT_GENERATE, DONT_INLINE], Splitter:B:25:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x056e A[Catch:{ all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0571 A[Catch:{ all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x058f A[SYNTHETIC, Splitter:B:296:0x058f] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x05af A[SYNTHETIC, Splitter:B:310:0x05af] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x02ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0188 A[Catch:{ IOException -> 0x052d, all -> 0x0528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018f A[Catch:{ IOException -> 0x052d, all -> 0x0528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019b A[Catch:{ IOException -> 0x052d, all -> 0x0528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e0 A[SYNTHETIC, Splitter:B:89:0x01e0] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f6 A[SYNTHETIC, Splitter:B:95:0x01f6] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m60987l(android.content.Context r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, int r34) {
        /*
            r27 = this;
            r8 = r27
            r1 = r30
            r9 = r31
            r2 = r34
            java.lang.String r10 = "id.toString()"
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            se.j r4 = r8.f47097t     // Catch:{ IOException -> 0x054e, all -> 0x0546 }
            if (r4 == 0) goto L_0x0023
            java.util.UUID r5 = r27.getId()     // Catch:{ IOException -> 0x054e, all -> 0x0546 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x054e, all -> 0x0546 }
            kotlin.jvm.internal.C11669k.m56786d(r5, r10)     // Catch:{ IOException -> 0x054e, all -> 0x0546 }
            se.c r4 = r4.mo37333d(r5)     // Catch:{ IOException -> 0x054e, all -> 0x0546 }
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            if (r4 == 0) goto L_0x002c
            int r4 = r4.mo37315g()     // Catch:{ IOException -> 0x054e, all -> 0x0546 }
            r8.f47102y = r4     // Catch:{ IOException -> 0x054e, all -> 0x0546 }
        L_0x002c:
            r4 = 0
            r6 = r29
            r7 = 0
        L_0x0031:
            boolean r12 = r3.containsKey(r6)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            r15 = 1
            if (r12 != 0) goto L_0x0041
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            r3.put(r6, r12)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            r12 = 1
            goto L_0x004f
        L_0x0041:
            java.lang.Object r12 = r3.get(r6)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            kotlin.jvm.internal.C11669k.m56784b(r12)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            int r12 = r12.intValue()     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            int r12 = r12 + r15
        L_0x004f:
            r13 = 3
            if (r12 > r13) goto L_0x0532
            java.net.URL r12 = new java.net.URL     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            r12.<init>(r6)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            boolean r13 = r8.f47101x     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            java.lang.String r14 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            if (r13 == 0) goto L_0x009e
            vn.hunghd.flutterdownloader.DownloadWorker$a r13 = f47077J     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            r13.m61003b()     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            java.lang.String r13 = r12.getProtocol()     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            java.lang.String r11 = "resourceUrl.protocol"
            kotlin.jvm.internal.C11669k.m56786d(r13, r11)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            java.lang.String r15 = "US"
            kotlin.jvm.internal.C11669k.m56786d(r11, r15)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            java.lang.String r11 = r13.toLowerCase(r11)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            java.lang.String r13 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C11669k.m56786d(r11, r13)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            java.lang.String r13 = "https"
            boolean r11 = kotlin.jvm.internal.C11669k.m56783a(r11, r13)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            if (r11 == 0) goto L_0x0092
            java.net.URLConnection r11 = r12.openConnection()     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            kotlin.jvm.internal.C11669k.m56785c(r11, r14)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            javax.net.ssl.HttpsURLConnection r11 = (javax.net.ssl.HttpsURLConnection) r11     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            javax.net.ssl.HostnameVerifier r12 = f47082O     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            r11.setHostnameVerifier(r12)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            goto L_0x00a7
        L_0x0092:
            java.net.URLConnection r11 = r12.openConnection()     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            java.lang.String r12 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            kotlin.jvm.internal.C11669k.m56785c(r11, r12)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            goto L_0x00a7
        L_0x009e:
            java.net.URLConnection r11 = r12.openConnection()     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            kotlin.jvm.internal.C11669k.m56785c(r11, r14)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            javax.net.ssl.HttpsURLConnection r11 = (javax.net.ssl.HttpsURLConnection) r11     // Catch:{ IOException -> 0x0540, all -> 0x053a }
        L_0x00a7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r7.<init>()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r12 = "Open connection to "
            r7.append(r12)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r7.append(r6)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r8.m60995t(r7)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r11.setConnectTimeout(r2)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r11.setReadTimeout(r2)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r7 = 0
            r11.setInstanceFollowRedirects(r7)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r12 = "User-Agent"
            java.lang.String r13 = "Mozilla/5.0..."
            r11.setRequestProperty(r12, r13)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r12 = r32
            r8.m60999x(r11, r12)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            if (r33 == 0) goto L_0x00d7
            long r4 = r8.m61001z(r11, r9, r1)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
        L_0x00d7:
            r19 = r4
            int r13 = r11.getResponseCode()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r4 = 307(0x133, float:4.3E-43)
            if (r13 == r4) goto L_0x04ca
            r4 = 308(0x134, float:4.32E-43)
            if (r13 == r4) goto L_0x04ca
            switch(r13) {
                case 301: goto L_0x04ca;
                case 302: goto L_0x04ca;
                case 303: goto L_0x04ca;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            r11.connect()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r2 = 200(0xc8, float:2.8E-43)
            java.lang.String r21 = "Download canceled"
            if (r13 == r2) goto L_0x00fc
            if (r33 == 0) goto L_0x00f8
            r2 = 206(0xce, float:2.89E-43)
            if (r13 != r2) goto L_0x00f8
            goto L_0x00fc
        L_0x00f8:
            r16 = r11
            goto L_0x042e
        L_0x00fc:
            boolean r2 = r27.isStopped()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            if (r2 != 0) goto L_0x00f8
            java.lang.String r5 = r11.getContentType()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            java.lang.String r2 = "httpConn.contentType"
            kotlin.jvm.internal.C11669k.m56786d(r5, r2)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r3 = 24
            if (r2 < r3) goto L_0x0116
            long r2 = r11.getContentLengthLong()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            goto L_0x011b
        L_0x0116:
            int r2 = r11.getContentLength()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            long r2 = (long) r2     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
        L_0x011b:
            r3 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r2.<init>()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            java.lang.String r12 = "Content-Type = "
            r2.append(r12)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r2.append(r5)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r8.m60995t(r2)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r2.<init>()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            java.lang.String r12 = "Content-Length = "
            r2.append(r12)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r2.append(r3)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r8.m60995t(r2)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            java.lang.String r2 = r8.m60988m(r5)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r12.<init>()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            java.lang.String r13 = "Charset = "
            r12.append(r13)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r12.append(r2)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r8.m60995t(r12)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            if (r33 != 0) goto L_0x01c7
            if (r9 != 0) goto L_0x01c7
            java.lang.String r12 = "Content-Disposition"
            java.lang.String r12 = r11.getHeaderField(r12)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r13.<init>()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r14 = "Content-Disposition = "
            r13.append(r14)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r13.append(r12)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r8.m60995t(r13)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            if (r12 == 0) goto L_0x0185
            int r13 = r12.length()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            if (r13 != 0) goto L_0x0183
            goto L_0x0185
        L_0x0183:
            r13 = 0
            goto L_0x0186
        L_0x0185:
            r13 = 1
        L_0x0186:
            if (r13 != 0) goto L_0x018d
            java.lang.String r2 = r8.m60990o(r12, r2)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r9 = r2
        L_0x018d:
            if (r9 == 0) goto L_0x0198
            int r2 = r9.length()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            if (r2 != 0) goto L_0x0196
            goto L_0x0198
        L_0x0196:
            r2 = 0
            goto L_0x0199
        L_0x0198:
            r2 = 1
        L_0x0199:
            if (r2 == 0) goto L_0x01c7
            java.lang.String r13 = "/"
            r14 = 0
            r15 = 0
            r2 = 6
            r17 = 0
            r12 = r6
            r7 = 1
            r16 = r2
            int r2 = p401xd.C13011o.m61265E(r12, r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            int r2 = r2 + r7
            java.lang.String r2 = r6.substring(r2)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r6 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.C11669k.m56786d(r2, r6)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r6 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r6)     // Catch:{ IllegalArgumentException -> 0x01c0 }
            goto L_0x01c5
        L_0x01bb:
            r0 = move-exception
            r12 = r0
            r9 = r2
            goto L_0x052f
        L_0x01c0:
            r0 = move-exception
            r6 = r0
            r6.printStackTrace()     // Catch:{ IOException -> 0x01bb, all -> 0x0528 }
        L_0x01c5:
            r9 = r2
            goto L_0x01c8
        L_0x01c7:
            r7 = 1
        L_0x01c8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r2.<init>()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            java.lang.String r6 = "fileName = "
            r2.append(r6)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r2.append(r9)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r8.m60995t(r2)     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            se.j r2 = r8.f47097t     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            if (r2 == 0) goto L_0x01ee
            java.util.UUID r6 = r27.getId()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            kotlin.jvm.internal.C11669k.m56786d(r6, r10)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r2.mo37335g(r6, r9, r5)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
        L_0x01ee:
            java.io.InputStream r12 = r11.getInputStream()     // Catch:{ IOException -> 0x04c6, all -> 0x04c2 }
            r13 = 29
            if (r33 == 0) goto L_0x0223
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            r2.<init>()     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            r2.append(r1)     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            java.lang.String r1 = java.io.File.separator     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            r2.append(r1)     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            r2.append(r9)     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            r2.<init>(r1, r7)     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            r14 = r1
            r15 = r2
            goto L_0x0259
        L_0x0212:
            r0 = move-exception
            r1 = r0
            r16 = r11
            r18 = r12
            goto L_0x0420
        L_0x021a:
            r0 = move-exception
            r16 = r11
            r18 = r12
            r11 = 0
            r12 = r0
            goto L_0x0555
        L_0x0223:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0423, all -> 0x0418 }
            if (r2 < r13) goto L_0x0243
            boolean r2 = r8.f47091I     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            if (r2 == 0) goto L_0x0243
            android.net.Uri r1 = r8.m60986k(r9, r5)     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            kotlin.jvm.internal.C11669k.m56784b(r1)     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            java.lang.String r2 = r8.m60991p(r1)     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            android.content.ContentResolver r6 = r28.getContentResolver()     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            java.lang.String r7 = "w"
            java.io.OutputStream r1 = r6.openOutputStream(r1, r7)     // Catch:{ IOException -> 0x021a, all -> 0x0212 }
            r15 = r1
            r14 = r2
            goto L_0x0259
        L_0x0243:
            kotlin.jvm.internal.C11669k.m56784b(r9)     // Catch:{ IOException -> 0x0423, all -> 0x0418 }
            java.io.File r1 = r8.m60985j(r9, r1)     // Catch:{ IOException -> 0x0423, all -> 0x0418 }
            kotlin.jvm.internal.C11669k.m56784b(r1)     // Catch:{ IOException -> 0x0423, all -> 0x0418 }
            java.lang.String r2 = r1.getPath()     // Catch:{ IOException -> 0x0423, all -> 0x0418 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0423, all -> 0x0418 }
            r7 = 0
            r6.<init>(r1, r7)     // Catch:{ IOException -> 0x0423, all -> 0x0418 }
            r14 = r2
            r15 = r6
        L_0x0259:
            kotlin.jvm.internal.q r7 = new kotlin.jvm.internal.q     // Catch:{ IOException -> 0x040d, all -> 0x0402 }
            r7.<init>()     // Catch:{ IOException -> 0x040d, all -> 0x0402 }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r1]     // Catch:{ IOException -> 0x040d, all -> 0x0402 }
            r1 = r19
        L_0x0264:
            int r13 = r12.read(r6)     // Catch:{ IOException -> 0x040d, all -> 0x0402 }
            r7.f44240a = r13     // Catch:{ IOException -> 0x040d, all -> 0x0402 }
            r32 = r5
            r5 = -1
            r16 = r11
            r11 = 100
            if (r13 == r5) goto L_0x02ea
            boolean r5 = r27.isStopped()     // Catch:{ IOException -> 0x02e7, all -> 0x02e4 }
            if (r5 != 0) goto L_0x02ea
            int r5 = r7.f44240a     // Catch:{ IOException -> 0x02e7, all -> 0x02e4 }
            r34 = r12
            long r12 = (long) r5
            long r12 = r12 + r1
            long r1 = (long) r11
            long r1 = r1 * r12
            long r23 = r3 + r19
            long r1 = r1 / r23
            int r2 = (int) r1     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r1 = 0
            if (r15 == 0) goto L_0x028d
            r15.write(r6, r1, r5)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
        L_0x028d:
            int r5 = r8.f47102y     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            if (r5 == 0) goto L_0x0298
            int r1 = r8.f47090H     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            int r1 = r1 + r5
            if (r2 > r1) goto L_0x0298
            if (r2 != r11) goto L_0x02cf
        L_0x0298:
            if (r2 == r5) goto L_0x02cf
            r8.f47102y = r2     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            se.j r1 = r8.f47097t     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            kotlin.jvm.internal.C11669k.m56784b(r1)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            java.util.UUID r5 = r27.getId()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            kotlin.jvm.internal.C11669k.m56786d(r5, r10)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            se.a r11 = p354se.C12518a.RUNNING     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r1.mo37337i(r5, r11, r2)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r17 = 0
            r23 = 0
            r22 = 0
            r1 = r27
            r5 = r2
            r2 = r28
            r24 = r3
            r3 = r9
            r4 = r11
            r11 = r32
            r26 = r6
            r6 = r17
            r17 = r7
            r11 = 0
            r7 = r23
            r1.m60977B(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            goto L_0x02d6
        L_0x02cf:
            r24 = r3
            r26 = r6
            r17 = r7
            r11 = 0
        L_0x02d6:
            r5 = r32
            r1 = r12
            r11 = r16
            r7 = r17
            r3 = r24
            r6 = r26
            r12 = r34
            goto L_0x0264
        L_0x02e4:
            r0 = move-exception
            goto L_0x0405
        L_0x02e7:
            r0 = move-exception
            goto L_0x0410
        L_0x02ea:
            r1 = r32
            r34 = r12
            r2 = 100
            r11 = 0
            se.j r3 = r8.f47097t     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            if (r3 == 0) goto L_0x0305
            java.util.UUID r4 = r27.getId()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            kotlin.jvm.internal.C11669k.m56786d(r4, r10)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            se.c r3 = r3.mo37333d(r4)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            goto L_0x0306
        L_0x0305:
            r3 = 0
        L_0x0306:
            boolean r4 = r27.isStopped()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            if (r4 == 0) goto L_0x0319
            kotlin.jvm.internal.C11669k.m56784b(r3)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            boolean r4 = r3.mo37316h()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            if (r4 == 0) goto L_0x0319
            int r2 = r8.f47102y     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r5 = r2
            goto L_0x031b
        L_0x0319:
            r5 = 100
        L_0x031b:
            boolean r2 = r27.isStopped()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            if (r2 == 0) goto L_0x0330
            kotlin.jvm.internal.C11669k.m56784b(r3)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            boolean r2 = r3.mo37316h()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            if (r2 == 0) goto L_0x032d
            se.a r2 = p354se.C12518a.PAUSED     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            goto L_0x0332
        L_0x032d:
            se.a r2 = p354se.C12518a.CANCELED     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            goto L_0x0332
        L_0x0330:
            se.a r2 = p354se.C12518a.COMPLETE     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
        L_0x0332:
            r4 = r2
            android.content.Context r2 = r27.getApplicationContext()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            java.lang.String r3 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r2 = androidx.core.content.C0681a.m3145a(r2, r3)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            se.a r3 = p354se.C12518a.COMPLETE     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            if (r4 != r3) goto L_0x03ce
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r6 = 29
            if (r3 >= r6) goto L_0x035a
            boolean r6 = r8.m60994s(r1)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            if (r6 == 0) goto L_0x035a
            boolean r6 = r8.m60993r(r14)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            if (r6 == 0) goto L_0x035a
            java.lang.String r6 = r8.m60989n(r1)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r8.m60983h(r9, r14, r6)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
        L_0x035a:
            boolean r6 = r8.f47099v     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            if (r6 == 0) goto L_0x03ce
            r6 = 29
            if (r3 >= r6) goto L_0x037f
            if (r2 == 0) goto L_0x037f
            if (r15 == 0) goto L_0x0372
            r15.flush()
            r15.close()     // Catch:{ IOException -> 0x036d }
            goto L_0x0372
        L_0x036d:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x0372:
            r34.close()     // Catch:{ IOException -> 0x0376 }
            goto L_0x037b
        L_0x0376:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x037b:
            r16.disconnect()
            return
        L_0x037f:
            se.h r2 = p354se.C12526h.f46017a     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            android.content.Context r6 = r27.getApplicationContext()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            java.lang.String r7 = "applicationContext"
            kotlin.jvm.internal.C11669k.m56786d(r6, r7)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            kotlin.jvm.internal.C11669k.m56784b(r14)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            android.content.Intent r1 = r2.mo37329c(r6, r14, r1)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            if (r1 == 0) goto L_0x03ba
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r2.<init>()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            java.lang.String r6 = "Setting an intent to open the file "
            r2.append(r6)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r2.append(r14)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r8.m60995t(r2)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r2 = 31
            if (r3 < r2) goto L_0x03ae
            r2 = 335544320(0x14000000, float:6.4623485E-27)
            goto L_0x03b0
        L_0x03ae:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x03b0:
            android.content.Context r3 = r27.getApplicationContext()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r3, r11, r1, r2)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r6 = r1
            goto L_0x03cf
        L_0x03ba:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r1.<init>()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            java.lang.String r2 = "There's no application that can open the file "
            r1.append(r2)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r1.append(r14)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r8.m60995t(r1)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
        L_0x03ce:
            r6 = 0
        L_0x03cf:
            se.j r1 = r8.f47097t     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            kotlin.jvm.internal.C11669k.m56784b(r1)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            java.util.UUID r2 = r27.getId()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            kotlin.jvm.internal.C11669k.m56786d(r2, r10)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r1.mo37337i(r2, r4, r5)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r7 = 1
            r1 = r27
            r2 = r28
            r3 = r9
            r1.m60977B(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            boolean r1 = r27.isStopped()     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            if (r1 == 0) goto L_0x03f2
            goto L_0x03f4
        L_0x03f2:
            java.lang.String r21 = "File downloaded"
        L_0x03f4:
            r1 = r21
            r8.m60995t(r1)     // Catch:{ IOException -> 0x0400, all -> 0x03fe }
            r18 = r34
            r11 = r15
            goto L_0x04a0
        L_0x03fe:
            r0 = move-exception
            goto L_0x0407
        L_0x0400:
            r0 = move-exception
            goto L_0x0412
        L_0x0402:
            r0 = move-exception
            r16 = r11
        L_0x0405:
            r34 = r12
        L_0x0407:
            r18 = r34
            r1 = r0
            r11 = r15
            goto L_0x059f
        L_0x040d:
            r0 = move-exception
            r16 = r11
        L_0x0410:
            r34 = r12
        L_0x0412:
            r18 = r34
            r12 = r0
            r11 = r15
            goto L_0x0555
        L_0x0418:
            r0 = move-exception
            r16 = r11
            r34 = r12
            r18 = r34
            r1 = r0
        L_0x0420:
            r11 = 0
            goto L_0x059f
        L_0x0423:
            r0 = move-exception
            r16 = r11
            r34 = r12
            r18 = r34
            r12 = r0
            r11 = 0
            goto L_0x0555
        L_0x042e:
            se.j r1 = r8.f47097t     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            kotlin.jvm.internal.C11669k.m56784b(r1)     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            java.util.UUID r2 = r27.getId()     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            kotlin.jvm.internal.C11669k.m56786d(r2, r10)     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            se.c r1 = r1.mo37333d(r2)     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            boolean r2 = r27.isStopped()     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            if (r2 == 0) goto L_0x0457
            kotlin.jvm.internal.C11669k.m56784b(r1)     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            boolean r1 = r1.mo37316h()     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            if (r1 == 0) goto L_0x0454
            se.a r1 = p354se.C12518a.PAUSED     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            goto L_0x0459
        L_0x0454:
            se.a r1 = p354se.C12518a.CANCELED     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            goto L_0x0459
        L_0x0457:
            se.a r1 = p354se.C12518a.FAILED     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
        L_0x0459:
            r4 = r1
            se.j r1 = r8.f47097t     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            kotlin.jvm.internal.C11669k.m56784b(r1)     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            java.util.UUID r2 = r27.getId()     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            kotlin.jvm.internal.C11669k.m56786d(r2, r10)     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            int r3 = r8.f47102y     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            r1.mo37337i(r2, r4, r3)     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            if (r9 != 0) goto L_0x0474
            r3 = r29
            goto L_0x0475
        L_0x0474:
            r3 = r9
        L_0x0475:
            r5 = -1
            r6 = 0
            r7 = 1
            r1 = r27
            r2 = r28
            r1.m60977B(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            boolean r1 = r27.isStopped()     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            if (r1 == 0) goto L_0x0488
        L_0x0485:
            r1 = r21
            goto L_0x049a
        L_0x0488:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            r1.<init>()     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            java.lang.String r2 = "Server replied HTTP code: "
            r1.append(r2)     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            r1.append(r13)     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            java.lang.String r21 = r1.toString()     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            goto L_0x0485
        L_0x049a:
            r8.m60995t(r1)     // Catch:{ IOException -> 0x04c0, all -> 0x04be }
            r11 = 0
            r18 = 0
        L_0x04a0:
            if (r11 == 0) goto L_0x04ae
            r11.flush()
            r11.close()     // Catch:{ IOException -> 0x04a9 }
            goto L_0x04ae
        L_0x04a9:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x04ae:
            if (r18 == 0) goto L_0x04b9
            r18.close()     // Catch:{ IOException -> 0x04b4 }
            goto L_0x04b9
        L_0x04b4:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x04b9:
            r16.disconnect()
            goto L_0x059c
        L_0x04be:
            r0 = move-exception
            goto L_0x0521
        L_0x04c0:
            r0 = move-exception
            goto L_0x0526
        L_0x04c2:
            r0 = move-exception
            r16 = r11
            goto L_0x0521
        L_0x04c6:
            r0 = move-exception
            r16 = r11
            goto L_0x0526
        L_0x04ca:
            r16 = r11
            java.lang.String r4 = "Response with redirection code"
            r8.m60995t(r4)     // Catch:{ IOException -> 0x0523, all -> 0x051e }
            java.lang.String r4 = "Location"
            r11 = r16
            java.lang.String r4 = r11.getHeaderField(r4)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r5 = "httpConn.getHeaderField(\"Location\")"
            kotlin.jvm.internal.C11669k.m56786d(r4, r5)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r5.<init>()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r7 = "Location = "
            r5.append(r7)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r5.append(r4)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r8.m60995t(r5)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.net.URL r5 = new java.net.URL     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r6.<init>(r5, r4)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r6 = r6.toExternalForm()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r4 = "next.toExternalForm()"
            kotlin.jvm.internal.C11669k.m56786d(r6, r4)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r4.<init>()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r5 = "New url: "
            r4.append(r5)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r4.append(r6)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r8.m60995t(r4)     // Catch:{ IOException -> 0x052d, all -> 0x0528 }
            r7 = r11
            r4 = r19
            goto L_0x0031
        L_0x051e:
            r0 = move-exception
            r11 = r16
        L_0x0521:
            r1 = r0
            goto L_0x053e
        L_0x0523:
            r0 = move-exception
            r11 = r16
        L_0x0526:
            r12 = r0
            goto L_0x0544
        L_0x0528:
            r0 = move-exception
            r1 = r0
            r16 = r11
            goto L_0x053e
        L_0x052d:
            r0 = move-exception
            r12 = r0
        L_0x052f:
            r16 = r11
            goto L_0x0544
        L_0x0532:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            java.lang.String r2 = "Stuck in redirect loop"
            r1.<init>(r2)     // Catch:{ IOException -> 0x0540, all -> 0x053a }
            throw r1     // Catch:{ IOException -> 0x0540, all -> 0x053a }
        L_0x053a:
            r0 = move-exception
            r1 = r0
            r16 = r7
        L_0x053e:
            r11 = 0
            goto L_0x054b
        L_0x0540:
            r0 = move-exception
            r12 = r0
            r16 = r7
        L_0x0544:
            r11 = 0
            goto L_0x0553
        L_0x0546:
            r0 = move-exception
            r1 = r0
            r11 = 0
            r16 = 0
        L_0x054b:
            r18 = 0
            goto L_0x059f
        L_0x054e:
            r0 = move-exception
            r12 = r0
            r11 = 0
            r16 = 0
        L_0x0553:
            r18 = 0
        L_0x0555:
            se.j r1 = r8.f47097t     // Catch:{ all -> 0x059d }
            kotlin.jvm.internal.C11669k.m56784b(r1)     // Catch:{ all -> 0x059d }
            java.util.UUID r2 = r27.getId()     // Catch:{ all -> 0x059d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x059d }
            kotlin.jvm.internal.C11669k.m56786d(r2, r10)     // Catch:{ all -> 0x059d }
            se.a r4 = p354se.C12518a.FAILED     // Catch:{ all -> 0x059d }
            int r3 = r8.f47102y     // Catch:{ all -> 0x059d }
            r1.mo37337i(r2, r4, r3)     // Catch:{ all -> 0x059d }
            if (r9 != 0) goto L_0x0571
            r3 = r29
            goto L_0x0572
        L_0x0571:
            r3 = r9
        L_0x0572:
            r5 = -1
            r6 = 0
            r7 = 1
            r1 = r27
            r2 = r28
            r1.m60977B(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x059d }
            r12.printStackTrace()     // Catch:{ all -> 0x059d }
            if (r11 == 0) goto L_0x058d
            r11.flush()
            r11.close()     // Catch:{ IOException -> 0x0588 }
            goto L_0x058d
        L_0x0588:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x058d:
            if (r18 == 0) goto L_0x0598
            r18.close()     // Catch:{ IOException -> 0x0593 }
            goto L_0x0598
        L_0x0593:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x0598:
            if (r16 == 0) goto L_0x059c
            goto L_0x04b9
        L_0x059c:
            return
        L_0x059d:
            r0 = move-exception
            r1 = r0
        L_0x059f:
            if (r11 == 0) goto L_0x05ad
            r11.flush()
            r11.close()     // Catch:{ IOException -> 0x05a8 }
            goto L_0x05ad
        L_0x05a8:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x05ad:
            if (r18 == 0) goto L_0x05b8
            r18.close()     // Catch:{ IOException -> 0x05b3 }
            goto L_0x05b8
        L_0x05b3:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x05b8:
            if (r16 == 0) goto L_0x05bd
            r16.disconnect()
        L_0x05bd:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p383vn.hunghd.flutterdownloader.DownloadWorker.m60987l(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void");
    }

    /* renamed from: m */
    private final String m60988m(String str) {
        String group;
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f47092g.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null) {
            return null;
        }
        int length = group.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = C11669k.m56788f(group.charAt(!z ? i : length), 32) <= 0;
            if (!z) {
                if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!z2) {
                break;
            } else {
                length--;
            }
        }
        String obj = group.subSequence(i, length + 1).toString();
        if (obj == null) {
            return null;
        }
        Locale locale = Locale.US;
        C11669k.m56786d(locale, "US");
        String upperCase = obj.toUpperCase(locale);
        C11669k.m56786d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    /* renamed from: n */
    private final String m60989n(String str) {
        List T;
        String str2;
        if (!(str == null || (T = C13011o.m61280T(str, new String[]{";"}, false, 0, 6, (Object) null)) == null)) {
            Object[] array = T.toArray(new String[0]);
            C11669k.m56785c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            if (!(strArr == null || (str2 = strArr[0]) == null)) {
                int length = str2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = C11669k.m56788f(str2.charAt(!z ? i : length), 32) <= 0;
                    if (!z) {
                        if (!z2) {
                            z = true;
                        } else {
                            i++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                return str2.subSequence(i, length + 1).toString();
            }
        }
        return null;
    }

    /* renamed from: o */
    private final String m60990o(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f47094i.matcher(str);
        String group = matcher.find() ? matcher.group(1) : null;
        Matcher matcher2 = this.f47093h.matcher(str);
        if (matcher2.find()) {
            group = matcher2.group(3);
            String group2 = matcher2.group(1);
            if (group2 != null) {
                Locale locale = Locale.US;
                C11669k.m56786d(locale, "US");
                String upperCase = group2.toUpperCase(locale);
                C11669k.m56786d(upperCase, "this as java.lang.String).toUpperCase(locale)");
                str2 = upperCase;
            } else {
                str2 = null;
            }
        }
        if (group == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        return URLDecoder.decode(group, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        p317od.C12114b.m58233a(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        throw r2;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m60991p(android.net.Uri r10) {
        /*
            r9 = this;
            java.lang.String r0 = "_data"
            r1 = 0
            android.content.Context r2 = r9.getApplicationContext()     // Catch:{ IllegalArgumentException -> 0x0038 }
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0038 }
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch:{ IllegalArgumentException -> 0x0038 }
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r10
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ IllegalArgumentException -> 0x0038 }
            if (r10 != 0) goto L_0x001d
            p317od.C12114b.m58233a(r10, r1)     // Catch:{ IllegalArgumentException -> 0x0038 }
            return r1
        L_0x001d:
            boolean r2 = r10.moveToFirst()     // Catch:{ all -> 0x0031 }
            if (r2 != 0) goto L_0x0025
            r0 = r1
            goto L_0x002d
        L_0x0025:
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x0031 }
        L_0x002d:
            p317od.C12114b.m58233a(r10, r1)     // Catch:{ IllegalArgumentException -> 0x0038 }
            return r0
        L_0x0031:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            p317od.C12114b.m58233a(r10, r0)     // Catch:{ IllegalArgumentException -> 0x0038 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0038 }
        L_0x0038:
            r10 = move-exception
            r10.printStackTrace()
            java.lang.String r10 = "Get a path for a MediaStore failed"
            r9.m60996u(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p383vn.hunghd.flutterdownloader.DownloadWorker.m60991p(android.net.Uri):java.lang.String");
    }

    /* renamed from: q */
    private final int m60992q() {
        try {
            ApplicationInfo applicationInfo = getApplicationContext().getPackageManager().getApplicationInfo(getApplicationContext().getPackageName(), 128);
            C11669k.m56786d(applicationInfo, "applicationContext.packa…ATA\n                    )");
            return applicationInfo.metaData.getInt("vn.hunghd.flutterdownloader.NOTIFICATION_ICON", applicationInfo.icon);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: r */
    private final boolean m60993r(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        C11669k.m56786d(externalStorageDirectory, "getExternalStorageDirectory()");
        if (str == null) {
            return false;
        }
        String path = externalStorageDirectory.getPath();
        C11669k.m56786d(path, "externalStorageDir.path");
        if (C13010n.m61260n(str, path, false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private final boolean m60994s(String str) {
        String n = m60989n(str);
        if (n == null) {
            return false;
        }
        if (C13010n.m61260n(n, "image/", false, 2, (Object) null) || C13010n.m61260n(n, "video", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private final void m60995t(String str) {
        if (this.f47100w) {
            Log.d(f47078K, str);
        }
    }

    /* renamed from: u */
    private final void m60996u(String str) {
        if (this.f47100w) {
            Log.e(f47078K, str);
        }
    }

    /* renamed from: v */
    private final void m60997v(C12518a aVar, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(getInputData().mo6305k("callback_handle", 0)));
        String uuid = getId().toString();
        C11669k.m56786d(uuid, "id.toString()");
        arrayList.add(uuid);
        arrayList.add(Integer.valueOf(aVar.ordinal()));
        arrayList.add(Integer.valueOf(i));
        AtomicBoolean atomicBoolean = f47079L;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                f47080M.add(arrayList);
            } else {
                new Handler(getApplicationContext().getMainLooper()).post(new C12522e(this, arrayList));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m60998w(DownloadWorker downloadWorker, List list) {
        C11669k.m56787e(downloadWorker, "this$0");
        C11669k.m56787e(list, "$args");
        C6556k kVar = downloadWorker.f47095r;
        if (kVar != null) {
            kVar.mo22159c("", list);
        }
    }

    /* renamed from: x */
    private final void m60999x(HttpURLConnection httpURLConnection, String str) {
        if (str.length() > 0) {
            m60995t("Headers = " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                C11669k.m56786d(keys, "json.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    httpURLConnection.setRequestProperty(next, jSONObject.getString(next));
                }
                httpURLConnection.setDoInput(true);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: y */
    private final void m61000y(Context context) {
        if (this.f47098u && Build.VERSION.SDK_INT >= 26) {
            Resources resources = getApplicationContext().getResources();
            String string = resources.getString(C12527i.flutter_downloader_notification_channel_name);
            C11669k.m56786d(string, "res.getString(R.string.f…otification_channel_name)");
            String string2 = resources.getString(C12527i.flutter_downloader_notification_channel_description);
            C11669k.m56786d(string2, "res.getString(R.string.f…tion_channel_description)");
            NotificationChannel notificationChannel = new NotificationChannel("FLUTTER_DOWNLOADER_NOTIFICATION", string, 2);
            notificationChannel.setDescription(string2);
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
            C0665o e = C0665o.m3094e(context);
            C11669k.m56786d(e, "from(context)");
            e.mo2968d(notificationChannel);
        }
    }

    /* renamed from: z */
    private final long m61001z(HttpURLConnection httpURLConnection, String str, String str2) {
        long length = new File(str2 + File.separator + str).length();
        m60995t("Resume download: Range: bytes=" + length + '-');
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setRequestProperty("Range", "bytes=" + length + '-');
        httpURLConnection.setDoInput(true);
        return length;
    }

    public ListenableWorker.C1526a doWork() {
        C12520c cVar;
        Object obj;
        boolean z;
        C12529k a = C12529k.f46020a.mo37342a(getApplicationContext());
        this.f47096s = a;
        C11669k.m56784b(a);
        this.f47097t = new C12528j(a);
        String l = getInputData().mo6306l("url");
        if (l != null) {
            String l2 = getInputData().mo6306l("file_name");
            String l3 = getInputData().mo6306l("saved_file");
            if (l3 != null) {
                String l4 = getInputData().mo6306l("headers");
                if (l4 != null) {
                    boolean h = getInputData().mo6301h("is_resume", false);
                    int i = getInputData().mo6303i("timeout", 15000);
                    this.f47100w = getInputData().mo6301h("debug", false);
                    this.f47090H = getInputData().mo6303i("step", 10);
                    this.f47101x = getInputData().mo6301h("ignoreSsl", false);
                    Resources resources = getApplicationContext().getResources();
                    this.f47083A = resources.getString(C12527i.flutter_downloader_notification_started);
                    this.f47084B = resources.getString(C12527i.flutter_downloader_notification_in_progress);
                    this.f47085C = resources.getString(C12527i.flutter_downloader_notification_canceled);
                    this.f47086D = resources.getString(C12527i.flutter_downloader_notification_failed);
                    this.f47087E = resources.getString(C12527i.flutter_downloader_notification_paused);
                    this.f47088F = resources.getString(C12527i.flutter_downloader_notification_complete);
                    C12528j jVar = this.f47097t;
                    if (jVar != null) {
                        String uuid = getId().toString();
                        C11669k.m56786d(uuid, "id.toString()");
                        cVar = jVar.mo37333d(uuid);
                    } else {
                        cVar = null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("DownloadWorker{url=");
                    sb.append(l);
                    sb.append(",filename=");
                    sb.append(l2);
                    sb.append(",savedDir=");
                    sb.append(l3);
                    sb.append(",header=");
                    sb.append(l4);
                    sb.append(",isResume=");
                    sb.append(h);
                    sb.append(",status=");
                    if (cVar == null || (obj = cVar.mo37321l()) == null) {
                        obj = "GONE";
                    }
                    sb.append(obj);
                    m60995t(sb.toString());
                    if (cVar == null || cVar.mo37321l() == C12518a.CANCELED) {
                        ListenableWorker.C1526a c = ListenableWorker.C1526a.m7085c();
                        C11669k.m56786d(c, "success()");
                        return c;
                    }
                    this.f47098u = getInputData().mo6301h("show_notification", false);
                    this.f47099v = getInputData().mo6301h("open_file_from_notification", false);
                    this.f47091I = getInputData().mo6301h("save_in_public_storage", false);
                    this.f47103z = cVar.mo37314f();
                    Context applicationContext = getApplicationContext();
                    C11669k.m56786d(applicationContext, "applicationContext");
                    m61000y(applicationContext);
                    Context applicationContext2 = getApplicationContext();
                    C11669k.m56786d(applicationContext2, "applicationContext");
                    String str = l2 == null ? l : l2;
                    C12518a aVar = C12518a.RUNNING;
                    C12518a aVar2 = aVar;
                    boolean z2 = h;
                    String str2 = "applicationContext";
                    m60977B(applicationContext2, str, aVar, cVar.mo37315g(), (PendingIntent) null, false);
                    C12528j jVar2 = this.f47097t;
                    if (jVar2 != null) {
                        String uuid2 = getId().toString();
                        C11669k.m56786d(uuid2, "id.toString()");
                        jVar2.mo37337i(uuid2, aVar2, cVar.mo37315g());
                    }
                    if (new File(l3 + File.separator + l2).exists()) {
                        m60995t("exists file for " + l2 + "automatic resuming...");
                        z = true;
                    } else {
                        z = z2;
                    }
                    try {
                        Context applicationContext3 = getApplicationContext();
                        C11669k.m56786d(applicationContext3, str2);
                        m60987l(applicationContext3, l, l3, l2, l4, z, i);
                        m60984i();
                        this.f47096s = null;
                        this.f47097t = null;
                        ListenableWorker.C1526a c2 = ListenableWorker.C1526a.m7085c();
                        C11669k.m56786d(c2, "{\n            downloadFi…esult.success()\n        }");
                        return c2;
                    } catch (Exception e) {
                        Context applicationContext4 = getApplicationContext();
                        C11669k.m56786d(applicationContext4, str2);
                        String str3 = l2 == null ? l : l2;
                        C12518a aVar3 = C12518a.FAILED;
                        m60977B(applicationContext4, str3, aVar3, -1, (PendingIntent) null, true);
                        C12528j jVar3 = this.f47097t;
                        if (jVar3 != null) {
                            String uuid3 = getId().toString();
                            C11669k.m56786d(uuid3, "id.toString()");
                            jVar3.mo37337i(uuid3, aVar3, this.f47102y);
                        }
                        e.printStackTrace();
                        this.f47096s = null;
                        this.f47097t = null;
                        ListenableWorker.C1526a a2 = ListenableWorker.C1526a.m7083a();
                        C11669k.m56786d(a2, "{\n            updateNoti…esult.failure()\n        }");
                        return a2;
                    }
                } else {
                    throw new IllegalArgumentException("Argument 'headers' should not be null");
                }
            } else {
                throw new IllegalArgumentException("Argument 'saved_file' should not be null");
            }
        } else {
            throw new IllegalArgumentException("Argument 'url' should not be null");
        }
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C11669k.m56787e(jVar, "call");
        C11669k.m56787e(dVar, "result");
        if (jVar.f30999a.equals("didInitializeDispatcher")) {
            synchronized (f47079L) {
                while (true) {
                    ArrayDeque<List<Object>> arrayDeque = f47080M;
                    if (!arrayDeque.isEmpty()) {
                        C6556k kVar = this.f47095r;
                        if (kVar != null) {
                            kVar.mo22159c("", arrayDeque.remove());
                        }
                    } else {
                        f47079L.set(true);
                        dVar.success((Object) null);
                        C10349s sVar = C10349s.f40964a;
                    }
                }
            }
            return;
        }
        dVar.notImplemented();
    }

    public void onStopped() {
        C12520c cVar;
        Context applicationContext = getApplicationContext();
        C11669k.m56786d(applicationContext, "applicationContext");
        C12529k a = C12529k.f46020a.mo37342a(applicationContext);
        this.f47096s = a;
        C11669k.m56784b(a);
        this.f47097t = new C12528j(a);
        String l = getInputData().mo6306l("url");
        String l2 = getInputData().mo6306l("file_name");
        C12528j jVar = this.f47097t;
        if (jVar != null) {
            String uuid = getId().toString();
            C11669k.m56786d(uuid, "id.toString()");
            cVar = jVar.mo37333d(uuid);
        } else {
            cVar = null;
        }
        if (cVar != null && cVar.mo37321l() == C12518a.ENQUEUED) {
            if (l2 == null) {
                l2 = l;
            }
            C12518a aVar = C12518a.CANCELED;
            m60977B(applicationContext, l2, aVar, -1, (PendingIntent) null, true);
            C12528j jVar2 = this.f47097t;
            if (jVar2 != null) {
                String uuid2 = getId().toString();
                C11669k.m56786d(uuid2, "id.toString()");
                jVar2.mo37337i(uuid2, aVar, this.f47102y);
            }
        }
    }
}
