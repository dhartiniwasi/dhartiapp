package com.onesignal;

import android.content.Context;
import android.util.Base64;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.C8338d3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import p218e6.C9975i;
import p218e6.C9980l;
import p246h7.C10412f;
import p246h7.C10423n;

/* renamed from: com.onesignal.v3 */
/* compiled from: PushRegistratorFCM */
class C8634v3 extends C8625u3 {

    /* renamed from: f */
    private C10412f f36089f;

    /* renamed from: g */
    private final Context f36090g;

    /* renamed from: h */
    private final C8635a f36091h;

    /* renamed from: com.onesignal.v3$a */
    /* compiled from: PushRegistratorFCM */
    static class C8635a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f36092a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f36093b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f36094c;

        C8635a() {
            this((String) null, (String) null, (String) null);
        }

        C8635a(String str, String str2, String str3) {
            this.f36092a = str == null ? "onesignal-shared-public" : str;
            this.f36093b = str2 == null ? "1:754795614042:android:c682b8144a8dd52bc1ad63" : str2;
            this.f36094c = str3 == null ? new String(Base64.decode("QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV", 0)) : str3;
        }
    }

    C8634v3(Context context, C8635a aVar) {
        this.f36090g = context;
        if (aVar == null) {
            this.f36091h = new C8635a();
        } else {
            this.f36091h = aVar;
        }
    }

    @Deprecated
    /* renamed from: l */
    private String m47792l(String str) throws IOException {
        Class<String> cls = String.class;
        Class<FirebaseInstanceId> cls2 = FirebaseInstanceId.class;
        try {
            int i = FirebaseInstanceId.f34471m;
            Object invoke = cls2.getMethod("getInstance", new Class[]{C10412f.class}).invoke((Object) null, new Object[]{this.f36089f});
            return (String) invoke.getClass().getMethod("getToken", new Class[]{cls, cls}).invoke(invoke, new Object[]{str, "FCM"});
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", e);
        }
    }

    /* renamed from: m */
    private String m47793m() throws Exception {
        C9975i u = ((FirebaseMessaging) this.f36089f.mo33468k(FirebaseMessaging.class)).mo26586u();
        try {
            return (String) C9980l.m51027a(u);
        } catch (ExecutionException unused) {
            throw u.mo26357l();
        }
    }

    /* renamed from: n */
    private void m47794n(String str) {
        if (this.f36089f == null) {
            this.f36089f = C10412f.m52587w(this.f36090g, new C10423n.C10425b().mo33494f(str).mo33491c(this.f36091h.f36093b).mo33490b(this.f36091h.f36094c).mo33495g(this.f36091h.f36092a).mo33489a(), "ONESIGNAL_SDK_FCM_APP_NAME");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo28239f() {
        return "FCM";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo28240g(String str) throws Exception {
        m47794n(str);
        try {
            return m47793m();
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            C8338d3.m46492a(C8338d3.C8384r0.INFO, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken");
            return m47792l(str);
        }
    }
}
