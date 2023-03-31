package com.google.android.gms.internal.p026firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.firebase.auth.C7830n0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p033d5.C4141r;
import p054g5.C4410a;
import p081k5.C4888c;
import p156v4.C5858a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.pu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3651pu {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C4410a f22526d = new C4410a("FirebaseAuth", "SmsRetrieverHelper");

    /* renamed from: a */
    private final Context f22527a;

    /* renamed from: b */
    private final ScheduledExecutorService f22528b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap f22529c = new HashMap();

    C3651pu(Context context) {
        this.f22527a = (Context) C4141r.m28221k(context);
        C3400ia.m25789a();
        this.f22528b = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }

    /* renamed from: b */
    static String m26508b(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ void m26510e(C3651pu puVar, String str) {
        C3618ou ouVar = (C3618ou) puVar.f22529c.get(str);
        if (ouVar != null && !C3296f5.m25552d(ouVar.f22485d) && !C3296f5.m25552d(ouVar.f22486e) && !ouVar.f22483b.isEmpty()) {
            for (C3781ts n : ouVar.f22483b) {
                n.mo16833n(C7830n0.m43448N1(ouVar.f22485d, ouVar.f22486e));
            }
            ouVar.f22489h = true;
        }
    }

    /* renamed from: m */
    private static String m26513m(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str3.getBytes(C3706rj.f22627c));
            String substring = Base64.encodeToString(Arrays.copyOf(instance.digest(), 9), 3).substring(0, 11);
            f22526d.mo17928a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e) {
            f22526d.mo17930c("NoSuchAlgorithm: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m26514n(String str) {
        C3618ou ouVar = (C3618ou) this.f22529c.get(str);
        if (ouVar != null && !ouVar.f22489h && !C3296f5.m25552d(ouVar.f22485d)) {
            f22526d.mo17935h("Timed out waiting for SMS.", new Object[0]);
            for (C3781ts a : ouVar.f22483b) {
                a.mo16822a(ouVar.f22485d);
            }
            ouVar.f22490i = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void mo16566h(String str) {
        C3618ou ouVar = (C3618ou) this.f22529c.get(str);
        if (ouVar != null) {
            if (!ouVar.f22490i) {
                m26514n(str);
            }
            mo16568j(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo16565c() {
        Signature[] signatureArr;
        try {
            String packageName = this.f22527a.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                signatureArr = C4888c.m31075a(this.f22527a).mo18673f(packageName, 64).signatures;
            } else {
                signatureArr = C4888c.m31075a(this.f22527a).mo18673f(packageName, 134217728).signingInfo.getApkContentsSigners();
            }
            String m = m26513m(packageName, signatureArr[0].toCharsString());
            if (m != null) {
                return m;
            }
            f22526d.mo17930c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f22526d.mo17930c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo16567i(C3781ts tsVar, String str) {
        C3618ou ouVar = (C3618ou) this.f22529c.get(str);
        if (ouVar != null) {
            ouVar.f22483b.add(tsVar);
            if (ouVar.f22488g) {
                tsVar.mo16403b(ouVar.f22485d);
            }
            if (ouVar.f22489h) {
                tsVar.mo16833n(C7830n0.m43448N1(ouVar.f22485d, ouVar.f22486e));
            }
            if (ouVar.f22490i) {
                tsVar.mo16822a(ouVar.f22485d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo16568j(String str) {
        C3618ou ouVar = (C3618ou) this.f22529c.get(str);
        if (ouVar != null) {
            ScheduledFuture scheduledFuture = ouVar.f22487f;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                ouVar.f22487f.cancel(false);
            }
            ouVar.f22483b.clear();
            this.f22529c.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo16569k(String str, C3781ts tsVar, long j, boolean z) {
        this.f22529c.put(str, new C3618ou(j, z));
        mo16567i(tsVar, str);
        C3618ou ouVar = (C3618ou) this.f22529c.get(str);
        long j2 = ouVar.f22482a;
        if (j2 <= 0) {
            f22526d.mo17935h("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        ouVar.f22487f = this.f22528b.schedule(new C3486ku(this, str), j2, TimeUnit.SECONDS);
        if (!ouVar.f22484c) {
            f22526d.mo17935h("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        C3585nu nuVar = new C3585nu(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        C3264e6.m25469o(this.f22527a.getApplicationContext(), nuVar, intentFilter);
        C5858a.m34732a(this.f22527a).mo19299r().mo26349d(new C3519lu(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo16570l(String str) {
        return this.f22529c.get(str) != null;
    }
}
