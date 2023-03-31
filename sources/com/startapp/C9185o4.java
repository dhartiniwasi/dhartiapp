package com.startapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import com.startapp.C8871c2;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.startapp.o4 */
/* compiled from: Sta */
public class C9185o4 {

    /* renamed from: a */
    public final C9111l4 f37976a;

    /* renamed from: b */
    public final C9256r3 f37977b;

    /* renamed from: c */
    public final Executor f37978c;

    /* renamed from: d */
    public final C8908d3<Integer> f37979d;

    /* renamed from: e */
    public final C8871c2 f37980e;

    /* renamed from: f */
    public final C8873c3<C9023i4, C9063k4, C9147n4, C9551t4> f37981f;

    /* renamed from: g */
    public final C8908d3<AnalyticsConfig> f37982g;

    /* renamed from: h */
    public final Map<String, Pair<C9063k4, Long>> f37983h = new HashMap();

    /* renamed from: i */
    public final AtomicLong f37984i = new AtomicLong();

    /* renamed from: j */
    public final C8908d3<Void> f37985j = new C9186a();

    /* renamed from: k */
    public final Runnable f37986k = new C9187b();

    /* renamed from: l */
    public final C8908d3<Void> f37987l = new C9188c();

    /* renamed from: m */
    public final C9147n4 f37988m = new C9189d();

    /* renamed from: n */
    public final C8842b3<C9023i4, Void> f37989n = new C9192g();

    /* renamed from: com.startapp.o4$a */
    /* compiled from: Sta */
    public class C9186a implements C8908d3<Void> {
        public C9186a() {
        }

        public Object call() {
            try {
                C9185o4 o4Var = C9185o4.this;
                o4Var.f37977b.execute(new C9239q4(o4Var));
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.startapp.o4$b */
    /* compiled from: Sta */
    public class C9187b implements Runnable {
        public C9187b() {
        }

        public void run() {
            try {
                C9185o4.this.mo29788b();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.startapp.o4$c */
    /* compiled from: Sta */
    public class C9188c implements C8908d3<Void> {
        public C9188c() {
        }

        public Object call() {
            try {
                C9185o4.this.mo29783a(0);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.startapp.o4$d */
    /* compiled from: Sta */
    public class C9189d implements C9147n4 {
        public C9189d() {
        }

        /* renamed from: a */
        public void mo29453a(C9023i4 i4Var, int i) {
            try {
                C9185o4 o4Var = C9185o4.this;
                o4Var.getClass();
                o4Var.f37977b.execute(new C9212p4(o4Var, i4Var, i, System.currentTimeMillis()));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.startapp.o4$e */
    /* compiled from: Sta */
    public class C9190e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9023i4 f37994a;

        /* renamed from: b */
        public final /* synthetic */ C9063k4 f37995b;

        /* renamed from: c */
        public final /* synthetic */ C9147n4 f37996c;

        public C9190e(C9023i4 i4Var, C9063k4 k4Var, C9147n4 n4Var) {
            this.f37994a = i4Var;
            this.f37995b = k4Var;
            this.f37996c = n4Var;
        }

        public void run() {
            int i;
            C9185o4 o4Var = C9185o4.this;
            C9023i4 i4Var = this.f37994a;
            C9063k4 k4Var = this.f37995b;
            C9147n4 n4Var = this.f37996c;
            o4Var.getClass();
            try {
                i = o4Var.f37976a.mo29660a(i4Var, k4Var) ? 2 : 3;
                if (n4Var == null) {
                    return;
                }
            } catch (Throwable unused) {
                if (n4Var != null) {
                    i = 0;
                } else {
                    return;
                }
            }
            n4Var.mo29453a(i4Var, i);
        }
    }

    /* renamed from: com.startapp.o4$f */
    /* compiled from: Sta */
    public class C9191f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9023i4 f37998a;

        /* renamed from: b */
        public final /* synthetic */ C9063k4 f37999b;

        /* renamed from: c */
        public final /* synthetic */ C9147n4 f38000c;

        public C9191f(long j, C9023i4 i4Var, C9063k4 k4Var, C9147n4 n4Var) {
            this.f37998a = i4Var;
            this.f37999b = k4Var;
            this.f38000c = n4Var;
        }

        public void run() {
            C9185o4.this.mo29786a(this.f37998a, this.f37999b, this.f38000c);
        }
    }

    /* renamed from: com.startapp.o4$g */
    /* compiled from: Sta */
    public class C9192g implements C8842b3<C9023i4, Void> {
        public C9192g() {
        }

        /* renamed from: a */
        public Object mo29129a(Object obj) {
            C9023i4 i4Var = (C9023i4) obj;
            if (i4Var == null) {
                return null;
            }
            try {
                C9185o4.this.mo29784a(i4Var);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public C9185o4(C9111l4 l4Var, C9256r3 r3Var, Executor executor, C8908d3<Integer> d3Var, C8871c2 c2Var, C8873c3<C9023i4, C9063k4, C9147n4, C9551t4> c3Var, C8908d3<AnalyticsConfig> d3Var2) {
        this.f37976a = l4Var;
        this.f37977b = r3Var;
        this.f37978c = executor;
        this.f37979d = d3Var;
        this.f37980e = c2Var;
        this.f37981f = c3Var;
        this.f37982g = d3Var2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo29784a(C9023i4 i4Var) {
        C9063k4 a = mo29781a(i4Var.f36949a);
        long uptimeMillis = (this.f37984i.get() + a.f37043f) - SystemClock.uptimeMillis();
        if (uptimeMillis > 0) {
            mo29783a(uptimeMillis);
            return;
        }
        C9111l4 l4Var = this.f37976a;
        long currentTimeMillis = System.currentTimeMillis();
        l4Var.getClass();
        long j = i4Var.f36950b;
        C9111l4.m48936a(j, currentTimeMillis);
        SQLiteDatabase a2 = l4Var.mo29679a();
        a2.beginTransaction();
        try {
            int a3 = C9111l4.m48935a(a2, j);
            ContentValues contentValues = new ContentValues();
            contentValues.put("send", Long.valueOf(currentTimeMillis));
            contentValues.put("attempt", Integer.valueOf(a3 + 1));
            a2.update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
            a2.setTransactionSuccessful();
            a2.endTransaction();
            mo29786a(i4Var, a, this.f37988m);
        } catch (Throwable th) {
            a2.endTransaction();
            throw th;
        }
    }

    /* renamed from: b */
    public void mo29788b() {
        this.f37977b.mo29865a(this.f37986k);
        if (!this.f37980e.mo29241a()) {
            AnalyticsConfig call = this.f37982g.call();
            long j = 300000;
            if (call != null) {
                j = Math.max(300000, C9605vb.m50478e(call.mo30945f()));
            }
            mo29783a(j);
            return;
        }
        Integer call2 = this.f37979d.call();
        int i = 1;
        int max = call2 != null ? Math.max(1, call2.intValue()) : 1;
        AnalyticsConfig call3 = this.f37982g.call();
        if (call3 != null) {
            i = Math.max(1, call3.mo30946g());
        }
        try {
            this.f37976a.mo29659a(this.f37989n, i, max);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo29782a() {
        ConnectivityManager connectivityManager;
        if (this.f37984i.compareAndSet(0, SystemClock.uptimeMillis())) {
            C9111l4 l4Var = this.f37976a;
            C8908d3<Void> d3Var = this.f37987l;
            synchronized (l4Var) {
                l4Var.f37272c.add(d3Var);
            }
            C8871c2 c2Var = this.f37980e;
            C8908d3<Void> d3Var2 = this.f37985j;
            synchronized (c2Var.f36564c) {
                if (!c2Var.f36564c.contains(d3Var2)) {
                    c2Var.f36564c.add(d3Var2);
                }
            }
            C8871c2 c2Var2 = this.f37980e;
            if (!c2Var2.f36565d.getAndSet(true)) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 21 && (connectivityManager = (ConnectivityManager) c2Var2.f36562a.getSystemService("connectivity")) != null) {
                        connectivityManager.addDefaultNetworkActiveListener(new C8841b2(c2Var2));
                        ConnectivityHelperMetadata call = c2Var2.f36563b.call();
                        C8871c2.C8872a aVar = null;
                        ConnectivityHelperMetadata.Transport a = call != null ? call.mo30971a() : null;
                        if (a != null) {
                            if (i >= 24 && C9605vb.m50462a(i, a.mo30974a())) {
                                aVar = new C8835b(c2Var2.f36562a, connectivityManager);
                            } else if (C9605vb.m50462a(i, a.mo30975b())) {
                                aVar = new C9611w(c2Var2.f36562a, connectivityManager);
                            }
                            if (aVar != null) {
                                aVar.mo29123b();
                                c2Var2.f36566e = aVar;
                            }
                        }
                    }
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
            }
            this.f37977b.execute(new C9239q4(this));
        }
    }

    /* renamed from: a */
    public final C9063k4 mo29781a(C9043j4 j4Var) {
        C9063k4 k4Var;
        Map<String, AnalyticsCategoryConfig> d;
        AnalyticsCategoryConfig analyticsCategoryConfig;
        synchronized (this.f37983h) {
            Pair pair = this.f37983h.get(j4Var.f37008a);
            k4Var = (pair == null || SystemClock.uptimeMillis() >= ((Long) pair.second).longValue()) ? null : (C9063k4) pair.first;
        }
        if (k4Var != null) {
            return k4Var;
        }
        AnalyticsConfig call = this.f37982g.call();
        if (!(call == null || (d = call.mo30942d()) == null || (analyticsCategoryConfig = d.get(j4Var.f37008a)) == null)) {
            k4Var = new C9063k4(j4Var.f37009b, analyticsCategoryConfig);
        }
        if (k4Var == null) {
            k4Var = j4Var.f37009b;
        }
        synchronized (this.f37983h) {
            this.f37983h.put(j4Var.f37008a, new Pair(k4Var, Long.valueOf(SystemClock.uptimeMillis() + 30000)));
        }
        return k4Var;
    }

    /* renamed from: a */
    public void mo29787a(C9023i4 i4Var, C9147n4 n4Var) {
        AnalyticsConfig call = this.f37982g.call();
        if (call != null && !call.dns) {
            C9063k4 a = mo29781a(i4Var.f36949a);
            if (Math.random() < a.f37038a) {
                if (a.f37041d) {
                    this.f37977b.execute(new C9190e(i4Var, a, (C9147n4) null));
                } else if (this.f37980e.mo29241a()) {
                    long uptimeMillis = (this.f37984i.get() + a.f37043f) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0) {
                        this.f37977b.mo29866a(new C9191f(uptimeMillis, i4Var, a, (C9147n4) null), uptimeMillis);
                    } else {
                        mo29786a(i4Var, a, (C9147n4) null);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo29783a(long j) {
        if (j < 0) {
            j = 0;
        }
        this.f37977b.mo29866a(this.f37986k, j);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo29785a(C9023i4 i4Var, int i, long j) {
        if (i == 1) {
            C9111l4 l4Var = this.f37976a;
            l4Var.getClass();
            long j2 = i4Var.f36950b;
            C9111l4.m48936a(j2, j);
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendSuccess", Long.valueOf(j));
            l4Var.mo29679a().update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
            mo29783a(0);
            return;
        }
        AnalyticsConfig call = this.f37982g.call();
        int max = call != null ? Math.max(1, call.mo30946g()) : 1;
        C9111l4 l4Var2 = this.f37976a;
        l4Var2.getClass();
        long j3 = i4Var.f36950b;
        C9111l4.m48936a(j3, j);
        SQLiteDatabase a = l4Var2.mo29679a();
        a.beginTransaction();
        try {
            if (C9111l4.m48935a(a, j3) >= max) {
                a.delete("events", "rowid = ?", new String[]{String.valueOf(j3)});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("sendFailure", Long.valueOf(j));
                a.update("events", contentValues2, "rowid = ?", new String[]{String.valueOf(j3)});
            }
            a.setTransactionSuccessful();
            a.endTransaction();
            AnalyticsConfig call2 = this.f37982g.call();
            long j4 = 1000;
            if (call2 != null) {
                j4 = Math.max(1000, call2.mo30947h());
            }
            mo29783a(j4);
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo29786a(C9023i4 i4Var, C9063k4 k4Var, C9147n4 n4Var) {
        Runnable a = this.f37981f.mo29242a(i4Var, k4Var, n4Var);
        if (a != null) {
            this.f37978c.execute(a);
        } else if (n4Var != null) {
            n4Var.mo29453a(i4Var, 0);
        }
    }
}
