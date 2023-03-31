package com.startapp;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.oa */
/* compiled from: Sta */
public class C9198oa {

    /* renamed from: b */
    public static final C9198oa f38008b = new C9198oa(new JSONObject());

    /* renamed from: a */
    public final JSONObject f38009a;

    public C9198oa() {
        this(new JSONObject());
    }

    /* renamed from: a */
    public final void mo29796a(int i, Object obj) {
        try {
            this.f38009a.put(String.valueOf(i), obj);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public final String mo29797b(int i) {
        Object opt = this.f38009a.opt(String.valueOf(i));
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public C9198oa(JSONObject jSONObject) {
        this.f38009a = jSONObject;
    }

    /* renamed from: a */
    public final int mo29795a(int i) {
        Object opt = this.f38009a.opt(String.valueOf(i));
        if (opt instanceof Number) {
            return ((Number) opt).intValue();
        }
        return 0;
    }
}
