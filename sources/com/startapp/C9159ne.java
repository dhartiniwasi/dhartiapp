package com.startapp;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.C9588ud;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.startapp.ne */
/* compiled from: Sta */
public class C9159ne implements C9588ud {

    /* renamed from: a */
    public final int[] f37370a = new int[2];

    /* renamed from: a */
    public JSONObject mo29495a(View view) {
        if (view == null) {
            return C8919de.m48527a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f37370a);
        int[] iArr = this.f37370a;
        return C8919de.m48527a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo29496a(View view, JSONObject jSONObject, C9588ud.C9589a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (!z || Build.VERSION.SDK_INT < 21) {
                while (i < viewGroup.getChildCount()) {
                    ((C9008hb) aVar).mo29460a(viewGroup.getChildAt(i), this, jSONObject, z2);
                    i++;
                }
                return;
            }
            HashMap hashMap = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((C9008hb) aVar).mo29460a((View) it2.next(), this, jSONObject, z2);
                }
            }
        }
    }
}
