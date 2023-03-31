package com.startapp;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.startapp.f */
/* compiled from: Sta */
public class C8938f {

    /* renamed from: d */
    public static C8938f f36742d = new C8938f();

    /* renamed from: a */
    public List<C8920e> f36743a = new ArrayList();

    /* renamed from: b */
    public Map<AdPreferences.Placement, List<C8920e>> f36744b = new HashMap();

    /* renamed from: c */
    public Map<String, List<C8920e>> f36745c = new HashMap();

    /* renamed from: a */
    public static C8938f m48556a() {
        return f36742d;
    }

    /* renamed from: b */
    public int mo29343b() {
        return this.f36743a.size();
    }

    /* renamed from: a */
    public synchronized void mo29342a(C8920e eVar) {
        this.f36743a.add(0, eVar);
        List list = this.f36744b.get(eVar.f36710b);
        if (list == null) {
            list = new ArrayList();
            this.f36744b.put(eVar.f36710b, list);
        }
        list.add(0, eVar);
        List list2 = this.f36745c.get(eVar.f36711c);
        if (list2 == null) {
            list2 = new ArrayList();
            this.f36745c.put(eVar.f36711c, list2);
        }
        list2.add(0, eVar);
    }
}
