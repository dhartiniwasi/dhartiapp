package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ca0 implements s80, ba0 {

    /* renamed from: a */
    private final ba0 f7667a;

    /* renamed from: b */
    private final HashSet f7668b = new HashSet();

    public ca0(ba0 ba0) {
        this.f7667a = ba0;
    }

    /* renamed from: R */
    public final /* synthetic */ void mo9081R(String str, Map map) {
        r80.m19605a(this, str, map);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo9084a(String str, JSONObject jSONObject) {
        r80.m19606b(this, str, jSONObject);
    }

    /* renamed from: d */
    public final void mo8703d(String str, e60 e60) {
        this.f7667a.mo8703d(str, e60);
        this.f7668b.remove(new AbstractMap.SimpleEntry(str, e60));
    }

    /* renamed from: e */
    public final void mo9101e() {
        Iterator it = this.f7668b.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            C4794n1.m30693k("Unregistering eventhandler: ".concat(String.valueOf(((e60) simpleEntry.getValue()).toString())));
            this.f7667a.mo8703d((String) simpleEntry.getKey(), (e60) simpleEntry.getValue());
        }
        this.f7668b.clear();
    }

    /* renamed from: f */
    public final void mo9087f(String str) {
        this.f7667a.mo9087f(str);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo9089k(String str, String str2) {
        r80.m19607c(this, str, str2);
    }

    /* renamed from: t0 */
    public final /* synthetic */ void mo9090t0(String str, JSONObject jSONObject) {
        r80.m19608d(this, str, jSONObject);
    }

    /* renamed from: x */
    public final void mo8704x(String str, e60 e60) {
        this.f7667a.mo8704x(str, e60);
        this.f7668b.add(new AbstractMap.SimpleEntry(str, e60));
    }
}
