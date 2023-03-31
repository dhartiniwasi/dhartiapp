package com.startapp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.startapp.a6 */
/* compiled from: Sta */
public class C8823a6 {

    /* renamed from: b */
    public static C8823a6 f36412b = new C8823a6();

    /* renamed from: a */
    public Map<String, C9677z5> f36413a = new ConcurrentHashMap();

    /* renamed from: a */
    public C9677z5 mo29085a(String str) {
        if (this.f36413a.containsKey(str)) {
            return this.f36413a.get(str);
        }
        C9677z5 z5Var = new C9677z5();
        this.f36413a.put(str, z5Var);
        return z5Var;
    }
}
