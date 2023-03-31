package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C6889b5;
import com.google.android.gms.internal.measurement.C6898be;
import com.google.android.gms.internal.measurement.C6922d4;
import com.google.android.gms.internal.measurement.C7016ie;
import com.google.android.gms.internal.measurement.C7039k5;
import com.google.android.gms.internal.measurement.C7055l5;
import com.google.android.gms.internal.measurement.C7083n1;
import com.google.android.gms.internal.measurement.C7134q4;
import com.google.android.gms.internal.measurement.C7150r4;
import com.google.android.gms.internal.measurement.C7198u4;
import com.google.android.gms.internal.measurement.C7214v4;
import com.google.android.gms.internal.measurement.C7238wc;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p033d5.C4141r;
import p067i5.C4691e;
import p081k5.C4888c;
import p124r.C5413a;
import p402y5.C13018a;
import p402y5.C13020b;

/* renamed from: com.google.android.gms.measurement.internal.a9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7303a9 implements C7343e5 {

    /* renamed from: F */
    private static volatile C7303a9 f32328F;

    /* renamed from: A */
    private final Map f32329A;

    /* renamed from: B */
    private final Map f32330B;

    /* renamed from: C */
    private C7454o6 f32331C;

    /* renamed from: D */
    private String f32332D;

    /* renamed from: E */
    private final C7380h9 f32333E = new C7553x8(this);

    /* renamed from: a */
    private final C7331d4 f32334a;

    /* renamed from: b */
    private final C7407k3 f32335b;

    /* renamed from: c */
    private C7414l f32336c;

    /* renamed from: d */
    private C7429m3 f32337d;

    /* renamed from: e */
    private C7456o8 f32338e;

    /* renamed from: f */
    private C7304b f32339f;

    /* renamed from: g */
    private final C7325c9 f32340g;

    /* renamed from: h */
    private C7443n6 f32341h;

    /* renamed from: i */
    private C7552x7 f32342i;

    /* renamed from: j */
    private final C7489r8 f32343j;

    /* renamed from: k */
    private C7528v3 f32344k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C7397j4 f32345l;

    /* renamed from: m */
    private boolean f32346m = false;

    /* renamed from: n */
    private boolean f32347n;

    /* renamed from: o */
    long f32348o;

    /* renamed from: p */
    private List f32349p;

    /* renamed from: q */
    private int f32350q;

    /* renamed from: r */
    private int f32351r;

    /* renamed from: s */
    private boolean f32352s;

    /* renamed from: t */
    private boolean f32353t;

    /* renamed from: u */
    private boolean f32354u;

    /* renamed from: v */
    private FileLock f32355v;

    /* renamed from: w */
    private FileChannel f32356w;

    /* renamed from: x */
    private List f32357x;

    /* renamed from: y */
    private List f32358y;

    /* renamed from: z */
    private long f32359z;

    C7303a9(C7314b9 b9Var, C7397j4 j4Var) {
        C4141r.m28221k(b9Var);
        this.f32345l = C7397j4.m41654H(b9Var.f32377a, (C7083n1) null, (Long) null);
        this.f32359z = -1;
        this.f32343j = new C7489r8(this);
        C7325c9 c9Var = new C7325c9(this);
        c9Var.mo24624h();
        this.f32340g = c9Var;
        C7407k3 k3Var = new C7407k3(this);
        k3Var.mo24624h();
        this.f32335b = k3Var;
        C7331d4 d4Var = new C7331d4(this);
        d4Var.mo24624h();
        this.f32334a = d4Var;
        this.f32329A = new HashMap();
        this.f32330B = new HashMap();
        mo24143s().mo24309z(new C7500s8(this, b9Var));
    }

    /* renamed from: G */
    static final void m41268G(C7134q4 q4Var, int i, String str) {
        List H = q4Var.mo23755H();
        int i2 = 0;
        while (i2 < H.size()) {
            if (!"_err".equals(((C7214v4) H.get(i2)).mo23949I())) {
                i2++;
            } else {
                return;
            }
        }
        C7198u4 G = C7214v4.m41014G();
        G.mo23910B("_err");
        G.mo23909A(Long.valueOf((long) i).longValue());
        C7198u4 G2 = C7214v4.m41014G();
        G2.mo23910B("_ev");
        G2.mo23911C(str);
        q4Var.mo23762x((C7214v4) G.mo23357k());
        q4Var.mo23762x((C7214v4) G2.mo23357k());
    }

    /* renamed from: H */
    static final void m41269H(C7134q4 q4Var, String str) {
        List H = q4Var.mo23755H();
        for (int i = 0; i < H.size(); i++) {
            if (str.equals(((C7214v4) H.get(i)).mo23949I())) {
                q4Var.mo23764z(i);
                return;
            }
        }
    }

    /* renamed from: I */
    private final C7446n9 m41270I(String str) {
        String str2 = str;
        C7414l lVar = this.f32336c;
        m41279R(lVar);
        C7431m5 R = lVar.mo24474R(str2);
        if (R == null || TextUtils.isEmpty(R.mo24552g0())) {
            mo24135l().mo24255p().mo24209b("No app data available; dropping", str2);
            return null;
        }
        Boolean J = m41271J(R);
        if (J == null || J.booleanValue()) {
            String i0 = R.mo24556i0();
            String g0 = R.mo24552g0();
            long L = R.mo24524L();
            String f0 = R.mo24550f0();
            long W = R.mo24535W();
            long T = R.mo24532T();
            boolean J2 = R.mo24522J();
            String h0 = R.mo24554h0();
            R.mo24513A();
            C7431m5 m5Var = R;
            return new C7446n9(str, i0, g0, L, f0, W, T, (String) null, J2, false, h0, 0, 0, 0, m5Var.mo24521I(), false, m5Var.mo24542b0(), m5Var.mo24540a0(), m5Var.mo24533U(), m5Var.mo24543c(), (String) null, mo24111V(str).mo38072h(), "", (String) null);
        }
        mo24135l().mo24256q().mo24209b("App version does not match; dropping. appId", C7352f3.m41475z(str));
        return null;
    }

    /* renamed from: J */
    private final Boolean m41271J(C7431m5 m5Var) {
        try {
            if (m5Var.mo24524L() != -2147483648L) {
                if (m5Var.mo24524L() == ((long) C4888c.m31075a(this.f32345l.mo24121d()).mo18673f(m5Var.mo24546d0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C4888c.m31075a(this.f32345l.mo24121d()).mo18673f(m5Var.mo24546d0(), 0).versionName;
                String g0 = m5Var.mo24552g0();
                if (g0 != null && g0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: K */
    private final void m41272K() {
        mo24143s().mo24189f();
        if (this.f32352s || this.f32353t || this.f32354u) {
            mo24135l().mo24260v().mo24211d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f32352s), Boolean.valueOf(this.f32353t), Boolean.valueOf(this.f32354u));
            return;
        }
        mo24135l().mo24260v().mo24208a("Stopping uploading service(s)");
        List<Runnable> list = this.f32349p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) C4141r.m28221k(this.f32349p)).clear();
        }
    }

    /* renamed from: L */
    private final void m41273L(C6889b5 b5Var, long j, boolean z) {
        C7358f9 f9Var;
        String str = true != z ? "_lte" : "_se";
        C7414l lVar = this.f32336c;
        m41279R(lVar);
        C7358f9 X = lVar.mo24479X(b5Var.mo23102j0(), str);
        if (X == null || X.f32493e == null) {
            f9Var = new C7358f9(b5Var.mo23102j0(), "auto", str, mo24116a().mo18370a(), Long.valueOf(j));
        } else {
            f9Var = new C7358f9(b5Var.mo23102j0(), "auto", str, mo24116a().mo18370a(), Long.valueOf(((Long) X.f32493e).longValue() + j));
        }
        C7039k5 F = C7055l5.m40337F();
        F.mo23605x(str);
        F.mo23606y(mo24116a().mo18370a());
        F.mo23604v(((Long) f9Var.f32493e).longValue());
        C7055l5 l5Var = (C7055l5) F.mo23357k();
        int w = C7325c9.m41402w(b5Var, str);
        if (w >= 0) {
            b5Var.mo23099g0(w, l5Var);
        } else {
            b5Var.mo23055A0(l5Var);
        }
        if (j > 0) {
            C7414l lVar2 = this.f32336c;
            m41279R(lVar2);
            lVar2.mo24501x(f9Var);
            mo24135l().mo24260v().mo24210c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", f9Var.f32493e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0238  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m41274M() {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.h4 r1 = r20.mo24143s()
            r1.mo24189f()
            r20.mo24123e()
            long r1 = r0.f32348o
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004e
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            i5.e r5 = r20.mo24116a()
            long r5 = r5.mo18371b()
            long r7 = r0.f32348o
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.f3 r3 = r20.mo24135l()
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24260v()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.mo24209b(r2, r1)
            com.google.android.gms.measurement.internal.m3 r1 = r20.mo24115Z()
            r1.mo24510c()
            com.google.android.gms.measurement.internal.o8 r1 = r0.f32338e
            m41279R(r1)
            r1.mo24595k()
            return
        L_0x004c:
            r0.f32348o = r3
        L_0x004e:
            com.google.android.gms.measurement.internal.j4 r1 = r0.f32345l
            boolean r1 = r1.mo24439q()
            if (r1 == 0) goto L_0x0255
            boolean r1 = r20.m41276O()
            if (r1 != 0) goto L_0x005e
            goto L_0x0255
        L_0x005e:
            i5.e r1 = r20.mo24116a()
            long r1 = r1.mo18370a()
            r20.mo24110U()
            com.google.android.gms.measurement.internal.t2 r5 = com.google.android.gms.measurement.internal.C7516u2.f33013B
            r6 = 0
            java.lang.Object r5 = r5.mo24669a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.l r5 = r0.f32336c
            m41279R(r5)
            boolean r5 = r5.mo24497t()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.l r5 = r0.f32336c
            m41279R(r5)
            boolean r5 = r5.mo24496r()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00d3
            com.google.android.gms.measurement.internal.h r5 = r20.mo24110U()
            java.lang.String r5 = r5.mo24296u()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00bf
            r20.mo24110U()
            com.google.android.gms.measurement.internal.t2 r5 = com.google.android.gms.measurement.internal.C7516u2.f33082w
            java.lang.Object r5 = r5.mo24669a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00bf:
            r20.mo24110U()
            com.google.android.gms.measurement.internal.t2 r5 = com.google.android.gms.measurement.internal.C7516u2.f33080v
            java.lang.Object r5 = r5.mo24669a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00d3:
            r20.mo24110U()
            com.google.android.gms.measurement.internal.t2 r5 = com.google.android.gms.measurement.internal.C7516u2.f33078u
            java.lang.Object r5 = r5.mo24669a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        L_0x00e6:
            com.google.android.gms.measurement.internal.x7 r5 = r0.f32342i
            com.google.android.gms.measurement.internal.p3 r5 = r5.f33188g
            long r13 = r5.mo24604a()
            com.google.android.gms.measurement.internal.x7 r5 = r0.f32342i
            com.google.android.gms.measurement.internal.p3 r5 = r5.f33189h
            long r15 = r5.mo24604a()
            com.google.android.gms.measurement.internal.l r5 = r0.f32336c
            m41279R(r5)
            r17 = r10
            long r9 = r5.mo24469M()
            com.google.android.gms.measurement.internal.l r5 = r0.f32336c
            m41279R(r5)
            r18 = r7
            long r6 = r5.mo24470N()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
        L_0x0114:
            r7 = r3
            goto L_0x018f
        L_0x0117:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r9 = r1 - r9
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r1, r9)
            long r7 = r5 + r18
            if (r17 == 0) goto L_0x013c
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x013c
            long r7 = java.lang.Math.min(r5, r1)
            long r7 = r7 + r11
        L_0x013c:
            com.google.android.gms.measurement.internal.c9 r13 = r0.f32340g
            m41279R(r13)
            boolean r13 = r13.mo24202M(r1, r11)
            if (r13 != 0) goto L_0x0149
            long r7 = r1 + r11
        L_0x0149:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018f
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x018f
            r1 = 0
        L_0x0152:
            r20.mo24110U()
            r2 = 20
            com.google.android.gms.measurement.internal.t2 r5 = com.google.android.gms.measurement.internal.C7516u2.f33015D
            r6 = 0
            java.lang.Object r5 = r5.mo24669a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11 = 0
            int r5 = java.lang.Math.max(r11, r5)
            int r2 = java.lang.Math.min(r2, r5)
            if (r1 >= r2) goto L_0x0114
            r20.mo24110U()
            com.google.android.gms.measurement.internal.t2 r2 = com.google.android.gms.measurement.internal.C7516u2.f33014C
            java.lang.Object r2 = r2.mo24669a(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            r12 = 1
            long r12 = r12 << r1
            long r5 = r5 * r12
            long r7 = r7 + r5
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x018f
            int r1 = r1 + 1
            goto L_0x0152
        L_0x018f:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0238
            com.google.android.gms.measurement.internal.k3 r1 = r0.f32335b
            m41279R(r1)
            boolean r1 = r1.mo24457k()
            if (r1 == 0) goto L_0x021b
            com.google.android.gms.measurement.internal.x7 r1 = r0.f32342i
            com.google.android.gms.measurement.internal.p3 r1 = r1.f33187f
            long r1 = r1.mo24604a()
            r20.mo24110U()
            com.google.android.gms.measurement.internal.t2 r5 = com.google.android.gms.measurement.internal.C7516u2.f33074s
            r6 = 0
            java.lang.Object r5 = r5.mo24669a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.c9 r9 = r0.f32340g
            m41279R(r9)
            boolean r9 = r9.mo24202M(r1, r5)
            if (r9 != 0) goto L_0x01ca
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x01ca:
            com.google.android.gms.measurement.internal.m3 r1 = r20.mo24115Z()
            r1.mo24510c()
            i5.e r1 = r20.mo24116a()
            long r1 = r1.mo18370a()
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0201
            r20.mo24110U()
            com.google.android.gms.measurement.internal.t2 r1 = com.google.android.gms.measurement.internal.C7516u2.f33084x
            r2 = 0
            java.lang.Object r1 = r1.mo24669a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.x7 r1 = r0.f32342i
            com.google.android.gms.measurement.internal.p3 r1 = r1.f33188g
            i5.e r2 = r20.mo24116a()
            long r2 = r2.mo18370a()
            r1.mo24605b(r2)
        L_0x0201:
            com.google.android.gms.measurement.internal.f3 r1 = r20.mo24135l()
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo24260v()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo24209b(r3, r2)
            com.google.android.gms.measurement.internal.o8 r1 = r0.f32338e
            m41279R(r1)
            r1.mo24596m(r7)
            return
        L_0x021b:
            com.google.android.gms.measurement.internal.f3 r1 = r20.mo24135l()
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo24260v()
            java.lang.String r2 = "No network"
            r1.mo24208a(r2)
            com.google.android.gms.measurement.internal.m3 r1 = r20.mo24115Z()
            r1.mo24509b()
            com.google.android.gms.measurement.internal.o8 r1 = r0.f32338e
            m41279R(r1)
            r1.mo24595k()
            return
        L_0x0238:
            com.google.android.gms.measurement.internal.f3 r1 = r20.mo24135l()
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo24260v()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo24208a(r2)
            com.google.android.gms.measurement.internal.m3 r1 = r20.mo24115Z()
            r1.mo24510c()
            com.google.android.gms.measurement.internal.o8 r1 = r0.f32338e
            m41279R(r1)
            r1.mo24595k()
            return
        L_0x0255:
            com.google.android.gms.measurement.internal.f3 r1 = r20.mo24135l()
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo24260v()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo24208a(r2)
            com.google.android.gms.measurement.internal.m3 r1 = r20.mo24115Z()
            r1.mo24510c()
            com.google.android.gms.measurement.internal.o8 r1 = r0.f32338e
            m41279R(r1)
            r1.mo24595k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7303a9.m41274M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0b7e, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.C7370h.m41498g() + r8)) goto L_0x0b80;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03a7 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x046b A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04c5 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x081f A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0868 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x088b A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0902 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0904 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x090c A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0938 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0b6e A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0bf5 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0c11 A[Catch:{ SQLiteException -> 0x0c29 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x01e4=Splitter:B:69:0x01e4, B:420:0x0d05=Splitter:B:420:0x0d05} */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m41275N(java.lang.String r42, long r43) {
        /*
            r41 = this;
            r1 = r41
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            com.google.android.gms.measurement.internal.l r4 = r1.f32336c
            m41279R(r4)
            r4.mo24486e0()
            com.google.android.gms.measurement.internal.y8 r4 = new com.google.android.gms.measurement.internal.y8     // Catch:{ all -> 0x0d17 }
            r12 = 0
            r4.<init>(r1, r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.l r5 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r5)     // Catch:{ all -> 0x0d17 }
            r6 = 0
            long r9 = r1.f32359z     // Catch:{ all -> 0x0d17 }
            r7 = r43
            r11 = r4
            r5.mo24466G(r6, r7, r9, r11)     // Catch:{ all -> 0x0d17 }
            java.util.List r5 = r4.f33210c     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0d05
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x002e
            goto L_0x0d05
        L_0x002e:
            com.google.android.gms.internal.measurement.c5 r5 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.e9 r5 = r5.mo23501z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.b5 r5 = (com.google.android.gms.internal.measurement.C6889b5) r5     // Catch:{ all -> 0x0d17 }
            r5.mo23066G0()     // Catch:{ all -> 0x0d17 }
            r10 = r12
            r13 = r10
            r8 = 0
            r9 = 0
            r11 = -1
            r14 = -1
            r15 = 0
        L_0x0040:
            java.util.List r12 = r4.f33210c     // Catch:{ all -> 0x0d17 }
            int r12 = r12.size()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "_fr"
            java.lang.String r7 = "_et"
            r16 = r15
            java.lang.String r15 = "_e"
            r17 = r2
            r18 = r3
            if (r8 >= r12) goto L_0x0543
            java.util.List r3 = r4.f33210c     // Catch:{ all -> 0x0d17 }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r3 = (com.google.android.gms.internal.measurement.C7150r4) r3     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.e9 r3 = r3.mo23501z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.q4 r3 = (com.google.android.gms.internal.measurement.C7134q4) r3     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d4 r12 = r1.f32334a     // Catch:{ all -> 0x0d17 }
            m41279R(r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r2 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r2.mo23219T1()     // Catch:{ all -> 0x0d17 }
            r20 = r9
            java.lang.String r9 = r3.mo23754G()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r12.mo24217F(r2, r9)     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = "_err"
            if (r2 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.f3 r2 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24261w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.c5 r7 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.j4 r12 = r1.f32345l     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.a3 r12 = r12.mo24414D()     // Catch:{ all -> 0x0d17 }
            java.lang.String r15 = r3.mo23754G()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo24095d(r15)     // Catch:{ all -> 0x0d17 }
            r2.mo24210c(r6, r7, r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d4 r2 = r1.f32334a     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r6 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.mo23219T1()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.mo24215D(r6)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.d4 r2 = r1.f32334a     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r6 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.mo23219T1()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.mo24218G(r6)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x00c3
            goto L_0x00e8
        L_0x00c3:
            java.lang.String r2 = r3.mo23754G()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.i9 r21 = r41.mo24129h0()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.h9 r2 = r1.f32333E     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r6 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r23 = r6.mo23219T1()     // Catch:{ all -> 0x0d17 }
            r24 = 11
            java.lang.String r25 = "_ev"
            java.lang.String r26 = r3.mo23754G()     // Catch:{ all -> 0x0d17 }
            r27 = 0
            r22 = r2
            r21.mo24365B(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0d17 }
        L_0x00e8:
            r7 = r8
            r23 = r10
            r15 = r16
            r9 = r20
            r10 = r5
            r5 = -1
            goto L_0x0538
        L_0x00f3:
            java.lang.String r2 = r3.mo23754G()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = p402y5.C13039q.m61354a(r18)     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x016d
            r2 = r18
            r3.mo23748A(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f3 r12 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r12 = r12.mo24260v()     // Catch:{ all -> 0x0d17 }
            r18 = r2
            java.lang.String r2 = "Renaming ad_impression to _ai"
            r12.mo24208a(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f3 r2 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r2.mo24253C()     // Catch:{ all -> 0x0d17 }
            r12 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r12)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x016d
            r2 = 0
        L_0x0125:
            int r12 = r3.mo23757p()     // Catch:{ all -> 0x0d17 }
            if (r2 >= r12) goto L_0x016d
            java.lang.String r12 = "ad_platform"
            com.google.android.gms.internal.measurement.v4 r21 = r3.mo23753F(r2)     // Catch:{ all -> 0x0d17 }
            r22 = r8
            java.lang.String r8 = r21.mo23949I()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.internal.measurement.v4 r8 = r3.mo23753F(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r8.mo23950J()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0d17 }
            if (r8 != 0) goto L_0x0168
            java.lang.String r8 = "admob"
            com.google.android.gms.internal.measurement.v4 r12 = r3.mo23753F(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo23950J()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r8.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.measurement.internal.f3 r8 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r8 = r8.mo24262x()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "AdMob ad impression logged from app. Potentially duplicative."
            r8.mo24208a(r12)     // Catch:{ all -> 0x0d17 }
        L_0x0168:
            int r2 = r2 + 1
            r8 = r22
            goto L_0x0125
        L_0x016d:
            r22 = r8
            com.google.android.gms.measurement.internal.d4 r2 = r1.f32334a     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r8 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r8.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r3.mo23754G()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.mo24216E(r8, r12)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = "_c"
            if (r2 != 0) goto L_0x01db
            com.google.android.gms.measurement.internal.c9 r12 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r12)     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r3.mo23754G()     // Catch:{ all -> 0x0d17 }
            p033d5.C4141r.m28217g(r12)     // Catch:{ all -> 0x0d17 }
            r21 = r11
            int r11 = r12.hashCode()     // Catch:{ all -> 0x0d17 }
            r23 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r11 == r10) goto L_0x01be
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r11 == r10) goto L_0x01b4
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r10) goto L_0x01aa
            goto L_0x01c8
        L_0x01aa:
            java.lang.String r10 = "_ui"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 1
            goto L_0x01c9
        L_0x01b4:
            java.lang.String r10 = "_ug"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 2
            goto L_0x01c9
        L_0x01be:
            java.lang.String r10 = "_in"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 0
            goto L_0x01c9
        L_0x01c8:
            r10 = -1
        L_0x01c9:
            if (r10 == 0) goto L_0x01df
            r11 = 1
            if (r10 == r11) goto L_0x01df
            r11 = 2
            if (r10 == r11) goto L_0x01df
            r25 = r5
            r24 = r7
            r7 = r13
            r19 = r14
            r2 = 0
            goto L_0x03a5
        L_0x01db:
            r23 = r10
            r21 = r11
        L_0x01df:
            r24 = r7
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x01e4:
            int r7 = r3.mo23757p()     // Catch:{ all -> 0x0d17 }
            r25 = r5
            java.lang.String r5 = "_r"
            if (r10 >= r7) goto L_0x024b
            com.google.android.gms.internal.measurement.v4 r7 = r3.mo23753F(r10)     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.mo23949I()     // Catch:{ all -> 0x0d17 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x0219
            com.google.android.gms.internal.measurement.v4 r5 = r3.mo23753F(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.e9 r5 = r5.mo23501z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.u4 r5 = (com.google.android.gms.internal.measurement.C7198u4) r5     // Catch:{ all -> 0x0d17 }
            r7 = r13
            r19 = r14
            r13 = 1
            r5.mo23909A(r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r5 = r5.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.v4 r5 = (com.google.android.gms.internal.measurement.C7214v4) r5     // Catch:{ all -> 0x0d17 }
            r3.mo23750C(r10, r5)     // Catch:{ all -> 0x0d17 }
            r11 = 1
            goto L_0x0243
        L_0x0219:
            r7 = r13
            r19 = r14
            com.google.android.gms.internal.measurement.v4 r13 = r3.mo23753F(r10)     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r13.mo23949I()     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.equals(r13)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0243
            com.google.android.gms.internal.measurement.v4 r5 = r3.mo23753F(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.e9 r5 = r5.mo23501z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.u4 r5 = (com.google.android.gms.internal.measurement.C7198u4) r5     // Catch:{ all -> 0x0d17 }
            r12 = 1
            r5.mo23909A(r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r5 = r5.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.v4 r5 = (com.google.android.gms.internal.measurement.C7214v4) r5     // Catch:{ all -> 0x0d17 }
            r3.mo23750C(r10, r5)     // Catch:{ all -> 0x0d17 }
            r12 = 1
        L_0x0243:
            int r10 = r10 + 1
            r13 = r7
            r14 = r19
            r5 = r25
            goto L_0x01e4
        L_0x024b:
            r7 = r13
            r19 = r14
            if (r11 != 0) goto L_0x027c
            if (r2 == 0) goto L_0x027c
            com.google.android.gms.measurement.internal.f3 r10 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r10 = r10.mo24260v()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.j4 r13 = r1.f32345l     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.a3 r13 = r13.mo24414D()     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = r3.mo23754G()     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r13.mo24095d(r14)     // Catch:{ all -> 0x0d17 }
            r10.mo24209b(r11, r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.u4 r10 = com.google.android.gms.internal.measurement.C7214v4.m41014G()     // Catch:{ all -> 0x0d17 }
            r10.mo23910B(r8)     // Catch:{ all -> 0x0d17 }
            r13 = 1
            r10.mo23909A(r13)     // Catch:{ all -> 0x0d17 }
            r3.mo23761v(r10)     // Catch:{ all -> 0x0d17 }
        L_0x027c:
            if (r12 != 0) goto L_0x02a8
            com.google.android.gms.measurement.internal.f3 r10 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r10 = r10.mo24260v()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.j4 r12 = r1.f32345l     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.a3 r12 = r12.mo24414D()     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r3.mo23754G()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo24095d(r13)     // Catch:{ all -> 0x0d17 }
            r10.mo24209b(r11, r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.u4 r10 = com.google.android.gms.internal.measurement.C7214v4.m41014G()     // Catch:{ all -> 0x0d17 }
            r10.mo23910B(r5)     // Catch:{ all -> 0x0d17 }
            r11 = 1
            r10.mo23909A(r11)     // Catch:{ all -> 0x0d17 }
            r3.mo23761v(r10)     // Catch:{ all -> 0x0d17 }
        L_0x02a8:
            com.google.android.gms.measurement.internal.l r10 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r10)     // Catch:{ all -> 0x0d17 }
            long r27 = r41.mo24107F()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r11 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r29 = r11.mo23219T1()     // Catch:{ all -> 0x0d17 }
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r26 = r10
            com.google.android.gms.measurement.internal.j r10 = r26.mo24476T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d17 }
            long r10 = r10.f32597e     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.h r12 = r41.mo24110U()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r13 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r13.mo23219T1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.t2 r14 = com.google.android.gms.measurement.internal.C7516u2.f33068p     // Catch:{ all -> 0x0d17 }
            int r12 = r12.mo24290n(r13, r14)     // Catch:{ all -> 0x0d17 }
            long r12 = (long) r12     // Catch:{ all -> 0x0d17 }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x02e2
            m41269H(r3, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x02e4
        L_0x02e2:
            r16 = 1
        L_0x02e4:
            java.lang.String r5 = r3.mo23754G()     // Catch:{ all -> 0x0d17 }
            boolean r5 = com.google.android.gms.measurement.internal.C7391i9.m41592X(r5)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x03a5
            if (r2 == 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.l r5 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r5)     // Catch:{ all -> 0x0d17 }
            long r27 = r41.mo24107F()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r10 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r29 = r10.mo23219T1()     // Catch:{ all -> 0x0d17 }
            r30 = 0
            r31 = 0
            r32 = 1
            r33 = 0
            r34 = 0
            r26 = r5
            com.google.android.gms.measurement.internal.j r5 = r26.mo24476T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d17 }
            long r10 = r5.f32595c     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.h r5 = r41.mo24110U()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r12 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo23219T1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.t2 r13 = com.google.android.gms.measurement.internal.C7516u2.f33066o     // Catch:{ all -> 0x0d17 }
            int r5 = r5.mo24290n(r12, r13)     // Catch:{ all -> 0x0d17 }
            long r12 = (long) r5     // Catch:{ all -> 0x0d17 }
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.f3 r5 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24261w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.c5 r11 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r11)     // Catch:{ all -> 0x0d17 }
            r5.mo24209b(r10, r11)     // Catch:{ all -> 0x0d17 }
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = -1
        L_0x0341:
            int r13 = r3.mo23757p()     // Catch:{ all -> 0x0d17 }
            if (r10 >= r13) goto L_0x036b
            com.google.android.gms.internal.measurement.v4 r13 = r3.mo23753F(r10)     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = r13.mo23949I()     // Catch:{ all -> 0x0d17 }
            boolean r14 = r8.equals(r14)     // Catch:{ all -> 0x0d17 }
            if (r14 == 0) goto L_0x035d
            com.google.android.gms.internal.measurement.e9 r5 = r13.mo23501z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.u4 r5 = (com.google.android.gms.internal.measurement.C7198u4) r5     // Catch:{ all -> 0x0d17 }
            r12 = r10
            goto L_0x0368
        L_0x035d:
            java.lang.String r13 = r13.mo23949I()     // Catch:{ all -> 0x0d17 }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x0368
            r11 = 1
        L_0x0368:
            int r10 = r10 + 1
            goto L_0x0341
        L_0x036b:
            if (r11 == 0) goto L_0x0374
            if (r5 == 0) goto L_0x0373
            r3.mo23764z(r12)     // Catch:{ all -> 0x0d17 }
            goto L_0x03a5
        L_0x0373:
            r5 = 0
        L_0x0374:
            if (r5 == 0) goto L_0x038e
            com.google.android.gms.internal.measurement.e9 r5 = r5.clone()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.u4 r5 = (com.google.android.gms.internal.measurement.C7198u4) r5     // Catch:{ all -> 0x0d17 }
            r5.mo23910B(r9)     // Catch:{ all -> 0x0d17 }
            r9 = 10
            r5.mo23909A(r9)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r5 = r5.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.v4 r5 = (com.google.android.gms.internal.measurement.C7214v4) r5     // Catch:{ all -> 0x0d17 }
            r3.mo23750C(r12, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x03a5
        L_0x038e:
            com.google.android.gms.measurement.internal.f3 r5 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.c5 r10 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = r10.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r10)     // Catch:{ all -> 0x0d17 }
            r5.mo24209b(r9, r10)     // Catch:{ all -> 0x0d17 }
        L_0x03a5:
            if (r2 == 0) goto L_0x045e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0d17 }
            java.util.List r5 = r3.mo23755H()     // Catch:{ all -> 0x0d17 }
            r2.<init>(r5)     // Catch:{ all -> 0x0d17 }
            r5 = 0
            r9 = -1
            r10 = -1
        L_0x03b3:
            int r11 = r2.size()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r5 >= r11) goto L_0x03e3
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.v4 r11 = (com.google.android.gms.internal.measurement.C7214v4) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo23949I()     // Catch:{ all -> 0x0d17 }
            boolean r11 = r13.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x03cf
            r9 = r5
            goto L_0x03e0
        L_0x03cf:
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.v4 r11 = (com.google.android.gms.internal.measurement.C7214v4) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo23949I()     // Catch:{ all -> 0x0d17 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x03e0
            r10 = r5
        L_0x03e0:
            int r5 = r5 + 1
            goto L_0x03b3
        L_0x03e3:
            r5 = -1
            if (r9 != r5) goto L_0x03e8
            goto L_0x045f
        L_0x03e8:
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.v4 r5 = (com.google.android.gms.internal.measurement.C7214v4) r5     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.mo23954X()     // Catch:{ all -> 0x0d17 }
            if (r5 != 0) goto L_0x0419
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.v4 r5 = (com.google.android.gms.internal.measurement.C7214v4) r5     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.mo23952V()     // Catch:{ all -> 0x0d17 }
            if (r5 != 0) goto L_0x0419
            com.google.android.gms.measurement.internal.f3 r2 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24262x()     // Catch:{ all -> 0x0d17 }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.mo24208a(r5)     // Catch:{ all -> 0x0d17 }
            r3.mo23764z(r9)     // Catch:{ all -> 0x0d17 }
            m41269H(r3, r8)     // Catch:{ all -> 0x0d17 }
            r2 = 18
            m41268G(r3, r2, r13)     // Catch:{ all -> 0x0d17 }
            goto L_0x045e
        L_0x0419:
            r5 = -1
            if (r10 != r5) goto L_0x041d
            goto L_0x0445
        L_0x041d:
            java.lang.Object r2 = r2.get(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.v4 r2 = (com.google.android.gms.internal.measurement.C7214v4) r2     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r2.mo23950J()     // Catch:{ all -> 0x0d17 }
            int r10 = r2.length()     // Catch:{ all -> 0x0d17 }
            r11 = 3
            if (r10 != r11) goto L_0x0445
            r10 = 0
        L_0x042f:
            int r11 = r2.length()     // Catch:{ all -> 0x0d17 }
            if (r10 >= r11) goto L_0x045f
            int r11 = r2.codePointAt(r10)     // Catch:{ all -> 0x0d17 }
            boolean r13 = java.lang.Character.isLetter(r11)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x0445
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0d17 }
            int r10 = r10 + r11
            goto L_0x042f
        L_0x0445:
            com.google.android.gms.measurement.internal.f3 r2 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24262x()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo24208a(r10)     // Catch:{ all -> 0x0d17 }
            r3.mo23764z(r9)     // Catch:{ all -> 0x0d17 }
            m41269H(r3, r8)     // Catch:{ all -> 0x0d17 }
            r2 = 19
            m41268G(r3, r2, r12)     // Catch:{ all -> 0x0d17 }
            goto L_0x045f
        L_0x045e:
            r5 = -1
        L_0x045f:
            java.lang.String r2 = r3.mo23754G()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0d17 }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04c5
            com.google.android.gms.measurement.internal.c9 r2 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r2 = r3.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r2 = (com.google.android.gms.internal.measurement.C7150r4) r2     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.v4 r2 = com.google.android.gms.measurement.internal.C7325c9.m41393m(r2, r6)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x04c0
            if (r7 == 0) goto L_0x04b4
            long r10 = r7.mo23759s()     // Catch:{ all -> 0x0d17 }
            long r12 = r3.mo23759s()     // Catch:{ all -> 0x0d17 }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0d17 }
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x04b4
            com.google.android.gms.internal.measurement.e9 r2 = r7.clone()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.q4 r2 = (com.google.android.gms.internal.measurement.C7134q4) r2     // Catch:{ all -> 0x0d17 }
            boolean r6 = r1.m41277P(r3, r2)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x04a7
            r6 = r19
            r10 = r25
            r10.mo23073K(r6, r2)     // Catch:{ all -> 0x0d17 }
            r11 = r21
            r2 = 0
            r13 = 0
            goto L_0x04af
        L_0x04a7:
            r6 = r19
            r10 = r25
            r2 = r3
            r13 = r7
            r11 = r20
        L_0x04af:
            r23 = r2
            r14 = r6
            goto L_0x0524
        L_0x04b4:
            r6 = r19
            r10 = r25
            r23 = r3
            r14 = r6
            r13 = r7
            r11 = r20
            goto L_0x0524
        L_0x04c0:
            r6 = r19
            r10 = r25
            goto L_0x051f
        L_0x04c5:
            r6 = r19
            r10 = r25
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r3.mo23754G()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x051f
            com.google.android.gms.measurement.internal.c9 r2 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r2 = r3.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r2 = (com.google.android.gms.internal.measurement.C7150r4) r2     // Catch:{ all -> 0x0d17 }
            r11 = r24
            com.google.android.gms.internal.measurement.v4 r2 = com.google.android.gms.measurement.internal.C7325c9.m41393m(r2, r11)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x051f
            if (r23 == 0) goto L_0x0518
            long r11 = r23.mo23759s()     // Catch:{ all -> 0x0d17 }
            long r13 = r3.mo23759s()     // Catch:{ all -> 0x0d17 }
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0d17 }
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0518
            com.google.android.gms.internal.measurement.e9 r2 = r23.clone()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.q4 r2 = (com.google.android.gms.internal.measurement.C7134q4) r2     // Catch:{ all -> 0x0d17 }
            boolean r7 = r1.m41277P(r2, r3)     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x0511
            r8 = r21
            r10.mo23073K(r8, r2)     // Catch:{ all -> 0x0d17 }
            r14 = r6
            r2 = 0
            r23 = 0
            goto L_0x0516
        L_0x0511:
            r8 = r21
            r2 = r3
            r14 = r20
        L_0x0516:
            r13 = r2
            goto L_0x0523
        L_0x0518:
            r8 = r21
            r13 = r3
            r11 = r8
            r14 = r20
            goto L_0x0524
        L_0x051f:
            r8 = r21
            r14 = r6
            r13 = r7
        L_0x0523:
            r11 = r8
        L_0x0524:
            java.util.List r2 = r4.f33210c     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r6 = r3.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r6 = (com.google.android.gms.internal.measurement.C7150r4) r6     // Catch:{ all -> 0x0d17 }
            r7 = r22
            r2.set(r7, r6)     // Catch:{ all -> 0x0d17 }
            int r9 = r20 + 1
            r10.mo23123y0(r3)     // Catch:{ all -> 0x0d17 }
            r15 = r16
        L_0x0538:
            int r8 = r7 + 1
            r5 = r10
            r2 = r17
            r3 = r18
            r10 = r23
            goto L_0x0040
        L_0x0543:
            r10 = r5
            r11 = r7
            r20 = r9
            r2 = 0
            r7 = r2
            r5 = 0
        L_0x054b:
            if (r5 >= r9) goto L_0x059b
            com.google.android.gms.internal.measurement.r4 r12 = r10.mo23112r0(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r12.mo23812J()     // Catch:{ all -> 0x0d17 }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x056e
            com.google.android.gms.measurement.internal.c9 r13 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.v4 r13 = com.google.android.gms.measurement.internal.C7325c9.m41393m(r12, r6)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x056e
            r10.mo23108p(r5)     // Catch:{ all -> 0x0d17 }
            int r9 = r9 + -1
            int r5 = r5 + -1
            goto L_0x0598
        L_0x056e:
            com.google.android.gms.measurement.internal.c9 r13 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.v4 r12 = com.google.android.gms.measurement.internal.C7325c9.m41393m(r12, r11)     // Catch:{ all -> 0x0d17 }
            if (r12 == 0) goto L_0x0598
            boolean r13 = r12.mo23954X()     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x0588
            long r12 = r12.mo23948F()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d17 }
            goto L_0x0589
        L_0x0588:
            r12 = 0
        L_0x0589:
            if (r12 == 0) goto L_0x0598
            long r13 = r12.longValue()     // Catch:{ all -> 0x0d17 }
            int r18 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r18 <= 0) goto L_0x0598
            long r12 = r12.longValue()     // Catch:{ all -> 0x0d17 }
            long r7 = r7 + r12
        L_0x0598:
            r12 = 1
            int r5 = r5 + r12
            goto L_0x054b
        L_0x059b:
            r5 = 0
            r1.m41273L(r10, r7, r5)     // Catch:{ all -> 0x0d17 }
            java.util.List r5 = r10.mo23105m0()     // Catch:{ all -> 0x0d17 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0d17 }
        L_0x05a7:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = "_se"
            if (r6 == 0) goto L_0x05cd
            java.lang.String r6 = "_s"
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r11 = (com.google.android.gms.internal.measurement.C7150r4) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo23812J()     // Catch:{ all -> 0x0d17 }
            boolean r6 = r6.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x05a7
            com.google.android.gms.measurement.internal.l r5 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r10.mo23102j0()     // Catch:{ all -> 0x0d17 }
            r5.mo24490k(r6, r9)     // Catch:{ all -> 0x0d17 }
        L_0x05cd:
            java.lang.String r5 = "_sid"
            int r5 = com.google.android.gms.measurement.internal.C7325c9.m41402w(r10, r5)     // Catch:{ all -> 0x0d17 }
            if (r5 < 0) goto L_0x05da
            r5 = 1
            r1.m41273L(r10, r7, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x05fa
        L_0x05da:
            int r5 = com.google.android.gms.measurement.internal.C7325c9.m41402w(r10, r9)     // Catch:{ all -> 0x0d17 }
            if (r5 < 0) goto L_0x05fa
            r10.mo23111r(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f3 r5 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.c5 r7 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r7)     // Catch:{ all -> 0x0d17 }
            r5.mo24209b(r6, r7)     // Catch:{ all -> 0x0d17 }
        L_0x05fa:
            com.google.android.gms.measurement.internal.c9 r5 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.j4 r6 = r5.f32389a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f3 r6 = r6.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo24260v()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r6.mo24208a(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.a9 r6 = r5.f32873b     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d4 r6 = r6.f32334a     // Catch:{ all -> 0x0d17 }
            m41279R(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r10.mo23102j0()     // Catch:{ all -> 0x0d17 }
            boolean r6 = r6.mo24213B(r7)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.a9 r6 = r5.f32873b     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.l r6 = r6.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r10.mo23102j0()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.m5 r6 = r6.mo24474R(r7)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            boolean r6 = r6.mo24521I()     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.j4 r6 = r5.f32389a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.p r6 = r6.mo24411A()     // Catch:{ all -> 0x0d17 }
            boolean r6 = r6.mo24603r()     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.j4 r6 = r5.f32389a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f3 r6 = r6.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo24255p()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Turning off ad personalization due to account type"
            r6.mo24208a(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.k5 r6 = com.google.android.gms.internal.measurement.C7055l5.m40337F()     // Catch:{ all -> 0x0d17 }
            r7 = r17
            r6.mo23605x(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.j4 r5 = r5.f32389a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.p r5 = r5.mo24411A()     // Catch:{ all -> 0x0d17 }
            long r8 = r5.mo24599n()     // Catch:{ all -> 0x0d17 }
            r6.mo23606y(r8)     // Catch:{ all -> 0x0d17 }
            r8 = 1
            r6.mo23604v(r8)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r5 = r6.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.l5 r5 = (com.google.android.gms.internal.measurement.C7055l5) r5     // Catch:{ all -> 0x0d17 }
            r6 = 0
        L_0x0673:
            int r8 = r10.mo23107o0()     // Catch:{ all -> 0x0d17 }
            if (r6 >= r8) goto L_0x068e
            com.google.android.gms.internal.measurement.l5 r8 = r10.mo23101i0(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r8.mo23627H()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x068b
            r10.mo23099g0(r6, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x0691
        L_0x068b:
            int r6 = r6 + 1
            goto L_0x0673
        L_0x068e:
            r10.mo23055A0(r5)     // Catch:{ all -> 0x0d17 }
        L_0x0691:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10.mo23095c0(r5)     // Catch:{ all -> 0x0d17 }
            r5 = -9223372036854775808
            r10.mo23069I(r5)     // Catch:{ all -> 0x0d17 }
            r5 = 0
        L_0x069f:
            int r6 = r10.mo23086S()     // Catch:{ all -> 0x0d17 }
            if (r5 >= r6) goto L_0x06d2
            com.google.android.gms.internal.measurement.r4 r6 = r10.mo23112r0(r5)     // Catch:{ all -> 0x0d17 }
            long r7 = r6.mo23810F()     // Catch:{ all -> 0x0d17 }
            long r11 = r10.mo23110q0()     // Catch:{ all -> 0x0d17 }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x06bc
            long r7 = r6.mo23810F()     // Catch:{ all -> 0x0d17 }
            r10.mo23095c0(r7)     // Catch:{ all -> 0x0d17 }
        L_0x06bc:
            long r7 = r6.mo23810F()     // Catch:{ all -> 0x0d17 }
            long r11 = r10.mo23109p0()     // Catch:{ all -> 0x0d17 }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x06cf
            long r6 = r6.mo23810F()     // Catch:{ all -> 0x0d17 }
            r10.mo23069I(r6)     // Catch:{ all -> 0x0d17 }
        L_0x06cf:
            int r5 = r5 + 1
            goto L_0x069f
        L_0x06d2:
            r10.mo23083P0()     // Catch:{ all -> 0x0d17 }
            r10.mo23059C0()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.b r5 = r1.f32339f     // Catch:{ all -> 0x0d17 }
            m41279R(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.String r21 = r10.mo23102j0()     // Catch:{ all -> 0x0d17 }
            java.util.List r22 = r10.mo23105m0()     // Catch:{ all -> 0x0d17 }
            java.util.List r23 = r10.mo23106n0()     // Catch:{ all -> 0x0d17 }
            long r6 = r10.mo23110q0()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r24 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d17 }
            long r6 = r10.mo23109p0()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r25 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d17 }
            r20 = r5
            java.util.List r5 = r20.mo24152k(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0d17 }
            r10.mo23114s0(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.h r5 = r41.mo24110U()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r6 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.mo23219T1()     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.mo24283F(r6)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0a51
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0d17 }
            r5.<init>()     // Catch:{ all -> 0x0d17 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0d17 }
            r6.<init>()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.i9 r7 = r41.mo24129h0()     // Catch:{ all -> 0x0d17 }
            java.security.SecureRandom r7 = r7.mo24403u()     // Catch:{ all -> 0x0d17 }
            r8 = 0
        L_0x0725:
            int r9 = r10.mo23086S()     // Catch:{ all -> 0x0d17 }
            if (r8 >= r9) goto L_0x0a17
            com.google.android.gms.internal.measurement.r4 r9 = r10.mo23112r0(r8)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.e9 r9 = r9.mo23501z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.q4 r9 = (com.google.android.gms.internal.measurement.C7134q4) r9     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r9.mo23754G()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r11 == 0) goto L_0x07c8
            com.google.android.gms.measurement.internal.c9 r11 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r11)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r11 = r9.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r11 = (com.google.android.gms.internal.measurement.C7150r4) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7325c9.m41394n(r11, r14)     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0d17 }
            java.lang.Object r14 = r5.get(r11)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.r r14 = (com.google.android.gms.measurement.internal.C7480r) r14     // Catch:{ all -> 0x0d17 }
            if (r14 != 0) goto L_0x077c
            com.google.android.gms.measurement.internal.l r14 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r14)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r15 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r15 = r15.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r17 = p033d5.C4141r.m28221k(r11)     // Catch:{ all -> 0x0d17 }
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.r r14 = r14.mo24478V(r15, r2)     // Catch:{ all -> 0x0d17 }
            if (r14 == 0) goto L_0x077c
            r5.put(r11, r14)     // Catch:{ all -> 0x0d17 }
        L_0x077c:
            if (r14 == 0) goto L_0x07bb
            java.lang.Long r2 = r14.f32919i     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x07bb
            java.lang.Long r2 = r14.f32920j     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x079a
            long r2 = r2.longValue()     // Catch:{ all -> 0x0d17 }
            r17 = 1
            int r11 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r11 <= 0) goto L_0x079a
            com.google.android.gms.measurement.internal.c9 r2 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = r14.f32920j     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.C7325c9.m41391P(r9, r13, r2)     // Catch:{ all -> 0x0d17 }
        L_0x079a:
            java.lang.Boolean r2 = r14.f32921k     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x07b2
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x07b2
            com.google.android.gms.measurement.internal.c9 r2 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            r2 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.C7325c9.m41391P(r9, r12, r11)     // Catch:{ all -> 0x0d17 }
        L_0x07b2:
            com.google.android.gms.internal.measurement.h9 r2 = r9.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r2 = (com.google.android.gms.internal.measurement.C7150r4) r2     // Catch:{ all -> 0x0d17 }
            r6.add(r2)     // Catch:{ all -> 0x0d17 }
        L_0x07bb:
            r10.mo23073K(r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x07be:
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a0b
        L_0x07c8:
            com.google.android.gms.measurement.internal.d4 r2 = r1.f32334a     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r3 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r3 = r3.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r11 = r2.mo24226c(r3, r11)     // Catch:{ all -> 0x0d17 }
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0d17 }
            if (r14 != 0) goto L_0x07f9
            long r2 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x07e4 }
            goto L_0x07fb
        L_0x07e4:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24261w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r3)     // Catch:{ all -> 0x0d17 }
            r2.mo24210c(r14, r3, r11)     // Catch:{ all -> 0x0d17 }
        L_0x07f9:
            r2 = 0
        L_0x07fb:
            com.google.android.gms.measurement.internal.i9 r11 = r41.mo24129h0()     // Catch:{ all -> 0x0d17 }
            long r14 = r9.mo23759s()     // Catch:{ all -> 0x0d17 }
            long r14 = r11.mo24401s0(r14, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r11 = r9.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r11 = (com.google.android.gms.internal.measurement.C7150r4) r11     // Catch:{ all -> 0x0d17 }
            r44 = r12
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0d17 }
            r17 = r2
            java.lang.String r2 = "_dbg"
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0d17 }
            if (r3 != 0) goto L_0x0853
            java.util.List r3 = r11.mo23813K()     // Catch:{ all -> 0x0d17 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d17 }
        L_0x0827:
            boolean r11 = r3.hasNext()     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x0853
            java.lang.Object r11 = r3.next()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.v4 r11 = (com.google.android.gms.internal.measurement.C7214v4) r11     // Catch:{ all -> 0x0d17 }
            r22 = r3
            java.lang.String r3 = r11.mo23949I()     // Catch:{ all -> 0x0d17 }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0d17 }
            if (r3 == 0) goto L_0x0850
            long r2 = r11.mo23948F()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d17 }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x084e
            goto L_0x0853
        L_0x084e:
            r2 = 1
            goto L_0x0866
        L_0x0850:
            r3 = r22
            goto L_0x0827
        L_0x0853:
            com.google.android.gms.measurement.internal.d4 r2 = r1.f32334a     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r3 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r3 = r3.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r9.mo23754G()     // Catch:{ all -> 0x0d17 }
            int r2 = r2.mo24227q(r3, r11)     // Catch:{ all -> 0x0d17 }
        L_0x0866:
            if (r2 > 0) goto L_0x088b
            com.google.android.gms.measurement.internal.f3 r3 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24261w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r9.mo23754G()     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d17 }
            r3.mo24210c(r11, r12, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r2 = r9.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r2 = (com.google.android.gms.internal.measurement.C7150r4) r2     // Catch:{ all -> 0x0d17 }
            r6.add(r2)     // Catch:{ all -> 0x0d17 }
            r10.mo23073K(r8, r9)     // Catch:{ all -> 0x0d17 }
            goto L_0x07be
        L_0x088b:
            java.lang.String r3 = r9.mo23754G()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.r r3 = (com.google.android.gms.measurement.internal.C7480r) r3     // Catch:{ all -> 0x0d17 }
            if (r3 != 0) goto L_0x08eb
            com.google.android.gms.measurement.internal.l r3 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r3)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r11 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r9.mo23754G()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo24478V(r11, r12)     // Catch:{ all -> 0x0d17 }
            if (r3 != 0) goto L_0x08eb
            com.google.android.gms.measurement.internal.f3 r3 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24261w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.c5 r12 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo23219T1()     // Catch:{ all -> 0x0d17 }
            r22 = r14
            java.lang.String r14 = r9.mo23754G()     // Catch:{ all -> 0x0d17 }
            r3.mo24210c(r11, r12, r14)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.r r3 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r11 = r4.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r25 = r11.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r26 = r9.mo23754G()     // Catch:{ all -> 0x0d17 }
            r27 = 1
            r29 = 1
            r31 = 1
            long r33 = r9.mo23759s()     // Catch:{ all -> 0x0d17 }
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r24 = r3
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch:{ all -> 0x0d17 }
            goto L_0x08ed
        L_0x08eb:
            r22 = r14
        L_0x08ed:
            com.google.android.gms.measurement.internal.c9 r11 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r11)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r11 = r9.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r11 = (com.google.android.gms.internal.measurement.C7150r4) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "_eid"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7325c9.m41394n(r11, r12)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x0904
            r12 = 1
            goto L_0x0905
        L_0x0904:
            r12 = 0
        L_0x0905:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0d17 }
            r14 = 1
            if (r2 != r14) goto L_0x0938
            com.google.android.gms.internal.measurement.h9 r2 = r9.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r2 = (com.google.android.gms.internal.measurement.C7150r4) r2     // Catch:{ all -> 0x0d17 }
            r6.add(r2)     // Catch:{ all -> 0x0d17 }
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x0933
            java.lang.Long r2 = r3.f32919i     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x0927
            java.lang.Long r2 = r3.f32920j     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x0927
            java.lang.Boolean r2 = r3.f32921k     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x0933
        L_0x0927:
            r2 = 0
            com.google.android.gms.measurement.internal.r r3 = r3.mo24628a(r2, r2, r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r9.mo23754G()     // Catch:{ all -> 0x0d17 }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0933:
            r10.mo23073K(r8, r9)     // Catch:{ all -> 0x0d17 }
            goto L_0x07be
        L_0x0938:
            int r14 = r7.nextInt(r2)     // Catch:{ all -> 0x0d17 }
            if (r14 != 0) goto L_0x097a
            com.google.android.gms.measurement.internal.c9 r11 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r11)     // Catch:{ all -> 0x0d17 }
            long r14 = (long) r2     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.C7325c9.m41391P(r9, r13, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r11 = r9.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r11 = (com.google.android.gms.internal.measurement.C7150r4) r11     // Catch:{ all -> 0x0d17 }
            r6.add(r11)     // Catch:{ all -> 0x0d17 }
            boolean r11 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x095f
            r11 = 0
            com.google.android.gms.measurement.internal.r r3 = r3.mo24628a(r11, r2, r11)     // Catch:{ all -> 0x0d17 }
        L_0x095f:
            java.lang.String r2 = r9.mo23754G()     // Catch:{ all -> 0x0d17 }
            long r11 = r9.mo23759s()     // Catch:{ all -> 0x0d17 }
            r14 = r22
            com.google.android.gms.measurement.internal.r r3 = r3.mo24629b(r11, r14)     // Catch:{ all -> 0x0d17 }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d17 }
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a08
        L_0x097a:
            r14 = r22
            r22 = r7
            java.lang.Long r7 = r3.f32918h     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x098f
            long r17 = r7.longValue()     // Catch:{ all -> 0x0d17 }
            r24 = r4
            r26 = r5
            r25 = r10
            r23 = r11
            goto L_0x09a5
        L_0x098f:
            com.google.android.gms.measurement.internal.i9 r7 = r41.mo24129h0()     // Catch:{ all -> 0x0d17 }
            r25 = r10
            r23 = r11
            long r10 = r9.mo23758r()     // Catch:{ all -> 0x0d17 }
            r24 = r4
            r26 = r5
            r4 = r17
            long r17 = r7.mo24401s0(r10, r4)     // Catch:{ all -> 0x0d17 }
        L_0x09a5:
            int r4 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x09ee
            com.google.android.gms.measurement.internal.c9 r4 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r4)     // Catch:{ all -> 0x0d17 }
            r4 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d17 }
            r10 = r44
            com.google.android.gms.measurement.internal.C7325c9.m41391P(r9, r10, r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.c9 r7 = r1.f32340g     // Catch:{ all -> 0x0d17 }
            m41279R(r7)     // Catch:{ all -> 0x0d17 }
            long r10 = (long) r2     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.C7325c9.m41391P(r9, r13, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r7 = r9.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.r4 r7 = (com.google.android.gms.internal.measurement.C7150r4) r7     // Catch:{ all -> 0x0d17 }
            r6.add(r7)     // Catch:{ all -> 0x0d17 }
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x09dc
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d17 }
            r10 = 0
            com.google.android.gms.measurement.internal.r r3 = r3.mo24628a(r10, r2, r7)     // Catch:{ all -> 0x0d17 }
        L_0x09dc:
            java.lang.String r2 = r9.mo23754G()     // Catch:{ all -> 0x0d17 }
            long r10 = r9.mo23759s()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo24629b(r10, r14)     // Catch:{ all -> 0x0d17 }
            r7 = r26
            r7.put(r2, r3)     // Catch:{ all -> 0x0d17 }
            goto L_0x0a06
        L_0x09ee:
            r7 = r26
            r4 = 1
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x0a06
            java.lang.String r2 = r9.mo23754G()     // Catch:{ all -> 0x0d17 }
            r11 = r23
            r10 = 0
            com.google.android.gms.measurement.internal.r r3 = r3.mo24628a(r11, r10, r10)     // Catch:{ all -> 0x0d17 }
            r7.put(r2, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0a06:
            r2 = r25
        L_0x0a08:
            r2.mo23073K(r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x0a0b:
            int r8 = r8 + 1
            r10 = r2
            r5 = r7
            r7 = r22
            r4 = r24
            r2 = 0
            goto L_0x0725
        L_0x0a17:
            r24 = r4
            r7 = r5
            r2 = r10
            int r3 = r6.size()     // Catch:{ all -> 0x0d17 }
            int r4 = r2.mo23086S()     // Catch:{ all -> 0x0d17 }
            if (r3 >= r4) goto L_0x0a2b
            r2.mo23066G0()     // Catch:{ all -> 0x0d17 }
            r2.mo23116u0(r6)     // Catch:{ all -> 0x0d17 }
        L_0x0a2b:
            java.util.Set r3 = r7.entrySet()     // Catch:{ all -> 0x0d17 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d17 }
        L_0x0a33:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0d17 }
            if (r4 == 0) goto L_0x0a4e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0d17 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.l r5 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.r r4 = (com.google.android.gms.measurement.internal.C7480r) r4     // Catch:{ all -> 0x0d17 }
            r5.mo24494p(r4)     // Catch:{ all -> 0x0d17 }
            goto L_0x0a33
        L_0x0a4e:
            r3 = r24
            goto L_0x0a53
        L_0x0a51:
            r2 = r10
            r3 = r4
        L_0x0a53:
            com.google.android.gms.internal.measurement.c5 r4 = r3.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r4 = r4.mo23219T1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.l r5 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.m5 r5 = r5.mo24474R(r4)     // Catch:{ all -> 0x0d17 }
            if (r5 != 0) goto L_0x0a7c
            com.google.android.gms.measurement.internal.f3 r5 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.c5 r7 = r3.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r7)     // Catch:{ all -> 0x0d17 }
            r5.mo24209b(r6, r7)     // Catch:{ all -> 0x0d17 }
            goto L_0x0ad8
        L_0x0a7c:
            int r6 = r2.mo23086S()     // Catch:{ all -> 0x0d17 }
            if (r6 <= 0) goto L_0x0ad8
            long r6 = r5.mo24536X()     // Catch:{ all -> 0x0d17 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0a90
            r2.mo23088U(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0a93
        L_0x0a90:
            r2.mo23074K0()     // Catch:{ all -> 0x0d17 }
        L_0x0a93:
            long r8 = r5.mo24538Z()     // Catch:{ all -> 0x0d17 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0a9e
            goto L_0x0a9f
        L_0x0a9e:
            r6 = r8
        L_0x0a9f:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0aa7
            r2.mo23089V(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0aaa
        L_0x0aa7:
            r2.mo23076L0()     // Catch:{ all -> 0x0d17 }
        L_0x0aaa:
            r5.mo24547e()     // Catch:{ all -> 0x0d17 }
            long r6 = r5.mo24537Y()     // Catch:{ all -> 0x0d17 }
            int r7 = (int) r6     // Catch:{ all -> 0x0d17 }
            r2.mo23054A(r7)     // Catch:{ all -> 0x0d17 }
            long r6 = r2.mo23110q0()     // Catch:{ all -> 0x0d17 }
            r5.mo24515C(r6)     // Catch:{ all -> 0x0d17 }
            long r6 = r2.mo23109p0()     // Catch:{ all -> 0x0d17 }
            r5.mo24574z(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r5.mo24544c0()     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0acd
            r2.mo23080O(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0ad0
        L_0x0acd:
            r2.mo23068H0()     // Catch:{ all -> 0x0d17 }
        L_0x0ad0:
            com.google.android.gms.measurement.internal.l r6 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r6)     // Catch:{ all -> 0x0d17 }
            r6.mo24493o(r5)     // Catch:{ all -> 0x0d17 }
        L_0x0ad8:
            int r5 = r2.mo23086S()     // Catch:{ all -> 0x0d17 }
            if (r5 <= 0) goto L_0x0c5c
            com.google.android.gms.measurement.internal.j4 r5 = r1.f32345l     // Catch:{ all -> 0x0d17 }
            r5.mo24118b()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d4 r5 = r1.f32334a     // Catch:{ all -> 0x0d17 }
            m41279R(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r6 = r3.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.mo23219T1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.d4 r5 = r5.mo24228t(r6)     // Catch:{ all -> 0x0d17 }
            r6 = -1
            if (r5 == 0) goto L_0x0b05
            boolean r8 = r5.mo23319T()     // Catch:{ all -> 0x0d17 }
            if (r8 != 0) goto L_0x0afd
            goto L_0x0b05
        L_0x0afd:
            long r8 = r5.mo23309E()     // Catch:{ all -> 0x0d17 }
            r2.mo23058C(r8)     // Catch:{ all -> 0x0d17 }
            goto L_0x0b2c
        L_0x0b05:
            com.google.android.gms.internal.measurement.c5 r5 = r3.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r5 = r5.mo23200H()     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0b15
            r2.mo23058C(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0b2c
        L_0x0b15:
            com.google.android.gms.measurement.internal.f3 r5 = r41.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24261w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.c5 r9 = r3.f33208a     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = r9.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r9)     // Catch:{ all -> 0x0d17 }
            r5.mo24209b(r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x0b2c:
            com.google.android.gms.measurement.internal.l r5 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.h9 r2 = r2.mo23357k()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.c5 r2 = (com.google.android.gms.internal.measurement.C6906c5) r2     // Catch:{ all -> 0x0d17 }
            r5.mo24189f()     // Catch:{ all -> 0x0d17 }
            r5.mo24623g()     // Catch:{ all -> 0x0d17 }
            p033d5.C4141r.m28221k(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r2.mo23219T1()     // Catch:{ all -> 0x0d17 }
            p033d5.C4141r.m28217g(r8)     // Catch:{ all -> 0x0d17 }
            boolean r8 = r2.mo23228l1()     // Catch:{ all -> 0x0d17 }
            p033d5.C4141r.m28224n(r8)     // Catch:{ all -> 0x0d17 }
            r5.mo24489h0()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.j4 r8 = r5.f32389a     // Catch:{ all -> 0x0d17 }
            i5.e r8 = r8.mo24116a()     // Catch:{ all -> 0x0d17 }
            long r8 = r8.mo18370a()     // Catch:{ all -> 0x0d17 }
            long r10 = r2.mo23199G1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.j4 r12 = r5.f32389a     // Catch:{ all -> 0x0d17 }
            r12.mo24443z()     // Catch:{ all -> 0x0d17 }
            long r12 = com.google.android.gms.measurement.internal.C7370h.m41498g()     // Catch:{ all -> 0x0d17 }
            long r12 = r8 - r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0b80
            long r10 = r2.mo23199G1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.j4 r12 = r5.f32389a     // Catch:{ all -> 0x0d17 }
            r12.mo24443z()     // Catch:{ all -> 0x0d17 }
            long r12 = com.google.android.gms.measurement.internal.C7370h.m41498g()     // Catch:{ all -> 0x0d17 }
            long r12 = r12 + r8
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0ba3
        L_0x0b80:
            com.google.android.gms.measurement.internal.j4 r10 = r5.f32389a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f3 r10 = r10.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r10 = r10.mo24261w()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r2.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r12)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0d17 }
            long r13 = r2.mo23199G1()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0d17 }
            r10.mo24211d(r11, r12, r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x0ba3:
            byte[] r8 = r2.mo23736h()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.a9 r9 = r5.f32873b     // Catch:{ IOException -> 0x0c43 }
            com.google.android.gms.measurement.internal.c9 r9 = r9.f32340g     // Catch:{ IOException -> 0x0c43 }
            m41279R(r9)     // Catch:{ IOException -> 0x0c43 }
            byte[] r8 = r9.mo24203O(r8)     // Catch:{ IOException -> 0x0c43 }
            com.google.android.gms.measurement.internal.j4 r9 = r5.f32389a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f3 r9 = r9.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo24260v()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0d17 }
            r9.mo24209b(r10, r11)     // Catch:{ all -> 0x0d17 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0d17 }
            r9.<init>()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r2.mo23219T1()     // Catch:{ all -> 0x0d17 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r2.mo23199G1()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d17 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0d17 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d17 }
            boolean r8 = r2.mo23234r1()     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x0c02
            java.lang.String r8 = "retry_count"
            int r10 = r2.mo23186A1()     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0d17 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d17 }
        L_0x0c02:
            android.database.sqlite.SQLiteDatabase r8 = r5.mo24472P()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0c29 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0c5c
            com.google.android.gms.measurement.internal.j4 r6 = r5.f32389a     // Catch:{ SQLiteException -> 0x0c29 }
            com.google.android.gms.measurement.internal.f3 r6 = r6.mo24135l()     // Catch:{ SQLiteException -> 0x0c29 }
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo24256q()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r2.mo23219T1()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r8)     // Catch:{ SQLiteException -> 0x0c29 }
            r6.mo24209b(r7, r8)     // Catch:{ SQLiteException -> 0x0c29 }
            goto L_0x0c5c
        L_0x0c29:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.j4 r5 = r5.f32389a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r2 = r2.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r2)     // Catch:{ all -> 0x0d17 }
            r5.mo24210c(r7, r2, r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0c5c
        L_0x0c43:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.j4 r5 = r5.f32389a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r2 = r2.mo23219T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r2)     // Catch:{ all -> 0x0d17 }
            r5.mo24210c(r7, r2, r6)     // Catch:{ all -> 0x0d17 }
        L_0x0c5c:
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            java.util.List r3 = r3.f33209b     // Catch:{ all -> 0x0d17 }
            p033d5.C4141r.m28221k(r3)     // Catch:{ all -> 0x0d17 }
            r2.mo24189f()     // Catch:{ all -> 0x0d17 }
            r2.mo24623g()     // Catch:{ all -> 0x0d17 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0d17 }
            r6 = 0
        L_0x0c74:
            int r7 = r3.size()     // Catch:{ all -> 0x0d17 }
            if (r6 >= r7) goto L_0x0c91
            if (r6 == 0) goto L_0x0c81
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0d17 }
        L_0x0c81:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d17 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d17 }
            r5.append(r7)     // Catch:{ all -> 0x0d17 }
            int r6 = r6 + 1
            goto L_0x0c74
        L_0x0c91:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0d17 }
            android.database.sqlite.SQLiteDatabase r6 = r2.mo24472P()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0d17 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0d17 }
            int r6 = r3.size()     // Catch:{ all -> 0x0d17 }
            if (r5 == r6) goto L_0x0cc6
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d17 }
            int r3 = r3.size()     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d17 }
            r2.mo24210c(r6, r5, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0cc6:
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo24472P()     // Catch:{ all -> 0x0d17 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0cde }
            r6 = 0
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cde }
            r6 = 1
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cde }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r3.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0cde }
            goto L_0x0cf3
        L_0x0cde:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x0d17 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r4)     // Catch:{ all -> 0x0d17 }
            r2.mo24210c(r5, r4, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0cf3:
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            r2.mo24492n()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c
            m41279R(r2)
            r2.mo24487f0()
            r2 = 1
            return r2
        L_0x0d05:
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0d17 }
            m41279R(r2)     // Catch:{ all -> 0x0d17 }
            r2.mo24492n()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c
            m41279R(r2)
            r2.mo24487f0()
            r2 = 0
            return r2
        L_0x0d17:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.l r3 = r1.f32336c
            m41279R(r3)
            r3.mo24487f0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7303a9.m41275N(java.lang.String, long):boolean");
    }

    /* renamed from: O */
    private final boolean m41276O() {
        mo24143s().mo24189f();
        mo24123e();
        C7414l lVar = this.f32336c;
        m41279R(lVar);
        if (lVar.mo24495q()) {
            return true;
        }
        C7414l lVar2 = this.f32336c;
        m41279R(lVar2);
        return !TextUtils.isEmpty(lVar2.mo24481Z());
    }

    /* renamed from: P */
    private final boolean m41277P(C7134q4 q4Var, C7134q4 q4Var2) {
        String str;
        C4141r.m28211a("_e".equals(q4Var.mo23754G()));
        m41279R(this.f32340g);
        C7214v4 m = C7325c9.m41393m((C7150r4) q4Var.mo23357k(), "_sc");
        String str2 = null;
        if (m == null) {
            str = null;
        } else {
            str = m.mo23950J();
        }
        m41279R(this.f32340g);
        C7214v4 m2 = C7325c9.m41393m((C7150r4) q4Var2.mo23357k(), "_pc");
        if (m2 != null) {
            str2 = m2.mo23950J();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        C4141r.m28211a("_e".equals(q4Var.mo23754G()));
        m41279R(this.f32340g);
        C7214v4 m3 = C7325c9.m41393m((C7150r4) q4Var.mo23357k(), "_et");
        if (m3 == null || !m3.mo23954X() || m3.mo23948F() <= 0) {
            return true;
        }
        long F = m3.mo23948F();
        m41279R(this.f32340g);
        C7214v4 m4 = C7325c9.m41393m((C7150r4) q4Var2.mo23357k(), "_et");
        if (m4 != null && m4.mo23948F() > 0) {
            F += m4.mo23948F();
        }
        m41279R(this.f32340g);
        C7325c9.m41391P(q4Var2, "_et", Long.valueOf(F));
        m41279R(this.f32340g);
        C7325c9.m41391P(q4Var, "_fr", 1L);
        return true;
    }

    /* renamed from: Q */
    private static final boolean m41278Q(C7446n9 n9Var) {
        return !TextUtils.isEmpty(n9Var.f32788b) || !TextUtils.isEmpty(n9Var.f32803y);
    }

    /* renamed from: R */
    private static final C7478q8 m41279R(C7478q8 q8Var) {
        if (q8Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (q8Var.mo24625i()) {
            return q8Var;
        } else {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(q8Var.getClass())));
        }
    }

    /* renamed from: f0 */
    public static C7303a9 m41281f0(Context context) {
        C4141r.m28221k(context);
        C4141r.m28221k(context.getApplicationContext());
        if (f32328F == null) {
            synchronized (C7303a9.class) {
                if (f32328F == null) {
                    f32328F = new C7303a9((C7314b9) C4141r.m28221k(new C7314b9(context)), (C7397j4) null);
                }
            }
        }
        return f32328F;
    }

    /* renamed from: k0 */
    static /* bridge */ /* synthetic */ void m41282k0(C7303a9 a9Var, C7314b9 b9Var) {
        a9Var.mo24143s().mo24189f();
        a9Var.f32344k = new C7528v3(a9Var);
        C7414l lVar = new C7414l(a9Var);
        lVar.mo24624h();
        a9Var.f32336c = lVar;
        a9Var.mo24110U().mo24301z((C7359g) C4141r.m28221k(a9Var.f32334a));
        C7552x7 x7Var = new C7552x7(a9Var);
        x7Var.mo24624h();
        a9Var.f32342i = x7Var;
        C7304b bVar = new C7304b(a9Var);
        bVar.mo24624h();
        a9Var.f32339f = bVar;
        C7443n6 n6Var = new C7443n6(a9Var);
        n6Var.mo24624h();
        a9Var.f32341h = n6Var;
        C7456o8 o8Var = new C7456o8(a9Var);
        o8Var.mo24624h();
        a9Var.f32338e = o8Var;
        a9Var.f32337d = new C7429m3(a9Var);
        if (a9Var.f32350q != a9Var.f32351r) {
            a9Var.mo24135l().mo24256q().mo24210c("Not all upload components initialized", Integer.valueOf(a9Var.f32350q), Integer.valueOf(a9Var.f32351r));
        }
        a9Var.f32346m = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo24102A(String str, C13020b bVar) {
        mo24143s().mo24189f();
        mo24123e();
        this.f32329A.put(str, bVar);
        C7414l lVar = this.f32336c;
        m41279R(lVar);
        C4141r.m28221k(str);
        C4141r.m28221k(bVar);
        lVar.mo24189f();
        lVar.mo24623g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", bVar.mo38072h());
        try {
            if (lVar.mo24472P().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                lVar.f32389a.mo24135l().mo24256q().mo24209b("Failed to insert/update consent setting (got -1). appId", C7352f3.m41475z(str));
            }
        } catch (SQLiteException e) {
            lVar.f32389a.mo24135l().mo24256q().mo24210c("Error storing consent setting. appId, error", C7352f3.m41475z(str), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo24103B(C7336d9 d9Var, C7446n9 n9Var) {
        long j;
        C7336d9 d9Var2 = d9Var;
        C7446n9 n9Var2 = n9Var;
        mo24143s().mo24189f();
        mo24123e();
        if (m41278Q(n9Var)) {
            if (!n9Var2.f32794h) {
                mo24108S(n9Var2);
                return;
            }
            int n0 = mo24129h0().mo24393n0(d9Var2.f32439b);
            if (n0 != 0) {
                C7391i9 h0 = mo24129h0();
                String str = d9Var2.f32439b;
                mo24110U();
                String q = h0.mo24398q(str, 24, true);
                String str2 = d9Var2.f32439b;
                mo24129h0().mo24365B(this.f32333E, n9Var2.f32787a, n0, "_ev", q, str2 != null ? str2.length() : 0);
                return;
            }
            int j0 = mo24129h0().mo24388j0(d9Var2.f32439b, d9Var.mo24243I1());
            if (j0 != 0) {
                C7391i9 h02 = mo24129h0();
                String str3 = d9Var2.f32439b;
                mo24110U();
                String q2 = h02.mo24398q(str3, 24, true);
                Object I1 = d9Var.mo24243I1();
                mo24129h0().mo24365B(this.f32333E, n9Var2.f32787a, j0, "_ev", q2, (I1 == null || (!(I1 instanceof String) && !(I1 instanceof CharSequence))) ? 0 : I1.toString().length());
                return;
            }
            Object o = mo24129h0().mo24394o(d9Var2.f32439b, d9Var.mo24243I1());
            if (o != null) {
                if ("_sid".equals(d9Var2.f32439b)) {
                    long j2 = d9Var2.f32440c;
                    String str4 = d9Var2.f32443f;
                    String str5 = (String) C4141r.m28221k(n9Var2.f32787a);
                    C7414l lVar = this.f32336c;
                    m41279R(lVar);
                    C7358f9 X = lVar.mo24479X(str5, "_sno");
                    if (X != null) {
                        Object obj = X.f32493e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo24103B(new C7336d9("_sno", j2, Long.valueOf(j + 1), str4), n9Var2);
                        }
                    }
                    if (X != null) {
                        mo24135l().mo24261w().mo24209b("Retrieved last session number from database does not contain a valid (long) value", X.f32493e);
                    }
                    C7414l lVar2 = this.f32336c;
                    m41279R(lVar2);
                    C7480r V = lVar2.mo24478V(str5, "_s");
                    if (V != null) {
                        j = V.f32913c;
                        mo24135l().mo24260v().mo24209b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo24103B(new C7336d9("_sno", j2, Long.valueOf(j + 1), str4), n9Var2);
                }
                C7358f9 f9Var = new C7358f9((String) C4141r.m28221k(n9Var2.f32787a), (String) C4141r.m28221k(d9Var2.f32443f), d9Var2.f32439b, d9Var2.f32440c, o);
                mo24135l().mo24260v().mo24210c("Setting user property", this.f32345l.mo24414D().mo24097f(f9Var.f32491c), o);
                C7414l lVar3 = this.f32336c;
                m41279R(lVar3);
                lVar3.mo24486e0();
                try {
                    if ("_id".equals(f9Var.f32491c)) {
                        C7414l lVar4 = this.f32336c;
                        m41279R(lVar4);
                        C7358f9 X2 = lVar4.mo24479X(n9Var2.f32787a, "_id");
                        if (X2 != null && !f9Var.f32493e.equals(X2.f32493e)) {
                            C7414l lVar5 = this.f32336c;
                            m41279R(lVar5);
                            lVar5.mo24490k(n9Var2.f32787a, "_lair");
                        }
                    }
                    mo24108S(n9Var2);
                    C7414l lVar6 = this.f32336c;
                    m41279R(lVar6);
                    boolean x = lVar6.mo24501x(f9Var);
                    C7414l lVar7 = this.f32336c;
                    m41279R(lVar7);
                    lVar7.mo24492n();
                    if (!x) {
                        mo24135l().mo24256q().mo24210c("Too many unique user properties are set. Ignoring user property", this.f32345l.mo24414D().mo24097f(f9Var.f32491c), f9Var.f32493e);
                        mo24129h0().mo24365B(this.f32333E, n9Var2.f32787a, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    C7414l lVar8 = this.f32336c;
                    m41279R(lVar8);
                    lVar8.mo24487f0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:211|212) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0211, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0212, code lost:
        r8.f32389a.mo24135l().mo24256q().mo24210c("Failed to merge queued bundle. appId", com.google.android.gms.measurement.internal.C7352f3.m41475z(r6), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026b, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        mo24135l().mo24256q().mo24210c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C7352f3.m41475z(r6), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x055b, code lost:
        if (r11 != null) goto L_0x0538;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r11 != null) goto L_0x0108;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:211:0x04dc */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0294 A[SYNTHETIC, Splitter:B:142:0x0294] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029d A[Catch:{ all -> 0x012c, all -> 0x0580 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04f3 A[Catch:{ all -> 0x012c, all -> 0x0580 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0565 A[Catch:{ all -> 0x012c, all -> 0x0580 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x057c A[SYNTHETIC, Splitter:B:251:0x057c] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0130 A[Catch:{ all -> 0x012c, all -> 0x0580 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:55:0x0117=Splitter:B:55:0x0117, B:47:0x0108=Splitter:B:47:0x0108, B:129:0x0268=Splitter:B:129:0x0268, B:225:0x0538=Splitter:B:225:0x0538, B:58:0x0129=Splitter:B:58:0x0129, B:139:0x027b=Splitter:B:139:0x027b, B:202:0x045d=Splitter:B:202:0x045d, B:241:0x055f=Splitter:B:241:0x055f} */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24104C() {
        /*
            r22 = this;
            r1 = r22
            com.google.android.gms.measurement.internal.h4 r0 = r22.mo24143s()
            r0.mo24189f()
            r22.mo24123e()
            r2 = 1
            r1.f32354u = r2
            r3 = 0
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32345l     // Catch:{ all -> 0x0580 }
            r0.mo24118b()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32345l     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.v7 r0 = r0.mo24421L()     // Catch:{ all -> 0x0580 }
            java.lang.Boolean r0 = r0.mo24706J()     // Catch:{ all -> 0x0580 }
            if (r0 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.f3 r0 = r22.mo24135l()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()     // Catch:{ all -> 0x0580 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.mo24208a(r2)     // Catch:{ all -> 0x0580 }
            r1.f32354u = r3
        L_0x0030:
            r22.m41272K()
            return
        L_0x0034:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.measurement.internal.f3 r0 = r22.mo24135l()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ all -> 0x0580 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.mo24208a(r2)     // Catch:{ all -> 0x0580 }
            r1.f32354u = r3
            goto L_0x0030
        L_0x004a:
            long r4 = r1.f32348o     // Catch:{ all -> 0x0580 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            r22.m41274M()     // Catch:{ all -> 0x0580 }
            r1.f32354u = r3
            goto L_0x0030
        L_0x0058:
            com.google.android.gms.measurement.internal.h4 r0 = r22.mo24143s()     // Catch:{ all -> 0x0580 }
            r0.mo24189f()     // Catch:{ all -> 0x0580 }
            java.util.List r0 = r1.f32357x     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.f3 r0 = r22.mo24135l()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24260v()     // Catch:{ all -> 0x0580 }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.mo24208a(r2)     // Catch:{ all -> 0x0580 }
            r1.f32354u = r3
            goto L_0x0030
        L_0x0073:
            com.google.android.gms.measurement.internal.k3 r0 = r1.f32335b     // Catch:{ all -> 0x0580 }
            m41279R(r0)     // Catch:{ all -> 0x0580 }
            boolean r0 = r0.mo24457k()     // Catch:{ all -> 0x0580 }
            if (r0 != 0) goto L_0x0091
            com.google.android.gms.measurement.internal.f3 r0 = r22.mo24135l()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24260v()     // Catch:{ all -> 0x0580 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo24208a(r2)     // Catch:{ all -> 0x0580 }
            r22.m41274M()     // Catch:{ all -> 0x0580 }
            r1.f32354u = r3
            goto L_0x0030
        L_0x0091:
            i5.e r0 = r22.mo24116a()     // Catch:{ all -> 0x0580 }
            long r4 = r0.mo18370a()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.h r0 = r22.mo24110U()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.t2 r8 = com.google.android.gms.measurement.internal.C7516u2.f33029R     // Catch:{ all -> 0x0580 }
            r9 = 0
            int r0 = r0.mo24290n(r9, r8)     // Catch:{ all -> 0x0580 }
            r22.mo24110U()     // Catch:{ all -> 0x0580 }
            long r10 = com.google.android.gms.measurement.internal.C7370h.m41497I()     // Catch:{ all -> 0x0580 }
            long r10 = r4 - r10
            r8 = 0
        L_0x00ae:
            if (r8 >= r0) goto L_0x00b9
            boolean r12 = r1.m41275N(r9, r10)     // Catch:{ all -> 0x0580 }
            if (r12 == 0) goto L_0x00b9
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00b9:
            com.google.android.gms.measurement.internal.x7 r0 = r1.f32342i     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.f33188g     // Catch:{ all -> 0x0580 }
            long r10 = r0.mo24604a()     // Catch:{ all -> 0x0580 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.f3 r0 = r22.mo24135l()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24255p()     // Catch:{ all -> 0x0580 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0580 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0580 }
            r0.mo24209b(r6, r7)     // Catch:{ all -> 0x0580 }
        L_0x00dc:
            com.google.android.gms.measurement.internal.l r0 = r1.f32336c     // Catch:{ all -> 0x0580 }
            m41279R(r0)     // Catch:{ all -> 0x0580 }
            java.lang.String r6 = r0.mo24481Z()     // Catch:{ all -> 0x0580 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0580 }
            r7 = -1
            if (r0 != 0) goto L_0x04f7
            long r10 = r1.f32359z     // Catch:{ all -> 0x0580 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0134
            com.google.android.gms.measurement.internal.l r10 = r1.f32336c     // Catch:{ all -> 0x0580 }
            m41279R(r10)     // Catch:{ all -> 0x0580 }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo24472P()     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0111 }
            if (r0 != 0) goto L_0x010c
        L_0x0108:
            r11.close()     // Catch:{ all -> 0x0580 }
            goto L_0x0129
        L_0x010c:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0111 }
            goto L_0x0108
        L_0x0111:
            r0 = move-exception
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            goto L_0x012e
        L_0x0115:
            r0 = move-exception
            r11 = r9
        L_0x0117:
            com.google.android.gms.measurement.internal.j4 r10 = r10.f32389a     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.f3 r10 = r10.mo24135l()     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.d3 r10 = r10.mo24256q()     // Catch:{ all -> 0x012c }
            java.lang.String r12 = "Error querying raw events"
            r10.mo24209b(r12, r0)     // Catch:{ all -> 0x012c }
            if (r11 == 0) goto L_0x0129
            goto L_0x0108
        L_0x0129:
            r1.f32359z = r7     // Catch:{ all -> 0x0580 }
            goto L_0x0134
        L_0x012c:
            r0 = move-exception
            r9 = r11
        L_0x012e:
            if (r9 == 0) goto L_0x0133
            r9.close()     // Catch:{ all -> 0x0580 }
        L_0x0133:
            throw r0     // Catch:{ all -> 0x0580 }
        L_0x0134:
            com.google.android.gms.measurement.internal.h r0 = r22.mo24110U()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.t2 r7 = com.google.android.gms.measurement.internal.C7516u2.f33052h     // Catch:{ all -> 0x0580 }
            int r0 = r0.mo24290n(r6, r7)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.h r7 = r22.mo24110U()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.t2 r8 = com.google.android.gms.measurement.internal.C7516u2.f33054i     // Catch:{ all -> 0x0580 }
            int r7 = r7.mo24290n(r6, r8)     // Catch:{ all -> 0x0580 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.l r8 = r1.f32336c     // Catch:{ all -> 0x0580 }
            m41279R(r8)     // Catch:{ all -> 0x0580 }
            r8.mo24189f()     // Catch:{ all -> 0x0580 }
            r8.mo24623g()     // Catch:{ all -> 0x0580 }
            if (r0 <= 0) goto L_0x015b
            r10 = 1
            goto L_0x015c
        L_0x015b:
            r10 = 0
        L_0x015c:
            p033d5.C4141r.m28211a(r10)     // Catch:{ all -> 0x0580 }
            if (r7 <= 0) goto L_0x0163
            r10 = 1
            goto L_0x0164
        L_0x0163:
            r10 = 0
        L_0x0164:
            p033d5.C4141r.m28211a(r10)     // Catch:{ all -> 0x0580 }
            p033d5.C4141r.m28217g(r6)     // Catch:{ all -> 0x0580 }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo24472P()     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r12 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r14 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14}     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x026f }
            if (r0 != 0) goto L_0x019f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x026f }
            r11.close()     // Catch:{ all -> 0x0580 }
            r20 = r4
            goto L_0x0297
        L_0x019f:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x026f }
            r12.<init>()     // Catch:{ SQLiteException -> 0x026f }
            r13 = 0
        L_0x01a5:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x026f }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0242 }
            com.google.android.gms.measurement.internal.a9 r2 = r8.f32873b     // Catch:{ IOException -> 0x0242 }
            com.google.android.gms.measurement.internal.c9 r2 = r2.f32340g     // Catch:{ IOException -> 0x0242 }
            m41279R(r2)     // Catch:{ IOException -> 0x0242 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x022d }
            r9.<init>(r0)     // Catch:{ IOException -> 0x022d }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x022d }
            r0.<init>(r9)     // Catch:{ IOException -> 0x022d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x022d }
            r3.<init>()     // Catch:{ IOException -> 0x022d }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x022d }
            r20 = r4
        L_0x01c9:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x022b }
            if (r4 > 0) goto L_0x0226
            r0.close()     // Catch:{ IOException -> 0x022b }
            r9.close()     // Catch:{ IOException -> 0x022b }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x022b }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x026d }
            if (r2 != 0) goto L_0x01e5
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01e5
            goto L_0x0268
        L_0x01e5:
            com.google.android.gms.internal.measurement.b5 r2 = com.google.android.gms.internal.measurement.C6906c5.m39757P1()     // Catch:{ IOException -> 0x0211 }
            com.google.android.gms.internal.measurement.ma r2 = com.google.android.gms.measurement.internal.C7325c9.m41387C(r2, r0)     // Catch:{ IOException -> 0x0211 }
            com.google.android.gms.internal.measurement.b5 r2 = (com.google.android.gms.internal.measurement.C6889b5) r2     // Catch:{ IOException -> 0x0211 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x026d }
            if (r4 != 0) goto L_0x01fd
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo23092Z(r4)     // Catch:{ SQLiteException -> 0x026d }
        L_0x01fd:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r13 = r13 + r0
            com.google.android.gms.internal.measurement.h9 r0 = r2.mo23357k()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.internal.measurement.c5 r0 = (com.google.android.gms.internal.measurement.C6906c5) r0     // Catch:{ SQLiteException -> 0x026d }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x026d }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x026d }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0211:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j4 r2 = r8.f32389a     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo24210c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0226:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x022b }
            goto L_0x01c9
        L_0x022b:
            r0 = move-exception
            goto L_0x0230
        L_0x022d:
            r0 = move-exception
            r20 = r4
        L_0x0230:
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a     // Catch:{ IOException -> 0x0240 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ IOException -> 0x0240 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ IOException -> 0x0240 }
            java.lang.String r3 = "Failed to ungzip content"
            r2.mo24209b(r3, r0)     // Catch:{ IOException -> 0x0240 }
            throw r0     // Catch:{ IOException -> 0x0240 }
        L_0x0240:
            r0 = move-exception
            goto L_0x0245
        L_0x0242:
            r0 = move-exception
            r20 = r4
        L_0x0245:
            com.google.android.gms.measurement.internal.j4 r2 = r8.f32389a     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo24210c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
        L_0x0258:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x026d }
            if (r0 == 0) goto L_0x0268
            if (r13 <= r7) goto L_0x0261
            goto L_0x0268
        L_0x0261:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x01a5
        L_0x0268:
            r11.close()     // Catch:{ all -> 0x0580 }
            r0 = r12
            goto L_0x0297
        L_0x026d:
            r0 = move-exception
            goto L_0x027b
        L_0x026f:
            r0 = move-exception
            r20 = r4
            goto L_0x027b
        L_0x0273:
            r0 = move-exception
            r9 = 0
            goto L_0x04f1
        L_0x0277:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x027b:
            com.google.android.gms.measurement.internal.j4 r2 = r8.f32389a     // Catch:{ all -> 0x04ef }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x04ef }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x04ef }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r6)     // Catch:{ all -> 0x04ef }
            r2.mo24210c(r3, r4, r0)     // Catch:{ all -> 0x04ef }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04ef }
            if (r11 == 0) goto L_0x0297
            r11.close()     // Catch:{ all -> 0x0580 }
        L_0x0297:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0580 }
            if (r2 != 0) goto L_0x0573
            y5.b r2 = r1.mo24111V(r6)     // Catch:{ all -> 0x0580 }
            y5.a r3 = p402y5.C13018a.AD_STORAGE     // Catch:{ all -> 0x0580 }
            boolean r2 = r2.mo38074i(r3)     // Catch:{ all -> 0x0580 }
            if (r2 == 0) goto L_0x02fe
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0580 }
        L_0x02ad:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0580 }
            if (r3 == 0) goto L_0x02cc
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0580 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0580 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.c5 r3 = (com.google.android.gms.internal.measurement.C6906c5) r3     // Catch:{ all -> 0x0580 }
            java.lang.String r4 = r3.mo23207L()     // Catch:{ all -> 0x0580 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0580 }
            if (r4 != 0) goto L_0x02ad
            java.lang.String r2 = r3.mo23207L()     // Catch:{ all -> 0x0580 }
            goto L_0x02cd
        L_0x02cc:
            r2 = 0
        L_0x02cd:
            if (r2 == 0) goto L_0x02fe
            r3 = 0
        L_0x02d0:
            int r4 = r0.size()     // Catch:{ all -> 0x0580 }
            if (r3 >= r4) goto L_0x02fe
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0580 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0580 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.c5 r4 = (com.google.android.gms.internal.measurement.C6906c5) r4     // Catch:{ all -> 0x0580 }
            java.lang.String r5 = r4.mo23207L()     // Catch:{ all -> 0x0580 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0580 }
            if (r5 == 0) goto L_0x02eb
            goto L_0x02fb
        L_0x02eb:
            java.lang.String r4 = r4.mo23207L()     // Catch:{ all -> 0x0580 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0580 }
            if (r4 != 0) goto L_0x02fb
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x0580 }
            goto L_0x02fe
        L_0x02fb:
            int r3 = r3 + 1
            goto L_0x02d0
        L_0x02fe:
            com.google.android.gms.internal.measurement.z4 r2 = com.google.android.gms.internal.measurement.C6872a5.m39460C()     // Catch:{ all -> 0x0580 }
            int r3 = r0.size()     // Catch:{ all -> 0x0580 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0580 }
            int r5 = r0.size()     // Catch:{ all -> 0x0580 }
            r4.<init>(r5)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.h r5 = r22.mo24110U()     // Catch:{ all -> 0x0580 }
            boolean r5 = r5.mo24280C(r6)     // Catch:{ all -> 0x0580 }
            if (r5 == 0) goto L_0x0327
            y5.b r5 = r1.mo24111V(r6)     // Catch:{ all -> 0x0580 }
            y5.a r7 = p402y5.C13018a.AD_STORAGE     // Catch:{ all -> 0x0580 }
            boolean r5 = r5.mo38074i(r7)     // Catch:{ all -> 0x0580 }
            if (r5 == 0) goto L_0x0327
            r5 = 1
            goto L_0x0328
        L_0x0327:
            r5 = 0
        L_0x0328:
            y5.b r7 = r1.mo24111V(r6)     // Catch:{ all -> 0x0580 }
            y5.a r8 = p402y5.C13018a.AD_STORAGE     // Catch:{ all -> 0x0580 }
            boolean r7 = r7.mo38074i(r8)     // Catch:{ all -> 0x0580 }
            y5.b r8 = r1.mo24111V(r6)     // Catch:{ all -> 0x0580 }
            y5.a r9 = p402y5.C13018a.ANALYTICS_STORAGE     // Catch:{ all -> 0x0580 }
            boolean r8 = r8.mo38074i(r9)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.C7016ie.m40214b()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.h r9 = r22.mo24110U()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.t2 r10 = com.google.android.gms.measurement.internal.C7516u2.f33065n0     // Catch:{ all -> 0x0580 }
            r11 = 0
            boolean r9 = r9.mo24279B(r11, r10)     // Catch:{ all -> 0x0580 }
            if (r9 == 0) goto L_0x035a
            com.google.android.gms.measurement.internal.h r9 = r22.mo24110U()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.t2 r10 = com.google.android.gms.measurement.internal.C7516u2.f33069p0     // Catch:{ all -> 0x0580 }
            boolean r9 = r9.mo24279B(r6, r10)     // Catch:{ all -> 0x0580 }
            if (r9 == 0) goto L_0x035a
            r9 = 1
            goto L_0x035b
        L_0x035a:
            r9 = 0
        L_0x035b:
            r10 = 0
        L_0x035c:
            if (r10 >= r3) goto L_0x03da
            java.lang.Object r11 = r0.get(r10)     // Catch:{ all -> 0x0580 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0580 }
            java.lang.Object r11 = r11.first     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.c5 r11 = (com.google.android.gms.internal.measurement.C6906c5) r11     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.e9 r11 = r11.mo23501z()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.b5 r11 = (com.google.android.gms.internal.measurement.C6889b5) r11     // Catch:{ all -> 0x0580 }
            java.lang.Object r12 = r0.get(r10)     // Catch:{ all -> 0x0580 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x0580 }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x0580 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0580 }
            r4.add(r12)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.h r12 = r22.mo24110U()     // Catch:{ all -> 0x0580 }
            r12.mo24292p()     // Catch:{ all -> 0x0580 }
            r12 = 74029(0x1212d, double:3.6575E-319)
            r11.mo23098f0(r12)     // Catch:{ all -> 0x0580 }
            r12 = r20
            r11.mo23097e0(r12)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.j4 r14 = r1.f32345l     // Catch:{ all -> 0x0580 }
            r14.mo24118b()     // Catch:{ all -> 0x0580 }
            r14 = 0
            r11.mo23093a0(r14)     // Catch:{ all -> 0x0580 }
            if (r5 != 0) goto L_0x039b
            r11.mo23063E0()     // Catch:{ all -> 0x0580 }
        L_0x039b:
            if (r7 != 0) goto L_0x03a3
            r11.mo23079N0()     // Catch:{ all -> 0x0580 }
            r11.mo23070I0()     // Catch:{ all -> 0x0580 }
        L_0x03a3:
            if (r8 != 0) goto L_0x03a8
            r11.mo23057B0()     // Catch:{ all -> 0x0580 }
        L_0x03a8:
            r1.mo24125f(r6, r11)     // Catch:{ all -> 0x0580 }
            if (r9 != 0) goto L_0x03b0
            r11.mo23081O0()     // Catch:{ all -> 0x0580 }
        L_0x03b0:
            com.google.android.gms.measurement.internal.h r14 = r22.mo24110U()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.t2 r15 = com.google.android.gms.measurement.internal.C7516u2.f33033V     // Catch:{ all -> 0x0580 }
            boolean r14 = r14.mo24279B(r6, r15)     // Catch:{ all -> 0x0580 }
            if (r14 == 0) goto L_0x03d2
            com.google.android.gms.internal.measurement.h9 r14 = r11.mo23357k()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.c5 r14 = (com.google.android.gms.internal.measurement.C6906c5) r14     // Catch:{ all -> 0x0580 }
            byte[] r14 = r14.mo23736h()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.c9 r15 = r1.f32340g     // Catch:{ all -> 0x0580 }
            m41279R(r15)     // Catch:{ all -> 0x0580 }
            long r14 = r15.mo24204x(r14)     // Catch:{ all -> 0x0580 }
            r11.mo23056B(r14)     // Catch:{ all -> 0x0580 }
        L_0x03d2:
            r2.mo24031p(r11)     // Catch:{ all -> 0x0580 }
            int r10 = r10 + 1
            r20 = r12
            goto L_0x035c
        L_0x03da:
            r12 = r20
            com.google.android.gms.measurement.internal.f3 r0 = r22.mo24135l()     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r0.mo24253C()     // Catch:{ all -> 0x0580 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x03fc
            com.google.android.gms.measurement.internal.c9 r0 = r1.f32340g     // Catch:{ all -> 0x0580 }
            m41279R(r0)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.h9 r5 = r2.mo23357k()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.a5 r5 = (com.google.android.gms.internal.measurement.C6872a5) r5     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r0.mo24195D(r5)     // Catch:{ all -> 0x0580 }
            r11 = r0
            goto L_0x03fd
        L_0x03fc:
            r11 = 0
        L_0x03fd:
            com.google.android.gms.measurement.internal.c9 r0 = r1.f32340g     // Catch:{ all -> 0x0580 }
            m41279R(r0)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.h9 r0 = r2.mo23357k()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.a5 r0 = (com.google.android.gms.internal.measurement.C6872a5) r0     // Catch:{ all -> 0x0580 }
            byte[] r14 = r0.mo23736h()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.r8 r0 = r1.f32343j     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.a9 r0 = r0.f32873b     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.d4 r0 = r0.f32334a     // Catch:{ all -> 0x0580 }
            m41279R(r0)     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r0.mo24231w(r6)     // Catch:{ all -> 0x0580 }
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0580 }
            if (r5 != 0) goto L_0x0454
            com.google.android.gms.measurement.internal.t2 r5 = com.google.android.gms.measurement.internal.C7516u2.f33072r     // Catch:{ all -> 0x0580 }
            r7 = 0
            java.lang.Object r5 = r5.mo24669a(r7)     // Catch:{ all -> 0x0580 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0580 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0580 }
            android.net.Uri$Builder r7 = r5.buildUpon()     // Catch:{ all -> 0x0580 }
            java.lang.String r5 = r5.getAuthority()     // Catch:{ all -> 0x0580 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0580 }
            r8.<init>()     // Catch:{ all -> 0x0580 }
            r8.append(r0)     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = "."
            r8.append(r0)     // Catch:{ all -> 0x0580 }
            r8.append(r5)     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0580 }
            r7.authority(r0)     // Catch:{ all -> 0x0580 }
            android.net.Uri r0 = r7.build()     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0580 }
            goto L_0x045d
        L_0x0454:
            com.google.android.gms.measurement.internal.t2 r0 = com.google.android.gms.measurement.internal.C7516u2.f33072r     // Catch:{ all -> 0x0580 }
            r5 = 0
            java.lang.Object r0 = r0.mo24669a(r5)     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0580 }
        L_0x045d:
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x04dc }
            r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x04dc }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x04dc }
            r8 = 1
            r7 = r7 ^ r8
            p033d5.C4141r.m28211a(r7)     // Catch:{ MalformedURLException -> 0x04dc }
            java.util.List r7 = r1.f32357x     // Catch:{ MalformedURLException -> 0x04dc }
            if (r7 == 0) goto L_0x047d
            com.google.android.gms.measurement.internal.f3 r4 = r22.mo24135l()     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24256q()     // Catch:{ MalformedURLException -> 0x04dc }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.mo24208a(r7)     // Catch:{ MalformedURLException -> 0x04dc }
            goto L_0x0484
        L_0x047d:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x04dc }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x04dc }
            r1.f32357x = r7     // Catch:{ MalformedURLException -> 0x04dc }
        L_0x0484:
            com.google.android.gms.measurement.internal.x7 r4 = r1.f32342i     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.p3 r4 = r4.f33189h     // Catch:{ MalformedURLException -> 0x04dc }
            r4.mo24605b(r12)     // Catch:{ MalformedURLException -> 0x04dc }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x0498
            r3 = 0
            com.google.android.gms.internal.measurement.c5 r2 = r2.mo24032r(r3)     // Catch:{ MalformedURLException -> 0x04dc }
            java.lang.String r4 = r2.mo23219T1()     // Catch:{ MalformedURLException -> 0x04dc }
        L_0x0498:
            com.google.android.gms.measurement.internal.f3 r2 = r22.mo24135l()     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24260v()     // Catch:{ MalformedURLException -> 0x04dc }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x04dc }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x04dc }
            r2.mo24211d(r3, r4, r7, r11)     // Catch:{ MalformedURLException -> 0x04dc }
            r2 = 1
            r1.f32353t = r2     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.k3 r11 = r1.f32335b     // Catch:{ MalformedURLException -> 0x04dc }
            m41279R(r11)     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.t8 r2 = new com.google.android.gms.measurement.internal.t8     // Catch:{ MalformedURLException -> 0x04dc }
            r2.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x04dc }
            r11.mo24189f()     // Catch:{ MalformedURLException -> 0x04dc }
            r11.mo24623g()     // Catch:{ MalformedURLException -> 0x04dc }
            p033d5.C4141r.m28221k(r5)     // Catch:{ MalformedURLException -> 0x04dc }
            p033d5.C4141r.m28221k(r14)     // Catch:{ MalformedURLException -> 0x04dc }
            p033d5.C4141r.m28221k(r2)     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.j4 r3 = r11.f32389a     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.h4 r3 = r3.mo24143s()     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.j3 r4 = new com.google.android.gms.measurement.internal.j3     // Catch:{ MalformedURLException -> 0x04dc }
            r15 = 0
            r10 = r4
            r12 = r6
            r13 = r5
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x04dc }
            r3.mo24308y(r4)     // Catch:{ MalformedURLException -> 0x04dc }
            goto L_0x0573
        L_0x04dc:
            com.google.android.gms.measurement.internal.f3 r2 = r22.mo24135l()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x0580 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r6)     // Catch:{ all -> 0x0580 }
            r2.mo24210c(r3, r4, r0)     // Catch:{ all -> 0x0580 }
            goto L_0x0573
        L_0x04ef:
            r0 = move-exception
            r9 = r11
        L_0x04f1:
            if (r9 == 0) goto L_0x04f6
            r9.close()     // Catch:{ all -> 0x0580 }
        L_0x04f6:
            throw r0     // Catch:{ all -> 0x0580 }
        L_0x04f7:
            r12 = r4
            r5 = r9
            r1.f32359z = r7     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0580 }
            m41279R(r2)     // Catch:{ all -> 0x0580 }
            r22.mo24110U()     // Catch:{ all -> 0x0580 }
            long r3 = com.google.android.gms.measurement.internal.C7370h.m41497I()     // Catch:{ all -> 0x0580 }
            long r3 = r12 - r3
            r2.mo24189f()     // Catch:{ all -> 0x0580 }
            r2.mo24623g()     // Catch:{ all -> 0x0580 }
            android.database.sqlite.SQLiteDatabase r0 = r2.mo24472P()     // Catch:{ SQLiteException -> 0x054a, all -> 0x0547 }
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x054a, all -> 0x0547 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x054a, all -> 0x0547 }
            r4 = 0
            r6[r4] = r3     // Catch:{ SQLiteException -> 0x054a, all -> 0x0547 }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r3, r6)     // Catch:{ SQLiteException -> 0x054a, all -> 0x0547 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0545 }
            if (r0 != 0) goto L_0x053c
            com.google.android.gms.measurement.internal.j4 r0 = r2.f32389a     // Catch:{ SQLiteException -> 0x0545 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ SQLiteException -> 0x0545 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24260v()     // Catch:{ SQLiteException -> 0x0545 }
            java.lang.String r3 = "No expired configs for apps with pending events"
            r0.mo24208a(r3)     // Catch:{ SQLiteException -> 0x0545 }
        L_0x0538:
            r11.close()     // Catch:{ all -> 0x0580 }
            goto L_0x055e
        L_0x053c:
            r3 = 0
            java.lang.String r9 = r11.getString(r3)     // Catch:{ SQLiteException -> 0x0545 }
            r11.close()     // Catch:{ all -> 0x0580 }
            goto L_0x055f
        L_0x0545:
            r0 = move-exception
            goto L_0x054c
        L_0x0547:
            r0 = move-exception
            r9 = r5
            goto L_0x057a
        L_0x054a:
            r0 = move-exception
            r11 = r5
        L_0x054c:
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a     // Catch:{ all -> 0x0578 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x0578 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x0578 }
            java.lang.String r3 = "Error selecting expired configs"
            r2.mo24209b(r3, r0)     // Catch:{ all -> 0x0578 }
            if (r11 == 0) goto L_0x055e
            goto L_0x0538
        L_0x055e:
            r9 = r5
        L_0x055f:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0580 }
            if (r0 != 0) goto L_0x0573
            com.google.android.gms.measurement.internal.l r0 = r1.f32336c     // Catch:{ all -> 0x0580 }
            m41279R(r0)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.m5 r0 = r0.mo24474R(r9)     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x0573
            r1.mo24126g(r0)     // Catch:{ all -> 0x0580 }
        L_0x0573:
            r2 = 0
            r1.f32354u = r2
            goto L_0x0030
        L_0x0578:
            r0 = move-exception
            r9 = r11
        L_0x057a:
            if (r9 == 0) goto L_0x057f
            r9.close()     // Catch:{ all -> 0x0580 }
        L_0x057f:
            throw r0     // Catch:{ all -> 0x0580 }
        L_0x0580:
            r0 = move-exception
            r2 = 0
            r1.f32354u = r2
            r22.m41272K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7303a9.mo24104C():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x073f, code lost:
        if (r14.isEmpty() != false) goto L_0x0741;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0932, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x030b A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0369 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x04f9 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0538 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x05b1 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x05fe A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x060b A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0618 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0650 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0661 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x06a2 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x06bd A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0744 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x078a A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x07d2 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x07eb A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0877 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0896 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0928 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x09d3 A[Catch:{ SQLiteException -> 0x09ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x09e9  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0934 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0155 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016b A[SYNTHETIC, Splitter:B:46:0x016b] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e6 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02be A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0308 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24105D(com.google.android.gms.measurement.internal.C7524v r35, com.google.android.gms.measurement.internal.C7446n9 r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            p033d5.C4141r.m28221k(r36)
            java.lang.String r8 = r3.f32787a
            p033d5.C4141r.m28217g(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.h4 r10 = r34.mo24143s()
            r10.mo24189f()
            r34.mo24123e()
            java.lang.String r10 = r3.f32787a
            com.google.android.gms.measurement.internal.c9 r11 = r1.f32340g
            m41279R(r11)
            boolean r11 = com.google.android.gms.measurement.internal.C7325c9.m41392k(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f32794h
            if (r11 == 0) goto L_0x0a75
            com.google.android.gms.measurement.internal.d4 r11 = r1.f32334a
            m41279R(r11)
            java.lang.String r12 = r2.f33101a
            boolean r11 = r11.mo24217F(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.f3 r3 = r34.mo24135l()
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24261w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r10)
            com.google.android.gms.measurement.internal.j4 r5 = r1.f32345l
            com.google.android.gms.measurement.internal.a3 r5 = r5.mo24414D()
            java.lang.String r6 = r2.f33101a
            java.lang.String r5 = r5.mo24095d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.mo24210c(r6, r4, r5)
            com.google.android.gms.measurement.internal.d4 r3 = r1.f32334a
            m41279R(r3)
            boolean r3 = r3.mo24215D(r10)
            if (r3 != 0) goto L_0x0097
            com.google.android.gms.measurement.internal.d4 r3 = r1.f32334a
            m41279R(r3)
            boolean r3 = r3.mo24218G(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.f33101a
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.google.android.gms.measurement.internal.i9 r11 = r34.mo24129h0()
            com.google.android.gms.measurement.internal.h9 r12 = r1.f32333E
            r14 = 11
            java.lang.String r2 = r2.f33101a
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.mo24365B(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c
            m41279R(r2)
            com.google.android.gms.measurement.internal.m5 r2 = r2.mo24474R(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.mo24534V()
            long r5 = r2.mo24525M()
            long r3 = java.lang.Math.max(r3, r5)
            i5.e r5 = r34.mo24116a()
            long r5 = r5.mo18370a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.mo24110U()
            com.google.android.gms.measurement.internal.t2 r5 = com.google.android.gms.measurement.internal.C7516u2.f33012A
            java.lang.Object r5 = r5.mo24669a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.f3 r3 = r34.mo24135l()
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24255p()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.mo24208a(r4)
            r1.mo24126g(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.g3 r2 = com.google.android.gms.measurement.internal.C7363g3.m41489b(r35)
            com.google.android.gms.measurement.internal.i9 r11 = r34.mo24129h0()
            com.google.android.gms.measurement.internal.h r12 = r34.mo24110U()
            int r12 = r12.mo24289m(r10)
            r11.mo24364A(r2, r12)
            com.google.android.gms.measurement.internal.v r2 = r2.mo24270a()
            com.google.android.gms.measurement.internal.f3 r11 = r34.mo24135l()
            java.lang.String r11 = r11.mo24253C()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.f3 r11 = r34.mo24135l()
            com.google.android.gms.measurement.internal.d3 r11 = r11.mo24260v()
            com.google.android.gms.measurement.internal.j4 r12 = r1.f32345l
            com.google.android.gms.measurement.internal.a3 r12 = r12.mo24414D()
            java.lang.String r12 = r12.mo24094c(r2)
            java.lang.String r13 = "Logging event"
            r11.mo24209b(r13, r12)
        L_0x011c:
            com.google.android.gms.measurement.internal.l r11 = r1.f32336c
            m41279R(r11)
            r11.mo24486e0()
            r1.mo24108S(r3)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f33101a     // Catch:{ all -> 0x0a6a }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0a6a }
            java.lang.String r12 = "refund"
            r28 = r8
            if (r11 != 0) goto L_0x014a
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.f33101a     // Catch:{ all -> 0x0a6a }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0a6a }
            if (r9 != 0) goto L_0x014a
            java.lang.String r9 = r2.f33101a     // Catch:{ all -> 0x0a6a }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a6a }
            if (r9 == 0) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r9 = 0
            goto L_0x014b
        L_0x014a:
            r9 = 1
        L_0x014b:
            java.lang.String r11 = "_iap"
            java.lang.String r13 = r2.f33101a     // Catch:{ all -> 0x0a6a }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0a6a }
            if (r11 != 0) goto L_0x015f
            if (r9 == 0) goto L_0x0159
            r9 = 1
            goto L_0x015f
        L_0x0159:
            r33 = r4
            r8 = r15
        L_0x015c:
            r4 = 2
            goto L_0x02f5
        L_0x015f:
            com.google.android.gms.measurement.internal.t r11 = r2.f33102b     // Catch:{ all -> 0x0a6a }
            java.lang.String r13 = "currency"
            java.lang.String r11 = r11.mo24665O1(r13)     // Catch:{ all -> 0x0a6a }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x01d4
            com.google.android.gms.measurement.internal.t r9 = r2.f33102b     // Catch:{ all -> 0x0a6a }
            java.lang.Double r9 = r9.mo24662L1(r13)     // Catch:{ all -> 0x0a6a }
            double r17 = r9.doubleValue()     // Catch:{ all -> 0x0a6a }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r9 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x0192
            com.google.android.gms.measurement.internal.t r9 = r2.f33102b     // Catch:{ all -> 0x0a6a }
            java.lang.Long r9 = r9.mo24663M1(r13)     // Catch:{ all -> 0x0a6a }
            r21 = r15
            long r14 = r9.longValue()     // Catch:{ all -> 0x0a6a }
            double r13 = (double) r14     // Catch:{ all -> 0x0a6a }
            double r17 = r13 * r19
            goto L_0x0194
        L_0x0192:
            r21 = r15
        L_0x0194:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x01ae
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x01ae
            long r13 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r2.f33101a     // Catch:{ all -> 0x0a6a }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a6a }
            if (r9 == 0) goto L_0x01e0
            long r13 = -r13
            goto L_0x01e0
        L_0x01ae:
            com.google.android.gms.measurement.internal.f3 r2 = r34.mo24135l()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24261w()     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r10)     // Catch:{ all -> 0x0a6a }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0a6a }
            r2.mo24210c(r3, r4, r5)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r2)     // Catch:{ all -> 0x0a6a }
            r2.mo24492n()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c
            m41279R(r2)
            r2.mo24487f0()
            return
        L_0x01d4:
            r21 = r15
            com.google.android.gms.measurement.internal.t r9 = r2.f33102b     // Catch:{ all -> 0x0a6a }
            java.lang.Long r9 = r9.mo24663M1(r13)     // Catch:{ all -> 0x0a6a }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a6a }
        L_0x01e0:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0a6a }
            if (r9 != 0) goto L_0x02ef
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0a6a }
            if (r11 == 0) goto L_0x02ef
            java.lang.String r11 = "_ltv_"
            java.lang.String r9 = r11.concat(r9)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.l r11 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r11)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.f9 r11 = r11.mo24479X(r10, r9)     // Catch:{ all -> 0x0a6a }
            if (r11 == 0) goto L_0x023a
            java.lang.Object r11 = r11.f32493e     // Catch:{ all -> 0x0a6a }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a6a }
            if (r12 != 0) goto L_0x020c
            goto L_0x023a
        L_0x020c:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0a6a }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.f9 r18 = new com.google.android.gms.measurement.internal.f9     // Catch:{ all -> 0x0a6a }
            java.lang.String r15 = r2.f33103c     // Catch:{ all -> 0x0a6a }
            i5.e r17 = r34.mo24116a()     // Catch:{ all -> 0x0a6a }
            long r19 = r17.mo18370a()     // Catch:{ all -> 0x0a6a }
            long r11 = r11 + r13
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0a6a }
            r11 = r18
            r12 = r10
            r14 = 0
            r13 = r15
            r8 = 0
            r15 = 0
            r14 = r9
            r9 = r21
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0a6a }
            r33 = r4
            r8 = r9
            r9 = r18
            r4 = 2
            goto L_0x02b3
        L_0x023a:
            r15 = r21
            r8 = 0
            com.google.android.gms.measurement.internal.l r11 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r11)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.h r12 = r34.mo24110U()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.t2 r8 = com.google.android.gms.measurement.internal.C7516u2.f33017F     // Catch:{ all -> 0x0a6a }
            int r8 = r12.mo24290n(r10, r8)     // Catch:{ all -> 0x0a6a }
            int r8 = r8 + -1
            p033d5.C4141r.m28217g(r10)     // Catch:{ all -> 0x0a6a }
            r11.mo24189f()     // Catch:{ all -> 0x0a6a }
            r11.mo24623g()     // Catch:{ all -> 0x0a6a }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo24472P()     // Catch:{ SQLiteException -> 0x027d }
            r21 = r15
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0279 }
            r16 = 0
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x0279 }
            r16 = 1
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x0279 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x0279 }
            r33 = r4
            r4 = 2
            r15[r4] = r8     // Catch:{ SQLiteException -> 0x0277 }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12.execSQL(r8, r15)     // Catch:{ SQLiteException -> 0x0277 }
            goto L_0x0297
        L_0x0277:
            r0 = move-exception
            goto L_0x0283
        L_0x0279:
            r0 = move-exception
            r33 = r4
            goto L_0x0282
        L_0x027d:
            r0 = move-exception
            r33 = r4
            r21 = r15
        L_0x0282:
            r4 = 2
        L_0x0283:
            r8 = r0
            com.google.android.gms.measurement.internal.j4 r11 = r11.f32389a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.f3 r11 = r11.mo24135l()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.d3 r11 = r11.mo24256q()     // Catch:{ all -> 0x0a6a }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r10)     // Catch:{ all -> 0x0a6a }
            r11.mo24210c(r12, r15, r8)     // Catch:{ all -> 0x0a6a }
        L_0x0297:
            com.google.android.gms.measurement.internal.f9 r18 = new com.google.android.gms.measurement.internal.f9     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r2.f33103c     // Catch:{ all -> 0x0a6a }
            i5.e r11 = r34.mo24116a()     // Catch:{ all -> 0x0a6a }
            long r15 = r11.mo18370a()     // Catch:{ all -> 0x0a6a }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0a6a }
            r11 = r18
            r12 = r10
            r13 = r8
            r14 = r9
            r8 = r21
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0a6a }
            r9 = r18
        L_0x02b3:
            com.google.android.gms.measurement.internal.l r11 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r11)     // Catch:{ all -> 0x0a6a }
            boolean r11 = r11.mo24501x(r9)     // Catch:{ all -> 0x0a6a }
            if (r11 != 0) goto L_0x02f5
            com.google.android.gms.measurement.internal.f3 r11 = r34.mo24135l()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.d3 r11 = r11.mo24256q()     // Catch:{ all -> 0x0a6a }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r10)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.j4 r14 = r1.f32345l     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.a3 r14 = r14.mo24414D()     // Catch:{ all -> 0x0a6a }
            java.lang.String r15 = r9.f32491c     // Catch:{ all -> 0x0a6a }
            java.lang.String r14 = r14.mo24097f(r15)     // Catch:{ all -> 0x0a6a }
            java.lang.Object r9 = r9.f32493e     // Catch:{ all -> 0x0a6a }
            r11.mo24211d(r12, r13, r14, r9)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.i9 r11 = r34.mo24129h0()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.h9 r12 = r1.f32333E     // Catch:{ all -> 0x0a6a }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo24365B(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a6a }
            goto L_0x02f5
        L_0x02ef:
            r33 = r4
            r8 = r21
            goto L_0x015c
        L_0x02f5:
            java.lang.String r9 = r2.f33101a     // Catch:{ all -> 0x0a6a }
            boolean r9 = com.google.android.gms.measurement.internal.C7391i9.m41592X(r9)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r2.f33101a     // Catch:{ all -> 0x0a6a }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0a6a }
            r34.mo24129h0()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.t r11 = r2.f33102b     // Catch:{ all -> 0x0a6a }
            if (r11 != 0) goto L_0x030b
            r16 = 0
            goto L_0x032b
        L_0x030b:
            com.google.android.gms.measurement.internal.s r12 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x0a6a }
            r12.<init>(r11)     // Catch:{ all -> 0x0a6a }
            r16 = 0
        L_0x0312:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0a6a }
            if (r13 == 0) goto L_0x032b
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0a6a }
            java.lang.Object r13 = r11.mo24664N1(r13)     // Catch:{ all -> 0x0a6a }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0a6a }
            if (r14 == 0) goto L_0x0312
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0a6a }
            int r13 = r13.length     // Catch:{ all -> 0x0a6a }
            long r13 = (long) r13     // Catch:{ all -> 0x0a6a }
            long r16 = r16 + r13
            goto L_0x0312
        L_0x032b:
            r22 = 1
            long r15 = r16 + r22
            com.google.android.gms.measurement.internal.l r11 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r11)     // Catch:{ all -> 0x0a6a }
            long r12 = r34.mo24107F()     // Catch:{ all -> 0x0a6a }
            r17 = 1
            r20 = 0
            r21 = 0
            r30 = r5
            r4 = 0
            r14 = r10
            r18 = r9
            r19 = r20
            r20 = r8
            com.google.android.gms.measurement.internal.j r11 = r11.mo24477U(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0a6a }
            long r12 = r11.f32594b     // Catch:{ all -> 0x0a6a }
            r34.mo24110U()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.t2 r14 = com.google.android.gms.measurement.internal.C7516u2.f33060l     // Catch:{ all -> 0x0a6a }
            r15 = 0
            java.lang.Object r14 = r14.mo24669a(r15)     // Catch:{ all -> 0x0a6a }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0a6a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0a6a }
            long r4 = (long) r14     // Catch:{ all -> 0x0a6a }
            long r12 = r12 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            r16 = 0
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x0396
            long r12 = r12 % r4
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0385
            com.google.android.gms.measurement.internal.f3 r2 = r34.mo24135l()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r10)     // Catch:{ all -> 0x0a6a }
            long r5 = r11.f32594b     // Catch:{ all -> 0x0a6a }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a6a }
            r2.mo24210c(r3, r4, r5)     // Catch:{ all -> 0x0a6a }
        L_0x0385:
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r2)     // Catch:{ all -> 0x0a6a }
            r2.mo24492n()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c
            m41279R(r2)
            r2.mo24487f0()
            return
        L_0x0396:
            if (r9 == 0) goto L_0x03f4
            long r12 = r11.f32593a     // Catch:{ all -> 0x0a6a }
            r34.mo24110U()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.t2 r14 = com.google.android.gms.measurement.internal.C7516u2.f33064n     // Catch:{ all -> 0x0a6a }
            java.lang.Object r14 = r14.mo24669a(r15)     // Catch:{ all -> 0x0a6a }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0a6a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0a6a }
            long r4 = (long) r14     // Catch:{ all -> 0x0a6a }
            long r12 = r12 - r4
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x03f4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r4
            int r3 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x03cf
            com.google.android.gms.measurement.internal.f3 r3 = r34.mo24135l()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24256q()     // Catch:{ all -> 0x0a6a }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r10)     // Catch:{ all -> 0x0a6a }
            long r6 = r11.f32593a     // Catch:{ all -> 0x0a6a }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0a6a }
            r3.mo24210c(r4, r5, r6)     // Catch:{ all -> 0x0a6a }
        L_0x03cf:
            com.google.android.gms.measurement.internal.i9 r11 = r34.mo24129h0()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.h9 r12 = r1.f32333E     // Catch:{ all -> 0x0a6a }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f33101a     // Catch:{ all -> 0x0a6a }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo24365B(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r2)     // Catch:{ all -> 0x0a6a }
            r2.mo24492n()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c
            m41279R(r2)
            r2.mo24487f0()
            return
        L_0x03f4:
            r4 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x0444
            long r12 = r11.f32596d     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.h r5 = r34.mo24110U()     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.t2 r14 = com.google.android.gms.measurement.internal.C7516u2.f33062m     // Catch:{ all -> 0x0a6a }
            int r5 = r5.mo24290n(r8, r14)     // Catch:{ all -> 0x0a6a }
            int r5 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x0a6a }
            r8 = 0
            int r5 = java.lang.Math.max(r8, r5)     // Catch:{ all -> 0x0a6a }
            long r4 = (long) r5     // Catch:{ all -> 0x0a6a }
            long r12 = r12 - r4
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x0444
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0433
            com.google.android.gms.measurement.internal.f3 r2 = r34.mo24135l()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r10)     // Catch:{ all -> 0x0a6a }
            long r5 = r11.f32596d     // Catch:{ all -> 0x0a6a }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a6a }
            r2.mo24210c(r3, r4, r5)     // Catch:{ all -> 0x0a6a }
        L_0x0433:
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r2)     // Catch:{ all -> 0x0a6a }
            r2.mo24492n()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c
            m41279R(r2)
            r2.mo24487f0()
            return
        L_0x0444:
            com.google.android.gms.measurement.internal.t r4 = r2.f33102b     // Catch:{ all -> 0x0a6a }
            android.os.Bundle r4 = r4.mo24661K1()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.i9 r5 = r34.mo24129h0()     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = "_o"
            java.lang.String r12 = r2.f33103c     // Catch:{ all -> 0x0a6a }
            r5.mo24366C(r4, r11, r12)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.i9 r5 = r34.mo24129h0()     // Catch:{ all -> 0x0a6a }
            boolean r5 = r5.mo24383T(r10)     // Catch:{ all -> 0x0a6a }
            java.lang.String r14 = "_r"
            if (r5 == 0) goto L_0x0475
            com.google.android.gms.measurement.internal.i9 r5 = r34.mo24129h0()     // Catch:{ all -> 0x0a6a }
            java.lang.Long r11 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0a6a }
            java.lang.String r12 = "_dbg"
            r5.mo24366C(r4, r12, r11)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.i9 r5 = r34.mo24129h0()     // Catch:{ all -> 0x0a6a }
            r5.mo24366C(r4, r14, r11)     // Catch:{ all -> 0x0a6a }
        L_0x0475:
            java.lang.String r5 = "_s"
            java.lang.String r11 = r2.f33101a     // Catch:{ all -> 0x0a6a }
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x0a6a }
            if (r5 == 0) goto L_0x049b
            com.google.android.gms.measurement.internal.l r5 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r5)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.f9 r5 = r5.mo24479X(r11, r7)     // Catch:{ all -> 0x0a6a }
            if (r5 == 0) goto L_0x049b
            java.lang.Object r11 = r5.f32493e     // Catch:{ all -> 0x0a6a }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a6a }
            if (r11 == 0) goto L_0x049b
            com.google.android.gms.measurement.internal.i9 r11 = r34.mo24129h0()     // Catch:{ all -> 0x0a6a }
            java.lang.Object r5 = r5.f32493e     // Catch:{ all -> 0x0a6a }
            r11.mo24366C(r4, r7, r5)     // Catch:{ all -> 0x0a6a }
        L_0x049b:
            com.google.android.gms.measurement.internal.l r5 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r5)     // Catch:{ all -> 0x0a6a }
            p033d5.C4141r.m28217g(r10)     // Catch:{ all -> 0x0a6a }
            r5.mo24189f()     // Catch:{ all -> 0x0a6a }
            r5.mo24623g()     // Catch:{ all -> 0x0a6a }
            android.database.sqlite.SQLiteDatabase r7 = r5.mo24472P()     // Catch:{ SQLiteException -> 0x04db }
            com.google.android.gms.measurement.internal.j4 r11 = r5.f32389a     // Catch:{ SQLiteException -> 0x04db }
            com.google.android.gms.measurement.internal.h r11 = r11.mo24443z()     // Catch:{ SQLiteException -> 0x04db }
            com.google.android.gms.measurement.internal.t2 r12 = com.google.android.gms.measurement.internal.C7516u2.f33070q     // Catch:{ SQLiteException -> 0x04db }
            int r11 = r11.mo24290n(r10, r12)     // Catch:{ SQLiteException -> 0x04db }
            r8 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = java.lang.Math.min(r8, r11)     // Catch:{ SQLiteException -> 0x04db }
            r13 = 0
            int r8 = java.lang.Math.max(r13, r8)     // Catch:{ SQLiteException -> 0x04d9 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x04d9 }
            r11 = 2
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x04d9 }
            r11[r13] = r10     // Catch:{ SQLiteException -> 0x04d9 }
            r12 = 1
            r11[r12] = r8     // Catch:{ SQLiteException -> 0x04d9 }
            java.lang.String r8 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r5 = r7.delete(r6, r8, r11)     // Catch:{ SQLiteException -> 0x04d9 }
            long r7 = (long) r5
            goto L_0x04f3
        L_0x04d9:
            r0 = move-exception
            goto L_0x04dd
        L_0x04db:
            r0 = move-exception
            r13 = 0
        L_0x04dd:
            r7 = r0
            com.google.android.gms.measurement.internal.j4 r5 = r5.f32389a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r10)     // Catch:{ all -> 0x0a6a }
            r5.mo24210c(r8, r11, r7)     // Catch:{ all -> 0x0a6a }
            r7 = 0
        L_0x04f3:
            r11 = 0
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x050e
            com.google.android.gms.measurement.internal.f3 r5 = r34.mo24135l()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24261w()     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r10)     // Catch:{ all -> 0x0a6a }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0a6a }
            r5.mo24210c(r11, r12, r7)     // Catch:{ all -> 0x0a6a }
        L_0x050e:
            com.google.android.gms.measurement.internal.q r5 = new com.google.android.gms.measurement.internal.q     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.j4 r12 = r1.f32345l     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = r2.f33103c     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r2.f33101a     // Catch:{ all -> 0x0a6a }
            long r2 = r2.f33104d     // Catch:{ all -> 0x0a6a }
            r18 = 0
            r11 = r5
            r31 = 0
            r13 = r7
            r7 = r14
            r14 = r10
            r32 = r6
            r6 = r15
            r15 = r8
            r16 = r2
            r20 = r4
            r11.<init>((com.google.android.gms.measurement.internal.C7397j4) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r2)     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = r5.f32876b     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.r r2 = r2.mo24478V(r10, r3)     // Catch:{ all -> 0x0a6a }
            if (r2 != 0) goto L_0x05b1
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r2)     // Catch:{ all -> 0x0a6a }
            long r2 = r2.mo24471O(r10)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.h r4 = r34.mo24110U()     // Catch:{ all -> 0x0a6a }
            int r4 = r4.mo24287j(r10)     // Catch:{ all -> 0x0a6a }
            long r11 = (long) r4     // Catch:{ all -> 0x0a6a }
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0593
            if (r9 == 0) goto L_0x0593
            com.google.android.gms.measurement.internal.f3 r2 = r34.mo24135l()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r10)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.j4 r6 = r1.f32345l     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.a3 r6 = r6.mo24414D()     // Catch:{ all -> 0x0a6a }
            java.lang.String r5 = r5.f32876b     // Catch:{ all -> 0x0a6a }
            java.lang.String r5 = r6.mo24095d(r5)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.h r6 = r34.mo24110U()     // Catch:{ all -> 0x0a6a }
            int r6 = r6.mo24287j(r10)     // Catch:{ all -> 0x0a6a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0a6a }
            r2.mo24211d(r3, r4, r5, r6)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.i9 r11 = r34.mo24129h0()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.h9 r12 = r1.f32333E     // Catch:{ all -> 0x0a6a }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo24365B(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c
            m41279R(r2)
            r2.mo24487f0()
            return
        L_0x0593:
            com.google.android.gms.measurement.internal.r r2 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x0a6a }
            java.lang.String r13 = r5.f32876b     // Catch:{ all -> 0x0a6a }
            long r3 = r5.f32878d     // Catch:{ all -> 0x0a6a }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r3
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0a6a }
            goto L_0x05bf
        L_0x05b1:
            com.google.android.gms.measurement.internal.j4 r3 = r1.f32345l     // Catch:{ all -> 0x0a6a }
            long r8 = r2.f32916f     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.q r5 = r5.mo24615a(r3, r8)     // Catch:{ all -> 0x0a6a }
            long r3 = r5.f32878d     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.r r2 = r2.mo24630c(r3)     // Catch:{ all -> 0x0a6a }
        L_0x05bf:
            com.google.android.gms.measurement.internal.l r3 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r3)     // Catch:{ all -> 0x0a6a }
            r3.mo24494p(r2)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.h4 r2 = r34.mo24143s()     // Catch:{ all -> 0x0a6a }
            r2.mo24189f()     // Catch:{ all -> 0x0a6a }
            r34.mo24123e()     // Catch:{ all -> 0x0a6a }
            p033d5.C4141r.m28221k(r5)     // Catch:{ all -> 0x0a6a }
            p033d5.C4141r.m28221k(r36)     // Catch:{ all -> 0x0a6a }
            java.lang.String r2 = r5.f32875a     // Catch:{ all -> 0x0a6a }
            p033d5.C4141r.m28217g(r2)     // Catch:{ all -> 0x0a6a }
            java.lang.String r2 = r5.f32875a     // Catch:{ all -> 0x0a6a }
            r3 = r36
            java.lang.String r4 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0a6a }
            p033d5.C4141r.m28211a(r2)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.internal.measurement.b5 r2 = com.google.android.gms.internal.measurement.C6906c5.m39757P1()     // Catch:{ all -> 0x0a6a }
            r4 = 1
            r2.mo23090W(r4)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = "android"
            r2.mo23085R(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x0603
            java.lang.String r8 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            r2.mo23115u(r8)     // Catch:{ all -> 0x0a6a }
        L_0x0603:
            java.lang.String r8 = r3.f32790d     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x0610
            java.lang.String r8 = r3.f32790d     // Catch:{ all -> 0x0a6a }
            r2.mo23120x(r8)     // Catch:{ all -> 0x0a6a }
        L_0x0610:
            java.lang.String r8 = r3.f32789c     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x061d
            java.lang.String r8 = r3.f32789c     // Catch:{ all -> 0x0a6a }
            r2.mo23122y(r8)     // Catch:{ all -> 0x0a6a }
        L_0x061d:
            com.google.android.gms.internal.measurement.C7016ie.m40214b()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.h r8 = r34.mo24110U()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.t2 r9 = com.google.android.gms.measurement.internal.C7516u2.f33065n0     // Catch:{ all -> 0x0a6a }
            boolean r8 = r8.mo24279B(r6, r9)     // Catch:{ all -> 0x0a6a }
            if (r8 == 0) goto L_0x0647
            com.google.android.gms.measurement.internal.h r8 = r34.mo24110U()     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.t2 r10 = com.google.android.gms.measurement.internal.C7516u2.f33069p0     // Catch:{ all -> 0x0a6a }
            boolean r8 = r8.mo24279B(r9, r10)     // Catch:{ all -> 0x0a6a }
            if (r8 == 0) goto L_0x0647
            java.lang.String r8 = r3.f32786F     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x0647
            java.lang.String r8 = r3.f32786F     // Catch:{ all -> 0x0a6a }
            r2.mo23094b0(r8)     // Catch:{ all -> 0x0a6a }
        L_0x0647:
            long r8 = r3.f32796r     // Catch:{ all -> 0x0a6a }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0654
            int r9 = (int) r8     // Catch:{ all -> 0x0a6a }
            r2.mo23124z(r9)     // Catch:{ all -> 0x0a6a }
        L_0x0654:
            long r8 = r3.f32791e     // Catch:{ all -> 0x0a6a }
            r2.mo23078N(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r3.f32788b     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x0666
            java.lang.String r8 = r3.f32788b     // Catch:{ all -> 0x0a6a }
            r2.mo23077M(r8)     // Catch:{ all -> 0x0a6a }
        L_0x0666:
            java.lang.String r8 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            java.lang.Object r8 = p033d5.C4141r.m28221k(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a6a }
            y5.b r8 = r1.mo24111V(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r3.f32784D     // Catch:{ all -> 0x0a6a }
            y5.b r9 = p402y5.C13020b.m61314b(r9)     // Catch:{ all -> 0x0a6a }
            y5.b r8 = r8.mo38067c(r9)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r8.mo38072h()     // Catch:{ all -> 0x0a6a }
            r2.mo23060D(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r2.mo23103k0()     // Catch:{ all -> 0x0a6a }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0a6a }
            if (r8 == 0) goto L_0x069a
            java.lang.String r8 = r3.f32803y     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x069a
            java.lang.String r8 = r3.f32803y     // Catch:{ all -> 0x0a6a }
            r2.mo23113s(r8)     // Catch:{ all -> 0x0a6a }
        L_0x069a:
            long r8 = r3.f32792f     // Catch:{ all -> 0x0a6a }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x06a5
            r2.mo23062E(r8)     // Catch:{ all -> 0x0a6a }
        L_0x06a5:
            long r8 = r3.f32781A     // Catch:{ all -> 0x0a6a }
            r2.mo23067H(r8)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.c9 r8 = r1.f32340g     // Catch:{ all -> 0x0a6a }
            m41279R(r8)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.a9 r9 = r8.f32873b     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.j4 r9 = r9.f32345l     // Catch:{ all -> 0x0a6a }
            android.content.Context r9 = r9.mo24121d()     // Catch:{ all -> 0x0a6a }
            java.util.Map r9 = com.google.android.gms.measurement.internal.C7516u2.m41926c(r9)     // Catch:{ all -> 0x0a6a }
            if (r9 == 0) goto L_0x0741
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0a6a }
            if (r10 == 0) goto L_0x06c5
            goto L_0x0741
        L_0x06c5:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0a6a }
            r14.<init>()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.t2 r10 = com.google.android.gms.measurement.internal.C7516u2.f33028Q     // Catch:{ all -> 0x0a6a }
            java.lang.Object r10 = r10.mo24669a(r6)     // Catch:{ all -> 0x0a6a }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0a6a }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0a6a }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0a6a }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0a6a }
        L_0x06de:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0a6a }
            if (r11 == 0) goto L_0x073b
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0a6a }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0a6a }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x0a6a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0a6a }
            java.lang.String r13 = "measurement.id."
            boolean r12 = r12.startsWith(r13)     // Catch:{ all -> 0x0a6a }
            if (r12 == 0) goto L_0x06de
            java.lang.Object r11 = r11.getValue()     // Catch:{ NumberFormatException -> 0x0729 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x0729 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0729 }
            if (r11 == 0) goto L_0x06de
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x0729 }
            r14.add(r11)     // Catch:{ NumberFormatException -> 0x0729 }
            int r11 = r14.size()     // Catch:{ NumberFormatException -> 0x0729 }
            if (r11 < r10) goto L_0x06de
            com.google.android.gms.measurement.internal.j4 r11 = r8.f32389a     // Catch:{ NumberFormatException -> 0x0729 }
            com.google.android.gms.measurement.internal.f3 r11 = r11.mo24135l()     // Catch:{ NumberFormatException -> 0x0729 }
            com.google.android.gms.measurement.internal.d3 r11 = r11.mo24261w()     // Catch:{ NumberFormatException -> 0x0729 }
            java.lang.String r12 = "Too many experiment IDs. Number of IDs"
            int r13 = r14.size()     // Catch:{ NumberFormatException -> 0x0729 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x0729 }
            r11.mo24209b(r12, r13)     // Catch:{ NumberFormatException -> 0x0729 }
            goto L_0x073b
        L_0x0729:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.j4 r12 = r8.f32389a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.f3 r12 = r12.mo24135l()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.d3 r12 = r12.mo24261w()     // Catch:{ all -> 0x0a6a }
            java.lang.String r13 = "Experiment ID NumberFormatException"
            r12.mo24209b(r13, r11)     // Catch:{ all -> 0x0a6a }
            goto L_0x06de
        L_0x073b:
            boolean r8 = r14.isEmpty()     // Catch:{ all -> 0x0a6a }
            if (r8 == 0) goto L_0x0742
        L_0x0741:
            r14 = r6
        L_0x0742:
            if (r14 == 0) goto L_0x0747
            r2.mo23118v0(r14)     // Catch:{ all -> 0x0a6a }
        L_0x0747:
            java.lang.String r8 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            java.lang.Object r8 = p033d5.C4141r.m28221k(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a6a }
            y5.b r8 = r1.mo24111V(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r3.f32784D     // Catch:{ all -> 0x0a6a }
            y5.b r9 = p402y5.C13020b.m61314b(r9)     // Catch:{ all -> 0x0a6a }
            y5.b r8 = r8.mo38067c(r9)     // Catch:{ all -> 0x0a6a }
            y5.a r9 = p402y5.C13018a.AD_STORAGE     // Catch:{ all -> 0x0a6a }
            boolean r10 = r8.mo38074i(r9)     // Catch:{ all -> 0x0a6a }
            if (r10 == 0) goto L_0x0793
            boolean r10 = r3.f32801w     // Catch:{ all -> 0x0a6a }
            if (r10 == 0) goto L_0x0793
            com.google.android.gms.measurement.internal.x7 r10 = r1.f32342i     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            android.util.Pair r10 = r10.mo24758m(r11, r8)     // Catch:{ all -> 0x0a6a }
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0a6a }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x0a6a }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0a6a }
            if (r11 != 0) goto L_0x0793
            boolean r11 = r3.f32801w     // Catch:{ all -> 0x0a6a }
            if (r11 == 0) goto L_0x0793
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0a6a }
            r2.mo23091Y(r11)     // Catch:{ all -> 0x0a6a }
            java.lang.Object r10 = r10.second     // Catch:{ all -> 0x0a6a }
            if (r10 == 0) goto L_0x0793
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0a6a }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0a6a }
            r2.mo23082P(r10)     // Catch:{ all -> 0x0a6a }
        L_0x0793:
            com.google.android.gms.measurement.internal.j4 r10 = r1.f32345l     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.p r10 = r10.mo24411A()     // Catch:{ all -> 0x0a6a }
            r10.mo24236i()     // Catch:{ all -> 0x0a6a }
            java.lang.String r10 = android.os.Build.MODEL     // Catch:{ all -> 0x0a6a }
            r2.mo23064F(r10)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.j4 r10 = r1.f32345l     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.p r10 = r10.mo24411A()     // Catch:{ all -> 0x0a6a }
            r10.mo24236i()     // Catch:{ all -> 0x0a6a }
            java.lang.String r10 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0a6a }
            r2.mo23084Q(r10)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.j4 r10 = r1.f32345l     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.p r10 = r10.mo24411A()     // Catch:{ all -> 0x0a6a }
            long r10 = r10.mo24600o()     // Catch:{ all -> 0x0a6a }
            int r11 = (int) r10     // Catch:{ all -> 0x0a6a }
            r2.mo23096d0(r11)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.j4 r10 = r1.f32345l     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.p r10 = r10.mo24411A()     // Catch:{ all -> 0x0a6a }
            java.lang.String r10 = r10.mo24601p()     // Catch:{ all -> 0x0a6a }
            r2.mo23100h0(r10)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.j4 r10 = r1.f32345l     // Catch:{ all -> 0x0a6a }
            boolean r10 = r10.mo24436n()     // Catch:{ all -> 0x0a6a }
            if (r10 == 0) goto L_0x07de
            r2.mo23102j0()     // Catch:{ all -> 0x0a6a }
            boolean r10 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a6a }
            if (r10 != 0) goto L_0x07de
            r2.mo23065G(r6)     // Catch:{ all -> 0x0a6a }
        L_0x07de:
            com.google.android.gms.measurement.internal.l r10 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r10)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.m5 r10 = r10.mo24474R(r11)     // Catch:{ all -> 0x0a6a }
            if (r10 != 0) goto L_0x084e
            com.google.android.gms.measurement.internal.m5 r10 = new com.google.android.gms.measurement.internal.m5     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.j4 r11 = r1.f32345l     // Catch:{ all -> 0x0a6a }
            java.lang.String r12 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            r10.<init>(r11, r12)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r1.mo24131i0(r8)     // Catch:{ all -> 0x0a6a }
            r10.mo24553h(r11)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r3.f32797s     // Catch:{ all -> 0x0a6a }
            r10.mo24570v(r11)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r3.f32788b     // Catch:{ all -> 0x0a6a }
            r10.mo24571w(r11)     // Catch:{ all -> 0x0a6a }
            boolean r9 = r8.mo38074i(r9)     // Catch:{ all -> 0x0a6a }
            if (r9 == 0) goto L_0x0818
            com.google.android.gms.measurement.internal.x7 r9 = r1.f32342i     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            boolean r12 = r3.f32801w     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r9.mo24759n(r11, r12)     // Catch:{ all -> 0x0a6a }
            r10.mo24518F(r9)     // Catch:{ all -> 0x0a6a }
        L_0x0818:
            r11 = 0
            r10.mo24514B(r11)     // Catch:{ all -> 0x0a6a }
            r10.mo24515C(r11)     // Catch:{ all -> 0x0a6a }
            r10.mo24574z(r11)     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r3.f32789c     // Catch:{ all -> 0x0a6a }
            r10.mo24557j(r9)     // Catch:{ all -> 0x0a6a }
            long r11 = r3.f32796r     // Catch:{ all -> 0x0a6a }
            r10.mo24559k(r11)     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r3.f32790d     // Catch:{ all -> 0x0a6a }
            r10.mo24555i(r9)     // Catch:{ all -> 0x0a6a }
            long r11 = r3.f32791e     // Catch:{ all -> 0x0a6a }
            r10.mo24572x(r11)     // Catch:{ all -> 0x0a6a }
            long r11 = r3.f32792f     // Catch:{ all -> 0x0a6a }
            r10.mo24567s(r11)     // Catch:{ all -> 0x0a6a }
            boolean r9 = r3.f32794h     // Catch:{ all -> 0x0a6a }
            r10.mo24516D(r9)     // Catch:{ all -> 0x0a6a }
            long r11 = r3.f32781A     // Catch:{ all -> 0x0a6a }
            r10.mo24568t(r11)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.l r9 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r9)     // Catch:{ all -> 0x0a6a }
            r9.mo24493o(r10)     // Catch:{ all -> 0x0a6a }
        L_0x084e:
            y5.a r9 = p402y5.C13018a.ANALYTICS_STORAGE     // Catch:{ all -> 0x0a6a }
            boolean r8 = r8.mo38074i(r9)     // Catch:{ all -> 0x0a6a }
            if (r8 == 0) goto L_0x086d
            java.lang.String r8 = r10.mo24548e0()     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x086d
            java.lang.String r8 = r10.mo24548e0()     // Catch:{ all -> 0x0a6a }
            java.lang.Object r8 = p033d5.C4141r.m28221k(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a6a }
            r2.mo23117v(r8)     // Catch:{ all -> 0x0a6a }
        L_0x086d:
            java.lang.String r8 = r10.mo24554h0()     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x0884
            java.lang.String r8 = r10.mo24554h0()     // Catch:{ all -> 0x0a6a }
            java.lang.Object r8 = p033d5.C4141r.m28221k(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a6a }
            r2.mo23075L(r8)     // Catch:{ all -> 0x0a6a }
        L_0x0884:
            com.google.android.gms.measurement.internal.l r8 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = r3.f32787a     // Catch:{ all -> 0x0a6a }
            java.util.List r3 = r8.mo24484c0(r3)     // Catch:{ all -> 0x0a6a }
            r13 = 0
        L_0x0890:
            int r8 = r3.size()     // Catch:{ all -> 0x0a6a }
            if (r13 >= r8) goto L_0x08c6
            com.google.android.gms.internal.measurement.k5 r8 = com.google.android.gms.internal.measurement.C7055l5.m40337F()     // Catch:{ all -> 0x0a6a }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.f9 r9 = (com.google.android.gms.measurement.internal.C7358f9) r9     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r9.f32491c     // Catch:{ all -> 0x0a6a }
            r8.mo23605x(r9)     // Catch:{ all -> 0x0a6a }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.f9 r9 = (com.google.android.gms.measurement.internal.C7358f9) r9     // Catch:{ all -> 0x0a6a }
            long r9 = r9.f32492d     // Catch:{ all -> 0x0a6a }
            r8.mo23606y(r9)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.c9 r9 = r1.f32340g     // Catch:{ all -> 0x0a6a }
            m41279R(r9)     // Catch:{ all -> 0x0a6a }
            java.lang.Object r10 = r3.get(r13)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.f9 r10 = (com.google.android.gms.measurement.internal.C7358f9) r10     // Catch:{ all -> 0x0a6a }
            java.lang.Object r10 = r10.f32493e     // Catch:{ all -> 0x0a6a }
            r9.mo24201K(r8, r10)     // Catch:{ all -> 0x0a6a }
            r2.mo23125z0(r8)     // Catch:{ all -> 0x0a6a }
            int r13 = r13 + 1
            goto L_0x0890
        L_0x08c6:
            com.google.android.gms.measurement.internal.l r3 = r1.f32336c     // Catch:{ IOException -> 0x0a20 }
            m41279R(r3)     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.internal.measurement.h9 r8 = r2.mo23357k()     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.internal.measurement.c5 r8 = (com.google.android.gms.internal.measurement.C6906c5) r8     // Catch:{ IOException -> 0x0a20 }
            r3.mo24189f()     // Catch:{ IOException -> 0x0a20 }
            r3.mo24623g()     // Catch:{ IOException -> 0x0a20 }
            p033d5.C4141r.m28221k(r8)     // Catch:{ IOException -> 0x0a20 }
            java.lang.String r9 = r8.mo23219T1()     // Catch:{ IOException -> 0x0a20 }
            p033d5.C4141r.m28217g(r9)     // Catch:{ IOException -> 0x0a20 }
            byte[] r9 = r8.mo23736h()     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.measurement.internal.a9 r10 = r3.f32873b     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.measurement.internal.c9 r10 = r10.f32340g     // Catch:{ IOException -> 0x0a20 }
            m41279R(r10)     // Catch:{ IOException -> 0x0a20 }
            long r10 = r10.mo24204x(r9)     // Catch:{ IOException -> 0x0a20 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0a20 }
            r12.<init>()     // Catch:{ IOException -> 0x0a20 }
            java.lang.String r13 = r8.mo23219T1()     // Catch:{ IOException -> 0x0a20 }
            r14 = r30
            r12.put(r14, r13)     // Catch:{ IOException -> 0x0a20 }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0a20 }
            r15 = r33
            r12.put(r15, r13)     // Catch:{ IOException -> 0x0a20 }
            java.lang.String r13 = "metadata"
            r12.put(r13, r9)     // Catch:{ IOException -> 0x0a20 }
            android.database.sqlite.SQLiteDatabase r9 = r3.mo24472P()     // Catch:{ SQLiteException -> 0x0a06 }
            java.lang.String r13 = "raw_events_metadata"
            r4 = 4
            r9.insertWithOnConflict(r13, r6, r12, r4)     // Catch:{ SQLiteException -> 0x0a06 }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r2)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.t r3 = r5.f32880f     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.s r4 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x0a6a }
            r4.<init>(r3)     // Catch:{ all -> 0x0a6a }
        L_0x0922:
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x0a6a }
            if (r3 == 0) goto L_0x0934
            java.lang.String r3 = r4.next()     // Catch:{ all -> 0x0a6a }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x0a6a }
            if (r3 == 0) goto L_0x0922
        L_0x0932:
            r13 = 1
            goto L_0x0975
        L_0x0934:
            com.google.android.gms.measurement.internal.d4 r3 = r1.f32334a     // Catch:{ all -> 0x0a6a }
            m41279R(r3)     // Catch:{ all -> 0x0a6a }
            java.lang.String r4 = r5.f32875a     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = r5.f32876b     // Catch:{ all -> 0x0a6a }
            boolean r3 = r3.mo24216E(r4, r7)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.l r4 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r4)     // Catch:{ all -> 0x0a6a }
            long r17 = r34.mo24107F()     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = r5.f32875a     // Catch:{ all -> 0x0a6a }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r16 = r4
            r19 = r7
            com.google.android.gms.measurement.internal.j r4 = r16.mo24476T(r17, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0a6a }
            if (r3 == 0) goto L_0x0974
            long r3 = r4.f32597e     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.h r7 = r34.mo24110U()     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r5.f32875a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.t2 r9 = com.google.android.gms.measurement.internal.C7516u2.f33068p     // Catch:{ all -> 0x0a6a }
            int r7 = r7.mo24290n(r8, r9)     // Catch:{ all -> 0x0a6a }
            long r7 = (long) r7     // Catch:{ all -> 0x0a6a }
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0974
            goto L_0x0932
        L_0x0974:
            r13 = 0
        L_0x0975:
            r2.mo24189f()     // Catch:{ all -> 0x0a6a }
            r2.mo24623g()     // Catch:{ all -> 0x0a6a }
            p033d5.C4141r.m28221k(r5)     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = r5.f32875a     // Catch:{ all -> 0x0a6a }
            p033d5.C4141r.m28217g(r3)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.a9 r3 = r2.f32873b     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.c9 r3 = r3.f32340g     // Catch:{ all -> 0x0a6a }
            m41279R(r3)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.internal.measurement.r4 r3 = r3.mo24194B(r5)     // Catch:{ all -> 0x0a6a }
            byte[] r3 = r3.mo23736h()     // Catch:{ all -> 0x0a6a }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0a6a }
            r4.<init>()     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = r5.f32875a     // Catch:{ all -> 0x0a6a }
            r4.put(r14, r7)     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f32876b     // Catch:{ all -> 0x0a6a }
            r4.put(r7, r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = "timestamp"
            long r8 = r5.f32878d     // Catch:{ all -> 0x0a6a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0a6a }
            r4.put(r7, r8)     // Catch:{ all -> 0x0a6a }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a6a }
            r4.put(r15, r7)     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = "data"
            r4.put(r7, r3)     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0a6a }
            r4.put(r3, r7)     // Catch:{ all -> 0x0a6a }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo24472P()     // Catch:{ SQLiteException -> 0x09ee }
            r7 = r32
            long r3 = r3.insert(r7, r6, r4)     // Catch:{ SQLiteException -> 0x09ee }
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x09e9
            com.google.android.gms.measurement.internal.j4 r3 = r2.f32389a     // Catch:{ SQLiteException -> 0x09ee }
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()     // Catch:{ SQLiteException -> 0x09ee }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24256q()     // Catch:{ SQLiteException -> 0x09ee }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.f32875a     // Catch:{ SQLiteException -> 0x09ee }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r6)     // Catch:{ SQLiteException -> 0x09ee }
            r3.mo24209b(r4, r6)     // Catch:{ SQLiteException -> 0x09ee }
            goto L_0x0a37
        L_0x09e9:
            r3 = 0
            r1.f32348o = r3     // Catch:{ all -> 0x0a6a }
            goto L_0x0a37
        L_0x09ee:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x0a6a }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.f32875a     // Catch:{ all -> 0x0a6a }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r5)     // Catch:{ all -> 0x0a6a }
            r2.mo24210c(r4, r5, r3)     // Catch:{ all -> 0x0a6a }
            goto L_0x0a37
        L_0x0a06:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.j4 r3 = r3.f32389a     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24256q()     // Catch:{ IOException -> 0x0a20 }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r8.mo23219T1()     // Catch:{ IOException -> 0x0a20 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r6)     // Catch:{ IOException -> 0x0a20 }
            r3.mo24210c(r5, r6, r4)     // Catch:{ IOException -> 0x0a20 }
            throw r4     // Catch:{ IOException -> 0x0a20 }
        L_0x0a20:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.f3 r4 = r34.mo24135l()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24256q()     // Catch:{ all -> 0x0a6a }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo23102j0()     // Catch:{ all -> 0x0a6a }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r2)     // Catch:{ all -> 0x0a6a }
            r4.mo24210c(r5, r2, r3)     // Catch:{ all -> 0x0a6a }
        L_0x0a37:
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c     // Catch:{ all -> 0x0a6a }
            m41279R(r2)     // Catch:{ all -> 0x0a6a }
            r2.mo24492n()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c
            m41279R(r2)
            r2.mo24487f0()
            r34.m41274M()
            com.google.android.gms.measurement.internal.f3 r2 = r34.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24260v()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo24209b(r4, r3)
            return
        L_0x0a6a:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.l r3 = r1.f32336c
            m41279R(r3)
            r3.mo24487f0()
            throw r2
        L_0x0a75:
            r1.mo24108S(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7303a9.mo24105D(com.google.android.gms.measurement.internal.v, com.google.android.gms.measurement.internal.n9):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean mo24106E() {
        mo24143s().mo24189f();
        FileLock fileLock = this.f32355v;
        if (fileLock == null || !fileLock.isValid()) {
            this.f32336c.f32389a.mo24443z();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f32345l.mo24121d().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f32356w = channel;
                FileLock tryLock = channel.tryLock();
                this.f32355v = tryLock;
                if (tryLock != null) {
                    mo24135l().mo24260v().mo24208a("Storage concurrent access okay");
                    return true;
                }
                mo24135l().mo24256q().mo24208a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                mo24135l().mo24256q().mo24209b("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                mo24135l().mo24256q().mo24209b("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                mo24135l().mo24261w().mo24209b("Storage lock already acquired", e3);
                return false;
            }
        } else {
            mo24135l().mo24260v().mo24208a("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final long mo24107F() {
        long a = mo24116a().mo18370a();
        C7552x7 x7Var = this.f32342i;
        x7Var.mo24623g();
        x7Var.mo24189f();
        long a2 = x7Var.f33190i.mo24604a();
        if (a2 == 0) {
            a2 = ((long) x7Var.f32389a.mo24423N().mo24403u().nextInt(86400000)) + 1;
            x7Var.f33190i.mo24605b(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final C7431m5 mo24108S(C7446n9 n9Var) {
        mo24143s().mo24189f();
        mo24123e();
        C4141r.m28221k(n9Var);
        C4141r.m28217g(n9Var.f32787a);
        if (!n9Var.f32785E.isEmpty()) {
            this.f32330B.put(n9Var.f32787a, new C7573z8(this, n9Var.f32785E));
        }
        C7414l lVar = this.f32336c;
        m41279R(lVar);
        C7431m5 R = lVar.mo24474R(n9Var.f32787a);
        C13020b c = mo24111V(n9Var.f32787a).mo38067c(C13020b.m61314b(n9Var.f32784D));
        C13018a aVar = C13018a.AD_STORAGE;
        String n = c.mo38074i(aVar) ? this.f32342i.mo24759n(n9Var.f32787a, n9Var.f32801w) : "";
        if (R == null) {
            R = new C7431m5(this.f32345l, n9Var.f32787a);
            if (c.mo38074i(C13018a.ANALYTICS_STORAGE)) {
                R.mo24553h(mo24131i0(c));
            }
            if (c.mo38074i(aVar)) {
                R.mo24518F(n);
            }
        } else if (c.mo38074i(aVar) && n != null && !n.equals(R.mo24539a())) {
            R.mo24518F(n);
            if (n9Var.f32801w && !"00000000-0000-0000-0000-000000000000".equals(this.f32342i.mo24758m(n9Var.f32787a, c).first)) {
                R.mo24553h(mo24131i0(c));
                C7414l lVar2 = this.f32336c;
                m41279R(lVar2);
                if (lVar2.mo24479X(n9Var.f32787a, "_id") != null) {
                    C7414l lVar3 = this.f32336c;
                    m41279R(lVar3);
                    if (lVar3.mo24479X(n9Var.f32787a, "_lair") == null) {
                        C7358f9 f9Var = new C7358f9(n9Var.f32787a, "auto", "_lair", mo24116a().mo18370a(), 1L);
                        C7414l lVar4 = this.f32336c;
                        m41279R(lVar4);
                        lVar4.mo24501x(f9Var);
                    }
                }
            }
        } else if (TextUtils.isEmpty(R.mo24548e0()) && c.mo38074i(C13018a.ANALYTICS_STORAGE)) {
            R.mo24553h(mo24131i0(c));
        }
        R.mo24571w(n9Var.f32788b);
        R.mo24549f(n9Var.f32803y);
        if (!TextUtils.isEmpty(n9Var.f32797s)) {
            R.mo24570v(n9Var.f32797s);
        }
        long j = n9Var.f32791e;
        if (j != 0) {
            R.mo24572x(j);
        }
        if (!TextUtils.isEmpty(n9Var.f32789c)) {
            R.mo24557j(n9Var.f32789c);
        }
        R.mo24559k(n9Var.f32796r);
        String str = n9Var.f32790d;
        if (str != null) {
            R.mo24555i(str);
        }
        R.mo24567s(n9Var.f32792f);
        R.mo24516D(n9Var.f32794h);
        if (!TextUtils.isEmpty(n9Var.f32793g)) {
            R.mo24573y(n9Var.f32793g);
        }
        R.mo24551g(n9Var.f32801w);
        R.mo24517E(n9Var.f32804z);
        R.mo24568t(n9Var.f32781A);
        C7016ie.m40214b();
        if (mo24110U().mo24279B((String) null, C7516u2.f33065n0) && mo24110U().mo24279B(n9Var.f32787a, C7516u2.f33069p0)) {
            R.mo24520H(n9Var.f32786F);
        }
        C7238wc.m41071b();
        if (mo24110U().mo24279B((String) null, C7516u2.f33061l0)) {
            R.mo24519G(n9Var.f32782B);
        } else {
            C7238wc.m41071b();
            if (mo24110U().mo24279B((String) null, C7516u2.f33059k0)) {
                R.mo24519G((List) null);
            }
        }
        if (R.mo24523K()) {
            C7414l lVar5 = this.f32336c;
            m41279R(lVar5);
            lVar5.mo24493o(R);
        }
        return R;
    }

    /* renamed from: T */
    public final C7304b mo24109T() {
        C7304b bVar = this.f32339f;
        m41279R(bVar);
        return bVar;
    }

    /* renamed from: U */
    public final C7370h mo24110U() {
        return ((C7397j4) C4141r.m28221k(this.f32345l)).mo24443z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final C13020b mo24111V(String str) {
        String str2;
        C13020b bVar = C13020b.f47279b;
        mo24143s().mo24189f();
        mo24123e();
        C13020b bVar2 = (C13020b) this.f32329A.get(str);
        if (bVar2 != null) {
            return bVar2;
        }
        C7414l lVar = this.f32336c;
        m41279R(lVar);
        C4141r.m28221k(str);
        lVar.mo24189f();
        lVar.mo24623g();
        Cursor cursor = null;
        try {
            Cursor rawQuery = lVar.mo24472P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            C13020b b = C13020b.m61314b(str2);
            mo24102A(str, b);
            return b;
        } catch (SQLiteException e) {
            lVar.f32389a.mo24135l().mo24256q().mo24210c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: W */
    public final C7414l mo24112W() {
        C7414l lVar = this.f32336c;
        m41279R(lVar);
        return lVar;
    }

    /* renamed from: X */
    public final C7297a3 mo24113X() {
        return this.f32345l.mo24414D();
    }

    /* renamed from: Y */
    public final C7407k3 mo24114Y() {
        C7407k3 k3Var = this.f32335b;
        m41279R(k3Var);
        return k3Var;
    }

    /* renamed from: Z */
    public final C7429m3 mo24115Z() {
        C7429m3 m3Var = this.f32337d;
        if (m3Var != null) {
            return m3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: a */
    public final C4691e mo24116a() {
        return ((C7397j4) C4141r.m28221k(this.f32345l)).mo24116a();
    }

    /* renamed from: a0 */
    public final C7331d4 mo24117a0() {
        C7331d4 d4Var = this.f32334a;
        m41279R(d4Var);
        return d4Var;
    }

    /* renamed from: b */
    public final C7315c mo24118b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo24119c() {
        mo24143s().mo24189f();
        mo24123e();
        if (!this.f32347n) {
            this.f32347n = true;
            if (mo24106E()) {
                FileChannel fileChannel = this.f32356w;
                mo24143s().mo24189f();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo24135l().mo24256q().mo24208a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo24135l().mo24261w().mo24209b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo24135l().mo24256q().mo24209b("Failed to read from channel", e);
                    }
                }
                int o = this.f32345l.mo24412B().mo24733o();
                mo24143s().mo24189f();
                if (i > o) {
                    mo24135l().mo24256q().mo24210c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(o));
                } else if (i < o) {
                    FileChannel fileChannel2 = this.f32356w;
                    mo24143s().mo24189f();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo24135l().mo24256q().mo24208a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(o);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo24135l().mo24256q().mo24209b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            mo24135l().mo24260v().mo24210c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(o));
                            return;
                        } catch (IOException e2) {
                            mo24135l().mo24256q().mo24209b("Failed to write to channel", e2);
                        }
                    }
                    mo24135l().mo24256q().mo24210c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(o));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final C7397j4 mo24120c0() {
        return this.f32345l;
    }

    /* renamed from: d */
    public final Context mo24121d() {
        return this.f32345l.mo24121d();
    }

    /* renamed from: d0 */
    public final C7443n6 mo24122d0() {
        C7443n6 n6Var = this.f32341h;
        m41279R(n6Var);
        return n6Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo24123e() {
        if (!this.f32346m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: e0 */
    public final C7552x7 mo24124e0() {
        return this.f32342i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo24125f(String str, C6889b5 b5Var) {
        int w;
        int indexOf;
        C7331d4 d4Var = this.f32334a;
        m41279R(d4Var);
        Set y = d4Var.mo24232y(str);
        if (y != null) {
            b5Var.mo23119w0(y);
        }
        C7331d4 d4Var2 = this.f32334a;
        m41279R(d4Var2);
        if (d4Var2.mo24221J(str)) {
            b5Var.mo23061D0();
        }
        C7331d4 d4Var3 = this.f32334a;
        m41279R(d4Var3);
        if (d4Var3.mo24224M(str)) {
            if (mo24110U().mo24279B(str, C7516u2.f33075s0)) {
                String l0 = b5Var.mo23104l0();
                if (!TextUtils.isEmpty(l0) && (indexOf = l0.indexOf(".")) != -1) {
                    b5Var.mo23084Q(l0.substring(0, indexOf));
                }
            } else {
                b5Var.mo23072J0();
            }
        }
        C7331d4 d4Var4 = this.f32334a;
        m41279R(d4Var4);
        if (d4Var4.mo24225N(str) && (w = C7325c9.m41402w(b5Var, "_id")) != -1) {
            b5Var.mo23111r(w);
        }
        C7331d4 d4Var5 = this.f32334a;
        m41279R(d4Var5);
        if (d4Var5.mo24223L(str)) {
            b5Var.mo23063E0();
        }
        C7331d4 d4Var6 = this.f32334a;
        m41279R(d4Var6);
        if (d4Var6.mo24220I(str)) {
            b5Var.mo23057B0();
            C7573z8 z8Var = (C7573z8) this.f32330B.get(str);
            if (z8Var == null || z8Var.f33232b + mo24110U().mo24293q(str, C7516u2.f33031T) < mo24116a().mo18371b()) {
                z8Var = new C7573z8(this);
                this.f32330B.put(str, z8Var);
            }
            b5Var.mo23071J(z8Var.f33231a);
        }
        C7331d4 d4Var7 = this.f32334a;
        m41279R(d4Var7);
        if (d4Var7.mo24222K(str)) {
            b5Var.mo23081O0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo24126g(C7431m5 m5Var) {
        C5413a aVar;
        C5413a aVar2;
        mo24143s().mo24189f();
        if (!TextUtils.isEmpty(m5Var.mo24556i0()) || !TextUtils.isEmpty(m5Var.mo24542b0())) {
            C7489r8 r8Var = this.f32343j;
            Uri.Builder builder = new Uri.Builder();
            String i0 = m5Var.mo24556i0();
            if (TextUtils.isEmpty(i0)) {
                i0 = m5Var.mo24542b0();
            }
            C5413a aVar3 = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) C7516u2.f33048f.mo24669a((Object) null)).encodedAuthority((String) C7516u2.f33050g.mo24669a((Object) null)).path("config/app/".concat(String.valueOf(i0))).appendQueryParameter("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            r8Var.f32389a.mo24443z().mo24292p();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(74029)).appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String str = (String) C4141r.m28221k(m5Var.mo24546d0());
                URL url = new URL(uri);
                mo24135l().mo24260v().mo24209b("Fetching remote configuration", str);
                C7331d4 d4Var = this.f32334a;
                m41279R(d4Var);
                C6922d4 t = d4Var.mo24228t(str);
                C7331d4 d4Var2 = this.f32334a;
                m41279R(d4Var2);
                String v = d4Var2.mo24230v(str);
                if (t != null) {
                    if (!TextUtils.isEmpty(v)) {
                        aVar2 = new C5413a();
                        aVar2.put("If-Modified-Since", v);
                    } else {
                        aVar2 = null;
                    }
                    C6898be.m39675b();
                    if (mo24110U().mo24279B((String) null, C7516u2.f33071q0)) {
                        C7331d4 d4Var3 = this.f32334a;
                        m41279R(d4Var3);
                        String u = d4Var3.mo24229u(str);
                        if (!TextUtils.isEmpty(u)) {
                            if (aVar2 == null) {
                                aVar2 = new C5413a();
                            }
                            aVar3 = aVar2;
                            aVar3.put("If-None-Match", u);
                        }
                    }
                    aVar = aVar2;
                    this.f32352s = true;
                    C7407k3 k3Var = this.f32335b;
                    m41279R(k3Var);
                    C7522u8 u8Var = new C7522u8(this);
                    k3Var.mo24189f();
                    k3Var.mo24623g();
                    C4141r.m28221k(url);
                    C4141r.m28221k(u8Var);
                    k3Var.f32389a.mo24143s().mo24308y(new C7396j3(k3Var, str, url, (byte[]) null, aVar, u8Var));
                }
                aVar = aVar3;
                this.f32352s = true;
                C7407k3 k3Var2 = this.f32335b;
                m41279R(k3Var2);
                C7522u8 u8Var2 = new C7522u8(this);
                k3Var2.mo24189f();
                k3Var2.mo24623g();
                C4141r.m28221k(url);
                C4141r.m28221k(u8Var2);
                k3Var2.f32389a.mo24143s().mo24308y(new C7396j3(k3Var2, str, url, (byte[]) null, aVar, u8Var2));
            } catch (MalformedURLException unused) {
                mo24135l().mo24256q().mo24210c("Failed to parse config URL. Not fetching. appId", C7352f3.m41475z(m5Var.mo24546d0()), uri);
            }
        } else {
            mo24137m((String) C4141r.m28221k(m5Var.mo24546d0()), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    /* renamed from: g0 */
    public final C7325c9 mo24127g0() {
        C7325c9 c9Var = this.f32340g;
        m41279R(c9Var);
        return c9Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo24128h(C7524v vVar, C7446n9 n9Var) {
        C7524v vVar2;
        List<C7326d> list;
        List<C7326d> list2;
        List<C7326d> list3;
        String str;
        C7446n9 n9Var2 = n9Var;
        C4141r.m28221k(n9Var);
        C4141r.m28217g(n9Var2.f32787a);
        mo24143s().mo24189f();
        mo24123e();
        String str2 = n9Var2.f32787a;
        long j = vVar.f33104d;
        C7363g3 b = C7363g3.m41489b(vVar);
        mo24143s().mo24189f();
        C7454o6 o6Var = null;
        if (!(this.f32331C == null || (str = this.f32332D) == null || !str.equals(str2))) {
            o6Var = this.f32331C;
        }
        C7391i9.m41605y(o6Var, b.f32500d, false);
        C7524v a = b.mo24270a();
        m41279R(this.f32340g);
        if (C7325c9.m41392k(a, n9Var2)) {
            if (!n9Var2.f32794h) {
                mo24108S(n9Var2);
                return;
            }
            List list4 = n9Var2.f32782B;
            if (list4 == null) {
                vVar2 = a;
            } else if (list4.contains(a.f33101a)) {
                Bundle K1 = a.f33102b.mo24661K1();
                K1.putLong("ga_safelisted", 1);
                vVar2 = new C7524v(a.f33101a, new C7502t(K1), a.f33103c, a.f33104d);
            } else {
                mo24135l().mo24255p().mo24211d("Dropping non-safelisted event. appId, event name, origin", str2, a.f33101a, a.f33103c);
                return;
            }
            C7414l lVar = this.f32336c;
            m41279R(lVar);
            lVar.mo24486e0();
            try {
                C7414l lVar2 = this.f32336c;
                m41279R(lVar2);
                C4141r.m28217g(str2);
                lVar2.mo24189f();
                lVar2.mo24623g();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    lVar2.f32389a.mo24135l().mo24261w().mo24210c("Invalid time querying timed out conditional properties", C7352f3.m41475z(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = lVar2.mo24483b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (C7326d dVar : list) {
                    if (dVar != null) {
                        mo24135l().mo24260v().mo24211d("User property timed out", dVar.f32396a, this.f32345l.mo24414D().mo24097f(dVar.f32398c.f32439b), dVar.f32398c.mo24243I1());
                        C7524v vVar3 = dVar.f32402g;
                        if (vVar3 != null) {
                            mo24105D(new C7524v(vVar3, j), n9Var2);
                        }
                        C7414l lVar3 = this.f32336c;
                        m41279R(lVar3);
                        lVar3.mo24467J(str2, dVar.f32398c.f32439b);
                    }
                }
                C7414l lVar4 = this.f32336c;
                m41279R(lVar4);
                C4141r.m28217g(str2);
                lVar4.mo24189f();
                lVar4.mo24623g();
                if (i < 0) {
                    lVar4.f32389a.mo24135l().mo24261w().mo24210c("Invalid time querying expired conditional properties", C7352f3.m41475z(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = lVar4.mo24483b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList<C7524v> arrayList = new ArrayList<>(list2.size());
                for (C7326d dVar2 : list2) {
                    if (dVar2 != null) {
                        mo24135l().mo24260v().mo24211d("User property expired", dVar2.f32396a, this.f32345l.mo24414D().mo24097f(dVar2.f32398c.f32439b), dVar2.f32398c.mo24243I1());
                        C7414l lVar5 = this.f32336c;
                        m41279R(lVar5);
                        lVar5.mo24490k(str2, dVar2.f32398c.f32439b);
                        C7524v vVar4 = dVar2.f32406s;
                        if (vVar4 != null) {
                            arrayList.add(vVar4);
                        }
                        C7414l lVar6 = this.f32336c;
                        m41279R(lVar6);
                        lVar6.mo24467J(str2, dVar2.f32398c.f32439b);
                    }
                }
                for (C7524v vVar5 : arrayList) {
                    mo24105D(new C7524v(vVar5, j), n9Var2);
                }
                C7414l lVar7 = this.f32336c;
                m41279R(lVar7);
                String str3 = vVar2.f33101a;
                C4141r.m28217g(str2);
                C4141r.m28217g(str3);
                lVar7.mo24189f();
                lVar7.mo24623g();
                if (i < 0) {
                    lVar7.f32389a.mo24135l().mo24261w().mo24211d("Invalid time querying triggered conditional properties", C7352f3.m41475z(str2), lVar7.f32389a.mo24414D().mo24095d(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = lVar7.mo24483b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList<C7524v> arrayList2 = new ArrayList<>(list3.size());
                for (C7326d dVar3 : list3) {
                    if (dVar3 != null) {
                        C7336d9 d9Var = dVar3.f32398c;
                        C7358f9 f9Var = new C7358f9((String) C4141r.m28221k(dVar3.f32396a), dVar3.f32397b, d9Var.f32439b, j, C4141r.m28221k(d9Var.mo24243I1()));
                        C7414l lVar8 = this.f32336c;
                        m41279R(lVar8);
                        if (lVar8.mo24501x(f9Var)) {
                            mo24135l().mo24260v().mo24211d("User property triggered", dVar3.f32396a, this.f32345l.mo24414D().mo24097f(f9Var.f32491c), f9Var.f32493e);
                        } else {
                            mo24135l().mo24256q().mo24211d("Too many active user properties, ignoring", C7352f3.m41475z(dVar3.f32396a), this.f32345l.mo24414D().mo24097f(f9Var.f32491c), f9Var.f32493e);
                        }
                        C7524v vVar6 = dVar3.f32404i;
                        if (vVar6 != null) {
                            arrayList2.add(vVar6);
                        }
                        dVar3.f32398c = new C7336d9(f9Var);
                        dVar3.f32400e = true;
                        C7414l lVar9 = this.f32336c;
                        m41279R(lVar9);
                        lVar9.mo24500w(dVar3);
                    }
                }
                mo24105D(vVar2, n9Var2);
                for (C7524v vVar7 : arrayList2) {
                    mo24105D(new C7524v(vVar7, j), n9Var2);
                }
                C7414l lVar10 = this.f32336c;
                m41279R(lVar10);
                lVar10.mo24492n();
            } finally {
                C7414l lVar11 = this.f32336c;
                m41279R(lVar11);
                lVar11.mo24487f0();
            }
        }
    }

    /* renamed from: h0 */
    public final C7391i9 mo24129h0() {
        return ((C7397j4) C4141r.m28221k(this.f32345l)).mo24423N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo24130i(C7524v vVar, String str) {
        C7524v vVar2 = vVar;
        String str2 = str;
        C7414l lVar = this.f32336c;
        m41279R(lVar);
        C7431m5 R = lVar.mo24474R(str2);
        if (R == null || TextUtils.isEmpty(R.mo24552g0())) {
            mo24135l().mo24255p().mo24209b("No app data available; dropping event", str2);
            return;
        }
        Boolean J = m41271J(R);
        if (J == null) {
            if (!"_ui".equals(vVar2.f33101a)) {
                mo24135l().mo24261w().mo24209b("Could not find package. appId", C7352f3.m41475z(str));
            }
        } else if (!J.booleanValue()) {
            mo24135l().mo24256q().mo24209b("App version does not match; dropping event. appId", C7352f3.m41475z(str));
            return;
        }
        String i0 = R.mo24556i0();
        String g0 = R.mo24552g0();
        long L = R.mo24524L();
        String f0 = R.mo24550f0();
        long W = R.mo24535W();
        long T = R.mo24532T();
        boolean J2 = R.mo24522J();
        String h0 = R.mo24554h0();
        R.mo24513A();
        C7446n9 n9Var = r2;
        C7431m5 m5Var = R;
        C7446n9 n9Var2 = new C7446n9(str, i0, g0, L, f0, W, T, (String) null, J2, false, h0, 0, 0, 0, m5Var.mo24521I(), false, m5Var.mo24542b0(), m5Var.mo24540a0(), m5Var.mo24533U(), m5Var.mo24543c(), (String) null, mo24111V(str2).mo38072h(), "", (String) null);
        mo24132j(vVar2, n9Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final String mo24131i0(C13020b bVar) {
        if (!bVar.mo38074i(C13018a.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo24129h0().mo24403u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo24132j(C7524v vVar, C7446n9 n9Var) {
        C4141r.m28217g(n9Var.f32787a);
        C7363g3 b = C7363g3.m41489b(vVar);
        C7391i9 h0 = mo24129h0();
        Bundle bundle = b.f32500d;
        C7414l lVar = this.f32336c;
        m41279R(lVar);
        h0.mo24409z(bundle, lVar.mo24473Q(n9Var.f32787a));
        mo24129h0().mo24364A(b, mo24110U().mo24289m(n9Var.f32787a));
        C7524v a = b.mo24270a();
        if ("_cmp".equals(a.f33101a) && "referrer API v2".equals(a.f33102b.mo24665O1("_cis"))) {
            String O1 = a.f33102b.mo24665O1("gclid");
            if (!TextUtils.isEmpty(O1)) {
                mo24103B(new C7336d9("_lgclid", a.f33104d, O1, "auto"), n9Var);
            }
        }
        mo24128h(a, n9Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final String mo24133j0(C7446n9 n9Var) {
        try {
            return (String) mo24143s().mo24306r(new C7533v8(this, n9Var)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo24135l().mo24256q().mo24210c("Failed to get app instance id. appId", C7352f3.m41475z(n9Var.f32787a), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo24134k() {
        this.f32351r++;
    }

    /* renamed from: l */
    public final C7352f3 mo24135l() {
        return ((C7397j4) C4141r.m28221k(this.f32345l)).mo24135l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final void mo24136l0(Runnable runnable) {
        mo24143s().mo24189f();
        if (this.f32349p == null) {
            this.f32349p = new ArrayList();
        }
        this.f32349p.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105 A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011c A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0139 A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0147 A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0169 A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016d A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24137m(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.h4 r0 = r8.mo24143s()
            r0.mo24189f()
            r8.mo24123e()
            p033d5.C4141r.m28217g(r9)
            r0 = 0
            if (r12 != 0) goto L_0x0012
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x0190 }
        L_0x0012:
            com.google.android.gms.measurement.internal.f3 r1 = r8.mo24135l()     // Catch:{ all -> 0x0190 }
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo24260v()     // Catch:{ all -> 0x0190 }
            int r2 = r12.length     // Catch:{ all -> 0x0190 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0190 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.mo24209b(r3, r2)     // Catch:{ all -> 0x0190 }
            com.google.android.gms.measurement.internal.l r1 = r8.f32336c     // Catch:{ all -> 0x0190 }
            m41279R(r1)     // Catch:{ all -> 0x0190 }
            r1.mo24486e0()     // Catch:{ all -> 0x0190 }
            com.google.android.gms.measurement.internal.l r1 = r8.f32336c     // Catch:{ all -> 0x0186 }
            m41279R(r1)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.m5 r1 = r1.mo24474R(r9)     // Catch:{ all -> 0x0186 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r10 == r3) goto L_0x0043
            r3 = 204(0xcc, float:2.86E-43)
            if (r10 == r3) goto L_0x0043
            if (r10 != r4) goto L_0x0047
            r10 = 304(0x130, float:4.26E-43)
        L_0x0043:
            if (r11 != 0) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            if (r1 != 0) goto L_0x005d
            com.google.android.gms.measurement.internal.f3 r10 = r8.mo24135l()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.d3 r10 = r10.mo24261w()     // Catch:{ all -> 0x0186 }
            java.lang.String r11 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r9)     // Catch:{ all -> 0x0186 }
            r10.mo24209b(r11, r9)     // Catch:{ all -> 0x0186 }
            goto L_0x0170
        L_0x005d:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00bb
            if (r10 != r5) goto L_0x0064
            goto L_0x00bb
        L_0x0064:
            i5.e r12 = r8.mo24116a()     // Catch:{ all -> 0x0186 }
            long r12 = r12.mo18370a()     // Catch:{ all -> 0x0186 }
            r1.mo24569u(r12)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.l r12 = r8.f32336c     // Catch:{ all -> 0x0186 }
            m41279R(r12)     // Catch:{ all -> 0x0186 }
            r12.mo24493o(r1)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.f3 r12 = r8.mo24135l()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.d3 r12 = r12.mo24260v()     // Catch:{ all -> 0x0186 }
            java.lang.String r13 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0186 }
            r12.mo24210c(r13, r1, r11)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.d4 r11 = r8.f32334a     // Catch:{ all -> 0x0186 }
            m41279R(r11)     // Catch:{ all -> 0x0186 }
            r11.mo24233z(r9)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.x7 r9 = r8.f32342i     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.p3 r9 = r9.f33189h     // Catch:{ all -> 0x0186 }
            i5.e r11 = r8.mo24116a()     // Catch:{ all -> 0x0186 }
            long r11 = r11.mo18370a()     // Catch:{ all -> 0x0186 }
            r9.mo24605b(r11)     // Catch:{ all -> 0x0186 }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x00a7
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x00b6
        L_0x00a7:
            com.google.android.gms.measurement.internal.x7 r9 = r8.f32342i     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.p3 r9 = r9.f33187f     // Catch:{ all -> 0x0186 }
            i5.e r10 = r8.mo24116a()     // Catch:{ all -> 0x0186 }
            long r10 = r10.mo18370a()     // Catch:{ all -> 0x0186 }
            r9.mo24605b(r10)     // Catch:{ all -> 0x0186 }
        L_0x00b6:
            r8.m41274M()     // Catch:{ all -> 0x0186 }
            goto L_0x0170
        L_0x00bb:
            r11 = 0
            if (r13 == 0) goto L_0x00c7
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r3 = r13.get(r3)     // Catch:{ all -> 0x0186 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0186 }
            goto L_0x00c8
        L_0x00c7:
            r3 = r11
        L_0x00c8:
            if (r3 == 0) goto L_0x00d7
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x0186 }
            if (r6 != 0) goto L_0x00d7
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0186 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0186 }
            goto L_0x00d8
        L_0x00d7:
            r3 = r11
        L_0x00d8:
            com.google.android.gms.internal.measurement.C6898be.m39675b()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.h r6 = r8.mo24110U()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.t2 r7 = com.google.android.gms.measurement.internal.C7516u2.f33071q0     // Catch:{ all -> 0x0186 }
            boolean r6 = r6.mo24279B(r11, r7)     // Catch:{ all -> 0x0186 }
            if (r6 == 0) goto L_0x0102
            if (r13 == 0) goto L_0x00f2
            java.lang.String r6 = "ETag"
            java.lang.Object r13 = r13.get(r6)     // Catch:{ all -> 0x0186 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x0186 }
            goto L_0x00f3
        L_0x00f2:
            r13 = r11
        L_0x00f3:
            if (r13 == 0) goto L_0x0102
            boolean r6 = r13.isEmpty()     // Catch:{ all -> 0x0186 }
            if (r6 != 0) goto L_0x0102
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x0186 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0186 }
            goto L_0x0103
        L_0x0102:
            r13 = r11
        L_0x0103:
            if (r10 == r5) goto L_0x0111
            if (r10 != r4) goto L_0x0108
            goto L_0x0111
        L_0x0108:
            com.google.android.gms.measurement.internal.d4 r11 = r8.f32334a     // Catch:{ all -> 0x0186 }
            m41279R(r11)     // Catch:{ all -> 0x0186 }
            r11.mo24219H(r9, r12, r3, r13)     // Catch:{ all -> 0x0186 }
            goto L_0x0124
        L_0x0111:
            com.google.android.gms.measurement.internal.d4 r12 = r8.f32334a     // Catch:{ all -> 0x0186 }
            m41279R(r12)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.internal.measurement.d4 r12 = r12.mo24228t(r9)     // Catch:{ all -> 0x0186 }
            if (r12 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.d4 r12 = r8.f32334a     // Catch:{ all -> 0x0186 }
            m41279R(r12)     // Catch:{ all -> 0x0186 }
            r12.mo24219H(r9, r11, r11, r11)     // Catch:{ all -> 0x0186 }
        L_0x0124:
            i5.e r11 = r8.mo24116a()     // Catch:{ all -> 0x0186 }
            long r11 = r11.mo18370a()     // Catch:{ all -> 0x0186 }
            r1.mo24560l(r11)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.l r11 = r8.f32336c     // Catch:{ all -> 0x0186 }
            m41279R(r11)     // Catch:{ all -> 0x0186 }
            r11.mo24493o(r1)     // Catch:{ all -> 0x0186 }
            if (r10 != r5) goto L_0x0147
            com.google.android.gms.measurement.internal.f3 r10 = r8.mo24135l()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.d3 r10 = r10.mo24262x()     // Catch:{ all -> 0x0186 }
            java.lang.String r11 = "Config not found. Using empty config. appId"
            r10.mo24209b(r11, r9)     // Catch:{ all -> 0x0186 }
            goto L_0x0158
        L_0x0147:
            com.google.android.gms.measurement.internal.f3 r9 = r8.mo24135l()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo24260v()     // Catch:{ all -> 0x0186 }
            java.lang.String r11 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0186 }
            r9.mo24210c(r11, r10, r2)     // Catch:{ all -> 0x0186 }
        L_0x0158:
            com.google.android.gms.measurement.internal.k3 r9 = r8.f32335b     // Catch:{ all -> 0x0186 }
            m41279R(r9)     // Catch:{ all -> 0x0186 }
            boolean r9 = r9.mo24457k()     // Catch:{ all -> 0x0186 }
            if (r9 == 0) goto L_0x016d
            boolean r9 = r8.m41276O()     // Catch:{ all -> 0x0186 }
            if (r9 == 0) goto L_0x016d
            r8.mo24104C()     // Catch:{ all -> 0x0186 }
            goto L_0x0170
        L_0x016d:
            r8.m41274M()     // Catch:{ all -> 0x0186 }
        L_0x0170:
            com.google.android.gms.measurement.internal.l r9 = r8.f32336c     // Catch:{ all -> 0x0186 }
            m41279R(r9)     // Catch:{ all -> 0x0186 }
            r9.mo24492n()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.l r9 = r8.f32336c     // Catch:{ all -> 0x0190 }
            m41279R(r9)     // Catch:{ all -> 0x0190 }
            r9.mo24487f0()     // Catch:{ all -> 0x0190 }
            r8.f32352s = r0
            r8.m41272K()
            return
        L_0x0186:
            r9 = move-exception
            com.google.android.gms.measurement.internal.l r10 = r8.f32336c     // Catch:{ all -> 0x0190 }
            m41279R(r10)     // Catch:{ all -> 0x0190 }
            r10.mo24487f0()     // Catch:{ all -> 0x0190 }
            throw r9     // Catch:{ all -> 0x0190 }
        L_0x0190:
            r9 = move-exception
            r8.f32352s = r0
            r8.m41272K()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7303a9.mo24137m(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo24138n(boolean z) {
        m41274M();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo24139o(int i, Throwable th, byte[] bArr, String str) {
        C7414l lVar;
        mo24143s().mo24189f();
        mo24123e();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f32353t = false;
                m41272K();
                throw th2;
            }
        }
        List<Long> list = (List) C4141r.m28221k(this.f32357x);
        this.f32357x = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo24135l().mo24260v().mo24210c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f32342i.f33189h.mo24605b(mo24116a().mo18370a());
            if (i == 503 || i == 429) {
                this.f32342i.f33187f.mo24605b(mo24116a().mo18370a());
            }
            C7414l lVar2 = this.f32336c;
            m41279R(lVar2);
            lVar2.mo24488g0(list);
            m41274M();
            this.f32353t = false;
            m41272K();
        }
        if (th == null) {
            try {
                this.f32342i.f33188g.mo24605b(mo24116a().mo18370a());
                this.f32342i.f33189h.mo24605b(0);
                m41274M();
                mo24135l().mo24260v().mo24210c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                C7414l lVar3 = this.f32336c;
                m41279R(lVar3);
                lVar3.mo24486e0();
                try {
                    for (Long l : list) {
                        try {
                            lVar = this.f32336c;
                            m41279R(lVar);
                            long longValue = l.longValue();
                            lVar.mo24189f();
                            lVar.mo24623g();
                            if (lVar.mo24472P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            lVar.f32389a.mo24135l().mo24256q().mo24209b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List list2 = this.f32358y;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    C7414l lVar4 = this.f32336c;
                    m41279R(lVar4);
                    lVar4.mo24492n();
                    C7414l lVar5 = this.f32336c;
                    m41279R(lVar5);
                    lVar5.mo24487f0();
                    this.f32358y = null;
                    C7407k3 k3Var = this.f32335b;
                    m41279R(k3Var);
                    if (!k3Var.mo24457k() || !m41276O()) {
                        this.f32359z = -1;
                        m41274M();
                    } else {
                        mo24104C();
                    }
                    this.f32348o = 0;
                } catch (Throwable th3) {
                    C7414l lVar6 = this.f32336c;
                    m41279R(lVar6);
                    lVar6.mo24487f0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                mo24135l().mo24256q().mo24209b("Database error while trying to delete uploaded bundles", e3);
                this.f32348o = mo24116a().mo18371b();
                mo24135l().mo24260v().mo24209b("Disable upload, time", Long.valueOf(this.f32348o));
            }
            this.f32353t = false;
            m41272K();
        }
        mo24135l().mo24260v().mo24210c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f32342i.f33189h.mo24605b(mo24116a().mo18370a());
        this.f32342i.f33187f.mo24605b(mo24116a().mo18370a());
        C7414l lVar22 = this.f32336c;
        m41279R(lVar22);
        lVar22.mo24488g0(list);
        m41274M();
        this.f32353t = false;
        m41272K();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ea A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0416 A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x042b A[SYNTHETIC, Splitter:B:133:0x042b] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04d1 A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04ed A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x054d A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0142 A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0202 A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0206 A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0260 A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x026f A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x027f A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24140p(com.google.android.gms.measurement.internal.C7446n9 r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.h4 r8 = r24.mo24143s()
            r8.mo24189f()
            r24.mo24123e()
            p033d5.C4141r.m28221k(r25)
            java.lang.String r8 = r2.f32787a
            p033d5.C4141r.m28217g(r8)
            boolean r8 = m41278Q(r25)
            if (r8 == 0) goto L_0x0585
            com.google.android.gms.measurement.internal.l r8 = r1.f32336c
            m41279R(r8)
            java.lang.String r9 = r2.f32787a
            com.google.android.gms.measurement.internal.m5 r8 = r8.mo24474R(r9)
            r9 = 0
            if (r8 == 0) goto L_0x005e
            java.lang.String r11 = r8.mo24556i0()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r2.f32788b
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x005e
            r8.mo24560l(r9)
            com.google.android.gms.measurement.internal.l r11 = r1.f32336c
            m41279R(r11)
            r11.mo24493o(r8)
            com.google.android.gms.measurement.internal.d4 r8 = r1.f32334a
            m41279R(r8)
            java.lang.String r11 = r2.f32787a
            r8.mo24212A(r11)
        L_0x005e:
            boolean r8 = r2.f32794h
            if (r8 != 0) goto L_0x0066
            r24.mo24108S(r25)
            return
        L_0x0066:
            long r11 = r2.f32799u
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0074
            i5.e r8 = r24.mo24116a()
            long r11 = r8.mo18370a()
        L_0x0074:
            com.google.android.gms.measurement.internal.j4 r8 = r1.f32345l
            com.google.android.gms.measurement.internal.p r8 = r8.mo24411A()
            r8.mo24602q()
            int r8 = r2.f32800v
            r15 = 1
            if (r8 == 0) goto L_0x009c
            if (r8 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.f3 r13 = r24.mo24135l()
            com.google.android.gms.measurement.internal.d3 r13 = r13.mo24261w()
            java.lang.String r14 = r2.f32787a
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.mo24210c(r9, r14, r8)
            r8 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.l r9 = r1.f32336c
            m41279R(r9)
            r9.mo24486e0()
            com.google.android.gms.measurement.internal.l r9 = r1.f32336c     // Catch:{ all -> 0x057b }
            m41279R(r9)     // Catch:{ all -> 0x057b }
            java.lang.String r10 = r2.f32787a     // Catch:{ all -> 0x057b }
            java.lang.String r13 = "_npa"
            com.google.android.gms.measurement.internal.f9 r9 = r9.mo24479X(r10, r13)     // Catch:{ all -> 0x057b }
            if (r9 == 0) goto L_0x00c5
            java.lang.String r10 = "auto"
            java.lang.String r13 = r9.f32490b     // Catch:{ all -> 0x057b }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x057b }
            if (r10 == 0) goto L_0x00be
            goto L_0x00c5
        L_0x00be:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            goto L_0x0119
        L_0x00c5:
            java.lang.Boolean r10 = r2.f32804z     // Catch:{ all -> 0x057b }
            if (r10 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.d9 r10 = new com.google.android.gms.measurement.internal.d9     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_npa"
            java.lang.Boolean r13 = r2.f32804z     // Catch:{ all -> 0x057b }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x057b }
            if (r15 == r13) goto L_0x00d8
            r19 = 0
            goto L_0x00da
        L_0x00d8:
            r19 = 1
        L_0x00da:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x057b }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 1
            r13 = r10
            r3 = 0
            r4 = 1
            r15 = r11
            r17 = r19
            r18 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057b }
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r9.f32493e     // Catch:{ all -> 0x057b }
            java.lang.Long r13 = r10.f32441d     // Catch:{ all -> 0x057b }
            boolean r9 = r9.equals(r13)     // Catch:{ all -> 0x057b }
            if (r9 != 0) goto L_0x0119
        L_0x00fd:
            r1.mo24103B(r10, r2)     // Catch:{ all -> 0x057b }
            goto L_0x0119
        L_0x0101:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            if (r9 == 0) goto L_0x0119
            com.google.android.gms.measurement.internal.d9 r9 = new com.google.android.gms.measurement.internal.d9     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r9
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057b }
            r1.mo24145u(r9, r2)     // Catch:{ all -> 0x057b }
        L_0x0119:
            com.google.android.gms.measurement.internal.l r9 = r1.f32336c     // Catch:{ all -> 0x057b }
            m41279R(r9)     // Catch:{ all -> 0x057b }
            java.lang.String r10 = r2.f32787a     // Catch:{ all -> 0x057b }
            java.lang.Object r10 = p033d5.C4141r.m28221k(r10)     // Catch:{ all -> 0x057b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.m5 r9 = r9.mo24474R(r10)     // Catch:{ all -> 0x057b }
            if (r9 == 0) goto L_0x0202
            com.google.android.gms.measurement.internal.i9 r13 = r24.mo24129h0()     // Catch:{ all -> 0x057b }
            java.lang.String r14 = r2.f32788b     // Catch:{ all -> 0x057b }
            java.lang.String r15 = r9.mo24556i0()     // Catch:{ all -> 0x057b }
            java.lang.String r10 = r2.f32803y     // Catch:{ all -> 0x057b }
            java.lang.String r3 = r9.mo24542b0()     // Catch:{ all -> 0x057b }
            boolean r3 = r13.mo24386b0(r14, r15, r10, r3)     // Catch:{ all -> 0x057b }
            if (r3 == 0) goto L_0x0202
            com.google.android.gms.measurement.internal.f3 r3 = r24.mo24135l()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24261w()     // Catch:{ all -> 0x057b }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r9.mo24546d0()     // Catch:{ all -> 0x057b }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r13)     // Catch:{ all -> 0x057b }
            r3.mo24209b(r10, r13)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.l r3 = r1.f32336c     // Catch:{ all -> 0x057b }
            m41279R(r3)     // Catch:{ all -> 0x057b }
            java.lang.String r9 = r9.mo24546d0()     // Catch:{ all -> 0x057b }
            r3.mo24623g()     // Catch:{ all -> 0x057b }
            r3.mo24189f()     // Catch:{ all -> 0x057b }
            p033d5.C4141r.m28217g(r9)     // Catch:{ all -> 0x057b }
            android.database.sqlite.SQLiteDatabase r10 = r3.mo24472P()     // Catch:{ SQLiteException -> 0x01ea }
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01ea }
            r14 = 0
            r13[r14] = r9     // Catch:{ SQLiteException -> 0x01ea }
            java.lang.String r14 = "events"
            int r14 = r10.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "consent_settings"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            com.google.android.gms.internal.measurement.C7079md.m40412b()     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.j4 r15 = r3.f32389a     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.h r15 = r15.mo24443z()     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.t2 r4 = com.google.android.gms.measurement.internal.C7516u2.f33081v0     // Catch:{ SQLiteException -> 0x01ea }
            r23 = r6
            r6 = 0
            boolean r4 = r15.mo24279B(r6, r4)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r4 == 0) goto L_0x01d2
            java.lang.String r4 = "default_event_params"
            int r0 = r10.delete(r4, r0, r13)     // Catch:{ SQLiteException -> 0x01e8 }
            int r14 = r14 + r0
        L_0x01d2:
            if (r14 <= 0) goto L_0x0200
            com.google.android.gms.measurement.internal.j4 r0 = r3.f32389a     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24260v()     // Catch:{ SQLiteException -> 0x01e8 }
            java.lang.String r4 = "Deleted application data. app, records"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01e8 }
            r0.mo24210c(r4, r9, r6)     // Catch:{ SQLiteException -> 0x01e8 }
            goto L_0x0200
        L_0x01e8:
            r0 = move-exception
            goto L_0x01ed
        L_0x01ea:
            r0 = move-exception
            r23 = r6
        L_0x01ed:
            com.google.android.gms.measurement.internal.j4 r3 = r3.f32389a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24256q()     // Catch:{ all -> 0x057b }
            java.lang.String r4 = "Error deleting application data. appId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r9)     // Catch:{ all -> 0x057b }
            r3.mo24210c(r4, r6, r0)     // Catch:{ all -> 0x057b }
        L_0x0200:
            r9 = 0
            goto L_0x0204
        L_0x0202:
            r23 = r6
        L_0x0204:
            if (r9 == 0) goto L_0x025b
            long r3 = r9.mo24524L()     // Catch:{ all -> 0x057b }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x021d
            long r3 = r9.mo24524L()     // Catch:{ all -> 0x057b }
            long r13 = r2.f32796r     // Catch:{ all -> 0x057b }
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x021d
            r0 = 1
            goto L_0x021e
        L_0x021d:
            r0 = 0
        L_0x021e:
            java.lang.String r3 = r9.mo24552g0()     // Catch:{ all -> 0x057b }
            long r9 = r9.mo24524L()     // Catch:{ all -> 0x057b }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x0239
            if (r3 == 0) goto L_0x0239
            java.lang.String r4 = r2.f32789c     // Catch:{ all -> 0x057b }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x057b }
            if (r4 != 0) goto L_0x0239
            r15 = 1
            goto L_0x023a
        L_0x0239:
            r15 = 0
        L_0x023a:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x025b
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x057b }
            r0.<init>()     // Catch:{ all -> 0x057b }
            java.lang.String r4 = "_pv"
            r0.putString(r4, r3)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.v r3 = new com.google.android.gms.measurement.internal.v     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.t r15 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x057b }
            r15.<init>(r0)     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x057b }
            r1.mo24128h(r3, r2)     // Catch:{ all -> 0x057b }
        L_0x025b:
            r24.mo24108S(r25)     // Catch:{ all -> 0x057b }
            if (r8 != 0) goto L_0x026f
            com.google.android.gms.measurement.internal.l r0 = r1.f32336c     // Catch:{ all -> 0x057b }
            m41279R(r0)     // Catch:{ all -> 0x057b }
            java.lang.String r3 = r2.f32787a     // Catch:{ all -> 0x057b }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.r r0 = r0.mo24478V(r3, r4)     // Catch:{ all -> 0x057b }
            r15 = 0
            goto L_0x027d
        L_0x026f:
            com.google.android.gms.measurement.internal.l r0 = r1.f32336c     // Catch:{ all -> 0x057b }
            m41279R(r0)     // Catch:{ all -> 0x057b }
            java.lang.String r3 = r2.f32787a     // Catch:{ all -> 0x057b }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.r r0 = r0.mo24478V(r3, r4)     // Catch:{ all -> 0x057b }
            r15 = 1
        L_0x027d:
            if (r0 != 0) goto L_0x054d
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r11 / r3
            r13 = 1
            long r8 = r8 + r13
            long r8 = r8 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_et"
            java.lang.String r6 = "_r"
            java.lang.String r10 = "_c"
            if (r15 != 0) goto L_0x0505
            com.google.android.gms.measurement.internal.d9 r0 = new com.google.android.gms.measurement.internal.d9     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x057b }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057b }
            r1.mo24103B(r0, r2)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.h4 r0 = r24.mo24143s()     // Catch:{ all -> 0x057b }
            r0.mo24189f()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.v3 r0 = r1.f32344k     // Catch:{ all -> 0x057b }
            java.lang.Object r0 = p033d5.C4141r.m28221k(r0)     // Catch:{ all -> 0x057b }
            r8 = r0
            com.google.android.gms.measurement.internal.v3 r8 = (com.google.android.gms.measurement.internal.C7528v3) r8     // Catch:{ all -> 0x057b }
            java.lang.String r0 = r2.f32787a     // Catch:{ all -> 0x057b }
            if (r0 == 0) goto L_0x03a7
            boolean r9 = r0.isEmpty()     // Catch:{ all -> 0x057b }
            if (r9 == 0) goto L_0x02c1
            goto L_0x03a7
        L_0x02c1:
            com.google.android.gms.measurement.internal.j4 r9 = r8.f33107a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.h4 r9 = r9.mo24143s()     // Catch:{ all -> 0x057b }
            r9.mo24189f()     // Catch:{ all -> 0x057b }
            boolean r9 = r8.mo24691a()     // Catch:{ all -> 0x057b }
            if (r9 != 0) goto L_0x02e1
            com.google.android.gms.measurement.internal.j4 r0 = r8.f33107a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24259u()     // Catch:{ all -> 0x057b }
            java.lang.String r5 = "Install Referrer Reporter is not available"
            r0.mo24208a(r5)     // Catch:{ all -> 0x057b }
            goto L_0x03b6
        L_0x02e1:
            com.google.android.gms.measurement.internal.u3 r9 = new com.google.android.gms.measurement.internal.u3     // Catch:{ all -> 0x057b }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.j4 r0 = r8.f33107a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.h4 r0 = r0.mo24143s()     // Catch:{ all -> 0x057b }
            r0.mo24189f()     // Catch:{ all -> 0x057b }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x057b }
            java.lang.String r13 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r13)     // Catch:{ all -> 0x057b }
            android.content.ComponentName r13 = new android.content.ComponentName     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r13.<init>(r5, r14)     // Catch:{ all -> 0x057b }
            r0.setComponent(r13)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.j4 r13 = r8.f33107a     // Catch:{ all -> 0x057b }
            android.content.Context r13 = r13.mo24121d()     // Catch:{ all -> 0x057b }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x057b }
            if (r13 != 0) goto L_0x031d
            com.google.android.gms.measurement.internal.j4 r0 = r8.f33107a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24263y()     // Catch:{ all -> 0x057b }
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.mo24208a(r5)     // Catch:{ all -> 0x057b }
            goto L_0x03b6
        L_0x031d:
            r14 = 0
            java.util.List r13 = r13.queryIntentServices(r0, r14)     // Catch:{ all -> 0x057b }
            if (r13 == 0) goto L_0x0397
            boolean r15 = r13.isEmpty()     // Catch:{ all -> 0x057b }
            if (r15 != 0) goto L_0x0397
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x057b }
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13     // Catch:{ all -> 0x057b }
            android.content.pm.ServiceInfo r13 = r13.serviceInfo     // Catch:{ all -> 0x057b }
            if (r13 == 0) goto L_0x03b6
            java.lang.String r14 = r13.packageName     // Catch:{ all -> 0x057b }
            java.lang.String r13 = r13.name     // Catch:{ all -> 0x057b }
            if (r13 == 0) goto L_0x0387
            boolean r5 = r5.equals(r14)     // Catch:{ all -> 0x057b }
            if (r5 == 0) goto L_0x0387
            boolean r5 = r8.mo24691a()     // Catch:{ all -> 0x057b }
            if (r5 == 0) goto L_0x0387
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x057b }
            r5.<init>(r0)     // Catch:{ all -> 0x057b }
            h5.a r0 = p061h5.C4626a.m30143b()     // Catch:{ RuntimeException -> 0x0372 }
            com.google.android.gms.measurement.internal.j4 r13 = r8.f33107a     // Catch:{ RuntimeException -> 0x0372 }
            android.content.Context r13 = r13.mo24121d()     // Catch:{ RuntimeException -> 0x0372 }
            r14 = 1
            boolean r0 = r0.mo18191a(r13, r5, r9, r14)     // Catch:{ RuntimeException -> 0x0372 }
            com.google.android.gms.measurement.internal.j4 r5 = r8.f33107a     // Catch:{ RuntimeException -> 0x0372 }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ RuntimeException -> 0x0372 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24260v()     // Catch:{ RuntimeException -> 0x0372 }
            java.lang.String r9 = "Install Referrer Service is"
            java.lang.String r13 = "available"
            java.lang.String r14 = "not available"
            r15 = 1
            if (r15 == r0) goto L_0x036e
            r13 = r14
        L_0x036e:
            r5.mo24209b(r9, r13)     // Catch:{ RuntimeException -> 0x0372 }
            goto L_0x03b6
        L_0x0372:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j4 r5 = r8.f33107a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ all -> 0x057b }
            java.lang.String r8 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x057b }
            r5.mo24209b(r8, r0)     // Catch:{ all -> 0x057b }
            goto L_0x03b6
        L_0x0387:
            com.google.android.gms.measurement.internal.j4 r0 = r8.f33107a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()     // Catch:{ all -> 0x057b }
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.mo24208a(r5)     // Catch:{ all -> 0x057b }
            goto L_0x03b6
        L_0x0397:
            com.google.android.gms.measurement.internal.j4 r0 = r8.f33107a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24259u()     // Catch:{ all -> 0x057b }
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.mo24208a(r5)     // Catch:{ all -> 0x057b }
            goto L_0x03b6
        L_0x03a7:
            com.google.android.gms.measurement.internal.j4 r0 = r8.f33107a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24263y()     // Catch:{ all -> 0x057b }
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
            r0.mo24208a(r5)     // Catch:{ all -> 0x057b }
        L_0x03b6:
            com.google.android.gms.measurement.internal.h4 r0 = r24.mo24143s()     // Catch:{ all -> 0x057b }
            r0.mo24189f()     // Catch:{ all -> 0x057b }
            r24.mo24123e()     // Catch:{ all -> 0x057b }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x057b }
            r5.<init>()     // Catch:{ all -> 0x057b }
            r8 = 1
            r5.putLong(r10, r8)     // Catch:{ all -> 0x057b }
            r5.putLong(r6, r8)     // Catch:{ all -> 0x057b }
            r8 = 0
            r5.putLong(r7, r8)     // Catch:{ all -> 0x057b }
            r6 = r23
            r5.putLong(r6, r8)     // Catch:{ all -> 0x057b }
            r10 = r22
            r5.putLong(r10, r8)     // Catch:{ all -> 0x057b }
            r15 = r21
            r5.putLong(r15, r8)     // Catch:{ all -> 0x057b }
            r8 = 1
            r5.putLong(r4, r8)     // Catch:{ all -> 0x057b }
            boolean r0 = r2.f32802x     // Catch:{ all -> 0x057b }
            if (r0 == 0) goto L_0x03ed
            r5.putLong(r3, r8)     // Catch:{ all -> 0x057b }
        L_0x03ed:
            java.lang.String r0 = r2.f32787a     // Catch:{ all -> 0x057b }
            java.lang.Object r0 = p033d5.C4141r.m28221k(r0)     // Catch:{ all -> 0x057b }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.l r0 = r1.f32336c     // Catch:{ all -> 0x057b }
            m41279R(r0)     // Catch:{ all -> 0x057b }
            p033d5.C4141r.m28217g(r3)     // Catch:{ all -> 0x057b }
            r0.mo24189f()     // Catch:{ all -> 0x057b }
            r0.mo24623g()     // Catch:{ all -> 0x057b }
            java.lang.String r4 = "first_open_count"
            long r8 = r0.mo24468L(r3, r4)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32345l     // Catch:{ all -> 0x057b }
            android.content.Context r0 = r0.mo24121d()     // Catch:{ all -> 0x057b }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x057b }
            if (r0 != 0) goto L_0x042b
            com.google.android.gms.measurement.internal.f3 r0 = r24.mo24135l()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ all -> 0x057b }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r3)     // Catch:{ all -> 0x057b }
            r0.mo24209b(r4, r3)     // Catch:{ all -> 0x057b }
        L_0x0427:
            r3 = 0
            goto L_0x04e9
        L_0x042b:
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32345l     // Catch:{ NameNotFoundException -> 0x043b }
            android.content.Context r0 = r0.mo24121d()     // Catch:{ NameNotFoundException -> 0x043b }
            k5.b r0 = p081k5.C4888c.m31075a(r0)     // Catch:{ NameNotFoundException -> 0x043b }
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.mo18673f(r3, r4)     // Catch:{ NameNotFoundException -> 0x043b }
            goto L_0x044e
        L_0x043b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.f3 r4 = r24.mo24135l()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24256q()     // Catch:{ all -> 0x057b }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r3)     // Catch:{ all -> 0x057b }
            r4.mo24210c(r13, r14, r0)     // Catch:{ all -> 0x057b }
            r0 = 0
        L_0x044e:
            if (r0 == 0) goto L_0x04a2
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x057b }
            r16 = 0
            int r4 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x04a2
            r21 = r3
            long r3 = r0.lastUpdateTime     // Catch:{ all -> 0x057b }
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0484
            com.google.android.gms.measurement.internal.h r0 = r24.mo24110U()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.t2 r3 = com.google.android.gms.measurement.internal.C7516u2.f33045d0     // Catch:{ all -> 0x057b }
            r4 = 0
            boolean r0 = r0.mo24279B(r4, r3)     // Catch:{ all -> 0x057b }
            if (r0 == 0) goto L_0x047e
            r13 = 0
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x047c
            r13 = 1
            r5.putLong(r7, r13)     // Catch:{ all -> 0x057b }
            r0 = 0
            r8 = 0
            goto L_0x0486
        L_0x047c:
            r0 = 0
            goto L_0x0486
        L_0x047e:
            r13 = 1
            r5.putLong(r7, r13)     // Catch:{ all -> 0x057b }
            goto L_0x047c
        L_0x0484:
            r4 = 0
            r0 = 1
        L_0x0486:
            com.google.android.gms.measurement.internal.d9 r3 = new com.google.android.gms.measurement.internal.d9     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_fi"
            r7 = 1
            if (r7 == r0) goto L_0x0490
            r16 = 0
            goto L_0x0492
        L_0x0490:
            r16 = 1
        L_0x0492:
            java.lang.Long r17 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x057b }
            java.lang.String r18 = "auto"
            r13 = r3
            r7 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057b }
            r1.mo24103B(r3, r2)     // Catch:{ all -> 0x057b }
            goto L_0x04a6
        L_0x04a2:
            r21 = r3
            r7 = r15
            r4 = 0
        L_0x04a6:
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32345l     // Catch:{ NameNotFoundException -> 0x04ba }
            android.content.Context r0 = r0.mo24121d()     // Catch:{ NameNotFoundException -> 0x04ba }
            k5.b r0 = p081k5.C4888c.m31075a(r0)     // Catch:{ NameNotFoundException -> 0x04ba }
            r3 = r21
            r13 = 0
            android.content.pm.ApplicationInfo r0 = r0.mo18670c(r3, r13)     // Catch:{ NameNotFoundException -> 0x04b8 }
            goto L_0x04cf
        L_0x04b8:
            r0 = move-exception
            goto L_0x04bd
        L_0x04ba:
            r0 = move-exception
            r3 = r21
        L_0x04bd:
            com.google.android.gms.measurement.internal.f3 r13 = r24.mo24135l()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.d3 r13 = r13.mo24256q()     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r3)     // Catch:{ all -> 0x057b }
            r13.mo24210c(r14, r3, r0)     // Catch:{ all -> 0x057b }
            r0 = r4
        L_0x04cf:
            if (r0 == 0) goto L_0x0427
            int r3 = r0.flags     // Catch:{ all -> 0x057b }
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x04dc
            r3 = 1
            r5.putLong(r10, r3)     // Catch:{ all -> 0x057b }
        L_0x04dc:
            int r0 = r0.flags     // Catch:{ all -> 0x057b }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0427
            r3 = 1
            r5.putLong(r7, r3)     // Catch:{ all -> 0x057b }
            goto L_0x0427
        L_0x04e9:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04f0
            r5.putLong(r6, r8)     // Catch:{ all -> 0x057b }
        L_0x04f0:
            com.google.android.gms.measurement.internal.v r0 = new com.google.android.gms.measurement.internal.v     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.t r15 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x057b }
            r15.<init>(r5)     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x057b }
            r1.mo24132j(r0, r2)     // Catch:{ all -> 0x057b }
            goto L_0x056a
        L_0x0505:
            com.google.android.gms.measurement.internal.d9 r0 = new com.google.android.gms.measurement.internal.d9     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x057b }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057b }
            r1.mo24103B(r0, r2)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.h4 r0 = r24.mo24143s()     // Catch:{ all -> 0x057b }
            r0.mo24189f()     // Catch:{ all -> 0x057b }
            r24.mo24123e()     // Catch:{ all -> 0x057b }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x057b }
            r0.<init>()     // Catch:{ all -> 0x057b }
            r7 = 1
            r0.putLong(r10, r7)     // Catch:{ all -> 0x057b }
            r0.putLong(r6, r7)     // Catch:{ all -> 0x057b }
            r0.putLong(r4, r7)     // Catch:{ all -> 0x057b }
            boolean r4 = r2.f32802x     // Catch:{ all -> 0x057b }
            if (r4 == 0) goto L_0x0538
            r0.putLong(r3, r7)     // Catch:{ all -> 0x057b }
        L_0x0538:
            com.google.android.gms.measurement.internal.v r3 = new com.google.android.gms.measurement.internal.v     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.t r15 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x057b }
            r15.<init>(r0)     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x057b }
            r1.mo24132j(r3, r2)     // Catch:{ all -> 0x057b }
            goto L_0x056a
        L_0x054d:
            boolean r0 = r2.f32795i     // Catch:{ all -> 0x057b }
            if (r0 == 0) goto L_0x056a
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x057b }
            r0.<init>()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.v r3 = new com.google.android.gms.measurement.internal.v     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.t r15 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x057b }
            r15.<init>(r0)     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x057b }
            r1.mo24132j(r3, r2)     // Catch:{ all -> 0x057b }
        L_0x056a:
            com.google.android.gms.measurement.internal.l r0 = r1.f32336c     // Catch:{ all -> 0x057b }
            m41279R(r0)     // Catch:{ all -> 0x057b }
            r0.mo24492n()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.l r0 = r1.f32336c
            m41279R(r0)
            r0.mo24487f0()
            return
        L_0x057b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r2 = r1.f32336c
            m41279R(r2)
            r2.mo24487f0()
            throw r0
        L_0x0585:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7303a9.mo24140p(com.google.android.gms.measurement.internal.n9):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo24141q() {
        this.f32350q++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo24142r(C7326d dVar) {
        C7446n9 I = m41270I((String) C4141r.m28221k(dVar.f32396a));
        if (I != null) {
            mo24144t(dVar, I);
        }
    }

    /* renamed from: s */
    public final C7375h4 mo24143s() {
        return ((C7397j4) C4141r.m28221k(this.f32345l)).mo24143s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo24144t(C7326d dVar, C7446n9 n9Var) {
        C4141r.m28221k(dVar);
        C4141r.m28217g(dVar.f32396a);
        C4141r.m28221k(dVar.f32398c);
        C4141r.m28217g(dVar.f32398c.f32439b);
        mo24143s().mo24189f();
        mo24123e();
        if (m41278Q(n9Var)) {
            if (n9Var.f32794h) {
                C7414l lVar = this.f32336c;
                m41279R(lVar);
                lVar.mo24486e0();
                try {
                    mo24108S(n9Var);
                    String str = (String) C4141r.m28221k(dVar.f32396a);
                    C7414l lVar2 = this.f32336c;
                    m41279R(lVar2);
                    C7326d S = lVar2.mo24475S(str, dVar.f32398c.f32439b);
                    if (S != null) {
                        mo24135l().mo24255p().mo24210c("Removing conditional user property", dVar.f32396a, this.f32345l.mo24414D().mo24097f(dVar.f32398c.f32439b));
                        C7414l lVar3 = this.f32336c;
                        m41279R(lVar3);
                        lVar3.mo24467J(str, dVar.f32398c.f32439b);
                        if (S.f32400e) {
                            C7414l lVar4 = this.f32336c;
                            m41279R(lVar4);
                            lVar4.mo24490k(str, dVar.f32398c.f32439b);
                        }
                        C7524v vVar = dVar.f32406s;
                        if (vVar != null) {
                            C7502t tVar = vVar.f33102b;
                            mo24105D((C7524v) C4141r.m28221k(mo24129h0().mo24407w0(str, ((C7524v) C4141r.m28221k(dVar.f32406s)).f33101a, tVar != null ? tVar.mo24661K1() : null, S.f32397b, dVar.f32406s.f33104d, true, true)), n9Var);
                        }
                    } else {
                        mo24135l().mo24261w().mo24210c("Conditional user property doesn't exist", C7352f3.m41475z(dVar.f32396a), this.f32345l.mo24414D().mo24097f(dVar.f32398c.f32439b));
                    }
                    C7414l lVar5 = this.f32336c;
                    m41279R(lVar5);
                    lVar5.mo24492n();
                } finally {
                    C7414l lVar6 = this.f32336c;
                    m41279R(lVar6);
                    lVar6.mo24487f0();
                }
            } else {
                mo24108S(n9Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo24145u(C7336d9 d9Var, C7446n9 n9Var) {
        mo24143s().mo24189f();
        mo24123e();
        if (m41278Q(n9Var)) {
            if (!n9Var.f32794h) {
                mo24108S(n9Var);
            } else if (!"_npa".equals(d9Var.f32439b) || n9Var.f32804z == null) {
                mo24135l().mo24255p().mo24209b("Removing user property", this.f32345l.mo24414D().mo24097f(d9Var.f32439b));
                C7414l lVar = this.f32336c;
                m41279R(lVar);
                lVar.mo24486e0();
                try {
                    mo24108S(n9Var);
                    if ("_id".equals(d9Var.f32439b)) {
                        C7414l lVar2 = this.f32336c;
                        m41279R(lVar2);
                        lVar2.mo24490k((String) C4141r.m28221k(n9Var.f32787a), "_lair");
                    }
                    C7414l lVar3 = this.f32336c;
                    m41279R(lVar3);
                    lVar3.mo24490k((String) C4141r.m28221k(n9Var.f32787a), d9Var.f32439b);
                    C7414l lVar4 = this.f32336c;
                    m41279R(lVar4);
                    lVar4.mo24492n();
                    mo24135l().mo24255p().mo24209b("User property removed", this.f32345l.mo24414D().mo24097f(d9Var.f32439b));
                } finally {
                    C7414l lVar5 = this.f32336c;
                    m41279R(lVar5);
                    lVar5.mo24487f0();
                }
            } else {
                mo24135l().mo24255p().mo24208a("Falling back to manifest metadata value for ad personalization");
                mo24103B(new C7336d9("_npa", mo24116a().mo18370a(), Long.valueOf(true != n9Var.f32804z.booleanValue() ? 0 : 1), "auto"), n9Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo24146v(C7446n9 n9Var) {
        if (this.f32357x != null) {
            ArrayList arrayList = new ArrayList();
            this.f32358y = arrayList;
            arrayList.addAll(this.f32357x);
        }
        C7414l lVar = this.f32336c;
        m41279R(lVar);
        String str = (String) C4141r.m28221k(n9Var.f32787a);
        C4141r.m28217g(str);
        lVar.mo24189f();
        lVar.mo24623g();
        try {
            SQLiteDatabase P = lVar.mo24472P();
            String[] strArr = {str};
            int delete = P.delete("apps", "app_id=?", strArr) + P.delete("events", "app_id=?", strArr) + P.delete("user_attributes", "app_id=?", strArr) + P.delete("conditional_properties", "app_id=?", strArr) + P.delete("raw_events", "app_id=?", strArr) + P.delete("raw_events_metadata", "app_id=?", strArr) + P.delete("queue", "app_id=?", strArr) + P.delete("audience_filter_values", "app_id=?", strArr) + P.delete("main_event_params", "app_id=?", strArr) + P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                lVar.f32389a.mo24135l().mo24260v().mo24210c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            lVar.f32389a.mo24135l().mo24256q().mo24210c("Error resetting analytics data. appId, error", C7352f3.m41475z(str), e);
        }
        if (n9Var.f32794h) {
            mo24140p(n9Var);
        }
    }

    /* renamed from: w */
    public final void mo24147w(String str, C7454o6 o6Var) {
        mo24143s().mo24189f();
        String str2 = this.f32332D;
        if (str2 == null || str2.equals(str) || o6Var != null) {
            this.f32332D = str;
            this.f32331C = o6Var;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo24148x() {
        mo24143s().mo24189f();
        C7414l lVar = this.f32336c;
        m41279R(lVar);
        lVar.mo24489h0();
        if (this.f32342i.f33188g.mo24604a() == 0) {
            this.f32342i.f33188g.mo24605b(mo24116a().mo18370a());
        }
        m41274M();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo24149y(C7326d dVar) {
        C7446n9 I = m41270I((String) C4141r.m28221k(dVar.f32396a));
        if (I != null) {
            mo24150z(dVar, I);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo24150z(C7326d dVar, C7446n9 n9Var) {
        C4141r.m28221k(dVar);
        C4141r.m28217g(dVar.f32396a);
        C4141r.m28221k(dVar.f32397b);
        C4141r.m28221k(dVar.f32398c);
        C4141r.m28217g(dVar.f32398c.f32439b);
        mo24143s().mo24189f();
        mo24123e();
        if (m41278Q(n9Var)) {
            if (!n9Var.f32794h) {
                mo24108S(n9Var);
                return;
            }
            C7326d dVar2 = new C7326d(dVar);
            boolean z = false;
            dVar2.f32400e = false;
            C7414l lVar = this.f32336c;
            m41279R(lVar);
            lVar.mo24486e0();
            try {
                C7414l lVar2 = this.f32336c;
                m41279R(lVar2);
                C7326d S = lVar2.mo24475S((String) C4141r.m28221k(dVar2.f32396a), dVar2.f32398c.f32439b);
                if (S != null && !S.f32397b.equals(dVar2.f32397b)) {
                    mo24135l().mo24261w().mo24211d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f32345l.mo24414D().mo24097f(dVar2.f32398c.f32439b), dVar2.f32397b, S.f32397b);
                }
                if (S != null && S.f32400e) {
                    dVar2.f32397b = S.f32397b;
                    dVar2.f32399d = S.f32399d;
                    dVar2.f32403h = S.f32403h;
                    dVar2.f32401f = S.f32401f;
                    dVar2.f32404i = S.f32404i;
                    dVar2.f32400e = true;
                    C7336d9 d9Var = dVar2.f32398c;
                    dVar2.f32398c = new C7336d9(d9Var.f32439b, S.f32398c.f32440c, d9Var.mo24243I1(), S.f32398c.f32443f);
                } else if (TextUtils.isEmpty(dVar2.f32401f)) {
                    C7336d9 d9Var2 = dVar2.f32398c;
                    dVar2.f32398c = new C7336d9(d9Var2.f32439b, dVar2.f32399d, d9Var2.mo24243I1(), dVar2.f32398c.f32443f);
                    dVar2.f32400e = true;
                    z = true;
                }
                if (dVar2.f32400e) {
                    C7336d9 d9Var3 = dVar2.f32398c;
                    C7358f9 f9Var = new C7358f9((String) C4141r.m28221k(dVar2.f32396a), dVar2.f32397b, d9Var3.f32439b, d9Var3.f32440c, C4141r.m28221k(d9Var3.mo24243I1()));
                    C7414l lVar3 = this.f32336c;
                    m41279R(lVar3);
                    if (lVar3.mo24501x(f9Var)) {
                        mo24135l().mo24255p().mo24211d("User property updated immediately", dVar2.f32396a, this.f32345l.mo24414D().mo24097f(f9Var.f32491c), f9Var.f32493e);
                    } else {
                        mo24135l().mo24256q().mo24211d("(2)Too many active user properties, ignoring", C7352f3.m41475z(dVar2.f32396a), this.f32345l.mo24414D().mo24097f(f9Var.f32491c), f9Var.f32493e);
                    }
                    if (z && dVar2.f32404i != null) {
                        mo24105D(new C7524v(dVar2.f32404i, dVar2.f32399d), n9Var);
                    }
                }
                C7414l lVar4 = this.f32336c;
                m41279R(lVar4);
                if (lVar4.mo24500w(dVar2)) {
                    mo24135l().mo24255p().mo24211d("Conditional property added", dVar2.f32396a, this.f32345l.mo24414D().mo24097f(dVar2.f32398c.f32439b), dVar2.f32398c.mo24243I1());
                } else {
                    mo24135l().mo24256q().mo24211d("Too many conditional properties, ignoring", C7352f3.m41475z(dVar2.f32396a), this.f32345l.mo24414D().mo24097f(dVar2.f32398c.f32439b), dVar2.f32398c.mo24243I1());
                }
                C7414l lVar5 = this.f32336c;
                m41279R(lVar5);
                lVar5.mo24492n();
            } finally {
                C7414l lVar6 = this.f32336c;
                m41279R(lVar6);
                lVar6.mo24487f0();
            }
        }
    }
}
