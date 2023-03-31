package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Collections;
import java.util.List;
import p060h4.C4504f3;
import p060h4.C4527j2;
import p088l5.C4954a;
import p088l5.C4956b;
import p124r.C5426g;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xl1 {

    /* renamed from: a */
    private int f20171a;

    /* renamed from: b */
    private C4527j2 f20172b;

    /* renamed from: c */
    private j20 f20173c;

    /* renamed from: d */
    private View f20174d;

    /* renamed from: e */
    private List f20175e;

    /* renamed from: f */
    private List f20176f = Collections.emptyList();

    /* renamed from: g */
    private C4504f3 f20177g;

    /* renamed from: h */
    private Bundle f20178h;

    /* renamed from: i */
    private vs0 f20179i;

    /* renamed from: j */
    private vs0 f20180j;

    /* renamed from: k */
    private vs0 f20181k;

    /* renamed from: l */
    private C4954a f20182l;

    /* renamed from: m */
    private View f20183m;

    /* renamed from: n */
    private View f20184n;

    /* renamed from: o */
    private C4954a f20185o;

    /* renamed from: p */
    private double f20186p;

    /* renamed from: q */
    private r20 f20187q;

    /* renamed from: r */
    private r20 f20188r;

    /* renamed from: s */
    private String f20189s;

    /* renamed from: t */
    private final C5426g f20190t = new C5426g();

    /* renamed from: u */
    private final C5426g f20191u = new C5426g();

    /* renamed from: v */
    private float f20192v;

    /* renamed from: w */
    private String f20193w;

    /* renamed from: C */
    public static xl1 m23306C(bc0 bc0) {
        try {
            wl1 G = m23310G(bc0.mo8737i5(), (fc0) null);
            j20 T5 = bc0.mo8727T5();
            String Y = bc0.mo8729Y();
            List J6 = bc0.mo8720J6();
            String c0 = bc0.mo8734c0();
            Bundle T = bc0.mo8726T();
            String a0 = bc0.mo8732a0();
            C4954a Z = bc0.mo8730Z();
            String h = bc0.mo8736h();
            String b0 = bc0.mo8733b0();
            double a = bc0.mo8731a();
            r20 r6 = bc0.mo8738r6();
            xl1 xl1 = new xl1();
            xl1.f20171a = 2;
            xl1.f20172b = G;
            xl1.f20173c = T5;
            xl1.f20174d = (View) m23312I(bc0.mo8718H6());
            xl1.mo15175u("headline", Y);
            xl1.f20175e = J6;
            xl1.mo15175u("body", c0);
            xl1.f20178h = T;
            xl1.mo15175u("call_to_action", a0);
            xl1.f20183m = (View) m23312I(bc0.mo8719I6());
            xl1.f20185o = Z;
            xl1.mo15175u("store", h);
            xl1.mo15175u(InAppPurchaseMetaData.KEY_PRICE, b0);
            xl1.f20186p = a;
            xl1.f20187q = r6;
            return xl1;
        } catch (RemoteException e) {
            pm0.m18668h("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    /* renamed from: D */
    public static xl1 m23307D(cc0 cc0) {
        try {
            wl1 G = m23310G(cc0.mo9125i5(), (fc0) null);
            j20 T5 = cc0.mo9117T5();
            String Y = cc0.mo9119Y();
            List J6 = cc0.mo9110J6();
            String c0 = cc0.mo9123c0();
            Bundle a = cc0.mo9121a();
            String a0 = cc0.mo9122a0();
            C4954a I6 = cc0.mo9109I6();
            String Z = cc0.mo9120Z();
            r20 r6 = cc0.mo9126r6();
            xl1 xl1 = new xl1();
            xl1.f20171a = 1;
            xl1.f20172b = G;
            xl1.f20173c = T5;
            xl1.f20174d = (View) m23312I(cc0.mo9118V());
            xl1.mo15175u("headline", Y);
            xl1.f20175e = J6;
            xl1.mo15175u("body", c0);
            xl1.f20178h = a;
            xl1.mo15175u("call_to_action", a0);
            xl1.f20183m = (View) m23312I(cc0.mo9108H6());
            xl1.f20185o = I6;
            xl1.mo15175u("advertiser", Z);
            xl1.f20188r = r6;
            return xl1;
        } catch (RemoteException e) {
            pm0.m18668h("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    /* renamed from: E */
    public static xl1 m23308E(bc0 bc0) {
        try {
            return m23311H(m23310G(bc0.mo8737i5(), (fc0) null), bc0.mo8727T5(), (View) m23312I(bc0.mo8718H6()), bc0.mo8729Y(), bc0.mo8720J6(), bc0.mo8734c0(), bc0.mo8726T(), bc0.mo8732a0(), (View) m23312I(bc0.mo8719I6()), bc0.mo8730Z(), bc0.mo8736h(), bc0.mo8733b0(), bc0.mo8731a(), bc0.mo8738r6(), (String) null, 0.0f);
        } catch (RemoteException e) {
            pm0.m18668h("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    /* renamed from: F */
    public static xl1 m23309F(cc0 cc0) {
        try {
            return m23311H(m23310G(cc0.mo9125i5(), (fc0) null), cc0.mo9117T5(), (View) m23312I(cc0.mo9118V()), cc0.mo9119Y(), cc0.mo9110J6(), cc0.mo9123c0(), cc0.mo9121a(), cc0.mo9122a0(), (View) m23312I(cc0.mo9108H6()), cc0.mo9109I6(), (String) null, (String) null, -1.0d, cc0.mo9126r6(), cc0.mo9120Z(), 0.0f);
        } catch (RemoteException e) {
            pm0.m18668h("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    /* renamed from: G */
    private static wl1 m23310G(C4527j2 j2Var, fc0 fc0) {
        if (j2Var == null) {
            return null;
        }
        return new wl1(j2Var, fc0);
    }

    /* renamed from: H */
    private static xl1 m23311H(C4527j2 j2Var, j20 j20, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, C4954a aVar, String str4, String str5, double d, r20 r20, String str6, float f) {
        xl1 xl1 = new xl1();
        xl1.f20171a = 6;
        xl1.f20172b = j2Var;
        xl1.f20173c = j20;
        xl1.f20174d = view;
        String str7 = str;
        xl1.mo15175u("headline", str);
        xl1.f20175e = list;
        String str8 = str2;
        xl1.mo15175u("body", str2);
        xl1.f20178h = bundle;
        String str9 = str3;
        xl1.mo15175u("call_to_action", str3);
        xl1.f20183m = view2;
        xl1.f20185o = aVar;
        String str10 = str4;
        xl1.mo15175u("store", str4);
        String str11 = str5;
        xl1.mo15175u(InAppPurchaseMetaData.KEY_PRICE, str5);
        xl1.f20186p = d;
        xl1.f20187q = r20;
        xl1.mo15175u("advertiser", str6);
        xl1.mo15170p(f);
        return xl1;
    }

    /* renamed from: I */
    private static Object m23312I(C4954a aVar) {
        if (aVar == null) {
            return null;
        }
        return C4956b.m31384P0(aVar);
    }

    /* renamed from: a0 */
    public static xl1 m23313a0(fc0 fc0) {
        try {
            return m23311H(m23310G(fc0.mo9516W(), fc0), fc0.mo9517X(), (View) m23312I(fc0.mo9524c0()), fc0.mo9525d0(), fc0.mo9528g0(), fc0.mo9529h(), fc0.mo9515V(), fc0.mo9526e0(), (View) m23312I(fc0.mo9521a0()), fc0.mo9518Y(), fc0.mo9531j(), fc0.mo9527g(), fc0.mo9520a(), fc0.mo9519Z(), fc0.mo9522b0(), fc0.mo9511T());
        } catch (RemoteException e) {
            pm0.m18668h("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    /* renamed from: A */
    public final synchronized double mo15129A() {
        return this.f20186p;
    }

    /* renamed from: B */
    public final synchronized void mo15130B(C4954a aVar) {
        this.f20182l = aVar;
    }

    /* renamed from: J */
    public final synchronized float mo15131J() {
        return this.f20192v;
    }

    /* renamed from: K */
    public final synchronized int mo15132K() {
        return this.f20171a;
    }

    /* renamed from: L */
    public final synchronized Bundle mo15133L() {
        if (this.f20178h == null) {
            this.f20178h = new Bundle();
        }
        return this.f20178h;
    }

    /* renamed from: M */
    public final synchronized View mo15134M() {
        return this.f20174d;
    }

    /* renamed from: N */
    public final synchronized View mo15135N() {
        return this.f20183m;
    }

    /* renamed from: O */
    public final synchronized View mo15136O() {
        return this.f20184n;
    }

    /* renamed from: P */
    public final synchronized C5426g mo15137P() {
        return this.f20190t;
    }

    /* renamed from: Q */
    public final synchronized C5426g mo15138Q() {
        return this.f20191u;
    }

    /* renamed from: R */
    public final synchronized C4527j2 mo15139R() {
        return this.f20172b;
    }

    /* renamed from: S */
    public final synchronized C4504f3 mo15140S() {
        return this.f20177g;
    }

    /* renamed from: T */
    public final synchronized j20 mo15141T() {
        return this.f20173c;
    }

    /* renamed from: U */
    public final r20 mo15142U() {
        List list = this.f20175e;
        if (list != null && !list.isEmpty()) {
            Object obj = this.f20175e.get(0);
            if (obj instanceof IBinder) {
                return q20.m19033I6((IBinder) obj);
            }
        }
        return null;
    }

    /* renamed from: V */
    public final synchronized r20 mo15143V() {
        return this.f20187q;
    }

    /* renamed from: W */
    public final synchronized r20 mo15144W() {
        return this.f20188r;
    }

    /* renamed from: X */
    public final synchronized vs0 mo15145X() {
        return this.f20180j;
    }

    /* renamed from: Y */
    public final synchronized vs0 mo15146Y() {
        return this.f20181k;
    }

    /* renamed from: Z */
    public final synchronized vs0 mo15147Z() {
        return this.f20179i;
    }

    /* renamed from: a */
    public final synchronized String mo15148a() {
        return this.f20193w;
    }

    /* renamed from: b */
    public final synchronized String mo15149b() {
        return mo15153d(InAppPurchaseMetaData.KEY_PRICE);
    }

    /* renamed from: b0 */
    public final synchronized C4954a mo15150b0() {
        return this.f20185o;
    }

    /* renamed from: c */
    public final synchronized String mo15151c() {
        return mo15153d("store");
    }

    /* renamed from: c0 */
    public final synchronized C4954a mo15152c0() {
        return this.f20182l;
    }

    /* renamed from: d */
    public final synchronized String mo15153d(String str) {
        return (String) this.f20191u.get(str);
    }

    /* renamed from: d0 */
    public final synchronized String mo15154d0() {
        return mo15153d("advertiser");
    }

    /* renamed from: e */
    public final synchronized List mo15155e() {
        return this.f20175e;
    }

    /* renamed from: e0 */
    public final synchronized String mo15156e0() {
        return mo15153d("body");
    }

    /* renamed from: f */
    public final synchronized List mo15157f() {
        return this.f20176f;
    }

    /* renamed from: f0 */
    public final synchronized String mo15158f0() {
        return mo15153d("call_to_action");
    }

    /* renamed from: g */
    public final synchronized void mo15159g() {
        vs0 vs0 = this.f20179i;
        if (vs0 != null) {
            vs0.destroy();
            this.f20179i = null;
        }
        vs0 vs02 = this.f20180j;
        if (vs02 != null) {
            vs02.destroy();
            this.f20180j = null;
        }
        vs0 vs03 = this.f20181k;
        if (vs03 != null) {
            vs03.destroy();
            this.f20181k = null;
        }
        this.f20182l = null;
        this.f20190t.clear();
        this.f20191u.clear();
        this.f20172b = null;
        this.f20173c = null;
        this.f20174d = null;
        this.f20175e = null;
        this.f20178h = null;
        this.f20183m = null;
        this.f20184n = null;
        this.f20185o = null;
        this.f20187q = null;
        this.f20188r = null;
        this.f20189s = null;
    }

    /* renamed from: g0 */
    public final synchronized String mo15160g0() {
        return this.f20189s;
    }

    /* renamed from: h */
    public final synchronized void mo15161h(j20 j20) {
        this.f20173c = j20;
    }

    /* renamed from: h0 */
    public final synchronized String mo15162h0() {
        return mo15153d("headline");
    }

    /* renamed from: i */
    public final synchronized void mo15163i(String str) {
        this.f20189s = str;
    }

    /* renamed from: j */
    public final synchronized void mo15164j(C4504f3 f3Var) {
        this.f20177g = f3Var;
    }

    /* renamed from: k */
    public final synchronized void mo15165k(r20 r20) {
        this.f20187q = r20;
    }

    /* renamed from: l */
    public final synchronized void mo15166l(String str, d20 d20) {
        if (d20 == null) {
            this.f20190t.remove(str);
        } else {
            this.f20190t.put(str, d20);
        }
    }

    /* renamed from: m */
    public final synchronized void mo15167m(vs0 vs0) {
        this.f20180j = vs0;
    }

    /* renamed from: n */
    public final synchronized void mo15168n(List list) {
        this.f20175e = list;
    }

    /* renamed from: o */
    public final synchronized void mo15169o(r20 r20) {
        this.f20188r = r20;
    }

    /* renamed from: p */
    public final synchronized void mo15170p(float f) {
        this.f20192v = f;
    }

    /* renamed from: q */
    public final synchronized void mo15171q(List list) {
        this.f20176f = list;
    }

    /* renamed from: r */
    public final synchronized void mo15172r(vs0 vs0) {
        this.f20181k = vs0;
    }

    /* renamed from: s */
    public final synchronized void mo15173s(String str) {
        this.f20193w = str;
    }

    /* renamed from: t */
    public final synchronized void mo15174t(double d) {
        this.f20186p = d;
    }

    /* renamed from: u */
    public final synchronized void mo15175u(String str, String str2) {
        if (str2 == null) {
            this.f20191u.remove(str);
        } else {
            this.f20191u.put(str, str2);
        }
    }

    /* renamed from: v */
    public final synchronized void mo15176v(int i) {
        this.f20171a = i;
    }

    /* renamed from: w */
    public final synchronized void mo15177w(C4527j2 j2Var) {
        this.f20172b = j2Var;
    }

    /* renamed from: x */
    public final synchronized void mo15178x(View view) {
        this.f20183m = view;
    }

    /* renamed from: y */
    public final synchronized void mo15179y(vs0 vs0) {
        this.f20179i = vs0;
    }

    /* renamed from: z */
    public final synchronized void mo15180z(View view) {
        this.f20184n = view;
    }
}
