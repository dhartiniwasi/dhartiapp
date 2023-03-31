package p264io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6554i;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.f2 */
/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class C10914f2 {

    /* renamed from: io.flutter.plugins.webviewflutter.f2$a */
    /* compiled from: GeneratedAndroidWebView */
    class C10915a implements C10940k.C10962n<String> {

        /* renamed from: a */
        final /* synthetic */ Map f42472a;

        /* renamed from: b */
        final /* synthetic */ C6531a.C6537e f42473b;

        C10915a(Map map, C6531a.C6537e eVar) {
            this.f42472a = map;
            this.f42473b = eVar;
        }

        /* renamed from: a */
        public void success(String str) {
            this.f42472a.put("result", str);
            this.f42473b.mo22131a(this.f42472a);
        }
    }

    /* renamed from: B */
    public static C6554i<Object> m54332B() {
        return C10940k.C10949d0.f42511d;
    }

    /* renamed from: C */
    public static /* synthetic */ void m54333C(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    c0Var.mo34678b(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("useHybridCompositionArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m54334D(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                c0Var.mo34677a(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: E */
    public static /* synthetic */ void m54335E(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                c0Var.mo34684h(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: F */
    public static /* synthetic */ void m54336F(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                c0Var.mo34693q(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: G */
    public static /* synthetic */ void m54337G(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    c0Var.mo34686j(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("includeDiskFilesArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: H */
    public static /* synthetic */ void m54338H(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    c0Var.mo34687k(Long.valueOf(number.longValue()), str, new C10915a(hashMap, eVar));
                    return;
                }
                throw new NullPointerException("javascriptStringArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
            eVar.mo22131a(hashMap);
        }
    }

    /* renamed from: I */
    public static /* synthetic */ void m54339I(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", c0Var.mo34692p(Long.valueOf(number.longValue())));
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: J */
    public static /* synthetic */ void m54340J(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    Number number3 = (Number) arrayList.get(2);
                    if (number3 != null) {
                        c0Var.mo34688l(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()), Long.valueOf(number3.longValue()));
                        hashMap.put("result", (Object) null);
                        eVar.mo22131a(hashMap);
                        return;
                    }
                    throw new NullPointerException("yArg unexpectedly null.");
                }
                throw new NullPointerException("xArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: K */
    public static /* synthetic */ void m54341K(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    Number number3 = (Number) arrayList.get(2);
                    if (number3 != null) {
                        c0Var.mo34702z(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()), Long.valueOf(number3.longValue()));
                        hashMap.put("result", (Object) null);
                        eVar.mo22131a(hashMap);
                        return;
                    }
                    throw new NullPointerException("yArg unexpectedly null.");
                }
                throw new NullPointerException("xArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: L */
    public static /* synthetic */ void m54342L(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", c0Var.mo34679c(Long.valueOf(number.longValue())));
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: M */
    public static /* synthetic */ void m54343M(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", c0Var.mo34690n(Long.valueOf(number.longValue())));
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: N */
    public static /* synthetic */ void m54344N(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", c0Var.mo34691o(Long.valueOf(number.longValue())));
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: O */
    public static /* synthetic */ void m54345O(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    c0Var.mo34680d(Long.valueOf(number.longValue()), str, (String) arrayList.get(2), (String) arrayList.get(3));
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("dataArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: P */
    public static /* synthetic */ void m54346P(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Boolean bool = (Boolean) ((ArrayList) obj).get(0);
            if (bool != null) {
                c0Var.mo34682f(bool);
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("enabledArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ void m54347Q(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    c0Var.mo34676A(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("webViewClientInstanceIdArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: R */
    public static /* synthetic */ void m54348R(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    c0Var.mo34681e(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("javaScriptChannelInstanceIdArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: S */
    public static /* synthetic */ void m54349S(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    c0Var.mo34689m(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("javaScriptChannelInstanceIdArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: T */
    public static /* synthetic */ void m54350T(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        Long l;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                Long valueOf = Long.valueOf(number.longValue());
                if (number2 == null) {
                    l = null;
                } else {
                    l = Long.valueOf(number2.longValue());
                }
                c0Var.mo34698v(valueOf, l);
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: U */
    public static /* synthetic */ void m54351U(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        Long l;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                Long valueOf = Long.valueOf(number.longValue());
                if (number2 == null) {
                    l = null;
                } else {
                    l = Long.valueOf(number2.longValue());
                }
                c0Var.mo34683g(valueOf, l);
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: V */
    public static /* synthetic */ void m54352V(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    c0Var.mo34697u(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("colorArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: W */
    public static /* synthetic */ void m54353W(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                String str2 = (String) arrayList.get(2);
                if (str2 != null) {
                    C10940k.C10946c0 c0Var2 = c0Var;
                    c0Var2.mo34695s(Long.valueOf(number.longValue()), str, str2, (String) arrayList.get(3), (String) arrayList.get(4), (String) arrayList.get(5));
                    hashMap.put("result", (Object) null);
                    eVar.mo22131a(hashMap);
                    return;
                }
                throw new NullPointerException("dataArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: X */
    public static /* synthetic */ void m54354X(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    Map map = (Map) arrayList.get(2);
                    if (map != null) {
                        c0Var.mo34685i(Long.valueOf(number.longValue()), str, map);
                        hashMap.put("result", (Object) null);
                        eVar.mo22131a(hashMap);
                        return;
                    }
                    throw new NullPointerException("headersArg unexpectedly null.");
                }
                throw new NullPointerException("urlArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: Y */
    public static /* synthetic */ void m54355Y(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    byte[] bArr = (byte[]) arrayList.get(2);
                    if (bArr != null) {
                        c0Var.mo34701y(Long.valueOf(number.longValue()), str, bArr);
                        hashMap.put("result", (Object) null);
                        eVar.mo22131a(hashMap);
                        return;
                    }
                    throw new NullPointerException("dataArg unexpectedly null.");
                }
                throw new NullPointerException("urlArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: Z */
    public static /* synthetic */ void m54356Z(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", c0Var.mo34700x(Long.valueOf(number.longValue())));
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m54358a0(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", c0Var.mo34699w(Long.valueOf(number.longValue())));
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m54360b0(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", c0Var.mo34694r(Long.valueOf(number.longValue())));
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m54362c0(C10940k.C10946c0 c0Var, Object obj, C6531a.C6537e eVar) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                c0Var.mo34696t(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                eVar.mo22131a(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C10940k.m54426b(e));
        }
    }

    /* renamed from: d0 */
    public static void m54364d0(C6539c cVar, C10940k.C10946c0 c0Var) {
        C6531a aVar = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.create", m54332B());
        if (c0Var != null) {
            aVar.mo22129e(new C11045w1(c0Var));
        } else {
            aVar.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar2 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.dispose", m54332B());
        if (c0Var != null) {
            aVar2.mo22129e(new C10913f1(c0Var));
        } else {
            aVar2.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar3 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.loadData", m54332B());
        if (c0Var != null) {
            aVar3.mo22129e(new C10902d2(c0Var));
        } else {
            aVar3.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar4 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.loadDataWithBaseUrl", m54332B());
        if (c0Var != null) {
            aVar4.mo22129e(new C10909e2(c0Var));
        } else {
            aVar4.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar5 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.loadUrl", m54332B());
        if (c0Var != null) {
            aVar5.mo22129e(new C11025s1(c0Var));
        } else {
            aVar5.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar6 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.postUrl", m54332B());
        if (c0Var != null) {
            aVar6.mo22129e(new C11040v1(c0Var));
        } else {
            aVar6.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar7 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.getUrl", m54332B());
        if (c0Var != null) {
            aVar7.mo22129e(new C10990m1(c0Var));
        } else {
            aVar7.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar8 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.canGoBack", m54332B());
        if (c0Var != null) {
            aVar8.mo22129e(new C11007p1(c0Var));
        } else {
            aVar8.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar9 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.canGoForward", m54332B());
        if (c0Var != null) {
            aVar9.mo22129e(new C10985l1(c0Var));
        } else {
            aVar9.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar10 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.goBack", m54332B());
        if (c0Var != null) {
            aVar10.mo22129e(new C11054y1(c0Var));
        } else {
            aVar10.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar11 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.goForward", m54332B());
        if (c0Var != null) {
            aVar11.mo22129e(new C11001o1(c0Var));
        } else {
            aVar11.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar12 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.reload", m54332B());
        if (c0Var != null) {
            aVar12.mo22129e(new C10931i1(c0Var));
        } else {
            aVar12.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar13 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.clearCache", m54332B());
        if (c0Var != null) {
            aVar13.mo22129e(new C10919g1(c0Var));
        } else {
            aVar13.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar14 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.evaluateJavascript", m54332B());
        if (c0Var != null) {
            aVar14.mo22129e(new C10980k1(c0Var));
        } else {
            aVar14.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar15 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.getTitle", m54332B());
        if (c0Var != null) {
            aVar15.mo22129e(new C11050x1(c0Var));
        } else {
            aVar15.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar16 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.scrollTo", m54332B());
        if (c0Var != null) {
            aVar16.mo22129e(new C10908e1(c0Var));
        } else {
            aVar16.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar17 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.scrollBy", m54332B());
        if (c0Var != null) {
            aVar17.mo22129e(new C10886a2(c0Var));
        } else {
            aVar17.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar18 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.getScrollX", m54332B());
        if (c0Var != null) {
            aVar18.mo22129e(new C11032t1(c0Var));
        } else {
            aVar18.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar19 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.getScrollY", m54332B());
        if (c0Var != null) {
            aVar19.mo22129e(new C10897c2(c0Var));
        } else {
            aVar19.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar20 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.getScrollPosition", m54332B());
        if (c0Var != null) {
            aVar20.mo22129e(new C11036u1(c0Var));
        } else {
            aVar20.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar21 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.setWebContentsDebuggingEnabled", m54332B());
        if (c0Var != null) {
            aVar21.mo22129e(new C10891b2(c0Var));
        } else {
            aVar21.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar22 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.setWebViewClient", m54332B());
        if (c0Var != null) {
            aVar22.mo22129e(new C10996n1(c0Var));
        } else {
            aVar22.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar23 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.addJavaScriptChannel", m54332B());
        if (c0Var != null) {
            aVar23.mo22129e(new C10926h1(c0Var));
        } else {
            aVar23.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar24 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.removeJavaScriptChannel", m54332B());
        if (c0Var != null) {
            aVar24.mo22129e(new C11012q1(c0Var));
        } else {
            aVar24.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar25 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.setDownloadListener", m54332B());
        if (c0Var != null) {
            aVar25.mo22129e(new C11062z1(c0Var));
        } else {
            aVar25.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar26 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.setWebChromeClient", m54332B());
        if (c0Var != null) {
            aVar26.mo22129e(new C11021r1(c0Var));
        } else {
            aVar26.mo22129e((C6531a.C6536d) null);
        }
        C6531a aVar27 = new C6531a(cVar, "dev.flutter.pigeon.WebViewHostApi.setBackgroundColor", m54332B());
        if (c0Var != null) {
            aVar27.mo22129e(new C10937j1(c0Var));
        } else {
            aVar27.mo22129e((C6531a.C6536d) null);
        }
    }
}
