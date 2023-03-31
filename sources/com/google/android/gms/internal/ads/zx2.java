package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p067i5.C4691e;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zx2 {

    /* renamed from: a */
    private final C4691e f21710a;

    /* renamed from: b */
    private final Map f21711b = new HashMap();

    /* renamed from: c */
    private final Map f21712c = new HashMap();

    public zx2(C4691e eVar) {
        this.f21710a = eVar;
    }

    /* renamed from: d */
    private final void m24944d(String str, String str2) {
        if (!this.f21711b.containsKey(str)) {
            this.f21711b.put(str, new ArrayList());
        }
        ((List) this.f21711b.get(str)).add(str2);
    }

    /* renamed from: a */
    public final List mo15674a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f21711b.entrySet()) {
            int i = 0;
            if (((List) entry.getValue()).size() > 1) {
                for (String yx2 : (List) entry.getValue()) {
                    i++;
                    arrayList.add(new yx2(((String) entry.getKey()) + "." + i, yx2));
                }
            } else {
                arrayList.add(new yx2((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo15675b(String str) {
        if (this.f21712c.containsKey(str)) {
            long b = this.f21710a.mo18371b();
            long longValue = ((Long) this.f21712c.remove(str)).longValue();
            StringBuilder sb = new StringBuilder();
            sb.append(b - longValue);
            m24944d(str, sb.toString());
            return;
        }
        this.f21712c.put(str, Long.valueOf(this.f21710a.mo18371b()));
    }

    /* renamed from: c */
    public final void mo15676c(String str, String str2) {
        if (this.f21712c.containsKey(str)) {
            long b = this.f21710a.mo18371b();
            long longValue = ((Long) this.f21712c.remove(str)).longValue();
            m24944d(str, str2 + (b - longValue));
            return;
        }
        this.f21712c.put(str, Long.valueOf(this.f21710a.mo18371b()));
    }
}
