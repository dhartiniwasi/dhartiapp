package com.startapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import java.util.Map;

/* renamed from: com.startapp.w8 */
/* compiled from: Sta */
public class C9621w8 extends C8861b9 {

    /* renamed from: a */
    public final String f39330a;

    /* renamed from: b */
    public final Map<String, String> f39331b;

    public C9621w8(String str, Map<String, String> map) {
        this.f39330a = str;
        this.f39331b = map;
    }

    /* renamed from: a */
    public boolean mo29235a(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (pair.first != this) {
            return false;
        }
        Object obj2 = pair.second;
        if (!(obj2 instanceof Intent)) {
            return false;
        }
        Intent intent = (Intent) obj2;
        if (!this.f39330a.equals(intent.getAction())) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        for (Map.Entry next : this.f39331b.entrySet()) {
            if (!((String) next.getValue()).equals(String.valueOf(extras.get((String) next.getKey())))) {
                return false;
            }
        }
        return true;
    }
}
