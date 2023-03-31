package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p033d5.C4141r;
import p067i5.C4691e;
import p067i5.C4694h;
import p393x5.C12974a;
import p402y5.C13035m;
import p402y5.C13046x;

/* renamed from: com.google.android.gms.internal.measurement.c3 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
public final class C6904c3 {

    /* renamed from: j */
    private static volatile C6904c3 f31605j;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f31606a;

    /* renamed from: b */
    protected final C4691e f31607b;

    /* renamed from: c */
    protected final ExecutorService f31608c;

    /* renamed from: d */
    private final C12974a f31609d;

    /* renamed from: e */
    private final List f31610e;

    /* renamed from: f */
    private int f31611f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f31612g;

    /* renamed from: h */
    private final String f31613h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile C6953f1 f31614i;

    protected C6904c3(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m39704s(str2, str3)) {
            this.f31606a = "FA";
        } else {
            this.f31606a = str;
        }
        this.f31607b = C4694h.m30388d();
        C7274z0.m41167a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C7052l2(this));
        boolean z = true;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f31608c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f31609d = new C12974a(this);
        this.f31610e = new ArrayList();
        try {
            if (C13046x.m61372b(context, "google_app_id", C13035m.m61349a(context)) != null && !mo23172o()) {
                this.f31613h = null;
                this.f31612g = true;
                Log.w(this.f31606a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m39704s(str2, str3)) {
            this.f31613h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z)) {
                    Log.w(this.f31606a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f31606a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        } else {
            this.f31613h = str2;
        }
        m39703r(new C7275z1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f31606a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C6887b3(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m39701p(Exception exc, boolean z, boolean z2) {
        this.f31612g |= z;
        if (z) {
            Log.w(this.f31606a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo23160a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f31606a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: q */
    private final void m39702q(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m39703r(new C7132q2(this, l, str, str2, bundle, z, z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m39703r(C7164s2 s2Var) {
        this.f31608c.execute(s2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final boolean m39704s(String str, String str2) {
        return (str2 == null || str == null || mo23172o()) ? false : true;
    }

    /* renamed from: z */
    public static C6904c3 m39706z(Context context, String str, String str2, String str3, Bundle bundle) {
        C4141r.m28221k(context);
        if (f31605j == null) {
            synchronized (C6904c3.class) {
                if (f31605j == null) {
                    f31605j = new C6904c3(context, str, str2, str3, bundle);
                }
            }
        }
        return f31605j;
    }

    /* renamed from: B */
    public final String mo23147B() {
        return this.f31613h;
    }

    /* renamed from: C */
    public final String mo23148C() {
        C6885b1 b1Var = new C6885b1();
        m39703r(new C7084n2(this, b1Var));
        return b1Var.mo23039o3(120000);
    }

    /* renamed from: D */
    public final String mo23149D() {
        C6885b1 b1Var = new C6885b1();
        m39703r(new C6937e2(this, b1Var));
        return b1Var.mo23039o3(50);
    }

    /* renamed from: E */
    public final String mo23150E() {
        C6885b1 b1Var = new C6885b1();
        m39703r(new C6988h2(this, b1Var));
        return b1Var.mo23039o3(500);
    }

    /* renamed from: F */
    public final String mo23151F() {
        C6885b1 b1Var = new C6885b1();
        m39703r(new C6971g2(this, b1Var));
        return b1Var.mo23039o3(500);
    }

    /* renamed from: G */
    public final String mo23152G() {
        C6885b1 b1Var = new C6885b1();
        m39703r(new C6920d2(this, b1Var));
        return b1Var.mo23039o3(500);
    }

    /* renamed from: H */
    public final List mo23153H(String str, String str2) {
        C6885b1 b1Var = new C6885b1();
        m39703r(new C7147r1(this, str, str2, b1Var));
        List list = (List) C6885b1.m39571i5(b1Var.mo23036B0(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: I */
    public final Map mo23154I(String str, String str2, boolean z) {
        C6885b1 b1Var = new C6885b1();
        m39703r(new C7004i2(this, str, str2, z, b1Var));
        Bundle B0 = b1Var.mo23036B0(5000);
        if (B0 == null || B0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(B0.size());
        for (String str3 : B0.keySet()) {
            Object obj = B0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: M */
    public final void mo23155M(String str) {
        m39703r(new C6869a2(this, str));
    }

    /* renamed from: N */
    public final void mo23156N(String str, String str2, Bundle bundle) {
        m39703r(new C7131q1(this, str, str2, bundle));
    }

    /* renamed from: O */
    public final void mo23157O(String str) {
        m39703r(new C6886b2(this, str));
    }

    /* renamed from: P */
    public final void mo23158P(String str, Bundle bundle) {
        m39702q((String) null, str, bundle, false, true, (Long) null);
    }

    /* renamed from: Q */
    public final void mo23159Q(String str, String str2, Bundle bundle) {
        m39702q(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: a */
    public final void mo23160a(int i, String str, Object obj, Object obj2, Object obj3) {
        m39703r(new C7020j2(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* renamed from: b */
    public final void mo23161b() {
        m39703r(new C7243x1(this));
    }

    /* renamed from: c */
    public final void mo23162c(Bundle bundle) {
        m39703r(new C7115p1(this, bundle));
    }

    /* renamed from: d */
    public final void mo23163d(Bundle bundle) {
        m39703r(new C7211v1(this, bundle));
    }

    /* renamed from: e */
    public final void mo23164e(Bundle bundle) {
        m39703r(new C7227w1(this, bundle));
    }

    /* renamed from: f */
    public final void mo23165f(Activity activity, String str, String str2) {
        m39703r(new C7179t1(this, activity, str, str2));
    }

    /* renamed from: g */
    public final void mo23166g(boolean z) {
        m39703r(new C7100o2(this, z));
    }

    /* renamed from: h */
    public final void mo23167h(Bundle bundle) {
        m39703r(new C7116p2(this, bundle));
    }

    /* renamed from: i */
    public final void mo23168i(Boolean bool) {
        m39703r(new C7195u1(this, bool));
    }

    /* renamed from: j */
    public final void mo23169j(long j) {
        m39703r(new C7259y1(this, j));
    }

    /* renamed from: k */
    public final void mo23170k(String str) {
        m39703r(new C7163s1(this, str));
    }

    /* renamed from: l */
    public final void mo23171l(String str, String str2, Object obj, boolean z) {
        m39703r(new C7148r2(this, str, str2, obj, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo23172o() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C6904c3.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public final int mo23173t(String str) {
        C6885b1 b1Var = new C6885b1();
        m39703r(new C7068m2(this, str, b1Var));
        Integer num = (Integer) C6885b1.m39571i5(b1Var.mo23036B0(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: u */
    public final long mo23174u() {
        C6885b1 b1Var = new C6885b1();
        m39703r(new C6954f2(this, b1Var));
        Long P0 = b1Var.mo23038P0(500);
        if (P0 != null) {
            return P0.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f31607b.mo18370a()).nextLong();
        int i = this.f31611f + 1;
        this.f31611f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: v */
    public final Bundle mo23175v(Bundle bundle, boolean z) {
        C6885b1 b1Var = new C6885b1();
        m39703r(new C7036k2(this, bundle, b1Var));
        if (z) {
            return b1Var.mo23036B0(5000);
        }
        return null;
    }

    /* renamed from: w */
    public final C12974a mo23176w() {
        return this.f31609d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final C6953f1 mo23177y(Context context, boolean z) {
        try {
            return C6936e1.asInterface(DynamiteModule.m9486e(context, DynamiteModule.f6328e, ModuleDescriptor.MODULE_ID).mo8136d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C2142a e) {
            m39701p(e, true, false);
            return null;
        }
    }
}
