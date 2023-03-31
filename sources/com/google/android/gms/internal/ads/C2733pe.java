package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: com.google.android.gms.internal.ads.pe */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2733pe {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ConditionVariable f15812c = new ConditionVariable();

    /* renamed from: d */
    protected static volatile h43 f15813d = null;

    /* renamed from: e */
    private static volatile Random f15814e = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2993wf f15815a;

    /* renamed from: b */
    protected volatile Boolean f15816b;

    public C2733pe(C2993wf wfVar) {
        this.f15815a = wfVar;
        wfVar.mo14910k().execute(new C2695oe(this));
    }

    /* renamed from: d */
    public static final int m18577d() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return m18578e().nextInt();
        } catch (RuntimeException unused) {
            return m18578e().nextInt();
        }
    }

    /* renamed from: e */
    private static Random m18578e() {
        if (f15814e == null) {
            synchronized (C2733pe.class) {
                if (f15814e == null) {
                    f15814e = new Random();
                }
            }
        }
        return f15814e;
    }

    /* renamed from: c */
    public final void mo13256c(int i, int i2, long j, String str, Exception exc) {
        try {
            f15812c.block();
            if (this.f15816b.booleanValue() && f15813d != null) {
                C2507jb G = C2692ob.m17665G();
                G.mo11367p(this.f15815a.f19599a.getPackageName());
                G.mo11371v(j);
                if (str != null) {
                    G.mo11368r(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    G.mo11372x(stringWriter.toString());
                    G.mo11370u(exc.getClass().getName());
                }
                g43 a = f15813d.mo10733a(((C2692ob) G.mo13423m()).mo9400b());
                a.mo10392a(i);
                if (i2 != -1) {
                    a.mo10393b(i2);
                }
                a.mo10394c();
            }
        } catch (Exception unused) {
        }
    }
}
