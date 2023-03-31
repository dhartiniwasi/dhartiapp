package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
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

/* renamed from: com.google.firebase.iid.k */
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class C7979k {

    /* renamed from: a */
    private final C10412f f34501a;

    /* renamed from: b */
    private final C7982n f34502b;

    /* renamed from: c */
    private final C6145d f34503c;

    /* renamed from: d */
    private final C11600b<C12709i> f34504d;

    /* renamed from: e */
    private final C11600b<C10562j> f34505e;

    /* renamed from: f */
    private final C11765e f34506f;

    public C7979k(C10412f fVar, C7982n nVar, C11600b<C12709i> bVar, C11600b<C10562j> bVar2, C11765e eVar) {
        this(fVar, nVar, new C6145d(fVar.mo33469m()), bVar, bVar2, eVar);
    }

    C7979k(C10412f fVar, C7982n nVar, C6145d dVar, C11600b<C12709i> bVar, C11600b<C10562j> bVar2, C11765e eVar) {
        this.f34501a = fVar;
        this.f34502b = nVar;
        this.f34503c = dVar;
        this.f34504d = bVar;
        this.f34505e = bVar2;
        this.f34506f = eVar;
    }

    /* renamed from: a */
    private static String m43973a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: c */
    private C9975i<String> m43974c(C9975i<Bundle> iVar) {
        return iVar.mo26354i(C7970b.m43966a(), new C7978j(this));
    }

    /* renamed from: d */
    private String m43975d() {
        try {
            return m43973a(MessageDigest.getInstance("SHA-1").digest(this.f34501a.mo33470q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    private String m43976f(Bundle bundle) throws IOException {
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
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: g */
    static boolean m43977g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: i */
    private Bundle m43978i(String str, String str2, String str3, Bundle bundle) {
        C10562j.C10563a b;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f34501a.mo33471r().mo33480c());
        bundle.putString("gmsv", Integer.toString(this.f34502b.mo26531d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f34502b.mo26529a());
        bundle.putString("app_ver_name", this.f34502b.mo26530b());
        bundle.putString("firebase-app-name-hash", m43975d());
        try {
            String b2 = ((C8005g) C9980l.m51027a(this.f34506f.mo26562a(false))).mo26551b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b2);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        C10562j jVar = this.f34505e.get();
        C12709i iVar = this.f34504d.get();
        if (!(jVar == null || iVar == null || (b = jVar.mo33754b("fire-iid")) == C10562j.C10563a.NONE)) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b.mo33756a()));
            bundle.putString("Firebase-Client", iVar.mo37578a());
        }
        return bundle;
    }

    /* renamed from: j */
    private C9975i<Bundle> m43979j(String str, String str2, String str3, Bundle bundle) {
        m43978i(str, str2, str3, bundle);
        return this.f34503c.mo21005a(bundle);
    }

    /* renamed from: b */
    public C9975i<?> mo26525b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m43974c(m43979j(str, str2, str3, bundle));
    }

    /* renamed from: e */
    public C9975i<String> mo26526e(String str, String str2, String str3) {
        return m43974c(m43979j(str, str2, str3, new Bundle()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ String mo26527h(C9975i iVar) throws Exception {
        return m43976f((Bundle) iVar.mo26359n(IOException.class));
    }
}
