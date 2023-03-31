package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.ra */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2803ra extends C2282da {
    public C2803ra(C2766qa qaVar, SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: a */
    static List m19630a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String g9Var : (List) entry.getValue()) {
                    arrayList.add(new C2393g9((String) entry.getKey(), g9Var));
                }
            }
        }
        return arrayList;
    }
}
