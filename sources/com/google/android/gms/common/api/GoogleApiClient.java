package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.internal.C2073b;
import com.google.android.gms.common.api.internal.C2087f0;
import com.google.android.gms.common.api.internal.C2092g1;
import com.google.android.gms.common.api.internal.C2136y0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p007a5.C0111g;
import p017b5.C1789c;
import p017b5.C1791d;
import p017b5.C1797g;
import p017b5.C1806k0;
import p033d5.C4093c0;
import p033d5.C4095d;
import p033d5.C4141r;
import p124r.C5413a;
import p180z4.C6368e;
import p189b6.C6606a;
import p189b6.C6610e;
import p189b6.C6611f;

@Deprecated
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class GoogleApiClient {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Set<GoogleApiClient> f6012a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C2048a {

        /* renamed from: a */
        private Account f6013a;

        /* renamed from: b */
        private final Set<Scope> f6014b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f6015c = new HashSet();

        /* renamed from: d */
        private int f6016d;

        /* renamed from: e */
        private View f6017e;

        /* renamed from: f */
        private String f6018f;

        /* renamed from: g */
        private String f6019g;

        /* renamed from: h */
        private final Map<C2051a<?>, C4093c0> f6020h = new C5413a();

        /* renamed from: i */
        private final Context f6021i;

        /* renamed from: j */
        private final Map<C2051a<?>, C2051a.C2055d> f6022j = new C5413a();

        /* renamed from: k */
        private C1791d f6023k;

        /* renamed from: l */
        private int f6024l = -1;

        /* renamed from: m */
        private C2050c f6025m;

        /* renamed from: n */
        private Looper f6026n;

        /* renamed from: o */
        private C6368e f6027o = C6368e.m37415q();

        /* renamed from: p */
        private C2051a.C2052a<? extends C6611f, C6606a> f6028p = C6610e.f31073c;

        /* renamed from: q */
        private final ArrayList<C2049b> f6029q = new ArrayList<>();

        /* renamed from: r */
        private final ArrayList<C2050c> f6030r = new ArrayList<>();

        public C2048a(Context context) {
            this.f6021i = context;
            this.f6026n = context.getMainLooper();
            this.f6018f = context.getPackageName();
            this.f6019g = context.getClass().getName();
        }

        /* renamed from: a */
        public C2048a mo7938a(C2051a<Object> aVar) {
            C4141r.m28222l(aVar, "Api must not be null");
            this.f6022j.put(aVar, (Object) null);
            List<Scope> a = ((C2051a.C2059e) C4141r.m28222l(aVar.mo7961c(), "Base client builder must not be null")).mo7967a(null);
            this.f6015c.addAll(a);
            this.f6014b.addAll(a);
            return this;
        }

        /* renamed from: b */
        public C2048a mo7939b(C2049b bVar) {
            C4141r.m28222l(bVar, "Listener must not be null");
            this.f6029q.add(bVar);
            return this;
        }

        /* renamed from: c */
        public C2048a mo7940c(C2050c cVar) {
            C4141r.m28222l(cVar, "Listener must not be null");
            this.f6030r.add(cVar);
            return this;
        }

        /* renamed from: d */
        public GoogleApiClient mo7941d() {
            C4141r.m28212b(!this.f6022j.isEmpty(), "must call addApi() to add at least one API");
            C4095d f = mo7943f();
            Map<C2051a<?>, C4093c0> i = f.mo17367i();
            C5413a aVar = new C5413a();
            C5413a aVar2 = new C5413a();
            ArrayList arrayList = new ArrayList();
            C2051a aVar3 = null;
            boolean z = false;
            for (C2051a next : this.f6022j.keySet()) {
                C2051a.C2055d dVar = this.f6022j.get(next);
                boolean z2 = i.get(next) != null;
                aVar.put(next, Boolean.valueOf(z2));
                C1806k0 k0Var = new C1806k0(next, z2);
                arrayList.add(k0Var);
                C2051a.C2052a aVar4 = (C2051a.C2052a) C4141r.m28221k(next.mo7959a());
                C2051a aVar5 = next;
                C2051a.C2060f d = aVar4.mo7964d(this.f6021i, this.f6026n, f, dVar, k0Var, k0Var);
                aVar2.put(aVar5.mo7960b(), d);
                if (aVar4.mo7968b() == 1) {
                    z = dVar != null;
                }
                if (d.mo6931b()) {
                    if (aVar3 == null) {
                        aVar3 = aVar5;
                    } else {
                        String d2 = aVar5.mo7962d();
                        String d3 = aVar3.mo7962d();
                        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 21 + String.valueOf(d3).length());
                        sb.append(d2);
                        sb.append(" cannot be used with ");
                        sb.append(d3);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (aVar3 != null) {
                if (!z) {
                    C4141r.m28226p(this.f6013a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar3.mo7962d());
                    C4141r.m28226p(this.f6014b.equals(this.f6015c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar3.mo7962d());
                } else {
                    String d4 = aVar3.mo7962d();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d4).length() + 82);
                    sb2.append("With using ");
                    sb2.append(d4);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            C2087f0 f0Var = new C2087f0(this.f6021i, new ReentrantLock(), this.f6026n, f, this.f6027o, this.f6028p, aVar, this.f6029q, this.f6030r, aVar2, this.f6024l, C2087f0.m9257m(aVar2.values(), true), arrayList);
            synchronized (GoogleApiClient.f6012a) {
                GoogleApiClient.f6012a.add(f0Var);
            }
            if (this.f6024l >= 0) {
                C2092g1.m9290t(this.f6023k).mo8070u(this.f6024l, f0Var, this.f6025m);
            }
            return f0Var;
        }

        /* renamed from: e */
        public C2048a mo7942e(Handler handler) {
            C4141r.m28222l(handler, "Handler must not be null");
            this.f6026n = handler.getLooper();
            return this;
        }

        /* renamed from: f */
        public final C4095d mo7943f() {
            C6606a aVar = C6606a.f31061k;
            Map<C2051a<?>, C2051a.C2055d> map = this.f6022j;
            C2051a<C6606a> aVar2 = C6610e.f31077g;
            if (map.containsKey(aVar2)) {
                aVar = (C6606a) this.f6022j.get(aVar2);
            }
            return new C4095d(this.f6013a, this.f6014b, this.f6020h, this.f6016d, this.f6017e, this.f6018f, this.f6019g, aVar, false);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$b */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C2049b extends C1789c {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$c */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C2050c extends C1797g {
    }

    public abstract void connect();

    /* renamed from: d */
    public abstract void mo6964d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void disconnect();

    /* renamed from: e */
    public <A extends C2051a.C2053b, R extends C0111g, T extends C2073b<R, A>> T mo6989e(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public <A extends C2051a.C2053b, T extends C2073b<? extends C0111g, A>> T mo6990f(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public Looper mo6991g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public abstract boolean mo6966h();

    /* renamed from: i */
    public abstract void mo6967i(C2050c cVar);

    /* renamed from: j */
    public abstract void mo6968j(C2050c cVar);

    /* renamed from: k */
    public void mo6992k(C2136y0 y0Var) {
        throw new UnsupportedOperationException();
    }
}
