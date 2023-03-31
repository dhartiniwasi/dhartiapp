package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C6872a5;
import com.google.android.gms.internal.measurement.C6889b5;
import com.google.android.gms.internal.measurement.C6906c5;
import com.google.android.gms.internal.measurement.C6923d5;
import com.google.android.gms.internal.measurement.C6957f5;
import com.google.android.gms.internal.measurement.C7016ie;
import com.google.android.gms.internal.measurement.C7039k5;
import com.google.android.gms.internal.measurement.C7055l5;
import com.google.android.gms.internal.measurement.C7134q4;
import com.google.android.gms.internal.measurement.C7150r4;
import com.google.android.gms.internal.measurement.C7166s4;
import com.google.android.gms.internal.measurement.C7182t4;
import com.google.android.gms.internal.measurement.C7198u4;
import com.google.android.gms.internal.measurement.C7214v4;
import com.google.android.gms.internal.measurement.C7278z4;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p033d5.C4141r;
import p402y5.C13018a;
import p402y5.C13020b;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7539w4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ C7524v f33153a;

    /* renamed from: b */
    final /* synthetic */ String f33154b;

    /* renamed from: c */
    final /* synthetic */ C7310b5 f33155c;

    C7539w4(C7310b5 b5Var, C7524v vVar, String str) {
        this.f33155c = b5Var;
        this.f33153a = vVar;
        this.f33154b = str;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        C7303a9 a9Var;
        C7358f9 f9Var;
        C7278z4 z4Var;
        C6889b5 b5Var;
        Bundle bundle;
        String str;
        C7431m5 m5Var;
        long j;
        String str2;
        C7480r rVar;
        String str3;
        this.f33155c.f32369a.mo24119c();
        C7443n6 d0 = this.f33155c.f32369a.mo24122d0();
        C7524v vVar = this.f33153a;
        String str4 = this.f33154b;
        d0.mo24189f();
        C7397j4.m41656t();
        C4141r.m28221k(vVar);
        C4141r.m28217g(str4);
        if (!d0.f32389a.mo24443z().mo24279B(str4, C7516u2.f33032U)) {
            d0.f32389a.mo24135l().mo24255p().mo24209b("Generating ScionPayload disabled. packageName", str4);
            return new byte[0];
        } else if ("_iap".equals(vVar.f33101a) || "_iapx".equals(vVar.f33101a)) {
            C7278z4 C = C6872a5.m39460C();
            d0.f32873b.mo24112W().mo24486e0();
            C7431m5 R = d0.f32873b.mo24112W().mo24474R(str4);
            if (R == null) {
                d0.f32389a.mo24135l().mo24255p().mo24209b("Log and bundle not available. package_name", str4);
                bArr = new byte[0];
                a9Var = d0.f32873b;
            } else if (!R.mo24522J()) {
                d0.f32389a.mo24135l().mo24255p().mo24209b("Log and bundle disabled. package_name", str4);
                bArr = new byte[0];
                a9Var = d0.f32873b;
            } else {
                C6889b5 P1 = C6906c5.m39757P1();
                P1.mo23090W(1);
                P1.mo23085R(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                if (!TextUtils.isEmpty(R.mo24546d0())) {
                    P1.mo23115u(R.mo24546d0());
                }
                if (!TextUtils.isEmpty(R.mo24550f0())) {
                    P1.mo23120x((String) C4141r.m28221k(R.mo24550f0()));
                }
                if (!TextUtils.isEmpty(R.mo24552g0())) {
                    P1.mo23122y((String) C4141r.m28221k(R.mo24552g0()));
                }
                if (R.mo24524L() != -2147483648L) {
                    P1.mo23124z((int) R.mo24524L());
                }
                P1.mo23078N(R.mo24535W());
                P1.mo23067H(R.mo24533U());
                String i0 = R.mo24556i0();
                String b0 = R.mo24542b0();
                if (!TextUtils.isEmpty(i0)) {
                    P1.mo23077M(i0);
                } else if (!TextUtils.isEmpty(b0)) {
                    P1.mo23113s(b0);
                }
                C13020b V = d0.f32873b.mo24111V(str4);
                P1.mo23062E(R.mo24532T());
                if (d0.f32389a.mo24436n() && d0.f32389a.mo24443z().mo24280C(P1.mo23102j0()) && V.mo38074i(C13018a.AD_STORAGE) && !TextUtils.isEmpty((CharSequence) null)) {
                    P1.mo23065G((String) null);
                }
                P1.mo23060D(V.mo38072h());
                if (V.mo38074i(C13018a.AD_STORAGE) && R.mo24521I()) {
                    Pair m = d0.f32873b.mo24124e0().mo24758m(R.mo24546d0(), V);
                    if (R.mo24521I() && !TextUtils.isEmpty((CharSequence) m.first)) {
                        try {
                            P1.mo23091Y(C7443n6.m41839c((String) m.first, Long.toString(vVar.f33104d)));
                            Object obj = m.second;
                            if (obj != null) {
                                P1.mo23082P(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e) {
                            d0.f32389a.mo24135l().mo24255p().mo24209b("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            a9Var = d0.f32873b;
                        } catch (Throwable th) {
                            d0.f32873b.mo24112W().mo24487f0();
                            throw th;
                        }
                    }
                }
                d0.f32389a.mo24411A().mo24236i();
                P1.mo23064F(Build.MODEL);
                d0.f32389a.mo24411A().mo24236i();
                P1.mo23084Q(Build.VERSION.RELEASE);
                P1.mo23096d0((int) d0.f32389a.mo24411A().mo24600o());
                P1.mo23100h0(d0.f32389a.mo24411A().mo24601p());
                try {
                    if (V.mo38074i(C13018a.ANALYTICS_STORAGE) && R.mo24548e0() != null) {
                        P1.mo23117v(C7443n6.m41839c((String) C4141r.m28221k(R.mo24548e0()), Long.toString(vVar.f33104d)));
                    }
                    if (!TextUtils.isEmpty(R.mo24554h0())) {
                        P1.mo23075L((String) C4141r.m28221k(R.mo24554h0()));
                    }
                    String d02 = R.mo24546d0();
                    List c0 = d0.f32873b.mo24112W().mo24484c0(d02);
                    Iterator it = c0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            f9Var = null;
                            break;
                        }
                        f9Var = (C7358f9) it.next();
                        if ("_lte".equals(f9Var.f32491c)) {
                            break;
                        }
                    }
                    if (f9Var == null || f9Var.f32493e == null) {
                        C7358f9 f9Var2 = new C7358f9(d02, "auto", "_lte", d0.f32389a.mo24116a().mo18370a(), 0L);
                        c0.add(f9Var2);
                        d0.f32873b.mo24112W().mo24501x(f9Var2);
                    }
                    C7325c9 g0 = d0.f32873b.mo24127g0();
                    g0.f32389a.mo24135l().mo24260v().mo24208a("Checking account type status for ad personalization signals");
                    if (g0.f32389a.mo24411A().mo24603r()) {
                        String d03 = R.mo24546d0();
                        C4141r.m28221k(d03);
                        if (R.mo24521I() && g0.f32873b.mo24117a0().mo24213B(d03)) {
                            g0.f32389a.mo24135l().mo24255p().mo24208a("Turning off ad personalization due to account type");
                            Iterator it2 = c0.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if ("_npa".equals(((C7358f9) it2.next()).f32491c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            c0.add(new C7358f9(d03, "auto", "_npa", g0.f32389a.mo24116a().mo18370a(), 1L));
                        }
                    }
                    C7055l5[] l5VarArr = new C7055l5[c0.size()];
                    for (int i = 0; i < c0.size(); i++) {
                        C7039k5 F = C7055l5.m40337F();
                        F.mo23605x(((C7358f9) c0.get(i)).f32491c);
                        F.mo23606y(((C7358f9) c0.get(i)).f32492d);
                        d0.f32873b.mo24127g0().mo24201K(F, ((C7358f9) c0.get(i)).f32493e);
                        l5VarArr[i] = (C7055l5) F.mo23357k();
                    }
                    P1.mo23121x0(Arrays.asList(l5VarArr));
                    C7363g3 b = C7363g3.m41489b(vVar);
                    d0.f32389a.mo24423N().mo24409z(b.f32500d, d0.f32873b.mo24112W().mo24473Q(str4));
                    d0.f32389a.mo24423N().mo24364A(b, d0.f32389a.mo24443z().mo24289m(str4));
                    Bundle bundle2 = b.f32500d;
                    bundle2.putLong("_c", 1);
                    d0.f32389a.mo24135l().mo24255p().mo24208a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", vVar.f33103c);
                    if (d0.f32389a.mo24423N().mo24383T(P1.mo23102j0())) {
                        d0.f32389a.mo24423N().mo24366C(bundle2, "_dbg", 1L);
                        d0.f32389a.mo24423N().mo24366C(bundle2, "_r", 1L);
                    }
                    C7480r V2 = d0.f32873b.mo24112W().mo24478V(str4, vVar.f33101a);
                    if (V2 == null) {
                        b5Var = P1;
                        m5Var = R;
                        z4Var = C;
                        str = str4;
                        bundle = bundle2;
                        str2 = null;
                        rVar = new C7480r(str4, vVar.f33101a, 0, 0, 0, vVar.f33104d, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j = 0;
                    } else {
                        m5Var = R;
                        z4Var = C;
                        str = str4;
                        bundle = bundle2;
                        b5Var = P1;
                        str2 = null;
                        long j2 = V2.f32916f;
                        rVar = V2.mo24630c(vVar.f33104d);
                        j = j2;
                    }
                    d0.f32873b.mo24112W().mo24494p(rVar);
                    C7469q qVar = new C7469q(d0.f32389a, vVar.f33103c, str, vVar.f33101a, vVar.f33104d, j, bundle);
                    C7134q4 G = C7150r4.m40779G();
                    G.mo23752E(qVar.f32878d);
                    G.mo23748A(qVar.f32876b);
                    G.mo23751D(qVar.f32879e);
                    C7491s sVar = new C7491s(qVar.f32880f);
                    while (sVar.hasNext()) {
                        String a = sVar.next();
                        C7198u4 G2 = C7214v4.m41014G();
                        G2.mo23910B(a);
                        Object N1 = qVar.f32880f.mo24664N1(a);
                        if (N1 != null) {
                            d0.f32873b.mo24127g0().mo24200J(G2, N1);
                            G.mo23761v(G2);
                        }
                    }
                    C6889b5 b5Var2 = b5Var;
                    b5Var2.mo23123y0(G);
                    C6923d5 C2 = C6957f5.m40012C();
                    C7166s4 C3 = C7182t4.m40925C();
                    C3.mo23869p(rVar.f32913c);
                    C3.mo23870r(vVar.f33101a);
                    C2.mo23320p(C3);
                    b5Var2.mo23087T(C2);
                    b5Var2.mo23114s0(d0.f32873b.mo24109T().mo24152k(m5Var.mo24546d0(), Collections.emptyList(), b5Var2.mo23106n0(), Long.valueOf(G.mo23759s()), Long.valueOf(G.mo23759s())));
                    if (G.mo23756I()) {
                        b5Var2.mo23095c0(G.mo23759s());
                        b5Var2.mo23069I(G.mo23759s());
                    }
                    long X = m5Var.mo24536X();
                    int i2 = (X > 0 ? 1 : (X == 0 ? 0 : -1));
                    if (i2 != 0) {
                        b5Var2.mo23088U(X);
                    }
                    long Z = m5Var.mo24538Z();
                    if (Z != 0) {
                        b5Var2.mo23089V(Z);
                    } else if (i2 != 0) {
                        b5Var2.mo23089V(X);
                    }
                    String b2 = m5Var.mo24541b();
                    C7016ie.m40214b();
                    if (d0.f32389a.mo24443z().mo24279B(str2, C7516u2.f33065n0)) {
                        str3 = str;
                        if (d0.f32389a.mo24443z().mo24279B(str3, C7516u2.f33069p0) && b2 != null) {
                            b5Var2.mo23094b0(b2);
                        }
                    } else {
                        str3 = str;
                    }
                    m5Var.mo24547e();
                    b5Var2.mo23054A((int) m5Var.mo24537Y());
                    d0.f32389a.mo24443z().mo24292p();
                    b5Var2.mo23098f0(74029);
                    b5Var2.mo23097e0(d0.f32389a.mo24116a().mo18370a());
                    b5Var2.mo23093a0(true);
                    if (d0.f32389a.mo24443z().mo24279B(str2, C7516u2.f33077t0)) {
                        d0.f32873b.mo24125f(b5Var2.mo23102j0(), b5Var2);
                    }
                    C7278z4 z4Var2 = z4Var;
                    z4Var2.mo24031p(b5Var2);
                    C7431m5 m5Var2 = m5Var;
                    m5Var2.mo24515C(b5Var2.mo23110q0());
                    m5Var2.mo24574z(b5Var2.mo23109p0());
                    d0.f32873b.mo24112W().mo24493o(m5Var2);
                    d0.f32873b.mo24112W().mo24492n();
                    d0.f32873b.mo24112W().mo24487f0();
                    try {
                        return d0.f32873b.mo24127g0().mo24203O(((C6872a5) z4Var2.mo23357k()).mo23736h());
                    } catch (IOException e2) {
                        d0.f32389a.mo24135l().mo24256q().mo24210c("Data loss. Failed to bundle and serialize. appId", C7352f3.m41475z(str3), e2);
                        return str2;
                    }
                } catch (SecurityException e3) {
                    d0.f32389a.mo24135l().mo24255p().mo24209b("app instance id encryption failed", e3.getMessage());
                    bArr = new byte[0];
                    a9Var = d0.f32873b;
                }
            }
            a9Var.mo24112W().mo24487f0();
            return bArr;
        } else {
            d0.f32389a.mo24135l().mo24255p().mo24210c("Generating a payload for this event is not available. package_name, event_name", str4, vVar.f33101a);
            return null;
        }
    }
}
