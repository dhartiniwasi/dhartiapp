package p073j4;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.dy1;
import com.google.android.gms.internal.ads.ey1;
import com.google.android.gms.internal.ads.lf3;
import com.google.android.gms.internal.ads.pm0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;
import p067i5.C4697k;

/* renamed from: j4.x */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4822x {

    /* renamed from: a */
    private final Object f25553a = new Object();

    /* renamed from: b */
    private String f25554b = "";

    /* renamed from: c */
    private String f25555c = "";

    /* renamed from: d */
    private boolean f25556d = false;

    /* renamed from: e */
    private boolean f25557e = false;

    /* renamed from: f */
    protected String f25558f = "";

    /* renamed from: g */
    private ey1 f25559g;

    /* renamed from: o */
    protected static final String m30825o(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", C4409t.m29326r().mo18438z(context, str2));
        lf3 b = new C4802q0(context).mo18525b(0, str, hashMap, (byte[]) null);
        try {
            return (String) b.get((long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14436T3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            pm0.m18665e("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e);
            b.cancel(true);
            return null;
        } catch (InterruptedException e2) {
            pm0.m18665e("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e2);
            b.cancel(true);
            return null;
        } catch (Exception e3) {
            pm0.m18665e("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    /* renamed from: p */
    private final Uri m30826p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f25553a) {
            if (TextUtils.isEmpty(this.f25554b)) {
                C4409t.m29326r();
                try {
                    str5 = new String(C4697k.m30408d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    pm0.m18662b("Error reading from internal storage.");
                    str5 = "";
                }
                this.f25554b = str5;
                if (TextUtils.isEmpty(str5)) {
                    C4409t.m29326r();
                    this.f25554b = UUID.randomUUID().toString();
                    C4409t.m29326r();
                    String str6 = this.f25554b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e) {
                        pm0.m18665e("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.f25554b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: a */
    public final ey1 mo18554a() {
        return this.f25559g;
    }

    /* renamed from: b */
    public final String mo18555b() {
        String str;
        synchronized (this.f25553a) {
            str = this.f25555c;
        }
        return str;
    }

    /* renamed from: c */
    public final void mo18556c(Context context) {
        ey1 ey1;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14440T7)).booleanValue() && (ey1 = this.f25559g) != null) {
            ey1.mo10037h(new C4813u(this, context), dy1.DEBUG_MENU);
        }
    }

    /* renamed from: d */
    public final void mo18557d(Context context, String str, String str2) {
        C4409t.m29326r();
        C4751b2.m30622q(context, m30826p(context, (String) C4596v.m30088c().mo12227b(C2679nz.f14396P3), str, str2));
    }

    /* renamed from: e */
    public final void mo18558e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = m30826p(context, (String) C4596v.m30088c().mo12227b(C2679nz.f14426S3), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        C4409t.m29326r();
        C4751b2.m30613h(context, str, buildUpon.build().toString());
    }

    /* renamed from: f */
    public final void mo18559f(boolean z) {
        synchronized (this.f25553a) {
            this.f25557e = z;
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14440T7)).booleanValue()) {
                C4409t.m29325q().mo15117h().mo18511p(z);
                ey1 ey1 = this.f25559g;
                if (ey1 != null) {
                    ey1.mo10039j(z);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo18560g(ey1 ey1) {
        this.f25559g = ey1;
    }

    /* renamed from: h */
    public final void mo18561h(boolean z) {
        synchronized (this.f25553a) {
            this.f25556d = z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo18562i(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            pm0.m18666f("Can not create dialog without Activity Context");
        } else {
            C4751b2.f25403i.post(new C4819w(this, context, str, z, z2));
        }
    }

    /* renamed from: j */
    public final boolean mo18563j(Context context, String str, String str2) {
        String o = m30825o(context, m30826p(context, (String) C4596v.m30088c().mo12227b(C2679nz.f14416R3), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o)) {
            pm0.m18662b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(o.trim()).optString("debug_mode"));
            mo18559f(equals);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14440T7)).booleanValue()) {
                C4800p1 h = C4409t.m29325q().mo15117h();
                if (true != equals) {
                    str = "";
                }
                h.mo18500f(str);
            }
            return equals;
        } catch (JSONException e) {
            pm0.m18668h("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18564k(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14406Q3
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r1.mo12227b(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.m30826p(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = m30825o(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L_0x0025
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.internal.ads.pm0.m18662b(r4)
            return r0
        L_0x0025:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0083 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch:{ JSONException -> 0x0083 }
            r3.f25558f = r6     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.ez r6 = com.google.android.gms.internal.ads.C2679nz.f14440T7     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ JSONException -> 0x0083 }
            java.lang.Object r6 = r1.mo12227b(r6)     // Catch:{ JSONException -> 0x0083 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0083 }
            r1 = 1
            if (r6 == 0) goto L_0x0079
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.f25558f     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r6 != 0) goto L_0x0066
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.f25558f     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r6 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r6 = 0
            goto L_0x0067
        L_0x0066:
            r6 = 1
        L_0x0067:
            r3.mo18559f(r6)     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.xl0 r2 = p053g4.C4409t.m29325q()     // Catch:{ JSONException -> 0x0083 }
            j4.p1 r2 = r2.mo15117h()     // Catch:{ JSONException -> 0x0083 }
            if (r1 == r6) goto L_0x0076
            java.lang.String r5 = ""
        L_0x0076:
            r2.mo18500f(r5)     // Catch:{ JSONException -> 0x0083 }
        L_0x0079:
            java.lang.Object r5 = r3.f25553a
            monitor-enter(r5)
            r3.f25555c = r4     // Catch:{ all -> 0x0080 }
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            return r1
        L_0x0080:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            throw r4
        L_0x0083:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.internal.ads.pm0.m18668h(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j4.C4822x.mo18564k(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: l */
    public final boolean mo18565l() {
        boolean z;
        synchronized (this.f25553a) {
            z = this.f25557e;
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo18566m() {
        boolean z;
        synchronized (this.f25553a) {
            z = this.f25556d;
        }
        return z;
    }

    /* renamed from: n */
    public final boolean mo18567n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !mo18566m()) {
            return false;
        }
        pm0.m18662b("Sending troubleshooting signals to the server.");
        mo18558e(context, str, str2, str3);
        return true;
    }
}
