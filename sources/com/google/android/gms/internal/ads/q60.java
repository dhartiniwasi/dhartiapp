package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.C0665o;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p053g4.C4391b;
import p053g4.C4409t;
import p060h4.C4470a;
import p060h4.C4596v;
import p066i4.C4661c0;
import p066i4.C4669i;
import p066i4.C4678r;
import p073j4.C4751b2;
import p073j4.C4794n1;
import p073j4.C4811t0;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class q60 implements e60 {

    /* renamed from: a */
    private final C4391b f16205a;

    /* renamed from: b */
    private final gv1 f16206b;

    /* renamed from: c */
    private final ux2 f16207c;

    /* renamed from: d */
    private final um0 f16208d;

    /* renamed from: e */
    private final ee0 f16209e;

    /* renamed from: f */
    private final o42 f16210f;

    /* renamed from: g */
    private C4661c0 f16211g = null;

    public q60(C4391b bVar, ee0 ee0, o42 o42, gv1 gv1, ux2 ux2) {
        this.f16205a = bVar;
        this.f16209e = ee0;
        this.f16210f = o42;
        this.f16206b = gv1;
        this.f16207c = ux2;
        this.f16208d = new um0((String) null);
    }

    /* renamed from: b */
    public static int m19075b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    /* renamed from: c */
    static Uri m19076c(Context context, C2955ve veVar, Uri uri, View view, Activity activity) {
        if (veVar == null) {
            return uri;
        }
        try {
            if (veVar.mo14739e(uri)) {
                return veVar.mo14735a(uri, context, view, activity);
            }
            return uri;
        } catch (C2992we unused) {
            return uri;
        } catch (Exception e) {
            C4409t.m29325q().mo15126t(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    /* renamed from: d */
    static Uri m19077d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            pm0.m18665e("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    /* renamed from: f */
    public static boolean m19078f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.net.Uri} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: type inference failed for: r11v17 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: type inference failed for: r11v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00df, code lost:
        if (r3 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19080h(p060h4.C4470a r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = 1
            r1.m19081i(r3)
            r4 = r0
            com.google.android.gms.internal.ads.vs0 r4 = (com.google.android.gms.internal.ads.vs0) r4
            android.content.Context r5 = r4.getContext()
            com.google.android.gms.internal.ads.ve r6 = r4.mo10015r()
            android.view.View r7 = r4.mo10647w()
            java.lang.String r8 = "activity"
            java.lang.Object r8 = r5.getSystemService(r8)
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8
            java.lang.String r9 = "u"
            java.lang.Object r9 = r2.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            r11 = 0
            if (r10 == 0) goto L_0x0032
            goto L_0x0133
        L_0x0032:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.net.Uri r9 = m19076c(r5, r6, r9, r7, r11)
            android.net.Uri r9 = m19077d(r9)
            java.lang.String r10 = "use_first_package"
            java.lang.Object r10 = r2.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.String r12 = "use_running_process"
            java.lang.Object r12 = r2.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = java.lang.Boolean.parseBoolean(r12)
            java.lang.String r13 = "use_custom_tabs"
            java.lang.Object r2 = r2.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 != 0) goto L_0x0078
            com.google.android.gms.internal.ads.ez r2 = com.google.android.gms.internal.ads.C2679nz.f14296F3
            com.google.android.gms.internal.ads.lz r14 = p060h4.C4596v.m30088c()
            java.lang.Object r2 = r14.mo12227b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            java.lang.String r2 = r9.getScheme()
            java.lang.String r14 = "http"
            boolean r2 = r14.equalsIgnoreCase(r2)
            java.lang.String r15 = "https"
            if (r2 == 0) goto L_0x0093
            android.net.Uri$Builder r2 = r9.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r15)
            android.net.Uri r11 = r2.build()
            goto L_0x00a9
        L_0x0093:
            java.lang.String r2 = r9.getScheme()
            boolean r2 = r15.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00a9
            android.net.Uri$Builder r2 = r9.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r14)
            android.net.Uri r11 = r2.build()
        L_0x00a9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Intent r9 = com.google.android.gms.internal.ads.p60.m18347a(r9, r5, r6, r7)
            android.content.Intent r11 = com.google.android.gms.internal.ads.p60.m18347a(r11, r5, r6, r7)
            if (r3 == 0) goto L_0x00c4
            p053g4.C4409t.m29326r()
            p073j4.C4751b2.m30592J(r5, r9)
            p053g4.C4409t.m29326r()
            p073j4.C4751b2.m30592J(r5, r11)
        L_0x00c4:
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.p60.m18350d(r9, r2, r5, r6, r7)
            if (r3 == 0) goto L_0x00cf
            android.content.Intent r11 = com.google.android.gms.internal.ads.p60.m18348b(r9, r3, r5, r6, r7)
            goto L_0x0133
        L_0x00cf:
            if (r11 == 0) goto L_0x00e1
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.p60.m18349c(r11, r5, r6, r7)
            if (r3 == 0) goto L_0x00e1
            android.content.Intent r11 = com.google.android.gms.internal.ads.p60.m18348b(r9, r3, r5, r6, r7)
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.p60.m18349c(r11, r5, r6, r7)
            if (r3 != 0) goto L_0x0133
        L_0x00e1:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00e8
            goto L_0x0132
        L_0x00e8:
            if (r12 == 0) goto L_0x0124
            if (r8 == 0) goto L_0x0124
            java.util.List r3 = r8.getRunningAppProcesses()
            if (r3 == 0) goto L_0x0124
            int r8 = r2.size()
            r11 = 0
        L_0x00f7:
            if (r11 >= r8) goto L_0x0124
            java.lang.Object r12 = r2.get(r11)
            android.content.pm.ResolveInfo r12 = (android.content.pm.ResolveInfo) r12
            java.util.Iterator r14 = r3.iterator()
        L_0x0103:
            int r15 = r11 + 1
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x0122
            java.lang.Object r15 = r14.next()
            android.app.ActivityManager$RunningAppProcessInfo r15 = (android.app.ActivityManager.RunningAppProcessInfo) r15
            java.lang.String r15 = r15.processName
            android.content.pm.ActivityInfo r13 = r12.activityInfo
            java.lang.String r13 = r13.packageName
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x0103
            android.content.Intent r11 = com.google.android.gms.internal.ads.p60.m18348b(r9, r12, r5, r6, r7)
            goto L_0x0133
        L_0x0122:
            r11 = r15
            goto L_0x00f7
        L_0x0124:
            if (r10 == 0) goto L_0x0132
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.Intent r11 = com.google.android.gms.internal.ads.p60.m18348b(r9, r2, r5, r6, r7)
            goto L_0x0133
        L_0x0132:
            r11 = r9
        L_0x0133:
            if (r20 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.o42 r2 = r1.f16210f
            if (r2 == 0) goto L_0x0151
            if (r11 == 0) goto L_0x0151
            android.content.Context r2 = r4.getContext()
            android.net.Uri r3 = r11.getData()
            java.lang.String r3 = r3.toString()
            r4 = r21
            boolean r2 = r1.m19082j(r0, r2, r3, r4)
            if (r2 != 0) goto L_0x0150
            goto L_0x0151
        L_0x0150:
            return
        L_0x0151:
            com.google.android.gms.internal.ads.bu0 r0 = (com.google.android.gms.internal.ads.bu0) r0     // Catch:{ ActivityNotFoundException -> 0x0160 }
            i4.i r2 = new i4.i     // Catch:{ ActivityNotFoundException -> 0x0160 }
            i4.c0 r3 = r1.f16211g     // Catch:{ ActivityNotFoundException -> 0x0160 }
            r2.<init>(r11, r3)     // Catch:{ ActivityNotFoundException -> 0x0160 }
            r3 = r22
            r0.mo8944s0(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x0160 }
            return
        L_0x0160:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.internal.ads.pm0.m18667g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q60.m19080h(h4.a, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    /* renamed from: i */
    private final void m19081i(boolean z) {
        ee0 ee0 = this.f16209e;
        if (ee0 != null) {
            ee0.mo9890h(z);
        }
    }

    /* renamed from: j */
    private final boolean m19082j(C4470a aVar, Context context, String str, String str2) {
        String str3 = str2;
        Context context2 = context;
        boolean v = C4409t.m29325q().mo15128v(context);
        C4409t.m29326r();
        C4811t0 T = C4751b2.m30602T(context);
        gv1 gv1 = this.f16206b;
        if (gv1 != null) {
            w42.m22575J6(context, gv1, this.f16207c, this.f16210f, str2, "offline_open");
        }
        vs0 vs0 = (vs0) aVar;
        boolean z = vs0.mo9698n().mo12442i() && vs0.mo8461X() == null;
        if (v) {
            this.f16210f.mo12828p(this.f16208d, str3);
            return false;
        }
        C4409t.m29326r();
        if (C0665o.m3094e(context).mo2965a() && T != null && !z) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14605k7)).booleanValue()) {
                if (vs0.mo9698n().mo12442i()) {
                    w42.m22577L6(vs0.mo8461X(), (C4678r) null, T, this.f16210f, this.f16206b, this.f16207c, str2, str);
                } else {
                    ((bu0) aVar).mo8942o0(T, this.f16210f, this.f16206b, this.f16207c, str2, str, 14);
                }
                gv1 gv12 = this.f16206b;
                if (gv12 != null) {
                    w42.m22575J6(context, gv12, this.f16207c, this.f16210f, str2, "dialog_impression");
                }
                aVar.onAdClicked();
                return true;
            }
        }
        this.f16210f.mo12821f(str3);
        if (this.f16206b != null) {
            HashMap hashMap = new HashMap();
            C4409t.m29326r();
            if (!C0665o.m3094e(context).mo2965a()) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (T == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14605k7)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            w42.m22576K6(context, this.f16206b, this.f16207c, this.f16210f, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m19083k(int i) {
        if (this.f16206b != null) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14685s7)).booleanValue()) {
                ux2 ux2 = this.f16207c;
                tx2 b = tx2.m21328b("cct_action");
                b.mo14409a("cct_open_status", k00.m15141a(i));
                ux2.mo8622a(b);
                return;
            }
            fv1 a = this.f16206b.mo10653a();
            a.mo10303b("action", "cct_action");
            a.mo10303b("cct_open_status", k00.m15141a(i));
            a.mo10308g();
        }
    }

    /* renamed from: e */
    public final void mo8220a(C4470a aVar, Map map) {
        String str;
        boolean z;
        Object obj;
        HashMap hashMap;
        C4470a aVar2 = aVar;
        Map map2 = map;
        vs0 vs0 = (vs0) aVar2;
        String c = uk0.m21685c((String) map2.get("u"), vs0.getContext(), true);
        String str2 = (String) map2.get("a");
        if (str2 == null) {
            pm0.m18667g("Action missing from an open GMSG.");
            return;
        }
        C4391b bVar = this.f16205a;
        if (bVar == null || bVar.mo17898c()) {
            is2 i0 = vs0.mo12114i0();
            ls2 P0 = vs0.mo12089P0();
            boolean z2 = false;
            if (i0 == null || P0 == null) {
                str = "";
                z = false;
            } else {
                z = i0.f10989k0;
                str = P0.f12930b;
            }
            boolean z3 = !((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14706u8)).booleanValue() || !map2.containsKey("sc") || !((String) map2.get("sc")).equals("0");
            if ("expand".equalsIgnoreCase(str2)) {
                if (vs0.mo12098X0()) {
                    pm0.m18667g("Cannot expand WebView that is already expanded.");
                    return;
                }
                m19081i(false);
                ((bu0) aVar2).mo8941n0(m19078f(map), m19075b(map), z3);
            } else if ("webapp".equalsIgnoreCase(str2)) {
                m19081i(false);
                if (c != null) {
                    ((bu0) aVar2).mo8945z(m19078f(map), m19075b(map), c, z3);
                } else {
                    ((bu0) aVar2).mo8943p0(m19078f(map), m19075b(map), (String) map2.get("html"), (String) map2.get("baseurl"), z3);
                }
            } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
                Context context = vs0.getContext();
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14316H3)).booleanValue()) {
                    if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14376N3)).booleanValue()) {
                        C4794n1.m30693k("User opt out chrome custom tab.");
                    } else {
                        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14356L3)).booleanValue()) {
                            z2 = true;
                        } else {
                            String str3 = (String) C4596v.m30088c().mo12227b(C2679nz.f14366M3);
                            if (!str3.isEmpty() && context != null) {
                                String packageName = context.getPackageName();
                                Iterator it = p83.m18400c(n73.m16968c(';')).mo13167d(str3).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((String) it.next()).equals(packageName)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                z2 = true;
                            }
                        }
                    }
                }
                boolean g = m00.m16334g(vs0.getContext());
                if (z2) {
                    if (!g) {
                        m19083k(4);
                    } else {
                        m19081i(true);
                        if (TextUtils.isEmpty(c)) {
                            pm0.m18667g("Cannot open browser with null or empty url");
                            m19083k(7);
                            return;
                        }
                        Uri d = m19077d(m19076c(vs0.getContext(), vs0.mo10015r(), Uri.parse(c), vs0.mo10647w(), vs0.mo8461X()));
                        if (!z || this.f16210f == null || !m19082j(aVar2, vs0.getContext(), d.toString(), str)) {
                            this.f16211g = new n60(this);
                            ((bu0) aVar2).mo8944s0(new C4669i((String) null, d.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (Intent) null, C4956b.m31385o3(this.f16211g).asBinder(), true), z3);
                            return;
                        }
                        return;
                    }
                }
                map2.put("use_first_package", "true");
                map2.put("use_running_process", "true");
                m19080h(aVar, map, z, str, z3);
            } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map2.get("system_browser"))) {
                m19080h(aVar, map, z, str, z3);
            } else if ("open_app".equalsIgnoreCase(str2)) {
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14525c7)).booleanValue()) {
                    m19081i(true);
                    String str4 = (String) map2.get("p");
                    if (str4 == null) {
                        pm0.m18667g("Package name missing from open app action.");
                    } else if (!z || this.f16210f == null || !m19082j(aVar2, vs0.getContext(), str4, str)) {
                        PackageManager packageManager = vs0.getContext().getPackageManager();
                        if (packageManager == null) {
                            pm0.m18667g("Cannot get package manager from open app action.");
                            return;
                        }
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                        if (launchIntentForPackage != null) {
                            ((bu0) aVar2).mo8944s0(new C4669i(launchIntentForPackage, this.f16211g), z3);
                        }
                    }
                }
            } else {
                m19081i(true);
                String str5 = (String) map2.get("intent_url");
                Intent intent = null;
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        intent = Intent.parseUri(str5, 0);
                    } catch (URISyntaxException e) {
                        pm0.m18665e("Error parsing the url: ".concat(String.valueOf(str5)), e);
                    }
                }
                Intent intent2 = intent;
                if (!(intent2 == null || intent2.getData() == null)) {
                    Uri data = intent2.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri d2 = m19077d(m19076c(vs0.getContext(), vs0.mo10015r(), data, vs0.mo10647w(), vs0.mo8461X()));
                        if (!TextUtils.isEmpty(intent2.getType())) {
                            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14535d7)).booleanValue()) {
                                intent2.setDataAndType(d2, intent2.getType());
                            }
                        }
                        intent2.setData(d2);
                    }
                }
                boolean z4 = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14645o7)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
                HashMap hashMap2 = new HashMap();
                if (z4) {
                    hashMap = hashMap2;
                    obj = "p";
                    o60 o60 = r1;
                    o60 o602 = new o60(this, z3, aVar, hashMap2, map);
                    this.f16211g = o60;
                    z3 = false;
                } else {
                    hashMap = hashMap2;
                    obj = "p";
                }
                if (intent2 == null) {
                    HashMap hashMap3 = hashMap;
                    if (!TextUtils.isEmpty(c)) {
                        c = m19077d(m19076c(vs0.getContext(), vs0.mo10015r(), Uri.parse(c), vs0.mo10647w(), vs0.mo8461X())).toString();
                    }
                    if (!z || this.f16210f == null || !m19082j(aVar2, vs0.getContext(), c, str)) {
                        ((bu0) aVar2).mo8944s0(new C4669i((String) map2.get("i"), c, (String) map2.get("m"), (String) map2.get(obj), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.f16211g), z3);
                    } else if (z4) {
                        hashMap3.put((String) map2.get("event_id"), Boolean.TRUE);
                        ((q80) aVar2).mo9081R("openIntentAsync", hashMap3);
                    }
                } else if (!z || this.f16210f == null || !m19082j(aVar2, vs0.getContext(), intent2.getData().toString(), str)) {
                    ((bu0) aVar2).mo8944s0(new C4669i(intent2, this.f16211g), z3);
                } else if (z4) {
                    HashMap hashMap4 = hashMap;
                    hashMap4.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((q80) aVar2).mo9081R("openIntentAsync", hashMap4);
                }
            }
        } else {
            this.f16205a.mo17897b(c);
        }
    }
}
