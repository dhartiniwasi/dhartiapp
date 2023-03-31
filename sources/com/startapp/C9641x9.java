package com.startapp;

import android.app.Activity;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.startapp.x9 */
/* compiled from: Sta */
public class C9641x9 {

    /* renamed from: a */
    public final Map<C9642a, String> f39385a = new ConcurrentHashMap();

    /* renamed from: com.startapp.x9$a */
    /* compiled from: Sta */
    public static class C9642a {

        /* renamed from: a */
        public final AdPreferences.Placement f39386a;

        /* renamed from: b */
        public final int f39387b;

        public C9642a(AdPreferences.Placement placement, int i) {
            this.f39386a = placement;
            this.f39387b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C9642a.class != obj.getClass()) {
                return false;
            }
            C9642a aVar = (C9642a) obj;
            if (this.f39387b == aVar.f39387b && this.f39386a == aVar.f39386a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object[] objArr = {this.f39386a, Integer.valueOf(this.f39387b)};
            Map<Activity, Integer> map = C9605vb.f39316a;
            return Arrays.deepHashCode(objArr);
        }
    }
}
