package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p060h4.C4596v;

/* renamed from: com.google.android.gms.internal.ads.fz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C2382fz {

    /* renamed from: a */
    private final Collection f9589a = new ArrayList();

    /* renamed from: b */
    private final Collection f9590b = new ArrayList();

    /* renamed from: c */
    private final Collection f9591c = new ArrayList();

    /* renamed from: a */
    public final List mo10352a() {
        ArrayList arrayList = new ArrayList();
        for (C2344ez b : this.f9590b) {
            String str = (String) C4596v.m30088c().mo12227b(b);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(C2716oz.m18253a());
        return arrayList;
    }

    /* renamed from: b */
    public final List mo10353b() {
        List a = mo10352a();
        for (C2344ez b : this.f9591c) {
            String str = (String) C4596v.m30088c().mo12227b(b);
            if (!TextUtils.isEmpty(str)) {
                a.add(str);
            }
        }
        a.addAll(C2716oz.m18254b());
        return a;
    }

    /* renamed from: c */
    public final void mo10354c(C2344ez ezVar) {
        this.f9590b.add(ezVar);
    }

    /* renamed from: d */
    public final void mo10355d(C2344ez ezVar) {
        this.f9589a.add(ezVar);
    }

    /* renamed from: e */
    public final void mo10356e(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (C2344ez ezVar : this.f9589a) {
            if (ezVar.mo10049e() == 1) {
                ezVar.mo8628d(editor, ezVar.mo8625a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            pm0.m18664d("Flag Json is null.");
        }
    }
}
