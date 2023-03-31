package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.core.content.C0681a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.p */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7458p extends C7332d5 {

    /* renamed from: c */
    private long f32844c;

    /* renamed from: d */
    private String f32845d;

    /* renamed from: e */
    private AccountManager f32846e;

    /* renamed from: f */
    private Boolean f32847f;

    /* renamed from: g */
    private long f32848g;

    C7458p(C7397j4 j4Var) {
        super(j4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo24235h() {
        Calendar instance = Calendar.getInstance();
        this.f32844c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f32845d = lowerCase + "-" + lowerCase2;
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final long mo24599n() {
        mo24189f();
        return this.f32848g;
    }

    /* renamed from: o */
    public final long mo24600o() {
        mo24236i();
        return this.f32844c;
    }

    /* renamed from: p */
    public final String mo24601p() {
        mo24236i();
        return this.f32845d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo24602q() {
        mo24189f();
        this.f32847f = null;
        this.f32848g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo24603r() {
        mo24189f();
        long a = this.f32389a.mo24116a().mo18370a();
        if (a - this.f32848g > 86400000) {
            this.f32847f = null;
        }
        Boolean bool = this.f32847f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C0681a.m3145a(this.f32389a.mo24121d(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f32389a.mo24135l().mo24263y().mo24208a("Permission error checking for dasher/unicorn accounts");
            this.f32848g = a;
            this.f32847f = Boolean.FALSE;
            return false;
        }
        if (this.f32846e == null) {
            this.f32846e = AccountManager.get(this.f32389a.mo24121d());
        }
        try {
            Account[] result = this.f32846e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f32846e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f32847f = Boolean.TRUE;
                    this.f32848g = a;
                    return true;
                }
                this.f32848g = a;
                this.f32847f = Boolean.FALSE;
                return false;
            }
            this.f32847f = Boolean.TRUE;
            this.f32848g = a;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.f32389a.mo24135l().mo24258t().mo24209b("Exception checking account types", e);
        }
    }
}
