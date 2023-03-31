package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4491d2;
import p060h4.C4562p1;
import p060h4.C4580s1;
import p060h4.C4596v;
import p073j4.C4751b2;
import p088l5.C4954a;
import p088l5.C4956b;
import p124r.C5413a;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sl1 extends v51 {

    /* renamed from: G */
    public static final ua3 f17523G = ua3.m21501B("3010", "3008", "1005", "1009", "2011", "2007");

    /* renamed from: A */
    private final Context f17524A;

    /* renamed from: B */
    private final ul1 f17525B;

    /* renamed from: C */
    private final qc2 f17526C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Map f17527D = new HashMap();

    /* renamed from: E */
    private final List f17528E = new ArrayList();

    /* renamed from: F */
    private final C2968vr f17529F;

    /* renamed from: i */
    private final Executor f17530i;

    /* renamed from: j */
    private final xl1 f17531j;

    /* renamed from: k */
    private final fm1 f17532k;

    /* renamed from: l */
    private final ym1 f17533l;

    /* renamed from: m */
    private final cm1 f17534m;

    /* renamed from: n */
    private final jm1 f17535n;

    /* renamed from: o */
    private final v34 f17536o;

    /* renamed from: p */
    private final v34 f17537p;

    /* renamed from: q */
    private final v34 f17538q;

    /* renamed from: r */
    private final v34 f17539r;

    /* renamed from: s */
    private final v34 f17540s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public un1 f17541t;

    /* renamed from: u */
    private boolean f17542u;

    /* renamed from: v */
    private boolean f17543v;

    /* renamed from: w */
    private boolean f17544w;

    /* renamed from: x */
    private final ak0 f17545x;

    /* renamed from: y */
    private final C2955ve f17546y;

    /* renamed from: z */
    private final vm0 f17547z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sl1(u51 u51, Executor executor, xl1 xl1, fm1 fm1, ym1 ym1, cm1 cm1, jm1 jm1, v34 v34, v34 v342, v34 v343, v34 v344, v34 v345, ak0 ak0, C2955ve veVar, vm0 vm0, Context context, ul1 ul1, qc2 qc2, C2968vr vrVar) {
        super(u51);
        this.f17530i = executor;
        this.f17531j = xl1;
        this.f17532k = fm1;
        this.f17533l = ym1;
        this.f17534m = cm1;
        this.f17535n = jm1;
        this.f17536o = v34;
        this.f17537p = v342;
        this.f17538q = v343;
        this.f17539r = v344;
        this.f17540s = v345;
        this.f17545x = ak0;
        this.f17546y = veVar;
        this.f17547z = vm0;
        this.f17524A = context;
        this.f17525B = ul1;
        this.f17526C = qc2;
        this.f17529F = vrVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final synchronized void mo14054O(un1 un1) {
        View view;
        C2807re c;
        if (!this.f17542u) {
            this.f17541t = un1;
            this.f17533l.mo15460e(un1);
            this.f17532k.mo10202i(un1.mo14086T(), un1.mo14095c0(), un1.mo14093a0(), un1, un1);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14570h2)).booleanValue() && (c = this.f17546y.mo14737c()) != null) {
                c.mo12590a(un1.mo14086T());
            }
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14739y1)).booleanValue()) {
                is2 is2 = this.f18930b;
                if (is2.f10993m0) {
                    Iterator<String> keys = is2.f10991l0.keys();
                    if (keys != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            WeakReference weakReference = (WeakReference) this.f17541t.mo14092Z().get(next);
                            this.f17527D.put(next, Boolean.FALSE);
                            if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                                C2931ur urVar = new C2931ur(this.f17524A, view);
                                this.f17528E.add(urVar);
                                urVar.mo14576c(new rl1(this, next));
                            }
                        }
                    }
                }
            }
            if (un1.mo14088V() != null) {
                un1.mo14088V().mo14576c(this.f17545x);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void mo14055P(un1 un1) {
        this.f17532k.mo10209o(un1.mo14086T(), un1.mo14092Z());
        if (un1.mo14087U() != null) {
            un1.mo14087U().setClickable(false);
            un1.mo14087U().removeAllViews();
        }
        if (un1.mo14088V() != null) {
            un1.mo14088V().mo14578e(this.f17545x);
        }
        this.f17541t = null;
    }

    /* renamed from: I */
    public static /* synthetic */ void m20447I(sl1 sl1) {
        try {
            xl1 xl1 = sl1.f17531j;
            int K = xl1.mo15132K();
            if (K != 1) {
                if (K != 2) {
                    if (K != 3) {
                        if (K != 6) {
                            if (K != 7) {
                                pm0.m18664d("Wrong native template id!");
                                return;
                            }
                            jm1 jm1 = sl1.f17535n;
                            if (jm1.mo11445g() != null) {
                                jm1.mo11445g().mo12289p1((i80) sl1.f17539r.mo8155d());
                            }
                        } else if (sl1.f17535n.mo11444f() != null) {
                            sl1.mo14051L("Google", true);
                            sl1.f17535n.mo11444f().mo9015P2((n40) sl1.f17538q.mo8155d());
                        }
                    } else if (sl1.f17535n.mo11442d(xl1.mo15160g0()) != null) {
                        if (sl1.f17531j.mo15147Z() != null) {
                            sl1.mo14051L("Google", true);
                        }
                        sl1.f17535n.mo11442d(sl1.f17531j.mo15160g0()).mo14449B5((j30) sl1.f17540s.mo8155d());
                    }
                } else if (sl1.f17535n.mo11439a() != null) {
                    sl1.mo14051L("Google", true);
                    sl1.f17535n.mo11439a().mo12267x3((e30) sl1.f17537p.mo8155d());
                }
            } else if (sl1.f17535n.mo11440b() != null) {
                sl1.mo14051L("Google", true);
                sl1.f17535n.mo11440b().mo13124N1((g30) sl1.f17536o.mo8155d());
            }
        } catch (RemoteException e) {
            pm0.m18665e("RemoteException when notifyAdLoad is called", e);
        }
    }

    /* renamed from: w */
    public static boolean m20448w(View view) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14646o8)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
        }
        C4409t.m29326r();
        long Q = C4751b2.m30599Q(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null)) {
            if (Q >= ((long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14656p8)).intValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    private final synchronized View m20449y(Map map) {
        if (map == null) {
            return null;
        }
        ua3 ua3 = f17523G;
        int size = ua3.size();
        int i = 0;
        while (i < size) {
            WeakReference weakReference = (WeakReference) map.get((String) ua3.get(i));
            i++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    /* renamed from: z */
    private final synchronized void m20450z(View view, Map map, Map map2) {
        this.f17533l.mo15459d(this.f17541t);
        this.f17532k.mo10207m(view, map, map2);
        this.f17543v = true;
    }

    /* renamed from: C */
    public final ul1 mo14045C() {
        return this.f17525B;
    }

    /* renamed from: E */
    public final String mo14046E() {
        return this.f17534m.mo8871b();
    }

    /* renamed from: G */
    public final synchronized JSONObject mo14047G(View view, Map map, Map map2) {
        return this.f17532k.mo10195b(view, map, map2);
    }

    /* renamed from: H */
    public final synchronized JSONObject mo14048H(View view, Map map, Map map2) {
        return this.f17532k.mo10212r(view, map, map2);
    }

    /* renamed from: J */
    public final void mo14049J(View view) {
        C4954a c0 = this.f17531j.mo15152c0();
        if (this.f17534m.mo8873d() && c0 != null && view != null) {
            C4409t.m29309a();
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14562g4)).booleanValue() && uz2.m21913b()) {
                Object P0 = C4956b.m31384P0(c0);
                if (P0 instanceof wz2) {
                    ((wz2) P0).mo8157b(view, c03.NOT_VISIBLE, "Ad overlay");
                }
            }
        }
    }

    /* renamed from: K */
    public final synchronized void mo14050K() {
        this.f17532k.mo10196c();
    }

    /* renamed from: L */
    public final void mo14051L(String str, boolean z) {
        String str2;
        b52 b52;
        c52 c52;
        if (this.f17534m.mo8873d() && !TextUtils.isEmpty(str)) {
            xl1 xl1 = this.f17531j;
            vs0 Y = xl1.mo15146Y();
            vs0 Z = xl1.mo15147Z();
            if (Y == null && Z == null) {
                pm0.m18667g("Omid display and video webview are null. Skipping initialization.");
                return;
            }
            boolean z2 = false;
            boolean z3 = Y != null;
            boolean z4 = Z != null;
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14602k4)).booleanValue()) {
                this.f17534m.mo8870a();
                int b = this.f17534m.mo8870a().mo10947b();
                int i = b - 1;
                if (i != 0) {
                    if (i != 1) {
                        pm0.m18667g("Unknown omid media type: " + (b != 1 ? b != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                        return;
                    } else if (Y != null) {
                        z2 = true;
                        z4 = false;
                    } else {
                        pm0.m18667g("Omid media type was display but there was no display webview.");
                        return;
                    }
                } else if (Z != null) {
                    z4 = true;
                } else {
                    pm0.m18667g("Omid media type was video but there was no video webview.");
                    return;
                }
            } else {
                z2 = z3;
            }
            if (z2) {
                str2 = null;
            } else {
                str2 = "javascript";
                Y = Z;
            }
            String str3 = str2;
            Y.mo12086A();
            if (!C4409t.m29309a().mo15330d(this.f17524A)) {
                pm0.m18667g("Failed to initialize omid in InternalNativeAd");
                return;
            }
            vm0 vm0 = this.f17547z;
            String str4 = vm0.f19151b + "." + vm0.f19152c;
            if (z4) {
                b52 = b52.VIDEO;
                c52 = c52.DEFINED_BY_JAVASCRIPT;
            } else {
                b52 = b52.NATIVE_DISPLAY;
                if (this.f17531j.mo15132K() == 3) {
                    c52 = c52.UNSPECIFIED;
                } else {
                    c52 = c52.ONE_PIXEL;
                }
            }
            C4954a a = C4409t.m29309a().mo15327a(str4, Y.mo12086A(), "", "javascript", str3, str, c52, b52, this.f18930b.f10995n0);
            if (a == null) {
                pm0.m18667g("Failed to create omid session in InternalNativeAd");
                return;
            }
            this.f17531j.mo15130B(a);
            Y.mo12116j1(a);
            if (z4) {
                C4409t.m29309a().mo15328b(a, Z.mo10647w());
                this.f17544w = true;
            }
            if (z) {
                C4409t.m29309a().mo15326D(a);
                Y.mo9081R("onSdkLoaded", new C5413a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final /* synthetic */ void mo14052M() {
        this.f17532k.mo10192U();
        this.f17531j.mo15159g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final /* synthetic */ void mo14053N(boolean z) {
        this.f17532k.mo10211q(this.f17541t.mo14086T(), this.f17541t.mo14092Z(), this.f17541t.mo14095c0(), z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ec, code lost:
        return;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo14056Q(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f17543v     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14739y1     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.is2 r0 = r3.f18930b     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.f10993m0     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0045
            java.util.Map r0 = r3.f17527D     // Catch:{ all -> 0x00f2 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x00f2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f2 }
        L_0x0029:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00f2 }
            java.util.Map r2 = r3.f17527D     // Catch:{ all -> 0x00f2 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00f2 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r1 != 0) goto L_0x0029
            monitor-exit(r3)
            return
        L_0x0045:
            if (r7 != 0) goto L_0x008a
            com.google.android.gms.internal.ads.ez r7 = com.google.android.gms.internal.ads.C2679nz.f14491Z2     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.lz r0 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r7 = r0.mo12227b(r7)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00f2 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x0088
            if (r5 == 0) goto L_0x0088
            java.util.Set r7 = r5.entrySet()     // Catch:{ all -> 0x00f2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00f2 }
        L_0x0063:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00f2 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00f2 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00f2 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0063
            boolean r0 = m20448w(r0)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0063
            r3.m20450z(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x0088:
            monitor-exit(r3)
            return
        L_0x008a:
            android.view.View r7 = r3.m20449y(r5)     // Catch:{ all -> 0x00f2 }
            if (r7 != 0) goto L_0x0095
            r3.m20450z(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x0095:
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14501a3     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00b4
            boolean r7 = m20448w(r7)     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x00b2
            r3.m20450z(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00b2:
            monitor-exit(r3)
            return
        L_0x00b4:
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14511b3     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00ed
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ all -> 0x00f2 }
            r0.<init>()     // Catch:{ all -> 0x00f2 }
            r1 = 0
            boolean r1 = r7.getGlobalVisibleRect(r0, r1)     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x00eb
            int r1 = r7.getHeight()     // Catch:{ all -> 0x00f2 }
            int r2 = r0.height()     // Catch:{ all -> 0x00f2 }
            if (r1 != r2) goto L_0x00eb
            int r7 = r7.getWidth()     // Catch:{ all -> 0x00f2 }
            int r0 = r0.width()     // Catch:{ all -> 0x00f2 }
            if (r7 != r0) goto L_0x00eb
            r3.m20450z(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00eb:
            monitor-exit(r3)
            return
        L_0x00ed:
            r3.m20450z(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00f2:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sl1.mo14056Q(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* renamed from: R */
    public final synchronized void mo14057R(C4580s1 s1Var) {
        this.f17532k.mo10210p(s1Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return;
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo14058S(android.view.View r9, android.view.View r10, java.util.Map r11, java.util.Map r12, boolean r13) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.gms.internal.ads.ym1 r0 = r8.f17533l     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.un1 r1 = r8.f17541t     // Catch:{ all -> 0x0031 }
            r0.mo15458c(r1)     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.fm1 r2 = r8.f17532k     // Catch:{ all -> 0x0031 }
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.mo10199f(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0031 }
            boolean r9 = r8.f17544w     // Catch:{ all -> 0x0031 }
            if (r9 == 0) goto L_0x002f
            com.google.android.gms.internal.ads.xl1 r9 = r8.f17531j     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.vs0 r10 = r9.mo15147Z()     // Catch:{ all -> 0x0031 }
            if (r10 != 0) goto L_0x001f
            goto L_0x002f
        L_0x001f:
            com.google.android.gms.internal.ads.vs0 r9 = r9.mo15147Z()     // Catch:{ all -> 0x0031 }
            r.a r10 = new r.a     // Catch:{ all -> 0x0031 }
            r10.<init>()     // Catch:{ all -> 0x0031 }
            java.lang.String r11 = "onSdkAdUserInteractionClick"
            r9.mo9081R(r11, r10)     // Catch:{ all -> 0x0031 }
            monitor-exit(r8)
            return
        L_0x002f:
            monitor-exit(r8)
            return
        L_0x0031:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sl1.mo14058S(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* renamed from: T */
    public final synchronized void mo14059T(String str) {
        this.f17532k.mo10198e(str);
    }

    /* renamed from: U */
    public final synchronized void mo14060U(Bundle bundle) {
        this.f17532k.mo10206l(bundle);
    }

    /* renamed from: a */
    public final synchronized void mo11305a() {
        this.f17542u = true;
        this.f17530i.execute(new ql1(this));
        super.mo11305a();
    }

    /* renamed from: b */
    public final void mo8205b() {
        this.f17530i.execute(new ml1(this));
        if (this.f17531j.mo15132K() != 7) {
            Executor executor = this.f17530i;
            fm1 fm1 = this.f17532k;
            fm1.getClass();
            executor.execute(new nl1(fm1));
        }
        super.mo8205b();
    }

    /* renamed from: h */
    public final synchronized void mo14061h() {
        un1 un1 = this.f17541t;
        if (un1 == null) {
            pm0.m18662b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.f17530i.execute(new ol1(this, un1 instanceof sm1));
        }
    }

    /* renamed from: i */
    public final synchronized void mo14062i() {
        if (!this.f17543v) {
            this.f17532k.mo10201h();
        }
    }

    /* renamed from: j */
    public final void mo14063j(View view) {
        xl1 xl1 = this.f17531j;
        C4954a c0 = xl1.mo15152c0();
        vs0 Y = xl1.mo15146Y();
        if (this.f17534m.mo8873d() && c0 != null && Y != null && view != null) {
            C4409t.m29309a().mo15328b(c0, view);
        }
    }

    /* renamed from: k */
    public final synchronized void mo14064k(View view, MotionEvent motionEvent, View view2) {
        this.f17532k.mo10197d(view, motionEvent, view2);
    }

    /* renamed from: l */
    public final synchronized void mo14065l(Bundle bundle) {
        this.f17532k.mo10213z0(bundle);
    }

    /* renamed from: m */
    public final synchronized void mo14066m(View view) {
        this.f17532k.mo10200g(view);
    }

    /* renamed from: n */
    public final synchronized void mo14067n() {
        this.f17532k.mo10203j();
    }

    /* renamed from: o */
    public final synchronized void mo14068o(C4562p1 p1Var) {
        this.f17532k.mo10208n(p1Var);
    }

    /* renamed from: p */
    public final synchronized void mo14069p(C4491d2 d2Var) {
        this.f17526C.mo13527a(d2Var);
    }

    /* renamed from: q */
    public final synchronized void mo14070q(j40 j40) {
        this.f17532k.mo10194a(j40);
    }

    /* renamed from: r */
    public final synchronized void mo14071r(un1 un1) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14719w1)).booleanValue()) {
            C4751b2.f25403i.post(new pl1(this, un1));
        } else {
            mo14054O(un1);
        }
    }

    /* renamed from: s */
    public final synchronized void mo14072s(un1 un1) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14719w1)).booleanValue()) {
            C4751b2.f25403i.post(new ll1(this, un1));
        } else {
            mo14055P(un1);
        }
    }

    /* renamed from: t */
    public final boolean mo14073t() {
        return this.f17534m.mo8874e();
    }

    /* renamed from: u */
    public final synchronized boolean mo14074u() {
        return this.f17532k.mo10204j0();
    }

    /* renamed from: v */
    public final boolean mo14075v() {
        return this.f17534m.mo8873d();
    }

    /* renamed from: x */
    public final synchronized boolean mo14076x(Bundle bundle) {
        if (this.f17543v) {
            return true;
        }
        boolean k = this.f17532k.mo10205k(bundle);
        this.f17543v = k;
        return k;
    }
}
