package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.startapp.g0 */
/* compiled from: Sta */
public class C8959g0 {
    /* renamed from: a */
    public static List<AdDetails> m48602a(Context context, List<AdDetails> list, int i, Set<String> set, boolean z) {
        Context context2 = context;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z2 = false;
        for (AdDetails next : list) {
            ArrayList arrayList5 = (ArrayList) C9605vb.m50454a((List<String>) Arrays.asList(next.mo30851w()));
            AppPresenceDetails appPresenceDetails = new AppPresenceDetails(arrayList5.isEmpty() ? null : (String) arrayList5.get(0), next.mo30829c(), i2, next.mo30842o());
            boolean z3 = next.mo30829c() != null && next.mo30829c().startsWith("!");
            boolean a = C8837b0.m48305a(context, z3 ? next.mo30829c().substring(1) : next.mo30829c(), next.mo30842o());
            boolean z4 = AdsCommonMetaData.f38625h.mo30446H() && ((a && !z3) || (!a && z3));
            arrayList3.add(appPresenceDetails);
            if (z4) {
                appPresenceDetails.mo30650a(a);
                appPresenceDetails.mo30652b(false);
                if (!z3) {
                    arrayList2.add(next);
                    arrayList4.add(appPresenceDetails);
                }
                set.add(next.mo30843p());
                z2 = true;
            } else {
                Set<String> set2 = set;
                arrayList.add(next);
            }
        }
        if (arrayList.size() < 5 && (list.size() != 1 || i2 > 0)) {
            int min = Math.min(5 - arrayList.size(), arrayList2.size());
            arrayList.addAll(arrayList2.subList(0, min));
            for (AppPresenceDetails b : arrayList4.subList(0, min)) {
                b.mo30652b(true);
            }
        }
        if (z2) {
            SimpleTokenUtils.m49715f(context);
            if (z) {
                new C8939f0(context, arrayList3).mo29345a();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<AppPresenceDetails> m48603a(String str, int i) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[0];
        String a = C9605vb.m50452a(str, "@tracking@", "@tracking@");
        if (a != null) {
            strArr = a.split(",");
        }
        String[] strArr2 = new String[0];
        String a2 = C9605vb.m50452a(str, "@appPresencePackage@", "@appPresencePackage@");
        if (a2 != null) {
            strArr2 = a2.split(",");
        }
        String[] strArr3 = new String[0];
        String a3 = C9605vb.m50452a(str, "@minAppVersion@", "@minAppVersion@");
        if (a3 != null) {
            strArr3 = a3.split(",");
        }
        int i2 = 0;
        while (i2 < strArr2.length) {
            arrayList.add(new AppPresenceDetails(strArr.length > i2 ? strArr[i2] : null, strArr2[i2], i, strArr3.length > i2 ? Integer.valueOf(strArr3[i2]).intValue() : 0));
            i2++;
        }
        while (i2 < strArr.length) {
            arrayList.add(new AppPresenceDetails(strArr[i2], "", i, strArr3.length > i2 ? Integer.valueOf(strArr3[i2]).intValue() : 0));
            i2++;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Boolean m48601a(Context context, List<AppPresenceDetails> list, int i, Set<String> set, List<AppPresenceDetails> list2) {
        boolean z = false;
        for (AppPresenceDetails next : list) {
            boolean startsWith = next.mo30651b().startsWith("!");
            boolean a = C8837b0.m48305a(context, startsWith ? next.mo30651b().substring(1) : next.mo30651b(), next.mo30648a());
            if ((!startsWith && a) || (startsWith && !a)) {
                next.mo30650a(a);
                z = i == 0;
                if (z && !startsWith) {
                    set.add(next.mo30651b());
                } else if (!z && next.mo30653c() != null) {
                    next.mo30649a(next.mo30653c() + "&isShown=" + next.mo30655e() + "&appPresence=" + next.mo30654d());
                }
            }
            list2.add(next);
        }
        if (z) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                list2.get(i2).mo30652b(false);
            }
        }
        return Boolean.valueOf(z);
    }
}
