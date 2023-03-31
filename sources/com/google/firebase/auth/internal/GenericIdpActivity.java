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
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p026firebaseauthapi.C3126a0;
import com.google.android.gms.internal.p026firebaseauthapi.C3400ia;
import com.google.android.gms.internal.p026firebaseauthapi.C3783tu;
import com.google.android.gms.internal.p026firebaseauthapi.C3911xs;
import com.google.android.gms.internal.p026firebaseauthapi.C3943ys;
import com.google.android.gms.internal.p026firebaseauthapi.C3975zs;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p040e5.C4245e;
import p063i0.C4643a;
import p067i5.C4687a;
import p067i5.C4694h;
import p067i5.C4696j;
import p246h7.C10412f;
import p293m7.C11836l;
import p293m7.C11849p0;
import p293m7.C11851q0;
import p293m7.C11865x0;
import p293m7.C11867y0;
import p293m7.C11869z0;

@KeepName
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class GenericIdpActivity extends C1093e implements C3975zs {

    /* renamed from: c */
    private static long f34137c;

    /* renamed from: d */
    private static final C11851q0 f34138d = C11851q0.m57317b();

    /* renamed from: a */
    private final Executor f34139a = C3400ia.m25789a().mo16021g(1);

    /* renamed from: b */
    private boolean f34140b = false;

    /* renamed from: h */
    private final void m43394h() {
        f34137c = 0;
        this.f34140b = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!C4643a.m30235b(this).mo18317d(intent)) {
            f34138d.mo36103e(this, C11836l.m57255a("WEB_CONTEXT_CANCELED"));
        } else {
            f34138d.mo36101c(this);
        }
        finish();
    }

    /* renamed from: i */
    private final void m43395i(Status status) {
        f34137c = 0;
        this.f34140b = false;
        Intent intent = new Intent();
        C11849p0.m57315c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!C4643a.m30235b(this).mo18317d(intent)) {
            f34138d.mo36103e(getApplicationContext(), status);
        } else {
            f34138d.mo36101c(this);
        }
        finish();
    }

    /* renamed from: a */
    public final Uri.Builder mo17128a(Intent intent, String str, String str2) {
        return mo26115g(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    /* renamed from: b */
    public final HttpURLConnection mo17129b(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
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
                Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            C0584d b = new C0584d.C0585a().mo2688b();
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
            b.mo2686a(this, uri);
            return;
        }
        Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        mo17131d(str, (Status) null);
    }

    /* renamed from: d */
    public final void mo17131d(String str, Status status) {
        if (status == null) {
            m43394h();
        } else {
            m43395i(status);
        }
    }

    /* renamed from: g */
    public final Uri.Builder mo26115g(Uri.Builder builder, Intent intent, String str, String str2) {
        String str3;
        Uri.Builder builder2 = builder;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            str3 = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str4 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str4);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(str4, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            str3 = jSONObject.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String a = C3943ys.m27473a(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str5 = uuid;
        String str6 = a;
        String str7 = uuid;
        String str8 = action;
        String str9 = str3;
        String str10 = stringExtra2;
        String str11 = stringExtra2;
        String str12 = "GenericIdpActivity";
        String str13 = join;
        C11867y0.m57349b().mo36119d(getApplicationContext(), str, str5, a, str8, str10, stringExtra3, stringExtra4);
        String c = C11869z0.m57356a(getApplicationContext(), C10412f.m52583p(stringExtra4).mo33472s()).mo36123c();
        if (TextUtils.isEmpty(c)) {
            Log.e(str12, "Could not generate an encryption key for Generic IDP - cancelling flow.");
            m43395i(C11836l.m57255a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        String str14 = str6;
        if (str14 == null) {
            return null;
        }
        builder2.appendQueryParameter("eid", "p").appendQueryParameter("v", "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", str11).appendQueryParameter("sessionId", str14).appendQueryParameter("eventId", str7).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c);
        if (!TextUtils.isEmpty(str13)) {
            builder2.appendQueryParameter("scopes", str13);
        }
        if (!TextUtils.isEmpty(str9)) {
            builder2.appendQueryParameter("customParameters", str9);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder2.appendQueryParameter("tid", stringExtra3);
        }
        return builder2;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long a = C4694h.m30388d().mo18370a();
            if (a - f34137c < 30000) {
                Log.e("GenericIdpActivity", "Could not start operation - already in progress");
                return;
            }
            f34137c = a;
            if (bundle != null) {
                this.f34140b = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        Log.e("GenericIdpActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
        m43394h();
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
                m43395i(C11849p0.m57314b(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                m43394h();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                C11865x0 a = C11867y0.m57349b().mo36117a(this, packageName, stringExtra2);
                if (a == null) {
                    m43394h();
                }
                if (booleanExtra) {
                    stringExtra = C11869z0.m57356a(getApplicationContext(), C10412f.m52583p(a.mo36111a()).mo33472s()).mo36122b(stringExtra);
                }
                C3126a0 a0Var = new C3126a0(a, stringExtra);
                String e = a.mo36115e();
                String b = a.mo36112b();
                a0Var.mo15692M1(e);
                if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(b) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(b) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(b)) {
                    f34137c = 0;
                    this.f34140b = false;
                    Intent intent2 = new Intent();
                    C4245e.m28633e(a0Var, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", b);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    if (!C4643a.m30235b(this).mo18317d(intent2)) {
                        SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                        edit.putString("verifyAssertionRequest", C4245e.m28634f(a0Var));
                        edit.putString("operation", b);
                        edit.putString("tenantId", e);
                        edit.putLong("timestamp", C4694h.m30388d().mo18370a());
                        edit.commit();
                    } else {
                        f34138d.mo36101c(this);
                    }
                    finish();
                    return;
                }
                Log.e("GenericIdpActivity", "unsupported operation: ".concat(b));
                m43394h();
            }
        } else if (!this.f34140b) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = C4696j.m30402b(C4687a.m30364a(this, packageName2)).toLowerCase(Locale.US);
                C10412f p = C10412f.m52583p(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                if (!C3783tu.m27057g(p)) {
                    new C3911xs(packageName2, lowerCase, getIntent(), p, this).executeOnExecutor(this.f34139a, new Void[0]);
                } else {
                    mo17130c(mo26115g(Uri.parse(C3783tu.m27051a(p.mo33471r().mo33479b())).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                String obj = e2.toString();
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + " " + obj);
                mo17131d(packageName2, (Status) null);
            }
            this.f34140b = true;
        } else {
            m43394h();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f34140b);
    }

    /* renamed from: x */
    public final String mo17132x(String str) {
        return C3783tu.m27052b(str);
    }

    public final Context zza() {
        return getApplicationContext();
    }
}
