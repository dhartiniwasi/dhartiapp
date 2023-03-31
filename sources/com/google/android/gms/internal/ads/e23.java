package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import p218e6.C9975i;
import p218e6.C9977j;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class e23 {

    /* renamed from: e */
    private static volatile int f8618e = 1;

    /* renamed from: f */
    public static final /* synthetic */ int f8619f = 0;

    /* renamed from: a */
    private final Context f8620a;

    /* renamed from: b */
    private final Executor f8621b;

    /* renamed from: c */
    private final C9975i f8622c;

    /* renamed from: d */
    private final boolean f8623d;

    e23(Context context, Executor executor, C9975i iVar, boolean z) {
        this.f8620a = context;
        this.f8621b = executor;
        this.f8622c = iVar;
        this.f8623d = z;
    }

    /* renamed from: a */
    public static e23 m11882a(Context context, Executor executor, boolean z) {
        C9977j jVar = new C9977j();
        if (z) {
            executor.execute(new a23(context, jVar));
        } else {
            executor.execute(new b23(jVar));
        }
        return new e23(context, executor, jVar.mo32542a(), z);
    }

    /* renamed from: g */
    static void m11883g(int i) {
        f8618e = i;
    }

    /* renamed from: h */
    private final C9975i m11884h(int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.f8623d) {
            return this.f8622c.mo26354i(this.f8621b, c23.f7578a);
        }
        C2507jb G = C2692ob.m17665G();
        G.mo11367p(this.f8620a.getPackageName());
        G.mo11371v(j);
        G.mo11373y(f8618e);
        if (exc != null) {
            G.mo11372x(t83.m20835a(exc));
            G.mo11370u(exc.getClass().getName());
        }
        if (str2 != null) {
            G.mo11368r(str2);
        }
        if (str != null) {
            G.mo11369s(str);
        }
        return this.f8622c.mo26354i(this.f8621b, new d23(G, i));
    }

    /* renamed from: b */
    public final C9975i mo9787b(int i, String str) {
        return m11884h(i, 0, (Exception) null, (String) null, (Map) null, str);
    }

    /* renamed from: c */
    public final C9975i mo9788c(int i, long j, Exception exc) {
        return m11884h(i, j, exc, (String) null, (Map) null, (String) null);
    }

    /* renamed from: d */
    public final C9975i mo9789d(int i, long j) {
        return m11884h(i, j, (Exception) null, (String) null, (Map) null, (String) null);
    }

    /* renamed from: e */
    public final C9975i mo9790e(int i, long j, String str) {
        return m11884h(i, j, (Exception) null, (String) null, (Map) null, str);
    }

    /* renamed from: f */
    public final C9975i mo9791f(int i, long j, String str, Map map) {
        return m11884h(i, j, (Exception) null, str, (Map) null, (String) null);
    }
}
