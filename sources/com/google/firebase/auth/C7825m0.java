package com.google.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p026firebaseauthapi.C3126a0;
import com.google.android.gms.internal.p026firebaseauthapi.C3386ht;
import com.google.android.gms.internal.p026firebaseauthapi.C3783tu;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p033d5.C4141r;

/* renamed from: com.google.firebase.auth.m0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7825m0 extends C7829n {

    /* renamed from: a */
    private final Bundle f34154a;

    /* renamed from: com.google.firebase.auth.m0$a */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class C7826a {

        /* renamed from: a */
        private final FirebaseAuth f34155a;

        /* renamed from: b */
        final Bundle f34156b;

        /* renamed from: c */
        private final Bundle f34157c;

        /* synthetic */ C7826a(String str, FirebaseAuth firebaseAuth, C7791d1 d1Var) {
            Bundle bundle = new Bundle();
            this.f34156b = bundle;
            Bundle bundle2 = new Bundle();
            this.f34157c = bundle2;
            this.f34155a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.mo26030l().mo33471r().mo33479b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", C3386ht.m25724a().mo16109b());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.mo26034p());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.mo26030l().mo33470q());
        }

        /* renamed from: a */
        public C7826a mo26138a(Map<String, String> map) {
            for (Map.Entry next : map.entrySet()) {
                this.f34157c.putString((String) next.getKey(), (String) next.getValue());
            }
            return this;
        }

        /* renamed from: b */
        public C7825m0 mo26139b() {
            return new C7825m0(this.f34156b, (C7800f1) null);
        }

        /* renamed from: c */
        public C7826a mo26140c(List<String> list) {
            this.f34156b.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList(list));
            return this;
        }
    }

    /* renamed from: com.google.firebase.auth.m0$b */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class C7827b {

        /* renamed from: a */
        private final String f34158a;

        /* renamed from: b */
        private String f34159b;

        /* renamed from: c */
        private String f34160c;

        /* renamed from: d */
        private String f34161d;

        /* synthetic */ C7827b(String str, C7796e1 e1Var) {
            this.f34158a = str;
        }

        /* renamed from: a */
        public C7806h mo26141a() {
            String str = this.f34158a;
            String str2 = this.f34159b;
            String str3 = this.f34160c;
            String str4 = this.f34161d;
            Parcelable.Creator<C7840p1> creator = C7840p1.CREATOR;
            C4141r.m28218h(str, "Must specify a non-empty providerId");
            if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                return new C7840p1(str, str2, str3, (C3126a0) null, (String) null, (String) null, str4);
            }
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }

        /* renamed from: b */
        public C7827b mo26142b(String str) {
            this.f34160c = str;
            return this;
        }

        /* renamed from: c */
        public C7827b mo26143c(String str) {
            this.f34159b = str;
            return this;
        }

        /* renamed from: d */
        public C7827b mo26144d(String str, String str2) {
            this.f34159b = str;
            this.f34161d = str2;
            return this;
        }
    }

    /* synthetic */ C7825m0(Bundle bundle, C7800f1 f1Var) {
        this.f34154a = bundle;
    }

    /* renamed from: d */
    public static C7826a m43432d(String str) {
        return m43433e(str, FirebaseAuth.getInstance());
    }

    /* renamed from: e */
    public static C7826a m43433e(String str, FirebaseAuth firebaseAuth) {
        C4141r.m28217g(str);
        C4141r.m28221k(firebaseAuth);
        if (!"facebook.com".equals(str) || C3783tu.m27057g(firebaseAuth.mo26030l())) {
            return new C7826a(str, firebaseAuth, (C7791d1) null);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    /* renamed from: f */
    public static C7827b m43434f(String str) {
        return new C7827b(C4141r.m28217g(str), (C7796e1) null);
    }

    /* renamed from: a */
    public final void mo26135a(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f34154a);
        activity.startActivity(intent);
    }

    /* renamed from: b */
    public final void mo26136b(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f34154a);
        activity.startActivity(intent);
    }

    /* renamed from: c */
    public final void mo26137c(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f34154a);
        activity.startActivity(intent);
    }
}
