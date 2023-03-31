package com.google.android.gms.internal.p026firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.za */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3957za {

    /* renamed from: a */
    private final SharedPreferences f22982a;

    /* renamed from: b */
    private final String f22983b = "GenericIdpKeyset";

    public C3957za(Context context, String str, String str2) throws IOException {
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f22982a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.f22982a = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    /* renamed from: c */
    private final byte[] m27545c() throws IOException {
        try {
            String string = this.f22982a.getString(this.f22983b, (String) null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.f22983b}));
            } else if (string.length() % 2 == 0) {
                int length = string.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i + i;
                    int digit = Character.digit(string.charAt(i2), 16);
                    int digit2 = Character.digit(string.charAt(i2 + 1), 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new IllegalArgumentException("input is not hexadecimal");
                    }
                    bArr[i] = (byte) ((digit * 16) + digit2);
                }
                return bArr;
            } else {
                throw new IllegalArgumentException("Expected a string of even length");
            }
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.f22983b}));
        }
    }

    /* renamed from: a */
    public final C3276ei mo17100a() throws IOException {
        return C3276ei.m25505B(m27545c(), C3852w1.m27266a());
    }

    /* renamed from: b */
    public final C3902xj mo17101b() throws IOException {
        return C3902xj.m27383E(m27545c(), C3852w1.m27266a());
    }
}
