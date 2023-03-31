package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class p13 implements t03 {

    /* renamed from: i */
    private static final p13 f15648i = new p13();

    /* renamed from: j */
    private static final Handler f15649j = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static Handler f15650k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f15651l = new l13();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f15652m = new m13();

    /* renamed from: a */
    private final List f15653a = new ArrayList();

    /* renamed from: b */
    private int f15654b;

    /* renamed from: c */
    private boolean f15655c = false;

    /* renamed from: d */
    private final List f15656d = new ArrayList();

    /* renamed from: e */
    private final v03 f15657e = new v03();

    /* renamed from: f */
    private final i13 f15658f = new i13();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final j13 f15659g = new j13(new s13());

    /* renamed from: h */
    private long f15660h;

    p13() {
    }

    /* renamed from: d */
    public static p13 m18272d() {
        return f15648i;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m18275g(p13 p13) {
        p13.f15654b = 0;
        p13.f15656d.clear();
        p13.f15655c = false;
        for (a03 a03 : m03.m16344a().mo12244b()) {
        }
        p13.f15660h = System.nanoTime();
        p13.f15658f.mo10996i();
        long nanoTime = System.nanoTime();
        u03 a = p13.f15657e.mo14645a();
        if (p13.f15658f.mo10992e().size() > 0) {
            Iterator it = p13.f15658f.mo10992e().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject a2 = c13.m10673a(0, 0, 0, 0);
                View a3 = p13.f15658f.mo10988a(str);
                u03 b = p13.f15657e.mo14646b();
                String c = p13.f15658f.mo10990c(str);
                if (c != null) {
                    JSONObject a4 = b.mo14435a(a3);
                    c13.m10674b(a4, str);
                    c13.m10678f(a4, c);
                    c13.m10675c(a2, a4);
                }
                c13.m10681i(a2);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                p13.f15659g.mo11297c(a2, hashSet, nanoTime);
            }
        }
        if (p13.f15658f.mo10993f().size() > 0) {
            JSONObject a5 = c13.m10673a(0, 0, 0, 0);
            p13.m18276k((View) null, a, a5, 1, false);
            c13.m10681i(a5);
            p13.f15659g.mo11298d(a5, p13.f15658f.mo10993f(), nanoTime);
        } else {
            p13.f15659g.mo11296b();
        }
        p13.f15658f.mo10994g();
        long nanoTime2 = System.nanoTime() - p13.f15660h;
        if (p13.f15653a.size() > 0) {
            for (o13 o13 : p13.f15653a) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                o13.mo12794d();
                if (o13 instanceof n13) {
                    ((n13) o13).zza();
                }
            }
        }
    }

    /* renamed from: k */
    private final void m18276k(View view, u03 u03, JSONObject jSONObject, int i, boolean z) {
        u03.mo14436b(view, jSONObject, this, i == 1, z);
    }

    /* renamed from: l */
    private static final void m18277l() {
        Handler handler = f15650k;
        if (handler != null) {
            handler.removeCallbacks(f15652m);
            f15650k = null;
        }
    }

    /* renamed from: a */
    public final void mo13101a(View view, u03 u03, JSONObject jSONObject, boolean z) {
        int k;
        boolean z2;
        if (f13.m12399b(view) == null && (k = this.f15658f.mo10998k(view)) != 3) {
            JSONObject a = u03.mo14435a(view);
            c13.m10675c(jSONObject, a);
            String d = this.f15658f.mo10991d(view);
            if (d != null) {
                c13.m10674b(a, d);
                c13.m10677e(a, Boolean.valueOf(this.f15658f.mo10997j(view)));
                this.f15658f.mo10995h();
            } else {
                h13 b = this.f15658f.mo10989b(view);
                if (b != null) {
                    c13.m10676d(a, b);
                    z2 = true;
                } else {
                    z2 = false;
                }
                m18276k(view, u03, a, k, z || z2);
            }
            this.f15654b++;
        }
    }

    /* renamed from: h */
    public final void mo13102h() {
        m18277l();
    }

    /* renamed from: i */
    public final void mo13103i() {
        if (f15650k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f15650k = handler;
            handler.post(f15651l);
            f15650k.postDelayed(f15652m, 200);
        }
    }

    /* renamed from: j */
    public final void mo13104j() {
        m18277l();
        this.f15653a.clear();
        f15649j.post(new k13(this));
    }
}
