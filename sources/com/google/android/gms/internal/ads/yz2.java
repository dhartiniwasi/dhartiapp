package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yz2 {

    /* renamed from: a */
    private final g03 f20857a;

    /* renamed from: b */
    private final WebView f20858b;

    /* renamed from: c */
    private final List f20859c = new ArrayList();

    /* renamed from: d */
    private final Map f20860d = new HashMap();

    /* renamed from: e */
    private final String f20861e;

    /* renamed from: f */
    private final String f20862f;

    /* renamed from: g */
    private final zz2 f20863g;

    private yz2(g03 g03, WebView webView, String str, List list, String str2, String str3, zz2 zz2) {
        this.f20857a = g03;
        this.f20858b = webView;
        this.f20863g = zz2;
        this.f20862f = str2;
        this.f20861e = "";
    }

    /* renamed from: b */
    public static yz2 m24249b(g03 g03, WebView webView, String str, String str2) {
        return new yz2(g03, webView, (String) null, (List) null, str, "", zz2.HTML);
    }

    /* renamed from: c */
    public static yz2 m24250c(g03 g03, WebView webView, String str, String str2) {
        return new yz2(g03, webView, (String) null, (List) null, str, "", zz2.JAVASCRIPT);
    }

    /* renamed from: a */
    public final WebView mo15524a() {
        return this.f20858b;
    }

    /* renamed from: d */
    public final zz2 mo15525d() {
        return this.f20863g;
    }

    /* renamed from: e */
    public final g03 mo15526e() {
        return this.f20857a;
    }

    /* renamed from: f */
    public final String mo15527f() {
        return this.f20862f;
    }

    /* renamed from: g */
    public final String mo15528g() {
        return this.f20861e;
    }

    /* renamed from: h */
    public final List mo15529h() {
        return Collections.unmodifiableList(this.f20859c);
    }

    /* renamed from: i */
    public final Map mo15530i() {
        return Collections.unmodifiableMap(this.f20860d);
    }
}
