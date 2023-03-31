package com.google.android.gms.internal.p026firebaseauthapi;

import android.content.Context;
import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import p033d5.C4141r;
import p218e6.C9980l;
import p246h7.C10412f;
import p257i8.C10561i;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3452jt {

    /* renamed from: a */
    private final Context f22243a;

    /* renamed from: b */
    private C3288eu f22244b;

    /* renamed from: c */
    private final String f22245c;

    /* renamed from: d */
    private final C10412f f22246d;

    /* renamed from: e */
    private boolean f22247e = false;

    /* renamed from: f */
    private String f22248f;

    public C3452jt(Context context, C10412f fVar, String str) {
        this.f22243a = (Context) C4141r.m28221k(context);
        this.f22246d = (C10412f) C4141r.m28221k(fVar);
        this.f22245c = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    /* renamed from: a */
    public final void mo16233a(URLConnection uRLConnection) {
        String str;
        String str2;
        if (this.f22247e) {
            str = String.valueOf(this.f22245c).concat("/FirebaseUI-Android");
        } else {
            str = String.valueOf(this.f22245c).concat("/FirebaseCore-Android");
        }
        if (this.f22244b == null) {
            Context context = this.f22243a;
            this.f22244b = new C3288eu(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.f22244b.mo16003b());
        uRLConnection.setRequestProperty("X-Android-Cert", this.f22244b.mo16002a());
        uRLConnection.setRequestProperty("Accept-Language", C3485kt.m26018a());
        uRLConnection.setRequestProperty("X-Client-Version", str);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.f22248f);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.f22246d.mo33471r().mo33480c());
        C10561i iVar = (C10561i) FirebaseAuth.getInstance(this.f22246d).mo26038r0().get();
        if (iVar != null) {
            try {
                str2 = (String) C9980l.m51027a(iVar.mo33753a());
            } catch (InterruptedException | ExecutionException e) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: ".concat(String.valueOf(e.getMessage())));
            }
            uRLConnection.setRequestProperty("X-Firebase-Client", str2);
            this.f22248f = null;
        }
        str2 = null;
        uRLConnection.setRequestProperty("X-Firebase-Client", str2);
        this.f22248f = null;
    }

    /* renamed from: b */
    public final void mo16234b(String str) {
        this.f22248f = str;
    }
}
