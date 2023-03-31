package p264io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.r0 */
/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class C11020r0 {
    /* renamed from: A */
    public static /* synthetic */ void m54648A(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    uVar.mo34747j(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("requireArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: B */
    public static /* synthetic */ void m54649B(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    uVar.mo34748k(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("supportArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: C */
    public static /* synthetic */ void m54650C(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    uVar.mo34744g(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("overviewArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: D */
    public static void m54651D(C6539c cVar, C10940k.C10972u uVar) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.create", m54666o());
        if (uVar != null) {
            aVar.mo22129e(new C10930i0(uVar));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar2 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.dispose", m54666o());
        if (uVar != null) {
            aVar2.mo22129e(new C11000o0(uVar));
        } else {
            aVar2.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar3 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setDomStorageEnabled", m54666o());
        if (uVar != null) {
            aVar3.mo22129e(new C10918g0(uVar));
        } else {
            aVar3.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar4 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically", m54666o());
        if (uVar != null) {
            aVar4.mo22129e(new C10989m0(uVar));
        } else {
            aVar4.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar5 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setSupportMultipleWindows", m54666o());
        if (uVar != null) {
            aVar5.mo22129e(new C11011q0(uVar));
        } else {
            aVar5.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar6 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setJavaScriptEnabled", m54666o());
        if (uVar != null) {
            aVar6.mo22129e(new C10907e0(uVar));
        } else {
            aVar6.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar7 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setUserAgentString", m54666o());
        if (uVar != null) {
            aVar7.mo22129e(new C10979k0(uVar));
        } else {
            aVar7.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar8 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setMediaPlaybackRequiresUserGesture", m54666o());
        if (uVar != null) {
            aVar8.mo22129e(new C10984l0(uVar));
        } else {
            aVar8.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar9 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setSupportZoom", m54666o());
        if (uVar != null) {
            aVar9.mo22129e(new C10900d0(uVar));
        } else {
            aVar9.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar10 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setLoadWithOverviewMode", m54666o());
        if (uVar != null) {
            aVar10.mo22129e(new C10936j0(uVar));
        } else {
            aVar10.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar11 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setUseWideViewPort", m54666o());
        if (uVar != null) {
            aVar11.mo22129e(new C10925h0(uVar));
        } else {
            aVar11.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar12 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setDisplayZoomControls", m54666o());
        if (uVar != null) {
            aVar12.mo22129e(new C11006p0(uVar));
        } else {
            aVar12.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar13 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setBuiltInZoomControls", m54666o());
        if (uVar != null) {
            aVar13.mo22129e(new C10995n0(uVar));
        } else {
            aVar13.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar14 = new C6531a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setAllowFileAccess", m54666o());
        if (uVar != null) {
            aVar14.mo22129e(new C10912f0(uVar));
        } else {
            aVar14.mo22129e((C6531a.C6536d) null);
        }
    }

    /* renamed from: o */
    public static C6554i<Object> m54666o() {
        return C10940k.C10973v.f42541d;
    }

    /* renamed from: p */
    public static /* synthetic */ void m54667p(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    uVar.mo34739b(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("webViewInstanceIdArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: q */
    public static /* synthetic */ void m54668q(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                uVar.mo34738a(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m54669r(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    uVar.mo34745h(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("useArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: s */
    public static /* synthetic */ void m54670s(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    uVar.mo34741d(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: t */
    public static /* synthetic */ void m54671t(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    uVar.mo34751n(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m54672u(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    uVar.mo34743f(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: v */
    public static /* synthetic */ void m54673v(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    uVar.mo34740c(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("flagArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: w */
    public static /* synthetic */ void m54674w(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    uVar.mo34750m(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("flagArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: x */
    public static /* synthetic */ void m54675x(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    uVar.mo34742e(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("supportArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: y */
    public static /* synthetic */ void m54676y(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    uVar.mo34746i(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("flagArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: z */
    public static /* synthetic */ void m54677z(C10940k.C10972u uVar, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                uVar.mo34749l(Long.valueOf(number.longValue()), (String) arrayList.get(1));
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }
}
