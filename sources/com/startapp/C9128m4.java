package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.m4 */
/* compiled from: Sta */
public class C9128m4 {

    /* renamed from: a */
    public final List<String> f37287a;

    /* renamed from: b */
    public final List<String> f37288b;

    /* renamed from: c */
    public final List<String> f37289c;

    /* renamed from: d */
    public final List<String> f37290d;

    /* renamed from: e */
    public final List<String> f37291e;

    /* renamed from: f */
    public final long f37292f;

    /* renamed from: com.startapp.m4$a */
    /* compiled from: Sta */
    public static class C9129a {

        /* renamed from: a */
        public List<String> f37293a;

        /* renamed from: b */
        public List<String> f37294b;

        /* renamed from: c */
        public List<String> f37295c;

        /* renamed from: d */
        public String f37296d;

        /* renamed from: a */
        public List<String> mo29683a() {
            return this.f37294b;
        }

        /* renamed from: b */
        public List<String> mo29684b() {
            return this.f37295c;
        }

        /* renamed from: c */
        public List<String> mo29685c() {
            return this.f37293a;
        }

        /* renamed from: d */
        public String mo29686d() {
            return this.f37296d;
        }

        /* renamed from: a */
        public C9129a mo29681a(String... strArr) {
            List list = this.f37295c;
            if (list == null) {
                list = new ArrayList();
                this.f37295c = list;
            }
            return mo29682a(strArr, list);
        }

        /* renamed from: a */
        public final C9129a mo29682a(String[] strArr, List<String> list) {
            for (String str : strArr) {
                if (str != null) {
                    list.add(str);
                }
            }
            return this;
        }
    }

    public C9128m4(C9129a aVar) {
        this.f37287a = C9605vb.m50471b(aVar.mo29685c());
        this.f37288b = C9605vb.m50471b(aVar.mo29683a());
        this.f37289c = C9605vb.m50471b((List) null);
        this.f37290d = C9605vb.m50471b((List) null);
        this.f37291e = C9605vb.m50471b(aVar.mo29684b());
        this.f37292f = Math.max(0, C9605vb.m50478e(aVar.mo29686d()));
    }

    /* renamed from: a */
    public static List<C9128m4> m48956a(List<AnalyticsCategoryFilterConfig> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        for (AnalyticsCategoryFilterConfig next : list) {
            if (next != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList(list.size());
                }
                arrayList.add(new C9128m4(next));
            }
        }
        return arrayList != null ? C9605vb.m50471b(arrayList) : arrayList;
    }

    public C9128m4(AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig) {
        this.f37287a = C9605vb.m50471b(analyticsCategoryFilterConfig.mo30935e());
        this.f37288b = C9605vb.m50471b(analyticsCategoryFilterConfig.mo30932b());
        this.f37289c = C9605vb.m50471b(analyticsCategoryFilterConfig.mo30934d());
        this.f37290d = C9605vb.m50471b(analyticsCategoryFilterConfig.mo30931a());
        this.f37291e = C9605vb.m50471b(analyticsCategoryFilterConfig.mo30933c());
        this.f37292f = Math.max(0, C9605vb.m50478e(analyticsCategoryFilterConfig.mo30937f()));
    }
}
