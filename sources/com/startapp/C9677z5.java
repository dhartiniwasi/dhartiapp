package com.startapp;

import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.startapp.z5 */
/* compiled from: Sta */
public class C9677z5 {

    /* renamed from: a */
    public C8968g4 f39552a = new C8968g4();

    /* renamed from: b */
    public List<C9637x5> f39553b;

    /* renamed from: c */
    public String f39554c = "";

    /* renamed from: a */
    public void mo31514a(AdDetails adDetails) {
        C9637x5 x5Var = new C9637x5(adDetails);
        this.f39553b.add(x5Var);
        this.f39552a.mo29385a(this.f39553b.size() - 1, x5Var.f39368a, x5Var.f39376i);
    }

    /* renamed from: a */
    public void mo31512a() {
        for (C9087k9 next : this.f39552a.f36812a.values()) {
            if (next != null) {
                next.mo29608a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
            }
        }
    }

    /* renamed from: a */
    public void mo31513a(C9279s7 s7Var, boolean z) {
        C8968g4 g4Var = this.f39552a;
        g4Var.f36815d = s7Var;
        if (z) {
            g4Var.f36814c.clear();
            g4Var.f36816e = 0;
            g4Var.f36817f.clear();
            HashMap<String, C9087k9> hashMap = g4Var.f36812a;
            if (hashMap != null) {
                for (C9087k9 next : hashMap.values()) {
                    if (next != null) {
                        next.mo29608a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
                    }
                }
                g4Var.f36812a.clear();
            }
        }
    }
}
