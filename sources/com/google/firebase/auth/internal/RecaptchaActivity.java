package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.C0584d;
import androidx.fragment.app.C1093e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p026firebaseauthapi.C3400ia;
import com.google.android.gms.internal.p026firebaseauthapi.C3485kt;
import com.google.android.gms.internal.p026firebaseauthapi.C3783tu;
import com.google.android.gms.internal.p026firebaseauthapi.C3911xs;
import com.google.android.gms.internal.p026firebaseauthapi.C3975zs;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import p063i0.C4643a;
import p067i5.C4687a;
import p067i5.C4694h;
import p067i5.C4696j;
import p246h7.C10412f;
import p293m7.C11836l;
import p293m7.C11849p0;
import p293m7.C11851q0;
import p293m7.C11867y0;
import p293m7.C11869z0;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class RecaptchaActivity extends C1093e implements C3975zs {

    /* renamed from: b */
    private static final String f34141b = "RecaptchaActivity";

    /* renamed from: c */
    private static final ExecutorService f34142c = C3400ia.m25789a().mo16021g(2);

    /* renamed from: d */
    private static long f34143d = 0;

    /* renamed from: e */
    private static final C11851q0 f34144e = C11851q0.m57317b();

    /* renamed from: a */
    private boolean f34145a = false;

    /* renamed from: g */
    private final void m43402g() {
        f34143d = 0;
        this.f34145a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C4643a.m30235b(this).mo18317d(intent);
        f34144e.mo36101c(this);
        finish();
    }

    /* renamed from: h */
    private final void m43403h(Status status) {
        f34143d = 0;
        this.f34145a = false;
        Intent intent = new Intent();
        C11849p0.m57315c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C4643a.m30235b(this).mo18317d(intent);
        f34144e.mo36101c(this);
        finish();
    }

    /* renamed from: a */
    public final Uri.Builder mo17128a(Intent intent, String str, String str2) {
        String str3;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        C10412f p = C10412f.m52583p(stringExtra3);
        FirebaseAuth instance = FirebaseAuth.getInstance(p);
        C11867y0.m57349b().mo36120e(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String c = C11869z0.m57356a(getApplicationContext(), p.mo33472s()).mo36123c();
        if (TextUtils.isEmpty(c)) {
            Log.e(f34141b, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            m43403h(C11836l.m57255a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        if (!TextUtils.isEmpty(instance.mo26033o())) {
            str3 = instance.mo26033o();
        } else {
            str3 = C3485kt.m26018a();
        }
        return new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c);
    }

    /* renamed from: b */
    public final HttpURLConnection mo17129b(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            C3975zs.f22996l.mo17930c("Error generating connection", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public final void mo17130c(Uri uri, String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("com.android.browser.application_id", str);
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            C0584d b = new C0584d.C0585a().mo2688b();
            b.f1914a.addFlags(1073741824);
            b.f1914a.addFlags(268435456);
            b.mo2686a(this, uri);
            return;
        }
        Log.e(f34141b, "Device cannot resolve intent for: android.intent.action.VIEW");
        mo17131d(str, (Status) null);
    }

    /* renamed from: d */
    public final void mo17131d(String str, Status status) {
        if (status == null) {
            m43402g();
        } else {
            m43403h(status);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long a = C4694h.m30388d().mo18370a();
            if (a - f34143d < 30000) {
                Log.e(f34141b, "Could not start operation - already in progress");
                return;
            }
            f34143d = a;
            if (bundle != null) {
                this.f34145a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                return;
            }
            return;
        }
        Log.e(f34141b, "Could not do operation - unknown action: ".concat(String.valueOf(action)));
        m43402g();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                m43403h(C11849p0.m57314b(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                m43402g();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String c = C11867y0.m57349b().mo36118c(getApplicationContext(), getPackageName(), intent.getStringExtra("eventId"));
                if (TextUtils.isEmpty(c)) {
                    Log.e(f34141b, "Failed to find registration for this event - failing to prevent session injection.");
                    m43403h(C11836l.m57255a("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = C11869z0.m57356a(getApplicationContext(), C10412f.m52583p(c).mo33472s()).mo36122b(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f34143d = 0;
                this.f34145a = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!C4643a.m30235b(this).mo18317d(intent2)) {
                    SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit.putString("recaptchaToken", queryParameter);
                    edit.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    edit.putLong("timestamp", C4694h.m30388d().mo18370a());
                    edit.commit();
                } else {
                    f34144e.mo36101c(this);
                }
                finish();
            }
        } else if (!this.f34145a) {
            Intent intent3 = getIntent();
            String packageName = getPackageName();
            try {
                new C3911xs(packageName, C4696j.m30402b(C4687a.m30364a(this, packageName)).toLowerCase(Locale.US), intent3, C10412f.m52583p(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME")), this).executeOnExecutor(f34142c, new Void[0]);
            } catch (PackageManager.NameNotFoundException e) {
                String str = f34141b;
                String obj = e.toString();
                Log.e(str, "Could not get package signature: " + packageName + " " + obj);
                mo17131d(packageName, (Status) null);
            }
            this.f34145a = true;
        } else {
            m43402g();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f34145a);
    }

    /* renamed from: x */
    public final String mo17132x(String str) {
        return C3783tu.m27052b(str);
    }

    public final Context zza() {
        return getApplicationContext();
    }
}
