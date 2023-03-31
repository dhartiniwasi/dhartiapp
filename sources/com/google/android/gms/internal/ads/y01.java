package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class y01 implements h01 {

    /* renamed from: a */
    private final CookieManager f20409a;

    public y01(Context context) {
        this.f20409a = C4409t.m29327s().mo18420b(context);
    }

    /* renamed from: a */
    public final void mo8169a(Map map) {
        if (this.f20409a != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) C4596v.m30088c().mo12227b(C2679nz.f14313H0);
                String cookie = this.f20409a.getCookie(str);
                if (cookie != null) {
                    List f = p83.m18400c(n73.m16968c(';')).mo13168f(cookie);
                    int i = 0;
                    while (i < f.size()) {
                        CookieManager cookieManager = this.f20409a;
                        Iterator it = p83.m18400c(n73.m16968c('=')).mo13167d((String) f.get(i)).iterator();
                        Objects.requireNonNull(it);
                        if (it.hasNext()) {
                            cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) C4596v.m30088c().mo12227b(C2679nz.f14698u0))));
                            i++;
                        } else {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (" + 0 + ")");
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = (String) map.get("cookie");
            if (!TextUtils.isEmpty(str2)) {
                this.f20409a.setCookie((String) C4596v.m30088c().mo12227b(C2679nz.f14313H0), str2);
            }
        }
    }
}
