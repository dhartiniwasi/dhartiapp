package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.C2051a.C2055d;
import com.google.android.gms.common.api.internal.C2073b;
import com.google.android.gms.common.api.internal.C2076c;
import com.google.android.gms.common.api.internal.C2089g;
import com.google.android.gms.common.api.internal.C2105l;
import com.google.android.gms.common.api.internal.C2115o0;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import p007a5.C0111g;
import p017b5.C1785a;
import p017b5.C1787b;
import p017b5.C1795f;
import p017b5.C1798g0;
import p017b5.C1803j;
import p017b5.C1821s;
import p033d5.C4087c;
import p033d5.C4095d;
import p033d5.C4141r;
import p067i5.C4699m;
import p218e6.C9975i;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.common.api.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C2063c<O extends C2051a.C2055d> {

    /* renamed from: a */
    private final Context f6051a;

    /* renamed from: b */
    private final String f6052b;

    /* renamed from: c */
    private final C2051a<O> f6053c;

    /* renamed from: d */
    private final O f6054d;

    /* renamed from: e */
    private final C1787b<O> f6055e;

    /* renamed from: f */
    private final Looper f6056f;

    /* renamed from: g */
    private final int f6057g;

    /* renamed from: h */
    private final GoogleApiClient f6058h;

    /* renamed from: i */
    private final C1803j f6059i;

    /* renamed from: j */
    protected final C2076c f6060j;

    /* renamed from: com.google.android.gms.common.api.c$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C2064a {

        /* renamed from: c */
        public static final C2064a f6061c = new C2065a().mo7983a();

        /* renamed from: a */
        public final C1803j f6062a;

        /* renamed from: b */
        public final Looper f6063b;

        /* renamed from: com.google.android.gms.common.api.c$a$a */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public static class C2065a {

            /* renamed from: a */
            private C1803j f6064a;

            /* renamed from: b */
            private Looper f6065b;

            /* renamed from: a */
            public C2064a mo7983a() {
                if (this.f6064a == null) {
                    this.f6064a = new C1785a();
                }
                if (this.f6065b == null) {
                    this.f6065b = Looper.getMainLooper();
                }
                return new C2064a(this.f6064a, this.f6065b);
            }

            /* renamed from: b */
            public C2065a mo7984b(C1803j jVar) {
                C4141r.m28222l(jVar, "StatusExceptionMapper must not be null.");
                this.f6064a = jVar;
                return this;
            }
        }

        private C2064a(C1803j jVar, Account account, Looper looper) {
            this.f6062a = jVar;
            this.f6063b = looper;
        }
    }

    private C2063c(Context context, Activity activity, C2051a<O> aVar, O o, C2064a aVar2) {
        C4141r.m28222l(context, "Null context is not permitted.");
        C4141r.m28222l(aVar, "Api must not be null.");
        C4141r.m28222l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f6051a = context.getApplicationContext();
        String str = null;
        if (C4699m.m30421l()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f6052b = str;
        this.f6053c = aVar;
        this.f6054d = o;
        this.f6056f = aVar2.f6063b;
        C1787b<O> a = C1787b.m8420a(aVar, o, str);
        this.f6055e = a;
        this.f6058h = new C1821s(this);
        C2076c x = C2076c.m9223x(this.f6051a);
        this.f6060j = x;
        this.f6057g = x.mo8046m();
        this.f6059i = aVar2.f6062a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C2105l.m9368u(activity, x, a);
        }
        x.mo8040b(this);
    }

    /* renamed from: p */
    private final <A extends C2051a.C2053b, T extends C2073b<? extends C0111g, A>> T m9097p(int i, T t) {
        t.mo7995l();
        this.f6060j.mo8035D(this, i, t);
        return t;
    }

    /* renamed from: q */
    private final <TResult, A extends C2051a.C2053b> C9975i<TResult> m9098q(int i, C2089g<A, TResult> gVar) {
        C9977j jVar = new C9977j();
        this.f6060j.mo8036E(this, i, gVar, jVar, this.f6059i);
        return jVar.mo32542a();
    }

    /* renamed from: c */
    public GoogleApiClient mo7970c() {
        return this.f6058h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C4095d.C4096a mo7971d() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount a;
        C4095d.C4096a aVar = new C4095d.C4096a();
        O o = this.f6054d;
        if (!(o instanceof C2051a.C2055d.C2057b) || (a = ((C2051a.C2055d.C2057b) o).mo7966a()) == null) {
            O o2 = this.f6054d;
            account = o2 instanceof C2051a.C2055d.C2056a ? ((C2051a.C2055d.C2056a) o2).mo7965b() : null;
        } else {
            account = a.mo7919I1();
        }
        aVar.mo17372d(account);
        O o3 = this.f6054d;
        if (o3 instanceof C2051a.C2055d.C2057b) {
            GoogleSignInAccount a2 = ((C2051a.C2055d.C2057b) o3).mo7966a();
            if (a2 == null) {
                set = Collections.emptySet();
            } else {
                set = a2.mo7924N1();
            }
        } else {
            set = Collections.emptySet();
        }
        aVar.mo17371c(set);
        aVar.mo17373e(this.f6051a.getClass().getName());
        aVar.mo17370b(this.f6051a.getPackageName());
        return aVar;
    }

    /* renamed from: e */
    public <TResult, A extends C2051a.C2053b> C9975i<TResult> mo7972e(C2089g<A, TResult> gVar) {
        return m9098q(2, gVar);
    }

    /* renamed from: f */
    public <A extends C2051a.C2053b, T extends C2073b<? extends C0111g, A>> T mo7973f(T t) {
        m9097p(0, t);
        return t;
    }

    /* renamed from: g */
    public <TResult, A extends C2051a.C2053b> C9975i<TResult> mo7974g(C2089g<A, TResult> gVar) {
        return m9098q(0, gVar);
    }

    /* renamed from: h */
    public <A extends C2051a.C2053b, T extends C2073b<? extends C0111g, A>> T mo7975h(T t) {
        m9097p(1, t);
        return t;
    }

    /* renamed from: i */
    public <TResult, A extends C2051a.C2053b> C9975i<TResult> mo7976i(C2089g<A, TResult> gVar) {
        return m9098q(1, gVar);
    }

    /* renamed from: j */
    public final C1787b<O> mo7977j() {
        return this.f6055e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo7978k() {
        return this.f6052b;
    }

    /* renamed from: l */
    public Looper mo7979l() {
        return this.f6056f;
    }

    /* renamed from: m */
    public final int mo7980m() {
        return this.f6057g;
    }

    /* renamed from: n */
    public final C2051a.C2060f mo7981n(Looper looper, C2115o0<O> o0Var) {
        Looper looper2 = looper;
        C2051a.C2060f d = ((C2051a.C2052a) C4141r.m28221k(this.f6053c.mo7959a())).mo7964d(this.f6051a, looper2, mo7971d().mo17369a(), this.f6054d, o0Var, o0Var);
        String k = mo7978k();
        if (k != null && (d instanceof C4087c)) {
            ((C4087c) d).mo17334T(k);
        }
        if (k != null && (d instanceof C1795f)) {
            ((C1795f) d).mo6951v(k);
        }
        return d;
    }

    /* renamed from: o */
    public final C1798g0 mo7982o(Context context, Handler handler) {
        return new C1798g0(context, handler, mo7971d().mo17369a());
    }

    public C2063c(Context context, C2051a<O> aVar, O o, C2064a aVar2) {
        this(context, (Activity) null, aVar, o, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2063c(android.content.Context r2, com.google.android.gms.common.api.C2051a<O> r3, O r4, p017b5.C1803j r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.c$a$a r0 = new com.google.android.gms.common.api.c$a$a
            r0.<init>()
            r0.mo7984b(r5)
            com.google.android.gms.common.api.c$a r5 = r0.mo7983a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.C2063c.C2064a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C2063c.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, b5.j):void");
    }
}
