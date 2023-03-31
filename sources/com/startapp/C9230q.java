package com.startapp;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p184aa.C6521a;

/* renamed from: com.startapp.q */
/* compiled from: Sta */
public final class C9230q {

    /* renamed from: a */
    public final C9679z7 f38093a;

    /* renamed from: b */
    public final WebView f38094b;

    /* renamed from: c */
    public final List<C8987gc> f38095c;

    /* renamed from: d */
    public final Map<String, C8987gc> f38096d = new HashMap();

    /* renamed from: e */
    public final String f38097e;

    /* renamed from: f */
    public final String f38098f;

    /* renamed from: g */
    public final String f38099g;

    /* renamed from: h */
    public final C6521a f38100h;

    public C9230q(C9679z7 z7Var, WebView webView, String str, List<C8987gc> list, String str2, String str3, C6521a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f38095c = arrayList;
        this.f38093a = z7Var;
        this.f38094b = webView;
        this.f38097e = str;
        this.f38100h = aVar;
        if (list != null) {
            arrayList.addAll(list);
            for (C8987gc put : list) {
                String uuid = UUID.randomUUID().toString();
                this.f38096d.put(uuid, put);
            }
        }
        this.f38099g = str2;
        this.f38098f = str3;
    }

    /* renamed from: a */
    public C6521a mo29842a() {
        return this.f38100h;
    }

    /* renamed from: b */
    public Map<String, C8987gc> mo29843b() {
        return Collections.unmodifiableMap(this.f38096d);
    }

    /* renamed from: c */
    public String mo29844c() {
        return this.f38097e;
    }

    /* renamed from: d */
    public WebView mo29845d() {
        return this.f38094b;
    }
}
