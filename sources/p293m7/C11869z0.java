package p293m7;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p026firebaseauthapi.C3594o6;
import com.google.android.gms.internal.p026firebaseauthapi.C3663q9;
import com.google.android.gms.internal.p026firebaseauthapi.C3791u5;
import com.google.android.gms.internal.p026firebaseauthapi.C3796ua;
import com.google.android.gms.internal.p026firebaseauthapi.C3828v9;
import com.google.android.gms.internal.p026firebaseauthapi.C3844vp;
import com.google.android.gms.internal.p026firebaseauthapi.C3861wa;
import com.google.android.gms.internal.p026firebaseauthapi.C3920y5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* renamed from: m7.z0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11869z0 {

    /* renamed from: c */
    private static C11869z0 f44601c;

    /* renamed from: a */
    private final String f44602a;

    /* renamed from: b */
    private final C3861wa f44603b;

    private C11869z0(Context context, String str, boolean z) {
        C3861wa waVar;
        this.f44602a = str;
        try {
            C3663q9.m26553a();
            C3796ua uaVar = new C3796ua();
            uaVar.mo16870f(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", new Object[]{str}));
            uaVar.mo16868d(C3828v9.f22808b);
            uaVar.mo16869e(String.format("android-keystore://firebear_master_key_id.%s", new Object[]{str}));
            waVar = uaVar.mo16871g();
        } catch (IOException | GeneralSecurityException e) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n".concat(String.valueOf(e.getMessage())));
            waVar = null;
        }
        this.f44603b = waVar;
    }

    /* renamed from: a */
    public static C11869z0 m57356a(Context context, String str) {
        C11869z0 z0Var = f44601c;
        if (z0Var == null || !C3844vp.m27242a(z0Var.f44602a, str)) {
            f44601c = new C11869z0(context, str, true);
        }
        return f44601c;
    }

    /* renamed from: b */
    public final String mo36122b(String str) {
        String str2;
        C3861wa waVar = this.f44603b;
        if (waVar != null) {
            try {
                synchronized (waVar) {
                    str2 = new String(((C3920y5) this.f44603b.mo16982a().mo16380e(C3920y5.class)).mo15949a(Base64.decode(str, 8), (byte[]) null), "UTF-8");
                }
                return str2;
            } catch (UnsupportedEncodingException | GeneralSecurityException e) {
                Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e.getMessage())));
                return null;
            }
        } else {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
    }

    /* renamed from: c */
    public final String mo36123c() {
        if (this.f44603b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C3594o6 c = C3791u5.m27102c(byteArrayOutputStream);
        try {
            synchronized (this.f44603b) {
                this.f44603b.mo16982a().mo16377b().mo16382g(c);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e.getMessage())));
            return null;
        }
    }
}
