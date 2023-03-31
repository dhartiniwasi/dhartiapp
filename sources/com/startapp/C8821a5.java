package com.startapp;

import android.content.Context;
import java.security.PublicKey;

/* renamed from: com.startapp.a5 */
/* compiled from: Sta */
public class C8821a5 {

    /* renamed from: g */
    public static final String f36402g = "insight Core SDK";

    /* renamed from: h */
    public static final String f36403h = "© 2014 - 2020 umlaut insight GmbH";

    /* renamed from: i */
    public static final String f36404i = "20220530140220";

    /* renamed from: j */
    private static C8821a5 f36405j;

    /* renamed from: a */
    private C9655y4 f36406a;

    /* renamed from: b */
    private C9603va f36407b;

    /* renamed from: c */
    private C8844b5 f36408c;

    /* renamed from: d */
    private Context f36409d;

    /* renamed from: e */
    private PublicKey f36410e;

    /* renamed from: f */
    private C8822a f36411f;

    /* renamed from: com.startapp.a5$a */
    /* compiled from: Sta */
    public interface C8822a {
        /* renamed from: a */
        void mo29084a(String str);
    }

    private C8821a5(Context context) {
        this.f36409d = context;
    }

    /* renamed from: a */
    public static void m48251a(Context context, int i) {
        try {
            m48252a(context, C9089ka.m48883a(context.getResources().openRawResource(i)));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Error while opening the raw resource");
        }
    }

    /* renamed from: b */
    public static C9655y4 m48254b() {
        return f36405j.f36406a;
    }

    /* renamed from: c */
    public static C8844b5 m48255c() {
        return f36405j.f36408c;
    }

    /* renamed from: d */
    public static C8822a m48256d() {
        return f36405j.f36411f;
    }

    /* renamed from: e */
    public static PublicKey m48257e() {
        return f36405j.f36410e;
    }

    /* renamed from: f */
    public static synchronized C9603va m48258f() {
        C9603va vaVar;
        synchronized (C8821a5.class) {
            vaVar = f36405j.f36407b;
        }
        return vaVar;
    }

    /* renamed from: g */
    private void m48259g() {
        this.f36407b = new C9603va();
        this.f36408c = new C8844b5(this.f36409d);
    }

    /* renamed from: h */
    public static boolean m48260h() {
        return f36405j != null;
    }

    /* renamed from: a */
    public static void m48252a(Context context, byte[] bArr) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        } else if (bArr == null) {
            throw new IllegalArgumentException("config is null");
        } else if (f36405j == null) {
            try {
                C9676z4 a = C9676z4.m50599a(bArr);
                C8821a5 a5Var = new C8821a5(context);
                f36405j = a5Var;
                a5Var.f36410e = a.f39550a;
                a5Var.f36406a = a.f39551b;
                a5Var.m48259g();
            } catch (Exception unused) {
                throw new IllegalArgumentException("configuration is invalid");
            }
        }
    }

    /* renamed from: a */
    public static void m48253a(C8822a aVar) {
        f36405j.f36411f = aVar;
    }

    /* renamed from: a */
    public static String m48250a() {
        return f36405j.f36408c.mo29198p();
    }
}
