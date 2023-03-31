package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.window.layout.C1524d;
import com.google.firebase.installations.C8005g;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p174y4.C6145d;
import p218e6.C9975i;
import p218e6.C9980l;
import p246h7.C10412f;
import p257i8.C10562j;
import p276k8.C11600b;
import p285l8.C11765e;
import p367u8.C12709i;

/* renamed from: com.google.firebase.messaging.d0 */
/* compiled from: GmsRpc */
class C8027d0 {

    /* renamed from: a */
    private final C10412f f34652a;

    /* renamed from: b */
    private final C8044i0 f34653b;

    /* renamed from: c */
    private final C6145d f34654c;

    /* renamed from: d */
    private final C11600b<C12709i> f34655d;

    /* renamed from: e */
    private final C11600b<C10562j> f34656e;

    /* renamed from: f */
    private final C11765e f34657f;

    C8027d0(C10412f fVar, C8044i0 i0Var, C11600b<C12709i> bVar, C11600b<C10562j> bVar2, C11765e eVar) {
        this(fVar, i0Var, new C6145d(fVar.mo33469m()), bVar, bVar2, eVar);
    }

    /* renamed from: b */
    private static String m44218b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: d */
    private C9975i<String> m44219d(C9975i<Bundle> iVar) {
        return iVar.mo26354i(C1524d.f4372a, new C8022c0(this));
    }

    /* renamed from: e */
    private String m44220e() {
        try {
            return m44218b(MessageDigest.getInstance("SHA-1").digest(this.f34652a.mo33470q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: g */
    private String m44221g(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: h */
    static boolean m44222h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m44223i(C9975i iVar) throws Exception {
        return m44221g((Bundle) iVar.mo26359n(IOException.class));
    }

    /* renamed from: j */
    private void m44224j(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        C10562j.C10563a b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f34652a.mo33471r().mo33480c());
        bundle.putString("gmsv", Integer.toString(this.f34653b.mo26645d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f34653b.mo26643a());
        bundle.putString("app_ver_name", this.f34653b.mo26644b());
        bundle.putString("firebase-app-name-hash", m44220e());
        try {
            String b2 = ((C8005g) C9980l.m51027a(this.f34657f.mo26562a(false))).mo26551b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b2);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) C9980l.m51027a(this.f34657f.getId()));
        bundle.putString("cliv", "fcm-" + "23.1.1");
        C10562j jVar = this.f34656e.get();
        C12709i iVar = this.f34655d.get();
        if (jVar != null && iVar != null && (b = jVar.mo33754b("fire-iid")) != C10562j.C10563a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b.mo33756a()));
            bundle.putString("Firebase-Client", iVar.mo37578a());
        }
    }

    /* renamed from: k */
    private C9975i<Bundle> m44225k(String str, String str2, Bundle bundle) {
        try {
            m44224j(str, str2, bundle);
            return this.f34654c.mo21005a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return C9980l.m51030d(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C9975i<?> mo26625c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m44219d(m44225k(C8044i0.m44300c(this.f34652a), "*", bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C9975i<String> mo26626f() {
        return m44219d(m44225k(C8044i0.m44300c(this.f34652a), "*", new Bundle()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C9975i<?> mo26627l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m44219d(m44225k(str, "/topics/" + str2, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C9975i<?> mo26628m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m44219d(m44225k(str, "/topics/" + str2, bundle));
    }

    C8027d0(C10412f fVar, C8044i0 i0Var, C6145d dVar, C11600b<C12709i> bVar, C11600b<C10562j> bVar2, C11765e eVar) {
        this.f34652a = fVar;
        this.f34653b = i0Var;
        this.f34654c = dVar;
        this.f34655d = bVar;
        this.f34656e = bVar2;
        this.f34657f = eVar;
    }
}
