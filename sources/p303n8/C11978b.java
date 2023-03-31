package p303n8;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p246h7.C10412f;

/* renamed from: n8.b */
/* compiled from: IidStore */
public class C11978b {

    /* renamed from: c */
    private static final String[] f44907c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    private final SharedPreferences f44908a;

    /* renamed from: b */
    private final String f44909b;

    public C11978b(C10412f fVar) {
        this.f44908a = fVar.mo33469m().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f44909b = m57782b(fVar);
    }

    /* renamed from: a */
    private String m57781a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m57782b(C10412f fVar) {
        String f = fVar.mo33471r().mo33484f();
        if (f != null) {
            return f;
        }
        String c = fVar.mo33471r().mo33480c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private static String m57783c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m57784d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m57785e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    /* renamed from: g */
    private String m57786g() {
        String string;
        synchronized (this.f44908a) {
            string = this.f44908a.getString("|S|id", (String) null);
        }
        return string;
    }

    /* renamed from: h */
    private String m57787h() {
        synchronized (this.f44908a) {
            String string = this.f44908a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = m57785e(string);
            if (e == null) {
                return null;
            }
            String c = m57783c(e);
            return c;
        }
    }

    /* renamed from: f */
    public String mo36331f() {
        synchronized (this.f44908a) {
            String g = m57786g();
            if (g != null) {
                return g;
            }
            String h = m57787h();
            return h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo36332i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f44908a
            monitor-enter(r0)
            java.lang.String[] r1 = f44907c     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f44909b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.m57781a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f44908a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.m57784d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p303n8.C11978b.mo36332i():java.lang.String");
    }
}
