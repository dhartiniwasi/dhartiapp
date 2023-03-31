package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class w03 implements u03 {

    /* renamed from: a */
    private final u03 f19410a;

    public w03(u03 u03) {
        this.f19410a = u03;
    }

    /* renamed from: a */
    public final JSONObject mo14435a(View view) {
        throw null;
    }

    /* renamed from: b */
    public final void mo14436b(View view, JSONObject jSONObject, t03 t03, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m03 a = m03.m16344a();
        if (a != null) {
            Collection<a03> b = a.mo12244b();
            int size = b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (a03 f : b) {
                View f2 = f.mo8161f();
                if (f2 != null && f2.isAttachedToWindow() && f2.isShown()) {
                    View view2 = f2;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        } else {
                            View rootView = f2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float a2 = f13.m12398a(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (f13.m12398a((View) arrayList.get(i)) <= a2) {
                                        break;
                                    }
                                    size2 = i;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            t03.mo13101a((View) arrayList.get(i2), this.f19410a, jSONObject, z2);
        }
    }
}
