package com.google.android.gms.internal.p026firebaseauthapi;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ua */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3796ua {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3594o6 f22774a = null;

    /* renamed from: b */
    private String f22775b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3758t5 f22776c = null;

    /* renamed from: d */
    private C3462k6 f22777d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3561n6 f22778e;

    /* renamed from: f */
    private C3957za f22779f = null;

    /* renamed from: h */
    private final C3758t5 m27123h() throws GeneralSecurityException {
        if (Build.VERSION.SDK_INT >= 23) {
            C3925ya yaVar = new C3925ya();
            boolean a = yaVar.mo17071a(this.f22775b);
            if (!a) {
                try {
                    String str = this.f22775b;
                    if (!new C3925ya().mo17071a(str)) {
                        String a2 = C3544mm.m26216a("android-keystore://", str);
                        KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        instance.init(new KeyGenParameterSpec.Builder(a2, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
                        instance.generateKey();
                    } else {
                        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
                    }
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w(C3861wa.f22865d, "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            }
            try {
                return yaVar.mo16540f(this.f22775b);
            } catch (GeneralSecurityException | ProviderException e2) {
                if (!a) {
                    Log.w(C3861wa.f22865d, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f22775b}), e2);
            }
        } else {
            Log.w(C3861wa.f22865d, "Android Keystore requires at least Android M");
            return null;
        }
    }

    /* renamed from: i */
    private final C3561n6 m27124i() throws GeneralSecurityException, IOException {
        C3758t5 t5Var = this.f22776c;
        if (t5Var != null) {
            try {
                return C3561n6.m26283f(C3528m6.m26152h(this.f22779f, t5Var));
            } catch (C3689r2 | GeneralSecurityException e) {
                Log.w(C3861wa.f22865d, "cannot decrypt keyset: ", e);
            }
        }
        return C3561n6.m26283f(C3824v5.m27194b(this.f22779f));
    }

    @Deprecated
    /* renamed from: d */
    public final C3796ua mo16868d(C3607oj ojVar) {
        String E = ojVar.mo16512E();
        byte[] A = ojVar.mo16511D().mo16051A();
        C3674qk C = ojVar.mo16510C();
        int i = C3861wa.f22866e;
        C3674qk qkVar = C3674qk.UNKNOWN_PREFIX;
        int ordinal = C.ordinal();
        int i2 = 4;
        if (ordinal == 1) {
            i2 = 1;
        } else if (ordinal == 2) {
            i2 = 2;
        } else if (ordinal == 3) {
            i2 = 3;
        } else if (ordinal != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        this.f22777d = C3462k6.m25983e(E, A, i2);
        return this;
    }

    /* renamed from: e */
    public final C3796ua mo16869e(String str) {
        if (str.startsWith("android-keystore://")) {
            this.f22775b = str;
            return this;
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    /* renamed from: f */
    public final C3796ua mo16870f(Context context, String str, String str2) throws IOException {
        if (context != null) {
            this.f22779f = new C3957za(context, "GenericIdpKeyset", str2);
            this.f22774a = new C3137ab(context, "GenericIdpKeyset", str2);
            return this;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    /* renamed from: g */
    public final synchronized C3861wa mo16871g() throws GeneralSecurityException, IOException {
        C3561n6 n6Var;
        if (this.f22775b != null) {
            this.f22776c = m27123h();
        }
        try {
            n6Var = m27124i();
        } catch (FileNotFoundException e) {
            if (Log.isLoggable(C3861wa.f22865d, 4)) {
                Log.i(C3861wa.f22865d, String.format("keyset not found, will generate a new one. %s", new Object[]{e.getMessage()}));
            }
            if (this.f22777d != null) {
                n6Var = C3561n6.m26282e();
                n6Var.mo16456c(this.f22777d);
                n6Var.mo16457d(n6Var.mo16455b().mo16379d().mo15907A(0).mo15807z());
                if (this.f22776c != null) {
                    n6Var.mo16455b().mo16381f(this.f22774a, this.f22776c);
                } else {
                    C3824v5.m27193a(n6Var.mo16455b(), this.f22774a);
                }
            } else {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }
        this.f22778e = n6Var;
        return new C3861wa(this, (C3829va) null);
    }
}
