package com.startapp;

import android.os.Build;

/* renamed from: com.startapp.t4 */
/* compiled from: Sta */
public abstract class C9551t4 implements Runnable, Comparable<C9551t4> {

    /* renamed from: a */
    public final C9023i4 f39182a;

    /* renamed from: b */
    public final C9063k4 f39183b;

    /* renamed from: c */
    public final C9147n4 f39184c;

    /* renamed from: d */
    public final Exception f39185d = new Exception();

    public C9551t4(C9023i4 i4Var, C9063k4 k4Var, C9147n4 n4Var) {
        this.f39182a = i4Var;
        this.f39183b = k4Var;
        this.f39184c = n4Var;
    }

    /* renamed from: a */
    public abstract int mo29903a() throws Exception;

    /* renamed from: a */
    public Throwable mo31278a(Throwable th) {
        if (Build.VERSION.SDK_INT >= 19) {
            th.addSuppressed(this.f39185d);
        }
        return th;
    }

    public int compareTo(Object obj) {
        return ((C9551t4) obj).f39183b.f37040c - this.f39183b.f37040c;
    }

    public final void run() {
        C9147n4 n4Var;
        int i = 0;
        try {
            i = mo29903a();
            n4Var = this.f39184c;
            if (n4Var == null) {
                return;
            }
        } catch (OutOfMemoryError unused) {
            if (this.f39184c != null) {
                this.f39184c.mo29453a(this.f39182a, 0);
                return;
            }
            return;
        } catch (Throwable th) {
            C9147n4 n4Var2 = this.f39184c;
            if (n4Var2 != null) {
                n4Var2.mo29453a(this.f39182a, 0);
            }
            throw th;
        }
        n4Var.mo29453a(this.f39182a, i);
    }
}
