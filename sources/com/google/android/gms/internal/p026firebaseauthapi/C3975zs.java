package com.google.android.gms.internal.p026firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import p054g5.C4410a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zs */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public interface C3975zs {

    /* renamed from: l */
    public static final C4410a f22996l = new C4410a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    /* renamed from: a */
    Uri.Builder mo17128a(Intent intent, String str, String str2);

    /* renamed from: b */
    HttpURLConnection mo17129b(URL url);

    /* renamed from: c */
    void mo17130c(Uri uri, String str);

    /* renamed from: d */
    void mo17131d(String str, Status status);

    /* renamed from: x */
    String mo17132x(String str);

    Context zza();
}
