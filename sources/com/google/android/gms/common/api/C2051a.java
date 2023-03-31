package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C2051a.C2055d;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p007a5.C0117m;
import p017b5.C1789c;
import p017b5.C1797g;
import p033d5.C4087c;
import p033d5.C4095d;
import p033d5.C4114j;
import p033d5.C4141r;
import p180z4.C6366d;

/* renamed from: com.google.android.gms.common.api.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2051a<O extends C2055d> {

    /* renamed from: a */
    private final C2052a<?, O> f6046a;

    /* renamed from: b */
    private final C2061g<?> f6047b;

    /* renamed from: c */
    private final String f6048c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class C2052a<T extends C2060f, O> extends C2059e<T, O> {
        /* renamed from: c */
        public T mo7963c(Context context, Looper looper, C4095d dVar, O o, C1789c cVar, C1797g gVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        @Deprecated
        /* renamed from: d */
        public T mo7964d(Context context, Looper looper, C4095d dVar, O o, GoogleApiClient.C2049b bVar, GoogleApiClient.C2050c cVar) {
            return mo7963c(context, looper, dVar, o, bVar, cVar);
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C2053b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C2054c<C extends C2053b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C2055d {

        /* renamed from: a */
        public static final C2058c f6049a = new C2058c((C0117m) null);

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface C2056a extends C2055d {
            /* renamed from: b */
            Account mo7965b();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface C2057b extends C2055d {
            /* renamed from: a */
            GoogleSignInAccount mo7966a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public static final class C2058c implements C2055d {
            private C2058c() {
            }

            /* synthetic */ C2058c(C0117m mVar) {
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class C2059e<T extends C2053b, O> {
        /* renamed from: a */
        public List<Scope> mo7967a(O o) {
            return Collections.emptyList();
        }

        /* renamed from: b */
        public int mo7968b() {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C2060f extends C2053b {
        /* renamed from: a */
        boolean mo6930a();

        /* renamed from: b */
        boolean mo6931b();

        /* renamed from: c */
        Set<Scope> mo6932c();

        /* renamed from: d */
        void mo6933d(String str);

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: e */
        void mo6935e();

        /* renamed from: f */
        boolean mo6936f();

        /* renamed from: g */
        String mo6937g();

        /* renamed from: h */
        void mo6938h(C4087c.C4090c cVar);

        /* renamed from: i */
        void mo6939i(C4114j jVar, Set<Scope> set);

        /* renamed from: j */
        void mo6940j(C4087c.C4092e eVar);

        /* renamed from: l */
        boolean mo6941l();

        /* renamed from: m */
        int mo6942m();

        /* renamed from: n */
        C6366d[] mo6943n();

        /* renamed from: p */
        String mo6946p();

        /* renamed from: r */
        Intent mo6947r();

        /* renamed from: s */
        boolean mo6948s();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C2061g<C extends C2060f> extends C2054c<C> {
    }

    public <C extends C2060f> C2051a(String str, C2052a<C, O> aVar, C2061g<C> gVar) {
        C4141r.m28222l(aVar, "Cannot construct an Api with a null ClientBuilder");
        C4141r.m28222l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f6048c = str;
        this.f6046a = aVar;
        this.f6047b = gVar;
    }

    /* renamed from: a */
    public final C2052a<?, O> mo7959a() {
        return this.f6046a;
    }

    /* renamed from: b */
    public final C2054c<?> mo7960b() {
        return this.f6047b;
    }

    /* renamed from: c */
    public final C2059e<?, O> mo7961c() {
        return this.f6046a;
    }

    /* renamed from: d */
    public final String mo7962d() {
        return this.f6048c;
    }
}
