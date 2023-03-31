package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.ads.AdError;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p084l1.C4902b;
import p091m1.C4962a;
import p091m1.C4988j;
import p091m1.C4989k;
import p091m1.C4992l;
import p091m1.C4994m;
import p091m1.C4996n;
import p091m1.C4997o;
import p091m1.C5001p;
import p098n1.C5084h;
import p098n1.C5085i;
import p105o1.C5155f;
import p105o1.C5157g;
import p105o1.C5165m;
import p126r1.C5431a;
import p133s1.C5474b;
import p165x1.C6034a;
import p356t7.C12539a;
import p356t7.C12540b;

/* renamed from: com.google.android.datatransport.cct.d */
/* compiled from: CctTransportBackend */
final class C2005d implements C5165m {

    /* renamed from: a */
    private final C12539a f5714a;

    /* renamed from: b */
    private final ConnectivityManager f5715b;

    /* renamed from: c */
    private final Context f5716c;

    /* renamed from: d */
    final URL f5717d;

    /* renamed from: e */
    private final C6034a f5718e;

    /* renamed from: f */
    private final C6034a f5719f;

    /* renamed from: g */
    private final int f5720g;

    /* renamed from: com.google.android.datatransport.cct.d$a */
    /* compiled from: CctTransportBackend */
    static final class C2006a {

        /* renamed from: a */
        final URL f5721a;

        /* renamed from: b */
        final C4988j f5722b;

        /* renamed from: c */
        final String f5723c;

        C2006a(URL url, C4988j jVar, String str) {
            this.f5721a = url;
            this.f5722b = jVar;
            this.f5723c = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2006a mo7719a(URL url) {
            return new C2006a(url, this.f5722b, this.f5723c);
        }
    }

    /* renamed from: com.google.android.datatransport.cct.d$b */
    /* compiled from: CctTransportBackend */
    static final class C2007b {

        /* renamed from: a */
        final int f5724a;

        /* renamed from: b */
        final URL f5725b;

        /* renamed from: c */
        final long f5726c;

        C2007b(int i, URL url, long j) {
            this.f5724a = i;
            this.f5725b = url;
            this.f5726c = j;
        }
    }

    C2005d(Context context, C6034a aVar, C6034a aVar2, int i) {
        this.f5714a = C4988j.m31496b();
        this.f5716c = context;
        this.f5715b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5717d = m8732n(C2002a.f5704c);
        this.f5718e = aVar2;
        this.f5719f = aVar;
        this.f5720g = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C2007b m8723e(C2006a aVar) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        InputStream m;
        C5431a.m33271f("CctTransportBackend", "Making request to: %s", aVar.f5721a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f5721a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f5720g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.8"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f5723c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f5714a.mo37359a(aVar.f5722b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C5431a.m33271f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                C5431a.m33267b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                C5431a.m33267b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C2007b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new C2007b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    m = m8731m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C2007b bVar = new C2007b(responseCode, (URL) null, C4996n.m31541b(new BufferedReader(new InputStreamReader(m))).mo18913c());
                    if (m != null) {
                        m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e) {
            C5431a.m33269d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C2007b(500, (URL) null, 0);
        } catch (IOException | C12540b e2) {
            C5431a.m33269d("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C2007b(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    /* renamed from: f */
    private static int m8724f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return C4997o.C4999b.UNKNOWN_MOBILE_SUBTYPE.mo18927b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return C4997o.C4999b.COMBINED.mo18927b();
        }
        if (C4997o.C4999b.m31549a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: g */
    private static int m8725g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return C4997o.C5000c.NONE.mo18928b();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    private static int m8726h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C5431a.m33269d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: i */
    private C4988j m8727i(C5155f fVar) {
        C4992l.C4993a aVar;
        HashMap hashMap = new HashMap();
        for (C5085i next : fVar.mo19118b()) {
            String j = next.mo18999j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            C5085i iVar = (C5085i) ((List) entry.getValue()).get(0);
            C4994m.C4995a b = C4994m.m31522a().mo18910f(C5001p.DEFAULT).mo18911g(this.f5719f.mo20745a()).mo18912h(this.f5718e.mo20745a()).mo18906b(C4989k.m31498a().mo18876c(C4989k.C4991b.ANDROID_FIREBASE).mo18875b(C4962a.m31389a().mo18853m(Integer.valueOf(iVar.mo19044g("sdk-version"))).mo18850j(iVar.mo19043b("model")).mo18846f(iVar.mo19043b("hardware")).mo18844d(iVar.mo19043b("device")).mo18852l(iVar.mo19043b("product")).mo18851k(iVar.mo19043b("os-uild")).mo18848h(iVar.mo19043b("manufacturer")).mo18845e(iVar.mo19043b("fingerprint")).mo18843c(iVar.mo19043b("country")).mo18847g(iVar.mo19043b("locale")).mo18849i(iVar.mo19043b("mcc_mnc")).mo18842b(iVar.mo19043b("application_build")).mo18841a()).mo18874a());
            try {
                b.mo18925i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.mo18926j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (C5085i iVar2 : (List) entry.getValue()) {
                C5084h e = iVar2.mo18995e();
                C4902b b2 = e.mo19039b();
                if (b2.equals(C4902b.m31123b("proto"))) {
                    aVar = C4992l.m31506j(e.mo19038a());
                } else if (b2.equals(C4902b.m31123b("json"))) {
                    aVar = C4992l.m31505i(new String(e.mo19038a(), Charset.forName("UTF-8")));
                } else {
                    C5431a.m33272g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.mo18889c(iVar2.mo18997f()).mo18890d(iVar2.mo19000k()).mo18894h(iVar2.mo19045h("tz-offset")).mo18891e(C4997o.m31543a().mo18924c(C4997o.C5000c.m31551a(iVar2.mo19044g("net-type"))).mo18923b(C4997o.C4999b.m31549a(iVar2.mo19044g("mobile-subtype"))).mo18922a());
                if (iVar2.mo18994d() != null) {
                    aVar.mo18888b(iVar2.mo18994d());
                }
                arrayList3.add(aVar.mo18887a());
            }
            b.mo18907c(arrayList3);
            arrayList2.add(b.mo18905a());
        }
        return C4988j.m31495a(arrayList2);
    }

    /* renamed from: j */
    private static TelephonyManager m8728j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    static long m8729k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / AdError.NETWORK_ERROR_CODE);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ C2006a m8730l(C2006a aVar, C2007b bVar) {
        URL url = bVar.f5725b;
        if (url == null) {
            return null;
        }
        C5431a.m33267b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.mo7719a(bVar.f5725b);
    }

    /* renamed from: m */
    private static InputStream m8731m(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: n */
    private static URL m8732n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: a */
    public C5085i mo7717a(C5085i iVar) {
        NetworkInfo activeNetworkInfo = this.f5715b.getActiveNetworkInfo();
        return iVar.mo19047l().mo19048a("sdk-version", Build.VERSION.SDK_INT).mo19050c("model", Build.MODEL).mo19050c("hardware", Build.HARDWARE).mo19050c("device", Build.DEVICE).mo19050c("product", Build.PRODUCT).mo19050c("os-uild", Build.ID).mo19050c("manufacturer", Build.MANUFACTURER).mo19050c("fingerprint", Build.FINGERPRINT).mo19049b("tz-offset", m8729k()).mo19048a("net-type", m8725g(activeNetworkInfo)).mo19048a("mobile-subtype", m8724f(activeNetworkInfo)).mo19050c("country", Locale.getDefault().getCountry()).mo19050c("locale", Locale.getDefault().getLanguage()).mo19050c("mcc_mnc", m8728j(this.f5716c).getSimOperator()).mo19050c("application_build", Integer.toString(m8726h(this.f5716c))).mo19002d();
    }

    /* renamed from: b */
    public C5157g mo7718b(C5155f fVar) {
        C4988j i = m8727i(fVar);
        URL url = this.f5717d;
        String str = null;
        if (fVar.mo19119c() != null) {
            try {
                C2002a d = C2002a.m8713d(fVar.mo19119c());
                if (d.mo7713e() != null) {
                    str = d.mo7713e();
                }
                if (d.mo7714f() != null) {
                    url = m8732n(d.mo7714f());
                }
            } catch (IllegalArgumentException unused) {
                return C5157g.m32067a();
            }
        }
        try {
            C2007b bVar = (C2007b) C5474b.m33406a(5, new C2006a(url, i, str), new C2003b(this), C2004c.f5713a);
            int i2 = bVar.f5724a;
            if (i2 == 200) {
                return C5157g.m32069e(bVar.f5726c);
            }
            if (i2 < 500) {
                if (i2 != 404) {
                    if (i2 == 400) {
                        return C5157g.m32068d();
                    }
                    return C5157g.m32067a();
                }
            }
            return C5157g.m32070f();
        } catch (IOException e) {
            C5431a.m33269d("CctTransportBackend", "Could not make request to the backend", e);
            return C5157g.m32070f();
        }
    }

    C2005d(Context context, C6034a aVar, C6034a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
