package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.va */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class C2951va extends C2727p9 {

    /* renamed from: u */
    private final Object f18989u = new Object();

    /* renamed from: v */
    private final C2913u9 f18990v;

    public C2951va(int i, String str, C2913u9 u9Var, C2876t9 t9Var) {
        super(i, str, t9Var);
        this.f18990v = u9Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo14700G(String str) {
        C2913u9 u9Var;
        synchronized (this.f18989u) {
            u9Var = this.f18990v;
        }
        u9Var.mo14465b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C2950v9 mo13182o(C2542k9 k9Var) {
        String str;
        try {
            byte[] bArr = k9Var.f11966b;
            Map map = k9Var.f11967c;
            String str2 = "ISO-8859-1";
            if (map != null) {
                String str3 = (String) map.get("Content-Type");
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i = 1;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        }
                        String[] split2 = split[i].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str2 = split2[1];
                            break;
                        }
                        i++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(k9Var.f11966b);
        }
        return C2950v9.m22044b(str, C2654na.m16988b(k9Var));
    }
}
